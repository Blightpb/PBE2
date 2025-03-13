let images = document.getElementsByClassName("pseudo-image");
let imageHolder = document.getElementById("image-wrapper")

let indexVariableName = 0;
let width = 100;
let intervalName;
let setIntervalRunning = true

function startSlideShow(){
  intervalName = setInterval(moveImages, 2500)
}
function moveImages(){
  if(indexVariableName >= 2){
    indexVariableName = -1
  }
  
  indexVariableName++;
  imageHolder.style.transform = `translate(-${indexVariableName * width}%)`;
  if(indexVariableName >= images.length - 1){
    indexVariableName = -1
  }
}
startSlideShow()

window.addEventListener("click", function(event){
  if(event.target.id === "right"){
    indexVariableName++

    if(indexVariableName >= images.length){
      indexVariableName = 0
    }
    imageHolder.style.transform = `translate(-${indexVariableName * width}%)`
    clearInterval(intervalName);
    setIntervalRunning = false;
  }
  
    if(event.target.id === "left"){
      if(indexVariableName === -1){
        indexVariableName = images.length - 1
      }
      indexVariableName--

      if(indexVariableName < 0){
        indexVariableName = images.length - 1
      }
      imageHolder.style.transform = `translate(-${indexVariableName * width}%)`
      clearInterval(intervalName);
      setIntervalRunning = false;
  }
  
})

imageHolder.addEventListener("mouseover",function(){
  clearInterval(intervalName);
})
imageHolder.addEventListener("mouseout",startSlideShow)

window.addEventListener("mouseout", function(event){
  if(event.target.id === "right" || event.target.id === "left"){
    if(setIntervalRunning == false){
      setIntervalRunning = true
      startSlideShow(intervalName);
  }
  }
})
