let count = localStorage.getItem('coursecount')
console.log(count);
document.getElementById("coursecount").innerHTML = count


let usercount = localStorage.getItem('usercount')
console.log(usercount);
document.getElementById("usercount").innerHTML = usercount

let enrollcount = localStorage.getItem("enrollcount")
console.log(enrollcount);
document.getElementById("enrollcount").innerHTML = enrollcount


let completecount = localStorage.getItem("completedcount")
console.log(completecount);
document.getElementById("completecount").innerHTML = completecount