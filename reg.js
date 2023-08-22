function sub(){
    let phone=document.getElementsByName("phone");
    if(isNaN(phone))
    {
        alert("Please enter a valid phone number")
    }
    let phonestring=phone.toString();
    let length=phonestring.length;
    if(length!=10)
    {
        alert("Please enter valid  phone number");
    }
}