<template>
   <section id="cad-cover">
       <div class="container">
        <div class="horizontal-center">
                <div class="nb-login">
                   <div class="progress">
                    <div class="progress-bar bg-info" role="progressbar" style="width: 66%" aria-valuenow="66" aria-valuemin="0" aria-valuemax="100"></div>
                    </div> <br> <br>
                    <h1><img src="/static/img/foodlovers.png" class="img-fluid"></h1>
                    <p>Selecione até 5 categorias culinárias de sua preferência.</p>
                    <!-- Formulario -->
                    <div class="card-block">
                        <form class="form" role="form" autocomplete="off" name="form" id="form" action="">
                           <b-row class="d-flex justify-content-center">
                               <b-col class="options">
                                   <label for="check1" class="btn">
                                       <img src="/static/img/hotdog.png" class="select-img" id="hotdog" alt="Hot Dog">
                                       <b-form-checkbox v-model="selected" id="check1" class="prefer" name="hotdog" ref="prefer" value="HotDog"></b-form-checkbox>
                                   </label>
                               </b-col>
                               <b-col class="options">
                                   <label for="check2" class="btn">
                                       <img src="/static/img/bolo.png" class="select-img" id="bolo" alt="Bolo">
                                       <b-form-checkbox v-model="selected" id="check2" class="prefer" name="bolo" ref="prefer" value="Bolo"></b-form-checkbox>
                                   </label>
                               </b-col>
                               <b-col class="options">
                                   <label for="check3" class="btn">
                                       <img src="/static/img/cafe.png" class="select-img" id="cafe" alt="Café">
                                       <b-form-checkbox v-model="selected" id="check3" class="prefer" name="cafe" ref="prefer" value="Café"></b-form-checkbox>
                                   </label>
                               </b-col>
                           </b-row>
                           <b-row class="d-flex justify-content-center">
                               <b-col class="options">
                                  <label for="check4" class="btn">
                                       <img src="/static/img/sorvete.png" class="select-img" id="sorvete" alt="Sorvete">
                                       <b-form-checkbox v-model="selected" id="check4" class="prefer" name="sorvete" ref="prefer" value="Sorvete"></b-form-checkbox>
                                   </label>
                               </b-col>
                               <b-col class="options">
                                   <label for="check5" class="btn">
                                       <img src="/static/img/pizza.png" class="select-img" id="pizza" alt="Pizza">
                                       <b-form-checkbox v-model="selected" id="check5" class="prefer" name="pizza" ref="prefer" value="Pizza"></b-form-checkbox>
                                   </label>
                               </b-col>
                               <b-col class="options">
                                 <label for="check6" class="btn">
                                       <img src="/static/img/nachos.png" class="select-img" id="nachos" alt="Nachos">
                                       <b-form-checkbox v-model="selected" id="check6" class="prefer" name="nachos" ref="prefer" value="Nachos"></b-form-checkbox>
                                   </label>
                               </b-col>
                           </b-row>
                           <b-row class="d-flex justify-content-center">
                               <b-col class="options">
                                  <label for="check7" class="btn">
                                       <img src="/static/img/churrasco.png" class="select-img" id="churrasco" alt="Churrasco">
                                       <b-form-checkbox v-model="selected" id="check7" class="prefer" name="churrasco" ref="prefer" value="Churrasco"></b-form-checkbox>
                                   </label>
                               </b-col>
                               <b-col class="options">
                                  <label for="check8" class="btn">
                                       <img src="/static/img/spaghetti.png" class="select-img" id="spaghetti" alt="Spaghetti">
                                       <b-form-checkbox v-model="selected" id="check8" class="prefer" name="spaghetti" ref="prefer" value="Spaghetti"></b-form-checkbox>
                                   </label>
                               </b-col>
                               <b-col class="options">
                                  <label for="check9" class="btn">
                                       <img src="/static/img/sopa.png" class="select-img" id="sopa" alt="Sopa">
                                       <b-form-checkbox v-model="selected" id="check9" class="prefer" name="sopa" ref="prefer" value="Sopa"></b-form-checkbox>
                                   </label>
                               </b-col>
                           </b-row>
                           <div id="valRequired"class="card text-white bg-danger mb-3" style="max-width: 20rem;">
                              <div class="card-body">
                                <h4 class="card-title">Opa!</h4>
                                <p class="card-text">Ao menos uma preferência deve ser selecionada!</p>
                                <b-button variant="warning" id="close-card">Voltar</b-button>
                              </div>
                            </div>
                            <div id="numeropref" class="card text-white bg-danger mb-3" style="max-width: 20rem;">
                              <div class="card-body">
                                <h4 class="card-title">Opa!</h4>
                                <p class="card-text">Você pode selecionar no máximo 5 preferências.</p>
                                <b-button variant="warning" id="close-card2">Voltar</b-button>
                              </div>
                            </div>
                            <router-link class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" to="/usuario-nao-autenticado">Cancelar</router-link>
                            <router-link class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" to="/cadastro-1">Voltar</router-link>
                            <b-button class="btn btn-outline-secondary btn-lg" v-on:click="cadastrar">Confirmar</b-button>
                        </form>
                    </div>
                </div>
        </div>
        </div>
    </section>
