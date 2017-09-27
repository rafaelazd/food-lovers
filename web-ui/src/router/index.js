import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import UsuarioNaoAutenticado from '@/components/UsuarioNaoAutenticado'
import Login from '@/components/Login'
import Cadastro1 from '@/components/Cadastro1'
import Cadastro2 from '@/components/Cadastro2'
import Inicio from '@/components/Inicio'

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
    }, {
      path: '/login',
      name: 'Login',
      component: Login
    }, {
      path: '/cadastro-1',
      name: 'Cadastro1',
      component: Cadastro1
    }, {
      path: '/cadastro-2',
      name: 'Cadastro2',
      component: Cadastro2
    },  {
      path: '/inicio',
      name: 'Inicio',
      component: Inicio
    }
  ]
})
