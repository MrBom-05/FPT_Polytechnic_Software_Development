var anhAr = [];
var currenrIndex = 0;
var autoslide;


function loadAnh(){
    for(var i = 0; i < 5; i++){
        anhAr[i] = new Image();
        anhAr[i].src = "Img/" + i + ".jpg";
    }
}

function auto(){
    document.getElementById("anh").src = anhAr[currenrIndex].src;
    if(currenrIndex == 4){
        currenrIndex = 0;
    }
    else{
        currenrIndex++;
    }
    autoslide = setTimeout(auto, 2000);
    document.getElementById("chiso").innerHTML = currenrIndex + "/5"
}

function start(){
    auto();
}
function stop(){
    clearTimeout(autoslide);
}
