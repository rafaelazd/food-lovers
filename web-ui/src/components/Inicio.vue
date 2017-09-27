<template>
   <section id="inicio-cover">
   <div class="container">
   <b-navbar toggleable="md" type="dark" variant="info">
    <b-nav-toggle target="nav_collapse"></b-nav-toggle>

  <b-navbar-brand href="#"><b-img src="/static/img/foodlovers.png" fluid alt="Logo"/></b-navbar-brand>

  <b-collapse is-nav id="nav_collapse">

    <b-nav is-nav-bar>
      <b-nav-item href="#">Perfil</b-nav-item>
      <b-nav-item href="#">Preferências</b-nav-item>
      <b-nav-item href="#">Combinações</b-nav-item>
    </b-nav>

  </b-collapse>
   </b-navbar>
   </div>
  </section>
</template>


<script>


</script>


<style>
    #inicio-cover {
        height: 100vh;
        width: 100vw;
        background-size: cover;
        display: flex;
    }
    
    .container b-navbar {
        left: 0;
    }
</style>
