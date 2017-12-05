<template> 
    <b-card class="profile" id="profile"  :style="{backgroundImage: 'url(' + image + ')'}" v-bind:class="{'swipe-left': clckNo, 'swipe-right': clckYes}">
         <div slot="footer" class="d-flex justify-content-around">
            <b-button class="btn btn-circle btn-danger" id="no" v-on:click="funcNo"><i class="fa fa-times" aria-hidden="true"></i></b-button>
            <b-button v-b-toggle="'collapse2'" class="btn btn-circle btn-info m-1"><i class="fa fa-info-circle" aria-hidden="true"></i></b-button>
            <b-button class="btn btn-circle btn-success" id="yes" v-on:click="funcYes"><i class="fa fa-check" aria-hidden="true"></i></b-button> 
        </div>
        <b-collapse id="collapse2">
            <b-button v-b-toggle="'collapse2'" class="btn btn-circle btn-times btn-danger float-left m-1"><i class="fa fa-times" aria-hidden="true"></i></b-button><br>
            <h1>{{profile.nome}} {{profile.sobrenome}}, {{profile.idade}}</h1>
            <p><i class="fa fa-map-marker" aria-hidden="true"></i> {{profile.local}}</p>
            <h6>{{profile.biografia}}</h6>
            <p>
            <img src="/static/img/batataico.png" alt="icoFrituras" width="40px" height="40px">
            <img src="/static/img/cafeico.png" alt="icoBebidasHot" width="40px" height="40px">
            <img src="/static/img/pizzaico.png" alt="icoPizza" width="40px" height="40px">
            </p>
            <p>
            <b-button class="btn btn-sm btn-secondary" :href="toPerfil"><i class="fa fa-id-card-o" aria-hidden="true"></i> Ver Perfil</b-button>
            </p>
        </b-collapse>
    </b-card>
</template>

<script>

 export default { 
     name: 'Profile', 

     props: {
         profile: {
             type: Object,
             required: true
         }
     },
     
     created() {
         console.log(this.profile.idusu);
     },
     
     data() {
         return {
             image: "/static/img/m5.jpg",
             toPerfil: '#/perfil',
             clckNo: false,
             clckYes: false
         }
     },
     
     methods: {
         funcNo () {
             this.clckNo = true
         },
         funcYes () {
             this.clckYes = true
         }
     }
};
</script>

<style>
    
    .swipe-left {
        animation: swipe-left 1s forwards;
    }

    .swipe-right {
        animation: swipe-right 1s forwards;
    }
  
    @keyframes swipe-left {
        to {
            transform: rotate(-13deg) translate3d(-100%, 0, 0);
            opacity: 0;
        }
    }

    @keyframes swipe-right {
        to {
            transform: rotate(13deg) translate3d(100%, 0, 0);
            opacity: 0;
        }
    }
</style>
