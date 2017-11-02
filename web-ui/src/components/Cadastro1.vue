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
                                <input type="email" class="form-control" name="email" required="" id="email" placeholder="E-mail">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="nome" required="" placeholder="Nome" id="nome">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="sobrenome" required="" placeholder="Sobrenome" id="sobrenome">
                            </div>
                            <div class="form-group">
                            <input type="number" class="form-control" name="idade" required="" placeholder="Idade" id="idade">
                            </div>
                            <div class="form-group d-flex justify-content-center">
                               <h5>Preferência em</h5>
                                <app-checkbox></app-checkbox>
                            </div>
                            <div class="d-flex justify-content-center">
                               <h5>Sexo</h5>
                                    <p>
                                      <input type="radio" class="option-input radio" name="example" checked/>
                                      <i class="fa fa-genderless" aria-hidden="true"></i> Agênero
                                    </p>
                                    <p>
                                      <input type="radio" class="option-input radio" name="example" checked/>
                                      <i class="fa fa-venus-mars" aria-hidden="true"></i> Bigênero
                                    </p>
                                    <p>
                                      <input type="radio" class="option-input radio" name="example" checked/>
                                      <i class="fa fa-transgender-alt" aria-hidden="true"></i> Transgênero
                                    </p>
                                    <p>
                                      <input type="radio" class="option-input radio" name="example" checked/>
                                      <i class="fa fa-mars" aria-hidden="true"> </i> Masculino
                                    </p>
                                    <p>
                                      <input type="radio" class="option-input radio" name="example" checked/>
                                      <i class="fa fa-venus" aria-hidden="true"></i> Feminino
                                    </p>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="usuario" required="" placeholder="Usuário" id="usuario">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" name="senha1" id="senha1" required="" placeholder="Senha" autocomplete="new-password">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" name="senha2" id="senha2" required="" placeholder="Confirmar Senha" autocomplete="new-password">
                            </div>
                            <div class="form-group">
                            <router-link class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" to="/usuario-nao-autenticado">Cancelar</router-link>
                            <router-link class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" to="/cadastro-2">Confirmar</router-link>
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
    data() { 
        return {
            selected: 'first',
            options: [
                { text: '<i class="fa fa-genderless" aria-hidden="true"></i> Agênero', value: 'first' },
                { text: '<i class="fa fa-venus-mars" aria-hidden="true"></i> Bigênero', value: 'second' },
                { text: '<i class="fa fa-transgender-alt" aria-hidden="true"></i> Transgênero', value: 'third' },
                { text: '<i class="fa fa-mars" aria-hidden="true"></i> Masculino', value: 'fourth' },
                { text: '<i class="fa fa-venus" aria-hidden="true"></i> Feminino', value: 'fifth' }
            ]
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
