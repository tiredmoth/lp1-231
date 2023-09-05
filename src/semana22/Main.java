package semana22;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

//JOBC - Java data Base Connection
//conjunto de interface e classe para acesso a SGBDs
//Java App --> driver (biblioteca que implementa JDBC) --> SGBD
//Aplicação Desktop ---> Driver MySQL --> MySQL

public class Main {
    public static void main(String[] args) throws SQLException{

        //1.abrir a conexão 
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        //2.executar a consulta e usar os resultados 
        String sql="CREATE TABLE goofy(id INT PRIMARY KEY, nome VARCHAR(100), email VARCHAR(255), ativo BOOL);";
        Statement statement = connection.createStatement();
        statement.execute(sql);



        //3.fechar a conexão

        statement.close();
        connection.close();

    }}