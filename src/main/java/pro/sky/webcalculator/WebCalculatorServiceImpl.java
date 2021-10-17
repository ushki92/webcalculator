package pro.sky.webcalculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class WebCalculatorServiceImpl implements WebCalculatorService {



    private int result;



    @GetMapping("/calculator/plus")
    public int getResultPlus(int num1, int num2) {
        return num1 + num2;
    }

    @GetMapping("/calculator/minus")
    public int getResultMinus(int num1, int num2) {
        return num1 - num2;

    }@GetMapping("/calculator/divide")
    public int getResultDivide(int num1, int num2) {
        return num1/num2;

    }@GetMapping("/calculator/multiply")
    public int getResultMultiply(int num1, int num2) {
        return num1 + num2;
    }


}
