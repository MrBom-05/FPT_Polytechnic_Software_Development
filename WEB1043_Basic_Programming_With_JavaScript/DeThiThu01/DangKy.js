function getValue(id){
    return document.getElementById(id).value.trim();
}

function showError(key, mess){
    document.getElementById(key + '_error').innerHTML = mess;
}

function validate(){
    var flag = true;
    var hoten = getValue('hoten')
    if(hoten == ''){
        showError('hoten', 'Bạn cần nhập họ tên');
        flag = false;
    }
    else{
        showError('hoten', '')
    }

    var email = getValue('email');
    var mailformat = /\S+@\s+\.\S+/;
    if(email == ''){
        showError('email', 'Bạn cần nhập Email');
        flag = false;
    }
    else if(!mailformat.test(email)){
        showError('email', 'Vui lòng kiểm tra lại Email');
        flag = false;
    }
    else{
        showError('email', '');
    }

    var phone = getValue('phone');
    if(phone == ''){
        showError('phone', 'Bạn cần nhập Phone');
        flag = false;
    }
    else if(!/^[0-9]{10}$/.test(phone)){
        showError('phone', 'Vui lòng kiểm tra lại Phone');
        flag = false;
    }
    else{
        showError('phone', '');
    }

}

