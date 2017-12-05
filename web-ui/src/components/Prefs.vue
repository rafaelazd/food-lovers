<template> 
    <b-col class="pref foot-icon">
        <img :src="pref.filepath" alt="">
    </b-col>
</template>

<script>
 export default { 
     name: 'Pref', 

     props: {
         pref: {
             type: Object,
             required: true
         }
     },
     
     created() {
         console.log(this.pref.id);
     },
     
     data() {
         return {
             
         }
     }
}
</script>

<style>

</style>
