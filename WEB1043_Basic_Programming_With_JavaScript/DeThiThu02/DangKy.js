// var hang = document.getElementById("listhang").children[1].children;

// var tongtien = document.getElementById("tongtien");

// function tinhtien(osoluong){
//     var soluong = osoluong.soluong;
//     var dongia = osoluong.parentElenment.previousElementSibling.innerHTML;
//     var thanhtien = osoluong.parentElenment.nextElenmentSibling;
//     thanhtien.innerHTML = soluong * dongia;

//     var sum = 0;
//     for(var i = 0; i < hang.length; i++){
//         var thanhtien = hang[i].lastElementChild.innerHTML
//         sum = sum + Number(thanhtien)
//     }
//     thanhtien.innerHTML = sum
// }

function getValue(id) {
    return document.getElementById(id).value.trim();
}

function showError(key, mess) {
    document.getElementById(key + '_loi').innerHTML = mess;
}

function check(){
    var flag = true;
    var hoten = getValue('tenkh')
    if (hoten == "") {
        showError('tenkh', 'Bạn cần nhập Tên Khách Hàng');
        flag = false;
    }
    else if (hoten.length < 8) {
        showError('tenkh', 'Tên Khách Hàng nhiều hơn 5 kí tự')
        flag = false;
    }
    else {
        showError('tenkh', '')
    }

    var email = getValue('email');
    var mailformat = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if (email == "") {
        showError('email', 'Bạn cần nhập Email');
        flag = false;
    }
    else if (!mailformat.test(email)) {
        showError('email', 'Vui lòng kiểm tra lại Email');
        flag = false;
    }
    else {
        showError('email', '');
    }


    if(flag == true){
        alert("Bạn đã đặt hàng thành công");
    }
    
}