/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.testeioasys.Auxiliar;

/**
 *
 * @author Vitor
 */
public class VotoFilme {
    
    private int ID_Filme;
    private int ID_Usuario;
    private int Nota; // de 0 a 4;
    
    //GS
    public int getID_Filme() {
        return ID_Filme;
    }

    public void setID_Filme(int ID_Filme) {
        this.ID_Filme = ID_Filme;
    }

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public int getNota() {
        return Nota;
    }

    public void setNota(int Nota) {
        this.Nota = Nota;
    }
}
