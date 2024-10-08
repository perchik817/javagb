package seminars.solid_principle.dip1.model.util;

import seminars.solid_principle.dip1.model.ReportItem;

import java.util.List;

public class ReportPrinter extends PrintOut{
    public void output(List<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
