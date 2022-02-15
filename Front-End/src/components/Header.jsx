import React from 'react';
import { BrowserRouter as Router, NavLink} from 'react-router-dom'
import { faAd, faHome, faMap, faPhone } from "@fortawesome/free-solid-svg-icons";


import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import '../css/Header.css'
import icone from '../img/icone.ico'

function Header(props){

    
    return(

       
        <header>
 <div id="topo">



 </div>



            	<title>Agência Viva! Viagens</title>	
				<nav>	
					<ul class="menu">
                        
                    <label className="logo">
						<img src={icone} alt="logo" />
					</label>
                    <label className="titulo">
                    Bem vindo(a) a Viva! Viagens
                    </label>
						<li>
							<NavLink activeClassName="active" to="/">
							<span><FontAwesomeIcon icon={faHome} /></span>

	                         Home
							</NavLink>
						</li>
						<li>
							<NavLink activeClassName="active" to="/Destinos">
							<span><FontAwesomeIcon icon={faMap} /></span>

								Destinos
							</NavLink>
						</li>
						<li>
							<NavLink activeClassName="active" to="/Promocoes">
							<span><FontAwesomeIcon icon={faAd} /></span>

								Promoções

							</NavLink>

						</li>
						<li>
							<NavLink activeClassName="active" to="/Contato">
							<span><FontAwesomeIcon icon={faPhone} /> </span>

							Contato

							</NavLink>
						</li>
					</ul>
                    
				</nav>
                </header>
       

    );


}
export default Header;