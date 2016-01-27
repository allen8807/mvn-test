/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompay.mvn.test.biz.task;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mycompany.mvn.test.biz.util.HttpRequest;
import com.mycompany.mvn.test.dal.wechat.WeChatAccessTokenDO;
import java.util.Map;
import java.util.Map.Entry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @FileName DealString.java
 * @date 2014-11-4
 * @time 11:49:35
 * @author  其它作者姓名
 * @Description 模块描述
 * @version 1.00 9999/99/99 类创建者姓名
 * <p>      9.99 9999/99/99 修改者姓名 修改内容说明</p>
 * <p>      9.99 9999/99/99 修改者姓名 修改内容说明</p>
 * @see     参考类1
 * @see     参考类2
 */
public class DealString {
private final static Logger logger = LoggerFactory.getLogger(DealString.class);
/***
 * http请求方式: GET
 * https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET
 * 参数后面通过配置传入
 */
String url = "https://api.weixin.qq.com/cgi-bin/token";
String grant_type = "client_credential";
String appid = "APPID";
String secret="APPSECRET";
String param ="grant_type=client_credential&appid=APPID&secret=APPSECRET";
WeChatAccessTokenDO weChatAccessTokenDO;
    public void getWeChatToken(){
        url = "http://localhost/token.html";
        param = "grant_type="+grant_type+"&appid="+appid+"&secret="+secret;
        String res = HttpRequest.sendGet(url, param);
        Map<String,Object> m;
        m =    (Map<String,Object>)(JSONObject.parse(res));
        String key;
        Object value;
        for(Entry<String,Object> entry:m.entrySet()){
            key = entry.getKey();
            value = entry.getValue();
            //logger.debug("key\t"+key+"\tvalue\t"+value+"\n");
            System.out.println("key\t"+key+"\tvalue\t"+value);
    }
        try{
        weChatAccessTokenDO.setAccessToken((String)(m.get("access_token")));
         weChatAccessTokenDO.setExpiresIn((Integer)(m.get("access_token")));
        }
        catch(Exception e){
         System.out.println(e.getMessage());
        }
    }
    
    
}
