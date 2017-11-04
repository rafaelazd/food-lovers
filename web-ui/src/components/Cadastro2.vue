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
                        <form class="form" role="form" autocomplete="off" id="formCad" action="">
                           <b-row class="d-flex justify-content-center">
                               <b-col class="options">
                                   <label for="check1" class="btn">
                                       <img src="/static/img/hotdog.png" class="select-img" id="hotdog" alt="Hot Dog">
                                       <b-form-checkbox v-model="selected" id="check1" value="HotDog"></b-form-checkbox>
                                   </label>
                               </b-col>
                               <b-col class="options">
                                   <label for="check2" class="btn">
                                       <img src="/static/img/bolo.png" class="select-img" id="bolo" alt="Bolo">
                                       <b-form-checkbox v-model="selected" id="check2" value="Bolo"></b-form-checkbox>
                                   </label>
                               </b-col>
                               <b-col class="options">
                                   <label for="check3" class="btn">
                                       <img src="/static/img/cafe.png" class="select-img" id="cafe" alt="Café">
                                       <b-form-checkbox v-model="selected" id="check3" value="Café"></b-form-checkbox>
                                   </label>
                               </b-col>
                           </b-row>
                           <b-row class="d-flex justify-content-center">
                               <b-col class="options">
                                  <label for="check4" class="btn">
                                       <img src="/static/img/sorvete.png" class="select-img" id="sorvete" alt="Sorvete">
                                       <b-form-checkbox v-model="selected" id="check4" value="Sorvete"></b-form-checkbox>
                                   </label>
                               </b-col>
                               <b-col class="options">
                                   <label for="check5" class="btn">
                                       <img src="/static/img/pizza.png" class="select-img" id="pizza" alt="Pizza">
                                       <b-form-checkbox v-model="selected" id="check5" value="Pizza"></b-form-checkbox>
                                   </label>
                               </b-col>
                               <b-col class="options">
                                 <label for="check6" class="btn">
                                       <img src="/static/img/nachos.png" class="select-img" id="nachos" alt="Nachos">
                                       <b-form-checkbox v-model="selected" id="check6" value="Nachos"></b-form-checkbox>
                                   </label>
                               </b-col>
                           </b-row>
                           <b-row class="d-flex justify-content-center">
                               <b-col class="options">
                                  <label for="check7" class="btn">
                                       <img src="/static/img/churrasco.png" class="select-img" id="churrasco" alt="Churrasco">
                                       <b-form-checkbox v-model="selected" id="check7" value="Churrasco"></b-form-checkbox>
                                   </label>
                               </b-col>
                               <b-col class="options">
                                  <label for="check8" class="btn">
                                       <img src="/static/img/spaghetti.png" class="select-img" id="spaghetti" alt="Spaghetti">
                                       <b-form-checkbox v-model="selected" id="check8" value="Spaghetti"></b-form-checkbox>
                                   </label>
                               </b-col>
                               <b-col class="options">
                                  <label for="check9" class="btn">
                                       <img src="/static/img/sopa.png" class="select-img" id="sopa" alt="Sopa">
                                       <b-form-checkbox v-model="selected" id="check9" value="Sopa"></b-form-checkbox>
                                   </label>
                               </b-col>
                           </b-row>
                            <router-link class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" to="/usuario-nao-autenticado">Cancelar</router-link>
                            <router-link class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" to="/cadastro-1">Voltar</router-link>
                            <router-link class="btn btn-outline-secondary btn-lg" role="button" aria-pressed="true" to="/cadastro-3">Confirmar</router-link>
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
</style>
