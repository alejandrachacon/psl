/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psl;
import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
/**
 *
 * @author Ale
 */
public class TestRunner {
    
    public static void main(String[] args){
        Result res = JUnitCore.runClasses(PslSuite.class);
        
        for(Failure failure: res.getFailures()){
            System.out.println(failure.toString());
        }
        if(res.wasSuccessful()){
            System.out.println("Pruebas Exitosas");
        }
        else{
            System.out.println("Prueba fallida");
        }
        
    }
    
}
