/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restfulexample;

import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rhano
 */
@XmlRootElement
public class TestDTO {
    private String test="testitout";
    
    public void setTest(String test){
        this.test=test;
    }
    public String getTest(){
        return test;
    }
}
