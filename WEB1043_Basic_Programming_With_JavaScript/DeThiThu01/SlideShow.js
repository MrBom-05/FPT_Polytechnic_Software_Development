var anhAr = [];
var currenrIndex = 0;
var autoslide;


function loadAnh(){
    for(var i = 0; i < 7; i++){
        anhAr[i] = new Image();
        anhAr[i].src = "Img/" + i + ".jpg";
    }
}

function auto(){
    document.getElementById("anh").src = anhAr[currenrIndex].src;
    if(currenrIndex == 6){
        currenrIndex = 0;
    }
    else{
        currenrIndex++;
    }
    autoslide = setTimeout(auto, 2000);
}

function next(){
    if(currenrIndex < 6){
        currenrIndex++;
    }
    else{
        currenrIndex = 0;
    }
    document.getElementById("anh").src = anhAr[currenrIndex].src;
}

function back(){
    if(currenrIndex > 0){
        currenrIndex--;
    }
    else{
        currenrIndex = 6;
    }
    document.getElementById("anh").src = anhAr[currenrIndex].src;
}

function anh(){
    auto();
}