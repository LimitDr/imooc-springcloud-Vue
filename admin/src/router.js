import Vue from 'vue'
import Login from './views/Login'
import Router from "vue-router";
import Admin from "@/views/Admin";

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
    },{
        path: '/admin',
        component: Admin
    }]
})