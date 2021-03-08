package week01.jsk;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        String input = "1 * 10 + 3 + 4";
//[^0-9-+*/. ]
        char[] inputChars = input.replace(" ", "").trim().toCharArray();

        Stack<Character> chars = new Stack<>();
        List<Character> operators = new ArrayList<>();
        Stack<Double> numbers = new Stack<>();

        for (char c : inputChars) {
            switch (c) {
                case '+':
                    operators.add('+');
                    chars.push('!');
                    break;
                case '-':
                    operators.add('-');
                    chars.push('!');
                    break;
                case '*':
                    operators.add('*');
                    chars.push('!');
                    break;
                case '/':
                    operators.add('/');
                    chars.push('!');
                    break;
                default:
                    chars.push(c);
                    break;
            }
        }

        StringBuilder temp = new StringBuilder();
        for (Character c : chars) {
            if (c != '!') {
                temp.append(c);
            } else {
                numbers.push(Double.valueOf(temp.toString()));
                temp = new StringBuilder();
            }
        }

        numbers.push(Double.valueOf(temp.toString()));
        Collections.reverse(numbers);

        double value = 0;

        for (Character oper : operators) {
            switch (oper) {
                case '+':
                    value = numbers.pop() + numbers.pop();
                    numbers.push(value);
                    break;
                case '-':
                    value = numbers.pop() - numbers.pop();
                    numbers.push(value);
                    break;
                case '*':
                    value = numbers.pop() * numbers.pop();
                    numbers.push(value);
                    break;
                case '/':
                    value = numbers.pop() / numbers.pop();
                    numbers.push(value);
                    break;
            }
        }

        System.out.println("Calculation result : " + value);
    }
}