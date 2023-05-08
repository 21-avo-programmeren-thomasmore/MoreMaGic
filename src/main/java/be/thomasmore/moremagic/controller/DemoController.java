package be.thomasmore.moremagic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo-controller")
public class DemoController {

    @GetMapping
    public String sayHello(){
        return "Hello from secured endpoint";
    }
}
