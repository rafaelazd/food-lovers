<template>
   <section id="inicio-cover">
       <div class="container">
       <!-- Navbar -->
        <nav class="navbar navbar-toggleable-md navbar-dark navbar-fixed-top d-flex justify-content-between">
            <b-nav-toggle target="nav_collapse"></b-nav-toggle>
            <img src="/static/img/foodlovers.png" width="158px"> 
            <router-link class="btn btn-outline-secondary" role="button" aria-pressed="true" to="/config"><i class="fa fa-cog" aria-hidden="true"></i></router-link>
                <b-collapse is-nav id="nav_collapse">
                   <b-row>
                       <b-col><img src="/static/img/heart.png" alt="" width="160px" height="160px"></b-col>
                   </b-row>
                 </b-collapse>
             </nav> <br>
       <!-- END Navbar -->
   
       <!-- Nav -->
        <div class="nav nav-pills nav-fill">
            <div class="nav-item">
            <router-link class="nav-link" role="a" aria-pressed="true" to="/feed"><i class="fa fa-camera" aria-hidden="true"></i></router-link>
            </div>
            <div class="nav-item">
            <router-link class="nav-link" role="a" aria-pressed="true" to="/inicio"><i class="fa fa-heart" aria-hidden="true"></i></router-link>
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
    
</style>
