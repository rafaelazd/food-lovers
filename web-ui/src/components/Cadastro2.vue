<template>
   <section id="cad-cover">
       <div class="container">
        <div class="horizontal-center">
                <div class="nb-login">
                   <div class="progress">
                    <div class="progress-bar bg-info" role="progressbar" style="width: 66%" aria-valuenow="66" aria-valuemin="0" aria-valuemax="100"></div>
                    </div> <br> <br>
                    <h1><img src="/static/img/foodlovers.png" class="img-fluid"></h1>
                    <p>Selecione até 5 categorias culinárias de sua preferência.</p>
                    <!-- Formulario -->
                    <div class="card-block">
                        <form class="form" role="form" autocomplete="off" id="formLogin" action="">
                            
                            <div class="row">
                                <div class="col"><label class="btn btn-primary"><img src="/static/img/batata.png" alt="Batata Frita" class="img-thumbnail img-check"><input type="checkbox" name="chk1" id="item1" value="val1" class="hidden" autocomplete="off"></label></div>
                                <div class="col"><label class="btn btn-primary"><img src="/static/img/bolo.png" alt="Bolo" class="img-thumbnail img-check"><input type="checkbox" name="chk2" id="item2" value="val2" class="hidden" autocomplete="off"></label></div>
                                <div class="col"><label class="btn btn-primary"><img src="/static/img/cafe.png" alt="Café" class="img-thumbnail img-check"><input type="checkbox" name="chk3" id="item3" value="val3" class="hidden" autocomplete="off"></label></div>
                            </div>
                            <div class="row">
                                <div class="col"><label class="btn btn-primary"><img src="/static/img/macarrao.png" alt="Macarrão" class="img-thumbnail img-check"><input type="checkbox" name="chk4" id="item4" value="val1" class="hidden" autocomplete="off"></label></div>
                                <div class="col"><label class="btn btn-primary"><img src="/static/img/nachos.png" alt="Nachos" class="img-thumbnail img-check"><input type="checkbox" name="chk2" id="item5" value="val2" class="hidden" autocomplete="off"></label></div>
                                <div class="col"><label class="btn btn-primary"><img src="/static/img/pizza.png" alt="Pizza" class="img-thumbnail img-check"><input type="checkbox" name="chk3" id="item6" value="val3" class="hidden" autocomplete="off"></label></div>
                            </div>
                               <div class="row">
                                <div class="col"><label class="btn btn-primary"><img src="/static/img/sanduiche.png" alt="Sanduíche" class="img-thumbnail img-check"><input type="checkbox" name="chk1" id="item7" value="val1" class="hidden" autocomplete="off"></label></div>
                                <div class="col"><label class="btn btn-primary"><img src="/static/img/sushi.png" alt="Sushi" class="img-thumbnail img-check"><input type="checkbox" name="chk2" id="item8" value="val2" class="hidden" autocomplete="off"></label></div>
                                <div class="col"><label class="btn btn-primary"><img src="/static/img/tacos.png" alt="Tacos" class="img-thumbnail img-check"><input type="checkbox" name="chk3" id="item9" value="val3" class="hidden" autocomplete="off"></label></div>
                                </div>
                            <router-link class="btn btn-outline-danger btn-lg" role="button" aria-pressed="true" to="/usuario-nao-autenticado">Cancelar</router-link>
                            <router-link class="btn btn-outline-danger btn-lg" role="button" aria-pressed="true" to="/cadastro-1">Voltar</router-link>
                            <router-link class="btn btn-outline-danger btn-lg" role="button" aria-pressed="true" to="/cadastro-3">Confirmar</router-link>
                        </form>
                    </div>
                </div>
        </div>
        </div>
    </section>
</template>


<script>
    $(document).ready(function(e) {
        $(".img-check").click(function() {
            $(this).toggleClass("check");
        });
    });

</script>

<style>
   #cad-cover {
        height: 100vh;
        width: 100vw;
        background: #222 url('/static/img/boys.png') no-repeat center center fixed; 
        -webkit-background-size: cover;
        -moz-background-size: cover;
        -o-background-size: cover;
        background-size: cover;
        display: flex;
        
    }

    
    .nb-login {
        padding: 20px 25px;
        border-radius: 2px;
        box-shadow: 0px 0px 15px rgba(255, 255, 255, 0.05);
        height: 100vh;
        align-content: center;
    }
    
    .nb-login h3 {
        font-size: 13px;
        line-height: 13px;
        margin: 15px 0px 25px 0px;
        text-transform: uppercase;
        color: #ffffff;
    }
    
    .nb-login h2 {
        font-family: 'Asap Condensed', sans-serif;
    }
    
    .nb-login p {
        color: #bdc3c7;
    }
    
    .nb-login form {
        margin-bottom: 15px;
        color: #ffffff;
    }
    
    .nb-login form input,
    .nb-login form textarea {
        box-shadow: none !important;
        padding: 6px 5px;
        color: #ffffff;
        border: 0px;
        border-bottom: 1px solid rgba(255, 255, 255, 0.5);
        background: transparent;
        border-radius: 0px;
    }
    
    .nb-login form input:focus {
        background: rgba(255, 255, 255, 0.05);
    }
    
    .nb-login form ::-webkit-input-placeholder {
        color: #ffffff;
    }
    
    .nb-login form ::-moz-placeholder {
        color: #ffffff;
    }
    
    .nb-login form :-ms-input-placeholder {
        color: #ffffff;
    }
    
    .nb-login form .btn {
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
    
    .nb-login form .btn:hover {
        background: #bdc3c7;
        color: #fff;
    }
    
    .nb-login .center {
        text-align: center;
    }
    
    .nb-login .or {
        color: #FFF;
    }
    
    .horizontal-center {
        align-items: center;
        text-align: center;
    }

</style>
