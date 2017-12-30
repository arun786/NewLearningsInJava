package Java7;

public class EnhancedSwitch {

    public static void main(String[] args) {
        getTradeStatus("success");
        getTradeStatus("pending");
    }

    private static void getTradeStatus(String trade) {
        switch (trade) {
            case "success":
                System.out.println("Success");
                break;
            case "pending":
                System.out.println("Pending");
                break;
            case "execute":
                System.out.println("Execute");
                break;
            default:
                System.out.println("Default");
                break;

        }
    }
}


