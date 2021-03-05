package ProxyPattern.ex6;

public class Client {
    public static void main(String[] args) {
        Service service = new TestService();
        service.execute(1);

        System.out.println("-------------------------");

        Service transactionService = new TransactionProxyService(new TestService());
        transactionService.execute(1);

        System.out.println("-------------------------");

        transactionService.execute(5);
    }
}
