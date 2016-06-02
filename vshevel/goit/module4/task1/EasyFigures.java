package vshevel.goit.module4.task1;

public class EasyFigures {
    public static double triangleSquare(int a, int b, int c){
        double p = (a + b + c)/2;
        double r = p*(p-a)*(p-b)*(p-c);
        double triangleS = Math.sqrt(r);
        return triangleS;
    }
    public static int rectangleSquare(int d, int e){
        int rectangleS = d * e;
        return rectangleS;
    }
    public static double circleSquare(int r){
        double circleS = 3.14 * r * r;
        return circleS;
    }

    }
