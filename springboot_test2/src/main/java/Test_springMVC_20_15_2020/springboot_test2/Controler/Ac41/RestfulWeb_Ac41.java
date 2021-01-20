package Test_springMVC_20_15_2020.springboot_test2.Controler.Ac41;


import Test_springMVC_20_15_2020.springboot_test2.Entity.Ac41.UserEntity;
import Test_springMVC_20_15_2020.springboot_test2.Service.Ac41.serviceAc41;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(value = "Ac41")
public class RestfulWeb_Ac41 {
    @PostMapping(value = "/user")
    public Object post(@RequestBody UserEntity request){
        new serviceAc41().insertToDb(request);
        return "Sucess";
    }

    @GetMapping(value = "/user/list")
    public Object gets(){
        List<UserEntity> userEntityList = new serviceAc41().getinfoInDB("fullname");
        return userEntityList;
    }

    @PutMapping(value = "/user/{user_id}")
    public Object puts(@PathVariable(name = "user_id") String userId){
        if (new serviceAc41().update(userId, "TPHcm", "address")){
            return "update sucess";
        }else
            return "update sucess";
    }

    @DeleteMapping(value = "/user")
    public Object delete(@RequestParam(name = "id") String userId){
        if (new serviceAc41().delete(userId)){
            return "delete sucess";
        }else
            return "delete sucess";
    }

}
