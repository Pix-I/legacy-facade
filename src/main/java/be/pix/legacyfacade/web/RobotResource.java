package be.pix.legacyfacade.web;


import be.pix.legacyfacade.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RobotResource {


    private final RobotService service;

    @Autowired
    public RobotResource(RobotService service) {
        this.service = service;
    }

    @GetMapping("/ping")
    public @ResponseBody String ping(){
        service.listRobotModels();
        return "pong";
    }


}
