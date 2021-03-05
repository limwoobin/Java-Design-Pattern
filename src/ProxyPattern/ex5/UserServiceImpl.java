package ProxyPattern.ex5;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<String> findAll() {
        System.out.println("Original findAll Service");
        return null;
    }

    @Override
    public String findById(long id) {
        System.out.println("Original findById Service");
        return null;
    }
}
