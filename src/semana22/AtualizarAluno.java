package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarAluno {
        public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        
        Scanner sc = new Scanner(System.in);
        int alunoid = sc.nextInt();
        //novas informacoes sobre o aluno
        sc.nextLine(); 
        String nome = sc.nextLine();
        String email = sc.nextLine();
        boolean ativo = sc.nextBoolean();
        sc.close();

        String sql = "UPDATE alunos SET nome = ?, email = ?, ativo = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, alunoid);
            statement.setString(2, nome);
            statement.setString(3, email);
            statement.setBoolean(4, ativo);
            


        ResultSet rs = statement.executeQuery(sql);
        
        rs.close();
        connection.close();
        statement.close();
    }
}