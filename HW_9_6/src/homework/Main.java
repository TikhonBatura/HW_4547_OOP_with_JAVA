package homework;

import homework.Reports.ReportPrint;
import homework.Users.User;

public class Main{
    public static void main(String[] args){
        User user = new User(1,"Bob");
        user.report();
        user.save();

        ReportPrint print = new ReportPrint();
        print.report();
    }
}