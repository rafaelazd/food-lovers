<template>
   <section id="inicio-cover">
       <div class="container">
       <!-- Navbar -->
       <nav-all></nav-all> <br>
       <!-- END Navbar -->
   
       <!-- Back Button -->
        <div class="backset">
            <router-link class="btn btn-outline-secondary" toggleable="md" role="button" aria-pressed="true" to="/inicio"><i class="fa fa-arrow-left" aria-hidden="true"></i></router-link>
        </div>
        <!--END Back Button -->
    
        <!-- Preferencias Card -->
        <div class="head">
            <h1>Alterar Preferências</h1><br>
            <p>Modifique suas preferências culinárias quando quiser.</p>
            <p id="txtPref" style="display:none">{{checkselected}}</p>
        </div> 
        <div class="preferencias">
           <div class="categorias">
               <form action="" name="formChangePref" class="change-pref">
                   <b-row class="d-flex justify-content-center">
                       <b-col class="options">
                        <label for="check1" class="btn" value="1">
                                <img src="/static/img/hotdog.png" class="select-img" alt="Hot Dog">
                                <b-form-checkbox v-model="checkselected" id="check1" value="1"></b-form-checkbox>
                        </label>
                       </b-col>
                       <b-col class="options">
                           <label for="check2" class="btn">
                                <img src="/static/img/bolo.png" class="select-img" alt="Bolo">
                                <b-form-checkbox id="check2"  v-model="checkselected" value="2"></b-form-checkbox>
                           </label>
                       </b-col>
                       <b-col class="options">
                           <label for="check3" class="btn">
                                 <img src="/static/img/cafe.png" class="select-img" value="5" alt="Café">
                                 <b-form-checkbox id="check3"  v-model="checkselected" value="5"></b-form-checkbox>
                           </label>
                       </b-col>
                   </b-row>
                   <b-row class="d-flex justify-content-center">
                       <b-col class="options">
                          <label for="check4" class="btn">
                                 <img src="/static/img/sorvete.png" class="select-img" value="3" alt="Sorvete">
                                 <b-form-checkbox id="check4"  v-model="checkselected" value="3" ></b-form-checkbox>
                          </label>
                       </b-col>
                       <b-col class="options">
                           <label for="check5" class="btn">
                                <img src="/static/img/pizza.png" class="select-img" alt="Pizza">
                                <b-form-checkbox id="check5"  v-model="checkselected" value="11"></b-form-checkbox>
                           </label>
                       </b-col>
                       <b-col class="options">
                          <label for="check6" class="btn">
                                <img src="/static/img/nachos.png" class="select-img" alt="Nachos">
                                <b-form-checkbox id="check6"  v-model="checkselected" value="9"></b-form-checkbox>
                          </label>
                       </b-col>
                   </b-row>
                   <b-row class="d-flex justify-content-center">
                       <b-col class="options">
                          <label for="check7" class="btn">
                                 <img src="/static/img/churrasco.png" class="select-img" alt="Churrasco">
                                 <b-form-checkbox id="check7"  v-model="checkselected" value="6"></b-form-checkbox>
                          </label>
                       </b-col>
                       <b-col class="options">
                          <label for="check8" class="btn">
                                 <img src="/static/img/spaghetti.png" class="select-img" alt="Spaghetti">
                                 <b-form-checkbox id="check8"  v-model="checkselected" value="8"></b-form-checkbox>
                          </label>
                       </b-col>
                       <b-col class="options">
                          <label for="check9" class="btn">
                                 <img src="/static/img/sopa.png" class="select-img" alt="Sopa">
                                 <b-form-checkbox id="check9"  v-model="checkselected" value="13"></b-form-checkbox>
                          </label>
                       </b-col>
                   </b-row>
                   <b-row class="d-flex justify-content-center">
                       <b-col class="options">
                          <label for="check10" class="btn">
                                 <img src="/static/img/salada.png" class="select-img" alt="Salada">
                                 <b-form-checkbox id="check10"  v-model="checkselected" value="12"></b-form-checkbox>
                          </label>
                       </b-col>
                       <b-col class="options">
                          <label for="check11" class="btn">
                                 <img src="/static/img/sanduiche.png" class="select-img" alt="Sanduiche">
                                 <b-form-checkbox id="check11" v-model="checkselected" value="7"></b-form-checkbox>
                          </label>
                       </b-col>
                       <b-col class="options">
                          <label for="check12" class="btn">
                                 <img src="/static/img/sushi.png" class="select-img" alt="Sushi">
                                 <b-form-checkbox id="check12" v-model="checkselected" value="14"></b-form-checkbox>
                          </label>
                       </b-col>
                   </b-row>
                   <b-row class="d-flex justify-content-center">
                       <b-col class="options">
                          <label for="check13" class="btn">
                                 <img src="/static/img/batata.png" class="select-img" alt="Batata Frita">
                                 <b-form-checkbox id="check13"  v-model="checkselected" value="4"></b-form-checkbox>
                          </label>
                       </b-col>
                       <b-col class="options">
                          <label for="check14" class="btn">
                                 <img src="/static/img/tacos.png" class="select-img" alt="Tacos">
                                 <b-form-checkbox id="check14"  v-model="checkselected" value="15"></b-form-checkbox>
                          </label>
                       </b-col>
                       <b-col class="options">
                          <label for="check15" class="btn">
                                 <img src="/static/img/panquecas.png" class="select-img" alt="Panquecas">
                                 <b-form-checkbox id="check15"  v-model="checkselected" value="10"></b-form-checkbox>
                          </label>
                       </b-col>
                   </b-row>
                   <b-button id="confirma" class="float-right" variant="outline-success" @click="upPreferencias">Confirmar</b-button>
               </form>
           </div>
           </div>
           <!-- Footer -->
                <b-row class="foot-bar" id="pref">
                    <pref v-for="pref in prefs"  :key="pref.id" :pref="pref"></pref>
                </b-row>
           <!-- END Footer-->
            <!-- Avisos -->
                <div id="upFail"class="card text-white bg-danger mb-3" style="max-width: 20rem;">
                  <div class="card-body">
                        <h4 class="card-title">Opa!</h4>
                        <p class="card-text">Sua barra de preferências está cheia! Tente excluir algumas.</p>
                        <b-button variant="warning" id="close">Voltar</b-button>
                  </div>
                </div>
           <!-- END Avisos-->
        <!-- END Preferencias Card -->

       </div>
  </section>
