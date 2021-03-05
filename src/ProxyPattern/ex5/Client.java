package ProxyPattern.ex5;

public class Client {
    public static void main(String[] args) {
        UserService service = new UserServiceImpl();
        service.findAll();
        service.findById(5);

        System.out.println("--------------------------------------------");

        UserService proxyService = new UserServiceProxy(new UserServiceImpl());
        proxyService.findAll();
        proxyService.findById(5);
    }
}
