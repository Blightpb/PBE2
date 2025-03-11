document.addEventListener("DOMContentLoaded", () => {
	const form = document.getElementById("cadastroEnderecoForm"); 

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const cep = document.getElementById("cep").value;
		const rua = document.getElementById("rua").value;
		const numCasa = document.getElementById("numero").value;
		const cidade = document.getElementById("cidade").value;
		const estado = document.getElementById("estado").value;
		const comp = document.getElementById("comp").value;
		const bairro = document.getElementById("bairro").value;

		try {
			const response = await fetch("http://localhost:8080/enderecoCliente", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body:JSON.stringify({
					cep,
					rua,
					numCasa,
					cidade,
					estado,
					comp,
					bairro
				}),
			});
			if (response.ok) {
				window.location.href = "enviado2.html";
			} else {
				alert("Falha ao cadastrar endereço");
			}
		} catch (error) {
			console.error("Erro ao cadastrar endereço: ", error);
		}
	});
});
