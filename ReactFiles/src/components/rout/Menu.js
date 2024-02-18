import { faEdit, faFile } from "@fortawesome/free-regular-svg-icons";
import { faSection, faTv } from "@fortawesome/free-solid-svg-icons";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import React from "react";
import { Link } from "react-router-dom";

const Default = () =>{
    return(
        <>
        <nav className="Navbar navbar-dark bg-light">
            <div className="nav-item d-flex justify-content-around">
            <Link to="/File" className="nav-link"><FontAwesomeIcon icon={faFile}/>File</Link>
            <Link to="/Edit" className="nav-link"><FontAwesomeIcon icon={faEdit}/>Edit</Link>
            <Link to="/Selt" className="nav-link"><FontAwesomeIcon icon={faSection}/>Selection</Link>
            <Link to="/View" className="nav-link"><FontAwesomeIcon icon={faTv}/>View</Link>
            </div>
        </nav>
        </>
    )
}
export default Default;
