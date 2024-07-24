package seminars.solid_principle.dip1.model.util;

import seminars.solid_principle.dip1.model.ReportItem;

import java.util.List;

public class ReportConsole extends PrintOut{
    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Print in report console");
        for (ReportItem item : items) {
            System.out.println(item.toString());
        }
    }
}
