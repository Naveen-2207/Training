import React from "react";
import { FaEnvelope, FaLock } from "react-icons/fa";


function Task6()
{ 
    return(
        <div className="container-fluid justify-content-center " style={C}>
            <div style={D} className="card">
                <div style={B}  className="row">
                    <div className="col-6">
                        <img src="https://images.pexels.com/photos/572056/pexels-photo-572056.jpeg?cs=srgb&dl=accounting-analytics-apple-572056.jpg&fm=jpg" className=" pl-5 w-75 rounded-circle"  />
                    </div>
                    <div className="col-6 text-center ">
                        <h1 className="card-heading">Member Login</h1>
                        <div>
                        <FaEnvelope/>
                        <input  style={A} type="Email" id="email" name="mailid" placeholder="Email"/>
                        </div> 
                        <div>
                        <FaLock/>
                        <input style={A} type="password" id="pass" name="password" placeholder="*****"/>
                        </div>
                        <div>

                        </div>
                        <div className="text-center">
                        <button style={A}>Login</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}
export default Task6;
const A={
    marginTop:"10px",
    padding:"5px",
    border:"none",
    width:"150px",
}
const B={
    justifyContent:"center",
    alignItems:"center",

    }
const C={
    backgroundColor:"darkviolet",height:"100vh",
    paddingTop:"30vh",
}
const D={
    justifyContent:"center",
    width:"50%",
    height:"50%",
    marginLeft:"25%",
}

