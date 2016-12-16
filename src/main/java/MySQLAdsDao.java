import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

/**
 * Created by jessedavila on 12/15/16.
 */
public class MySQLAdsDao implements Ads {
    Config root = new Config();

    @Override
    public List<Ad> all() {

        // create statement
        //execute statement with sql based on type
        //work with results of query; resultset object - create a list of Ad objects

        String selectQuery = "SELECT * FROM ads";
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    root.getUrl(),
                    root.getUser(),
                    root.getPassword()
            );
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);
            List<Ad> ads = new ArrayList<>();
            while (rs.next()) {
                ads.add(new Ad(
                        rs.getLong("id")),
                        rs.getLong("user_id")),
                        rs.getString("title")),
                        rs.getString("description"))
                ));
            };
            connection.close();
            return ads;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        String insertQuery = "insert into ads (user_id, title, description) VALUES (";
        insertQuery += ad.getUserId() + ", ";
        insertQuery += "'" + ad.getTitle() + "', ";
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = null;
            connection = DriverManager.getConnection(
                    root.getUrl(),
                    root.getUser(),
                    root.getPassword()
            );
            Statement stmt = connection.createStatement();
            insertQuery += "values ("+ad.getTitle()+ad.getDescription()+")";
            ResultSet rs = stmt.executeQuery(insertQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
