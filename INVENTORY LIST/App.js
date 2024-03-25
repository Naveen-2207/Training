let arr = JSON.parse(localStorage.getItem("products")) || [];

let addItems1 = () => {
  let productName = document.getElementById("products").value;
  let check = productName.split(" ");
  let validate = check[0].toUpperCase();
  if (validate == "ADD") {
    addItems(check[1]);
    getItems();
  } else if (validate == "REMOVE") {
    removeItems(check[1]);
    getItems();
  } else {
    alert("Item already exists. Please enter a different item.");
  }
  document.getElementById("products").value = "";
};
document.getElementById("addItems").addEventListener("click", addItems1);

let addItems = (input) => {
  input = input.toLowerCase();
  if (arr.length < 10) {
    if (!arr.includes(input)) {
      arr.push(input);
      console.log(input);
      console.log(arr);
    } else {
      alert("Item already exists. Please enter a different item.");
    }
  } else {
    alert("Maximum number of items reached. Cannot add more items.");
  }
  localStorage.setItem("products", JSON.stringify(arr));
};

let removeItems = (input) => {
  input = input.toLowerCase();
  if (arr.includes(input)) {
    arr.pop(input);
    console.log(input);
    console.log(arr);
  } else {
    alert("Item does not exists. Please enter a valid item.");
  }
  localStorage.setItem("products", JSON.stringify(arr));
};

let getItems = () => {
  input = document.getElementById("itemList");
  input.innerHTML = "";
  arr.forEach((value) => {
    console.log(value);
    input.innerHTML += `<li>${value}</li>`;
  });
};
