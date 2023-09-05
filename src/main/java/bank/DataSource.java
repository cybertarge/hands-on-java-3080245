package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataSource {
  
  public static Connection connect() {
    String db_file = "jdbc:sqlite:resources/bank.db";
    Connection connection = null;
    
    try {
      connection = DriverManager.getConnection(db_file);
      System.out.println("We're Connected");
    } catch (SQLException e){
      e.printStackTrace();
    }

    return connection;
  }

  public static Customer getCustomer(String username) {
    String sql = "select * from customers where usename = ?";
    try(Connection connection = connect();
      PreparedStatement statement = connection.prepareStatement(sql)){

    }catch(SQLException e){
      e.printStackTrace();
    }
  }




  public static void main(String[] args){
    connect();
  }
}
