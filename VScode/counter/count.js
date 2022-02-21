const buttom1 = document.getElementById("BTN1");
const buttom2 = document.getElementById("BTN2");
const buttom3 = document.getElementById("BTN3");
const zero = document.querySelector(".number");
let num = 0;
buttom1.addEventListener("click", function(){
    num -= 1;
    zero.textContent = num;
    color();
})

buttom2.addEventListener("click", function(){
    num = 0;
    zero.textContent = num;
    zero.style.color = "black";
})

buttom3.addEventListener("click", function(){
    num += 1;
    zero.textContent = num;
    color();
})

function color(){
    if(num > 0){
        zero.style.color = "green"; 
    }
    else if(num < 0){
        zero.style.color = "red";
    }
    else{
        zero.style.color = "black";
    }
}
    
