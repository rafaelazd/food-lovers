<template>
   <section id="inicio-cover">
   <div class="container">
   <!-- Navbar -->
    <nav class="navbar navbar-toggleable-md navbar-dark navbar-fixed-top d-flex justify-content-between">
          <b-nav-toggle target="nav_collapse"></b-nav-toggle>
           <img src="/static/img/foodlovers.png" width="158px">
            <b-button class="btn btn-outline-secondary"><i class="fa fa-cog" aria-hidden="true"></i></b-button>    
              <b-collapse is-nav id="nav_collapse">
                <b-nav is-nav-bar>
                      <b-nav-item href="#">Perfil</b-nav-item>
                      <b-nav-item href="#">Preferências</b-nav-item>
                      <b-nav-item href="#">Combinações</b-nav-item>
                </b-nav>
            </b-collapse>
    </nav>
   <!-- END Navbar -->
   <!-- Cards de Perfil -->
   
   <!-- END Cards de Perfil -->
   </div>
  </section>
</template>


<script>


</script>


<style>
    @import url('https://fonts.googleapis.com/css?family=Exo:200');
    
    #inicio-cover {
        height: 100vh;
        width: 100vw;
        background-size: cover;
        display: flex;
        -webkit-background-size: cover;
        -moz-background-size: cover;
        -o-background-size: cover;
        background-size: cover;
    }
    
    .container{
        width: 100vw;
        height: 100vh;
    }
    
    .container nav {
        background-color: #34495e;
        display: block;
        width: 100vw;
        margin-left: 0;
        left: 0;
         font-family: 'Exo', sans-serif;
    }
    
</style>
