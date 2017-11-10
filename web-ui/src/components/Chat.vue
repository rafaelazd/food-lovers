<template>
    <section id="inicio-cover">
       <div class="container">
       <!-- Navbar -->
        <nav-all></nav-all> <br>
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
            <router-link class="nav-link active" role="a" aria-pressed="true" to="/chat"><i class="fa fa-comments" aria-hidden="true"></i></router-link>
            </div>
        </div> <br>    
        <!--END Nav -->
    
        <!-- Chat Card -->
        <div class="chat">
            <b-row class="head d-inline-flex justify-content-around">
                <b-col style="padding-top:10px"><span><i class="fa fa-comments" aria-hidden="true"></i></span></b-col>
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
                    <b-form-input type="search" class="ip-search" placeholder="Procurar..."></b-form-input>
                    <button class="btn btn-secondary input-group-addon"><i class="fa fa-search"></i></button>
                  </b-input-group>
            </div>
            
            <div class="conversas">
                <div class="msg-preview" id="idUsuario">
                    <b-button variant="light" class="btn-block" v-on:click="showhide">
                        <b-row>
                            <b-col cols="2"><img id="usuFoto" src="/static/img/M4.jpg" class="img-fluid"></b-col>
                            <b-col cols="10"><p id="usuNome">Raquel Salvatori</p></b-col>
                        </b-row>
                    </b-button>
                </div>
                <div class="msg-preview" id="idUsuario">
                    <b-button variant="light" class="btn-block" v-on:click="showhide">
                        <b-row>
                            <b-col cols="2"><img id="usuFoto" src="/static/img/M2.jpg" class="img-fluid"></b-col>
                            <b-col cols="10"><p id="usuNome">Maria Rosa</p></b-col>
                        </b-row>
                    </b-button>
                </div>
                <div class="msg-preview" id="idUsuario">
                 <b-button variant="light" class="btn-block" v-on:click="showhide">
                        <b-row>
                            <b-col cols="2"><img id="usuFoto" src="/static/img/H1.4.jpg" class="img-fluid"></b-col>
                            <b-col cols="10"><p id="usuNome">Mateus Takeda</p></b-col>
                        </b-row>
                    </b-button>
                </div>
            </div>
            <div v-if="isConnected"class="message-box" id="message-box">
                <ul id="messages"></ul>
                <form action="">
                  <input id="m" autocomplete="off" /><b-button class="btn btn-success">Enviar</b-button>
                </form>
            </div>
        </div>
        <!-- END Chat Card -->

       </div>
  </section>
</template>

<script type="text/javascript">
export default {
    methods: {
        showhide() {
           var div = document.getElementById("message-box");
            if (div.style.display !== "block") {
                div.style.display = "block";
            }
            else {
                div.style.display = "none";
            }
        }
    }
}
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
    
    .chat .head small {
        font-size: 19px;
        font-weight: 400;
        color: #34495e;
        margin: 9px;
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
        padding:10px;
    }
    
    .conversas .msg-preview .btn-block p{
        font-weight: 500;
        font-size: 19px;
        text-transform: uppercase;
        color: #2c3e50;
        margin-left: -700px;
        margin-top: 40px;
    }
    
    .conversas .msg-preview .btn{
        margin-top: 35px;
    }
    
    #message-box {
        display: none;
        position: fixed;
        background-color:  white;
        border: 1px solid;
        border-color: #bdc3c7;
        z-index: 100000;
        top: 40%;
        left: 40%;
        width:50%;
        height:75%;
        margin-top: -9em;
        margin-left: -15em;
        box-shadow: 10px 30px 20px rgba(0,0,0,.5);
        padding: 20px;
        border-top-left-radius: 10px;
        border-top-right-radius: 10px;
    }
    
    #message-box form {
        background-color: transparent;
        padding: 3px; 
        position: fixed; 
        bottom: 0; 
        left: 22.5%;
        width:50%;
    }
    
    #message-box form input {
        border: 0.5px solid; 
        border-color: #7f8c8d; 
        padding: 10px; 
        width: 90%; 
        margin-right: .5%; 
        border-radius: 10px;
    }
    
    #message-box form button {
        width: 9.5%;
        height: 42px;
        margin-bottom: 4px;
        font-family: 'Open Sans', sans-serif;
        padding-left: 9px;
    }
    
    #messages { 
        list-style-type: none; 
        margin: 0; 
        padding: 0; 
    }
    
    #messages li { 
          padding: 5px 10px; 
    }
    
    #messages li:nth-child(odd) { 
        background: #eee; 
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