// function submitform(){
//     let Name=document.getElementById("Name").value.trim();
//     let Email=document.getElementById("Email").value.trim();
//     let Message=document.getElementById("Message").value.trim();
//     if(Name==""||Email==""||Message==""){
//         document.getElementById("Response").innerText="Please enter the fields!";
//         document.getElementById("Response").stylecolor="red";
//     }else{
//         document.getElementById("Resopnse").innerText=`Thank you, ${Name}! Your request has been sent.`;
//         document.getElementById("Response").stylecolor="green";
//     }
// }
function submitform() {
  let name = document.getElementById("Name").value.trim();
  let email = document.getElementById("Email").value.trim();
  let message = document.getElementById("Message").value.trim();

  if (name === "" || email === "" || message === "") {
    document.getElementById("response recorded").innerText = "Please fill all fields!";
    document.getElementById("response recorded").style.color = "red";
  } else {
    document.getElementById("response recorded").innerText = `Thank you, ${name}! Your message has been sent.`;
    document.getElementById("response recorded").style.color = "green";
  }
}
