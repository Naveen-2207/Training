import React from "react";
import Img from "../.././src/pictures/nature.jpg"
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faFaceAngry, faFaceFlushed, faFaceFrown } from "@fortawesome/free-regular-svg-icons";
function Nav(){
    return(
        <>
        <div style={{backgroundColor: "lightblue", color:"red", textShadow:"3px 10px grey"}}>
            <h1>home page</h1>
            <h2 >Web page</h2>
            {/* <img src={Img}/>   */}
            <FontAwesomeIcon icon={faFaceAngry}/>
            <FontAwesomeIcon icon={faFaceFrown}/>
        </div> 
        </>
    )
}

function Contact(){
return(
    <>
    <div className="div">
        <h1>E-Mail</h1>
        <h2 className="hed">LinkedIn</h2>
        <h3>Instagram</h3>
        <img src="https://th.bing.com/th/id/OIP.tIfhb31tN3HGDz37nwE40QHaE7?rs=1&pid=ImgDetMain"/>
        <a href="https://th.bing.com/th/id/R.f1f329a6741c1115c5b19e1ef128fa2e?rik=%2blbUyQRzkos8vw&riu=http%3a%2f%2fwww.carblogindia.com%2fwp-content%2fuploads%2f2017%2f01%2f2017-yamaha-r15-v3-official-image-matte-black.jpg&ehk=sbfB2k5NgpdMkl3%2bfzrcpvYmAPpjwA%2fzeRMV3wdqMcI%3d&risl=&pid=ImgRaw&r=0">My Life</a>
        <a href="https://wallpapercave.com/wp/wp4024354.jpg">Om Muruga</a>
    </div>
    </>
)
}
export{Contact}
export default Nav;