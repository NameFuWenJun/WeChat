//app.js
App({
  globalData: {
    userInfo: null,
    loginUrl: "",
    url: "http://localhost:8080",
  },
  onLaunch: function () {
    // 展示本地存储能力
    var logs = wx.getStorageSync('logs') || []
    logs.unshift(Date.now())
    wx.setStorageSync('logs', logs)
    var that = this;
    // 登录
    wx.login({
      success: res => {
        // 发送 res.code 到后台换取 openId, sessionKey, unionId
        if (res.code) {
          //发起网络请求
          wx.request({
            url: 'https://api.weixin.qq.com/sns/jscode2session',
            data: {
              appid: 'wxea6dccd504fd5d99',
              secret: '42cd6623bb66aa9949f346e7d1ea8f3b',
              js_code: res.code,
              grant_type: 'authorization_code'  
            },
             success: function (res) {
               wx.request({
                 url: 'http://localhost:8080/login',
                 data: {
                   openId: res.data.openid
                 },
                 //后台加载成功
                 success: function(res) {
                   // 获取用户信息
                   wx.getSetting({
                     success: res => {
                       if (res.authSetting['scope.userInfo']) {
                         // 已经授权，可以直接调用 getUserInfo 获取头像昵称，不会弹框
                         wx.getUserInfo({
                           success: res => {
                             // 可以将 res 发送给后台解码出 unionId
                             that.globalData.userInfo = res.userInfo

                             // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
                             // 所以此处加入 callback 以防止这种情况
                             if (this.userInfoReadyCallback) {
                               this.userInfoReadyCallback(res)
                             }
                           }
                         })
                       }
                     }
                   })
                   console.log("登陆成功"+res)
                 },
                 fail: function(res) {},
                 complete: function(res) {},
               })
            }
          })
        } else {
          console.log('登录失败！' + res.errMsg)
        }
    
      }
    })
    
  }

})