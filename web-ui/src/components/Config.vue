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
    
        <!-- Config Card -->
        <div class="config-buttons">
            <b-row>
                <b-col class="left">
                   <router-link class="btn btn-outline-primary" role="button" aria-pressed="true" to="/perfil"><h1><i class="fa fa-user" aria-hidden="true"></i></h1><p>Perfil</p></router-link>  
                </b-col>
                <b-col class="right">
                     <router-link class="btn btn-outline-danger" role="button" aria-pressed="true" to="/inicio"><h1><i class="fa fa-heart" aria-hidden="true"></i></h1><p>Preferências</p></router-link> 
                </b-col>
                <div class="w-100"></div>
                <b-col class="left">
                     <router-link class="btn btn-outline-warning" role="button" aria-pressed="true" to="/duvidas"><h1><i class="fa fa-question" aria-hidden="true"></i></h1><p>Envie-nos suas dúvidas</p></router-link> 
                </b-col>
                <b-col class="right">
                     <router-link class="btn btn-outline-info" role="button" aria-pressed="true" to="/sobre"><h1><i class="fa fa-info-circle" aria-hidden="true"></i></h1><p>Sobre nós</p></router-link> 
                </b-col>
            </b-row>
        </div>
        <!-- END Config Card -->

       </div>
  </section>
</template>


<script>


</script>


<style>
    @import url('https://fonts.googleapis.com/css?family=Exo|Raleway:400,700,800|Poiret+One|Open+Sans+Condensed:300,300i');
    
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
    
    .backset {
        margin: 20px;
        margin-left: 51px;
    }
    
    .config-buttons {
        max-height: none;
        margin: 0;
        padding: 15px; 
        text-align: center;
    }
    .config-buttons .col .btn {
        height: 100%;
        width: 100%;
        border-radius: 10px;
        border-color: transparent;
    }
    
    .config-buttons .col .btn p {
        font-size: 18px;
        letter-spacing: 2.5px;
        font-family: 'Open Sans', sans-serif;
        margin-bottom: 50px;
    }
    
    .config-buttons .col .btn .fa {
        font-size: 180px;
        padding: 50px;
    }
    
    @media (max-width: 630px) {
        .config-buttons .col {
        border-bottom: 1px solid;
        border-bottom-color: #ecf0f1;
        }
    }
    
</style>