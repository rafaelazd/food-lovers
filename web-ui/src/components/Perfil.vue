<template>
   <section id="inicio-cover">
       <div class="container">
       <!-- Navbar -->
        <nav-all></nav-all><br>
       <!-- END Navbar -->
   
       <!-- Nav -->
        <div class="nav nav-pills nav-fill">
            <div class="nav-item">
                <router-link class="nav-link" role="a" aria-pressed="true" to="/feed"><i class="fa fa-th" aria-hidden="true"></i></router-link>
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
        <div class="perfil" id="profile">
            <b-jumbotron>
                <div class="head-perfil">
                    <b-row class="pt1">
                        <h1>invisible</h1>
                    </b-row>
                    <div class="foto-margin">
                        <img src="/static/img/m7.png" class="img-fluid img-perfil" id="usuFoto" alt="">
                    </div>
                </div>
                <div class="body-perfil">
                         <h1>Thea Queen, 19</h1>
                         <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quas amet reprehenderit dicta mollitia asperiores numquam saepe!</p>
                         <dl class="row">
                              <dt class="col-sm-6 left"><i class="fa fa-user" aria-hidden="true"></i></dt>
                              <dd class="col-sm-6 right">theaqueen</dd>
                              
                              <dt class="col-sm-6 left"><i class="fa fa-map-marker" aria-hidden="true"></i></dt>
                              <dd class="col-sm-6 right"><a href="#">Curitiba - PR</a></dd>

                              <dt class="col-sm-6 left"><i class="fa fa-venus-mars" aria-hidden="true"></i></dt>
                              <dd class="col-sm-6 right">Feminino</dd>
                              
                         </dl>
                         <div class="preferencias">
                            <b-row>
                                <b-col cols="6" sm="6" md="2" xl="2" id="pref1"><img src="/static/img/batataico.png" class="img-fluid" alt=""></b-col>
                                <b-col cols="6" sm="6" md="3" xl="3" id="pref2"><img src="/static/img/pizzaico.png" class="img-fluid" alt=""></b-col>
                                <b-col cols="6" sm="6" md="2" xl="2" id="pref3"><img src="/static/img/macarraoico.png" class="img-fluid" alt=""></b-col>
                                <b-col cols="6" sm="6" md="3" xl="3" id="pref4"><img src="/static/img/nachosico.png" class="img-fluid" alt=""></b-col>
                                <b-col cols="12" sm="12" md="2" xl="2" id="pref5"><img src="/static/img/cafeico.png" class="img-fluid" alt=""></b-col>
                            </b-row>
                         </div>
                    </div>
            </b-jumbotron>
        </div>
        <!-- END Perfil Card -->

       </div>
  </section>
</template>


<script>
import axios from 'axios'
export default {
        data() {
            return {
                url1: '/usu-perfil',
            }
        },
        
        created() {
            this.buscarDados();  
        },

        methods: {
            buscarDados() {
                axios.get('http://localhost:8060/pessoas/1')
                    .then((resp) => {
                        this.erro = false;
                        console.log(resp.data)
                    })
                    .catch((err) => {
                        this.erro = true;
                        console.log(err)
                    });
            }
        }
}
</script>


<style>
    @import url('https://fonts.googleapis.com/css?family=Exo|Open+Sans:300,400|Raleway:200,300,400,700,800|Poiret+One|Open+Sans+Condensed:300,700|Anonymous+Pro:400,700');
    
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
        height: 100vh;
        left: 0px;
        padding-right: 10px;
        padding-left: 10px;
        overflow: auto;
    }
    
    .container nav {
        background-color: #34495e;
        max-width: none;
        min-width: 100vw;
        font-family: 'Exo', sans-serif;
    }
    .container {
        min-width: 100vw;
        left: 0px;
        padding-left: 0;
    }
    
    .jumbotron {
        background-color: #f9fbfc;
        margin-top: -15px;
    }
    
    .jumbotron h1{
        color: #34495e;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300;
        font-size: 39px;
        text-align: center;
        padding-top: 20px;
    }
    
    .jumbotron p {
        color: #7f8c8d;
        font-size: 18px;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300;
        padding-top: 20px;
        padding-bottom: 20px;
    }
    
    .jumbotron .body-perfil {
        background-color: white;
        padding: 10px;
        text-align: center;
        border-radius: 5px;
        border: 1px solid;
        border-color: #ecf0f1;
        justify-content: center;
        padding-bottom: 0px;
        margin-left: 10px;
        margin-right: 10px;
    }
    
    .jumbotron .preferencias {
        margin-top: 50px;
        padding: 10px;
    }
    
    .jumbotron .preferencias img {
        width: 100px;
        height: 100px;
    }
    
    .jumbotron .body-perfil .left {
        text-align: center;
        margin-top: 5px;
        margin-bottom: 5px;
        font-size: 25px;
        font-weight: 800;
        color: #2c3e50;
    }
    
    .jumbotron .body-perfil .right {
        margin-top: 5px;
        margin-bottom: 5px;
        text-align: center;
        font-size: 18px;
        border-left: 1px solid;
        border-left-color: #ecf0f1;
        font-family: 'Raleway', sans-serif;
    }
    
    .jumbotron .head-perfil{
        background-color: #f9fbfc;
        border-bottom-left-radius: 20px;
        border-bottom-right-radius: 20px;
        text-align: center;
        padding-bottom: 10px;
        margin-bottom: 20px;
        margin-top: -65px;
        width: 100%;
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
    
    @-webkit-keyframes Gradient2 {
        0% { background-position: 0% 50% }
        50% {background-position: 100% 50%}
        100% {background-position: 0% 50%}
    }

    @-moz-keyframes Gradient2 {
        0% {background-position: 0% 50%}
        50% {background-position: 100% 50%}
        100% {background-position: 0% 50%}
    }

    @keyframes Gradient2 {
        0% {background-position: 0% 50%}
        50% {background-position: 100% 50%}
        100% {background-position: 0% 50%}
    }
    
     .foto-margin #usuFoto {
        width: 390px;
        height: 390px;
        border: 15px solid;
        border-radius: 200px;
        border-color: white;
    }
    
    .foto-margin {
        margin-top: -200px;
    }
    
    @media (min-width: 222px) and (max-width: 331px) {
        .foto-margin #usuFoto {
        width: 210px;
        height: 210px;
        }
        
        .jumbotron {
        margin-top: 20px;
        }
    }
    
    @media (min-width: 332px) and (max-width: 436px) {
        .foto-margin #usuFoto {
        width: 300px;
        height: 300px;
        }
        
        .jumbotron {
        margin-top: 20px;
        }
    }
    @media (max-width: 575px) {
        .jumbotron {
        margin-top: 30px;
        }
    }
</style>
