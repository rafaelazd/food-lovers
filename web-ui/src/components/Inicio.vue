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
   
       <!-- Nav -->
        <div class="nav nav-pills nav-fill">
            <div class="nav-item">
            <router-link class="nav-link" role="a" aria-pressed="true" to="/feed"><i class="fa fa-camera" aria-hidden="true"></i></router-link>
            </div>
            <div class="nav-item">
            <router-link class="nav-link active" role="a" aria-pressed="true" to="/inicio"><i class="fa fa-heart" aria-hidden="true"></i></router-link>
            </div>
            <div class="nav-item">
            <router-link class="nav-link" role="a" aria-pressed="true" to="/chat"><i class="fa fa-comments" aria-hidden="true"></i></router-link>
            </div>
        </div> <br>    
        <!--END Nav -->
    
        <!-- Perfil Card -->
        <div class="row justify-content-center">
            <div>
               <b-card-group>
                    <b-card class="profile">
                        <div slot="footer" class="d-flex justify-content-around">
                            <b-button class="btn btn-circle btn-danger"><i class="fa fa-times" aria-hidden="true"></i></b-button>
                            <b-button v-b-toggle="'collapse2'" class="btn btn-circle btn-info m-1"><i class="fa fa-info-circle" aria-hidden="true"></i></b-button>
                            <b-button class="btn btn-circle btn-success"><i class="fa fa-check" aria-hidden="true"></i></b-button> 
                        </div>
                        <b-collapse id="collapse2">
                            <b-button v-b-toggle="'collapse2'" class="btn btn-circle btn-times btn-danger float-left m-1"><i class="fa fa-times" aria-hidden="true"></i></b-button><br>
                            <h1>Kali Meinar, 23</h1>
                            <p><i class="fa fa-map-marker" aria-hidden="true"></i>  São Paulo, SP - Brasil</p>
                            <h6>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab saepe fugiat nesciunt laboriosam nemo quasi alias sit. Consequatur, quam debitis quibusdam eveniet sapiente. </h6>
                            <p>
                            <img src="/static/img/batataico.png" alt="icoFrituras" width="40px" height="40px">
                            <img src="/static/img/boloico.png" alt="icoDoces" width="40px" height="40px">
                            <img src="/static/img/cafeico.png" alt="icoBebidasHot" width="40px" height="40px">
                            <img src="/static/img/icosand.png" alt="icoLanches" width="40px" height="40px">
                            <img src="/static/img/pizzaico.png" alt="icoPizza" width="40px" height="40px">
                            </p>
                            <p>
                            <b-button class="btn btn-sm btn-info"><i class="fa fa-rss" aria-hidden="true"></i> Seguir</b-button>
                            <b-button class="btn btn-sm btn-secondary" href="#"><i class="fa fa-id-card-o" aria-hidden="true"></i> Ver Perfil</b-button>
                            </p>
                      </b-collapse>
                    </b-card>
                </b-card-group>
            </div>
        </div>
        <!-- END Perfil Card -->

       </div>
  </section>
</template>


<script>


</script>


<style>
    @import url('https://fonts.googleapis.com/css?family=Exo|Raleway:400,700,800|Poiret+One');
    
    #inicio-cover {
        height: 100vh;
        width: 100vw;
        background-size: cover;
        display: flex;
        -webkit-background-size: cover;
        -moz-background-size: cover;
        -o-background-size: cover;
        background-size: cover;
    }
    
    .container {
        min-width: 100vw;
        left: 0px;
        padding-left: 0;
    }
    .container nav {
        background-color: #34495e;
        max-width: none;
        min-width: 100vw;
        font-family: 'Exo', sans-serif;
    }
    
    .container .profile {
        width: 280px;
        height: 450px;
        background-color: #ecf0f1;
        border-style: hidden;
        box-sizing: border-box;
        border-radius: 15px;
        overflow: hidden;
        box-shadow: 10px 20px 20px rgba(0,0,0,.5);
        background-image: url('/static/img/m5.jpg');
        background-size: cover;
        align-content: stretch;
        
    }
    .container .profile .btn-circle {
        width: 45px;    
        height: 45px;
        vertical-align: bottom;
        font-size: 12px;
        border-radius: 25px;
        
    }
    
    .container .profile .btn-times {
        width: 20px;    
        height: 20px;
        font-size: 9px;
        text-align: center;
        border-radius: 25px;
        padding: 2px;
        margin-left: 4px;
        margin-top: 2px;
        
    }
    
    .container .profile .btn-sm {
        border-radius: 15px;
        
    }
    
    #collapse2 {
        background-color: #f7f7f7;
        border-radius: 15px;
        overflow: hidden;
        box-shadow: 0 30px 30px rgba(0,0,0,.6);
        text-align: center;
        max-height: 450px;
    }
    #collapse2 h1 {
        font-family: 'Poiret One', cursive;
        padding: 7px;
        font-size: 40px;
    }
    #collapse2 h6 {
        font-family: 'Raleway', sans-serif;
        font-size: 15px;
        padding: 7px;
    }
    #collapse2 p {
        font-family: 'Raleway', sans-serif;
        color: #3498db;
        border-bottom: 0.2px solid;
        border-bottom-color: #ecf0f1;
        border-top: 0.2px solid;
        border-top-color: #ecf0f1;
        text-align: center;
        padding: 7px;
    }
  
    
</style>
