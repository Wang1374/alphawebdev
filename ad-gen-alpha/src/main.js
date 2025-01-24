import './assets/main.scss'
//import ant design vue css
import 'ant-design-vue/dist/reset.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'
//import ant design vue 4x
import antDesign from 'ant-design-vue'


import App from './App.vue'
import router from './router'

const app = createApp(App)

app.use(createPinia())
app.use(router)
app.use(antDesign)

app.mount('#app')
