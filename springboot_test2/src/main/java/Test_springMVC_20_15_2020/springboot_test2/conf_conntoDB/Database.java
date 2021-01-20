package Test_springMVC_20_15_2020.springboot_test2.conf_conntoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static Database database;
    private static Connection conn;

    private Database() {
    }

    public static Database getInstance(){
        if (database == null){
            database = new Database();
        }
        return database;
    }

    public Connection getConnection() throws Exception {
        if (conn == null){
             String user = "root";
             String pass = "quang123";
             String host = "jdbc:mysql://localhost:3306/";
             String driver = "com.mysql.cj.jdbc.Driver";
             String dbName = "new_schema_test";

             Class.forName(driver);
             conn = DriverManager.getConnection(host + dbName,user, pass);
        }
        return conn;
    }

    //test connection
    public static void main(String[] args) {
        //test
        Connection c = null;
        try {
             c = Database.getInstance().getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Statement a = c.createStatement();
            a.execute("INSERT INTO `new_schema_test`.`user` (`username`, `password`, `fullname`, `email`, `address`, `phone`) " +
                    "VALUES ('nqq3', '1234', 'sacxzc', 'dsadwq', 'abcd', '999999');");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                if(c != null) c.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
