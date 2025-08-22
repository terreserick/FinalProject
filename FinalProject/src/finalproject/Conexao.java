package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao { 
   private Connection conexao = null;
   private String url = 
           "jdbc:sqlite:C:/Users/User/Documents/dbBrecho";

    //Contrutor
    public Conexao() {
        //Conexão com o banco de dados
       try {
            conexao = DriverManager.getConnection(url);
            System.out.println("Conexão realizada com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + 
                    e.getMessage());
            e.printStackTrace();
        } 
    }

    /**
     * @return the conexao
     */
    public Connection getConexao() {
        return this.conexao;
    }

    /**
     * @param conexao the conexao to set
     */
    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    //Fechar a conexão com o banco de dados
    public void fecharConexao() {
       try {
           conexao.close();
       } catch (SQLException e) {
         e.printStackTrace();
       }
    }
}
