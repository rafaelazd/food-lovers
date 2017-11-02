<template>
   <section id="login-cover">
    <div class="mx-auto">
        <div class="vertical-center">
                <div class="nb-login">
                    <h1><img src="/static/img/foodlovers.png" class="img-fluid"></h1>
                    <!-- Formulario -->
                    <div class="card-block">
                        <form class="form" role="form" autocomplete="off" id="formLogin" action="">
                            <div class="form-group">
                            <input type="text" class="form-control" name="usuario" required placeholder="Usuário" id="usuario">
                            </div>
                            <div class="form-group">
                            <input type="password" class="form-control" id="senha" required placeholder="Senha" autocomplete="new-password">
                            </div>
                            <router-link class="btn btn-block btn-outline-danger" role="button" aria-pressed="true" to="/inicio" v-on:click="realizaLogin">Entrar</router-link>
                            <div class="center or">OU</div>
                            <h3 class="center">Entrar com</h3>
                            <div class="social">
                                <a href="#" class="facebook"><i class="fa fa-facebook"></i> &nbsp; Login com Facebook</a>
                                <a href="#" class="twitter"><i class="fa fa-twitter"></i> &nbsp; Login com Twitter</a>
                                <a href="#" class="google-plus"><i class="fa fa-google-plus"></i> &nbsp; Login com Google Plus</a>
                            </div>
                        </form>
                    </div>
                    <!-- end Formulario -->
                </div>
        </div>
    </div>
  </section>
</template>


<script>
export default {
    methods: {
        realizaLogin(event) {
            debugger;
            console.log("Login!");
        }
    }
}

</script>


<style>
    #login-cover {
        height: 100vh;
        width: 100vw;
        background: #222 url('/static/img/sparkles.jpg') center no-repeat;
        background-size: cover;
        display: flex;
        align-items: center;
        
    }
    
    .nb-login {
        max-width: 300px;
        padding: 20px 25px;
        border-radius: 2px;
        box-shadow: 0px 30px 20px rgba(255, 255, 255, 0.05);
    }
    
    .nb-login h3 {
        font-size: 13px;
        line-height: 13px;
        margin: 15px 0px 25px 0px;
        text-transform: uppercase;
        color: #fff;
    }
    
    .nb-login form {
        margin-bottom: 15px;
        color: #fff;
    }
    
    .nb-login form input,
    .nb-login form textarea {
        box-shadow: none !important;
        padding: 6px 5px;
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
        border: 1px solid #e74c3c;
        color: #e74c3c;
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
        background: #e74c3c;
        color: #fff;
    }
    
    .nb-login .social a {
        display: block;
        margin-bottom: 15px;
        color: #fff;
        padding: 8px 20px;
        border-radius: 25px;
        text-align: center;
        font-size: 12px;
        text-transform: uppercase;
        font-weight: 600;
        text-decoration: none;
    }
    
    .nb-login .social a:hover {
        opacity: 0.9;
    }
    
    .nb-login .social a.facebook {
        background: #3280e7;
    }
    
    .nb-login .social a.twitter {
        background: #32c8de;
    }
    
    .nb-login .social a.google-plus {
        background: #f96f4a;
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

</style>
