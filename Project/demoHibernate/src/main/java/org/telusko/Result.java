package org.telusko;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Result {

    @Id
    private int sid;
    private String sname;
    private String div;
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getDiv() {
        return div;
    }
    public void setDiv(String div) {
        this.div = div;
    }

    
}
