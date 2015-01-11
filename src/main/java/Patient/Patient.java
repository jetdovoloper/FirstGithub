/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

import java.util.Date;

/**
 *
 * @author jetDo
 */
public class Patient {
    
    private String hcode;
    private String pid;
    private String drugName;
    private Date visitDate;
    private float qty;
    private String unit;

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getHcode() {
        return hcode;
    }

    public void setHcode(String hcode) {
        this.hcode = hcode;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public float getQty() {
        return qty;
    }

    public void setQty(float qty) {
        this.qty = qty;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patient other = (Patient) obj;
        if ((this.hcode == null) ? (other.hcode != null) : !this.hcode.equals(other.hcode)) {
            return false;
        }
        if ((this.pid == null) ? (other.pid != null) : !this.pid.equals(other.pid)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.hcode != null ? this.hcode.hashCode() : 0);
        hash = 23 * hash + (this.pid != null ? this.pid.hashCode() : 0);
        return hash;
    }
    
    
    
    
}
