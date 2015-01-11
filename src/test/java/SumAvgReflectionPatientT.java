/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Patient.IP;
import Patient.YesNo;
import java.lang.reflect.Method;
import junit.framework.TestCase;

/**
 *
 * @author jetDo
 */
public class SumAvgReflectionPatientT extends TestCase {
    
    private int sum(IP ip) throws Exception{
        Method[] methods = ip.getClass().getMethods();
        
        int sum = 0;
        
        for (Method method : methods) {
            if (method.getName().startsWith("getRole")) {
                YesNo yn = (YesNo) method.invoke(ip);
                sum = sum + yn.getScore();
            }            
        }
        return sum;
    }
    
    public void testsum3() throws Exception{
        IP ip = new IP();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);
        
        assertEquals(3, sum(ip));
    }
    
    public void testsum5() throws Exception{
        IP ip = new IP();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);
        
        assertEquals(5, sum(ip));
    }
    
}
