<template>
   <section id="inicio-cover">
       <div class="container">
       <!-- Navbar -->
        <nav-all></nav-all> <br>
       <!-- END Navbar -->
   
       <!-- Back Button -->
        <div class="backset">
           <router-link class="btn btn-outline-secondary" role="button" aria-pressed="true" to="/inicio"><i class="fa fa-arrow-left" aria-hidden="true"></i></router-link> 
        </div>
        <!--END Back Button -->
    
        <!-- Sobre nós -->
        <div class="head">
            <h1>Sobre nós</h1><br>
            <p>Conheça mais sobre o App <i>Food Lovers</i> e todo seu processo de criação! </p>
        </div> 
        <div class="body-about">
            <b-row class="first d-flex justify-content-center">
                <b-col sm="6">
                    <img src="/static/img/logo.png" class="img-fluid" alt="">
                </b-col>
                <b-col sm="6">
                    <h4>Sobre <i>Food Lovers</i></h4>
                    <p>O aplicativo <i>Food Lovers</i> tem como objetivo permitir que vocês, usuários, possam interagir uns com os outros por meio de suas preferências culinárias em comum! Desse modo, ao reunir duas das necessidades mais básicas do ser humano: social e fisiológica, as interações serão mais dinâmicas, e sem dúvida, muito mais divertidas! Afinal, quem não gosta de comida, não é?</p>
                </b-col>
            </b-row>
            <b-row class="second d-flex justify-content-center">
                <b-col sm="6">
                    <h4>Como surgiu o projeto?</h4>
                    <p>O projeto surgiu com a necessidade do desenvolvimento de um Trabalho de Conclusão de Curso (vulgo TCC) para o curso de Informática para Internet, do Instituto Federal do Paraná - Campus Telêmaco Borba. Como aluna do 4° e último ano do curso, é necessário realizar um trabalho que envolva todos os assuntos absorvidos ao longo do curso. Com isso em mente, a ideia de desenvolver um aplicativo <i>web</i> invadiu minha mente e não perdi tempo para procurar inspirações, indo de encontro com o que mais tarde seria chamado <i>Food Lovers</i>, o App de relacionamentos mais legal que você respeita!  </p>
                </b-col>
                <b-col sm="6">
                    <img src="/static/img/truelove2.png" class="img-fluid" alt="">
                </b-col>
            </b-row>
            <b-row class="third d-flex justify-content-center">
                <b-col sm="6">
                    <img src="/static/img/cutesnoopy.png" class="img-fluid" alt="">
                </b-col>
                <b-col sm="6">
                    <h4>Como funciona?</h4>
                    <p>Cada usuário tem a opção de escolher até 5 preferências que dizem respeito as suas comidas prediletas. Ao escolher, o sistema irá, de forma aleatória, apresentar ao usuário outros indivíduos com a mesma preferência que ele. Se caso ocorra de duas pessoas gostarem um do o outro, poderão conversar no <i>chat</i>, quem sabe um jantar romantico?
                    Outro recurso que também poderá ser utilizado é o <i>feed</i> de fotos, onde o usuário poderá ver as fotos postadas pelos perfis que escolheu seguir.</p>
                </b-col>
            </b-row>
            <b-row class="fourth d-flex justify-content-center">
                <b-col sm="6">
                    <h4>Como será feito?</h4>
                    <p> O projeto tem como foco principal as necessidades do usuário, colocando-o no centro do desenvolvimento, não só como consumidor final, utilizando-se de abordagens como Design Thinking, UX <i>(User Experience)</i>, Lean Startup, entre outros métodos, cuja análise objetiva entender o publico-alvo e adaptar o projeto de acordo com suas demandas.
                    Para o desenvolvimento, foi utilizado os <i>frameworks</i>: <code>Bootstrap</code> e <code>BootstrapVue</code>, conciliando-os ao longo do projeto. </p>
                </b-col>
                <b-col sm="6">
                    <img src="/static/img/bootstrapvue1.png" class="img-fluid" alt="">
                </b-col>
            </b-row>
            
        </div>
        <!-- END Sobre nós-->

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
    
    
    .body-about h4 {
        color: #2c3e50;
        font-size: 19px;
        font-family: 'Open Sans', sans-serif;
        font-weight: 500;
        letter-spacing: 1px;
        margin-top: 80px;
    }
    
    .body-about img {
       margin-left: 25px;
       margin-bottom: 25px;
    }
    
    .body-about p {
        color: #95a5a6;
        font-size: 17px;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300;
    }
    
    .body-about .first {
        border-bottom: 0.5px solid;
        border-bottom-color: #ecf0f1;
    }
    
    .body-about .second {
        border-bottom: 0.5px solid;
        border-bottom-color: #ecf0f1;
    }
    
    .body-about .second h4 {
        margin-top: 170px;
        margin-left: 20px;
    }
    
    .body-about .second img {
       margin-top: 60px;
       margin-left: 0px;
    }
    
    .body-about .second p {
        margin-left: 20px;
    }
    
    .body-about .third {
        border-bottom: 0.5px solid;
        border-bottom-color: #ecf0f1;
    }
    
    .body-about .third h4 {
        margin-top: 170px;
    }
    
    .body-about .third img {
       margin-top: 30px;
       margin-left: 20px;
    }
    
    .body-about .fourth h4 {
        margin-top: 150px;
        margin-left: 40px;
    }
    
    .body-about .fourth p {
        margin-left: 40px;
    }
    
    .body-about .fourth img {
       margin-top: 30px;
       margin-left: 100px;
    }
    
    .body-about .fourth code {
       color: #9b59b6;
    }
    
    @media (max-width:570px) {
        .body-about img {
            margin-left: 10px;
        }
        
        .body-about h4 {
            margin-left: 10px;
            text-align: center;
        }
        
        .body-about p {
            margin-left: 10px;
            text-align: center;
        }

        .body-about .second h4 {
            margin-top: 60px;
        }
        
        .body-about .third h4 {
        margin-top: 40px;
        }

        .body-about .third img {
           margin-top: 30px;
           margin-left: 10px;
        }
        
        .body-about .fourth h4 {
        margin-top: 50px;
        margin-left: 20px;
        }

        .body-about .fourth p {
            margin-left: 20px;
        }

        .body-about .fourth img {
           margin-top: 30px;
           margin-left: 10px;
        }
    }
    
</style>