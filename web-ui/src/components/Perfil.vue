<template>
   <section id="inicio-cover">
       <div class="container">
       <!-- Navbar -->
        <nav class="navbar navbar-toggleable-md navbar-dark navbar-fixed-top d-flex justify-content-between">
                <b-nav-toggle target="nav_collapse"></b-nav-toggle>
                <img src="/static/img/foodlovers.png" width="158px">
                <router-link class="btn btn-outline-secondary" role="button" aria-pressed="true" to="/config"><i class="fa fa-cog" aria-hidden="true"></i></router-link>     
                <b-collapse is-nav id="nav_collapse">
                    <b-nav is-nav-bar>
                          <b-nav-item href="#"> Perfil</b-nav-item>
                          <b-nav-item href="#">Preferências</b-nav-item>
                          <b-nav-item href="#">Combinações</b-nav-item>
                    </b-nav>
                </b-collapse>
        </nav><br>
       <!-- END Navbar -->
   
       <!-- Back Button -->
        <div class="backset">
           <router-link class="btn btn-outline-secondary" role="button" aria-pressed="true" to="/inicio"><i class="fa fa-arrow-left" aria-hidden="true"></i> Voltar para Inicio</router-link> 
        </div>
        <!--END Back Button -->
    
        <!-- Perfil -->
        <div class="head">
            <h1>Alterando seus dados pessoais</h1> <br>
            <p>O que você deseja mudar em seu perfil?</p>
        </div> <br>
        <b-row>
            <b-col cols="3">
                    <b-nav vertical fill pills>
                      <b-nav-item active>Foto de Perfil</b-nav-item>
                      <b-nav-item>Dados Pessoais</b-nav-item>
                      <b-nav-item>E-mail</b-nav-item>
                      <b-nav-item>Usuário</b-nav-item>
                      <b-nav-item>Senha</b-nav-item>
                    </b-nav>
            </b-col>
            <b-col cols="9">
               <div class="body">
                       <h4>Foto atual:</h4>
                        <img src="/static/img/m7.png" id="usuFoto"> <br><br>
                        <b-form-file id="input2" v-model="file2" choose-label="Procurar" placeholder="Nenhum selecionado"></b-form-file><br><br>
                        <b-button type="submit" class="btn btn-outline-success float-left">Confirmar</b-button>
              </div>
            </b-col>
        </b-row>
        <!-- END Perfil-->

       </div>
  </section>
</template>


<script>
export default {
 data: {
    file: null,
    file2: null
  }
}
</script>


<style>
    @import url('https://fonts.googleapis.com/css?family=Exo|Open+Sans:300,400|Raleway:400,700,800|Poiret+One|Open+Sans+Condensed:300,300i');
    
    #inicio-cover {
        height: 100vh;
        width: 100vw;
        background-size: cover;
        display: flex;
    }
    
    .container nav {
        background-color: #34495e;
        max-width: none;
        min-width: 100vw;
        font-family: 'Exo', sans-serif;
    }
    
    .backset1 {
        margin: 20px;
        margin-left: 51px;
    }
    .head h1 {
        color: #2c3e50;
        font-size: 35px;
        font-family: 'Raleway', sans-serif;
        text-align: center;
    }
    
    .head p {
        color: #7f8c8d;
        font-size: 19px;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300;
        text-align: center;
    }
    
    .body {
        text-align: center
    }
    
    .body h4{
        color: #34495e;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300; 
        text-align: left;
        margin-left: 10px;
    }
</style>