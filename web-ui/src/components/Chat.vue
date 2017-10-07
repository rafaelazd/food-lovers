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
        </nav><br>
       <!-- END Navbar -->
   
       <!-- Nav -->
        <div class="nav nav-pills nav-fill">
            <div class="nav-item">
            <router-link class="nav-link" role="a" aria-pressed="true" to="/usuario-nao-autenticado"><i class="fa fa-camera" aria-hidden="true"></i></router-link>
            </div>
            <div class="nav-item">
            <router-link class="nav-link" role="a" aria-pressed="true" to="/inicio"><i class="fa fa-heart" aria-hidden="true"></i></router-link>
            </div>
            <div class="nav-item">
            <router-link class="nav-link active" role="a" aria-pressed="true" to="/chat"><i class="fa fa-comments" aria-hidden="true"></i></router-link>
            </div>
        </div> <br>    
        <!--END Nav -->
    
        <!-- Perfil Card -->
        <div class="row justify-content-center">
            <div class="app">
               <div class="head clearfix">
                   <span class="messages-notification">
                       <i class="fa fa-comments-o"></i>
                       <span class="count">2</span>
                   </span>
                   <span class="title">Mensagens</span>
               </div>
               <div class="search-bar">
                   <b-input-group>
                    <b-form-input v-model="search" type="search" class="ip-search" placeholder="Procurar..."></b-form-input>
                    <button class="btn btn-secondary input-group-addon"><i class="fa fa-search"></i></button>
                  </b-input-group>
               </div>
               <div class="body">
                   <div class="friend-list d-flex justify-content-around">
                       <div class="idUsuario">
                           <button id="usuFoto" class="btn btn-secondary float-left"></button> <br> <p>Mirella</p>
                       </div>
                       <div class="idUsuario">
                           <button id="usuFoto2" class="btn btn-secondary float-left"></button> <br> <p>Yudi</p>
                       </div>
                        <div class="idUsuario">
                           <button id="usuFoto3" class="btn btn-secondary float-left"></button> <br> <p>Karol</p>
                       </div>
                   </div>
               </div>
            </div>
        </div>
        <!-- END Perfil Card -->

       </div>
  </section>
</template>

<script>
</script>


<style>
     @import url('https://fonts.googleapis.com/css?family=Exo|Raleway:400,700,800|Poiret+One|Open+Sans|Open+Sans+Condensed:300');
    
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
    
    .container nav {
        background-color: #34495e;
        display: block;
        transform: translate(-9.4%);
        width: 100vw;
        margin-right: 0;
        left: 0;
        font-family: 'Exo', sans-serif;
    }
    
     .app {
        width: 280px;
        height: 450px;
        background-color: #ecf0f1;
        border-radius: 10px;
        box-shadow: 10px 20px 20px rgba(0,0,0,.5);
        position: relative;
        
    }
    
    .app:before {
        content: '';
        position: absolute;
        left: 0;
        width: 100%;
        height: 100px;
        display: inline-block;
        z-index: 0;
    }
    
    .app:after {
        content: '';
        position: absolute;
        left: 0;
        width: 100%;
        height: 100px;
        display: inline-block;
        bottom: 0;
        z-index: 0;
    }
    
    .app .head {
        z-index: 1;
        position: relative;
        display: block;
        width: 100%;
        height: 50px;
        line-height: 48px;
        text-align: center;
        text-transform: uppercase;
        letter-spacing: 2px;
        color: #fff;
        background-color: #34495e;
        box-shadow: inset 0 -15px 35px -5px rgba(0,0,0,0.3);
        
    }
    
    .head span.title {
        position: absolute;
        width: 100%;
        display: inline-block;
        left: 0;
        font-size: 15px;
        font-weight: 500;
        margin-top: 2px;
        color: #fff;
    }
    
    .head span.messages-notification {
        position: relative;
        float: left;
        font-size: 15px;
        font-weight: normal;
        padding-left: 20px;
        color: white;
        padding-top: 2px;
        
    }
    
    .head span.messages-notification span.count {
        position: absolute;
        font-size: 10px;
        width: 17px;
        height: 17px;
        display: inline-block;
        background-color: #e74c3c;
        line-height: 17px;
        border-radius: 100%;
        margin-top: -40px;  
    }
    
    .clearfix::after {
        content: '';
        clear: both;
        display: table;
    }
    
    .search-bar {
        padding: 10px;
        text-align: center;
        z-index: 1;
    }
    
    .search-bar .ip-search {
        border-radius: 20px;
    }
    
    .search-bar .input-group-addon {
        border-top-right-radius: 20px;
        border-bottom-right-radius: 20px;
    }
    
    #usuFoto {
        width: 65px;
        height: 65px;
        border-radius: 50px;
        background-image: url(/static/img/M2.2.jpg);
        background-size: cover;
    }
    
    #usuFoto2 {
        width: 65px;
        height: 65px;
        border-radius: 50px;
        background-image: url(/static/img/H1.jpg);
        background-size: cover;
    }
    
    #usuFoto3 {
        width: 65px;
        height: 65px;
        border-radius: 50px;
        background-image: url(/static/img/M1.7.jpg);
        background-size: cover;
    }
    
    .friend-list {
        margin-top:5px;
        display: inline;
    }
    
    .friend-list p {
        font-family: 'Open Sans Condensed', sans-serif;
        color: #2c3e50;
        border-bottom: 0.2px solid;
        border-bottom-color: #ecf0f1;
        border-top: 0.2px solid;
        border-top-color: #ecf0f1;
        font-size: 18px;
        text-align:center;
        padding: 7px;
    }
    
    
</style>