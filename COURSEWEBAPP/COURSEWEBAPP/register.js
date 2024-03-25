let getUser;
let userJSON;
let register = () => {
  const userName = document.getElementById("uName").value;
  const email = document.getElementById("email").value;
  const password = document.getElementById("uPass").value;
  const confirmPassword = document.getElementById("cPass").value;
  const userNameError = document.getElementById("userNameErr");
  const emailError = document.getElementById("emailErr");
  const passwordError = document.getElementById("passwordErr");
  const cpasswordError = document.getElementById("cpasswordErr");
  const errorMsg = document.getElementById("errorMsg");
  let isValid = true;
  userNameError.innerHTML = "";
  emailError.innerHTML = "";
  passwordError.innerHTML = "";
  cpasswordError.innerHTML = "";
  errorMsg.innerHTML = "";

  let isValidEmail = (email) => {
    var emailRegex = /\S+@\S+\.\S+/;
    return emailRegex.test(email);
  };

  // Check if email already exists
  getUser = localStorage.getItem("userDetails")
    ? JSON.parse(localStorage.getItem("userDetails"))
    : [];
  const emailExists = getUser.some(user => user.email === email);
  if (emailExists) {
    emailError.innerHTML = "Email already exists";
    emailError.style.color = "red";
    isValid = false;
  }

  if (userName == "") {
    userNameError.innerHTML = "Username is Required";
    userNameError.style.color = "red";
    isValid = false;
  }
  if (email == "") {
    emailError.innerHTML = "Email is Required";
    emailError.style.color = "red";
    isValid = false;
  } else if (!isValidEmail(email)) {
    emailError.innerHTML = "Email is not valid Format";
    emailError.style.color = "red";
    isValid = false;
  }
  if (password == "") {
    passwordError.innerHTML = "Password is Required";
    passwordError.style.color = "red";
    isValid = false;
  }
  if (confirmPassword == "") {
    cpasswordError.innerHTML = "ConfirmPassword is Required";
    cpasswordError.style.color = "red";
    isValid = false;
  } else if (password.length < 6) {
    passwordError.innerHTML = "Password must be at least 6 characters long";
    passwordError.style.color = "red";
    isValid = false;
  }
  if (confirmPassword.length < 6) {
    cpasswordError.innerHTML = "ConfirmPassword must be at least 6 characters long";
    cpasswordError.style.color = "red";
    isValid = false;
  }
  if (!(password === confirmPassword)) {
    errorMsg.innerHTML = "password and confirmPassword not same";
    errorMsg.style.color = "red";
    isValid = false;
  }

  let userData = {
    userName: userName,
    email: email,
    password: password,
    confirmPassword: confirmPassword,
  };

  if (isValid) {
    getUser.push(userData);
    userJSON = localStorage.setItem("userDetails", JSON.stringify(getUser));
    sessionStorage.setItem("login", "true");
    document.getElementById("signupSuccess").style.display = "block";
  }

  document.getElementById("uName").value = "";
  document.getElementById("email").value = "";
  document.getElementById("uPass").value = "";
  document.getElementById("cPass").value = "";
  return isValid;
};

document.getElementById("btnid").addEventListener("click", register);
