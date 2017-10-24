<template>
   <section id="inicio-cover">
       <div class="container">
       <!-- Navbar -->
        <nav-all></nav-all><br>
       <!-- END Navbar -->
   
       <!-- Nav -->
        <div class="nav nav-pills nav-fill">
            <div class="nav-item">
                <router-link class="nav-link" role="a" aria-pressed="true" to="/feed"><i class="fa fa-camera" aria-hidden="true"></i></router-link>
            </div>
            <div class="nav-item">
                <router-link class="nav-link" role="a" aria-pressed="true" to="/inicio"><i class="fa fa-heart" aria-hidden="true"></i></router-link>
            </div>
            <div class="nav-item">
                <router-link class="nav-link" role="a" aria-pressed="true" to="/chat"><i class="fa fa-comments" aria-hidden="true"></i></router-link>
            </div>
        </div> <br>    
        <!--END Nav -->
    
        <!-- Perfil Card -->
        <div class="row justify-content-center">
            <div>
               
            </div>
        </div>
        <!-- END Perfil Card -->

       </div>
  </section>
</template>


<script>
export default {
    data() {
        return {
            url1: '/usu-perfil'
        }
    }
}
</script>


<style>
    @import url('https://fonts.googleapis.com/css?family=Exo|Raleway:400,700,800|Poiret+One');
    
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
    
    .container {
        min-width: 100vw;
        left: 0px;
        padding-left: 0;
    }
    
</style>
