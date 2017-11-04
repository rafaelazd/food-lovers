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
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="nome" ref="nome"  placeholder="Nome">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="sobrenome" ref="sobrenome"  required placeholder="Sobrenome" id="sobrenome">
                            </div>
                            <div class="form-group">
                            <input type="number" class="form-control" name="idade" ref="idade"  placeholder="Idade">
                            </div>
                            <div class="form-group d-flex justify-content-center form-inline">
                               <h5>Preferência em</h5>
                                 <b-form-checkbox id="checkbox" ref="checkbox1" value="Homens"> Homens </b-form-checkbox>
                                 <b-form-checkbox id="checkbox" ref="checkbox2" value="Mulheres"> Mulheres </b-form-checkbox>
                            </div>
                            <div class="d-flex justify-content-center">
                               <h5>Sexo</h5>
                                    <p>
                                      <input type="radio" class="option-input radio" name="radio" id="radio1" ref="radio1"/>
                                      <i class="fa fa-genderless" aria-hidden="true"></i> Agênero
                                    </p>
                                    <p>
                                      <input type="radio" class="option-input radio" name="radio" id="radio2" ref="radio2"/>
                                      <i class="fa fa-venus-mars" aria-hidden="true"></i> Bigênero
                                    </p>
                                    <p>
                                      <input type="radio" class="option-input radio" name="radio" id="radio3" ref="radio3"/>
                                      <i class="fa fa-transgender-alt" aria-hidden="true"></i> Transgênero
                                    </p>
                                    <p>
                                      <input type="radio" class="option-input radio" name="radio" id="radio4" ref="radio4"/>
                                      <i class="fa fa-mars" aria-hidden="true"> </i> Masculino
                                    </p>
                                    <p>
                                      <input type="radio" class="option-input radio" name="radio" id="radio5" ref="radio5"/>
                                      <i class="fa fa-venus" aria-hidden="true"></i> Feminino
                                    </p>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="usuario" ref="usuario" required placeholder="Usuário">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" name="senha" ref="senha" required placeholder="Senha">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" name="senha2" ref="senha2" required placeholder="Confirmar Senha">
                            </div>
                            <div class="form-group">
                            <router-link class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" to="/usuario-nao-autenticado">Cancelar</router-link>
                            <b-button class="btn btn-outline-secondary btn-lg" v-on:click="realizaLogin" >Confirmar</b-button>
                            </div>
                            <!-- Alerta -->
                            <b-alert variant="danger" id="alert1">Todos os campos devem ser preenchidos!</b-alert>
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
            if (this.$refs.nome.value=="" && this.$refs.email.value=="" && this.$refs.sobrenome.value=="" && this.$refs.idade.value=="" && this.$refs.usuario.value=="" && this.$refs.senha.value=="" && this.$refs.senha2.value=="") {
                 console.log('Falha no login');
                 alert("Todos os campos devem ser preenchidos!");
            } 
            
            else if (this.$refs.checkbox1.checked==false && this.$refs.checkbox2.checked==false ) {
                     console.log('Falha no login');
                     alert("Você deve selecionar pelo menos uma das Preferências!");
            }
            
            else if (this.$refs.email.value.indexOf('@')==-1 || this.$refs.email.value.indexOf('.')==-1 ) {
                     console.log('Falha no login');
                     alert("Você deve digitar um endereço de e-mail válido!");
                     this.$refs.email.focus();
            }
            
            else if (this.$refs.usuario.value.length<4 ) {
                     console.log('Falha no login');
                     alert("Seu usuário tem que ter no mínimo 4 caracteres!");
                     this.$refs.usuario.focus();
            }
           
            else if (this.$refs.usuario.value.length>10 ) {
                     console.log('Falha no login');
                     alert("Seu usuário tem que ter no máximo 10 caracteres!");
                     this.$refs.usuario.focus();
            }
           
            else if (this.$refs.senha.value.length<7 ) {
                     console.log('Falha no login');
                     alert("Sua Senha tem que ter no mínimo 7 caracteres!");
                     this.$refs.senha.focus();
            }
           
            else if (this.$refs.senha.value.length>20 ) {
                     console.log('Falha no login');
                     alert("Sua Senha tem que ter no máximo 20 caracteres!");
                     this.$refs.senha.focus();
            }
            
            else if(this.$refs.senha.value != this.$refs.senha2.value) {
                    console.log('Falha no login');
                     alert("As senhas informadas precisam ser iguais!");
                     this.$refs.senha2.focus();
            }
            
            else if (this.$refs.radio1.checked==false && this.$refs.radio2.checked==false && this.$refs.radio3.checked==false && this.$refs.radio4.checked==false && this.$refs.radio5.checked==false) {
                     console.log('Falha no login');
                     alert("Você deve selecionar pelo menos uma das opções de Gênero!");
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
    
    .nb-login form ::-webkit-input-placeholder {
        color: #ffffff;
    }
    
    .nb-login form ::-moz-placeholder {
        color: #ffffff;
    }
    
    .nb-login form :-ms-input-placeholder {
        color: #ffffff;
    }
    
    .nb-login form .btn {
        border-radius: 25px;
    }
    
    .nb-login form .btn:hover {
        background: #7f8c8d;
        color: #fff;
    }
    
    .nb-login .center {
        text-align: center;
    }
    
    .nb-login .or {
        color: #FFF;
    }
    
    .vertical-center {
        align-items: center;
        text-align: center;
    }
    
    .form-group h5 {
        margin-right: 10px;
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
