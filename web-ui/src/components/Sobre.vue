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
    
        <!-- Sobre nós -->
        <div class="head">
            <h1>Sobre nós</h1><br>
            <p>Conheça mais sobre o App <i>Food Lovers</i> e todo seu processo de criação! </p>
        </div> 
        <div class="body-about">
            <b-row class="first d-flex justify-content-center">
                <b-col sm="6">
                    <img src="/static/img/logo.png" class="img-fluid" alt="">
                </b-col>
                <b-col sm="6">
                    <h4>Sobre <i>Food Lovers</i></h4>
                    <p>O aplicativo <i>Food Lovers</i> tem como objetivo permitir que vocês, usuários, possam interagir uns com os outros por meio de suas preferências culinárias em comum! Desse modo, ao reunir duas das necessidades mais básicas do ser humano: social e fisiológica, as interações serão mais dinâmicas, e sem dúvida, muito mais divertidas! Afinal, quem não gosta de comida, não é?</p>
                </b-col>
            </b-row>
        </div>
        <!-- END Sobre nós-->

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
        align-items: center;
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
    
    
    .body-about h4 {
        color: #2c3e50;
        font-size: 19px;
        font-family: 'Open Sans', sans-serif;
        font-weight: 500;
        letter-spacing: 1px;
        margin-top: 80px;
    }
    
    .body-about img {
       margin-left: 25px;
       margin-bottom: 25px;
    }
    
    .body-about p {
        color: #95a5a6;
        font-size: 17px;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300;
        
    }
    
    .body-about .first {
        border-bottom: 0.5px solid;
        border-bottom-color: #ecf0f1;
    }
    
    @media (max-width:570px) {
        .body-about img {
            margin-left: 10px;
        }
        
        .body-about h4 {
            margin-left: 10px;
            text-align: center;
        }
        
        .body-about p {
            margin-left: 10px;
            text-align: center;
        }
        
        .body-about .first {
        border-bottom: 0.5px solid;
        border-bottom-color: #ecf0f1;
        }
    }
    
</style>