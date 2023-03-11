public class Exercise2_10 {
    public static void main(String[] args) {
        System.out.println("Задание 3.2");
        boolean x = false;
        boolean y = true;
        boolean z = false;
        System.out.println("x = " + x + ", " + " y = " + y + ", " + " z = " + z);
        boolean result1 = x || z;
        boolean result2 = x && y;
        boolean result3 = x && z;
        System.out.println("x || z = " + result1 + "\nx && y = " + result2 + "\nx && z = " + result3);
        System.out.println();

        System.out.println("Задание 3.3");
        boolean a = true;
        boolean b = false;
        boolean c = false;
        System.out.println("a = " + a + ", " + " b = " + b + ", " + " c = " + c);
        result1 = !a && b;
        result2 = a || !b;
        result3 = a && b || c;
        System.out.println("!a && b = " + result1 + "\na || !b = " + result2 + "\na && b || c = " + result3);
        System.out.println();

        System.out.println("Задание 3.4");
        x = true;
        y = true;
        z = false;
        System.out.println("x = " + x + ", " + " y = " + y + ", " + " z = " + z);
        result1 = !x && y;
        result2 = x || !y;
        result3 = x || y && z;
        System.out.println("!x && y = " + result1 + "\nx || !y = " + result2 + "\nx || y && z = " + result3);
        System.out.println();

        System.out.println("Задание 3.5");
        a = true;
        b = false;
        c = false;
        System.out.println("a = " + a + ", " + " b = " + b + ", " + " c = " + c);
        result1 = a || b && !c;
        result2 = !a && !b;
        result3 = !(a && c) || b;
        boolean result4 = a && !b || c;
        boolean result5 = a && (!b || c);
        boolean result6 = a || (!(b && c));
        System.out.println("!a || b && !c = " + result1 + "\n!a && !b = " + result2 + "\n!(a && c) || b = " + result3);
        System.out.println("a && !b || c = " + result4 + "\na && (!b || c) = " + result5 + "\na || (!(b && c)) = " + result6);
        System.out.println();

        System.out.println("Задание 3.6");
        x = false;
        y = false;
        z = true;
        System.out.println("x = " + x + ", " + " y = " + y + ", " + " z = " + z);
        result1 = x || y && !z;
        result2 = !x && !y;
        result3 = !(x && z) || y;
        result4 = x && !y || z;
        result5 = x && (!y || z);
        result6 = x || (!(y || z));
        System.out.println("x || y && !z = " + result1 + "\n!x && !y = " + result2 + "\n!(x && z) || y = " + result3);
        System.out.println("x && !y || z = " + result4 + "\nx && (!y || z) = " + result5 + "\nx || (!(y || z)) = " + result6);
        System.out.println();

        System.out.println("Задание 3.7");
        a = true;
        b = false;
        c = false;
        System.out.println("a = " + a + ", " + " b = " + b + ", " + " c = " + c);
        result1 = a || !(a && b) || c;
        result2 = !a || a && (b || c);
        result3 = (a || b && !c) && c;
        System.out.println("a || !(a && b) || c = " + result1 + "\n!a || a && (b || c) = " + result2 + "\n(a || b && !c) && c = " + result3);
        System.out.println();

        System.out.println("Задание 3.8");
        x = false;
        y = true;
        z = false;
        System.out.println("x = " + x + ", " + " y = " + y + ", " + " z = " + z);
        result1 = x && !(z || y) || !z;
        result2 = !x || x && (y || z);
        result3 = (x || y && !z) && z;
        System.out.println("x && !(z || y) || !z = " + result1 + "\n!x || x && (y || z) = " + result2 + "\n(x || y && !z) && z = " + result3);
        System.out.println();

        System.out.println("Задание 3.9");
        x = true;
        y = false;
        z = false;
        System.out.println("x = " + x + ", " + " y = " + y + ", " + " z = " + z);
        result1 = !x || !y || !z;
        result2 = (!x || !y) && (x || y);
        result3 = x && y || x && z || !z;
        System.out.println("!x || !y || !z = " + result1 + "\n(!x || !y) && (x || y) = " + result2 + "\nx && y || x && z || !z = " + result3);
        System.out.println();

        System.out.println("Задание 3.10");
        a = false;
        b = false;
        c = true;
        System.out.println("a = " + a + ", " + " b = " + b + ", " + " c = " + c);
        result1 = (!a || !b) && !c;
        result2 = (!a || !b) && (a || b);
        result3 = a && b || a && c || !c;
        System.out.println("(!a || !b) && !c = " + result1 + "\n(!a || !b) && (a || b) = " + result2 + "\na && b || a && c || !c = " + result3);
        System.out.println();


    }
}
