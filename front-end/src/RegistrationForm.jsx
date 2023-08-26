import {useState} from 'react';
import PropTypes from 'prop-types';


const RegistrationForm = props => {
    const [registrationData, setRegistrationData] = useState({username: "", password: ""})

    const update = event => {
        const {name, value} = event.target;
        console.log(`name is ${name}, value is ${value}`)
        console.table(event.target)
        setRegistrationData({...registrationData, [name]: value})
    }



    return <>
        <h1>Register</h1>
            Username: <input type="text" value={registrationData.username} onChange={update}/>
            Password: <input type="text" value={registrationData.password} onChange={update}/>
            <button onClick={() => props.register}>Register</button>
        </>
}

RegistrationForm.propTypes = {
    register: PropTypes.func.isRequired
}

export default RegistrationForm;