package OpenClosedPrinciple.Example2.BetterCode;

public class PDFReportGenerator implements ReportGenerator {
    @Override
    public String generateReport(){
        return "generating pdf report";
    }
}
