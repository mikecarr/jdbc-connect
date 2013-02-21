
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * User: mcarr
 * Date: 2/21/13
 */
public class JdbcConnect{

    public static void main(String [] args)  {
        try {




            Properties prop = new Properties();
            //load a properties file
            prop.load(new FileInputStream("config.properties"));
            String url = prop.getProperty("url");
            String username = prop.getProperty("username");
            String password = prop.getProperty("password");

            Class.forName("oracle.jdbc.driver.OracleDriver");



            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected!");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
