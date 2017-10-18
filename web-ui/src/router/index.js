import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import UsuarioNaoAutenticado from '@/components/UsuarioNaoAutenticado'
import Login from '@/components/Login'
import Cadastro1 from '@/components/Cadastro1'
import Cadastro2 from '@/components/Cadastro2'
import Cadastro3 from '@/components/Cadastro3'
import Inicio from '@/components/Inicio'
import Chat from '@/components/Chat'
import Feed from '@/components/Feed'

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
    },{
      path: '/cadastro-3',
      name: 'Cadastro3',
      component: Cadastro3
    },{
      path: '/inicio',
      name: 'Inicio',
      component: Inicio
    },  {
      path: '/chat',
      name: 'Chat',
      component: Chat
    },  {
      path: '/feed',
      name: 'Feed',
      component: Feed
    }
  ]
})
