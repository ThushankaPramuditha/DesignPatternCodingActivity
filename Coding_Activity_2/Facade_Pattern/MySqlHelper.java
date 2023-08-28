package Coding_Activity_2.Facade_Pattern;

import java.sql.Connection;

public class MySqlHelper {
   
    public static MySqlHelper getMySqlDBConnection() {
         return new MySqlHelper();
    }
    
    public void generateMySqlPDFReport(String tableName, Connection con) {
         //get data from table and generate pdf report
    }
    
    public void generateMySqlHTMLReport(String tableName, Connection con) {
         //get data from table and generate pdf report
    }

}
