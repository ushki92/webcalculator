package pro.sky.webcalculator;

import org.springframework.web.bind.annotation.*;

@RestController
public class WebCalculatorController {

    public final WebCalculatorService webCalculatorService;

    public WebCalculatorController(WebCalculatorService webCalculatorService) {
        this.webCalculatorService = webCalculatorService;
    }

    @RequestMapping(value = "/calculator", method = RequestMethod.GET)
    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    @RequestMapping(value = "/calculator/plus", method = RequestMethod.GET)
    public String getResultPlus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + webCalculatorService.getResultPlus(num1,num2);
    }

    @RequestMapping(value = "/calculator/minus", method = RequestMethod.GET)
    public String getResultMinus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + webCalculatorService.getResultMinus(num1,num2);
    }

    @RequestMapping(value = "/calculator/divide", method = RequestMethod.GET)
    public String getPlusResultDivide(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return "Деление на 0 запрещено";
        } else {
            return num1 + " / " + num2 + " = " + webCalculatorService.getResultDivide(num1, num2);

        }
    }

    @RequestMapping(value = "/calculator/multiply", method = RequestMethod.GET)
    public String getPlusResultMultiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + webCalculatorService.getResultMultiply(num1,num2);
    }
}
