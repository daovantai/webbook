/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author VAN TAI
 */
public class User {
    private String hovaten, tendn, email,sdt, matkhau, nmk;

    public User() {
    }

    public User(String hovaten, String tendn, String email, String sdt, String matkhau, String nmk) {
        this.hovaten = hovaten;
        this.tendn = tendn;
        this.email = email;
        this.sdt = sdt;
        this.matkhau = matkhau;
        this.nmk = nmk;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public String getTendn() {
        return tendn;
    }

    public void setTendn(String tendn) {
        this.tendn = tendn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getNmk() {
        return nmk;
    }

    public void setNmk(String nmk) {
        this.nmk = nmk;
    }
    
}
