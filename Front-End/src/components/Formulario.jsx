import React from 'react';
import '../css/Formulario.css'

export default function formulario(){
    return(
<div class="formulario">
  <form action="action_page.php">
    <div class="row">
      <div class="col-25">
        <label for="fname">Nome</label>
      </div>
      <div class="col-75">
        <input type="text" id="fname"  placeholder="Seu nome"/>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="lname">E-mail</label>
      </div>
      <div class="col-75">
        <input type="text" id="lname" placeholder="Seu E-mail"/>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="country">Pais</label>
      </div>
      <div class="col-75">
        <select id="country" name="country">
          <option value="brasil">Brasil</option>
          <option value="canada">Canada</option>
          <option value="estadosunidos">Estados Unidos</option>
        </select>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="subject">Assunto</label>
      </div>
      <div class="col-75">
        <textarea id="assunto" placeholder="Descreva o assunto"></textarea>
        <div class="row">
      <input type="submit" value="Enviar"/>
    </div>
      </div>
      
    </div>
      
  </form>

  
</div>


);
}