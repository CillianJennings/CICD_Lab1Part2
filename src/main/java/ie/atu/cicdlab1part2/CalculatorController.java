package ie.atu.cicdlab1part2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public String details(@RequestParam int num1, int num2){
        return "Your name: "+ name + " Your age: " + age;
    }

}
