// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'

import router from './router'

import BootstrapVue from 'bootstrap-vue'
import VueTheMask from 'vue-the-mask'
import VueClip from 'vue-clip'
import VueIntro from 'vue-introjs'

import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import 'font-awesome/css/font-awesome.css'
import 'tether-shepherd/dist/css/shepherd-theme-arrows.css'
import 'tether-shepherd/dist/js/shepherd.min.js'
import 'tether/dist/js/tether.min.js'

Vue.use(BootstrapVue);
Vue.use(VueTheMask);
Vue.use(VueClip);
Vue.use(VueIntro)

Vue.config.productionTip = false

/* eslint-disable no-new */
Vue.component('nav-all', {
    template: '<nav class="navbar navbar-toggleable-md navbar-dark navbar-fixed-top d-flex justify-content-between"><b-nav-toggle target="nav_collapse"></b-nav-toggle> <img src="/static/img/foodlovers.png" width="158px"> <router-link class="btn btn-outline-secondary" role="button" aria-pressed="true" to="/config"><i class="fa fa-cog" aria-hidden="true"></i></router-link><b-collapse is-nav id="nav_collapse"><b-nav is-nav-bar><b-nav-item v-bind:href="url">Perfil</b-nav-item></b-nav></b-collapse></nav>', 
   data() {
        return {
            url: '#/perfil'
        }
    }
});

new Vue({
  el: '#app',
  router,
  template: '<App/>',
  components: { App }
});


