package semana22;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InserirAluno {

    public static void main(String[] args) throws SQLException{

        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        //2.executar a consulta e usar os resultados 
        
        //Não concatenar...podem apagar a database com um SQL Injection
        //String nome = "DROP TABLE pikmin;";
        //String email = "hohohoho eu sou do mal";
        //boolean ativo = true;

        int id=1;
        String nome = "Olimar";
        String email = "pikmin@gmail.com";
        boolean ativo = true;


        String sql="INSERT INTO pikmin VALUES (?, ?, ?, ?);";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        statement.setString(2,nome);
        statement.setString(3, email);
        statement.setBoolean(4,ativo);

        statement.executeUpdate();

        //Assim voce se protege de possiveis ataques



        Statement statemen = connection.createStatement();
        statemen.execute(sql);



        //3.fechar a conexão

        statemen.close();
        connection.close();

    }
    
}
