<template>
   <section id="inicio-cover">
       <div class="container">
       <!-- Navbar -->
        <nav-all></nav-all> <br>
       <!-- END Navbar -->
   
       <!-- Nav -->
        <div class="nav nav-pills nav-fill">
            <div class="nav-item">
            <router-link class="nav-link" role="a" aria-pressed="true" to="/feed"><i class="fa fa-camera" aria-hidden="true"></i></router-link>
            </div>
            <div class="nav-item">
            <router-link class="nav-link active" role="a" aria-pressed="true" to="/inicio"><i class="fa fa-heart" aria-hidden="true"></i></router-link>
            </div>
            <div class="nav-item">
            <router-link class="nav-link" role="a" aria-pressed="true" to="/chat"><i class="fa fa-comments" aria-hidden="true"></i></router-link>
            </div>
        </div> <br>    
        <!--END Nav -->
    
        <!-- Perfil Card -->
        <div class="row justify-content-center">
            <div>
               <b-card-group>
                        <profile v-for="profile in profiles"  :key="profile.id" :profile="profile"></profile>
                </b-card-group>
            </div>
        </div>
        <!-- END Perfil Card -->

       </div>
  </section>
</template>


<script>
import Profile from '@/components/Profile'
import axios from 'axios'

    export default {      
        components: {
            'profile': Profile
        },
        
        data() {
            return {
                profiles: []
            }
        },
        
        created() {
            this.buscarDados();
        },

        methods: {
            buscarDados() {
                axios.get('http://localhost:8060/pessoas')
                    .then((resp) => {
                        this.erro = false;
                        this.profiles = resp.data._embedded.pessoas;
                        console.log(resp)
                    })
                    .catch((err) => {
                        this.erro = true;
                        console.log(err)
                    });
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
    .container nav {
        background-color: #34495e;
        max-width: none;
        min-width: 100vw;
        font-family: 'Exo', sans-serif;
    }
    
    .container .profile {
        width: 280px;
        min-height: 450px;
        background-color: #ecf0f1;
        border-style: hidden;
        border-radius: 15px;
        overflow: hidden;
        box-shadow: 10px 20px 20px rgba(0,0,0,.5);
        background-size: cover;
    }
    
    .card-group .card:not(:first-child):not(:last-child) {
        border-radius: 15px;
    }
    
    .card-group .card:first-child {
        border-radius: 15px;
    }
    
    .card-group .card + .card {
        margin-left: 0;
        border-left: 0;
        margin-left: -275px;
        border-radius: 15px;
    }
    
    .container .profile .btn {
        margin: 2px;
    }
    
    .container .profile .btn-circle {
        width: 45px;    
        height: 45px;
        font-size: 12px;
        border-radius: 25px;
    }
    
    .container .profile .btn-times {
        width: 20px;    
        height: 20px;
        font-size: 9px;
        text-align: center;
        border-radius: 25px;
        padding: 2px;
        margin-left: 4px;
        margin-top: 2px;
    }
    
    .container .profile .btn-sm {
        border-radius: 15px;
    }
    
    #collapse2 {
        background-color: #f7f7f7;
        border-radius: 15px;
        overflow: hidden;
        box-shadow: 0 30px 30px rgba(0,0,0,.6);
        text-align: center;
        max-height: 450px;
    }
    #collapse2 h1 {
        font-family: 'Poiret One', cursive;
        padding: 7px;
        font-size: 40px;
    }
    #collapse2 h6 {
        font-family: 'Raleway', sans-serif;
        font-size: 15px;
        padding: 7px;
    }
    #collapse2 p {
        font-family: 'Raleway', sans-serif;
        color: #3498db;
        border-bottom: 0.2px solid;
        border-bottom-color: #ecf0f1;
        border-top: 0.2px solid;
        border-top-color: #ecf0f1;
        text-align: center;
        padding: 7px;
    }

    
</style>
