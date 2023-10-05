package ie.atu.cicdlab1part2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculate")
    public Object calculate(@RequestParam int num1, int num2, String calculation){

        int total = 0;

        switch(calculation){
            case "multiply" -> total = num1 * num2;
            case "add" -> total = num1 + num2;
            case "subtract" -> total = num1 - num2;
            case "divide" -> total = num1 / num2;
        }

        return new math(total, calculation);
    }

    public class math{
        private int total;
        private String calculation;

        public math(int total, String calculation) {
            this.total = total;
            this.calculation = calculation;
        }

        public int getTotal() {
            return total;
        }

        public String getCalculation() {
            return calculation;
        }
    }

}
