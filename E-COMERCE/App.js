let sno = 0;
let e_Commerce = () => {
  let Sitem = document.getElementById("Sitem").value;
  let Simage = document.getElementById("Simage").files[0];
  let qty = parseInt(document.getElementById("qty").value);
  let rate = parseInt(document.getElementById("Rate").value);
  let amount = (document.getElementById("amt").value = qty * rate);
  let r = new FileReader();
  r.readAsDataURL(Simage);
  r.onloadend = function () {
    document.getElementById("tbody").innerHTML += `<tr>
    <td>${++sno}</td>
    <td>${Sitem}</td>
    <td><img src="${r.result}" height="100px" width="100px"/></td>
    <td>${qty}</td>
    <td>${rate}</td>
    <td>${amount}</td>`;
  };
  document.getElementById("Sitem").value = "";
  document.getElementById("Simage").value = "";
  document.getElementById("qty").value = "";
  document.getElementById("Rate").value = "";
  document.getElementById("amt").value = "";
};
document.getElementById("btnid").addEventListener("click", e_Commerce);
