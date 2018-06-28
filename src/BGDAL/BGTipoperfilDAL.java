package BGDAL;

import BGBLL.BGTipoperfil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Bastian
 */
public class BGTipoperfilDAL {
    
    BGConectar conectar;
    
    public BGTipoperfilDAL()
    {
        conectar = new BGConectar("ipchilenobank");
        
    }
  public ArrayList<BGTipoperfil> comboTipoperfil()
    {
        Statement t = conectar.crearSentencia();
        ResultSet resultado = null;
        
    ArrayList<BGTipoperfil> tipoper = new ArrayList<BGTipoperfil>();
        try
        {
            resultado = t.executeQuery("SELECT * FROM tipoperfil WHERE estado = 1");
            while(resultado.next())
            {
                BGTipoperfil tippe = new BGTipoperfil();
              
                tippe.setId_tipoperfil(resultado.getInt("id_tipoperfil"));
                tippe.setTipoperfil(resultado.getString("tipoperfil"));
                tippe.setEstado(resultado.getInt("estado"));
                tipoper.add(tippe);
            }
            return tipoper;
        }
        catch(SQLException e)
        {
            return null;
        }
    }

    
}
