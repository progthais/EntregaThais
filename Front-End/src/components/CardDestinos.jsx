import React from 'react';
import belgica from '../img/belgica.jpg'
import shandong from '../img/shandong.jpg'
import paris from '../img/paris.jpg'
import tuvalu from '../img/tuvalu.jpg'
import inglaterra from '../img/inglaterra.jpg'
import america from '../img/america.jpg'
import rio from '../img/rio.jpg'
import toronto from '../img/toronto.jpg'
import '../css/CardDestinos.css'

export default function carddestinos(){
return(

<div class="cardcontainer">

<div id="card">
<div class="card">
<img src= {tuvalu} className="fotocard"/>
<div class="cardinterior" >
<h4>Pacote Ilhas Paradisiacas</h4>
<p>Destinos: Havai, Ferando de Noronha, Tuvalu, Bahamas</p>
<p>Preço: R$30.000 ou 30x no cartão </p>
<button>Comprar</button>
</div>
</div> 

<div class="card">
<img src={inglaterra} className="fotocard"/>
<div class="cardinterior">
<h4>Pacote Europeu</h4>
<p>Destinos: Paris, Inglaterra, Portugal, Austria ou Itália</p>
<p>Preço: R$5.500 ou 15x no cartão </p>
<button>Comprar</button>
</div>
</div>   
<div class="card">
<img src={america } className="fotocard"/>
<div class="cardinterior">
<h4>Estados Unidos</h4>
<p>Destinos: Colorado, Alabama, California e Iowa</p>
<p>Preço: R$1.500 cada destino indivídualmente.</p>
<button>Comprar</button>
</div>


</div>   
<div class="card">
<img src={rio} className="fotocard"/>
<div class="cardinterior">
<h4>Brasil</h4>       
<p>Destinos: Rio de Janeiro, São Paulo ou Brasília</p>
<p>Preço: R$800 cada ou 12x no cartão </p>
<button>Comprar</button>
</div>



</div>

<div class="card">
<img src={belgica} className="fotocard"/>
<div class="cardinterior">
<h4>Bélgica</h4>
<p>Destinos: Cidade de Bruxelas (hospedagem inclusa)</p>
<p></p>
<p>Preço: R$900,00 ou 11x no cartão </p>
<button>Comprar</button>
</div> 
</div> 

<div class="card">
<img src={paris} className="fotocard"/>
<div class="cardinterior">
<h4>Pacote Lua de Mel</h4>

<p>Destinos: Paris, Fernando de Noronha</p>
<p></p>
<p>Preço: R$10.000,00 ou 30x no cartão </p>
<button>Comprar</button>
</div>
  </div> 


<div class="card">
<img src={toronto} className="fotocard"/>
<div class="cardinterior">
<h4>Canadá</h4>
<p>Destinos:Toronto, Quebec ou Ottawa</p>
<p></p>
<p>Preço: R$1000,50 ou 18x no cartão </p>
<button>Comprar</button>
</div>


</div>     

<div class="card">
<img src={shandong} className="fotocard"/>
<div class="cardinterior">
<h4>China</h4>
<p>Destinos: Shandong ou Pequim </p>
<p></p>
<p>Preço: R$580,00 ou 10x no cartão </p>
<button>Comprar</button>
</div>


</div>  

</div>
   </div>





);
}