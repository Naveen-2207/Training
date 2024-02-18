import React from "react";
import '../node_modules/bootstrap/dist/css/bootstrap.css';
import Nav from "./components/nav";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Cont from "./components/rout/contact";
import About from "./components/rout/about";
import Log from "./components/rout/login";
import Prod from "./components/rout/product";
import Menu from "./components/rout/home";
import './components/rout/Home.css';
 
function Main(){
    return(

        <div className="new">
        
        <BrowserRouter>
        <Routes>
            <Route path="/" element={<Menu />} />
            <Route path="/https://logos-download.com/wp-content/uploads/2016/11/Golds_Gym_logo_logotype.png" element={[<Menu />,<About />]}/>
            <Route path="/About" element={[<Menu />,<About />]}/>
            <Route path="/Cont" element={[<Menu />,<Cont />]}/>
            <Route path="/Log" element={[<Menu />,<Log />]}/>
            <Route path="/Prod" element={[<Menu />,<Prod />]}/>
        </Routes>
        </BrowserRouter> 
        </div>
    )
}
export default Main;