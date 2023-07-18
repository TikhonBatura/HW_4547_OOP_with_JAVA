package homework.Reports;

import dip1.model.ReportItem;
import homework.impl.Report;

import java.util.List;

public class ReportPrint implements Report {
    @Override
    public void report(){
        System.out.println("Report was printed");
    }
}
