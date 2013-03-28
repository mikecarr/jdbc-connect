
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * User: mcarr
 * Date: 2/21/13
 */
public class JdbcConnect{

    private static Logger logger = Logger.getLogger(JdbcConnect.class.getName()) ;

    public static void main(String [] args)  {

        logger.info("*************************************");
        logger.info(" jdbc-connect is starting!");
        try {

            Properties prop = new Properties();
            //load a properties file
            prop.load(new FileInputStream("conf/db-connection.properties"));
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
