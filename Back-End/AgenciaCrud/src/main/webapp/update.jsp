<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Atualizar|Update - Ag�ncia Viva Viagens</title>

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
  
    <a class="navbar-brand" href="#">Ag�ncia Viva Viagens</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
        
        <li class="nav-item">
          <a class="nav-link" href="home.html">Home</a>
        </li>
        
          <a class="nav-link active" aria-current="page" href="index.html">Destinos</a>
        </li>
       
   
        <li class="nav-item">
        
          <a class="nav-link" href="promocaoindex.html">Promo��es</a>
        </li>
      
      </ul>
      <form action="CreateFind" method="GET" class="d-flex">
        <input name="pesquisa" class="form-control me-2" type="search" placeholder="Pesquisar no Banco" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Pesquisar</button>
      </form>
    </div>
  </div>
</nav>
<br>
<div class="container">
<div class="row">
<div class="cold-md-7">
<hr>
<h3>Atualizar Dados</h3>
<hr>
<form action= "Update" method="POST">
<label>#Id</label>

<div class="form-floating mb-3">
<input value= "${destino.id}" name="id" type="number" readonly>

</div>
<div class="form-floating mb-3">
<input value= "${destino.nome}" name="nome" maxlenght="80" type "text" class="form-control" id="floatingInput1">
<label>Nome do Destino</label>

</div>

<div class="form-floating mb-3">
<input value= "${destino.pais}" name="pais"  maxlenght="80" type "text" class="form-control">
<label>Pa�s</label>

</div>

<div class="form-floating mb-3">
<input value= "${destino.cidade}" name="cidade"  maxlenght="80" type "text" class="form-control">
<label>Cidade</label>

</div>

<div class="form-floating mb-3">
<input value= "${destino.estado}"name="estado"  maxlenght="80" type "text" class="form-control" >
<label>Estado</label>

</div>




</div>

</div>
<button class="btn btn-success" type="submit">Alterar</button>
<a class="btn btn-info" href = "CreateFind">Voltar</h5></a> 

<button class="btn btn-secondary" type="reset">Limpar Tudo</button>
</div>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>