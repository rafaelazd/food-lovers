<template>
    <section id="cad-cover">
       <div class="container">
        <div class="horizontal-center">
                <div class="nb-login">
                   <div class="progress">
                    <div class="progress-bar bg-info" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                    </div> <br> <br>
                    <h1><img src="/static/img/foodlovers.png" class="img-fluid"></h1>
                    <p>Personaliza o seu Perfil.</p>
                    <!-- Perfil Card -->
                        <div class="row justify-content-center">
                            <div>
                               <b-card-group class="d-flex justify-content-center">
                                    <b-card class="profile-custom">
                                        <div slot="footer" class="d-flex justify-content-around">
                                           <label class="input-group-btnd-inline-flex p-2">
                                                            <span class="btn btn-secondary">
                                                                Procurar Imagem&hellip; <input type="file" style="display: none;" multiple>
                                                            </span>
                                                        </label>
                                            <b-button v-b-toggle="'collapse2'" class="btn btn-circle btn-info m-1"><i class="fa fa-info-circle" aria-hidden="true"></i></b-button>
                                        </div>
                                        <b-collapse id="collapse2">
                                            <h1 id="usuNome">Kali Meinar, <h1 id="usuIdade">23</h1></h1>
                                            <textarea rows="4" cols="24" name="comment" placeholder="Conte-nos mais sobre você..."></textarea>
                                            <p>
                                            <img src="/static/img/batataico.png" alt="icoFrituras" width="50px" height="50px">
                                            <img src="/static/img/boloico.png" alt="icoDoces" width="50px" height="50px">
                                            <img src="/static/img/cafeico.png" alt="icoBebidasHot" width="50px" height="50px">
                                            <img src="/static/img/icosand.png" alt="icoLanches" width="50px" height="50px">
                                            <img src="/static/img/pizzaico.png" alt="icoPizza" width="50px" height="50px">
                                            </p>
                                            <b-button v-b-toggle="'collapse2'" class="btn btn-circle btn-success m-1" type="submit"><i class="fa fa-check" aria-hidden="true"></i></b-button>
                                      </b-collapse>
                                    </b-card>
                                     
                                </b-card-group> <br> <br>
                                <div class="buttons d-flex justify-content-center">
                                <router-link class="btn btn-outline-danger btn-lg" role="button" aria-pressed="true" to="/usuario-nao-autenticado">Cancelar</router-link>
                                <router-link class="btn btn-outline-danger btn-lg" role="button" aria-pressed="true" to="/cadastro-2">Voltar</router-link>
                                <router-link class="btn btn-outline-danger btn-lg" role="button" aria-pressed="true" to="/inicio">Confirmar</router-link>
                                </div>
                            </div>
                        </div>
                 <!-- END Perfil Card -->
                </div>
         </div>
        </div>
    </section>
</template>


<script>
    $(function() {

  // We can attach the `fileselect` event to all file inputs on the page
  $(document).on('change', ':file', function() {
    var input = $(this),
        numFiles = input.get(0).files ? input.get(0).files.length : 1,
        label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
    input.trigger('fileselect', [numFiles, label]);
  });

  // We can watch for our custom `fileselect` event like this
  $(document).ready( function() {
      $(':file').on('fileselect', function(event, numFiles, label) {

          var input = $(this).parents('.input-group').find(':text'),
              log = numFiles > 1 ? numFiles + ' files selected' : label;

          if( input.length ) {
              input.val(log);
          } else {
              if( log ) alert(log);
          }

      });
  });
  
});
</script>

<style>
    @import url('https://fonts.googleapis.com/css?family=Exo|Raleway:400,700,800|Poiret+One');
    
    .container {
        width: 100vw;
        height: 100vh;
    }
    
    #cad-cover {
        height: 100vh;
        width: 100vw;
        background: #222 url('/static/img/boys.png') no-repeat center center fixed; 
        background-size: cover;
        
    }
    
    .nb-login {
        padding: 20px 25px;
        border-radius: 2px;
        box-shadow: 0px 0px 15px rgba(255, 255, 255, 0.05);
        height: 100vh;
        align-content: center;
        color: white;
    }
    
    .nb-login form {
        margin-bottom: 15px;
        color: #ffffff;
    }
    
    .nb-login .btn-lg {
        border: 0px;
        border-radius: 25px;
        padding: 5px 10px;
        border: 1px solid #bdc3c7;
        color: #bdc3c7;
        text-transform: uppercase;
        font-weight: 600;
        background: transparent;
        margin-top: 15px;
        -webkit-transition: all 0.5s ease;
        -moz-transition: all 0.5s ease;
        -o-transition: all 0.5s ease;
        -ms-transition: all 0.5s ease;
        transition: all 0.5s ease;
    }
    
    .nb-login .btn-lg:hover {
        background: #bdc3c7;
        color: #fff;
    }

    .container .profile-custom {
        max-width: 280px;
        height: 480px;
        background-color: #ecf0f1;
        border-style: hidden;
        box-sizing: border-box;
        border-radius: 15px;
        overflow: hidden;
        box-shadow: 10px 20px 20px rgba(0,0,0,.5);
        background-size: cover;
    }
    .container .profile-custom .btn-circle {
        width: 45px;    
        height: 45px;
        vertical-align: bottom;
        font-size: 12px;
        border-radius: 25px;   
    }
    
    .container .profile-custom .close {
        margin: 0;
        font-size: 30px;
    }
    
    #collapse2 {
        background-color: #f7f7f7;
        border-radius: 15px;
        overflow: hidden;
        box-shadow: 0 30px 30px rgba(0,0,0,.6);
        text-align: center;
    }
    #collapse2 h1 {
        font-family: 'Poiret One', cursive;
        padding: 7px;
        font-size: 40px;
        color: #2c3e50;
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
    
    #collapse2 textarea {
        font-family: 'Raleway', sans-serif;
        padding: 10px;
    }
    
    .horizontal-center {
        align-items: center;
        text-align: center;
    }
    
    #inputfile {
        height: 30px;
        background-color: transparent;
        color: white;
    }

</style>