<template>
   <div class="container">
        <div class="text-center">
            <div class="col-md-6">
                <div class="nb-login">
                   <div class="progress">
                    <div class="progress-bar bg-info" role="progressbar" style="width: 33%" aria-valuenow="33" aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                    <h1><img src="/static/img/foodlovers.png" class="img-fluid"></h1>
                    <p>Preencha o campo abaixo com seus dados pessoais.</p>
                    <!-- Formulario -->
                    <div class="card-block">
                        <form class="form" role="form" autocomplete="off" id="formLogin" action="">
                            <div class="form-group">
                                <input type="email" class="form-control" name="email" id="email" placeholder="E-mail">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="nome" required="" placeholder="Nome" id="nome">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="sobrenome" required="" placeholder="Sobrenome" id="sobrenome">
                            </div>
                            <div class="form-group">
                            <input type="number" class="form-control" name="idade" required="" placeholder="Idade" id="idade">
                                <div class="btn-group" data-toggle="buttons">
                                    <label class="btn btn-primary">
                                    <input type="checkbox" autocomplete="off"> Homens </label>
                                    <label class="btn btn-primary">
                                    <input type="checkbox" autocomplete="off"> Mulheres </label>
                                </div>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="usuario" required="" placeholder="Usuário" id="usuario">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" id="senha" required="" placeholder="Senha" autocomplete="new-password">
                            </div>
                            <div class="form-group">
                            <router-link class="btn btn-outline-danger btn-lg" role="button" aria-pressed="true" to="/usuario-nao-autenticado">Cancelar</router-link>
                            <router-link class="btn btn-outline-danger btn-lg" role="button" aria-pressed="true" to="/cadastro-2">Confirmar</router-link>
                            </div>
                        </form>
                    </div>

                </div>
            </div>

        </div>
    </div> 
</template>


<script>


</script>

<style>
    body {
        height: 100%;
        width: 100%;
        background: #222 url('/static/img/boys.png') center no-repeat;
        background-size: cover;
    }
    
    .nb-login {
        max-width: 300px;
        margin: 30px auto;
        padding: 20px 25px;
        border-radius: 2px;
        box-shadow: 0px 0px 10px rgba(255, 255, 255, 0.05);
    }
    
    .nb-login h3 {
        font-size: 13px;
        line-height: 13px;
        margin: 15px 0px 25px 0px;
        text-transform: uppercase;
        color: #fff;
    }
    
    .nb-login p {
        color: #bdc3c7;
    }
    
    .nb-login form {
        margin-bottom: 15px;
        color: #fff;
    }
    
    .nb-login form input,
    .nb-login form textarea {
        box-shadow: none !important;
        padding: 6px 5px;
        color: #fff;
        border: 0px;
        border-bottom: 1px solid rgba(255, 255, 255, 0.5);
        background: transparent;
        border-radius: 0px;
    }
    
    .nb-login form input:focus {
        background: rgba(255, 255, 255, 0.05);
    }
    
    .nb-login form ::-webkit-input-placeholder {
        color: #fff;
    }
    
    .nb-login form ::-moz-placeholder {
        color: #fff;
    }
    
    .nb-login form :-ms-input-placeholder {
        color: #ffffff;
    }
    
    .nb-login form .btn {
        border: 0px;
        border-radius: 25px;
        padding: 10px 20px;
        border: 1px solid #bdc3c7;
        color: #bdc3c7;
        text-transform: uppercase;
        font-weight: 600;
        background: transparent;
        margin-top: 15px;
        -webkit-transition: all 0.5s ease;
        -moz-transition: all 0.5s ease;
        -o-transition: all 0.5s ease;
        -ms-transition: all 0.5s ease;
        transition: all 0.5s ease;
    }
    
    .nb-login form .btn:hover {
        background: #bdc3c7;
        color: #fff;
    }
    
    .nb-login .center {
        text-align: center;
    }
    
    .nb-login .or {
        color: #FFF;
    }
    
    .vertical-center {
        min-height: 100%;
        min-height: 100vh;
        align-items: center;
    }

</style>
