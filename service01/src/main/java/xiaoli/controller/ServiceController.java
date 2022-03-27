package xiaoli.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    private static Logger log = LoggerFactory.getLogger(ServiceController.class);

    @GetMapping("hello")
    public String sayHello(){
        log.info("just say hello");
        return "Hello Xiaoli";
    }

}
