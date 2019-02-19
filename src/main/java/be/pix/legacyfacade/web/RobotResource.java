package be.pix.legacyfacade.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RobotResource {


    @GetMapping("/ping")
    public @ResponseBody String ping(){
        return "pong";
    }


}
