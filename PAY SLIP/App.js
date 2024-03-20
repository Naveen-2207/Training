let bpay, hra, da, travel, pf, gross, netsal;
let printForm = () => {
  bpay = parseInt(document.getElementById("bpay").value);
  hra = document.getElementById("hra").value = bpay * (10 / 100);
  da = document.getElementById("da").value = bpay * (5 / 100);
  travel = document.getElementById("travel").value = bpay * (15 / 100);
  pf = document.getElementById("pf").value = bpay * (15 / 100);
  gross = document.getElementById("gross").value =
    bpay + hra + da + travel + pf;
  netsal = document.getElementById("netsal").value = gross - pf;
};
document.getElementById("bpay").addEventListener("keyup", printForm);

let printData = () => {
  let sno = 0;
  sno += 1;
  document.getElementById("tbody").innerHTML += `<tr>
  <td>${bpay}</td>
  <td>${netsal}</td>
  <td>${gross}</td>
  <td>${hra}</td>
  <td>${da}</td>
  <td>${travel}</td>
  <td>${pf}</td>`;
  document.getElementById("bpay").value = "";
  document.getElementById("hra").value = "";
  document.getElementById("da").value = "";
  document.getElementById("travel").value = "";
  document.getElementById("pf").value = "";
  document.getElementById("gross").value = "";
  document.getElementById("netsal").value = "";
};
document.getElementById("btnid").addEventListener("click", printData);
