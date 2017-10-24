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
        </div> 
        <div class="preferencias">
           <div class="categorias">
               <form action="" name="formChangePref" class="change-pref">
                   <row class="d-flex justify-content-center">
                   <b-col class="options"><img src="/static/img/hotdog.png" alt=""></b-col>
                   <b-col class="options"><img src="/static/img/bolo.png" alt=""></b-col>
                   <b-col class="options"><img src="/static/img/cafe.png" alt=""></b-col>
                   </row>
                   <row class="d-flex justify-content-center">
                       <b-col class="options"><img src="/static/img/sorvete.png" alt=""></b-col>
                       <b-col class="options"><img src="/static/img/pizza.png" alt=""></b-col>
                       <b-col class="options"><img src="/static/img/nachos.png" alt=""></b-col>
                   </row>
                   <row class="d-flex justify-content-center">
                       <b-col class="options"><img src="/static/img/churrasco.png" alt=""></b-col>
                       <b-col class="options"><img src="/static/img/spaghetti.png" alt=""></b-col>
                       <b-col class="options"><img src="/static/img/sopa.png" alt=""></b-col>
                   </row>
                   <row class="d-flex justify-content-center">
                       <b-col class="options"><img src="/static/img/salada.png" alt=""></b-col>
                       <b-col class="options"><img src="/static/img/panquecas.png" alt=""></b-col>
                       <b-col class="options"><img src="/static/img/sushi.png" alt=""></b-col>
                   </row>
               </form>
           </div>
           </div>
           <div class="footer d-flex justify-content-center">
               <form class="form-conf-pref form-inline" name="formConfPref" action="">
                   <b-row>
                   <b-col>
                        <img src="/static/img/batataico.png" id="" class="img-fluid" alt="icoFrituras">
                        <b-button size="sm" variant="danger"><i class="fa fa-times" aria-hidden="true"></i></b-button>
                   </b-col>
               </b-row>
               <b-row>
                   <b-col>
                        <img src="/static/img/pizzaico.png" class="img-fluid" alt="icoPizza">
                        <b-button size="sm" variant="danger"><i class="fa fa-times" aria-hidden="true"></i></b-button>
                   </b-col>
               </b-row>
               <b-row>
                   <b-col>
                       <img src="/static/img/macarraoico.png" class="img-fluid" alt="icoMassas">
                       <b-button size="sm" variant="danger"><i class="fa fa-times" aria-hidden="true"></i></b-button>
                   </b-col>
               </b-row>
               <b-row>
                   <b-col>
                       <img src="/static/img/nachosico.png" class="img-fluid" alt="icoMexicanos">
                       <b-button size="sm" variant="danger"><i class="fa fa-times" aria-hidden="true"></i></b-button>
                   </b-col>
               </b-row>
               <b-row>
                   <b-col>
                       <img src="/static/img/cafeico.png" class="img-fluid" alt="icoBebidasHot">
                       <b-button size="sm" variant="danger"><i class="fa fa-times" aria-hidden="true"></i></b-button>
                   </b-col>
               </b-row>
               
               </form>
           </div>
        
        <!-- END Preferencias Card -->

       </div>
  </section>
</template>


<script>

</script>


<style>
    @import url('https://fonts.googleapis.com/css?family=Exo|Raleway:400,700,800|Poiret+One|Open+Sans+Condensed:300,300i');
    
    #inicio-cover {
        height: 100vh;
        width: 100vw;
        background-size: cover;
        display: flex;
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
    
    .footer {
        text-align: center;
        justify-content: center;
        position: absolute;
        bottom:0;
        width:100%;
        background-color:  #fff;
        border-top: 1.5px solid;
        border-top-color: #ecf0f1;
        box-shadow: 0 -6px 10px -4px #7f8c8d;
    }
    
    .footer img {
        width:110px;
        height: 110px;
        margin-right: 20px;
        margin-left: 20px;
    }
    
    .footer .btn {
        margin-left: 0px;
        margin-bottom: 90px;
        color: #fff;
        border-radius: 20px;
        font-size: 10px;
    }
    
    .preferencias .categorias .options {
        margin: 40px;
        text-align: center;
        justify-content: center;
    }
    
    .preferencias .categorias .options img {
        width: 160px;
        height: 210px;
    }
    
    @media (max-width: 320px) {
        .footer img {
            width:60px;
            height: 60px;
        }
        
        .preferencias .categorias .options {
            margin: 5px;
            text-align: center;
            justify-content: center;
        }
        
        .preferencias .categorias .options img {
            width: 135px;
            height: 150px;
        }
        
        .footer{
            padding-left: 0px;
        }
        
        .footer .btn {
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
        .footer img {
            width:60px;
            height: 60px;
        }
        
        .preferencias .categorias .options {
            margin: 5px;
            text-align: center;
            justify-content: center;
        }
        
        .preferencias .categorias .options img {
            width: 120px;
            height: 150px;
        }
        
        .footer{
            padding-left: 0px;
        }
        
        .footer .btn {
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
        .footer img {
            width:70px;
            height: 70px;
        }
        
        .preferencias .categorias .options {
            margin: 5px;
            text-align: center;
            justify-content: center;
        }
        
        .preferencias .categorias .options img {
            width: 120px;
            height: 150px;
        }
        
        .footer{
            padding-left: 0px;
        }
        
        .footer .btn {
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
        
        .footer .form-inline {
            justify-content: center;
            margin-left: -30px;
            margin-bottom: -30px;
        }
        
        .footer .form-inline .col {
            width: 110px;
            padding-right: 15px;
            padding-left: 15px;
            margin-bottom: 0px;
            max-height: 30px;
        }
        
    }
    
    @media (min-width: 425px) and (max-width: 768px) {
        .footer img {
            width:90px;
            height: 90px;
        }
        
        .preferencias .categorias .options {
            margin: 5px;
            text-align: center;
            justify-content: center;
        }
        
        .preferencias .categorias .options img {
            width: 120px;
            height: 150px;
        }
        
        .footer{
            padding-left: 0px;
        }
        
        .footer .btn {
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
        
        .footer .form-inline {
            justify-content: center;
            margin-left: 0px;
            margin-bottom: -30px;
        }
        
        .footer .form-inline .col {
            width: 160px;
            padding-right: 15px;
            padding-left: 15px;
            margin-bottom: 0px;
            max-height: 30px;
        }
        
    }
    
   
</style>