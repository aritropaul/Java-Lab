import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

class Q4 {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SHOW DATABASES;");
            while (resultSet.next())
                System.out.println(resultSet.getString(1));
            connection.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
