<template>
   <section id="inicio-cover">
       <div class="container">
   <!-- Navbar -->
        <nav class="navbar navbar-toggleable-md navbar-dark navbar-fixed-top d-flex justify-content-between">
              <b-nav-toggle target="nav_collapse"></b-nav-toggle>
               <img src="/static/img/foodlovers.png" width="158px">
                <b-button class="btn btn-outline-secondary"><i class="fa fa-cog" aria-hidden="true"></i></b-button>    
                  <b-collapse is-nav id="nav_collapse">
                    <b-nav is-nav-bar>
                          <b-nav-item href="#">Perfil</b-nav-item>
                          <b-nav-item href="#">Preferências</b-nav-item>
                          <b-nav-item href="#">Combinações</b-nav-item>
                    </b-nav>
                </b-collapse>
        </nav> <br>
   <!-- END Navbar -->
   
   <!-- Nav -->
    <div class="nav nav-pills nav-fill">
        <div class="nav-item">
            <a class="nav-link" href="#"><i class="fa fa-camera" aria-hidden="true"></i></a>
        </div><div class="nav-item">
            <a class="nav-link active" href="#"><i class="fa fa-heart" aria-hidden="true"></i></a>
        </div>
        <div class="nav-item">
            <a class="nav-link" href="#"><i class="fa fa-comments" aria-hidden="true"></i></a>
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
                        <h1>Kali Meinar, 23</h1>
                        <p><i class="fa fa-map-marker" aria-hidden="true"></i>  São Paulo, SP - Brasil</p>
                        <h6>Lorem ipsum dolor sit amet, consectetur adipisicing elit. </h6>
                        <h2>
                        <img src="/static/img/batataico.png" alt="icoFrituras" width="50px" height="50px">
                        <img src="/static/img/boloico.png" alt="icoDoces" width="50px" height="50px">
                        <img src="/static/img/cafeico.png" alt="icoBebidasHot" width="50px" height="50px">
                        <img src="/static/img/icosand.png" alt="icoLanches" width="50px" height="50px">
                        <img src="/static/img/pizzaico.png" alt="icoPizza" width="50px" height="50px">
                        </h2>
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
    @import url('https://fonts.googleapis.com/css?family=Exo|Raleway:400,700,800');
    
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
    
    .container{
        width: 100vw;
        height: 100vh;
    }
    
    
    .container nav {
        background-color: #34495e;
        display: block;
        transform: translate(-9.4%);
        width: 100vw;
        margin-right: 0;
        left: 0;
        font-family: 'Exo', sans-serif;
    }
    
    .container .profile {
        width: 280px;
        height: 450px;
        background-color: #ecf0f1;
        border-style: hidden;
        box-sizing: border-box;
        border-radius: 10px;
        overflow: hidden;
        box-shadow: 0 20px 20px rgba(0,0,0,.2);
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
   
    .container b-card {
       height: 100%;
       width: 100%;
       background-image: url(/static/img/m5.jpg);
    }
    
    #collapse2 {
        background-color: #f7f7f7;
        border-style: hidden;
        border-radius: 3px;
        overflow: hidden;
        box-shadow: 0 30px 20px rgba(0,0,0,.2);
        text-align: center;
        padding: 13px;
    }
    #collapse2 h1 {
        font-family: 'Raleway:400', sans-serif;
         padding: 7px;
    }
    #collapse2 h6 {
        font-family: 'Raleway', sans-serif;
        font-size: 15px;
         padding: 7px;
    }
    #collapse2 p {
        font-family: 'Raleway', sans-serif;
        color: #3498db;
        border-bottom: 0.5px solid;
        border-bottom-color: #bdc3c7;
        border-top: 0.5px solid;
        border-top-color: #bdc3c7;
        text-align: justify;
        padding: 7px;
    }
    #collapse2 h2 {
        color: #3498db;
        border-top: 0.5px solid;
        border-top-color: #bdc3c7;
        text-align: center;
        padding: 7px;
    }
  
    
</style>
