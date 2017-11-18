<template>
    <div id="bubble">
        <b-col id="bubble">
            <b-button v-b-toggle="'collapse'" variant="light" class="d-flex flex-column">
                <img src="/static/img/M3.jpg" alt="">
                <small>{{bubble.nome}} {{bubble.sobrenome}}</small>
            </b-button>
        </b-col>
        <b-collapse id="collapse">
            <div id="info">
               <b-button v-b-toggle="'collapse'" id="close" class="btn-circle btn-sm float-left" variant="danger"><i class="fa fa-times" aria-hidden="true"></i></b-button>
                <h4>{{bubble.nome}} {{bubble.sobrenome}}</h4>
                   <b-row id="facebook">
                       <b-col lg="4">
                           <b-button class="btn-circle" variant="primary"><i class="fa fa-facebook" aria-hidden="true"></i></b-button>
                       </b-col>
                       <b-col lg="8" ref="facebook">
                           <p>facebook.com/</p>
                       </b-col>
                   </b-row>
                   <b-row id="whats">
                       <b-col lg="4">
                           <b-button class="btn-circle" variant="success"><i class="fa fa-whatsapp" aria-hidden="true"></i></b-button>
                       </b-col>
                       <b-col lg="8" ref="whats">
                          <p>(xx) xxxxx-xxxx </p>  
                       </b-col>
                   </b-row>
                   <b-row id="snap">
                       <b-col lg="4">
                           <b-button class="btn-circle" variant="warning"><i class="fa fa-snapchat-ghost" aria-hidden="true"></i></b-button>
                       </b-col>
                       <b-col lg="8" ref="snap">
                           <p>@snapUser</p> 
                       </b-col>
                   </b-row>
                   <b-row id="twitter">
                       <b-col lg="4">
                           <b-button class="btn-circle" variant="info"><i class="fa fa-twitter" aria-hidden="true"></i></b-button>
                       </b-col>
                       <b-col lg="8" ref="twitter">
                           <p>@mytwaccount</p> 
                       </b-col>
                   </b-row>
            </div>
        </b-collapse>
    </div>
</template>


<script>
export default { 
     name: 'bubble', 

     props: {
         bubble: {
             type: Object,
             required: true
         }
     },
     
     created() {
         console.log(this.bubble.id);
         this.validateSocial();
     },
    
     methods: {
        
     }
}
</script>


<style>
    @import url('https://fonts.googleapis.com/css?family=Exo|Raleway:400,700,800|Poiret+One|Open+Sans|Open+Sans+Condensed:300');
    
    #info{
        background-color: #f7f7f7;
        border-radius: 15px;
        box-shadow: 0 30px 30px rgba(0,0,0,.6);
        text-align: center;
        position: fixed;
        top: 25%;
        z-index: 100000;
    }
    
    #bubble img {
        width: 150px;
        height: 150px;
    }
    
    #bubble small {
        font-family: 'Raleway', sans-serif;
        color: #7f8c8d;
        font-size: 18px;
        margin-top: 25px;
        margin-left: 27px;
    }
    
    #bubble button {
        padding: 60px;
    }
    
    #bubble .btn-circle {
         width: 50px;
         height: 50px;
         text-align: center;
         padding: 10px 0;
         font-size: 17px;
         line-height: 1.428571429;
         border-radius: 30px;
    }
    
    #bubble .btn-sm {
         width: 25px;
         height: 25px;
         padding: 0px;
         font-size: 13px;
         border-radius: 30px;
        margin-top: -10px;
    }
    
    #bubble h4{
       font-family: 'Poiret One', cursive;
        padding: 7px;
        font-size: 30px;
    }
</style>