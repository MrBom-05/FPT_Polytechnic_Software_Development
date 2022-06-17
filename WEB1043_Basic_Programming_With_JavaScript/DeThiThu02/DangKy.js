function getValue(id){
    return document.getElementById(id).value.trim();
}

function showError(key, mess){
    document.getElementById(key + '_error').innerHTML = mess;
}

function validate(){
    var name = document.getElementById("ten").value;
    var email = document.getElementById("email").value;

    if (name.length > 5) {
        hideNotify('ten_error');
    } else {
        displayNotify('ten_error');
        event.preventDefault();
    }

    if (email.length > 0) {
        hideNotify('email_error');
    } else {
        displayNotify('email_error');
        event.preventDefault();
    }

}