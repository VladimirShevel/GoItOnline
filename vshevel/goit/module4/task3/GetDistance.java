package vshevel.goit.module4.task3;



public class GetDistance
{
    static Double e;
    public static double getDistance(int x1, int y1, int x2, int y2)
    {
        Double a = Double.valueOf((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        e = Math.sqrt(a);
        return e;

    }

    public static void main(String[] args) {
        System.out.println("Lenght is "+getDistance(2,3,5,89));
    }
}