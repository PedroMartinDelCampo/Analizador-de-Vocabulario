/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabc.vocabulario.controladores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Pedro
 */
@SpringBootApplication
@Controller
public class ControladorPrincipal {
    
    public static void main(String... args){
        SpringApplication.run(ControladorPrincipal.class, args);
    }
    
    @RequestMapping(value="/instalacion", method=RequestMethod.GET)
    @ResponseBody
    public String verificarInstalacion(){
        return "La aplicacion Analizador de Vocabulario ha sido instalada correctamente";
    }
    
}