import { Button } from "bootstrap";
import React from "react";
import { Link } from "react-router-dom";

const But = () =>{
    return(
        <>
        <body>
        <h1>SOCIAL BUTTONS</h1>
        <div>
        <button className="btn bg-warnig text-white">Like</Link>
        <button className="btn bg-light text-white">Comment</Link> 
        <Link className="btn bg-info text-white">Share</Link> 
        </div>
        </body>
        </>
    )
}
export default But;