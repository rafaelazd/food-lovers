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
    
        <!-- Config Card -->
        <div class="preferencias">
           <div class="categorias">
               <form action="" name="formChangePref" class="change-pref">
                   <row class="d-flex justify-content-center">
                   <b-col class="options"><img src="/static/img/batata.png" alt=""></b-col>
                   <b-col class="options"><img src="/static/img/bolo.png" alt=""></b-col>
                   <b-col class="options"><img src="/static/img/cafe.png" alt=""></b-col>
                   </row>
                   <row class="d-flex justify-content-center">
                       <b-col class="options"><img src="/static/img/macarrao.png" alt=""></b-col>
                       <b-col class="options"><img src="/static/img/pizza.png" alt=""></b-col>
                       <b-col class="options"><img src="/static/img/nachos.png" alt=""></b-col>
                   </row>
                   <row class="d-flex justify-content-center">
                       <b-col class="options"><img src="/static/img/macarrao.png" alt=""></b-col>
                       <b-col class="options"><img src="/static/img/bolo.png" alt=""></b-col>
                       <b-col class="options"><img src="/static/img/cafe.png" alt=""></b-col>
                   </row>
               </form>
           </div>
           <div class="footer d-flex justify-content-center">
               <form class="form-conf-pref form-inline" name="formConfPref" action="">
                   <b-row>
                   <b-col>
                        <img src="/static/img/batataico.png" class="img-fluid" alt="icoFrituras" width="110px" height="110px">
                        <b-button class="delete"><i class="fa fa-times" aria-hidden="true"></i></b-button>
                   </b-col>
               </b-row>
               <b-row>
                   <b-col>
                        <img src="/static/img/pizzaico.png" class="img-fluid" alt="icoPizza" width="110px" height="110px">
                        <b-button class="delete"><i class="fa fa-times" aria-hidden="true"></i></b-button>
                   </b-col>
               </b-row>
               <b-row>
                   <b-col>
                       <img src="/static/img/macarraoico.png" class="img-fluid" alt="icoMassas" width="110px" height="110px">
                       <b-button class="delete"><i class="fa fa-times" aria-hidden="true"></i></b-button>
                   </b-col>
               </b-row>
               <b-row>
                   <b-col>
                       <img src="/static/img/nachosico.png" class="img-fluid" alt="icoMexicanos" width="110px" height="110px">
                       <b-button class="delete"><i class="fa fa-times" aria-hidden="true"></i></b-button>
                   </b-col>
               </b-row>
               <b-row>
                   <b-col>
                       <img src="/static/img/cafeico.png" class="img-fluid" alt="icoBebidasHot" width="110px" height="110px">
                       <b-button class="delete"><i class="fa fa-times" aria-hidden="true"></i></b-button> 
                   </b-col>
               </b-row>
               
               </form>
           </div>
        </div>
        <!-- END Config Card -->

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
    
    .preferencias .footer {
        text-align: center;
        justify-content: center;
        position: absolute;
        bottom:0;
        width:100%;
        background-color:  rgba(249, 249, 249, 0.7);
    }
    
    .preferencias .footer .delete {
        margin-left: 0px;
        margin-bottom: 90px;
        background-color: #e74c3c;
        color: #fff;
        border-radius: 20px;
        border: 0px;
        width: 30px;
        height: 30px;
        font-size: 10px;
    }
    
    .preferencias .footer .delete:hover {
        background-color: #c0392b;
    }
    
    .preferencias .categorias .options {
        margin: 40px;
        text-align: center;
        justify-content: center;
    }
    
    /*@media (max-width: 640px) {
        .preferencias .footer {
            margin-left: 20px;
        }
        .preferencias .footer .col {
            max-height: 100px;
        }
        .preferencias .footer .delete {
        margin-left: 0px;
        border-radius: 20px;
        border: 0px;
        width: 25px;
        height: 25px;
        font-size: 9px;
        }
    }
    
    @media (max-width: 566px) {
        .preferencias {
            min-height:100%;
            position:relative;
        }
        
        .footer .row {
            position:absolute;
            bottom:0;
            width:100%;
        }
    } */
    
</style>