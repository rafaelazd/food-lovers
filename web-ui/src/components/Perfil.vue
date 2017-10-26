<template>
   <section id="inicio-cover">
       <div class="container">
       <!-- Navbar -->
        <nav-all></nav-all><br>
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
        <div class="perfil">
            <b-jumbotron>
                <div class="head-perfil">
                    <b-row class="pt1">
                        <h1>invisible</h1>
                    </b-row>
                    <img src="/static/img/m7.png" class="img-fluid" id="usuFoto" alt="">
                        <h1>Thea Queen</h1>
                         <div class="w-100"></div>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quas amet reprehenderit dicta mollitia asperiores numquam saepe!.</p>
                    <div class="body-perfil">
                        <b-card class="details" title="Sobre">
                          <dl class="row">
                              <dt class="col-sm-3"><i class="fa fa-map-marker" aria-hidden="true"></i></dt>
                              <dd class="col-sm-9"><u>Curitiba - PR</u></dd>

                              <dt class="col-sm-3"><i class="fa fa-birthday-cake" aria-hidden="true"></i></dt>
                              <dd class="col-sm-9">19 anos</dd>

                              <dt class="col-sm-3"><i class="fa fa-venus-mars" aria-hidden="true"></i></dt>
                              <dd class="col-sm-9">Feminino</dd>
                         </dl>
                        </b-card>
                    </div>
                </div>
             <!--
              <b-row>
                 <b-col class="d-flex justify-content-center">
                     <img src="/static/img/m7.png" id="usuFoto" class="" alt="">
                 </b-col>
                 <b-col>
                      <h1 class="display-3">Thea Queen</h1>
                      <blockquote class="blockquote">
                       <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Asperiores impedit itaque praesentium voluptatibus, obcaecati harum excepturi et pariatur consequuntur quibusdam. Recusandae eaque, iste ipsam nostrum voluptate, tempora tempore. Quasi, consequuntur!</p>
                      </blockquote>
                      <div class="details">
                       <b-row>
                            <b-col class="atributos">
                                <p>Local</p> <br>
                                <p>Idade</p> <br>
                                <p>Sexo</p> <br>
                            </b-col>
                            <b-col class="dados-atributos">
                                <p>Curitiba - PR</p><br>
                                <p>19 anos</p><br>
                                <p>Feminino</p><br>
                            </b-col>
                        </b-row>
                      </div>
                 </b-col>
              </b-row>
-->
            </b-jumbotron>
        </div>
        <!-- END Perfil Card -->

       </div>
  </section>
</template>


<script>
export default {
    data() {
        return {
            url1: '/usu-perfil',
        }
    }
}
</script>


<style>
    @import url('https://fonts.googleapis.com/css?family=Exo|Open+Sans:300,400|Raleway:400,700,800|Poiret+One|Open+Sans+Condensed:300,700|Anonymous+Pro:400,700');
    
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
    
    .jumbotron {
        background-color: #fcfcfc;
        box-shadow: 10px 10px 15px #7f8c8d;
    }
    
    .jumbotron h4{
        color: #34495e;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300;
        font-size: 39px;
        text-align: left;
    }
    
    .jumbotron p {
        color: #7f8c8d;
        font-size: 18px;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300;
        margin-left: 5px;
    }
    
    .jumbotron .details {
        background-color: white;
        padding: 10px;
        border-radius: 5px;
        box-shadow: 8px 4px 10px #7f8c8d;
        justify-content: center;
        padding-bottom: 0px;
        margin: 70px;
    }
    
    .jumbotron .details .col-sm-3 {
        text-align: center;
        margin-top: 5px;
        margin-bottom: 5px;
        font-size: 25px;
        font-weight: 800;
        color: #2c3e50;
    }
    
    .jumbotron .details .col-sm-9 {
        margin-top: 5px;
        margin-bottom: 5px;
        text-align: center;
        font-size: 18px;
        border-left: 1px solid;
        border-left-color: #ecf0f1;
    }
    
    .jumbotron .head-perfil{
        background-color: #f9fbfc;
        border-bottom-left-radius: 20px;
        border-bottom-right-radius: 20px;
        text-align: center;
        padding-bottom: 10px;
        margin-bottom: 20px;
    }
    
    .jumbotron .head-perfil .pt1{
        justify-content: center;
        border-bottom: 15px solid;
        border-bottom-color: white;
        border-top-left-radius: 20px;
        border-top-right-radius: 20px;
        height: 250px;
    }
    
    .jumbotron .head-perfil .pt1 h1{
        visibility: hidden;
    }
    
    .jumbotron .head-perfil .pt1{
      background: linear-gradient(-45deg, #EE7752, #E73C7E, #23A6D5, #23D5AB);
      background-size: 400% 400%;
      -webkit-animation: Gradient 15s ease infinite;
	  -moz-animation: Gradient 15s ease infinite;
	  animation: Gradient 15s ease infinite;
    }

    @-webkit-keyframes Gradient {
        0% { background-position: 0% 50% }
        50% {background-position: 100% 50%}
        100% {background-position: 0% 50%}
    }

    @-moz-keyframes Gradient {
        0% {background-position: 0% 50%}
        50% {background-position: 100% 50%}
        100% {background-position: 0% 50%}
    }

    @keyframes Gradient {
        0% {background-position: 0% 50%}
        50% {background-position: 100% 50%}
        100% {background-position: 0% 50%}
    }
    
     #usuFoto {
        width: 390px;
        height: 390px;
        border: 15px solid;
        border-radius: 200px;
        border-color: white;
        margin-top: -200px;
    }
</style>
