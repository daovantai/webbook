/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class phieumuon {
    String id,tendn,masach,tensach;

    public phieumuon() {
    }
    private static int stt=1;
    public phieumuon(String id, String tendn, String masach, String tensach) {
        this.id = id;
        this.tendn = tendn;
        this.masach = masach;
        this.tensach = tensach;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTendn() {
        return tendn;
    }

    public void setTendn(String tendn) {
        this.tendn = tendn;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }
    
   
    
}
