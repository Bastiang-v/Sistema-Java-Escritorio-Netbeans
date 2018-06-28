
package BGDAL;

import BGBLL.BGPerfil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Bastian
 */
public class BGPerfilDAL {
    BGConectar conectar;
    
    public BGPerfilDAL()
    {
        conectar = new BGConectar("ipchilenobank");
        
    }
        public int agregarPerfil(BGBLL.BGPerfil perfil,BGBLL.BGTipoperfil tipoperfil) 
    {
        Statement t = conectar.crearSentencia();
         ResultSet idtipoperfil = null;
        try
        {
            idtipoperfil = t.executeQuery("select id_tipoperfil from tipoperfil where tipoperfil = '"+tipoperfil.getTipoperfil()+"' and estado = 1");
            while(idtipoperfil.next())
            {
                perfil.setId_tipoperfil(idtipoperfil.getInt("id_tipoperfil"));
            }
            int resultado = t.executeUpdate("INSERT INTO perfil(id_usuario,id_tipoperfil,f_ingreso,s_grupo,estado) VALUES ('"+perfil.getId_usuario()+"','"+perfil.getId_tipoperfil()+"',now(),'G',1)");
            return resultado;
        }
        catch(SQLException e)
        {
            return -1;
        }
    }
     public int actualizarPerfil(BGBLL.BGPerfil perfil,BGBLL.BGTipoperfil tipoperfil) 
    {
        Statement t = conectar.crearSentencia();
        ResultSet idtipoperfil = null;
        try
        {
            idtipoperfil = t.executeQuery("select id_tipoperfil from tipoperfil where tipoperfil = '"+tipoperfil.getTipoperfil()+"' and estado = 1");
            while(idtipoperfil.next())
            {
               perfil.setId_tipoperfil(idtipoperfil.getInt("id_tipoperfil"));
            }
                       
            int resultado = t.executeUpdate("UPDATE perfil SET id_tipoperfil = '"+perfil.getId_tipoperfil()+"' WHERE id_perfil = '"+perfil.getId_perfil()+"' AND estado = 1");
            return resultado;
        }
        catch(SQLException e)
        {
            return -1;
        }
     }
     public int desactivarPerfil(BGBLL.BGPerfil perfil) 
     {
        Statement t = conectar.crearSentencia();
     
        try
        {
           int resultado = t.executeUpdate("UPDATE perfil SET estado = 0 WHERE id_perfil = '"+perfil.getId_perfil()+"';");
            return resultado;
        }
        catch(SQLException e)
        {
            return -1;
        }
       }
     public int activarPerfil(BGBLL.BGPerfil perfil) 
     {
        Statement t = conectar.crearSentencia();
     
        try
        {
           int resultado = t.executeUpdate("UPDATE perfil SET estado = 1 WHERE id_perfil = '"+perfil.getId_perfil()+"';");
            return resultado;
        }
        catch(SQLException e)
        {
            return -1;
        }
       }
     
     public ArrayList<BGPerfil> mostrarPerfil()
    {
        Statement t = conectar.crearSentencia();
        ResultSet resultado = null;
       ArrayList<BGPerfil> perf = new ArrayList<BGPerfil>();
         
         
        try
        {
            resultado = t.executeQuery("SELECT perfil.id_perfil,perfil.id_usuario,perfil.estado,tipoperfil.tipoperfil from perfil inner join tipoperfil on perfil.id_tipoperfil=tipoperfil.id_tipoperfil where perfil.estado = 1");
            while(resultado.next())
            {
                BGPerfil pe = new BGPerfil();
                pe.setId_perfil(resultado.getInt("id_perfil"));
                pe.setId_usuario(resultado.getInt("id_usuario"));
                pe.setEstado(resultado.getInt("estado"));
                pe.setTipoperfil(resultado.getString("tipoperfil"));
               
                perf.add(pe);
            }
            return perf;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    public ArrayList<BGPerfil> buscarPerfil(int id_usuario)
    {
        Statement t = conectar.crearSentencia();
        ResultSet resultado = null;
        
        ArrayList<BGPerfil> perf = new ArrayList<BGPerfil>();
        try
        {
            resultado = t.executeQuery("SELECT perfil.id_perfil,perfil.id_usuario,perfil.estado,tipoperfil.tipoperfil from perfil inner join tipoperfil on perfil.id_tipoperfil=tipoperfil.id_tipoperfil inner join usuario on usuario.id_usuario=perfil.id_usuario where usuario.id_usuario ='"+id_usuario+"' and perfil.estado = 1");
            while(resultado.next())
            {
                BGPerfil pe = new BGPerfil();
                pe.setId_perfil(resultado.getInt("id_perfil"));
                pe.setId_usuario(resultado.getInt("id_usuario"));
                pe.setEstado(resultado.getInt("estado"));
                pe.setTipoperfil(resultado.getString("tipoperfil"));
                perf.add(pe);
            }
            return perf;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    public BGPerfil buscarPerfil2(BGBLL.BGPerfil perfil)
    {
        Statement t = conectar.crearSentencia();
        ResultSet resultado = null;
        try
        {
            BGPerfil pe = new BGPerfil();
            resultado = t.executeQuery("SELECT perfil.id_perfil,perfil.id_usuario,perfil.estado,tipoperfil.tipoperfil from perfil inner join tipoperfil on perfil.id_tipoperfil=tipoperfil.id_tipoperfil inner join usuario on usuario.id_usuario=perfil.id_usuario where usuario.id_usuario ='"+perfil.getId_usuario()+"' and perfil.estado = 1 and tipoperfil.tipoperfil='"+perfil.getTipoperfil()+"'");
            while(resultado.next())
            {
                pe.setId_perfil(resultado.getInt("id_perfil"));
                pe.setId_usuario(resultado.getInt("id_usuario"));
                pe.setEstado(resultado.getInt("estado"));
                pe.setTipoperfil(resultado.getString("tipoperfil"));
            }
            return pe;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
}
