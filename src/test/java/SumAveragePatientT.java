/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Patient.IP;
import Patient.YesNo;
import junit.framework.TestCase;

/**
 *
 * @author jetDo
 */
public class SumAveragePatientT extends TestCase {
    
    private int sum(IP ip){
                      
        return  ip.getRole1().getScore()+
                ip.getRole2().getScore()+
                ip.getRole3().getScore()+
                ip.getRole4().getScore()+
                ip.getRole5().getScore();
    }
    
    public void testsum3() {
        IP ip = new IP();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);
        
        assertEquals(3, sum(ip));
    }
    
    public void testsum5() {
        IP ip = new IP();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);
        
        assertEquals(5, sum(ip));
        
    }
}
