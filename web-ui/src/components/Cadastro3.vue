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
                      
                       <form class="form" role="form" autocomplete="off" name="form" action="" enctype="multipart/form-data">
                          <h5>Selecione sua foto de Perfil</h5>
                            <b-row>
                                <div v-if="!image" class="img-file">
                                   <b-form-file id="file"  @change="onFileChange" choose-label="Procurar" placeholder="Nenhum selecionado"></b-form-file>
                                   <span class="validate" id="valFoto">Você deve selecionar uma foto de Perfil</span>
                                </div>
                                <div v-else  class="img-file">
                                    <img id="usuFoto" :src="image" />
                                    <b-button variant="danger" id="removeImage" @click="removeImage">Remover</b-button>
                                </div>
                            </b-row>
                            <h5>Biografia</h5>
                            <b-form-textarea id="textarea1" placeholder="Escreva aqui sua Biografia" :rows="3" :maxlength="170"></b-form-textarea>
                            <small class="float-right">Máximo de 170 caracteres</small>
                            <span class="validate" id="valBio">É importante escrever um pouco sobre si mesmo, assim outros poderão te conhecer melhor!</span>

                            <h6>Localização</h6>
                            <b-row>
                                <b-col cols="6" lg="4"><b-button id="localbtn" class="btn btn-light" v-on:click="getLocalizacao"> Localização</b-button></b-col>
                                <b-col cols="6" lg="4" id="location-col"></b-col>
                            </b-row>
                            <span class="validate" id="valLoc">Precisamos da sua localização para um melhor uso do aplicativo!</span>
                            <div id="locConfirma" class="card text-white bg-danger mb-3" style="max-width: 20rem;">
                                  <div class="card-body">
                                    <h4 class="card-title">Você deseja compartilhar sua localização com seus amigos?</h4>
                                    <p class="card-text">
                                        <b-button id="nope" variant="danger">Não</b-button>
                                        <b-button id="yes" variant="success">Sim</b-button>
                                    </p>
                                  </div>
                            </div>
                            <div class="form-inline">
                                <h6>Redes Sociais</h6>
                                <small id="help">Relaxa! Essas informações só são compartilhadas com quem você combina.</small>
                            </div>
                            <div class="social">
                                <b-input-group id="facebook">
                                    <b-input-group-addon class="bg-primary"><i class="fa fa-facebook" aria-hidden="true"></i></b-input-group-addon>
                                    <b-input-group-addon class="bg-primary">facebook.com/</b-input-group-addon>
                                     <b-form-input id="inputfb" placeholder="Maria.monte"></b-form-input>
                                </b-input-group>
                                <b-input-group id="whatsapp">
                                    <b-input-group-addon class="bg-success"><i class="fa fa-whatsapp" aria-hidden="true"></i></b-input-group-addon>
                                    <b-input-group-addon class="bg-success whatsapp">+ 55</b-input-group-addon>
                                    <the-mask id="number" :mask="['(##) ####-####', '(##) #####-####']" placeholder="(xx) xxxxx-xxxx"/>
                                </b-input-group>
                                <b-input-group id="snapchat">
                                    <b-input-group-addon class="bg-warning"><i class="fa fa-snapchat-ghost" aria-hidden="true"></i></b-input-group-addon>
                                    <b-input-group-addon class="bg-warning arroba">@</b-input-group-addon>
                                     <b-form-input id="inputsnap" placeholder="mysnapUser"></b-form-input>
                                </b-input-group>
                                <b-input-group id="twitter">
                                    <b-input-group-addon class="bg-info"><i class="fa fa-twitter" aria-hidden="true"></i></b-input-group-addon>
                                    <b-input-group-addon class="bg-info arroba">@</b-input-group-addon>
                                     <b-form-input id="inputtw" placeholder="mytwUser"></b-form-input>
                                </b-input-group>
                                <b-input-group id="instagram">
                                    <b-input-group-addon class="bg-gradient"><i class="fa fa-instagram" aria-hidden="true"></i></b-input-group-addon>
                                    <b-input-group-addon class="bg-gradient2">@</b-input-group-addon>
                                     <b-form-input id="inputinst" placeholder="myinstagramUser"></b-form-input>
                                </b-input-group>
                            </div>
                            <span class="validate" id="valSocial">Você precisa informar pelo menos uma de suas redes sociais!</span>
                       </form>
                        
                 <!-- END Perfil Card -->
                   
                    <div class="buttons d-flex justify-content-center">
                        <router-link class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" to="/usuario-nao-autenticado">Cancelar</router-link>
                        <router-link class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" to="/cadastro-2">Voltar</router-link>
                        <b-button class="btn btn-outline-secondary btn-lg" v-on:click="cadastrar">Confirmar</b-button>
                    </div>
                </div>
         </div>
        </div>
    </section>
