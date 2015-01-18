/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Patient.IP;
import Patient.Op;
import Patient.Patient;
import Patient.YesNo;
import java.lang.reflect.Method;
import junit.framework.TestCase;

/**
 *
 * @author jetDo
 */
public class SumAvgReflectionPatientT extends TestCase {
    
    private int sum(Patient petient) throws Exception{
        Method[] methods = petient.getClass().getMethods();
        
        int sum = 0;
        
        for (Method method : methods) {
            if (method.getName().startsWith("getRole")) {
                YesNo yn = (YesNo) method.invoke(petient);
                sum = sum + yn.getScore();
            }            
        }
        return sum;
    }
    
    
    private int count(Patient petient) throws Exception{
        Method[] methods = petient.getClass().getMethods();        
        int count = 0;
        for (Method method : methods) {
            if (method.getName().startsWith("getRole")) {
                count = count + 1;            }            
        }
        return count;
    }
    
    private float average(Patient patient) throws Exception {
        
        return ((float) sum(patient))/ count(patient);
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
    
    public void testsum2() throws Exception{
        Op op = new Op();
        op.setRole1(YesNo.YES);
        op.setRole2(YesNo.YES);
        op.setRole3(YesNo.YES);
        op.setRole4(YesNo.YES);
        op.setRole5(YesNo.YES);
        op.setRole6(YesNo.YES);
        op.setRole7(YesNo.YES);
        
        assertEquals(7, sum(op));
        assertEquals(1, average(op), 0);
    }
}
