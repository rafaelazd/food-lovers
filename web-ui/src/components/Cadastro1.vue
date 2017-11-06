<template>
  <section id="cad-cover">
       <div class="container">
            <div class="vertical-center">
                <div class="nb-login">
                   <div class="progress">
                        <div class="progress-bar bg-info" role="progressbar" style="width: 33%" aria-valuenow="33" aria-valuemin="0" aria-valuemax="100"></div>
                    </div> <br><br>
                    <h1><img src="/static/img/foodlovers.png" class="img-fluid"></h1>
                    <p>Preencha o campo abaixo com seus dados pessoais.</p>
                    <!-- Formulario -->
                    <div class="card-block">
                        <form class="form" role="form" autocomplete="off" id="formCad" action="">
                            <div class="form-group">
                                <input type="email" class="form-control" name="email" ref="email" placeholder="E-mail">
                                <small id="valEmail" class="danger">Você deve digitar um E-mail válido!</small>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="nome" ref="nome"  placeholder="Nome">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="sobrenome" ref="sobrenome" placeholder="Sobrenome">
                            </div>
                            <div class="form-group">
                                <input type="number" class="form-control" name="idade" ref="idade"  placeholder="Idade">
                                <small id="valIdade" class="danger">Nenês não podem usar esse tipo de aplicativo!</small>
                            </div>
                            <div class="form-group d-flex justify-content-center form-inline">
                               <h5>Preferência em</h5>
                                 <b-form-checkbox type="checkbox" name="check" ref="checkbox1" value="Homens"> Homens </b-form-checkbox>
                                 <b-form-checkbox name="check" ref="checkbox2" value="Mulheres"> Mulheres </b-form-checkbox>
                            </div>
                                <small id="valCheckboxes" class="danger">Você deve escolher ao menos uma das Preferências!</small>
                            <div class="d-flex justify-content-center">
                              <b-row>
                               <b-col cols="12"><h5>Sexo</h5></b-col>
                                   <b-col cols="6" sm="4">
                                       <p>
                                          <input type="radio" class="option-input radio" name="radio" id="radio1" ref="radio1"/>
                                          <i class="fa fa-genderless" aria-hidden="true"></i> Agênero
                                       </p>
                                   </b-col>
                                   <b-col cols="6" sm="4">
                                        <p>
                                          <input type="radio" class="option-input radio" name="radio" id="radio2" ref="radio2"/>
                                          <i class="fa fa-venus-mars" aria-hidden="true"></i> Bigênero
                                       </p>
                                   </b-col>
                                   <b-col cols="6" sm="4">
                                       <p>
                                          <input type="radio" class="option-input radio" name="radio" id="radio3" ref="radio3"/>
                                          <i class="fa fa-transgender-alt" aria-hidden="true"></i> Transgênero
                                       </p>
                                   </b-col>
                                   <b-col cols="6" sm="4">
                                       <p>
                                          <input type="radio" class="option-input radio" name="radio" id="radio4" ref="radio4"/>
                                          <i class="fa fa-mars" aria-hidden="true"> </i> Masculino
                                       </p>
                                   </b-col>
                                   <b-col cols="12" sm="4">
                                       <p>
                                          <input type="radio" class="option-input radio" name="radio" id="radio5" ref="radio5"/>
                                          <i class="fa fa-venus" aria-hidden="true"></i> Feminino
                                       </p>
                                   </b-col>
                                </b-row>
                            </div>
                                <small id="valRadios" class="danger">Você deve escolher ao menos uma das opções!</small>
                            <div class="form-group">
                                <input type="text" class="form-control" name="usuario" ref="usuario"  placeholder="Usuário">
                                <small id="valUsuario1" class="danger">Seu usuário tem que ter no mínimo 4 caracteres!</small>
                                <small id="valUsuario2" class="danger">Seu usuário tem que ter no máximo 10 caracteres!</small>
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" name="senha" ref="senha"  placeholder="Senha">
                                <small id="valSenha1" class="danger">Sua Senha tem que ter no mínimo 7 caracteres!</small>
                                <small id="valSenha11" class="danger">Sua Senha tem que ter no máximo 20 caracteres!</small>
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" name="senha2" ref="senha2"  placeholder="Confirmar Senha">
                                <small id="valSenha2" class="danger">As senhas informadas precisam ser iguais!</small>
                            </div>
                            <div class="form-group">
                            <router-link class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" to="/usuario-nao-autenticado">Cancelar</router-link>
                            <b-button class="btn btn-outline-secondary btn-lg" v-on:click="realizaLogin">Confirmar</b-button>
                            </div>
                            <div id="valRequired"class="card text-white bg-danger mb-3" style="max-width: 20rem;">
                              <div class="card-body">
                                <h4 class="card-title">Opa!</h4>
                                <p class="card-text">Todos os campos devem ser preenchidos!</p>
                                <b-button variant="warning" id="close-card">Voltar</b-button>
                              </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
       </div> 
 </section>
</template>


