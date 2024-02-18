 import React, { useState } from "react";

// // const Hook = () => {
// //     var a = document.getElementById("in");
// //     function inc(){
// //         document.getElementById("in").textContent=a++;
// //     }
// //     function dec(){
// //         // var a = document.getElementById("in")
// //         document.getElementById("in").textContent=a--;
// //     }
// //     function res(){
// //         document.getElementById("in").textContent=0;
// //     }
// //     return(
// //         <>
// //         <p id="in"></p>
// //         <button onClick={inc}>+</button>
// //         <button onClick={dec}>-</button>
// //         <button onClick={res}>0</button>
// //         </>
// //     )
// // }
// // export default Hook;
// // function Hook(){
// //     variable[variablename,setVariablename]=useState()
// //     const [count, setCount]=useState(5)
// //     function inc() {
// //         setCount(count+1);
// //     }
// //     function dec() {
// //         setCount(count-1);
// //     }
// //     function res() {
// //         setCount(0);
// //     }
// //     return (
// //         <>
// //             <p>{count}</p>
// //             <button onClick={inc}>+</button>
// //             <button onClick={dec}>-</button>
// //             <button onClick={res}>0</button>
// //         </>
// //     )
// // }
// // export default Hook;

function Hook(){
    const [count, setCount]=useState(5);
    
    return (  
        <>
            <p>{count}</p>
            <button onClick={()=>(setCount(count+1))}>+</button>
            <button onClick={()=>(setCount(count-1))}>-</button>
            <button onClick={()=>(setCount(01 ))}>0</button>
        </>
    )
}
export default Hook;