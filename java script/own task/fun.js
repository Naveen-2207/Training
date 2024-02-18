// // let a = (a, b) => {

// //     console.log(a, "what happend?");

// //     console.log(b, "what are you doing?");

// // }

// // a("naveen", "kutty");

// // let a = a => console.log(a, "good morning!");

// // a("naveen");

// // a("kutty");

// // setTimeout(() => {

// //     console.log("hii")

// // }, 5000);

// // let abc=setInterval(() => {

// //     let nav = document.createElement("img")

// //     nav.setAttribute("src", "https://cdn.pixabay.com/photo/2020/05/11/15/38/tom-5158824_1280.png" );

// //     document.body.append(nav);

// // }, 1000);

// // 	setTimeout(()=>clearInterval(abc) ,2000);

// function consoleStyler(color, background, fontSize, txt) {
//    var message = "%c" + txt;
//    var style = `color: ${color};`
//    style += `background: ${background};`
//    style += `font-size: ${fontSize};`
//    console.log(message, style);
// }
// function celebrateStyler(reason) {
//    var fontStyle = "color: tomato; font-size: 50px";
//    if (reason == "birthday") {
//        console.log(`%cHappy birthday`, fontStyle);
//    }
//    else if (reason == "champions") {
//        console.log(`%cCongrats on the title!`, fontStyle);
//    }
//    else {
//        console.log(message, style);
//    }
// }
// consoleStyler('#1d5c63', '#ede6dp', '40px', 'Congrats!');
// celebrateStyler('birthday');

// function styleAndCelebrate() {
//    consoleStyler(color, background, fontSize, txt);
//    celebrateStyler(reason);
// }
// styleAndCelebrate('ef7c8e', 'fae8e0', '30px', 'You made it!', 'champions');

// promises:

// const p1 = new Promise((a, b) => {
//   setTimeout(() => {
//     b("i'm a fullstack developer");
//   }, 1000);
// });
// const  p2 = new Promise((a,  b) =>{
//     setTimeout(()=>{
//         a("i'm not fullstack developer")
//     },1000);
//     });
//   Promise.all([p1,p2]).then(console.log).catch(console.log)

// callback

// const f1=(val) => {
//     return f2(val + 10)
// }
// const f2 = (val)=>{
//     return(val + 50)
// }
// console.log(f1(12));
// console.log(a(45+56))

// const  p2 = val => new Promise((resolve, reject) =>{
//         setTimeout(()=>{
//             resolve(val + 10)
//         },1000);
//         })
//       p2(12).then(x => x + 50).then(console.log)

// 
function rev(str){
  for(i=str.length;i<=5;i++){
    console.log(i);
  }

}rev("hello");
