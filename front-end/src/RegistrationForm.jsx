import { useState } from 'react';
import PropTypes from 'prop-types';


const RegistrationForm = props => {
    const [registrationData, setRegistrationData] = useState({ username: "user", password: "pass" })

    const update = event => {
        const { name, value } = event.target;
        console.log(`name is ${name}, value is ${value}`)
        setRegistrationData({ ...registrationData, [name]: value })
    }

    const submit = e => {
        e.preventDefault();
        props.register(registrationData)
    }

    return <>
        <h1>Register</h1>
        <form onSubmit={submit}>
            Username: <input type="text" name="username" value={registrationData.username} onChange={update} />
            Password: <input type="text" name="password" value={registrationData.password} onChange={update} />
            <input type="submit" />
        </form>
    </>
}

RegistrationForm.propTypes = {
    register: PropTypes.func.isRequired
}

export default RegistrationForm;