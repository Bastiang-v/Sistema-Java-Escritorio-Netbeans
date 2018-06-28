package BGDAL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import BGBLL.BGUsername;
import BGBLL.BGUsuario;

/**
 *
 * @author Bastian
 */
public class BGUsernameDAL {
    BGConectar conectar;
    
    public BGUsernameDAL()
    {
        conectar = new BGConectar("ipchilenobank");
        
    }
         public int agregarUsername(BGBLL.BGUsername username) 
    {
        {
        Statement t = conectar.crearSentencia();
        try
        {
            int resultado = t.executeUpdate("INSERT INTO username (username,password,id_usuario,f_ingreso,s_grupo,estado) VALUES ('"+username.getUsername()+"', md5 ('"+username.getPassword()+"'),'"+username.getId_usuario()+"',now(),'G',1)");
            return resultado;
        }
        catch(SQLException e)
        {
            return -1;
        }
    }
    }
    public int actualizarUsername(BGBLL.BGUsername username) 
    {
        Statement t = conectar.crearSentencia();
        try
        {
            int resultado = t.executeUpdate("update username set username ='"+username.getUsername()+"', password = md5 ('"+username.getPassword()+"') WHERE id_username ='"+username.getId_username()+"' and estado =1");
            return resultado;
        }
        catch(SQLException e)
        {
            return -1;
        }
    }
    public int desactivarUsername(BGBLL.BGUsername username) 
     {
        Statement t = conectar.crearSentencia();
     
        try
        {
           int resultado = t.executeUpdate("UPDATE username SET estado = 0 WHERE id_username = '"+username.getId_username()+"';");
            return resultado;
        }
        catch(SQLException e)
        {
            return -1;
        }
        
    }
    public int activarUsername(BGBLL.BGUsername username) 
     {
        Statement t = conectar.crearSentencia();
     
        try
        {
           int resultado = t.executeUpdate("UPDATE username SET estado = 1 WHERE id_username = '"+username.getId_username()+"';");
            return resultado;
        }
        catch(SQLException e)
        {
            return -1;
        }
        
    }
    public ArrayList<BGUsername> mostrarUsername()
    {
        Statement t = conectar.crearSentencia();
        ResultSet resultado = null;
       ArrayList<BGUsername> usern = new ArrayList<BGUsername>();
         
         
        try
        {
            resultado = t.executeQuery("SELECT * from username where estado = 1");
            while(resultado.next())
            {
                BGUsername us = new BGUsername();
                us.setId_username(resultado.getInt("id_username"));
                us.setUsername(resultado.getString("username"));
                us.setId_usuario(resultado.getInt("id_usuario"));
                us.setEstado(resultado.getInt("estado"));
               
                usern.add(us);
            }
            return usern;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    public ArrayList<BGUsername> buscarUsername(int id_username)
    {
        Statement t = conectar.crearSentencia();
        ResultSet resultado = null;
       
         ArrayList<BGUsername> usern = new ArrayList<BGUsername>();
  
        try
        {
            resultado = t.executeQuery("select username.id_username,username.username,username.id_usuario,username.estado from username WHERE username.id_usuario = '"+id_username+"' and username.estado =1");
            while(resultado.next())
            {
                BGUsername usn = new BGUsername();
                usn.setId_username(resultado.getInt("id_username"));
                usn.setUsername(resultado.getString("username"));
                usn.setId_usuario(resultado.getInt("id_usuario"));
                usn.setEstado(resultado.getInt("estado"));
                usern.add(usn);
            }
            return usern;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    public BGUsername Conectar(String username,String pass)
    {
        Statement t = conectar.crearSentencia();
        ResultSet resultado = null;
        try
        {
            BGUsername us = new BGUsername();
            resultado = t.executeQuery("select * from username where username = '"+username+"' and password = MD5('"+pass+"')"); 
            while(resultado.next())
            {
                us.setId_username(resultado.getInt("id_username"));
                us.setUsername(resultado.getString("username"));
                us.setId_usuario(resultado.getInt("id_usuario"));
                us.setEstado(resultado.getInt("estado"));
               
            }
            return us;
        }
        catch(SQLException e)
        {
         return null;
        }
    }
     public BGUsuario buscarUsuario(int rut_usuario)
    {
        Statement t = conectar.crearSentencia();
        ResultSet resultado = null;
       
         BGUsuario us = new BGUsuario();
  
        try
        {
            resultado = t.executeQuery("SELECT * FROM usuario where id_usuario = '"+rut_usuario+"';");
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
    
        
}
