package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletarAluno {
        public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        
        Scanner sc = new Scanner(System.in);
        int alunoid = sc.nextInt();
        sc.close();

        String sql = "DELETE FROM alunos WHERE id = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, alunoid);

        ResultSet rs = statement.executeQuery(sql);
        
        rs.close();
        connection.close();
        statement.close();
        

    }
}
