import React from 'react';
import CardPromocoes from '../components/CardPromocoes';
import '../css/Promocoes.css'

export default function promocoes(){
    return(
        <div id="container">

<h1>Promoções</h1>
<hr/>
<h4>Aqui temos descontos e promoções exclusivas para nossos clientes!  </h4>
<CardPromocoes/>
</div>
);
}