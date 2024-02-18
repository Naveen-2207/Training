import pic1 from '../pictures/nature.jpg'
function One() {
    function ok(){
 document.getElementById("nav").style.color = "black";
    }
    let color={
        color:"blue",
        fontSize:"200px"
    }
    return(
        <>
        <h1 id="nav" style={color}>Naveen</h1>
        <button onClick={ok}>click</button>
        <img src={pic1}/>
        </>
    );
}
export default One;
export function Two(){
    function sub(){
    document.querySelector("h1").style.background = "blue";
    }
    return(
        <>
        <h1>jasir</h1>
        <button onClick={sub}>ok</button>
        <h2>john</h2>
        </>
    )
}
