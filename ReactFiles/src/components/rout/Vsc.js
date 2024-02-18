import React from "react";
import { faEdit, faFile } from "@fortawesome/free-regular-svg-icons";
import { faSection, faTv } from "@fortawesome/free-solid-svg-icons";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import '../../../node_modules/bootstrap/dist/css/bootstrap.css';
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import Edit from "./Edit";
import View from "./View";
import Selt from "./Selection";
import File from "./File";

const Nav = () =>{
    return(
        <>
        <BrowserRouter>
         <nav className="Navbar navbar-dark bg-light">
            <div className="nav-item d-flex justify-content-around">
            <Link to="/File" className="nav-link"><FontAwesomeIcon icon={faFile}/>File</Link>
            <Link to="/Edit" className="nav-link"><FontAwesomeIcon icon={faEdit}/>Edit</Link>
            <Link to="/Selt" className="nav-link"><FontAwesomeIcon icon={faSection}/>Selection</Link>
            <Link to="/View" className="nav-link"><FontAwesomeIcon icon={faTv}/>View</Link>
            </div>
        </nav>
        <Routes>
            <Route path="/" element="" />
            <Route path="/File" element={<File />}/>
            <Route path="/Edit" element={<Edit />}/>
            <Route path="/Selt" element={<Selt />}/>
            <Route path="/View" element={<View />}/>
        </Routes>
        </BrowserRouter>
        </>
    )
}
export default Nav;