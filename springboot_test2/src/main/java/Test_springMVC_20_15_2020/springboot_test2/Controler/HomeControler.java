package Test_springMVC_20_15_2020.springboot_test2.Controler;

import Test_springMVC_20_15_2020.springboot_test2.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v1")
public class HomeControler {

    @RequestMapping(value = "/user")
    public User GetUser(){
        return new User("abvc","xyz");
    }

    @GetMapping(value = "/student")
    public String GetUser2(){
        return "ABC";
    }
}
