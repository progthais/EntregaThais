//import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom'

import React from 'react';
import Header from "./components/Header";
import Footer from "./components/Footer";

//import Menu from "./components/Menu";
import Home from "./views/Home";
import Promocoes from "./views/Promocoes";
import Contato from './views/Contato';
import Destinos from './views/Destinos';


function App() {

  return (
  <BrowserRouter>

  <Header/>
    <Routes>
      <Route path="/" element={<Home/>} />
      <Route path="/Destinos" element={<Destinos/>} />
      <Route path="/Promocoes" element={<Promocoes/>}/>
      <Route path="/Contato" element={<Contato/>}/>
    </Routes>

    <Footer/>

    </BrowserRouter>

  );
}


export default App;


/*<a className="App-link" href="https://reactjs.org" target="_blank"
rel="noopener noreferrer"
>
Hello World!
</a>*/
/*<div className="App">
<Header title="Agência Viva! Viagens"/>
  <img src={logo} className="App-logo" alt="logo" />
  <p>
    <input type="button"value="Clique aqui" OnClick></input>
  </p>*/

 /* <h1>{props.title}</h1>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" />

*/