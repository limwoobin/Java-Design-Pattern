package ProxyPattern.ex5;

import java.util.List;

public class UserServiceProxy implements UserService {
    private final UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<String> findAll() {
        System.out.println("Before findAll");
        List<String> list = userService.findAll();
        System.out.println("After findAll");
        return list;
    }

    @Override
    public String findById(long id) {
        System.out.println("Proxy findById = " + id);
        return userService.findById(id);
    }
}
