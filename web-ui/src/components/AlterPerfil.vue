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
    
        <!-- Perfil -->
        <div class="head">
            <h1>Alterando seus dados pessoais</h1> <br>
            <p>O que você deseja mudar em seu perfil?</p>
        </div> <br>
                
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
    
    .body {
        max-width: none;
        padding: 20px 25px;
        border-radius: 2px;
        text-align: center;
    }

    .body h4{
        color: #34495e;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300; 
        text-align: left;
        margin-left: 20px;
    }
    
    .body h5{
        color: #34495e;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300; 
        text-align: left;
        margin-left: 50px;
    }
    
    .body .inputs{
        margin-left: 50px;
        margin-right: 50px;
    }
    
    .body .inputs2{
        margin-left: 70px;
        margin-top: 10px;
    }
    
    .body .inputs3{
        margin-left: 70px;
        margin-top: 10px;
        margin-bottom: 20px;
    }
    
    .body .btn-outline-success{
        margin-left: 50px;
        max-width: 100px;
        max-height: 45px;
    }
    
    @media (max-width: 430px) {
        #usuFoto {
            width: 200px;
            height: 200px;
            padding-left: 0px;
        }
    }
    
</style>