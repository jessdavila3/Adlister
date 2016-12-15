import java.sql.*;
import java.util.List;

/**
 * Created by jessedavila on 12/15/16.
 */
public class MySQLAdsDao implements Ads {
    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        String selectQuery = "SELECT * FROM MOVIES";
        try {
            Connection connection = DriverManager.getConnection(
                    "jbdc:mysql://localhost/adlister_db",
                    "root",
                    "codeup"
            );
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
