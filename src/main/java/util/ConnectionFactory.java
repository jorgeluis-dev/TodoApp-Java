package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionFactory {
    //LOCAL
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp";
    public static final String USER = "root";
    public static final String PASS = "";    
    
    //CLOUD
    //1. Basta alterar a URL, USER, PASS de acordo com sua base de dados
    //2. Caso utilize um banco de dados diferente do MYSQL, Ser� necessario altera��o do DRIVER
    
  
    
    /*
        1. Metodo fazer a conex�o;
        2. Fechar a conex�o do banco de dados;
    */
    
    //FazConex�o -> RETORNA UMA CONEX�O (abertura)
    
//    //TEST
//    public static Connection getConnection(){
//    try{
//        Class.forName(DRIVER);
//        Connection conn = DriverManager.getConnection(URL, USER, PASS);
//        System.out.println("Conex�o com o banco de dados estabelecida com sucesso!");
//        return conn;
//    } catch(Exception ex){
//        System.out.println("Erro na conex�o com o banco de dados: " + ex.getMessage());
//        throw new RuntimeException(ex);
//    }
//}
//    
    
    
    //ORIGINAL
    public static Connection getConnection(){
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch(Exception ex){
            throw new RuntimeException("Erro na conex�o com banco de dados", ex);
        }
    }
    
    //FechaConex�o ->
    public static void closeConnection(Connection connection){
        try {
            if(connection != null){
                connection.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar a conex�o com banco de dados", ex);
        }
    }
    
     //FechaConex�o -> [com statement]
    public static void closeConnection(Connection connection, PreparedStatement statement){
        try {
            if(connection != null){
                connection.close();
            }
            
            if(statement !=null){
                statement.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar a conex�o com banco de dados", ex);
        }
    }
    
    //Fecha conex�o -> com statement -> resultSet
    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet){
        try {
            if(connection != null){
                connection.close();
            }
            
            if(statement !=null){
                statement.close();
            }
            
            if(resultSet != null){
                resultSet.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar a conex�o com banco de dados", ex);
        }
    }
    
}
