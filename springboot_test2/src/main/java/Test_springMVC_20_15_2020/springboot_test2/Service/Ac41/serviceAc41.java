package Test_springMVC_20_15_2020.springboot_test2.Service.Ac41;

import Test_springMVC_20_15_2020.springboot_test2.Entity.Ac41.UserEntity;
import Test_springMVC_20_15_2020.springboot_test2.conf_conntoDB.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class serviceAc41 {

    Connection conn;

    {
        try {
            conn = Database.getInstance().getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertToDb(UserEntity userEntity){
        Statement a = null;
        try {
            conn = Database.getInstance().getConnection();
            a = conn.createStatement();
            a.execute("INSERT INTO `new_schema_test`.`user` (`username`, `password`, `fullname`, `email`, `address`, `phone`) " +
                    "VALUES ('"+userEntity.getUsername()+"', " +
                            "'"+userEntity.getPassword()+"'," +
                            "'"+userEntity.getFullname()+"'," +
                            "'"+userEntity.getEmail()+"'," +
                            "'"+userEntity.getAddress()+"'," +
                            "'"+userEntity.getPhone()+"');");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(conn != null) conn.close();
                if(a != null) a.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public List<UserEntity> getinfoInDB(String optionASC){
        List<UserEntity> userEntityList = new ArrayList<>();
        Statement a;
        ResultSet resultSet;
        try {
            conn = Database.getInstance().getConnection();
            a = conn.createStatement();
            resultSet = a.executeQuery("SELECT * FROM new_schema_test.`user` ORDER BY `user`."+optionASC+" ASC;");

            while (resultSet.next()) {
                userEntityList.add(new UserEntity(resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7))
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            /*try {
                //if(c != null) c.close();
                //if(a != null) a.close();
                //if(resultSet != null) resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }*/
        }
        return userEntityList;
    }

    public boolean update(String userId,String value,String colunm){
        Statement a;
        try {
            a = conn.createStatement();
            if (a.execute("UPDATE `new_schema_test`.`user` SET `"+
                    colunm+"` = '"+
                    value+"' WHERE (`id` = '"+ userId +"');")){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(conn != null) conn.close();
                //if(a != null) a.close();
                //if(resultSet != null) resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    public boolean delete(String userId){
        List<UserEntity> userEntityList = new ArrayList<>();
        Statement a;
        try {
            a = conn.createStatement();
            if (a.execute("UPDATE `new_schema_test`.`user` SET `isdeleted  ` = '1' WHERE (`id` = '"+userId+"');")) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(conn != null) conn.close();
                //if(a != null) a.close();
                //if(resultSet != null) resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }
}
