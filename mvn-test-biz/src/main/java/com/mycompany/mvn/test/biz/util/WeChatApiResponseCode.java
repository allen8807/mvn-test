/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mvn.test.biz.util;

/**
 * @FileName WeChatApiResponseCode.java
 * @date 2014-11-4
 * @time 14:48:03
 * @author bolu.zhao<bolu.zhao@fraudmetrix.cn>
 * @author  其它作者姓名
 * @Description 模块描述
 * @version 1.00 9999/99/99 类创建者姓名
 * <p>      9.99 9999/99/99 修改者姓名 修改内容说明</p>
 * <p>      9.99 9999/99/99 修改者姓名 修改内容说明</p>
 * @see     参考类1
 * @see     参考类2
 */
public enum WeChatApiResponseCode {
    
    SYS_BUSY("-1","系统繁忙"),
    REQ_SUCCESS("0","请求成功"),
    ;
    
    
    private String code;
    private String description;
    
    private WeChatApiResponseCode(String pCode,String pDescription){
        this.code =pCode;
        this.description = pDescription;
    }


}
