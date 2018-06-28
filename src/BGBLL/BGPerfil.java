package BGBLL;

/**
 *
 * @author Bastian
 */
public class BGPerfil {
    int id_perfil;
    int id_usuario;
    int id_tipoperfil;
    String tipoperfil;
    int estado;

    public BGPerfil() {
    }

    public BGPerfil(int id_perfil, int id_usuario, int id_tipoperfil,String tipoperfil, int estado) {
        this.id_perfil = id_perfil;
        this.id_usuario = id_usuario;
        this.id_tipoperfil = id_tipoperfil;
        this.tipoperfil = tipoperfil;
        this.estado = estado;
    }

    public String getTipoperfil() {
        return tipoperfil;
    }

    public void setTipoperfil(String tipoperfil) {
        this.tipoperfil = tipoperfil;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_tipoperfil() {
        return id_tipoperfil;
    }

    public void setId_tipoperfil(int id_tipoperfil) {
        this.id_tipoperfil = id_tipoperfil;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "BGPerfil{" + "id_perfil=" + id_perfil + ", id_usuario=" + id_usuario + ", id_tipoperfil=" + id_tipoperfil + ", tipoperfil=" + tipoperfil + ", estado=" + estado + '}';
    }
    
    
    
    
}
