import java.io.Console;
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Example_1();
        Example_2();
        Example_3();
        Example_4();
        Example_5();
        Example_6();
        Example_7();
        Example_8();
        Example_9();
    }
    private static void Example_1() {
        System.out.println("Задание 1");
        double operand1=0, operand2=0, result=0;
        System.out.print("Введите первый операнд:");
        operand1=scanner.nextDouble();
        System.out.println(operand1);
        System.out.print("Введите второй операнд:");
        operand2=scanner.nextDouble();
        System.out.println(operand2);
        if (operand2 == 0)
            System.out.println("Делитель не должен быть равен 0!");
        else {
            result = operand1/operand2;
            System.out.println("Результат = " + result);
        }
    }
    private static void Example_2() {
        System.out.println("Задание 2");
        double data=1794,  answer=0;
        System.out.println("В каком году была основана Одесса?");
        answer = scanner.nextDouble();

        if (answer == data) {
            System.out.println("Правильно, Одесса была основана в 1794");
        }
        else {
            System.out.println("Вы ошиблись! Одесса была основана в 1794");
        }
    }
    private static void Example_3(){
        System.out.println("Задание 3");
        double value=0, discount =0, sum=0;
        System.out.println("Вычисление стоимости покупки с учтом скидки:");
        value = scanner.nextDouble();
        if ( value>1000)
            discount=5;
        else if (value>500)
                discount=3;
            else
                discount=0;
        sum=value-value*discount/100;
        System.out.println("Вам предоставляется скидка в размере = " + discount +"%");
        System.out.println("Cумма с учетом скидки = " + sum + "руб");
    }
    private static void Example_4(){
        System.out.println("Задание 4");
        int a=0;
        System.out.println("Введите число:");
        a= scanner.nextInt();
        if (a % 2==0)
            System.out.println("Число "+a+" четное");
        else
            System.out.println("Число "+a+" не четное");
    }
    private static void Example_5(){
        System.out.println("Задание 5");
        int a=0;
        System.out.println("Введите число:");
        a= scanner.nextInt();
        if (a % 3==0)
            System.out.println("Число "+a+" делиться нацело на 3");
        else
            System.out.println("Число "+a+" не делиться нацело на 3");
    }
    private static void Example_6(){
        System.out.println("Задание 6");
        System.out.println("Вычисление стоимости разговора по телефону");
        System.out.println("Введите исходные данные: ");
        System.out.print("Длительность разговора(целое количество минут): ");
        int min=scanner.nextInt();
        System.out.print("День недели: (1 - понедельник, ... 7 - воскресение): ");
        int day=scanner.nextInt();
        int discount=0;
        double sum=0;
        switch (day){
            case 1:
                discount=0;
                break;
            case 2:
                discount=0;
                break;
            case 3:
                discount=0;
                break;
            case 4:
                discount=0;
                break;
            case 5:
                discount=0;
                break;
            case 6:
                discount=20;
                break;
            case 7:
                discount=20;
                break;
            default:
                System.out.println("Вы ввели несуществующий день недели.");
                break;
        }
        sum = (2.3 * min) - (2.3*min*discount)/100;
        System.out.println("Предоставляеться скидка: " +discount+" %");
        System.out.print(" Стоимость разговора: ");
        System.out.printf("%.2f", sum);

    }
    private static void Example_7(){
        System.out.println("Задание 7");
        int  hundreds = 0, decimals = 0, ones = 0;
        System.out.print("Введите трехзначное число: ");
        int number=scanner.nextInt();
        ones            = number / 1 % 10;
        decimals        = number / 10 % 10;
        hundreds        = number / 100 % 10;
        if (hundreds>ones)
            System.out.println("Первая больше чем последняя");
        else if(hundreds<ones)
            System.out.println("Последняя больше чем первая");
        else System.out.println("Цыфры равны");
        if (hundreds>decimals)
            System.out.println("Первая больше чем вторая");
        else if(hundreds<decimals)
            System.out.println("Вторая больше чем первая");
        else System.out.println("Цыфры равны");
        if (decimals>ones)
            System.out.println("Вторая больше чем последняя");
        else if(decimals<ones)
            System.out.println("Вторая больше чем последняя");
        else System.out.println("Цыфры равны");
    }
    private static void Example_8(){
        System.out.println("Задание 8");
        int  hundreds = 0, decimals = 0, ones = 0;
        System.out.print("Введите трехзначное число: ");
        int number=scanner.nextInt();
        ones            = number / 1 % 10;
        decimals        = number / 10 % 10;
        hundreds        = number / 100 % 10;
        number = number * number;
        ones = (int) Math.pow(ones, 3);
        hundreds = (int) Math.pow(hundreds, 3);
        decimals = (int) Math.pow(decimals, 3);
        if (number==(ones+hundreds+decimals))
            System.out.println("Квадрат этого числа равен сумме кубов его цифр");
        else System.out.println("Квадрат этого числа не равен сумме кубов его цифр");
    }
    private static void Example_9(){
        System.out.println("Задание 9");
        double t, x = 5, y = 3;

        if (x < y)
        {
            t = x;
            x = (x+y)/2;
            y = 2 * t * y;
        }
        else
        if (x > y)
        {
            t = y;
            y = (x+y)/2;
            x = 2 * x * t;
        }
        System.out.println("x = "+ x+ " y = "+y );
    }


}