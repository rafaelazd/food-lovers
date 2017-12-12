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
                    <b-col id="ratings" cols="6" md="4" lg="2">
                        <label for="ruim">
                            <img src="/static/img/1.PNG" class="img-fluid" id="Triste" alt="Triste"><br>
                            <input type="radio" class="option-input radio" id="ruim" v-model="radioselected" name="rate" value="Ruim">
                            <small>Ruim</small>
                        </label>
                    </b-col>
                    <b-col id="ratings" cols="6" md="4" lg="2">
                        <label for="razoavel">
                            <img src="/static/img/2.PNG" class="img-fluid" id="Razoavel" alt="Razoável"><br>
                            <input type="radio" class="option-input radio"  id="razoavel" v-model="radioselected" name="rate" value="Razoável">
                            <small>Razoável</small>
                        </label>
                    </b-col>
                    <b-col id="ratings" cols="6" md="4" lg="2">
                        <label for="bom">
                            <img src="/static/img/3.PNG" class="img-fluid" id="Satisfeito" alt="Satisfeito"><br>
                            <input type="radio" class="option-input radio" id="bom" v-model="radioselected" name="rate" value="Bom">
                            <small>Bom</small>
                        </label>
                    </b-col>
                    <b-col id="ratings" cols="6" md="4" lg="2">
                        <label for="otimo">
                            <img src="/static/img/4.PNG" class="img-fluid" id="Feliz" alt="Feliz"><br>
                            <input type="radio" class="option-input radio" id="otimo" v-model="radioselected" name="rate" value="Ótimo">
                            <small>Ótimo</small>
                        </label>
                    </b-col>
                    <b-col id="ratings" cols="6" md="4" lg="2">
                        <label for="incrivel">
                            <img src="/static/img/5.PNG" class="img-fluid" id="MuitoFeliz" alt="Muito Feliz"><br>
                            <input type="radio" class="option-input radio" id="incrivel" v-model="radioselected" name="rate" value="Incrível">
                            <small>Incrível</small>
                        </label>
                    </b-col>
                </b-row>
                {{radioselected}}
                <b-row class="btn-small">
                    <b-button class="btn btn-outline-success float-left" @click="enviarDados">Confirmar</b-button>
                </b-row>
            </div>
            </form>
        <!-- END Duvidas-->
       </div>
  </section>
</template>


<script>
import axios from 'axios'

export default {
    data () {
        return {
           radioselected: []
        }
    }, 
    
    methods: {
        enviarDados() {
            
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
    
    .head {
        margin-top: 40px;
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
        background: #ecf0f1;
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
        line-height: 23px;
        margin-left: -8px;
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