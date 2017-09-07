<template>
    <section id="cover">
        <div id="cover-caption">
            <div class="container">
                <div class="text-center">
                    <img src="/static/img/logo.png" class="img-fluid" alt="Logo">
                    <div class="text-center" style="padding-top: 20px;">
                        <router-link class="btn btn-outline-danger btn-lg" role="button" aria-pressed="true" to="/login">Entrar</router-link>
                        <router-link class="btn btn-outline-danger btn-lg" role="button" aria-pressed="true" to="/cadastro">Cadastrar-se</router-link>
                    </div>
                </div>
            </div>    
        </div>
    </section>
</template>


<script>
</script>


<style>
    html, body {
        height: 100%;
        background: #222 url('/static/img/thanks1.png') center center no-repeat;
        background-size: cover;
        color: indianred;
        height: 100%;

    }
    #cover {
        background: #222 url('/static/img/thanks1.png') center center no-repeat;
        background-size: cover;
        color: indianred;
        height: 100%;
        text-align: center;
        display: flex;
        align-items: center;

    }
    #cover-caption {
        width: 100%;
    }
</style>