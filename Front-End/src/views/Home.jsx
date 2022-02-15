import React from 'react';
import Coluna from '../components/Coluna';
import plane5 from '../img/plane5.jpg'
import travel from '../img/travel.jpg'

import '../css/Home.css'
import '../css/CardHome.css'

export default function home(){
    return(
<div id="container">
<Coluna/>

<div id="conteudo">

<h2>
Com a Viva Viagens você já sabe o que esperar, qualidade no serviço e toda a atenção que você e sua família merecem.
</h2>





<div id="propaganda">
<img src={plane5} alt="plane" className='fotos' />
<img src={travel} alt="travel"className='fotos' />
</div>
<p>
<h2>

Gostaria de experimentar uma sensação única? 
</h2>

</p> 
<p>
<h2>
   
Já pensou em viver experiências incríveis? 
</h2>

</p>
<p>  
 <h4>  
Então, venha viajar conosco!

Temos os melhores pacotes de viagens feitos pelo melhor preço que você já viu, confiamos que você terá a
melhor experiência ao viajar com a gente, afinal a Viva quer te proporcionar momentos incríveis
e memórias para compartilhar!
</h4>  

</p>       

<p>
<h4>  

Os nossos destinos são pensados e planejados para oferecer a melhor qualidade na hora de viajar,
aplicamos também promoções exclusivas para sua comodidade.

</h4>  

</p>

 

<p>

<h4> 

E ai vai perder essa? Entre logo em contato conosco e aproveite o melhor que a vida pode te oferecer. 
</h4>  

</p>   
  
<p>
<h4> 

Viva Viagens, tudo a ver com você!
</h4> 
</p>




</div>









</div>
);

}