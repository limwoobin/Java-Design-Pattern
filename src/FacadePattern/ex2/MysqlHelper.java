package FacadePattern.ex2;

import java.sql.Connection;

public class MysqlHelper {

    public static Connection getMysqlDBConnection() {
        // 예제이기에 null 을 리턴
        return null;
    }

    public void generateMysqlPDFReport(String tableName , Connection connection) {

    }

    public void generateMysqlHTMLReport(String tableName , Connection connection) {

    }
}
