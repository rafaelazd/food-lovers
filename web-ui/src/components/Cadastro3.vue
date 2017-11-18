<template>
    <section id="cad-cover">
       <div class="container">
        <div class="horizontal-center">
                <div class="nb-login">
                   <div class="progress">
                    <div class="progress-bar bg-info" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                    </div> <br> <br>
                    <h1><img src="/static/img/foodlovers.png" class="img-fluid"></h1>
                    <p>Personaliza o seu Perfil.</p>
                    <!-- Perfil Card -->
                        <h5>Selecione sua foto de Perfil</h5>
                        <b-form-file id="file" choose-label="Procurar" placeholder="Nenhum selecionado"></b-form-file>
                        
                        <h5>Biografia</h5>
                        <b-form-textarea id="textarea1" placeholder="Escreva aqui sua Biografia" :rows="3" :maxlength="170"></b-form-textarea>
                        <small class="float-right">Máximo de 170 caracteres</small>
                        
                        <h6>Localização</h6>
                        <b-row>
                            <b-col cols="6" lg="4"><i class="fa fa-map-marker" aria-hidden="true"></i></b-col>
                            <b-col cols="6" lg="4" id="location-col"><b-button class="btn btn-light" v-on:click="getLocalizacao">Localização</b-button></b-col>
                        </b-row>
                        <div id="locConfirma" class="card text-white bg-danger mb-3" style="max-width: 20rem;">
                              <div class="card-body">
                                <h4 class="card-title">Você deseja compartilhar sua localização com seus amigos?</h4>
                                <p class="card-text">
                                    <b-button id="nope" variant="danger">Não</b-button>
                                    <b-button id="yes" variant="success">Sim</b-button>
                                </p>
                              </div>
                        </div>
                 <!-- END Perfil Card -->
                    <div class="buttons d-flex justify-content-center">
                        <router-link class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" to="/usuario-nao-autenticado">Cancelar</router-link>
                        <router-link class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" to="/cadastro-2">Voltar</router-link>
                        <router-link class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" to="/inicio">Confirmar</router-link>
                    </div>
                </div>
         </div>
        </div>
    </section>
</template>


<script>
export default {
  methods: {
            getLocalizacao() {
                document.getElementById("locConfirma").style.display = "block";
                document.getElementById('nope').onclick = function(){
                    document.getElementById("locConfirma").style.display = "none";
                };
                document.getElementById('yes').onclick = function(){
                    $.get("http://ipinfo.io/?token=ecc895cca16b9f", function(response) {
                          document.getElementById("location-col").innerHTML = (response.city + ", " + response.region);
                          document.getElementById("locConfirma").style.display = "none";
                    }, "jsonp")
                };
            }
        }
}
</script>

<style>
     @import url('https://fonts.googleapis.com/css?family=Exo|Open+Sans:300,400|Raleway:400,700,800|Poiret+One|Open+Sans+Condensed:300,300i');
    
    .container {
        width: 100vw;
        height: 100vh;
    }
    
    #cad-cover {
        height: 100vh;
        width: 100vw;
        background: #222 url('/static/img/boys.png') no-repeat center center fixed; 
        background-size: cover;
        overflow: auto;
        
    }
    
    .nb-login {
        padding: 20px 25px;
        border-radius: 2px;
        box-shadow: 0px 0px 15px rgba(255, 255, 255, 0.05);
        align-content: center;
        color: white;
        overflow: auto;
        font-family: 'Open Sans', sans-serif;
    }
    
    .nb-login form {
        margin-bottom: 15px;
        color: #ffffff;
    }
    
    .nb-login .custom-file {
        text-align: left;
        margin: 10px;
    }
    
    .nb-login textarea {
        margin: 10px;
        background-color: transparent;
        color: white;
        border-color: white;
    }
    
    .nb-login textarea:focus {
        background-color: rgba(0,0,0,.3);
        border-color: transparent;
        color: white;
    }
    
    .nb-login textarea::-webkit-input-placeholder { /* WebKit browsers */
        color: #bdc3c7;
        font-family: 'Open Sans', sans-serif;
    }
    
    .nb-login small { 
        color: #bdc3c7;
        font-family: 'Open Sans', sans-serif;
    }
    
    .nb-login p {
        color: #bdc3c7;
        font-family: 'Open Sans', sans-serif;
    }
    
    .nb-login h5 {
        color: #fff;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300; 
        margin-left: 15px;
        text-align: left;
    }
    
    .nb-login h6 {
        color: #fff;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300; 
        font-size: 21px;
        margin-left: 15px;
        text-align: left;
        margin-top: 70px;
    }
    
    .nb-login .row {
        font-family: 'Open Sans', sans-serif;
        font-size: 20px;
    }
    
    .nb-login .row #location-col {
        font-family: 'Open Sans', sans-serif;
        text-decoration: underline;
        color: #3498db;
        font-size: 20px;
        cursor: pointer;
        font-size: 19px;
        text-align: left;
    }
    
    .nb-login .row .btn {
        box-shadow: 10px 20px 20px rgba(0,0,0,.2);
        border-radius: 20px;
    }
    
    .nb-login .row .btn:active {
        border: 4px solid;
        cursor: pointer;
    }
    
    .nb-login .row .btn:hover {
        background-color: transparent;
        color: white;
        cursor: pointer;
    }
    
    .nb-login .btn-lg {
        border-radius: 25px;
        margin-left: 2px;
        margin-right: 2px;
    }
    
    .nb-login .btn-lg:hover {
        background: #7f8c8d;
        color: #fff;
    }
    
    .horizontal-center {
        align-items: center;
        text-align: center;
    }
    
    #locConfirma {
        position: fixed;
        z-index: 10000000;
        top:30%;
        left: 40%;
        box-shadow: 10px 30px 20px rgba(0,0,0,.5);
        padding: 20px;
        display: none;
    }
    
    .buttons {
        margin-top: 25px;
    }
</style>