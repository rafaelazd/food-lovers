<template>
    <section id="inicio-cover">
       <div class="container">
       <!-- Navbar -->
        <nav-all></nav-all> <br>
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
                    <div class="header d-flex justify-content-around">
                        <img src="/static/img/m7.png" alt="Avatar" class="img-fluid" id="usuFoto" style="width:37px;height:37px;">
                        <a href="usuario">theaqueen</a>
                        <small> 1h </small>
                    </div>
                    <div class="feed-foto ">
                        <img src="/static/img/prato10.jpg" class="img-fluid">
                    </div>
                    <div class="reaction-bar d-flex justify-content-around">
                         <button type="button" v-on:click="counter += 1" class="btn btn-outline-danger btn-circle"><i class="fa fa-heart-o" aria-hidden="true"></i></button>
                         <small>{{counter}} Curtidas</small>
                    </div>
              </div>
              <div class="card">
                    <div class="header d-flex justify-content-around">
                        <img src="/static/img/M2.jpg" alt="Avatar" class="img-fluid" id="usuFoto" style="width:37px;height:37px;">
                        <a href="usuario">rosamaria89</a>
                        <small> 2h </small>
                    </div>
                    <div class="feed-foto ">
                        <img src="/static/img/prato2.jpg" class="img-fluid">
                    </div>
                    <div class="reaction-bar d-flex justify-content-around">
                         <button type="button" v-on:click="counter += 1" class="btn btn-outline-danger btn-circle"><i class="fa fa-heart-o" aria-hidden="true"></i></button>
                         <small>{{counter}} Curtidas</small>
                    </div>
              </div>
              <div class="card">
                    <div class="header d-flex justify-content-around">
                        <img src="/static/img/M1.3.jpg" alt="Avatar" class="img-fluid" id="usuFoto" style="width:37px;height:37px;">
                        <a href="usuario">sosoalter</a>
                        <small> 2h </small>
                    </div>
                    <div class="feed-foto ">
                        <img src="/static/img/prato3.jpg" class="img-fluid">
                    </div>
                    <div class="reaction-bar d-flex justify-content-around">
                         <button type="button" v-on:click="counter += 1" class="btn btn-outline-danger btn-circle"><i class="fa fa-heart-o" aria-hidden="true"></i></button>
                         <small>{{counter}} Curtidas</small>
                    </div>
              </div>
              <div class="card">
                    <div class="header d-flex justify-content-around">
                        <img src="/static/img/M4.jpg" alt="Avatar" class="img-fluid" id="usuFoto" style="width:37px;height:37px;">
                        <a href="usuario">raquelsalva_</a>
                        <small> 3h </small>
                    </div>
                    <div class="feed-foto ">
                        <img src="/static/img/prato4.jpg" class="img-fluid">
                    </div>
                    <div class="reaction-bar d-flex justify-content-around">
                         <button type="button" v-on:click="counter += 1" class="btn btn-outline-danger btn-circle"><i class="fa fa-heart-o" aria-hidden="true"></i></button>
                         <small>{{counter}} Curtidas</small>
                    </div>
              </div>
              <div class="card">
                   <div class="header d-flex justify-content-around">
                        <img src="/static/img/H2.4.jpg" alt="Avatar" class="img-fluid" id="usuFoto" style="width:37px;height:37px;">
                        <a href="usuario">herondis</a>
                        <small> 5h </small>
                    </div>
                    <div class="feed-foto ">
                        <img src="/static/img/prato5.jpg" class="img-fluid">
                    </div>
                    <div class="reaction-bar d-flex justify-content-around">
                         <button type="button" v-on:click="counter += 1" class="btn btn-outline-danger btn-circle"><i class="fa fa-heart-o" aria-hidden="true"></i></button>
                         <small>{{counter}} Curtidas</small>
                    </div>
              </div>
              <div class="card">
                  <div class="header d-flex justify-content-around">
                        <img src="/static/img/M3.jpg" alt="Avatar" class="img-fluid" id="usuFoto" style="width:37px;height:37px;">
                        <a href="usuario">mirandeva</a>
                        <small> 5h </small>
                    </div>
                    <div class="feed-foto">
                        <img src="/static/img/prato6.jpg" class="img-fluid">
                    </div>
                    <div class="reaction-bar d-flex justify-content-around">
                         <button type="button" v-on:click="counter += 1" class="btn btn-outline-danger btn-circle"><i class="fa fa-heart-o" aria-hidden="true"></i></button>
                         <small>{{counter}} Curtidas</small>
                    </div>
              </div>
              <div class="card">
                    <div class="header d-flex justify-content-around">
                        <img src="/static/img/m7.png" alt="Avatar" class="img-fluid" id="usuFoto" style="width:37px;height:37px;">
                        <a href="usuario">theaqueen</a>
                        <small> 6h </small>
                    </div>
                    <div class="feed-foto ">
                        <img src="/static/img/prato9.jpg" class="img-fluid">
                    </div>
                    <div class="reaction-bar d-flex justify-content-around">
                         <button type="button" v-on:click="counter += 1" class="btn btn-outline-danger btn-circle"><i class="fa fa-heart-o" aria-hidden="true"></i></button>
                         <small>{{counter}} Curtidas</small>
                    </div>
              </div>
              <div class="card">
                   <div class="header d-flex justify-content-around">
                        <img src="/static/img/M1.2.jpg" alt="Avatar" class="img-fluid" id="usuFoto" style="width:37px;height:37px;">
                        <a href="usuario">kardashianlostsis</a>
                        <small> 10h </small>
                    </div>
                    <div class="feed-foto ">
                        <img src="/static/img/prato7.jpg" class="img-fluid">
                    </div>
                    <div class="reaction-bar d-flex justify-content-around">
                         <button type="button" v-on:click="counter += 1" class="btn btn-outline-danger btn-circle"><i class="fa fa-heart-o" aria-hidden="true"></i></button>
                         <small>{{counter}} Curtidas</small>
                    </div>
              </div>
              <div class="footer">
                  <b-button  v-on:click="showhide" class="btn btn-danger btn-circle"><i class="fa fa-plus" aria-hidden="true"></i></b-button>
              </div>
            </div>
            <div id="addFoto">
                <h4>Escolha a Foto:</h4>
                <b-form-file class="inout"  choose-label="Procurar" placeholder="Nenhum selecionado"></b-form-file><br>
                <b-button type="submit"class="btn btn-outline-success">Confirmar</b-button>
            </div>
        </div>
        <!-- END Feed Card -->

       </div>
  </section>
