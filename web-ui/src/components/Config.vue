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
        <div class="backset float-left">
           <router-link class="btn btn-outline-secondary" role="button" aria-pressed="true" to="/inicio"><i class="fa fa-arrow-left" aria-hidden="true"></i> Voltar para Inicio</router-link> 
        </div> <br><br><br>
        <!--END Back Button -->
    
        <!-- Config Card -->
        <div class="config-buttons">
            <b-row>
            <b-col cols="6">
                <router-link class="btn btn-outline-primary" id="btn-profile" role="button" aria-pressed="true" to="#"><i class="fa fa-user" aria-hidden="true"></i></router-link>
                <b-tooltip target="btn-profile" title="Personalizar perfil"></b-tooltip>
            </b-col>
            <b-col cols="6">
                <router-link class="btn btn-outline-warning" id="btn-prefers" role="button" aria-pressed="true" to="#"><i class="fa fa-cutlery" aria-hidden="true"></i></router-link>
                <b-tooltip target="btn-prefers" title="Configurar preferências"></b-tooltip>
            </b-col>
        </b-row>
        <b-row>
            <b-col cols="6">
                <router-link class="btn btn-outline-danger"id="btn-FAQ" role="button" aria-pressed="true" to="#"><i class="fa fa-question" aria-hidden="true"></i></router-link>
                <b-tooltip target="btn-FAQ" title="Envie-nos um feedback"></b-tooltip>
            </b-col>
            <b-col cols="6">
                <router-link class="btn btn-outline-info" id="btn-sobre-nos" role="button" aria-pressed="true" to="#"><i class="fa fa-info" aria-hidden="true"></i></router-link>
                <b-tooltip target="btn-sobre-nos" title="Sobre nós"></b-tooltip> 
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
    
    .backset {
        margin: 20px;
        margin-left: 51px;
    }
    
    .config-buttons {
        background-size: cover;
        max-height: none;
        margin: 0;
        padding: 15px; 
        text-align: center;
    }
    
    .config-buttons .btn{
        width: 350px;
        height: 250px;
        margin: 40px;
        text-align: center;
        vertical-align: middle;
        border-radius: 20px; 
        border: 2.4px solid;
    }
    .config-buttons i{
        margin:25%;
        font-size: 85px;
    }
    
    .config-buttons span{
        font-size: 30px;
        text-transform: uppercase;
    }
</style>