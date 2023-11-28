package by.IT.model.entity.dibi.dao;

import by.IT.model.entity.dibi.ConnectionManager;
import by.IT.model.entity.dibi.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
   // private static final String Q1 = "SELECT id, fio, email FROM user WHERE fio LIKE ?";
    private static final String Q2 = "SELECT id, fio, email FROM user WHERE id >= ? AND id <= ?";

    public User findUserByName(String name) {
        try (Connection cn = ConnectionManager.getConnection();
            Statement st = cn.createStatement()){
            String query = String.format("SELECT id fio, email FROM user WHERE fio LIKE %s", name);
            ResultSet resultSet = st.executeQuery(query);
            if (resultSet.next()){
                int id = resultSet.getInt("id");
                String email = resultSet.getString( "email");

                return  new User(id, name, email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<User> findUsersByIds(int from, int to) {
      List<User> users = new ArrayList<>();
      try(Connection cn = ConnectionManager.getConnection();
          PreparedStatement ps = cn.prepareStatement(Q2)) {
          ps.setInt( 1, from);
          ps.setInt( 2,to);
          ResultSet rs = ps.executeQuery();
          while (rs.next()){
              int id = rs.getInt( "id");
              String fio = rs.getString( "fio");
              String email =rs.getString("email");
              users.add(new User(id, fio, email));
          }

      } catch (SQLException e) {
          e.printStackTrace();
      }
      return users;
    }
}
