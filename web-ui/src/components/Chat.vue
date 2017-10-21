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
            <router-link class="nav-link" role="a" aria-pressed="true" to="/inicio"><i class="fa fa-heart" aria-hidden="true"></i></router-link>
            </div>
            <div class="nav-item">
            <router-link class="nav-link active" role="a" aria-pressed="true" to="/chat"><i class="fa fa-comments" aria-hidden="true"></i></router-link>
            </div>
        </div> <br>    
        <!--END Nav -->
    
        <!-- Chat Card -->
        <div class="chat">
            <b-row class="head d-inline-flex justify-content-around">
                <b-col style="padding-top:10px"><span><i class="fa fa-comments" aria-hidden="true"></i></span><count>3</count></b-col>
                <b-col style="padding-top:10px"><span>Mensagens</span></b-col>
                <b-col style="padding-top:3px"><b-btn v-b-toggle="'collapse-friend-list'" class="m-1"><i class="fa fa-address-book" aria-hidden="true"></i></b-btn></b-col>
            </b-row>
            
            <b-collapse id="collapse-friend-list" class="mt-2">
                   <div class="agenda">
                    <b-row class="d-flex justify-content-around">
                        <b-col class="contatos">
                            <img id="usuFoto" src="/static/img/H1.4.jpg" class="img-fluid"><br>
                            <span id="usuNome">Mateus Takeda</span>
                        </b-col>
                        <b-col class="contatos">
                            <img id="usuFoto" src="/static/img/H2.4.jpg" class="img-fluid"><br>
                            <span id="usuNome">Heron Dias</span>
                        </b-col>
                    </b-row>
                    <b-row class="d-flex justify-content-around">
                        <b-col class="contatos">
                            <img id="usuFoto" src="/static/img/M3.jpg" class="img-fluid"><br>
                            <span id="usuNome">Eva Miranda</span>
                        </b-col>
                        <b-col class="contatos">
                            <img id="usuFoto" src="/static/img/M4.jpg" class="img-fluid"><br>
                            <span id="usuNome">Raquel Salvatori</span>
                        </b-col>
                    </b-row>
                    <b-row class="d-flex justify-content-around">
                        <b-col class="contatos">
                            <img id="usuFoto" src="/static/img/M1.3.jpg" class="img-fluid"><br>
                            <span id="usuNome">Sofia Alter</span>
                        </b-col>
                        <b-col class="contatos">
                            <img id="usuFoto" src="/static/img/M2.jpg" class="img-fluid"><br>
                            <span id="usuNome">Maria Rosa</span>
                        </b-col>
                    </b-row>
                    </div>
            </b-collapse>
            
            <div class="search-bar">
                   <b-input-group>
                    <b-form-input v-model="search" type="search" class="ip-search" placeholder="Procurar..."></b-form-input>
                    <button class="btn btn-secondary input-group-addon"><i class="fa fa-search"></i></button>
                  </b-input-group>
            </div>
            
            <div class="conversas">
                <div class="msg-preview" id="idUsuario">
                <a href="Inicio.vue"><b-row>
                    <b-col><img id="usuFoto" src="/static/img/M4.jpg" class="img-fluid"></b-col>
                    <b-col cols="8">
                      <div class="msg-head"><span id="usuNome">Raquel Salvatori</span></div><br>
                      <div class="msg-body"><p>Oieeee</p></div></b-col>
                </b-row></a>
                </div>
                <div class="msg-preview" id="idUsuario">
                 <b-row>
                    <b-col><img id="usuFoto" src="/static/img/M2.jpg" class="img-fluid"></b-col>
                    <b-col cols="8">
                      <div class="msg-head"><span id="usuNome">Maria Rosa</span></div><br>
                      <div class="msg-body"><p>Tudo bem?</p></div></b-col>
                </b-row>
                </div>
                <div class="msg-preview" id="idUsuario">
                 <b-row>
                    <b-col><img id="usuFoto" src="/static/img/H1.4.jpg" class="img-fluid"></b-col>
                    <b-col cols="8">
                      <div class="msg-head"><span id="usuNome">Mateus Takeda</span></div><br>
                      <div class="msg-body"><p>Que bom! :D</p></div></b-col>
                </b-row>
                </div>
            </div>
        </div>
        <!-- END Chat Card -->

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
    
    .container {
        min-width: 100vw;
        height: 100vh;
        left: 0px;
        padding-left: 0;
        overflow: auto;
    }
    .container nav {
        background-color: #34495e;
        max-width: none;
        min-width: 100vw;
        font-family: 'Exo', sans-serif;
    }
    
    .chat {
        background-color: #f9f9f9;
        background-size: cover;
        max-height: none;
        margin: 0;
    }
    
    .chat .head {
        text-align: center;
        text-transform: uppercase;
        font-weight: 400;
        letter-spacing: 2px;
        font-size: 17.5px;
        color: #34495e;
        padding: 10px;
        width: 100%;
        border-bottom: 0.2px solid;
        border-bottom-color: #bdc3c7;
    }
    
    .chat .head .m-1 {
        background-color: transparent;
        color: #34495e;
        border: 0px; 
    }
    
    .chat .head .m-1:hover {
        border: 0px;    
    }
    
    .search-bar {
        padding: 10px;
        text-align: center;
        z-index: 1;
    }
    
    .search-bar .ip-search {
        border-radius: 20px;
        width: 100%;
        height: 40px; 
        margin-top: 10px;
        margin-left: 10px;
        margin-bottom: 10px;
    }
    
    .search-bar .input-group-addon {
        border-top-right-radius: 20px;
        border-bottom-right-radius: 20px;
        margin-top: 10px;
        margin-bottom: 10px;
        margin-right: 10px;
    }
    
    #collapse-friend-list {
        background-color: #fff;
        padding: 10px;
        max-height: 100%;
        max-width: 100%;
        margin-left: 0px;
    }
    
    #collapse-friend-list .contatos {
        text-align: center;
        width: 100%;
        padding: 20px;
        border-bottom: 0.8px solid;
        border-bottom-color: #bdc3c7;
        border-left: 0.8px solid;
        border-left-color: #bdc3c7;
}

    #collapse-friend-list img {
        border-radius: 100%;
        width: 150px;
        height: 150px;
}
    
    #collapse-friend-list .contatos span {
        vertical-align: text-bottom;
        text-align: center;
        text-transform: uppercase;
        color: #4c4d4f;
        font-weight: 500;
}
    
    .conversas .msg-preview {
        width: 100%;
        max-height: 150px;
        background-color: #fff;
        border-radius: 10px;
        margin-top: 10px;
    }
    
    .conversas .msg-preview img {
        width: 120px;
        height: 120px;
        text-align:center; 
        padding:10px;
    }
    
    .conversas .msg-preview .msg-head{
        font-weight: 500;
        margin-top: 20px;
        text-transform: uppercase;
        color: #2c3e50;
    }
    
    .conversas .msg-preview .msg-body{
        font-weight: 400;
        color: #7f8c8d;
    }
    
    .conversas .msg-preview .btn{
        margin-top: 35px;
    }
    
    @media (min-width: 576px) {
        .chat {
        box-shadow: 10px 20px 20px rgba(0,0,0,.5);
        margin: 30px;
        border-radius: 15px;
        }
    } 
    
    @media (max-width: 576px) {
        .chat {
        width: 100vw;
        border-radius: 5px;
        }
        
        #usuFoto {
        width: 110px;
        height: 120px;
        padding-left: 0px;
        }
        

        .conversas .msg-preview #usuFoto {
            width: 130px;
            height: 100px;
            float: left;
            padding: 5px;
        }
        
        
    } 
    
</style>