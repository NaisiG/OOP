package HomeWork04.Solid6Isp1.src.solid;

import HomeWork04.Solid6Isp1.src.solid.isp.InternetPaymentService;
import HomeWork04.Solid6Isp1.src.solid.isp.TerminalPaymentService;
import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);

        TerminalPaymentService terminalService = new TerminalPaymentService();
        terminalService.payWebMoney(10);
        terminalService.payCreditCard(10);
    }
}
