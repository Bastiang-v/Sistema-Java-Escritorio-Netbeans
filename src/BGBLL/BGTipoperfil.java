package BGBLL;

/**
 *
 * @author Bastian
 */
public class BGTipoperfil {

        int id_tipoperfil;
        String tipoperfil;
        int estado; 

    public BGTipoperfil() {
    }

    public BGTipoperfil(int id_tipoperfil, String tipoperfil, int estado) {
        this.id_tipoperfil = id_tipoperfil;
        this.tipoperfil = tipoperfil;
        this.estado = estado;
    }

    public int getId_tipoperfil() {
        return id_tipoperfil;
    }

    public void setId_tipoperfil(int id_tipoperfil) {
        this.id_tipoperfil = id_tipoperfil;
    }

    public String getTipoperfil() {
        return tipoperfil;
    }

    public void setTipoperfil(String tipoperfil) {
        this.tipoperfil = tipoperfil;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
        
}
