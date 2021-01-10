package Test_springMVC_20_15_2020.springboot_test2.Controler;

import Test_springMVC_20_15_2020.springboot_test2.Entity.Student;
import Test_springMVC_20_15_2020.springboot_test2.Entity.User;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "ac31")
public class HomeController {
    @RequestMapping(value = "/user")
    public Object ex1(){
        User user = new User("abc","abc@gmail.com");
        return user;
    }

    @GetMapping(value = "/student")
    public List<Student> getex2(){
        List<Student> studentsList = new ArrayList<>();

        studentsList.add(new Student("nqq","abcd@gmail.com","asdx123"));
        studentsList.add(new Student("nqq2","abc2d@gmail.com","asdx123"));
        studentsList.add(new Student("nqq3","abcd3@gmail.com","asdx123"));

        return studentsList;
    }
}
