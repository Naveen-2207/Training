// Function to check if the user exists and log them in
function isUser(email, password) {
  let ExistData = JSON.parse(localStorage.getItem("userDetails"));
  let status = { exists: false, correctCredentials: false };

  ExistData.forEach((value, index) => {
    if (value.email === email) {
      status.exists = true;
      if (value.password === password) {
        status.correctCredentials = true;
        localStorage.setItem("currentUser", JSON.stringify(value));
      }
    }
    localStorage.setItem("usercount", index + 1)
  });

  return status;
}

// Function to handle the login page logic
let loginPage = () => {
  const email = document.getElementById("email").value;
  const password = document.getElementById("uPass").value;
  const emailError = document.getElementById("emailError");
  const passwordError = document.getElementById("passwordError");
  const message = document.getElementById("message");

  let isValid = true;
  emailError.innerHTML = "";
  passwordError.innerHTML = "";
  if (email === "") {
    emailError.innerHTML = "Email is Required";
    emailError.style.color = "red";
    isValid = false;
    return;
  }
  if (password === "") {
    passwordError.innerHTML = "Password is Required";
    passwordError.style.color = "red";
    isValid = false;
    return;
  }

  const userStatus = isUser(email, password);
  if (userStatus.exists) {
    if (userStatus.correctCredentials) {
      sessionStorage.setItem("login", "true");
      alert("Logged in successfully");
      document.getElementById("btnid").disabled = true;
      document.getElementById("email").disabled = true;
      document.getElementById("uPass").disabled = true;
      document.getElementById("userInfo").style.display = "block";
      let currentUser = JSON.parse(localStorage.getItem("currentUser"));
      document.getElementById("userNameDisplay").textContent = currentUser.userName;
    } else {
      message.innerHTML = "Incorrect password";
      message.style.color = "red";
    }
  } else {
    message.innerHTML = "User does not exist";
    message.style.color = "red";
    setTimeout(() => window.location.href = "register.html", 3000);
  }

  document.getElementById("signupSuccess").style.display = "none";
  document.getElementById("uPass").value = "";
  document.getElementById("email").value = "";
  return isValid;
};

// Event listener for the login button
document.getElementById("btnid").addEventListener("click", loginPage);

// Event listener for the logout button
document.getElementById("logoutBtn").addEventListener("click", () => {
  sessionStorage.removeItem("login");
  document.getElementById("btnid").disabled = false;
  document.getElementById("email").disabled = false;
  document.getElementById("uPass").disabled = false;
  document.getElementById("userInfo").style.display = "none";
  window.location.href = "login.html";
});

// Check if a user is already logged in when the page loads
if (sessionStorage.getItem("login") === "true") {
  document.getElementById("btnid").disabled = true;
  document.getElementById("email").disabled = true;
  document.getElementById("uPass").disabled = true;
  document.getElementById("userInfo").style.display = "block";
  let currentUser = JSON.parse(localStorage.getItem("currentUser"));
  document.getElementById("userNameDisplay").textContent = currentUser.userName;
}
