import React from 'react';
import './Task6.css';
function Task6(){
    return(
        <>
            <div className='card'>
                <div className='row'>
                    <div className='col-6'>
                        <img src='https://tse4.mm.bing.net/th?id=OIP.qe4OxACNJvslaKOlgWv0EQHaGL&pid=Api&P=0&h=220' height={"200px"} width={"200px"}/>
                    </div>
                    <div className=' one col-6'>
                        <h4>Member Login</h4>
                        <div><input style={A} type='email' placeholder='Email'/></div>
                        <div><input style={A} type='password' placeholder='Password'/></div>
                        <div><button style={A} type='submit' className='bg-success'>Login</button></div>
                        <div className='two'><p>Forget <span className='text-success'>Usename / Password ?</span></p>
                        <span className='text-success'>Create your account</span></div>
                    </div>
                </div>
            </div>
        </>
    )
}
export default Task6;
A={
    border:"10px yellow",

}