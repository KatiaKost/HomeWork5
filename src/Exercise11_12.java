public class Exercise11_12 {
    public static void main(String[] args) {
        System.out.println("Задание 3.11");
        boolean f;
        int x, y;
        x = 1;
        y = -1;
        f = Math.pow(x, 2) + Math.pow(y, 2) <= 4;
        System.out.println("а) Значение функции Math.pow(x, 2) + Math.pow(y, 2) <= 4 = " + f);

        x = 1;
        y = 2;
        f = (x >= 0) || (Math.pow(y, 2) != 4);
        System.out.println("б) Значение функции (x >= 0) || (Math.pow(y, 2) != 4) = " + f);
        f = (x >= 0) && (Math.pow(y, 2) != 4);
        System.out.println("в) Значение функции (x >= 0) && (Math.pow(y, 2) != 4) = " + f);

        x = 2;
        y = 1;
        f = (x * y != 0) && (y > x);
        System.out.println("г) Значение функции (x * y != 0) && (y > x) = " + f);
        f = (x * y != 0) && (y < x);
        System.out.println("д) Значение функции (x * y != 0) && (y < x) = " + f);

        x = 2;
        y = 1;
        f = (!(x * y < 0)) && (y > x);
        System.out.println("е) Значение функции (!(x * y < 0)) && (y > x) = " + f);
        x = 1;
        y = 2;
        f = (!(x * y < 0)) && (y > x);
        System.out.println("ж) Значение функции (!(x * y < 0)) && (y > x) = " + f);
        System.out.println();

        System.out.println("Задание 3.12");
        x = 1;
        y = -1;
        f = Math.pow(x, 2) - Math.pow(y, 2) <= 0;
        System.out.println("а) Значение функции Math.pow(x, 2) - Math.pow(y, 2) <= 0 = " + f);

        x = 2;
        y = -2;
        f = (x >= 2) || (Math.pow(y, 2) != 4);
        System.out.println("б) Значение функции (x >= 2) || (Math.pow(y, 2) != 4) = " + f);
        x = 2;
        y = 2;
        f = (x >= 0) && (Math.pow(y, 2) > 4);
        System.out.println("в) Значение функции (x >= 0) && (Math.pow(y, 2) > 4) = " + f);

        x = 1;
        y = 2;
        f = (x * y != 4) && (y > x);
        System.out.println("г) Значение функции (x * y != 4) && (y > x) = " + f);
        x = 2;
        y = 1;
        f = (x * y != 0) || (y < x);
        System.out.println("д) Значение функции (x * y != 0) || (y < x) = " + f);

        x = 1;
        y = 2;
        f = (!(x * y < 1)) && (y > x);
        System.out.println("е) Значение функции (!(x * y < 1)) && (y > x) = " + f);
        x = 2;
        y = 1;
        f = (!(x * y < 0)) || (y > x);
        System.out.println("ж) Значение функции (!(x * y < 0)) || (y > x) = " + f);
    }
}