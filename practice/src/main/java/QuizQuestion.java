import java.sql.ResultSet;
import java.sql.SQLException;

public class QuizQuestion {
    Integer id;
    String question;
    String options[];
    String correct;
    
    QuizQuestion(ResultSet rs) {
        try {
            id = rs.getInt(0);
            question = rs.getString(1);
            for (int i=0;i<4;i++) {
                options[i] = rs.getString(2+i);
            }      
            correct = rs.getString(6);
        }
        catch (SQLException e) {
            System.out.print(e);
        }
    }
}
