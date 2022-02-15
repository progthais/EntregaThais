import React from 'react';
import '../css/Contato.css'
import Formulario from '../components/Formulario'
import mapa from '../img/mapa.png'
import {faMap} from "@fortawesome/free-solid-svg-icons";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";

export default function contato(){
    return(

<div id="container">
<h1>Contato</h1>
 <hr/>
 <p>Tem alguma sugestão ou dúvidas? Então fale conosco.</p>
 <h4>Agência Viva Viagens</h4>
<h4>Av. Afonso de Taunay - Barra da Tijuca Rio de Janeiro - RJ, 22621-310<span><FontAwesomeIcon icon={faMap} /></span></h4> 
 <div id="endereco">
 <img src={mapa} alt="mapa"className='mapa' />
 <Formulario/>

 </div>






</div>

);
}