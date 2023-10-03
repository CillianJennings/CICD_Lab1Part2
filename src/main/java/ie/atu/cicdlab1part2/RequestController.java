package ie.atu.cicdlab1part2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RequestController {

    @GetMapping("/hello")
    public String hello(){
        return "Simple Greeting Method!!!";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){return "Hello there " + name;}

    @GetMapping("/details")
    public String details(@RequestParam String name, int age){
        return "Your name: "+ name + " Your age: " + age;
    }

}
