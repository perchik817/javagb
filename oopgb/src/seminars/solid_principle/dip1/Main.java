package seminars.solid_principle.dip1;

import seminars.solid_principle.dip1.model.Report;
import seminars.solid_principle.dip1.model.ReportItem;
import seminars.solid_principle.dip1.model.util.ReportConsole;
import seminars.solid_principle.dip1.model.util.ReportPrinter;

import java.util.List;

public class Main {
    //private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        //log.log(Level.INFO, "Method main in model package started");
        Report report = new Report(List.of(
                new ReportItem("item1", 23.4f),
                new ReportItem("item2", 2.8f)));
        ReportService reportConsoleService = new ReportService(report, new ReportConsole());
        ReportService reportPrinterService = new ReportService(report, new ReportPrinter());
        reportPrinterService.output();
        reportConsoleService.output();
    }
}
