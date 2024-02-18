import { faContactBook, faFile } from "@fortawesome/free-regular-svg-icons";
import { faHome, faPhone, faToolbox } from "@fortawesome/free-solid-svg-icons";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import React from "react";
import { Link } from "react-router-dom";

const  Menu=()=>{
    return( 
        <>
        <nav className="navbar navbar-expand-md navbar-dark bg-dark p-2">
        <div className="container-fluid text-white">
        <div className="navbar-brand">
            <img src="/https://logos-download.com/wp-content/uploads/2016/11/Golds_Gym_logo_logotype.png"/></div>
            <div className="navbar-nav justify-content-end">
                <Link to="/about" className="nav-Link text-white p-2"><FontAwesomeIcon icon={faHome}/>Home</Link>
                <Link to="/Log" className="nav-Link text-white p-2"><FontAwesomeIcon icon={faFile}/>Login</Link>
                <Link to="/Cont" className="nav-Link text-white p-2"><FontAwesomeIcon icon={faPhone}/>Contact</Link>
                <Link to="/Prod" className="nav-Link text-white p-2"><FontAwesomeIcon icon={faToolbox}/>Product</Link>
                 
            </div>
        </div>
        </nav>
        </>
    );

}
export default Menu;