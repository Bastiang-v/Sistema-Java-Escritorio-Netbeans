package BGDAL;

import BGBLL.BGUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Bastian
 */
public class BGUsuarioDAL {
    BGConectar conectar;
    
    public BGUsuarioDAL()
    {
        conectar = new BGConectar("ipchilenobank");
        
    } 
   public int agregarUsuario(BGBLL.BGUsuario usuario) 
    {
        Statement t = conectar.crearSentencia();
        try
        {
            int resultado = t.executeUpdate("INSERT INTO usuario (nombre,apellido,edad,run,dv,f_ingreso,s_grupo,estado) VALUES ('"+usuario.getNombre()+"','"+usuario.getApellido()+"','"+usuario.getEdad()+"','"+usuario.getRun()+"','"+usuario.getDv()+"',now(),'G',1)");
            return resultado;
        }
        catch(SQLException e)
        {
            return -1;
        }
    }
   public int actualizarUsuario(BGBLL.BGUsuario usuario) 
    {
        Statement t = conectar.crearSentencia();
        try
        {
            int resultado = t.executeUpdate("UPDATE usuario SET nombre = '"+usuario.getNombre()+"', apellido = '"+usuario.getApellido()+"', edad = '"+usuario.getEdad()+"', run = '"+usuario.getRun()+"', dv = '"+usuario.getDv()+"' where id_usuario = '"+usuario.getId_usuario()+"';");
            return resultado;
        }
        catch(SQLException e)
        {
            return -1;
        }
    }
        public ArrayList<BGUsuario> mostrarUsuario()
    {
        Statement t = conectar.crearSentencia();
        ResultSet resultado = null;
        
        ArrayList<BGUsuario> usur = new ArrayList<BGUsuario>();
        try
        {
            resultado = t.executeQuery("SELECT * from usuario where estado = 1");
            while(resultado.next())
            {
                BGUsuario us = new BGUsuario();
                us.setId_usuario(resultado.getInt("id_usuario"));
                us.setNombre(resultado.getString("nombre"));
                us.setApellido(resultado.getString("apellido"));
                us.setEdad(resultado.getInt("edad"));
                us.setRun(resultado.getString("run"));
                us.setDv(resultado.getString("dv"));
                us.setEstado(resultado.getInt("estado"));
                usur.add(us);
            }
            return usur;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
        public int desactivarUsuario(BGBLL.BGUsuario usuario) 
     {
        Statement t = conectar.crearSentencia();
     
        try
        {
           int resultado = t.executeUpdate("UPDATE usuario SET estado = 0 WHERE id_usuario = '"+usuario.getId_usuario()+"';");
            return resultado;
        }
        catch(SQLException e)
        {
            return -1;
        }
        
    }
        public BGUsuario buscarUsuario(int id_usuario)
    {
        Statement t = conectar.crearSentencia();
        ResultSet resultado = null;
       
         BGUsuario us = new BGUsuario();
  
        try
        {
            resultado = t.executeQuery("SELECT * FROM usuario where run = '"+id_usuario+"';");
            while(resultado.next())
            {
                us.setId_usuario(resultado.getInt("id_usuario"));
                us.setNombre(resultado.getString("nombre"));
                us.setApellido(resultado.getString("apellido"));
                us.setEdad(resultado.getInt("edad"));
                us.setRun(resultado.getString("run"));
                us.setDv(resultado.getString("dv"));
                us.setEstado(resultado.getInt("estado"));
             }
            return us;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
        public String FormatoRutUsuario(String rut) {
 
        int cont = 0;
        String format;
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        format = "-" + rut.substring(rut.length() - 1);
        for (int i = rut.length() - 2; i >= 0; i--) {
            format = rut.substring(i, i + 1) + format;
            cont++;
            if (cont == 3 && i != 0) {
                format = "." + format;
                cont = 0;
            }
        }
        return format;
}  
public  boolean validarRut(String rut) {
 
boolean validacion = false;
try {
rut =  rut.toUpperCase();
rut = rut.replace(".", "");
rut = rut.replace("-", "");
int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
 
char dv = rut.charAt(rut.length() - 1);
 
int m = 0, s = 1;
for (; rutAux != 0; rutAux /= 10) {
s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
}
if (dv == (char) (s != 0 ? s + 47 : 75)) {
validacion = true;
}
 
} catch (java.lang.NumberFormatException e) {
} catch (Exception e) {
}
return validacion;
}

}
