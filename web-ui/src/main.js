// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'

import router from './router'

import BootstrapVue from 'bootstrap-vue'

import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import 'font-awesome/css/font-awesome.css'

Vue.use(BootstrapVue);

Vue.config.productionTip = false

/* eslint-disable no-new */
Vue.component('nav-all', {
    template: '<nav class="navbar navbar-toggleable-md navbar-dark navbar-fixed-top d-flex justify-content-between"><b-nav-toggle target="nav_collapse"></b-nav-toggle> <img src="/static/img/foodlovers.png" width="158px"> <router-link class="btn btn-outline-secondary" role="button" aria-pressed="true" to="/config"><i class="fa fa-cog" aria-hidden="true"></i></router-link><b-collapse is-nav id="nav_collapse"><b-nav is-nav-bar><b-nav-item v-bind:href="url">Perfil</b-nav-item></b-nav></b-collapse></nav>', 
   data() {
        return {
            url: '#/usu-perfil'
        }
    }
});

Vue.component('app-checkbox', {
    template: '<b-form-checkbox-group buttons button-variant="primary" id="checkboxes1" name="btnprefs" v-model="selected"><b-form-checkbox value="Homens">Homens</b-form-checkbox><b-form-checkbox value="Mulheres">Mulheres</b-form-checkbox></b-form-checkbox-group>'
});

new Vue({
  el: '#app',
  router,
  template: '<App/>',
  components: { App }
});


