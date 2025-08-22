package finalproject;

import java.sql.ResultSet;
import java.sql.SQLException;   // Para lidar com erros de SQL
import java.sql.Statement;     
import java.util.ArrayList;     //ArrayList
import java.util.List;  
public class FinalProjectDAO {
    
    private Conexao conexao;
    private Statement stmt;
    private boolean sucesso = false;
    public FinalProjectDAO() {
        conexao = new Conexao();
        try {
            stmt = (Statement) conexao.getConexao().createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
     //Inserir um item 
    public boolean inserir(Items item) {      
        try {         
            String sql = "INSERT INTO items (nome,idade,valor, ativo )"
                    + " VALUES ('" + item.getNome()+"',"
                    + "'" +item.getIdade()+ "' )"
                    + "'" +item.getValor()+ "' )"
                    + "'" +item.getTipo()+ "' )"
                    + "'" +item.getAtivo()+ "' )";
            stmt.execute(sql);
            sucesso = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //conexao.fecharConexao();
        }
        return sucesso;
    }
}