</template>


<script>
export default {
    methods: {
        showhide() {
       var div = document.getElementById("addFoto");
        if (div.style.display !== "block") {
            div.style.display = "block";
        }
        else {
            div.style.display = "none";
        }
    }
},
    
    data() {
      return { 
          counter: 0
      }
    }
}
</script>


<style>
   @import url('https://fonts.googleapis.com/css?family=Exo|Open+Sans:300,400|Raleway:400,700,800|Poiret+One|Open+Sans+Condensed:300,300i');
    
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
        padding: 15px;
    }
    
    .feed .card {
        border-radius: 8px;
        max-width: 415px;
        overflow: hidden;
    }
    
    .feed .header {
        background-color: #f4f4f4;
        width: 100%;
        color: #757575;
        padding: 4px;
    }
    
    .feed .header a {
        text-decoration: underline;
        font-family: 'Open Sans', sans-serif;
    }
    
    .feed .header a {
        margin: 9px;
        font-family: 'Questrial', sans-serif;
        font-size: 18px;
        
    }
    
    .feed .header small {
        font-size: 16px;
        color: darkgray;
        margin: 9px;
    }
    
    .feed .reaction-bar button {
        margin: 7px;
        width: 30%;
        border-radius: 200px;
    }
    
    .feed .reaction-bar small {
        font-size: 16px;
        color: #7f8c8d;
        margin-top: 14px;
        margin-left: -100px;
    }
    
    .footer {
        position: fixed;
        left: 0;
        bottom:0;
        margin-left: 30px;
        margin-bottom: 30px;
        width:100%;
        background-color:  transparent;
    }
    
    .footer .btn-circle {
        width: 90px;
        height: 90px;
        border-radius: 50px;
        font-size: 30px;
        font-weight: 200
    }
    
    #addFoto {
        position: fixed;
        background-color:  white;
        border: 1px solid;
        border-color: #bdc3c7;
        z-index: 1;
        top: 40%;
        left: 40%;
        width:50%;
        height:75%;
        margin-top: -9em;
        margin-left: -15em;
        box-shadow: 10px 30px 20px rgba(0,0,0,.5);
        padding: 20px;
        display: none;
    }
    
    #addFoto h4 {
        color: #34495e;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300; 
        text-align: left;
        margin-left: 20px;
        margin: 10px;
    }

    #addFoto .inout {
        margin-top: 10px;
        margin-left: 20px;
    }
    
    #addFoto button {
        margin-top: 15px;
        margin-left: 20px;
    }
    
    @media (min-width: 576px) {
        .feed {
        box-shadow: 10px 20px 20px rgba(0,0,0,.5);
        margin: 30px;
        border-radius: 15px;
        }
    } 
    
    @media (min-width: 578px) and (max-width:1000px) {
        #addFoto {
        top: 40%;
        left: 55%;
        width: 400px;
        }
    } 
    
    @media (max-width: 576px) {
        .feed {
        width: 100vw;
        border-radius: 5px;
        }  
        
        #addFoto {
        top: 40%;
        left: 59%;
        width: 400px;
        padding: 20px;
        }
    }
    
    @media (max-width: 388px) {
        .feed {
        width: 100vw;
        border-radius: 5px;
        }  
        
        #addFoto {
        top: 40%;
        left: 100%;
        width: 200px;
        box-shadow: 10px 30px 20px rgba(0,0,0,.5);
        display: none;
        }
    }
</style>