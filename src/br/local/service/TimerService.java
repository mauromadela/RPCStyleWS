/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.local.service;

import static java.lang.Thread.sleep;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

//@XmlAccessorType(XmlAccessType.FIELD)
@WebService
@SOAPBinding(style=Style.RPC)
public class TimerService {
    //@XmlElement(name="tempo")
    //@XmlElementWrapper(name="tempo")
    public String startTimer(@WebParam(name="tempo") int tempo) throws InterruptedException {
        System.out.format("Tempo programado: %dms\n", tempo);
        sleep(tempo);
        return "Tempo programado: " + tempo + "ms";
    }
    
}
