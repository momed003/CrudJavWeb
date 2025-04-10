package dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author yassimin
 */
public class UserDao {

    public List<UserModel> getAllUsers() {
        Connection firsConnection = null;
        conection com = new conection();
        PreparedStatement ps;
        ResultSet rs;
        String querySelectSql = "select * from users";
        // List userList = new ArrayList();
        List<UserModel> userList = new ArrayList();

        try {
            firsConnection = com.getConnection();
            ps = firsConnection.prepareStatement(querySelectSql);
            rs = ps.executeQuery();

            while (rs.next()) {
                UserModel user = new UserModel();
                user.setId(rs.getInt("id_user"));
                user.setUsername(rs.getString("username"));
                user.setEmail(rs.getString("email"));
                user.setCreated_at(rs.getTimestamp("created_at"));
                user.setUpdated_at(rs.getTimestamp("updated_at"));
                user.setDeleted_at(rs.getTimestamp("updated_at"));

                userList.add(user);
            }
        } catch (SQLException e) {
            System.out.println(e.getCause());
        } finally {
            com.disconnetConnecttion();
        }
        return userList;

    }

    public boolean createUser(UserModel user) {
        conection connection = new conection();
        Connection com = connection.getConnection();

        PreparedStatement ps;

        try {
            String sqlQuery = "insert into users(username, email) values (?,?)";
            ps = com.prepareStatement(sqlQuery);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getEmail());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.getCause());
            return false;
        }
        return true;

    }
}
