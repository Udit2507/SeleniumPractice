package utilities;

public class ReportManager {
    private static ReportUtils reportUtils;

    public static void init(String reportPath) {
        if (reportUtils == null) {
            reportUtils = new ReportUtils(reportPath);
        }
    }

    public static ReportUtils getReport() {
        return reportUtils;
    }
}
