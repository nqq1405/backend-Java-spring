package Test_springMVC_20_15_2020.springboot_test2.Model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;

    public User() {
        List<User> a = new ArrayList<>();
        for (int i=0; i<10; i++){
            a.add(new User("Nguyen van a " + i, "nguyenvan"+i + "@gmail.com"));
        }
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
