import Vue from 'vue'
import Login from './views/Login'
import Router from "vue-router";

Vue.use(Router)

export default new Router({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: [{
        path: '*',
        redirect: '/login',
    },{
        path: '/login',
        component: Login
    }]
})