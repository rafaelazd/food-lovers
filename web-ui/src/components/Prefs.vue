<template> 
    <b-col class="pref foot-icon">
        <img :src="pref.filepath" alt="">
        <b-button variant="danger" type="submit" @click="deletePref"><i class="fa fa-times" aria-hidden="true"></i></b-button>
    </b-col>
</template>

<script>
import axios from 'axios'
 export default { 
     name: 'Pref', 

     props: {
         pref: {
             type: Object,
             required: true
         }
     },
     
     created() {
         console.log(this.pref.idpref);
     },
     
     data() {
         return {
        
         }
     },
     
     methods: {
         deletePref() {
             axios({
              method: 'DELETE',
              url: 'http://localhost:8060/pessoas/3/preferencias' + '/' + this.pref.idpref,
            })
                .then(function (resp) {
                    console.log(resp);
                    window.location.reload();
                })
             
            //window.location.reload();
        }
   }
}
</script>

<style>

</style>