</template>


<script>
import Prefs from '@/components/Prefs'
import axios from 'axios'
export default {
    components: {
            'pref': Prefs
        },
        
        data() {
            return {
                prefs: [],
                checkselected: []
            }
        },
        
        created() {
            this.buscarPrefs();  
        },

        methods: {
            buscarPrefs() {
                axios.get('http://localhost:8060/pessoas/3/preferencias')
                    .then((resp) => {
                        this.erro = false;
                        this.prefs = resp.data._embedded.preferencias;
                        console.log(resp.data);
                    })
                    .catch((err) => {
                        this.erro = true;
                        console.log(err)
                    });
            },
            
            upPreferencias() {
                var count = $("#pref").children().length;
                var value = document.getElementById("txtPref").innerHTML.replace(/[^a-zA-Z0-9]/g,'');
                var variav;
                if(count < 5) {
                    
                    axios({
                      method: 'patch',
                      url: 'http://localhost:8060/pessoas/3/preferencias',
                      headers: { 'Content-Type': 'text/uri-list' },
                      data: 'http://localhost:8060/preferencias/' + value
                    })
                        .then(function (resp) {
                            console.log(resp);
                            window.location.reload();
                        })
                        .catch(function (err) {
                            console.log(err);
                        });
                } else {
                    document.getElementById("upFail").style.display="block";
                    document.getElementById('close').onclick = function(){
                    document.getElementById("upFail").style.display = "none";
                    };
                }
            }
        }
}
</script>


