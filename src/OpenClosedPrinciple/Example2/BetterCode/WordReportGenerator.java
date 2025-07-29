package OpenClosedPrinciple.Example2.BetterCode;

public class WordReportGenerator implements ReportGenerator{
    @Override
    public String generateReport(){
        return "generating PDF report";
    }
}
