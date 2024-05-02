import { useState } from 'react'
import './App.css'
import axios from "axios";

function App() {

    const [user, setUser] = useState<string>("")

    function login() {
        const host = window.location.host === 'localhost:5173' ? 'http://localhost:8080' : window.location.origin

        window.open(host + '/oauth2/authorization/github', '_self')

    }

    function getMe() {
        axios.get("/api/user/me")
            .then(response => {
                setUser(response.data)
            })
    }

    return (
        <>
            <div>
                <h1>Lovely Monday</h1>
                <button onClick={login}>Login</button>
                <button onClick={getMe}>GetMe</button>
            </div>
        </>
    )

}

export default App