<style>
    @import url('https://fonts.googleapis.com/css?family=Exo|Raleway:400,700,800|Poiret+One|Open+Sans+Condensed:300,300i');
    #inicio-cover {
        height: 100vh;
        width: 100vw;
        background-size: cover;
        display: flex;
    }
    
    .container {
        min-width: 100vw;
        height: 100vh;
        left: 0px;
        padding: 0px;
        overflow: auto;
    }
    
    .container nav {
        background-color: #34495e;
        max-width: none;
        min-width: 100vw;
        font-family: 'Exo', sans-serif;
    }
    
    .backset {
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
        margin-bottom: 30px;
    }
    
    .categorias {
        margin-bottom: 170px;
    }
    
    #confirma {
        margin-right: 30px;
    }
    
    .preferencias {
        padding-left: 10px;
        padding-right: 10px;
    }
    
    .preferencias .categorias .options {
        margin: 40px;
        text-align: center;
        justify-content: center;
    }
    
    .preferencias .categorias .options .btn {
        background-color: transparent;
        border-color: transparent;
        width: 180px;
        height: 210px;
        cursor: pointer;
    }
    
    .preferencias .categorias .select-img:hover {
        box-shadow: 5px 5px 10px 3px rgba(0, 0, 0, 0.5);
        margin-top: -5px;
        -webkit-transition: all 0.3s ease-in-out;
        -moz-transition: all 0.3s ease-in-out;
        -o-transition: all 0.3s ease-in-out;
        transition: all 0.3s ease-in-out;
    }
    
    .preferencias .categorias .options img {
        width: 100%;
        height: 100%;
    }
    
    .options .custom-control {
        position: relative;
        margin-left: -30px;
        bottom: -84px;
        display: inline-flex;
        min-height: 1.5rem;
        padding-left: 1.5rem;
        margin-right: 1rem;
    }
    
    #pref {
        text-align: center;
        justify-content: center;
        position: fixed;
        bottom: 0px;
        width: 100%;
        background-color: #fff;
        border-top: 1.5px solid;
        border-top-color: #ecf0f1;
        box-shadow: 0 -6px 10px -4px #7f8c8d;
    }
    
    #pref img {
        width: 110px;
        height: 110px;
        margin-right: 20px;
        margin-left: 20px;
    }
    
    #pref .btn {
        margin-left: -50px;
        margin-bottom: 70px;
        color: #fff;
        border-radius: 90px;
        font-size: 15px;
        width: 35px;
        height: 35px;
    }
    
    #upFail {
        position: fixed;
        z-index: 10000000;
        top:30%;
        left: 40%;
        box-shadow: 10px 30px 20px rgba(0,0,0,.5);
        padding: 20px;
        display: none;
    }
    
    @media (max-width: 320px) {
        #pref img {
            width: 60px;
            height: 60px;
        }
        .preferencias .categorias .options {
            margin: 5px;
            text-align: center;
            justify-content: center;
        }
        .preferencias .categorias .options .btn {
            width: 180px;
            height: 210px;
        }
        #pref {
            padding-left: 0px;
            position: fixed;
        }
        #pref .btn {
            margin-bottom: 0px;
            margin-left: 0px;
            margin-top: -125px;
            padding-left: 5px;
            padding-top: 2px;
            width: 18px;
            height: 18px;
            font-size: 9px;
            justify-content: center;
        }
        .form-inline {
            justify-content: center;
            margin-left: -30px;
            margin-bottom: -20px;
        }
        .form-inline .col {
            width: 90px;
            padding-right: 15px;
            padding-left: 15px;
        }
    }
    
    @media (min-width: 320px) and (max-width: 375px) {
        #pref img {
            width: 60px;
            height: 60px;
        }
        .preferencias .categorias .options {
            margin: 5px;
            text-align: center;
            justify-content: center;
        }
        .preferencias .categorias .options .btn {
            width: 180px;
            height: 210px;
        }
        #pref {
            padding-left: 0px;
            position: fixed;
        }
        #pref .btn {
            margin-bottom: 0px;
            margin-left: 0px;
            margin-top: -125px;
            padding-left: 5px;
            padding-top: 2px;
            width: 18px;
            height: 18px;
            font-size: 9px;
            justify-content: center;
        }
        .form-inline {
            justify-content: center;
            margin-left: -30px;
            margin-bottom: -20px;
        }
        .form-inline .col {
            width: 90px;
            padding-right: 15px;
            padding-left: 15px;
        }
    }
    
    @media (min-width: 375px) and (max-width: 425px) {
        #pref img {
            width: 70px;
            height: 70px;
        }
        .preferencias .categorias .options {
            margin: 5px;
            text-align: center;
            justify-content: center;
        }
        .preferencias .categorias .options .btn {
            width: 180px;
            height: 210px;
        }
        #pref {
            padding-left: 0px;
            position: fixed;
        }
        #pref .btn {
            margin-bottom: 0px;
            margin-left: -15px;
            margin-top: -140px;
            padding-left: 5px;
            padding-top: 2px;
            width: 18px;
            height: 18px;
            font-size: 9px;
            justify-content: center;
        }
        #pref .form-inline {
            justify-content: center;
            margin-left: -30px;
            margin-bottom: -30px;
        }
        #pref .form-inline .col {
            width: 110px;
            padding-right: 15px;
            padding-left: 15px;
            margin-bottom: 0px;
            max-height: 30px;
        }
    }
    
    @media (min-width: 425px) and (max-width: 768px) {
        #pref img {
            width: 90px;
            height: 90px;
        }
        .preferencias .categorias .options {
            margin: 5px;
            text-align: center;
            justify-content: center;
        }
        .preferencias .categorias .options .btn {
            width: 180px;
            height: 210px;
        }
        #pref {
            padding-left: 0px;
            position: fixed;
        }
        #pref .btn {
            margin-bottom: 0px;
            margin-left: -60px;
            margin-top: -170px;
            padding-left: 5px;
            padding-top: 2px;
            width: 20px;
            height: 20px;
            font-size: 9px;
            justify-content: center;
        }
        #pref .form-inline {
            justify-content: center;
            margin-left: 0px;
            margin-bottom: -30px;
        }
        #pref .form-inline .col {
            width: 160px;
            padding-right: 15px;
            padding-left: 15px;
            margin-bottom: 0px;
            max-height: 30px;
        }
    }

</style>
