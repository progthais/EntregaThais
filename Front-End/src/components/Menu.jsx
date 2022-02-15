
import React from 'react';
import {Link} from 'react-router-dom';

export default function menu(){
    return(
        <nav>
<Link to= "/">Home</Link><br />
<Link to= "/Destinos">Destinos</Link><br />
<Link to= "/Promocoes">Promoções</Link><br />
<Link to= "/Contato">Contato</Link><br />
</nav>
);
}