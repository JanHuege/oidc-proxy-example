import React, { Suspense, useState, useEffect } from 'react';
import axios from "axios";
import './App.css';

const App = () => {

  const [response, setResponse] = useState("...Loading");

  useEffect(() => {
    axios.get("/api").then(response => setResponse(response.data))
  }, [])

  return (
    <div className="App">
      Gettings reponse: { response }
      <a href="/logout">Logout</a>
    </div>
  );
}

export default App;
