
import { faBell, faCircleCheck } from '@fortawesome/free-regular-svg-icons'
import { faCircleExclamation } from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import React from 'react'

export default function Task5() {
  return (
    <div className='container-fluid d-flex align-items-center justify-content-center w-25 mt-5'>
        <div className='mt-5'><h1>Notifications</h1>
        <div className='col-6 ms-4'>
        <div className='row'>
        <div className='btn bg-primary text-white rounded-3 mt-3'><FontAwesomeIcon icon={faCircleCheck} style={{color:"white"}}/> Information Message</div>
        <div className='btn bg-success text-white rounded-3 mt-3'><FontAwesomeIcon icon={faCircleCheck} style={{color:"white"}}/> Success Message</div>
        <div className='btn bg-warning text-white rounded-3 mt-3'><FontAwesomeIcon icon={faBell} style={{color:"white"}}/> Warning Message</div>
        <div className='btn bg-danger text-white rounded-3 mt-3'><FontAwesomeIcon icon={faCircleExclamation} style={{color:"white"}}/> Error Message</div>
        </div>
        </div>
        </div>
    </div>
  ) 
}
