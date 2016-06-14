package vshevel.goit.module6.task1;

public class EasyFigures {

    public static double triangleSquare(int a, int b, int c)
    {
        if (a >= b + c || b >= a + c || c >= a + b) throw new IllegalArgumentException("Неверный параметр");
        double p = (a + b + c)/2;
        double r = p*(p-a)*(p-b)*(p-c);
        return Math.sqrt(r);
    }

    public static int rectangleSquare(int d, int e)
    {
        if(d < 0 || e < 0) throw new IllegalArgumentException("Неверный параметр");
        return d * e;
    }

    public static double circleSquare(int r)
    {
        if(r <= 0) throw new IllegalArgumentException("Неверный параметр");
        final  double pi= 0x1.91eb851eb851fp1;
        return pi * r * r;
    }

    public static void main(String[] args){

        try
        {
            System.out.println("Result for triangle is : " + triangleSquare(81, 100, 19));
        }
        catch(IllegalArgumentException e){
            System.out.println("Такой треугольник не существует. " + e.getMessage());
            }

        try
        {
            System.out.println("Result for rectangle is : " + rectangleSquare(81, -100));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Ни одна из сторон прямоугольника не может быть отрицательной. " + e.getMessage());
                    }

        try
        {
            System.out.println("Result for circle is : " + circleSquare(-1));
        }
        catch(IllegalArgumentException e){
            System.out.println("Радиус должен, быть > 0. " + e.getMessage());
            }
    }

    }
