<template> 
    <div class="card">
        <div class="cab d-flex justify-content-around">
            <div id="profileFoto" :style="{backgroundImage: 'url(' + dados.foto + ')'}" ></div>
            <a href="">{{dados.usuario}}</a>
            <small> 1h </small>
        </div>
        <div class="feed-foto">
            <img :src="post.pathFotografia" class="img-fluid">
                <div class="transparent"><p>{{post.desc}}</p></div>
        </div>
        <div class="reaction-bar d-flex justify-content-around">
             <button type="button" v-on:click="counter += 1" class="btn btn-outline-danger btn-circle"><i class="fa fa-heart-o" aria-hidden="true"></i></button>
             <small>{{counter}} Curtidas</small>
        </div>
    </div>
</template>

<script>
import axios from 'axios'
 export default { 
     name: 'Post', 

     props: {
         post: {
             type: Object,
             required: true
         }
     },
     
     created() {
         console.log(this.post.idFoto);
         this.buscarDados();
     },
     
     data() {
         return {
            counter: 0,
            dados: ''
         }
     },
     
     methods: {
        buscarDados() {
            axios.get('http://localhost:8060/fotografias/'+this.post.idFoto+'/usuario')
                .then((resp) => {
                    this.erro = false;
                    this.dados = resp.data;
                    console.log(resp)
                })
                .catch((err) => {
                    this.erro = true;
                    console.log(err)
                });
        }
     }
};
</script>

<style>
    #profileFoto {
        width: 45px;
        height: 45px;
        border-radius: 25px;
        background-size: cover;
    }
    
    .transparent {
        font-family: 'Open Sans', sans-serif;
        padding: 5px;
        padding-left: 5px;
    }
    
    .transparent p {
        border-left: 5px solid;
        border-color: #bdc3c7;
        padding-left: 9px;
    }
</style>
