package fr.btsciel.demo;

import java.text.DecimalFormat;

public class EqResoudre {
    private String pattern = "[+-]?[0-9]+([.][0-9]+)?[a-zA-Z] [+\\-*/] [+-]?[0-9]+([.][0-9]+)? = [+-]?[0-9]+([.][0-9]+)?";
    public EqResoudre() {

    }
    public String resoudre(String equation) {
        double a, b, c;
        double response;
        String operator;
        String variable;
        String equality_response = null;
        DecimalFormat df = new DecimalFormat("#.######");

        String [] elements = equation.split(" ");
        a = Double.parseDouble(elements[0].substring(0, elements[0].length() - 1));
        variable = elements[0].substring(elements[0].length() - 1);
        operator = elements[1];
        b = Double.parseDouble(elements[2]);
        c = Double.parseDouble(elements[4]);

        switch (operator) {
            case "+":
                response = (c - b) / a;
                equality_response = variable + " = " + df.format(response);
                break;
            case "-":
                response = (c + b) / a;
                equality_response = variable + " = " + df.format(response);
                break;
            case "/":
                response = (b * c) / a;
                equality_response = variable + " = " + df.format(response);
                break;
            case "*":
                response = c / (b * a);
                equality_response = variable + " = " + df.format(response);
                break;
        }
        return equality_response;
    }
    public boolean typeEquationOk(String equation) {
        return equation.matches(pattern);
    }
}