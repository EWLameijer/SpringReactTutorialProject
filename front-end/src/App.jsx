import './App.css'
import RegistrationForm from './RegistrationForm';
import axios from 'axios'

const instance = axios.create({
  baseURL: "http://localhost:8080/"
})

function App() {

  const register = ({ username, password }) => console.log(`User ${username} has password ${password}`)


  return <>
    {instance.get("api/v1/register")}
    Test!!!
    <button onClick={() => instance.post("register", { username: "Wim", password: "Tim" }, {
    headers: { 'Content-type': 'application/json' }})}>Click me!</button>
    <RegistrationForm register={register} />
  </>

}

export default App
