<template>
   <section id="inicio-cover">
       <div class="container">
       <!-- Navbar -->
        <nav class="navbar navbar-toggleable-md navbar-dark navbar-fixed-top d-flex justify-content-between">
                <b-nav-toggle target="nav_collapse"></b-nav-toggle>
                <img src="/static/img/foodlovers.png" width="158px">
                <router-link class="btn btn-outline-secondary" role="button" aria-pressed="true" to="/config"><i class="fa fa-cog" aria-hidden="true"></i></router-link>     
                <b-collapse is-nav id="nav_collapse">
                    <b-nav is-nav-bar>
                          <b-nav-item href="#"> Perfil</b-nav-item>
                          <b-nav-item href="#">Preferências</b-nav-item>
                          <b-nav-item href="#">Combinações</b-nav-item>
                    </b-nav>
                </b-collapse>
        </nav><br>
       <!-- END Navbar -->
   
       <!-- Back Button -->
        <div class="backset">
           <router-link class="btn btn-outline-secondary" role="button" aria-pressed="true" to="/inicio"><i class="fa fa-arrow-left" aria-hidden="true"></i> Voltar para Inicio</router-link> 
        </div>
        <!--END Back Button -->
    
        <!-- Duvidas -->
        <div class="head">
            <h1>Envie-nos a sua dúvida</h1><br>
            <p>Pergunte o que quiser, respondemos rapidinho!</p>
        </div> <br>
        <div class="question-body">
            <b-row>
                <h4>Alguma pergunta?</h4>
            </b-row>
            <b-row>
                <b-col>
                    <b-form-textarea id="textarea2"
                     v-model="text"
                     placeholder="Digite a sua dúvida"
                     :rows="4"
                     :maxlength="900">
                    </b-form-textarea>
                </b-col>
                <div class="w-100"></div>
                <b-col class="d-flex justify-content-center">
                    <small>Máximo de 900 caracteres</small>
                </b-col>
            </b-row>
            <b-row>
                <b-button type="submit" class="btn btn-outline-success float-left">Confirmar</b-button>
            </b-row>
             
            
            
            
        </div>
        
        <!-- END Duvidas-->

       </div>
  </section>
</template>


<script>

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
    
    .container nav {
        background-color: #34495e;
        max-width: none;
        min-width: 100vw;
        font-family: 'Exo', sans-serif;
    }
    
    .backset1 {
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
    }
    
    .question-body {
        margin: auto;
        width: 80%;
        background: #fff;
        padding: 10px;
        background-color: #ecf0f1;
        box-shadow: 10px 20px 20px rgba(0,0,0,.5);
        overflow: hidden;
    }
    
    .question-body #textarea2 {
        margin-top: 10px;
    }
    
    .question-body .btn {
        margin-left: 25px;
        margin-bottom: 4px;
        
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
</style>