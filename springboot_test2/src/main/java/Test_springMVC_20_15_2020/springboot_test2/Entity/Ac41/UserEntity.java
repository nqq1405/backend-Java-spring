package Test_springMVC_20_15_2020.springboot_test2.Entity.Ac41;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor// lombok

public class UserEntity {
    private String id;
    private String username;
    private String password;
    private String fullname;
    private String email;
    private String address;
    private String phone;


}
