# SpringBoot微信点餐系统


> 以Spring Boot和微信特性为核心技术栈，实现一个从下单到接单流程完整，包含买家端和卖家端前后台功能的微信点餐系统 ,采用前后端分离，前端采用vue实现,后端使用Spring Boot开发  
注意 这个前端代码和这个项目中的那个前端代码是有差别的请使用项目中的那个 前端代码.7z  请修改 前端代码/config/index.js中的 sellUrl,openidUrl,wechatPayUrl为自己的路径


## 技术点
* Spring Boot
* 分布式Session
* 分布式锁
* 微信授权登录
* 微信消息推送
* 微信支付与退款
* Spring Boot + WebSocket 
* 前后端分离
* Vue.js

## 前端代码运行方式
``` 
#安装依赖包
npm install

#运行项目 
npm run dev  

#打包
npm run build

#最后部署dist文件到nginx/iis/apache  推荐使用nginx 
``` 
## 项目配置说明
-  前端项目配置  打开前端项目的 `config/index.js` 里面 `build` 节点下的 `sellUrl`  `openidUrl`  `wechatPayUrl`   配置的自己的项目地址
- 后端项目配置 打开后端项目的的 `src/main/resources/application.yml`  ，请将里面的mysql ,redis配置为自己的地址，微信配置见下表

| 配置项  | 说明 |
| ------------- | ------------- |
| mpAppId  |微信公众号AppId  |
| mpAppSecret  | 微信公众号AppSecret |
| openAppId  | 微信开放平台AppId |
|  openAppSecret |  微信开放平台AppSecret|
|  mchId | 微信支付Id |
| mchKey  |  微信支付密钥|
|keyPath   |微信支付文件路径  |
|   notifyUrl|  微信支付异步回调地址|
| templateId  |微信模板消息Id  |

## 项目部署说明
- 按照上面的 项目配置说明 将项目配置好，，前端和后端都需
- 将打包后的前端代码部署好，个人使用Nginx , 我在Nginx设置如下代理

      location /sell/ {
            proxy_pass http://127.0.0.1:8080/;
        }
- 用Maven将java项目打包成jar  用java -jar启动项目即可