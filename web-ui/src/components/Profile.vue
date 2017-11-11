<template> 
    <b-card class="profile" id="profile"  style="background-image: url('/static/img/m5.jpg')">
         <div slot="footer" class="d-flex justify-content-around">
            <b-button class="btn btn-circle btn-danger"><i class="fa fa-times" aria-hidden="true"></i></b-button>
            <b-button v-b-toggle="'collapse2'" class="btn btn-circle btn-info m-1"><i class="fa fa-info-circle" aria-hidden="true"></i></b-button>
            <b-button class="btn btn-circle btn-success"><i class="fa fa-check" aria-hidden="true"></i></b-button> 
        </div>
        <b-collapse id="collapse2">
            <b-button v-b-toggle="'collapse2'" class="btn btn-circle btn-times btn-danger float-left m-1"><i class="fa fa-times" aria-hidden="true"></i></b-button><br>
            <h1>{{profile.nome}} {{profile.sobrenome}}, {{profile.idade}}</h1>
            <p><i class="fa fa-map-marker" aria-hidden="true"></i>  São Paulo, SP - Brasil</p>
            <h6>{{profile.biografia}}</h6>
            <p>
            <img src="/static/img/batataico.png" alt="icoFrituras" width="40px" height="40px">
            <img src="/static/img/cafeico.png" alt="icoBebidasHot" width="40px" height="40px">
            <img src="/static/img/pizzaico.png" alt="icoPizza" width="40px" height="40px">
            </p>
            <p>
            <b-button class="btn btn-sm btn-info"><i class="fa fa-rss" aria-hidden="true"></i>Seguir</b-button>
            <b-button class="btn btn-sm btn-secondary" href="#"><i class="fa fa-id-card-o" aria-hidden="true"></i>Ver Perfil</b-button>
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
         console.log(this.profile.id);
     }
};
</script>

<style>
    
</style>
