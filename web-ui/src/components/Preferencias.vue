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
                   <b-row class="d-flex justify-content-center">
                       <b-col class="options">
                          <label for="check10" class="btn">
                                 <img src="/static/img/salada.png" class="select-img" id="salada" alt="Salada">
                                 <b-form-checkbox v-model="selected" id="check10" value="Salada"></b-form-checkbox>
                          </label>
                       </b-col>
                       <b-col class="options">
                          <label for="check11" class="btn">
                                 <img src="/static/img/sanduiche.png" class="select-img" id="sanduiche" alt="Sanduiche">
                                 <b-form-checkbox v-model="selected" id="check11" value="Sanduiche"></b-form-checkbox>
                          </label>
                       </b-col>
                       <b-col class="options">
                          <label for="check12" class="btn">
                                 <img src="/static/img/sushi.png" class="select-img" id="sushi" alt="Sushi">
                                 <b-form-checkbox v-model="selected" id="check12" value="Sushi"></b-form-checkbox>
                          </label>
                       </b-col>
                   </b-row>
                   <b-row class="d-flex justify-content-center">
                       <b-col class="options">
                          <label for="check13" class="btn">
                                 <img src="/static/img/batata.png" class="select-img" id="batata" alt="Batata Frita">
                                 <b-form-checkbox v-model="selected" id="check13" value="Batata Frita"></b-form-checkbox>
                          </label>
                       </b-col>
                       <b-col class="options">
                          <label for="check14" class="btn">
                                 <img src="/static/img/tacos.png" class="select-img" id="tacos" alt="Tacos">
                                 <b-form-checkbox v-model="selected" id="check14" value="Tacos"></b-form-checkbox>
                          </label>
                       </b-col>
                       <b-col class="options">
                          <label for="check15" class="btn">
                                 <img src="/static/img/panquecas.png" class="select-img" id="panquecas" alt="Panquecas">
                                 <b-form-checkbox v-model="selected" id="check15" value="Panquecas"></b-form-checkbox>
                          </label>
                       </b-col>
                   </b-row>
               </form>
           </div>
           </div>    
           <div class="footer d-flex justify-content-center" id="footerPref">
               <form class="form-conf-pref form-inline" name="formFooterPref" action="">
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
export default {
    data () {
        return {
            selected: []
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
    
    #footerPref {
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
    
    #footerPref img {
        width: 110px;
        height: 110px;
        margin-right: 20px;
        margin-left: 20px;
    }
    
    #footerPref .btn {
        margin-left: 0px;
        margin-bottom: 90px;
        color: #fff;
        border-radius: 20px;
        font-size: 10px;
    }
    
    .categorias {
        margin-bottom: 70px;
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
    
    @media (max-width: 320px) {
        #footerPref img {
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
        #footerPref {
            padding-left: 0px;
            position: fixed;
        }
        #footerPref .btn {
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
        #footerPref img {
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
        #footerPref {
            padding-left: 0px;
            position: fixed;
        }
        #footerPref .btn {
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
        #footerPref img {
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
        #footerPref {
            padding-left: 0px;
            position: fixed;
        }
        #footerPref .btn {
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
        #footerPref .form-inline {
            justify-content: center;
            margin-left: -30px;
            margin-bottom: -30px;
        }
        #footerPref .form-inline .col {
            width: 110px;
            padding-right: 15px;
            padding-left: 15px;
            margin-bottom: 0px;
            max-height: 30px;
        }
    }
    
    @media (min-width: 425px) and (max-width: 768px) {
        #footerPref img {
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
        #footerPref {
            padding-left: 0px;
            position: fixed;
        }
        #footerPref .btn {
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
        #footerPref .form-inline {
            justify-content: center;
            margin-left: 0px;
            margin-bottom: -30px;
        }
        #footerPref .form-inline .col {
            width: 160px;
            padding-right: 15px;
            padding-left: 15px;
            margin-bottom: 0px;
            max-height: 30px;
        }
    }

</style>
