<template>
    <section id="inicio-cover">
       <div class="container">
       <!-- Navbar -->
        <nav-all></nav-all> <br>
       <!-- END Navbar -->
   
       <!-- Nav -->
        <div class="nav nav-pills nav-fill">
            <div class="nav-item">
            <router-link class="nav-link" role="a" aria-pressed="true" to="/feed"><i class="fa fa-th" aria-hidden="true"></i></router-link>
            </div>
            <div class="nav-item">
            <router-link class="nav-link" role="a" aria-pressed="true" to="/inicio"><i class="fa fa-heart" aria-hidden="true"></i></router-link>
            </div>
            <div class="nav-item">
            <router-link class="nav-link active" role="a" aria-pressed="true" to="/chat"><i class="fa fa-comments" aria-hidden="true"></i></router-link>
            </div>
        </div> <br>    
        <!--END Nav -->
    
        <!-- Chat Card -->
        <div class="chat">
            <b-row class="head d-inline-flex justify-content-around">
                <b-col style="padding-top:10px"><span><i class="fa fa-comments" aria-hidden="true"></i></span></b-col>
                <b-col style="padding-top:10px"><span>Mensagens</span></b-col>
                <b-col></b-col>
            </b-row>
            <div class="search-bar">
                   <b-input-group>
                    <b-form-input type="search" class="ip-search" placeholder="Procurar..."></b-form-input>
                    <button class="btn btn-secondary input-group-addon"><i class="fa fa-search"></i></button>
                  </b-input-group>
            </div>
            <div class="conversas">
                <div class="conversas-head">
                    <p>Recentes</p>
                    <div class="recentes">
                        <b-row>
                            <img src="/static/img/M2.jpg" class="back-left-circle rounded-circle img-fluid" alt="">
                            <img src="/static/img/M3.jpg" class="front-circle rounded-circle img-fluid" alt="">
                            <img src="/static/img/H2.4.jpg" class="back-right-circle rounded-circle img-fluid" alt="">
                        </b-row>
                           <b-row>
                            <small>Maria Rosa</small>
                            <small>Eva Miranda</small>
                            <small>Heitor</small>
                        </b-row>
                    </div>
                    <div class="combinacoes">
                        <b-row  class="d-flex justify-content-around">
                            <img src="/static/img/H1.4.jpg" class="rounded-circle img-fluid" alt="">
                            <img src="/static/img/M4.jpg" class="rounded-circle img-fluid" alt="">
                            <img src="/static/img/M1.3.jpg" class="rounded-circle img-fluid" alt="">
                        </b-row>
                        <b-row class="d-flex justify-content-around">
                            <small>Mateus Takeda</small>
                            <small>Raquel Salvatori</small>
                            <small>Sofia Alter</small>
                        </b-row>    
                    </div>
                </div>
            </div>
        </div>
        <!-- END Chat Card -->

       </div>
  </section>
</template>

<script type="text/javascript">
export default {
    methods: {
        
    }
}
</script>


<style>
     @import url('https://fonts.googleapis.com/css?family=Exo|Raleway:400,700,800|Poiret+One|Open+Sans|Open+Sans+Condensed:300');
    
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
    
    .chat {
        background-color: #f9f9f9;
        background-size: cover;
        max-height: none;
        margin: 0;
        z-index: -10;
    }
    
    .chat .head {
        text-align: center;
        text-transform: uppercase;
        font-weight: 400;
        letter-spacing: 2px;
        font-size: 17.5px;
        color: #34495e;
        padding: 10px;
        width: 100%;
        border-bottom: 0.2px solid;
        border-bottom-color: #bdc3c7;
    }
    
    .chat .head small {
        font-size: 19px;
        font-weight: 400;
        color: #34495e;
        margin: 9px;
    }
    
    .chat .head .m-1 {
        background-color: transparent;
        color: #34495e;
        border: 0px; 
    }
    
    .chat .head .m-1:hover {
        border: 0px;    
    }
    
    .search-bar {
        padding: 10px;
        text-align: center;
        z-index: 1;
    }
    
    .search-bar .ip-search {
        border-radius: 20px;
        width: 100%;
        height: 40px; 
        margin-top: 10px;
        margin-left: 10px;
        margin-bottom: 10px;
    }
    
    .search-bar .input-group-addon {
        border-top-right-radius: 20px;
        border-bottom-right-radius: 20px;
        margin-top: 10px;
        margin-bottom: 10px;
        margin-right: 10px;
    }
    
    .conversas .recentes {
        padding-left: 25%;
        border-bottom: 0.5px solid;
        border-bottom-color: #ecf0f1;
        border-bottom-width: thin;
    }
    
    .conversas p {
       font-family: 'Raleway', sans-serif;
        color: #7f8c8d;
        font-size: 20px;
        margin-left: 25px;
        margin-top: 20px;
        border-bottom: 0.5px solid;
        border-bottom-color: #ecf0f1;
        border-bottom-width: thin;
        margin-right: 25px;
    }
    
    .conversas .recentes small {
       font-family: 'Raleway', sans-serif;
        color: #7f8c8d;
        font-size: 15px;
        margin-left: 100px;
        padding: 10px;
    }
    
    .conversas .back-left-circle {
        width: 200px;
        height: 200px;
        margin-left: 20px;
        z-index: 1;
    }
    
    .conversas .back-right-circle {
        width: 200px;
        height: 200px;
        margin-right: 20px;
        z-index: 1;
    }
    
    .conversas .front-circle {
        width: 215px;
        height: 215px;
        z-index: 10;
        margin-right: 0px;
        margin-left: 0px;
        box-shadow: 10px 7px 10px rgba(0,0,0,.3);
        border-radius: 130px;
    }
    
    .combinacoes {
        padding: 60px;
    }
    
    .combinacoes img{
        width: 200px;
        height: 200px;
        margin-left: 20px;
        margin-right: 20px;
    }
    
    .combinacoes small {
       font-family: 'Raleway', sans-serif;
       color: #7f8c8d;
       font-size: 15px;
    }
    @media (min-width: 576px) {
        .chat {
        box-shadow: 10px 20px 20px rgba(0,0,0,.5);
        margin: 30px;
        border-radius: 15px;
        }
    } 
    
    @media (max-width: 576px) {
        .chat {
        width: 100vw;
        border-radius: 5px;
        }
    } 
    
</style>