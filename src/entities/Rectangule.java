package entities;

public class Rectangule {

    public double width;//largura
    public double heigth;//altura

    public double area(){
        return width * heigth;
    }
    public double perimeter(){
        return 2 * (width + heigth);
    }
    public double diagonal(){
        return Math.sqrt((Math.pow(width, 2) + (Math.pow(heigth, 2))));
    }
}
