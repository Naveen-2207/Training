import React from "react";
import "./Task1.css";

function Card() {
  return (
    <div className='container-fluid mt-6'>
    <h1 className="text-center">congratulations</h1>
      <div className=" d-flex justify-content-center text-center mt-5">
        <div className="card w-25">
            <div className="col-12">
              <img src="https://assets.ccbp.in/frontend/react-js/congrats-card-profile-img.png" />
              <h1>kiran V</h1>
              <p>
                Vishnu Institute of Computer Education and Technology,Bhimavaram
              </p>
              <img src="https://assets.ccbp.in/frontend/react-js/congrats-card-profile-img.png" />
            </div>
          </div>
        </div>
    </div>
  );
}
export default Card;
