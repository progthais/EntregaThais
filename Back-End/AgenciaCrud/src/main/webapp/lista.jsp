<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Destinos - Agência Viva Viagens</title>
</head>
<body>
<style>
body {
  background-image: url('white1.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
      <img src="icone.ico" class="img-fluid">
  
    <a class="navbar-brand" href="#">Agência Viva Viagens</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
        
        <li class="nav-item">
          <a class="nav-link" href="home.html">Home</a>
        </li>
          
          <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.html">Destinos</a>
        </li>
     
        <li class="nav-item">
          <a class="nav-link" href="promocaoindex.html">Promoções</a>
        </li>
      
 
      </ul>
      <form action="CreateFind" method="GET" class="d-flex">
        <input name="pesquisa" class="form-control me-2" type="search" placeholder="Pesquisar no Banco" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Buscar</button>
      </form>
    </div>
  </div>
</nav>
<br>
<div class="container">
<div class="row">
<div class="cold-md-7">
<hr>
<h3>Destinos Cadastrados</h3>
<hr>
<table class="table">
<thead>
<tr>

<th>#Id</th>
<th>Nome</th>
<th>Pais</th>
<th>Cidade</th>
<th>Estado</th>


</tr>


</thead>

<tbody>


<c:forEach items="${destinos}" var="destino">
<tr>
<td>${destino.id }</td>
<td>${destino.nome }</td>
<td>${destino.pais }</td>
<td>${destino.cidade }</td>
<td>${destino.estado }</td>

<td>
<a  class="btn btn-danger" href="DestinoDestroy?destinoId=${destino.id }">Deletar</a>
<a class="btn btn-warning" href="Update?destinoId=${destino.id }">Atualizar</a>

</td>
</tr>
</c:forEach>
</tbody>

</table>
<h5><a class="btn btn-primary" href = "index.html">Voltar</h5></a> 
</div>

</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>