    <template>
   <section id="inicio-cover">
       <div class="container">
       <!-- Navbar -->
        <nav-all></nav-all> <br>
       <!-- END Navbar -->
   
       <!-- Back Button -->
        <div class="backset">
           <router-link class="btn btn-outline-secondary" role="button" aria-pressed="true" to="/inicio"><i class="fa fa-arrow-left" aria-hidden="true"></i></router-link> 
        </div>
        <!--END Back Button -->
    
        <!-- Perfil -->
        <div class="head">
            <h1>Alterando seus dados pessoais</h1> <br>
            <p>O que você deseja mudar em seu perfil?</p>
        </div> <br>
            <b-row>
                <!-- Nav Vertical -->
                <b-col cols="4">
                    <div class="nav flex-column nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
                       
                        <a class="nav-link" id="Foto-Tab" data-toggle="pill" v-bind:class="{ active: abaAtiva.fotoPerfil}" v-bind:href="fotoperfil" role="tab" aria-controls="v-pills-home" aria-selected="true" v-on:click="trocaSecao('foto-perfil', $event)">Foto de Perfil</a>
                        
                        <a class="nav-link" id="Dados-Tab" data-toggle="pill" v-bind:class="{ active: abaAtiva.dadosPessoais}" v-bind:href="dadospessoais" role="tab" aria-controls="v-pills-profile" aria-selected="false"  v-on:click="trocaSecao('dados-pessoais', $event)">Dados Pessoais</a>
                        
                        <a class="nav-link" id="Email-Tab" data-toggle="pill" v-bind:class="{ active: abaAtiva.email}" v-bind:href="email" role="tab" aria-controls="v-pills-messages" aria-selected="false" v-on:click="trocaSecao('email', $event)">E-mail</a>
                        
                        <a class="nav-link" id="Usuario-Tab" data-toggle="pill" v-bind:class="{ active: abaAtiva.usuario}" v-bind:href="usuario" role="tab" aria-controls="v-pills-settings" aria-selected="false" v-on:click="trocaSecao('usuario', $event)">Usuário</a>
                        
                        <a class="nav-link" id="Senha-Tab" data-toggle="pill" v-bind:class="{ active: abaAtiva.senha}" v-bind:href="senha" v-on:click="trocaSecao('senha', $event)" role="tab" aria-controls="v-pills-settings" aria-selected="false">Senha</a>
                        
                    </div>
                </b-col>
                <!-- END Nav Vertical -->
                    
                <!-- Conteúdo Nav Vertical -->
                <b-col cols="8">
                   <div class="body-alter">                         
                      <div class="tab-content" id="v-pills-tabContent">
                        <!---------------------------------------------->
                        <!-----------------Foto&Bio--------------------->
                         <div class="tab-pane" v-bind:class="{ active: abaAtiva.fotoPerfil, show: abaAtiva.fotoPerfil, fade: !abaAtiva.fotoPerfil }" id="#/alter-perfil/#fotoperfil" role="tabpanel" aria-labelledby="v-pills-home-tab">
                             <div class="body first">
                                <h4>Foto atual:</h4>
                                    <img src="/static/img/m7.png" id="usuFoto"> <br><br>
                                    <b-form-file id="input2"  choose-label="Procurar" placeholder="Nenhum selecionado"></b-form-file><br><br>
                                  <h5>Biografia</h5>
                                    <b-form-textarea id="textarea2" placeholder="Escreva aqui sua Biografia" :rows="3" :maxlength="170"></b-form-textarea>
                                    <small class="float-right">Máximo de 170 caracteres</small>
                                    <br>
                                  <h5>Local</h5>
                                     <b-row>
                                         <b-col>
                                             <b-button variant="secondary" @click="getLocalizacao">Localização</b-button>
                                         </b-col>
                                         <b-col id="location-col">
                                             
                                         </b-col>
                                     </b-row>
                                    <br>
                                <b-button class="btn btn-outline-success float-left" @click="updateUm" style="margin-top:0px">Confirmar</b-button>
                             </div>
                         </div>
                         <!---------------------------------------------------->
                         <!-----------------Dados-Pessoais--------------------->
                         <div class="tab-pane" v-bind:class="{ active: abaAtiva.dadosPessoais, show: abaAtiva.dadosPessoais, fade: !abaAtiva.dadosPessoais }" id="#/alter-perfil/#dadospessoais" role="tabpanel" aria-labelledby="v-pills-profile-tab">
                             <div class="body d-flex flex-column justify-content-center">
                                <form class="form" role="form" autocomplete="off" id="formConfig" action="">
                                  <b-row>
                                     <b-col>
                                         <h4>Dados Pessoais</h4><br>
                                     </b-col>
                                  </b-row>
                                  <b-row class="inputs">
                                     <b-col cols="4" sm="4" lg="4">
                                         <input type="text" class="form-control" name="nome" ref="nome"  placeholder="Nome" id="nome">
                                     </b-col>
                                     <b-col cols="4" sm="4" lg="4">
                                         <input type="text" class="form-control" name="sobrenome" ref="sobrenome"  placeholder="Sobrenome" id="sobrenome">
                                     </b-col>
                                     <b-col cols="4" sm="4" lg="4">
                                         <input type="number" class="form-control" name="idade" ref="idade"  placeholder="Idade" id="idade"><br>
                                     </b-col>
                                  </b-row>
                                  <b-row>
                                       <h5>Preferência em:</h5><br>    
                                  </b-row>
                                  <b-row class="inputs2 form-inline">
                                      <b-form-checkbox v-model="checkselected" id="prefsex" name="Homens" value="Homens"> Homens </b-form-checkbox>
                                      <b-form-checkbox v-model="checkselected" id="prefsex" name="Mulheres" value="Mulheres"> Mulheres </b-form-checkbox>
                                  </b-row>
                                  <p id="check-choice" style="display:none;">{{checkselected}}</p>
                                  <p id="check-final"></p>
                                  <b-row>
                                       <h5>Sexo:</h5><br>    
                                  </b-row>
                                  <b-row class="inputs4" id="radio-alterperfil">
                                       <p>
                                          <input type="radio" v-model="radioselected" class="option-input radio" name="generos" value="Agênero" ref="radio1"/>
                                          <i class="fa fa-genderless" aria-hidden="true"></i> Agênero
                                       </p>
                                        <p>
                                          <input type="radio" v-model="radioselected" class="option-input radio" name="generos" value="Bigênero" ref="radio2"/>
                                          <i class="fa fa-venus-mars" aria-hidden="true"></i> Bigênero
                                       </p>
                                       <p>
                                          <input type="radio" v-model="radioselected" class="option-input radio" name="generos" value="Transgênero" ref="radio3"/>
                                          <i class="fa fa-transgender-alt" aria-hidden="true"></i> Transgênero
                                       </p>
                                       <p>
                                          <input type="radio" v-model="radioselected" class="option-input radio" name="generos" value="Masculino" ref="radio4"/>
                                          <i class="fa fa-mars" aria-hidden="true"> </i> Masculino
                                       </p>
                                       <p>
                                          <input type="radio" v-model="radioselected" class="option-input radio" name="generos" value="Feminino" ref="radio5"/>
                                          <i class="fa fa-venus" aria-hidden="true"></i> Feminino
                                       </p>
                                   </b-row>
                                   <p id="radio-choice" style="display:none;">{{radioselected}}</p>
                                  <b-button class="btn btn-outline-success float-left" @click="updateDois" style="margin-top: 10px;">Confirmar</b-button>
                                </form> <br>
                            </div>
                         </div>
                         <!------------------------------------------->
                         <!-----------------E-mail--------------------->
                         <div class="tab-pane" v-bind:class="{ active: abaAtiva.email, show: abaAtiva.email, fade: !abaAtiva.email }" id="#/alter-perfil/#email" role="tabpanel" aria-labelledby="v-pills-messages-tab">
                             <div class="body d-flex flex-column justify-content-center">
                                <form class="form" role="form" autocomplete="off" id="formConfig" action="">
                                  <b-row>
                                     <b-col>
                                         <h4>E-mail</h4>
                                     </b-col>
                                  </b-row>
                                  <b-row class="inputs2">'
                                       <input type="email" class="form-control" name="email" ref="email"  id="email" placeholder="E-mail">
                                  </b-row>
                                  <b-button @click="updateTres" class="btn btn-outline-success float-left" style="margin-top: 17px;">Confirmar</b-button>
                                </form><br>
                            </div>
                         </div>
                         <!------------------------------------------->
                         <!-----------------Usuário--------------------->
                         <div class="tab-pane" v-bind:class="{ active: abaAtiva.usuario, show: abaAtiva.usuario, fade: !abaAtiva.usuario }" id="#/alter-perfil/#usuario" role="tabpanel" aria-labelledby="v-pills-settings-tab">
                             <div class="body d-flex flex-column justify-content-center">
                                <form class="form" role="form" autocomplete="off" id="formConfig" action="">
                                  <b-row>
                                     <b-col>
                                         <h4>Usuário</h4>
                                     </b-col>
                                  </b-row>
                                  <b-row class="inputs2">
                                       <input type="text" class="form-control" name="usuario" ref="usuario"  placeholder="Usuário" id="usuario">
                                  </b-row>
                                  <b-button @click="updateQuatro" class="btn btn-outline-success float-left" style="margin-top:17px">Confirmar</b-button>
                                </form> <br>
                            </div>
                         </div>
                         <!------------------------------------------->
                         <!-----------------Senha--------------------->
                         <div class="tab-pane" v-bind:class="{ active: abaAtiva.senha, show: abaAtiva.senha, fade: !abaAtiva.senha }" id="#/alter-perfil/#senha" role="tabpanel" aria-labelledby="v-pills-settings-tab">
                             <div class="body d-flex flex-column justify-content-center">
                                <form class="form" role="form" autocomplete="off" id="formConfig" action="">
                                  <b-row>
                                     <b-col>
                                         <h4>Senha</h4>
                                     </b-col>
                                  </b-row>
                                  <b-row class="inputs3">
                                       <input type="password" class="form-control" name="senha" ref="senha" id="senha"  placeholder="Senha" autocomplete="new-password"> <br><br>
                                  </b-row>
                                  <b-row>
                                     <b-col>
                                         <h5>Confirmar Senha</h5>
                                     </b-col>
                                  </b-row>
                                  <b-row class="inputs2">
                                       <input type="password" class="form-control" name="senha2" ref="senha2" id="senha2"  placeholder="Senha" autocomplete="new-password">
                                  </b-row>
                                  <b-button @click="updateCinco" class="btn btn-outline-success float-left" style="margin-top:17px">Confirmar</b-button>
                                </form> <br>
                            </div>
                         </div>
                        <!------------------------------------------------>
                        <!-------------------Aviso-Danger----------------->
                            <div id="updateFail" class="card text-white bg-danger mb-3" style="max-width: 20rem;">
                              <div class="card-body">
                                <h4 class="card-title">Opa!</h4>
                                <p class="card-text" id="aviso-fail"> </p>
                                <b-button variant="warning" id="close-fail">Voltar</b-button>
                              </div>
                            </div>
                        <!------------------Aviso-Sucesso--------------->
                            <div id="updateSuccess" class="card text-white bg-success mb-3" style="max-width: 20rem;">
                              <div class="card-body">
                                <h4 class="card-title">Eba!</h4>
                                <p class="card-text" id="aviso-success"> </p>
                                <b-button variant="dark" id="close-success">Voltar</b-button>
                              </div>
                            </div>
                        <!---------------------------------------------->
                       </div>
                   </div>
                </b-col>
                <!-- END Conteúdo Nav Vertical -->
          </b-row>
       </div>
  </section>
