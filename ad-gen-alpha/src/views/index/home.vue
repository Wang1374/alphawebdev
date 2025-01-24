<!-- homepage -->
<template>
    <view class="wapper">
        <view class="wapper-header">
            <view class="wapper-header-logo">AD GEN ALPHA
            </view>
            <view class="wapper-header-btns">
                <view class="wapper-header-btns-home" ref="home" @click="(event) => toPage(event,'home')">
                    home
                </view>
                <view class="wapper-header-btns-tryit">
                    try it
                </view>
                <view class="wapper-header-btns-contact" @click="(event) => toPage(event, 'contact')">
                    contact
                </view>
            </view>
            <view class=wapper-header-search></view>
        </view>
        <view class="wapper-content">
            <RouterView />
        </view>
    </view>
</template>
<script setup>

import { RouterView, RouterLink, useRouter } from 'vue-router';
import { reactive , onMounted, ref} from 'vue'
const data = reactive({
    lastActive: undefined,
});

const router = useRouter();
const toPage = (event,path) => {
    if(data.lastActive){
        data.lastActive.classList.remove('active');
    }
    data.lastActive = event.target;
    event.target.classList.add('active');
    router.push({ path: path});  
};
const home = ref(null);
onMounted(() => {
    console.log(home.value);
    toPage({target: home.value}, 'home')
 
});

</script>
<style lang="scss" scoped>

@use '@/assets/global.scss' as *;
.wapper {
    width: 100%;
    height: 100%;
    display: flex;
    flex-direction: column;
    background-color: $backdrop-color;
    color: $typeface-color;
    &-header {
        padding: 10px;
        flex: .1;
        display: flex;
        align-items: center;
        &-logo {
            flex: 1;
            text-align: right;
        }
        &-btns {
            flex: 1;
            display: flex;
            text-align: center;
            &-home{
                flex: .5;
                cursor: pointer;
            }
            &-tryit{
                flex: .5;
                cursor: pointer;
            }
            &-contact{
                flex: .5;
                cursor: pointer;
            }
            .active{
                color: yellow;
            }
        }
        &-search{
            flex: 3;
        }
    }

    &-content {
        flex: 2;
    }
}
</style>