<template>
    <view class="wapper">
        <form class="wapper-form">
            <view class="wapper-form-item">
                <label class="wapper-form-item-label">name<i class="wapper-form-item-label-required">*</i><span class="wapper-form-item-label-verify">{{ data.verify.username }}</span></label>
                <a-input class="wapper-form-item-input" v-model:value="data.formData.username" />
            </view>
            <view class="wapper-form-item">
                <label class="wapper-form-item-label">phone</label>
                <a-input class="wapper-form-item-input" v-model:value="data.formData.phone"/>
            </view>
            <view class="wapper-form-item">
                <label class="wapper-form-item-label">email address<i class="wapper-form-item-label-required">*</i></label>
                <a-input class="wapper-form-item-input" v-model:value="data.formData.email"/>
            </view>
            <view class="wapper-form-item">
                <label class="wapper-form-item-label">registered address</label>
                <a-input class="wapper-form-item-input" v-model:value="data.formData.registered"/>
            </view>

            <view class="wapper-form-item">
                <label class="wapper-form-item-label">physical address </label>
                <a-input class="wapper-form-item-input" v-model:value="data.formData.physical" />
            </view>
            <view class="wapper-form-item">
                <label class="wapper-form-item-label">business type  </label>
                <a-input class="wapper-form-item-input" v-model:value="data.formData.business" />
            </view>
            
            <view class="wapper-form-item">
                <label class="wapper-form-item-label">introduction of the business<i class="wapper-form-item-label-required">*</i></label>
                <a-input class="wapper-form-item-input" v-model:value="data.formData.introduction" />
            </view>
            <view class="wapper-form-item">
                <label class="wapper-form-item-label">⁠Feedback<i class="wapper-form-item-label-required">*</i></label>
                <textarea class="wapper-form-item-textarea" v-model="data.formData.give"></textarea>
            </view>
            <view class="wapper-form-item">
                <label class="wapper-form-item-label">Problems facing for marketing strategy</label>
                <textarea class="wapper-form-item-textarea" v-model="data.formData.talk"></textarea>
            </view>
            <view class="wapper-form-item">
                <label class="wapper-form-item-label">Suggest features</label>
                <textarea class="wapper-form-item-textarea" v-model="data.formData.suggest"></textarea>
            </view>
            <view class="wapper-form-item">
                <a-button class="wapper-form-item-button" @click="SubmitEvent()">submit</a-button>
            </view>
        </form>
    </view>
</template>
<script setup>
    import { reactive , nextTick} from 'vue';
    import { saveUser } from '@/api/adUser';
import { notification } from 'ant-design-vue';
    const data = reactive({
        formData: {
            username: '',
            registered: '',
            email: '',
            physical: '',
            business: '',
            introduction: '',
            phone: '',
            give: '',
            talk: '',
            suggest: ''
        },
        verify:{
            username: '',
            email: '',
            introduction: '',
            give: ''
        }
    });


    const verifyEvent = () => {
        let verify  = true;
        if(!data.formData.username){
            data.verify.username = 'name is required';
            verify = false;
        }
        if(!data.formData.email){
            data.verify.email = 'email is required';
            verify = false;
        }
        if(!data.formData.introduction){
            data.verify.introduction = 'please introduce your company.';
            verify = false;
        }
        if(!data.formData.give){
            data.verify.give = 'please leave your feedback for us.';
            verify = false;
        }
        return verify;
    }

    const SubmitEvent = () => {
        console.log(data.formData);
       if(verifyEvent){
        saveUser(data.formData).then(res => {
            console.log("res => ", res);
            if(res.data){
                data.formData.username = '';
                data.formData.registered = '';
                data.formData.email = '';
                data.formData.physical = '';
                data.formData.business = '';
                data.formData.introduction = '';
                data.formData.phone = '';
                data.formData.give = '';
                data.formData.talk = '';
                data.formData.suggest = '';
                notification.success({
                    message: res.message,
                });
            
            }else{
                notification.error({
                    message: 'Operation failure',
             });   
            }
           
            console.log("formData => ",data.formData);
        }).catch((err) => {

        });   
       }


    
    }
</script>
<style lang="scss" scoped>
@use '../../assets/global' as *;
.wapper{
    background-color: $backdrop-color;
   
    &-form{
        margin-top: 10px;
        margin-left: auto;
        margin-right: auto;
        width: 60vw;
        padding: 20px;
       
        border-radius: 10px;
        &-item{
            display: flex;
            flex-direction: column;
            &-label{
                margin-top: 10px;
                &-required{
                    color: red;
                }
                &-verify{
                    color: red;
                    margin-left: 10px;
                }
            }
            &-button{
                margin-top: 10px;
            }
            &-textarea{
                color: black;
            }
        }
    }
}
</style>