<template>
    <view class="wapper">
        <view class="wapper-content">
            <view class="wapper-content-left">
            <text class="wapper-content-left-title">
                Marketing campaigns powered by AI
            </text>
            <text class="wapper-content-left-content">
                Are you spending thousands of dollars on ads that nobody cares about? We use powerful AI agents to help small and medium sized businesses with their marketing strategy.
            </text>
        </view>
        <view class="wapper-content-right">
            <view class="wapper-content-right-image"></view>
        </view>
        </view>
        <view class="wapper-footer">
            <text class="wapper-footer-title">
                Human Insight, AI Support
            </text>
            <view class="wapper-footer-content">
                <view class="wapper-footer-content-item">
                    <img src="../../assets/home/图片4.jpeg" class="wapper-footer-content-item-image"/>
                    <view class="wapper-footer-content-item-text">
                        <text class="wapper-footer-content-item-text-title">Generative AI for image generation</text>
                        <text class="wapper-footer-content-item-text-content">Our bespoke generative models create stunning graphics for flyers, ads and more!</text>
                    </view>
                </view>
                <view class="wapper-footer-content-item">
                    <img src="../../assets/home/图片2.png" class="wapper-footer-content-item-image"/>
                    <view class="wapper-footer-content-item-text">
                        <text class="wapper-footer-content-item-text-title">Generate entire plans</text>
                        <text class="wapper-footer-content-item-text-content">Our AI Agents can help in craft timelines, strategies and recommend target groups</text>
                    </view>
                </view>
                <view class="wapper-footer-content-item">
                    <img src="../../assets/home/图片3.png" class="wapper-footer-content-item-image"/>
                    <view class="wapper-footer-content-item-text">
                        <text class="wapper-footer-content-item-text-title">Built for all platforms</text>
                        <text class="wapper-footer-content-item-text-content">Integrate with popular social media platforms for seamless execution and feedback.</text>
                    </view>
                </view>
            </view>
        </view>
    </view>
</template>
<script setup></script>
<style lang="scss" scoped>
@use '../../assets/global' as *;
    .wapper{
        background-color: $backdrop-color;
        display: flex;
        flex-direction: column;
        &-content{
            flex: 1;
            display: flex;
            flex-direction: row;
            &-left{
            flex: 1;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            &-title{
                width: 400px;
                font-family:'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
                font-size: 2em;
                font-weight: bold;
            }
            &-content{
                margin-top: 10px;
                width: 400px;
                font-size: 1.5em;
                font-weight: 100;
            }
        }
        &-right{
            flex: 1;
            display: flex;
            align-items: center;
            justify-content: center;
            &-image{
                height: 400px;
                width: 600px;
                background-image: url('../../assets/home/图片1.png');
                background-size: 100% 100%;
                background-repeat: no-repeat;
            }
        }
        }
        &-footer{
            flex: .5;
            display: flex;
            flex-direction: column;
            &-title{
                font-size: 1.2em;
                font-weight: bold;
                text-indent: 14em;
            }
            &-content{
                margin: auto;
                display: flex;
                flex-direction: row;
                width: 80%;
                justify-content: space-evenly;
                &-item{
                    width: 300px;
                    display: flex;
                    height: 120px;
                    flex-direction: row;
                    background-color: #353535dc;
                    border-top-right-radius: 10px;
                    border-bottom-right-radius: 10px;
                    &-image{
                        width: 100px;
                        height: 120px;
                    }
                    &-text{
                        display: flex;
                        flex-direction: column;
                        padding: 10px;
                        &-title{
                            font-size: 1em;
                        }
                        &-content{
                            margin-top: 10px;
                            font-size: .5em;
                        }
                    }
                }
            }
        }
    }
</style>