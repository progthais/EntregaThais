import React from 'react';
import cupom from '../img/cupom.png'
import blackfriday from '../img/blackfriday.jpg'
import universal from '../img/universal.jpg'
import paris from '../img/paris.jpg'
import natal from '../img/natal.jpg'
import lua from '../img/lua.jpg'
import peixe from '../img/peixe.jpg'


import '../css/CardPromocoes.css'

export default function cardpromocoes(){
return(

<div class="cardcontainer">

<div id="card">
<div class="card">
<img src= {blackfriday} className="fotocard"/>
<div class="cardinterior" >
<h4>Black Friday</h4>
<p>O dono ficou maluco! 20% OFF em qualquer pacote com destinos para Canadá ou EUA, aproveite!</p>
<button id="button">Saiba Mais</button>
</div>
</div> 

<div class="card">
<img src={universal} className="fotocard"/>
<div class="cardinterior">
<h4>Promoção Universal Studios e Você</h4>
<p>Compre com Visa e concorra uma a viagem ao Universal Studios.</p>
<button  id="button">Saiba Mais</button>
</div>
</div>   

<div class="card">
<img src={paris} className="fotocard"/>
<div class="cardinterior">
<h4>Promoção Bonjour Paris</h4>
<p>Compre dois pacotes Nacionais da Viva Viagens e ganhe uma passagem direto para Paris.</p>
<button  id="button">Saiba Mais</button>
</div>


</div>   
<div class="card">
<img src={natal} className="fotocard"/>
<div class="cardinterior">
<h4>Natal em família</h4>
<p>5% OFF em qualquer pacote de viagens natalino (válido apenas para Berlim, Londres e Denver) </p>
<button  id="button">Saiba Mais</button>
</div>



</div>

<div class="card">
<img src={lua} className="fotocard"/>
<div class="cardinterior">
<h4>Espaço para dois ♥</h4>
<p>Oferecemos desconto de até 10% ao comprar uma viagem de lua de mel para recém casados.</p>
<button  id="button" >Saiba Mais</button>
</div> 
</div> 

<div class="card">
<img src={peixe} className="fotocard"/>
<div class="cardinterior">
<h4> Frutos do Mar</h4>
<p>Ao comprar um pacote para ilhas paradisíacas Viva vai banca toda a sua alimentação! </p>
<button  id="button"> Saiba Mais</button>
</div>
  </div> 


<div class="card">
<img src={cupom} className="fotocard"/>
<div class="cardinterior">
<h4>Cupom mania (Promoção Limitada)</h4>
<p>Tem cupom para usar? Use para um desconto exclusivo na Viva Viagens!</p>
<button  id="button">Saiba Mais</button>
</div>


</div>     

 

</div>
   </div>





);
}