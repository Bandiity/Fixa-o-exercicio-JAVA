package entities;

import java.sql.SQLOutput;

public class aluno {

    public double n1;
    public double n2;
    public double n3;
    public String name;
    public double notaFinal(){
        return  n1 + n2 + n3;
    }

    public String toString(){
        if (notaFinal() >= 60){
            return "Final Grade = " + String.format("%.2f%n" ,notaFinal()) +
            "PASS";
        }
        else {
            return "Final Grade = " + String.format("%.2f%n", (notaFinal())) +
            "FAILED Missing " + String.format("%.2f%n", (60 - notaFinal())) + " Points";
        }
    }


}
