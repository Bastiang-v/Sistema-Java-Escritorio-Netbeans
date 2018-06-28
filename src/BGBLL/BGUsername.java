
package BGBLL;

/**
 *
 * @author Bastian
 */
public class BGUsername {
    int id_username;
    String username;
    String password;
    int id_usuario;
    int estado;

    public BGUsername() {
    }

    public BGUsername(int id_username, String username, String password, int id_usuario, int estado) {
        this.id_username = id_username;
        this.username = username;
        this.password = password;
        this.id_usuario = id_usuario;
        this.estado = estado;
    }
    

    public int getId_username() {
        return id_username;
    }

    public void setId_username(int id_username) {
        this.id_username = id_username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "BGUsername{" + "id_username=" + id_username + ", username=" + username + ", password=" + password + ", id_usuario=" + id_usuario + ", estado=" + estado + '}';
    }
    
    
    
}
