package util;

import java.sql.Connection;


public class TestConexaoDatabase{
    public static void main(String[] args) {
        //OPEN CONEXAO
         Connection c = ConnectionFactory.getConnection();
         if (c != null) {
             System.out.println("Conex�o realizada com sucesso");            
        }else{
             System.out.println("Erro conex�o");
         }
         
         //FECHAR
         ConnectionFactory.closeConnection(c);
      
    }
}