import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import UsuarioNaoAutenticado from '@/components/UsuarioNaoAutenticado'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Hello',
      component: Hello
    }, {
      path: '/usuario-nao-autenticado',
      name: 'UsuarioNaoAutenticado',
      component: UsuarioNaoAutenticado
    }
  ]
})