</template>


<script>
    import axios from 'axios'
export default {
data () {
    return {
      fotoperfil: '#/alter-perfil/#fotoperfil',
      dadospessoais: '#/alter-perfil/#dadospessoais',
      email: '#/alter-perfil/#email',
      usuario: '#/alter-perfil/#usuario',
      senha: '#/alter-perfil/#senha',
      abaAtiva: {
          fotoPerfil: true,
          dadosPessoais: false,
          email: false,
          usuario: false,
          senha: false,
      },
      checkselected: [],
      radioselected: []
    }
  },

methods: {
      
      trocaSecao(secao, event) {
          // previne que o link seja seguido
          event.preventDefault();
          this.abaAtiva.fotoPerfil = false;
          this.abaAtiva.dadosPessoais = false;
          this.abaAtiva.email = false;
          this.abaAtiva.usuario = false;
          this.abaAtiva.senha = false;
          
          switch(secao) {
              case 'foto-perfil':
                  this.abaAtiva.fotoPerfil = true;
                  break;
              case 'dados-pessoais':
                  this.abaAtiva.dadosPessoais = true;
                  break;
              case 'email':
                  this.abaAtiva.email = true;
                  break;
              case 'usuario':
                  this.abaAtiva.usuario = true;
                  break;
              case 'senha':
                  this.abaAtiva.senha = true;
                  break;
          }
      },
      
      getLocalizacao () {
            $.get("http://ipinfo.io/?token=ecc895cca16b9f", function(response) {
                    document.getElementById("location-col").innerHTML = (response.city + ", " + response.region);
            }, "jsonp")
       },
      
      BioFunction () {
          var text = document.getElementById("textarea2").value;
           if (text != '') {
               axios.patch('http://localhost:8060/pessoas/3', {
                  biografia: text,
                  })
                  .then(function (response) {
                    console.log(response);
                  })
                  .catch(function (error) {
                    console.log(error);
                  });
           } else {
               console.log("Biografia não preenchida")
           } 
       },
      
      LocalizeFunction () {
          var localize = document.getElementById("location-col").innerHTML;
           if (localize != '') {
               axios.patch('http://localhost:8060/pessoas/3', {
                  local: localize,
                  })
                  .then(function (response) {
                    console.log(response);
                  })
                  .catch(function (error) {
                    console.log(error);
                  });
           } else {
               console.log("Localização não informada")
           }   
       },
      
      nomeFunction () {
          if (this.$refs.nome.value != "") {
              axios.patch('http://localhost:8060/pessoas/3', {
                  nome: this.$refs.nome.value
              })
                .then(function (response) {
                    console.log(response);
                  })
                  .catch(function (error) {
                    console.log(error);
                  });
          } else {
              console.log("nome não preenchido")
          }
      },
      
      sobrenomeFunction () {
        if (this.$refs.sobrenome.value != "") {
              axios.patch('http://localhost:8060/pessoas/3', {
                  sobrenome: this.$refs.sobrenome.value
              })
            .then(function (response) {
                    console.log(response);
                  })
                  .catch(function (error) {
                    console.log(error);
                  });
          } else {
              console.log("sobrenome não preenchido")
          }
      },
      
      idadeFunction () {
         if (this.$refs.idade.value != "" && this.$refs.idade.value > 14) {
              axios.patch('http://localhost:8060/pessoas/3', {
                  idade: this.$refs.idade.value
              })
              .then(function (response) {
                  console.log(response);
              })
              .catch(function (error) {
                  console.log(error);
              });
         } else {
             console.log("idade não preenchido")
         } 
      },
      
      radioFunction () {
          if (this.$refs.radio1.checked==false && this.$refs.radio2.checked==false && this.$refs.radio3.checked==false && this.$refs.radio4.checked==false && this.$refs.radio5.checked==false) {
              console.log("Nenhum radio selecionado")
          } else {
              var radio = document.getElementById("radio-choice").innerHTML;
              axios.patch('http://localhost:8060/pessoas/3', {
                 sexo: radio
              })
              .then(function (response) {
                  console.log(response);
              })
              .catch(function (error) {
                  console.log(error);
              });
          }
      },
      
      checkFunction () {
             var checkbox = document.getElementById("check-choice").innerHTML.replace(/[^a-zA-Z ]/g, "");
             if (checkbox != ''){
                 axios.patch('http://localhost:8060/pessoas/3', {
                 prefsex: checkbox
                  })
                  .then(function (response) {
                      console.log(response);
                  })
                  .catch(function (error) {
                      console.log(error);
                  });
             } else {
                 console.log("Nenhum check selecionado")
             }
      },
    
     updateUm() {
         this.LocalizeFunction();
         this.BioFunction();
         var alerta = document.getElementById("updateSuccess");
         var alertatxt = document.getElementById("aviso-success");
         alerta.style.display = "block";
         alertatxt.innerHTML = "Seu perfil foi alterado com sucesso.";
         document.getElementById('close-success').onclick = function(){
             document.getElementById("updateSuccess").style.display = "none";
         }
      },
      
      updateDois() {
           this.nomeFunction();
           this.sobrenomeFunction();
           this.idadeFunction();
           this.radioFunction();
           this.checkFunction();
               
               if (this.$refs.idade.value != "" && this.$refs.idade.value<14) {
                   var alerta = document.getElementById("updateFail");
                   var alertatxt = document.getElementById("aviso-fail");
                   alerta.style.display = "block";
                   alertatxt.innerHTML = "Nenês não podem usar esse aplicativo.";
                   document.getElementById('close-fail').onclick = function(){
                         document.getElementById("updateFail").style.display = "none";
                   }
               }
               
               else {
                   var alerta = document.getElementById("updateSuccess");
                   var alertatxt = document.getElementById("aviso-success");
                   alerta.style.display = "block";
                   alertatxt.innerHTML = "Seus dados pessoais foram alterados com sucesso.";
                   document.getElementById('close-success').onclick = function(){
                         document.getElementById("updateSuccess").style.display = "none";
                   }
               }
      },
    
      updateTres() {
           if (this.$refs.email.value != ''){
               
               if (this.$refs.email.value.indexOf('@')==-1 || this.$refs.email.value.indexOf('.')==-1 ) {
                   var alerta = document.getElementById("updateFail");
                   var alertatxt = document.getElementById("aviso-fail");
                   alerta.style.display = "block";
                   alertatxt.innerHTML = "Você deve escrever um endereço de e-mail válido.";
                   document.getElementById('close-fail').onclick = function(){
                         document.getElementById("updateFail").style.display = "none";
                   }
              } 
               
              else {
                 axios.patch('http://localhost:8060/pessoas/3', {
                    email: this.$refs.email.value
                 })
                 .then(function (response) {
                    console.log(response);
                 })
                 .catch(function (error) {
                    console.log(error);
                 });
                 var alerta = document.getElementById("updateSuccess");
                 var alertatxt = document.getElementById("aviso-success");
                 alerta.style.display = "block";
                 alertatxt.innerHTML = "Seu e-mail foi alterado com sucesso.";
                 document.getElementById('close-success').onclick = function(){
                      document.getElementById("updateSuccess").style.display = "none";
                 }
              }
               
           } else {
               console.log("E-mail não preenchido")
           }
      },
    
      updateQuatro() {
           if (this.$refs.usuario.value != ''){
               
               if (this.$refs.usuario.value.length<4 || this.$refs.usuario.value.length>10) {
                   var alerta = document.getElementById("updateFail");
                   var alertatxt = document.getElementById("aviso-fail");
                   alerta.style.display = "block";
                   alertatxt.innerHTML = "O seu usuário deve conter entre 4 e 10 caracteres.";
                   document.getElementById('close-fail').onclick = function(){
                         document.getElementById("updateFail").style.display = "none";
                   }
               }
               
               else {
                   axios.patch('http://localhost:8060/pessoas/3', {
                     usuario: this.$refs.usuario.value
                   })
                   .then(function (response) {
                     console.log(response);
                    })
                   .catch(function (error) {
                     console.log(error);
                   });
                   var alerta = document.getElementById("updateSuccess");
                   var alertatxt = document.getElementById("aviso-success");
                   alerta.style.display = "block";
                   alertatxt.innerHTML = "Seu usuário foi alterado com sucesso.";
                   document.getElementById('close-success').onclick = function(){
                        document.getElementById("updateSuccess").style.display = "none";
                   }
               }
               
           } else {
               console.log("Usuário não preenchido")
           }
      },
    
      updateCinco() {
           if (this.$refs.senha.value != ''){
               
               if (this.$refs.senha.value != this.$refs.senha2.value) {
                   var alerta = document.getElementById("updateFail");
                   var alertatxt = document.getElementById("aviso-fail");
                   alerta.style.display = "block";
                   alertatxt.innerHTML = "As suas senhas devem ser correspondentes.";
                   document.getElementById('close-fail').onclick = function(){
                         document.getElementById("updateFail").style.display = "none";
                   }
               } 
               
               else if (this.$refs.senha.value.length < 7 || this.$refs.senha.value.length > 20){
                   var alerta = document.getElementById("updateFail");
                   var alertatxt = document.getElementById("aviso-fail");
                   alerta.style.display = "block";
                   alertatxt.innerHTML = "A sua senha deve conter entre 7 e 20 caracteres.";
                   document.getElementById('close-fail').onclick = function(){
                         document.getElementById("updateFail").style.display = "none";
                   }
               }
               
               else {
                   axios.patch('http://localhost:8060/pessoas/3', {
                     senha: this.$refs.senha.value
                   })
                   .then(function (response) {
                     console.log(response);
                    })
                   .catch(function (error) {
                     console.log(error);
                   });
                   var alerta = document.getElementById("updateSuccess");
                   var alertatxt = document.getElementById("aviso-success");
                   alerta.style.display = "block";
                   alertatxt.innerHTML = "Sua senha foi alterada com sucesso.";
                   document.getElementById('close-success').onclick = function(){
                        document.getElementById("updateSuccess").style.display = "none";
                   }
               }
               
           } else {
               console.log("Senha não preenchida")
           }
      },
    
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
    }
    
    .container {
        padding: 0px;  
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
    
    .nav-pills {
        padding-left: 10px;    
    }
    
    .body-alter {
        padding-right: 10px;
    }
    
    .body .custom-file {
        text-align: left;
        margin: 10px;
    } 
    
    .body #textarea2 {
       width: 70%;
       margin-left: 100px;
    }
    
    .body small{
       margin-right: 150px;
       color: #7f8c8d;
       font-family: 'Open Sans', sans-serif;
    }
    
    .body {
        max-width: none;
        padding: 20px 25px;
        border-radius: 2px;
        text-align: center;
    }

    .body h4{
        color: #34495e;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300; 
        text-align: left;
        margin-left: 20px;
    }
    
    .body h5{
        color: #34495e;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300; 
        text-align: left;
        margin-left: 50px;
    }
    
    .body .inputs{
        margin-left: 50px;
        margin-right: 50px;
    }
    
    .body .inputs2{
        margin-left: 70px;
        margin-top: 10px;
        margin-bottom: 10px;
    }
    
    .body .inputs2 #mulheres{
        margin-left: 30px;
    }
    
    .body .inputs3{
        margin-left: 70px;
        margin-top: 10px;
        margin-bottom: 20px;
    }
    
    .body .inputs4{
        justify-content: center;
    }

     
    @keyframes click-wave {
      0% {
        height: 40px;
        width: 40px;
        opacity: 0.35;
        position: relative;
      }
      100% {
        height: 200px;
        width: 200px;
        margin-left: -80px;
        margin-top: -80px;
        opacity: 0;
      }
    }

    .option-input {
      appearance: none;
      position: relative;
      top: 7px;
      right: 0;
      bottom: 0;
      margin-left: 15px;
      margin-right: 15px;
      height: 25px;
      width: 25px;
      border: none;
      color: #fff;
      cursor: pointer;
      display: inline-block;
      margin-right: 0.5rem;
      outline: none;
      z-index: 1000;
    }
    
    .option-input:hover {
      background: #9faab7;
    }
    
    .option-input:checked {
      background: #007bff;
    }
    
    .option-input:checked::before {
      height: 40px;
      width: 40px;
      position: absolute;
      content: '✔';
      display: inline-block;
      font-size: 15px;
      text-align: center;
      line-height: 22px;
      margin-left: -8px;
    }
    
    .option-input:checked::after {
      -webkit-animation: click-wave 0.65s;
      -moz-animation: click-wave 0.65s;
      animation: click-wave 0.65s;
      background: #007bff;
      content: '';
      display: block;
      position: relative;
      z-index: 100;
    }
    
    .option-input.radio {
        border-radius: 50%;
    }
    
    .option-input.radio::after {
        border-radius: 50%;
    }
    
     #updateSuccess {
        position: fixed;
        z-index: 10000000;
        top:30%;
        left: 40%;
        box-shadow: 10px 30px 20px rgba(0,0,0,.5);
        padding: 20px;
        display: none;
    }
    
     #updateFail {
        position: fixed;
        z-index: 10000000;
        top:30%;
        left: 40%;
        box-shadow: 10px 30px 20px rgba(0,0,0,.5);
        padding: 20px;
        display: none;
    }
    
    #location-col {
        font-family: 'Open Sans', sans-serif;
        text-decoration: underline;
        color: #3498db;
        font-size: 18px;
        cursor: pointer;
        font-size: 19px;
        text-align: left;
        margin-top: 7px;
    }
    
    @media (max-width: 594px) {
        #usuFoto {
            width: 200px;
            height: 200px;
            padding-left: 0px;
        }
        
        .body small{
            margin-right: 0px;
        }
        
        .body #textarea2{
            width: 100%;
            margin-left: 15px;
        }
        
        .body .inputs{
            margin-left: 0px;
            margin-right: 0px;
        }
    }
    
    @media (min-width: 595px) and (max-width: 780px) {
        .body small{
            margin-right: 10px;
        }
        .body #textarea2{
            margin-left: 10px;
        }
    }
    
</style>