import React, { Suspense, useState, useEffect } from "react";
import { BrowserRouter, Switch, Route, Redirect } from "react-router-dom";
import axios from "axios";
import "./App.css";

const Site = () => {
  const [response, setResponse] = useState("...Loading");

  useEffect(() => {
    axios.get("/api").then((response) => setResponse(response.data));
  }, []);

  return (
    <div className="App">
      <div>
        <button onClick={() => window.open("/login", "_self")}>Login</button>
      </div>
      <div>Gettings reponse: {response}</div>
      <div>
        <a href="/logout">Logout</a>
      </div>
    </div>
  );
};

const App = () => {
  return (
    <BrowserRouter>
      <Switch>
        <Route exact path="/" component={Site} />
        <Route path="/login" component={Site} />
        <Route path="/test" component={Site} />
        <Route path="/redirect_uri" component={Site} />
        <Redirect to="/" />
      </Switch>
    </BrowserRouter>
  );
};

export default App;
