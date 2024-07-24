package seminars.solid_principle.dip1;

import seminars.solid_principle.dip1.model.Report;
import seminars.solid_principle.dip1.model.ReportItem;
import seminars.solid_principle.dip1.model.util.PrintOut;

import java.util.ArrayList;
import java.util.Arrays;

public class ReportService {
    private Report report;
    private PrintOut printer;

    public ReportService(Report report, PrintOut printer) {
        this.report = report;
        this.printer = printer;
    }

    // calculate report data
    public void calculate(){
        report.items =  new ArrayList<ReportItem>();
        report.items.add(new ReportItem("First", (float)5));
        report.items.add(new ReportItem("Second", (float)6));
    }

    public void output(){;
        printer.output(report.items);
    }

    public void add(ReportItem... items){
        this.report.items.addAll(Arrays.asList(items));
    }
}
