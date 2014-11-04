/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvn.test.biz.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bolu.zhao<bolu.zhao@fraudmetrix.cn>
 */
public class HttpRequestTest {
    
    public HttpRequestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sendGet method, of class HttpRequest.
     */
    @Test
    public void testSendGet() {
        System.out.println("sendGet");
        String url = "http://localhost";
        String param = "";
        String expResult = "";
        String result = HttpRequest.sendGet(url, param);
        System.out.print(result);
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of sendPost method, of class HttpRequest.
     */
    @Test
    public void testSendPost() {
        System.out.println("sendPost");
        String url = "http://localhost";
        String param = "";
        String expResult = "";
        String result = HttpRequest.sendPost(url, param);
         System.out.print(result);
       // assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
