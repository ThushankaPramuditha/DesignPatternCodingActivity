package Coding_Activity_2.Facade_Pattern;

import java.sql.Connection;

public class OracleHelper {

    public static OracleHelper getOracleDBConnection() {
        return new OracleHelper();
    }

    public void generateOraclePDFReport(String tableName, Connection con) {
        // get data from table and generate pdf report
    }

    public void generateOracleHTMLReport(String tableName, Connection con) {
        // get data from table and generate pdf report
    }
      
}
