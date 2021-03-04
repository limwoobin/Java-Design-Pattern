package FacadePattern.ex2;

public class Test {
    public static void main(String[] args) {
        String tableName = "FacadeTest";

        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE , HelperFacade.ReportTypes.HTML , tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL , HelperFacade.ReportTypes.PDF , tableName);
    }
}
