<template>
    <div id="bubble">
        <b-col id="bubble">
            <b-button @click="toggleActive" variant="light" class="d-flex flex-column">
                <div class="foto" id="usuFoto" :style="{backgroundImage: 'url(' + bubble.foto + ')'}" >
                </div>
                <small>{{bubble.nome}} {{bubble.sobrenome}}</small>
            </b-button>
        </b-col>
            <div id="info">
               <b-button id="close" class="btn-circle btn-sm float-left " variant="danger"><i class="fa fa-times" aria-hidden="true"></i></b-button>
                <h4>{{bubble.nome}} {{bubble.sobrenome}}</h4>
                   <p>Combinado em: dd/mm/aaaa</p>
                <div class="social">
                    <b-list-group>
                      <b-list-group-item class="bg-primary">
                        <i class="fa fa-facebook" aria-hidden="true"></i> | <span id="sp1" v-on:click="copyToClipboard('#sp1')">facebook.com/{{bubble.facebook}}</span>
                      </b-list-group-item>
                       <b-list-group-item class="bg-success">
                        <i class="fa fa-whatsapp" aria-hidden="true"></i> | <span id="sp2" v-on:click="copyToClipboard('#sp2')">{{bubble.whatsapp}}</span>
                      </b-list-group-item>
                      <b-list-group-item class="bg-warning">
                        <i class="fa fa-snapchat-ghost" aria-hidden="true"></i> | <span id="sp3" v-on:click="copyToClipboard('#sp3')" >@{{bubble.snapchat}}</span>
                      </b-list-group-item>
                      <b-list-group-item class="bg-info">
                        <i class="fa fa-twitter" aria-hidden="true"></i> | <span id="sp4" v-on:click="copyToClipboard('#sp4')">@{{bubble.twitter}}</span>
                      </b-list-group-item>
                      <b-list-group-item class="bg-gradient">
                        <i class="fa fa-instagram" aria-hidden="true"></i> | <span id="sp5" v-on:click="copyToClipboard('#sp5')">@{{bubble.instagram}}</span>
                      </b-list-group-item>
                    </b-list-group>
                </div>
            </div>
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
     },
    
    methods:{
        copyToClipboard(element) {
          var $temp = $("<input>");
          $("body").append($temp);
          $temp.val($(element).text()).select();
          document.execCommand("copy");
          $temp.remove();
            document.getElementById("info").style.display = "none";
            document.getElementById("copied").style.display = "block";
            setTimeout(function(){
               document.getElementById("copied").style.display = "none";
            }, 1100);
        },
        
        toggleActive() {
                document.getElementById("info").style.display = "block";
                $("#close").click(function() {
                    document.getElementById("info").style.display = "none";
                })
        }
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
    
    #usuFoto {
        width: 150px;
        height: 150px;
        border-radius: 80px;
        background-size: cover;
    }
    
    #bubble small {
        font-family: 'Raleway', sans-serif;
        color: #7f8c8d;
        font-size: 18px;
        margin-top: 25px;
        margin-left: 27px;
    }
    
    #bubble p {
        font-family: 'Raleway', sans-serif;
        color: #7f8c8d;
        font-size: 13px;
        margin-top: 0px;
        justify-content: center;
    }
    
    #bubble button {
        padding: 60px;
    }

    #bubble .list-group-item {
        color: white;
        cursor: pointer;
    }

    #bubble .list-group-item small {
        color: white;
        margin-left: 0px;
    }

    #bubble .bg-gradient{
        background: linear-gradient(-45deg, #F89406, #DB0A5B);
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
    
    #bubble #info{
        display: none;
        width: 50%;
        left: 25%;
    }
    
</style>