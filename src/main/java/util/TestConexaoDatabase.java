package util;

import java.sql.Connection;


public class TestConexaoDatabase{
    public static void main(String[] args) {
        //OPEN CONEXAO
         Connection c = ConnectionFactory.getConnection();
         if (c != null) {
             System.out.println("Conexão realizada com sucesso");            
        }else{
             System.out.println("Erro conexão");
         }
         
         //FECHAR
         ConnectionFactory.closeConnection(c);
      
    }
}