package ProxyPattern.ex5;

import java.util.List;

public interface UserService {
    List<String> findAll();
    String findById(long id);
}