<script>  
export default {
     methods: {
        realizaLogin(event) {
            if (this.$refs.nome.value=="" || this.$refs.email.value=="" || this.$refs.sobrenome.value=="" || this.$refs.idade.value=="" || this.$refs.usuario.value=="" || this.$refs.senha.value=="" || this.$refs.senha2.value=="") {
                 console.log('Falha no login');
                 document.getElementById("valRequired").style.display = "block";
                 document.getElementById('close-card').onclick = function(){
                    document.getElementById("valRequired").style.display = "none";
                };
                    
            } 
            
            else if (this.$refs.checkbox1.checked==false && this.$refs.checkbox2.checked==false ) {
                     console.log('Falha no login');
                      document.getElementById("valCheckboxes").style.display = "block";
            }
            
            else if (this.$refs.email.value.indexOf('@')==-1 || this.$refs.email.value.indexOf('.')==-1 ) {
                     console.log('Falha no login');
                     document.getElementById("valEmail").style.display = "block";
                     this.$refs.email.focus();
            }
            
            else if (this.$refs.usuario.value.length<4 ) {
                     console.log('Falha no login');
                     document.getElementById("valUsuario1").style.display = "block";
                     this.$refs.usuario.focus();
            }
           
            else if (this.$refs.usuario.value.length>10 ) {
                     console.log('Falha no login');
                     document.getElementById("valUsuario2").style.display = "block";
                     this.$refs.usuario.focus();
            }
           
            else if (this.$refs.senha.value.length<7 ) {
                     console.log('Falha no login');
                     document.getElementById("valSenha1").style.display = "block";
                     this.$refs.senha.focus();
            }
           
            else if (this.$refs.senha.value.length>20 ) {
                     console.log('Falha no login');
                     document.getElementById("valSenha11").style.display = "block";
                     this.$refs.senha.focus();
            }
            
            else if(this.$refs.senha.value != this.$refs.senha2.value) {
                    console.log('Falha no login');
                     document.getElementById("valSenha2").style.display = "block";
                     this.$refs.senha2.focus();
            }
            
            else if (this.$refs.radio1.checked==false && this.$refs.radio2.checked==false && this.$refs.radio3.checked==false && this.$refs.radio4.checked==false && this.$refs.radio5.checked==false) {
                     console.log('Falha no login');
                     document.getElementById("valRadios").style.display = "block";
            }
            
            else {
                this.$router.push('cadastro-2');
                console.log('Login!');
            }
            
    }
  }
}
</script>

<style>
    /* TODO: colocar  o código em apenas um arquivo */ 
    @import url('https://fonts.googleapis.com/css?family=Exo|Open+Sans:300,400|Raleway:400,700,800|Poiret+One|Open+Sans+Condensed:300,300i');
    
    #cad-cover {
        height: 100vh;
        width: 100vw;
        background: #222 url('/static/img/boys.png') no-repeat center center fixed;
        background-size: cover;
        overflow: auto;
    }
    
    .nb-login {
        max-width: none;
        padding: 20px 25px;
        border-radius: 2px;
        box-shadow: 0px 0px 15px rgba(255, 255, 255, 0.05);
        align-content: center;
        overflow: auto;
    }
    
    .nb-login h3 {
        font-size: 13px;
        line-height: 13px;
        margin: 15px 0px 25px 0px;
        text-transform: uppercase;
        color: #ffffff;
    }
    
    .nb-login h2 {
        font-family: 'Open Sans', sans-serif;
    }
    
    .nb-login h5 {
        color: #fff;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300; 
        margin-top: 10px;
    }
    
    .nb-login #checkboxes1 {
        margin-left: 15px;
        margin-top: 10px;
    }
    
    .nb-login p {
        color: #bdc3c7;
        font-family: 'Open Sans', sans-serif;
    }
    
    .nb-login form {
        margin-bottom: 15px;
        color: #ffffff;
        font-family: 'Open Sans', sans-serif;
    }
    
    .nb-login form input,
    .nb-login form textarea {
        padding: 6px 5px;
        color: #ffffff;
        border: 0px;
        border-bottom: 1px solid rgba(255, 255, 255, 0.5);
        background: transparent;
        border-radius: 0px;
    }
    
    .form-group input:focus {
        background: rgba(255, 255, 255, 0.05);
        color: #ecf0f1;
    }
    
    .nb-login form .btn {
        border-radius: 25px;
    }
    
    .nb-login .center {
        text-align: center;
    }
    
    .nb-login small {
        color: #c0392b;
        font-size: 14px;
        font-family: 'Raleway', sans-serif;
        font-weight: 600;
        display: none;
    }
    
    #valRequired {
        position: fixed;
        z-index: 10000000;
        top:30%;
        left: 40%;
        box-shadow: 10px 30px 20px rgba(0,0,0,.5);
        padding: 20px;
        display: none;
    }
    
    #close-card:hover {
        background-color: #34495e;
        border-color: #34495e;
        
    }
    
    .vertical-center {
        align-items: center;
        text-align: center;
    }
    
    .form-group h5 {
        margin-right: 10px;
    }
    
    @media (max-width:700px) {
        #valRequired {
        position: fixed;
        z-index: 10000000;
        top:30%;
        left: 29%;
        box-shadow: 10px 30px 20px rgba(0,0,0,.5);
        padding: 20px;
        display: none;
        }
    }
    
    @media (max-width:490px) {
        #valRequired {
        position: fixed;
        z-index: 10000000;
        top:30%;
        left: 19%;
        box-shadow: 10px 30px 20px rgba(0,0,0,.5);
        padding: 20px;
        display: none;
        }
    }
     
    @media (max-width:378px) {
        #valRequired {
        position: fixed;
        z-index: 10000000;
        top:30%;
        left: 9%;
        box-shadow: 10px 30px 20px rgba(0,0,0,.5);
        padding: 20px;
        display: none;
        }
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
      line-height: 15px;
      margin-left: -12px;
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
</style>
