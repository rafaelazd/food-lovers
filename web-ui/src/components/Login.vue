<template>
   <section id="login-cover">
    <div class="mx-auto">
        <div class="vertical-center">
                <div class="nb-login">
                    <h1><img src="/static/img/foodlovers.png" class="img-fluid"></h1>
                    <!-- Formulario -->
                    <div class="card-block" id="login">
                        <form class="form" role="form" autocomplete="off" id="formLogin" action="">
                            <div class="form-group">
                            <input type="text" class="form-control" ref="usuario" name="usuario" required placeholder="Usuário" id="usuario">
                            </div>
                            <div class="form-group">
                            <input type="password" name="senha" ref="senha" class="form-control" id="senha" required placeholder="Senha" autocomplete="new-password">
                            </div>
                            <b-button class="btn btn-block btn-success" v-on:click="realizaLogin" >Entrar</b-button>
                            <h5>Não tem uma conta?</h5>
                            <b-button variant="info"class="cad" v-bind:href="toCadastro">Cadastre-se</b-button>
                        </form>
                    </div>
                    <!-- end Formulario -->
                </div>
        </div>
    </div>
  </section>
</template>


<script>
import axios from 'axios'
export default {
    data() {
        return {
            login: '',
            toCadastro: '#/cadastro-1'
        }
    },
    
    created () {
        this.buscarDados()
    },
    methods: {
        buscarDados () {
             axios.get('http://localhost:8060/pessoas/2')
                  .then(function (response) {
                    console.log(response);
                  })
                  .catch(function (error) {
                    console.log(error);
                  });
//                  this.$router.push('inicio');
            }
    }
}

</script>


<style scoped="true">
    @import url('https://fonts.googleapis.com/css?family=Exo|Raleway:400,700,800|Poiret+One');
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
         padding: 6px 5px;
        color: #ffffff;
        border: 0px;
        border-bottom: 1px solid rgba(255, 255, 255, 0.5);
        background: transparent;
        border-radius: 0px;
        
    }
    
    .nb-login form input:focus {
        background: rgba(255, 255, 255, 0.05);
        color: #ecf0f1;
    }
    
    .nb-login .btn {
        border-radius: 20px;
        margin-top: 20px;
        margin-bottom: 35px;
    }
    
    .nb-login .cad {
        margin-top: 0px;
        margin-bottom: 0px;
    }
    
    .nb-login h5 {
        font-size: 25px;
        font-family: 'Poiret One', cursive;
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
