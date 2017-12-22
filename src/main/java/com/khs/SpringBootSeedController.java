package com.khs;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
class SpringBootSeedController {

    @RequestMapping(method = GET, path = "hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }
    
    @RequestMapping(method = GET, path = "*")
    public String person2(@PathVariable String name) {
        return "process complete, exiting thread...";
    }

}
