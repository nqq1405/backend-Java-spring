package Test_springMVC_20_15_2020.springboot_test2.Entity;

import lombok.*;
import org.springframework.stereotype.Component;

@ToString
@Data
@Getter
@Setter
@AllArgsConstructor
public class Student {
    private String name;
    private String email;
    private String mssv;

}