</template>


<script>
import axios from 'axios'
    
export default {
data () {
    return {
      image: ''
    }
  },
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
            },
            
            cadastrar () {
                var file = document.getElementById("file");
                var text = document.getElementById("textarea1").value;
                var localize = document.getElementById("location-col").innerHTML;
                var fb = document.getElementById("inputfb").value;
                var whats = document.getElementById("number").value;
                var snap = document.getElementById("inputsnap").value;
                var tw = document.getElementById("inputtw").value;
                var insta = document.getElementById("inputinst").value;
                
                if (file.value == ''){
                    document.getElementById("valFoto").style.display = "block";
                    
                } 
                
                else if (text.length == 0) {
                     document.getElementById("valBio").style.display = "block";
                } 
                
                else if (fb.length == 0 && whats.length == 0 && snap.length == 0 && tw.length == 0 && insta.length == 0) {
                    document.getElementById("valSocial").style.display = "block";
                }
                
                else {
                axios.post('http://localhost:8060/pessoas', {
                    biografia: text,
                    local: localize,
                    facebook: fb,
                    whatsapp: whats,
                    snapchat: snap,
                    twitter: tw,
                    instagram: insta
                  })
                  .then(function (response) {
                    console.log(response);
                  })
                  .catch(function (error) {
                    console.log(error);
                  });
                    
                    this.$router.push('inicio');
                    console.log('Login!');
                }
            },
            onFileChange(e) {
                var files = e.target.files || e.dataTransfer.files;
                  if (!files.length)
                    return;
                  this.createImage(files[0]);
                },
                createImage(file) {
                  var image = new Image();
                  var reader = new FileReader();
                  var vm = this;

                  reader.onload = (e) => {
                    vm.image = e.target.result;
                  };
                  reader.readAsDataURL(file);
                },
                removeImage: function (e) {
                  this.image = '';
                
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
        
    #usuFoto {
      width: 300px;
      height: 300px;
      border-radius: 150px;
      
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
    
    .nb-login .img-file {
        justify-content: center;
        margin-left: 28%;
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
    
    #removeImage:hover {
        background-color: darkred;
        border-color: darkred;
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
    
    #help {
        margin-top: 70px;
        margin-left: 10px;
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
    
    .social .input-group{
        margin: 15px;
    }
    
    .social input{
        background-color: transparent;
        border-color: gray;
        border-left-color: transparent;
        color: white;
        width: 500px;
        border-radius: 10px;
    }
    
    .social input:focus{
        background-color: rgba(0,0,0,.3);
        border-color: transparent;
        color: white;
    }
    
    .social input::-webkit-input-placeholder { /* WebKit browsers */
        color: #bdc3c7;
        font-family: 'Open Sans', sans-serif;
    }
    
    .social .input-group-addon{
       color: white;
    }
    
    .social .bg-gradient{
        background: linear-gradient(-45deg, #F89406, #DB0A5B);
    }
    
    .social .bg-gradient2{
        background: linear-gradient(45deg, #F89406, #DB0A5B);
        padding-left: 58px;
        padding-right: 58px;
    }
    
    .social .whatsapp {
        padding-left: 50px;
        padding-right: 50px;
    }
    
    .social #number {
        width: 900px;
        border-radius: 10px;
        border-style: solid;
        border-width: thin;
    }
    
    .social #number:focus {
        background-color: rgba(0,0,0,.3);
        border-color: transparent;
        color: white;
    }
    
    .social .arroba {
        padding-left: 58px;
        padding-right: 58px;
    }
    
    .nb-login .validate{
        display: none;
        color: #e74c3c;
        font-weight: 700;
    }
</style>