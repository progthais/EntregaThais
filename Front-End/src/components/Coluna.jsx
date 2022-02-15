import React from 'react';
import '../css/Coluna.css'
import Cardhome from '../components/CardHome';
import star from '../img/star.png'
import { faLink,faStar,faEye} from "@fortawesome/free-solid-svg-icons";
import instagram from '../img/instagram.jpg'
import facebook from '../img/facebook.png'
import twitter from '../img/twitter.png'
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";

export default function coluna(){
    return(
<div>
<div id="coluna">

<center><h4>Avaliações dos Clientes<span><FontAwesomeIcon icon={faStar} /></span></h4></center> 


<ul >
<li>
<blockquote>"Gratidão pelo atendimento! Ótima viagem sem dor de cabeça." Por Bruno Marte

</blockquote>
<img src={star} className="star" />

</li>
<hr />
<li><blockquote> "Tive um ótimo atendimento recomendo em qualquer viagem!"
Por Rihanna Lima
</blockquote>
<img src={star} className="star" />

</li>

<hr />
<li><blockquote> "Preços acessíveis sempre pensando nos clientes"
Por Adele Ferreira
</blockquote>
<img src={star} className="star" />
</li>
<hr />




</ul>


<center><h4>Nossas redes <span><FontAwesomeIcon icon={faLink} /></span>
</h4></center>

<a href="https://twitter.com/" class="fa-brands fa-facebook" ></a>
<a href="https://facebook.com" class="icon-button facebook"></a>
<a href="https://plus.google.com" class="icon-button google-plus"></a>



<ul >
<li><a href="https://facebook.com" >
<img src={facebook}  width="30px" height="30px"/>


</a></li>

<li><a href="https://twitter.com/" >

<img src={twitter} width="30px" height="30px"  />
</a></li>

<li><a href="https://instagram.com/" >
<img src={instagram} width="30px" height="30px"/>
</a></li>
</ul>
<p>


<center><h4>Novidades<span><FontAwesomeIcon icon={faEye} /></span></h4></center>
<Cardhome/>
</p>


</div>    





</div>
);
}