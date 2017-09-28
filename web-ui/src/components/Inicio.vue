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
    <div class="row justify-content-center align-items-center">
        <div class="profile" id="idUsuario">
            <img src="/static/img/m5.jpg" class="img-fluid" alt="Usuario">
                <b-button-group>
                    <b-button><i class="fa fa-times" aria-hidden="true"></i></b-button>
                    <b-button><i class="fa fa-info-circle" aria-hidden="true"></i></b-button>
                    <b-button><i class="fa fa-check" aria-hidden="true"></i></b-button>
                </b-button-group>
        </div>
    </div>
    <!-- END Perfil Card -->

       </div>
  </section>
</template>


<script>


</script>


<style>
    @import url('https://fonts.googleapis.com/css?family=Exo:200');
    
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
        width: 300px;
        height: 450px;
        background-color: #ecf0f1;
        border-style: hidden;
        vertical-align: middle;
        text-align: center;
        box-sizing: border-box;
        border-radius: 10px;
        overflow: hidden;
        box-shadow: 0 20px 20px rgba(0,0,0,.2);
        
    }
    
</style>
