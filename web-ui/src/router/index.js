import Vue from 'vue'
import Router from 'vue-router'
import UsuarioNaoAutenticado from '@/components/UsuarioNaoAutenticado'
import Login from '@/components/Login'
import Cadastro1 from '@/components/Cadastro1'
import Cadastro2 from '@/components/Cadastro2'
import Cadastro3 from '@/components/Cadastro3'
import Inicio from '@/components/Inicio'
import Chat from '@/components/Chat'
import Feed from '@/components/Feed'
import Config from '@/components/Config'
import AlterPerfil from '@/components/AlterPerfil'
import Duvidas from '@/components/Duvidas'
import Sobre from '@/components/Sobre'
import Preferencias from '@/components/Preferencias'
import Perfil from '@/components/Perfil'

Vue.use(Router)

export default new Router({
  routes: [
      {
      path: '/',
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
    },  {
      path: '/config',
      name: 'Config',
      component: Config
    },  {
      path: '/alter-perfil',
      name: 'AlterPerfil',
      component: AlterPerfil
    },  {
      path: '/duvidas',
      name: 'Duvidas',
      component: Duvidas
    },  {
      path: '/sobre',
      name: 'Sobre',
      component: Sobre
    },  {
      path: '/preferencias',
      name: 'Preferencias',
      component: Preferencias
    },  {
      path: '/perfil',
      name: 'Perfil',
      component: Perfil
    }
  ]
})
