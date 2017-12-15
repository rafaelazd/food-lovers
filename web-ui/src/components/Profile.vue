<template> 
    <b-card class="profile" id="profile"  :style="{backgroundImage: 'url(' + profile.foto + ')'}" v-bind:class="{'swipe-left': clckNo, 'swipe-right': clckYes}">
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
                <b-row class="d-flex justify-content-center" id="minicons">
                    <b-col  v-for="pref in prefs"  :key="pref.id" class="prefs-icon" cols="2">
                        <img :src="pref.filepath" :alt="pref.nome">
                    </b-col>
                </b-row>
            </p>
            <p>
                <b-button class="btn btn-sm btn-secondary" :href="toPerfil()"><i class="fa fa-id-card-o" aria-hidden="true"></i> Ver Perfil</b-button>
            </p>
        </b-collapse>
    </b-card>
</template>

<script>
import axios from 'axios'
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
         this.buscarPref();
     },
     
     data() {
         return {
             clckNo: false,
             clckYes: false,
             prefs: []
         }
     },
     
     methods: {
         funcNo () {
             this.clckNo = true
         },
         funcYes () {
             this.clckYes = true
         }, 
         
         buscarPref() {
                axios.get('http://localhost:8060/pessoas/'+ this.profile.idusu +'/preferencias')
                    .then((resp) => {
                       this.erro = false;
                        this.prefs = resp.data._embedded.preferencias;
                        console.log(resp.data);
                    })
                    .catch((err) => {
                        this.erro = true;
                        console.log(err)
                    });
         },
         
         toPerfil() {
             return '#/perfil#' + this.profile.idusu
         }
     }
};
</script>

<style>
    .prefs-icon img{
        width: 50px;
        height: 50px;
    }
    
    #minicons {
       margin-left: -45px; 
    }
    
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
