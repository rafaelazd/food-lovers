<template>
    <section id="usuario-nao-autenticado-cover">
        <div id="cover-caption">
            <div class="container">
                <div class="text-center">
                    <img src="/static/img/logo.png" class="img-fluid" alt="Logo">
                    <div class="text-center" style="padding-top: 20px;">
                        <router-link class="btn btn-outline-danger btn-lg" role="button" aria-pressed="true" to="/login">Entrar</router-link>
                        <router-link class="btn btn-outline-danger btn-lg" role="button" aria-pressed="true" to="/cadastro-1">Cadastrar-se</router-link>
                    </div>
                </div>
            </div>    
        </div>
    </section>
</template>


<script>
</script>


<style>
    /* TODO corrigir este erro*/
    
    #usuario-nao-autenticado-cover {
/*
        position: absolute;
        top: 0;
        left: 0;
        right: 0;
        bottom: 0;
*/
        height: 100vh;
        width: 100vw;
        background: #222 url('/static/img/thanks1.png') center center no-repeat;
        background-size: cover;
        color: indianred;
        text-align: center;
        display: flex;
        align-items: center;

    }
    #cover-caption {
        width: 100%;
    }
</style>