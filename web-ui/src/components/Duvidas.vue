<template>
   <section id="inicio-cover">
       <div class="container">
       <!-- Navbar -->
        <nav-all></nav-all> <br>
       <!-- END Navbar -->
   
       <!-- Back Button -->
        <div class="backset1">
           <router-link class="btn btn-outline-secondary" role="button" aria-pressed="true" to="/inicio"><i class="fa fa-arrow-left" aria-hidden="true"></i></router-link> 
        </div>
        <!--END Back Button -->
    
        <!-- Duvidas -->
        <div class="head">
            <h1>Envie-nos a sua dúvida</h1><br>
            <p>Pergunte o que quiser, respondemos rapidinho!</p>
        </div> <br>
        <form id="duvidas-form">
            <div class="question-body">
            <b-row>
                <b-col>
                    <b-form-textarea id="textarea2"
                     placeholder="Digite a sua dúvida"
                     :rows="4"
                     :maxlength="900"
                     name="Duvidas"
                     ref="duvida">
                    </b-form-textarea>
                    <small class="float-right">Máximo de 900 caracteres</small>
                </b-col>
            </b-row>
            <h4>Avalie o Aplicativo</h4>
            <b-row class="rating d-flex justify-content-center">
                <b-col id="ratings" @click="rating('ruim', $event)" v-bind:class="{ active: isActive.ruim }">
                    <img src="/static/img/1.PNG" alt="Triste"><br>
                    <small>Ruim</small>
                </b-col>
                <b-col id="ratings" @click="rating('razoavel', $event)" v-bind:class="{ active: isActive.razoavel }">
                    <img src="/static/img/2.PNG" alt="Razoável"><br>
                    <small>Razoável</small>
                </b-col>
                <b-col id="ratings" @click="rating('bom', $event)" v-bind:class="{ active: isActive.bom }">
                    <img src="/static/img/3.PNG" alt="Satisfeito"><br>
                    <small>Bom</small>
                </b-col>
                <b-col id="ratings" @click="rating('otimo', $event)" v-bind:class="{ active: isActive.otimo }">
                    <img src="/static/img/4.PNG" alt="Feliz"><br>
                    <small>Ótimo</small>
                </b-col>
                <b-col id="ratings" @click="rating('incrivel', $event)" v-bind:class="{ active: isActive.incrivel }">
                    <img src="/static/img/5.PNG" alt="Muito Feliz"><br>
                    <small>Incrível</small>
                </b-col>
            </b-row>
            <b-row class="btn-small">
                <b-button type="submit" id="submit-form" class="btn btn-outline-success float-left" @click="enviarDados">Confirmar</b-button>
            </b-row>
        </div>
        </form>
        <!-- END Duvidas https://script.google.com/macros/s/AKfycbx_DP7jDr23VRvLBdsIU9DNIf0Z5AFEUxd7qSfIdZmR-6AC1VM/exec-->
       </div>
  </section>
</template>


<script>
import axios from 'axios'

export default {
    data () {
        return {
           isActive: {
              ruim: true,
              razoavel: true,
              bom: true,
              otimo: true,
              incrivel: true
            }
        }
    }, 
    
    methods: {
        enviarDados() {
            
        },
        
        rating(secao, event) {           
              event.preventDefault();
              this.isActive.ruim = true;
              this.isActive.razoavel = true;
              this.isActive.bom = true;
              this.isActive.otimo = true;
              this.isActive.incrivel = true;

              switch(secao) {
                  case 'ruim':
                      this.isActive.ruim = false;
                      break;
                  case 'razoavel':
                      this.isActive.razoavel = false;
                      break;
                  case 'bom':
                      this.isActive.bom = false;
                      break;
                  case 'otimo':
                      this.isActive.otimo = false;
                      break;
                  case 'incrivel':
                      this.isActive.incrivel = false;
                      break;
             }
        }
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
        align-items: center;
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
    
    .backset1 {
        margin: 20px;
        margin-left: 50px;
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
    
    .question-body {
        margin: auto;
        width: 80%;
        background: #fff;
        padding-left: 10px;
        padding-right: 10px;
        overflow: hidden;
    }
    
    .question-body #textarea2 {
        margin-top: 10px;
        box-shadow: 10px 20px 20px rgba(0,0,0,.2);
    }
    
    .question-body .btn {
        margin-left: 25px;
        margin-bottom: 4px;
    }
    
    .question-body .btn-small {
        margin-top: 15px;
    }
    
    .question-body small {
        color: #7f8c8d;
        font-family: 'Open Sans', sans-serif;
    }
    
    .question-body h4{
        color: #34495e;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300; 
        text-align: left;
        margin-left: 20px;
        margin-top: 5px;
    }
    
    .question-body .rating {
        margin-top: 20px;
        padding-left: 50px;
        padding-right: 50px;
    }
    
    .question-body .rating img {
        width: 100px;
        height: 140px;
    }
    
    #ratings {
        text-align: center;
        justify-content: center;
    }

    #ratings:hover {
        filter: grayscale(0%);
        opacity: 1;
        box-shadow: 5px 5px 10px 3px rgba(0, 0, 0, 0.5);
        margin-top: -5px;
        -webkit-transition: all 0.3s ease-in-out;
        -moz-transition: all 0.3s ease-in-out;
        -o-transition: all 0.3s ease-in-out;
        transition: all 0.3s ease-in-out;
    }
    
    #ratings small {
        font-family: 'Raleway', sans-serif;
        color: #7f8c8d;
        font-size: 18px;    
    }
    
    .active {
        -webkit-filter: grayscale(100%); /* Safari 6.0 - 9.0 */
        filter: grayscale(70%);
        opacity: 0.5;
    }
    
</style>