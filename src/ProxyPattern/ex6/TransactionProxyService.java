package ProxyPattern.ex6;

public class TransactionProxyService implements Service {
    private final Service service;

    public TransactionProxyService(Service service) {
        this.service = service;
    }

    @Override
    public void execute(int number) {
        try {
            if (number == 5) {
                throw new Exception();
            }

            System.out.println("Transaction Begin !!");
            service.execute(number);
            System.out.println("Transaction Commit !!");
        } catch (Exception e) {
            System.out.println("Transaction RollBack !!");
        }
    }
}
