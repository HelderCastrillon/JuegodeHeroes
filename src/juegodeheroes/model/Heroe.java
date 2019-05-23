/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodeheroes.model;

/**
 *
 * @author hcastrillon
 */
public class Heroe {
    private int id;
    private String poder1;
    private String poder2;
    private String poder3;
    private String puntodebil1;
    private String puntodebil2;
    private String puntodebil3;
    private String foto;

    public Heroe(int id, String poder1, String poder2, String poder3, String puntodebil1, String puntodebil2, String puntodebil3, String foto) {
        this.id = id;
        this.poder1 = poder1;
        this.poder2 = poder2;
        this.poder3 = poder3;
        this.puntodebil1 = puntodebil1;
        this.puntodebil2 = puntodebil2;
        this.puntodebil3 = puntodebil3;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPoder1() {
        return poder1;
    }

    public void setPoder1(String poder1) {
        this.poder1 = poder1;
    }

    public String getPoder2() {
        return poder2;
    }

    public void setPoder2(String poder2) {
        this.poder2 = poder2;
    }

    public String getPoder3() {
        return poder3;
    }

    public void setPoder3(String poder3) {
        this.poder3 = poder3;
    }

    public String getPuntodebil1() {
        return puntodebil1;
    }

    public void setPuntodebil1(String puntodebil1) {
        this.puntodebil1 = puntodebil1;
    }

    public String getPuntodebil2() {
        return puntodebil2;
    }

    public void setPuntodebil2(String puntodebil2) {
        this.puntodebil2 = puntodebil2;
    }

    public String getPuntodebil3() {
        return puntodebil3;
    }

    public void setPuntodebil3(String puntodebil3) {
        this.puntodebil3 = puntodebil3;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    



    
}
