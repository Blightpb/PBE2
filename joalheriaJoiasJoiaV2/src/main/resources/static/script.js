function formatInput(event) {
    const input = event.target;
    const value = input.value.replace(/-/g, ''); 
    if (value.length > 5) {
        input.value = value.slice(0, 5) + '-' + value.slice(5);
    } else {
        input.value = value;
    }
}