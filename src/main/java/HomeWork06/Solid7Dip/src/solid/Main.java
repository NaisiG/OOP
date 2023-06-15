package HomeWork06.Solid7Dip.src.solid;

import HomeWork06.Solid7Dip.src.solid.dip.PrintReport;
import HomeWork06.Solid7Dip.src.solid.dip.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report(new PrintReport());
        report.calculate();
        report.output();
    }
}

