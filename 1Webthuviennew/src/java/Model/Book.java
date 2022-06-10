/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;


public class Book  implements Serializable{
    private String masach,tensach,tacgia,nxb,namxb,tinhtrang;

    public Book() {
    }

    public Book(String masach, String tensach, String tacgia, String nxb, String namxb, String tinhtrang) {
        this.masach = masach;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.nxb = nxb;
        this.namxb = namxb;
        this.tinhtrang = tinhtrang;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String Masach) {
        this.masach = Masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String Tensach) {
        this.tensach = Tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String Tacgia) {
        this.tacgia = Tacgia;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String Nxb) {
        this.nxb = Nxb;
    }

    public String getNamxb() {
        return namxb;
    }

    public void setNamxb(String Namxb) {
        this.namxb = Namxb;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String Tinhtrang) {
        this.tinhtrang = Tinhtrang;
    }
    
}
