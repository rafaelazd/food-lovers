<template>
    <section id="inicio-cover">
       <div class="container">
       <!-- Navbar -->
        <nav-all></nav-all> <br>
       <!-- END Navbar -->
   
       <!-- Nav -->
        <div class="nav nav-pills nav-fill">
            <div class="nav-item">
            <router-link class="nav-link active" role="a" aria-pressed="true" to="/feed"><i class="fa fa-th" aria-hidden="true"></i></router-link>
            </div>
            <div class="nav-item">
            <router-link class="nav-link" role="a" aria-pressed="true" to="/inicio"><i class="fa fa-heart" aria-hidden="true"></i></router-link>
            </div>
            <div class="nav-item">
            <router-link class="nav-link" role="a" aria-pressed="true" to="/chat"><i class="fa fa-comments" aria-hidden="true"></i></router-link>
            </div>
        </div> <br>    
        <!--END Nav -->
    
        <!-- Feed Card -->
        <div class="feed">
           <div class="card-columns">
             <post v-for="post in posts"  :key="post.id" :post="post"></post>
              <div class="foot">
                  <b-button  v-on:click="showhide" class="btn btn-danger btn-circle"><i class="fa fa-plus" aria-hidden="true"></i></b-button>
              </div>
            </div>
            <div id="addFoto">
                <h4>Escolha a Foto:</h4>
                <b-form-file class="input" id="inputFoto" choose-label="Procurar" placeholder="Nenhum selecionado"></b-form-file><br><br>
                <h5>Descrição</h5>
                <b-form-textarea id="textarea3"
                         placeholder="Digite descrição da foto"
                         :rows="4"
                         :maxlength="900"
                         name="Descricao">
                </b-form-textarea>
                <b-button @click="postFoto" variant="primary">Anonimo</b-button>
                <b-button type="submit" class="btn btn-outline-success" @click="postPerson">Confirmar</b-button>
            </div>
        </div>
        <!-- END Feed Card -->

       </div>
  </section>
</template>


<script>
import Post from '@/components/Post'
import axios from 'axios'
export default {
    components: {
            'post': Post
    },
    
    created() {
        this.buscarPosts();
    },
    
    data() {
      return {
          url: '#/perfil',
          posts: []
      }
    },
    
    methods: {
        buscarPosts() {
            axios.get('http://localhost:8060/fotografias')
                .then((resp) => {
                    this.erro = false;
                    this.posts = resp.data._embedded.fotografias;
                    console.log(resp)
                })
                .catch((err) => {
                    this.erro = true;
                    console.log(err)
                });
        },
        
        showhide() {
           var div = document.getElementById("addFoto");
            if (div.style.display !== "block") {
                div.style.display = "block";
            }
            else {
                div.style.display = "none";
            }
        },
        
        postFoto() {
            var descricao = document.getElementById("textarea3").value;
            var fole = document.getElementById("inputFoto").value.replace(/^.*\\/, "");
            var path = 'static/img/' + fole;
                    axios({
                        method: 'post',
                        url: 'http://localhost:8060/fotografias',
                        data: {
                            desc: descricao, 
                            pathFotografia: path,
                        }
                    })
                    .then(function (response) {
                        console.log(response);
                    })
                    .catch(function (error) {
                        console.log(error);
                    });
        },
        
        postPerson() {
             axios({
                method: 'put',
                url: 'http://localhost:8060/fotografias/8/usuario',
                headers: { 'Content-Type': 'text/uri-list' },
                data: 'http://localhost:8060/pessoas/3'
                })
                  .then(function (response) {
                    console.log(response);
                  })
                  .catch(function (error) {
                    console.log(error);
                  });
        }
    }
}
</script>


<style>
   @import url('https://fonts.googleapis.com/css?family=Exo|Open+Sans:300,400|Raleway:400,700,800|Poiret+One|Open+Sans+Condensed:300,300i');
    
     #inicio-cover {
            height: 100vh;
            width: 100vw;
            background-size: cover;
            display: flex; 
        }
    
    .container {
        min-width: 100vw;
        height: 100vh;
        left: 0px;
        padding-left: 0;
        overflow: auto;
    }
    
    .container nav {
        background-color: #34495e;
        max-width: none;
        min-width: 100vw;
        font-family: 'Exo', sans-serif;
    }
    
    .feed {
        background-color: #f9f9f9;
        background-size: cover;
        max-height: none;
        margin: 0;
        padding: 15px;
    }
    
    .feed .card {
        border-radius: 8px;
        max-width: 415px;
        overflow: hidden;
    }
    
    .feed .cab {
        background-color: #f4f4f4;
        width: 100%;
        color: #757575;
        padding: 4px;
    }
    
    .feed .cab a {
        text-decoration: underline;
        font-family: 'Open Sans', sans-serif;
    }
    
    .feed .cab a {
        margin: 9px;
        font-family: 'Questrial', sans-serif;
        font-size: 18px;
        
    }
    
    .feed .cab small {
        font-size: 16px;
        color: darkgray;
        margin: 9px;
    }
    
    .feed .reaction-bar button {
        margin: 7px;
        width: 30%;
        border-radius: 200px;
    }
    
    .feed .reaction-bar small {
        font-size: 16px;
        color: #7f8c8d;
        margin-top: 14px;
        margin-left: -100px;
    }
    
    .foot {
        position: fixed;
        left: 0;
        bottom:0;
        margin-left: 30px;
        margin-bottom: 30px;
        width:100%;
        background-color:  transparent;
    }
    
    .foot .btn-circle {
        width: 90px;
        height: 90px;
        border-radius: 50px;
        font-size: 30px;
        font-weight: 200
    }
    
    #addFoto {
        position: fixed;
        background-color:  white;
        border: 1px solid;
        border-color: #bdc3c7;
        z-index: 1;
        top: 40%;
        left: 40%;
        width:50%;
        height:75%;
        margin-top: -9em;
        margin-left: -15em;
        box-shadow: 10px 30px 20px rgba(0,0,0,.5);
        padding: 20px;
        display: none;
    }
    
    #addFoto h4 {
        color: #34495e;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300; 
        text-align: left;
        margin-left: 20px;
        margin: 10px;
    } 
    
    #addFoto h5 {
        color: #34495e;
        font-family: 'Open Sans', sans-serif;
        font-weight: 300; 
        text-align: left;
        margin-left: 10px;
    }

    #addFoto .inout {
        margin-top: 10px;
        margin-left: 20px;
    }
    
    #addFoto button {
        margin-top: 15px;
        margin-left: 20px;
    }
    
    @media (min-width: 576px) {
        .feed {
        box-shadow: 10px 20px 20px rgba(0,0,0,.5);
        margin: 30px;
        border-radius: 15px;
        }
    } 
    
    @media (min-width: 578px) and (max-width:1000px) {
        #addFoto {
        top: 40%;
        left: 55%;
        width: 400px;
        }
    } 
    
    @media (max-width: 576px) {
        .feed {
        width: 100vw;
        border-radius: 5px;
        }  
        
        #addFoto {
        top: 40%;
        left: 59%;
        width: 400px;
        padding: 20px;
        }
    }
    
    @media (max-width: 388px) {
        .feed {
        width: 100vw;
        border-radius: 5px;
        }  
        
        #addFoto {
        top: 40%;
        left: 100%;
        width: 200px;
        box-shadow: 10px 30px 20px rgba(0,0,0,.5);
        display: none;
        }
    }
</style>