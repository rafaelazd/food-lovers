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
        </nav><br>
       <!-- END Navbar -->
   
       <!-- Nav -->
        <div class="nav nav-pills nav-fill">
            <div class="nav-item">
            <router-link class="nav-link active" role="a" aria-pressed="true" to="/feed"><i class="fa fa-camera" aria-hidden="true"></i></router-link>
            </div>
            <div class="nav-item">
            <router-link class="nav-link" role="a" aria-pressed="true" to="/inicio"><i class="fa fa-heart" aria-hidden="true"></i></router-link>
            </div>
            <div class="nav-item">
            <router-link class="nav-link" role="a" aria-pressed="true" to="/chat"><i class="fa fa-comments" aria-hidden="true"></i></router-link>
            </div>
        </div> <br>    
        <!--END Nav -->
    
        <!-- Feed Card -->
        <div class="feed">
           <div class="card-columns">
              <div class="card">
                <p>hiiiii</p>
              </div>
              <div class="card p-3">
                <h1>hello</h1>
              </div>
              <div class="card">
                <h3>ei</h3>
              </div>
              <div class="card card-inverse card-primary p-3 text-center">
                <h6>oie</h6>
              </div>
              <div class="card text-center">
               <h4>lalalla</h4>
              </div>
              <div class="card">
              <h3>asuhuahs</h3>
              </div>
              <div class="card p-3 text-right">
                <h2>sextou</h2>
              </div>
              <div class="card">
                <h1>top</h1>
              </div>
            </div>
        </div>
        <!-- END Feed Card -->

       </div>
  </section>
</template>


<script>

</script>


<style>
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
            height: 100vh;
            left: 0px;
            padding-left: 0;
            overflow: auto;
        }
        .container nav {
            background-color: #34495e;
            max-width: none;
            min-width: 100vw;
            font-family: 'Exo', sans-serif;
        }
    
        .feed {
        background-color: #f9f9f9;
        background-size: cover;
        max-height: none;
        margin: 0;
    }
    
    @media (min-width: 576px) {
        .feed {
        box-shadow: 10px 20px 20px rgba(0,0,0,.5);
        margin: 30px;
        border-radius: 15px;
        }
    } 
    
    @media (max-width: 576px) {
        .feed {
        width: 100vw;
        border-radius: 5px;
        }  
    }
</style>