package com.astier.equationsimple;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EqResoudreTest {
    EqResoudre eqResoudre = new EqResoudre();
    String leTest;

    @Test
    void typeEquationOk() {
        leTest="2x + 6 = 12.6";
        boolean res =true;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 1");
        System.out.println("Vecteur test 1");

        leTest="2x + 6 = 12";
        res =true;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 2");
        System.out.println("Vecteur test 2");

        leTest="2.0x + 6.36 = +12";
        res =true;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 3");
        System.out.println("Vecteur test 3");

        leTest="2.0x + 6.0 = -12";
        res =true;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 4");
        System.out.println("Vecteur test 4");

        leTest="-2X + 6 = 12.6";
        res =true;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 5");
        System.out.println("Vecteur test 5");

        leTest="-2X + 6 = -12.6";
        res =true;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 6");
        System.out.println("Vecteur test 6");

        leTest="2X + 6 =12";
        res =false;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 7");
        System.out.println("Vecteur test 7");

        leTest="2.3X + 6 =12";
        res =false;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 8");
        System.out.println("Vecteur test 8");

        leTest="2.3X + 6.36 =12";
        res =false;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 9");
        System.out.println("Vecteur test 9");

        leTest="2.3X + 6.36 =12.69";
        res =false;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 10");
        System.out.println("Vecteur test 10");

        leTest="2.3G + 6.36 =12.69";
        res =false;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 11");
        System.out.println("Vecteur test 11");

        leTest="2,3X + 6.36 =12.69";
        res =false;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 12");
        System.out.println("Vecteur test 12");

        leTest="2.3X+ 6.36 = 12.69";
        res =false;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 13");
        System.out.println("Vecteur test 13");

        leTest="2.3X + 6.36= 12.69";
        res =false;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 14");
        System.out.println("Vecteur test 14");

        leTest="2x + 6 =12.6";
        res =false;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 15");
        System.out.println("Vecteur test 15");

        leTest="2 x + 6 =12.6";
        res =false;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 16");
        System.out.println("Vecteur test 16");

        leTest="2X + 6 : 12.6";
        res =false;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 17");
        System.out.println("Vecteur test 17");

        leTest="2X + 6 = 12.6p";
        res =false;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 18");
        System.out.println("Vecteur test 18");

        leTest="-2X + 6 = 12.6";
        res =true;
        assertTrue(eqResoudre.typeEquationOk(leTest) == res, "Vecteur test 19");
        System.out.println("Vecteur test 19");
    }

    @Test
    void resoudre() {
        leTest="2D + 6 = 12.6";
        String solution ="D=3,3";
        assertTrue(eqResoudre.resoudre(leTest).contentEquals(solution), "Vecteur test 20");
        System.out.println("Vecteur test 20");

        leTest="2a + 6 = 12.6";
        solution ="a=3,3";
        assertTrue(eqResoudre.resoudre(leTest).contentEquals(solution), "Vecteur test 21");
        System.out.println("Vecteur test 21");

        leTest="2a - 6 = 12.6";
        solution ="a=9,3";
        assertTrue(eqResoudre.resoudre(leTest).contentEquals(solution), "Vecteur test 22");
        System.out.println("Vecteur test 22");

        leTest="2a - 6 = -12.6";
        solution ="a=-3,3";
        assertTrue(eqResoudre.resoudre(leTest).contentEquals(solution), "Vecteur test 23");
        System.out.println("Vecteur test 23");

    }
}