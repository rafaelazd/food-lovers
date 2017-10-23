<template>
   <section id="inicio-cover">
       <div class="container">
       <!-- Navbar -->
        <nav class="navbar navbar-toggleable-md navbar-dark navbar-fixed-top d-flex justify-content-between">
                <b-nav-toggle target="nav_collapse"></b-nav-toggle>
                <img src="/static/img/foodlovers.png" width="158px">
                <router-link class="btn btn-outline-secondary" role="button" aria-pressed="true" to="/config"><i class="fa fa-cog" aria-hidden="true"></i></router-link>     
                <b-collapse is-nav id="nav_collapse">
                    <b-nav is-nav-bar>
                          <b-nav-item href="#"> Perfil</b-nav-item>
                          <b-nav-item href="#">Preferências</b-nav-item>
                          <b-nav-item href="#">Combinações</b-nav-item>
                    </b-nav>
                </b-collapse>
        </nav><br>
       <!-- END Navbar -->
   
       <!-- Back Button -->
        <div class="backset">
           <router-link class="btn btn-outline-secondary" role="button" aria-pressed="true" to="/inicio"><i class="fa fa-arrow-left" aria-hidden="true"></i> Voltar para Inicio</router-link> 
        </div>
        <!--END Back Button -->
    
        <!-- Perfil -->
        <div class="head">
            <h1>Alterando seus dados pessoais</h1> <br>
            <p>O que você deseja mudar em seu perfil?</p>
        </div> <br>
                <b-tabs pills id="tabs">
                  <b-tab title="Foto de Perfil" active><br>
                      <div class="body">
                            <h4>Foto atual:</h4>
                            <img src="/static/img/m7.png" id="usuFoto"> <br><br>
                            <b-form-file id="input2" v-model="file2" choose-label="Procurar" placeholder="Nenhum selecionado"></b-form-file><br><br>
                        <b-button type="submit" class="btn btn-outline-success float-left">Confirmar</b-button>
                      </div>
                  </b-tab>
                  <b-tab title="Dados Pessoais"><br>
                      <div class="body d-flex flex-column justify-content-center">
                            <form class="form" role="form" autocomplete="off" id="formConfig" action="">
                              <b-row>
                                 <b-col>
                                     <h4>Dados Pessoais</h4><br>
                                 </b-col>
                              </b-row>
                              <b-row class="inputs">
                                   <b-col>
                                       <input type="text" class="form-control" name="nome" required="" placeholder="Nome" id="nome">
                                   </b-col>
                                   <b-col>
                                        <input type="text" class="form-control" name="sobrenome" required="" placeholder="Sobrenome" id="sobrenome">
                                   </b-col>
                                   <b-col>
                                        <input type="number" class="form-control" name="idade" required="" placeholder="Idade" id="idade"><br>
                                   </b-col>
                               </b-row>
                               <b-row>
                                <h5>Preferência em:</h5><br>    
                               </b-row>
                               <b-row class="inputs2">
                                    <b-form-checkbox-group buttons button-variant="primary" id="checkboxes2" name="btn-preferencia" v-model="selected">
                                      <b-form-checkbox value="Homens">Homens</b-form-checkbox>
                                      <b-form-checkbox value="Mulheres">Mulheres</b-form-checkbox>
                                    </b-form-checkbox-group>
                               </b-row>
                            </form><br>
                        <b-button type="submit" class="btn btn-outline-success float-left">Confirmar</b-button>
                      </div>
                  </b-tab>
                  <b-tab title="E-mail"><br>
                      <div class="body d-flex flex-column justify-content-center">
                            <form class="form" role="form" autocomplete="off" id="formConfig" action="">
                              <b-row>
                                 <b-col>
                                     <h4>E-mail</h4>
                                 </b-col>
                              </b-row>
                              <b-row class="inputs2">
                                   <input type="email" class="form-control" name="email" id="email" placeholder="E-mail">
                              </b-row>
                            </form><br>
                        <b-button type="submit" class="btn btn-outline-success float-left">Confirmar</b-button>
                      </div>
                  </b-tab>
                  <b-tab title="Usuário"><br>
                      <div class="body d-flex flex-column justify-content-center">
                            <form class="form" role="form" autocomplete="off" id="formConfig" action="">
                              <b-row>
                                 <b-col>
                                     <h4>Usuário</h4>
                                 </b-col>
                              </b-row>
                              <b-row class="inputs2">
                                   <input type="text" class="form-control" name="usuario" required="" placeholder="Usuário" id="usuario">
                              </b-row>
                            </form><br>
                        <b-button type="submit" class="btn btn-outline-success float-left">Confirmar</b-button>
                      </div>
                  </b-tab>
                  <b-tab title="Senha"><br>
                      <div class="body d-flex flex-column justify-content-center">
                            <form class="form" role="form" autocomplete="off" id="formConfig" action="">
                              <b-row>
                                 <b-col>
                                     <h4>Senha</h4>
                                 </b-col>
                              </b-row>
                              <b-row class="inputs3">
                                   <input type="password" class="form-control" name="senha1" id="senha1" required="" placeholder="Senha" autocomplete="new-password"> <br><br>
                              </b-row>
                              <b-row>
                                 <b-col>
                                     <h5>Confirmar Senha</h5>
                                 </b-col>
                              </b-row>
                              <b-row class="inputs2">
                                   <input type="password" class="form-control" name="senha2" id="senha2" required="" placeholder="Senha" autocomplete="new-password">
                              </b-row>
                            </form> <br>
                        <b-button type="submit" class="btn btn-outline-success float-left">Confirmar</b-button>
                      </div>
                  </b-tab>
                </b-tabs>
        <!-- END Perfil-->

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
    
    @media (max-width:370px){
        .body img {
            max-width: 260px;
            max-height: none;
        }
    }
</style>