/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.local.publisher;

import br.local.service.TimerService;
import javax.xml.ws.Endpoint;

/**
 *
 * @author mmadela
 */
public class TimerPublisher {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("web service - Timer Inicializado");
        TimerService service = new TimerService();
        Endpoint.publish("http://localhost:8080/rpc", service);       
    }    
}