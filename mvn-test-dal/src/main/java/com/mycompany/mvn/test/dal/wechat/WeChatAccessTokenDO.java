/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mvn.test.dal.wechat;

/**
 * @FileName WeChatTokenDO.java
 * @date 2014-11-4
 * @time 12:05:21
 * @author bolu.zhao<bolu.zhao@fraudmetrix.cn>
 * @author  其它作者姓名
 * @Description 模块描述
 * @version 1.00 9999/99/99 类创建者姓名
 * <p>      9.99 9999/99/99 修改者姓名 修改内容说明</p>
 * <p>      9.99 9999/99/99 修改者姓名 修改内容说明</p>
 * @see     参考类1
 * @see     参考类2
 */
public class WeChatAccessTokenDO {
private String accessToken;//access_token 有效凭证
private long expiresIn;//expires_in 凭证有效时间单位秒

    /**
     * @return the accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * @param accessToken the accessToken to set
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * @return the expiresIn
     */
    public long getExpiresIn() {
        return expiresIn;
    }

    /**
     * @param expiresIn the expiresIn to set
     */
    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }
}
