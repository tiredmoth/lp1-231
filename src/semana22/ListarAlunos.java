package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListarAlunos {

    public static void main(String[] args) throws SQLException{

        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        String sql="Select * from pikmin;";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        ResultSet rs= statement.executeQuery(sql);
        
        while(rs.next()){
            int id=rs.getInt("id");
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            boolean ativo = rs.getBoolean("ativo");

            System.out.println(id+" , "+nome+" , "+email+" , "+ativo);

        }


        Statement statemen = connection.createStatement();
        statement.execute(sql);



        //3.fechar a conexão

        statemen.close();
        connection.close();



    
}}