</template>


<script>
export default {
    data () {
        return {
            selected: []
        }
    },
    
    methods: {
        cadastrar() {
            var x = this.$refs.prefer.checked;
            if(document.form.hotdog.checked == false && document.form.bolo.checked == false && document.form.cafe.checked == false && document.form.sorvete.checked == false && document.form.pizza.checked == false && document.form.nachos.checked == false && document.form.churrasco.checked == false && document.form.spaghetti.checked == false && document.form.sopa.checked == false ) {
                    console.log('Falha no login');
                     document.getElementById("valRequired").style.display = "block";
                     document.getElementById('close-card').onclick = function(){
                        document.getElementById("valRequired").style.display = "none";
                    };
            } else if(x.length>5) {
                    console.log('Falha no login');
                    document.getElementById("numeropref").style.display = "block";
                    document.getElementById('close-card2').onclick = function(){
                        document.getElementById("numeropref").style.display = "none";
                    };      
            } else {
                this.$router.push('cadastro-3');
                console.log('Login!');
            }
        }
    }
}
</script>

<style scoped>
   #cad-cover {
        height: 100vh;
        width: 100vw;
        background: #222 url('/static/img/boys.png') no-repeat center center fixed; 
        background-size: cover;
        display: flex;
        overflow: auto;
    }

    
    .nb-login {
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
        font-family: 'Asap Condensed', sans-serif;
    }
    
    .nb-login p {
        color: #bdc3c7;
    }
    
    .nb-login form {
        margin-bottom: 15px;
        color: #ffffff;
    }
    
    .nb-login form input,
    .nb-login form textarea {
        box-shadow: none !important;
        padding: 6px 5px;
        color: #ffffff;
        border: 0px;
        border-bottom: 1px solid rgba(255, 255, 255, 0.5);
        background: transparent;
        border-radius: 0px;
    }
    
    .nb-login form input:focus {
        background: rgba(255, 255, 255, 0.05);
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
    
    .nb-login form .btn-lg {
        border-radius: 25px;
    }
    
    .nb-login form .btn-lg:hover {
        background: #7f8c8d;
        color: #fff;
    }
    
    .nb-login .center {
        text-align: center;
    }
    
    .nb-login .or {
        color: #FFF;
    }
    
    .horizontal-center {
        align-items: center;
        text-align: center;
    }
    
    .nb-login .options .btn {
        background-color: transparent;
        border-color: transparent;
        width: 180px;
        height: 210px;
        cursor: pointer;
    }
    
    .nb-login .select-img:hover {
        box-shadow: 5px 5px 10px 3px rgba(0, 0, 0, 0.5);
        margin-top: -5px;
        -webkit-transition: all 0.3s ease-in-out;
        -moz-transition: all 0.3s ease-in-out;
        -o-transition: all 0.3s ease-in-out;
        transition: all 0.3s ease-in-out;
    }
    
    .nb-login .options img {
        width: 100%;
        height: 100%;
    }
    
    .nb-login .custom-control {
        position: relative;
        margin-left: -30px;
        bottom: -84px;
        display: inline-flex;
        min-height: 1.5rem;
        padding-left: 1.5rem;
        margin-right: 1rem;
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
    
     #numeropref {
        position: fixed;
        z-index: 10000000;
        top:30%;
        left: 40%;
        box-shadow: 10px 30px 20px rgba(0,0,0,.5);
        padding: 20px;
        display: none;
    }
    
    @media (max-width:805px) {
        #valRequired {
        top:30%;
        left: 29%;
        }
        
        #numeropref{
        top:30%;
        left: 29%;
        } 
    }
    
    @media (max-width:497px) {
        #valRequired {
        top:30%;
        left: 13%;
        }
        
        #numeropref {
        top:30%;
        left: 13%;
        }
    }
     
    @media (min-width:500px) and (max-width:697px) {
        #valRequired {
        top:30%;
        left: 28%;
        }
        
        #numeropref {
        top:30%;
        left: 28%;
        }
    }
</style>
