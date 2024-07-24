package seminars.solid_principle.dip1.model;

import java.util.List;

public class Report{
    public List<ReportItem> items;	// report data

    public Report(List<ReportItem> items){
        this.items = items;
    }
}
