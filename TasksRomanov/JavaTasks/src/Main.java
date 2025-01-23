import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем scanner в main
        System.out.println("Выберите задание:");
        System.out.println("1. Задание 1");
        System.out.println("2. Задание 2");
        System.out.println("3. Задание 3");
        System.out.println("4. Задание 4");
        System.out.println("5. Задание 5");
        System.out.println("6. Задание 6");
        System.out.println("7. Задание 7");
        System.out.println("8. Задание 8");
        System.out.println("9. Задание 9");
        System.out.println("10. Задание 10");
        System.out.println("11. Задание 11");
        System.out.println("12. Задание 12");
        System.out.println("13. Задание 13");
        System.out.println("14. Задание 14");
        System.out.println("15. Задание 15");
        System.out.println("16. Задание 16");
        System.out.println("17. Задание 17");
        System.out.println("18. Задание 18");
        System.out.println("19. Задание 19");
        System.out.println("20. Задание 20");

        int taskNumber = scanner.nextInt();
        switch (taskNumber) {
            case 1: firstTask(); break;
            case 2: secondTask(); break;
            case 3: thirdTask(); break;
            case 4: fourthTask(); break;
            case 5: fifthTask(); break;
            case 6: sixthTask(); break;
            case 7: seventhTask(); break;
            case 8: eighthTask(); break;
            case 9: ninthTask(); break;
            case 10: tenthTask(); break;
            case 11: eleventhTask(); break;
            case 12: twelfthTask(); break;
            case 13: thirteenthTask(); break;
            case 14: fourteenthTask(); break;
            case 15: fifteenthTask(); break;
            case 16: sixteenthTask(); break;
            case 17: seventeenthTask(); break;
            case 18: eighteenthTask(); break;
            case 19: nineteenthTask(); break;
            case 20: twentiethTask(); break;
            default: System.out.println("Неверный номер задания!"); break;
        }
        
    }

    // Задание 1
    public static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для проверки:");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Число четное.");
        } else {
            System.out.println("Число нечетное.");
        }
        
    }

    // Задание 2
    public static void secondTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа для проверки:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b && a < c) {
            System.out.println("Наименьшее число: " + a);
        } else if (b < a && b < c) {
            System.out.println("Наименьшее число: " + b);
        } else {
            System.out.println("Наименьшее число: " + c);
        }
        
    }

    // Задание 3
    public static void thirdTask() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * 5 = " + i * 5);
        }
        
    }

    // Задание 4
    public static void fourthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);
        
    }

    // Задание 5
    public static void fifthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел для последовательности Фибоначчи:");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
        
    }

    // Задание 6
    public static void sixthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для проверки на простоту:");
        int num = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && num > 1) {
            System.out.println("Число простое.");
        } else {
            System.out.println("Число не простое.");
        }
        
    }

    // Задание 7
    public static void seventhTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для обратного отсчета:");
        int n = scanner.nextInt();
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        
    }

    // Задание 8
    public static void eighthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа для нахождения суммы чисел между ними:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел между " + a + " и " + b + " равна " + sum);
        
    }

    // Задание 9
    public static void ninthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Перевернутая строка: " + reversed);
        
    }

    // Задание 10
    public static void tenthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nДесятое задание");
        System.out.println("Введите число:");
        String number = scanner.nextLine();
        System.out.println("Колчество цифр в числе: " + number.length());
    }

    // Задание 11
    public static void eleventhTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для вычисления факториала:");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + num + " равен " + factorial);
        
    }

    // Задание 12
    public static void twelfthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nДвенадцатое задание");
        System.out.println("Введите число:");
        scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        System.out.println("Сумма цифр числа " + number + " равна " + sum);
    }

    // Задание 13
    public static void thirteenthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nТринадцатое задание");
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        if (result.equals(str)){
            System.out.println("Введённая строка является палиндромом");
        }else {
            System.out.println("Введённая строка не является палиндромом");
        }
    }

    // Задание 14
    public static void fourteenthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЧетырнадцатое задание");
        System.out.println("Введите размер массива:");
        int mas_len = scanner.nextInt();
        System.out.println("Введите элементы массива:");
        int [] mas = new int[mas_len];
        for (int i = 0; i < mas_len; i++) {
            mas[i] = scanner.nextInt();
        }
        int mas_max = 0;
        for (int i = 0; i < mas_len; i++) {
            if(mas[i] > mas_max){
                mas_max = mas[i];
            }
        }
        System.out.println("Максимальное число массива: " + mas_max);
        
    }

    // Задание 15
    public static void fifteenthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nПятнадцатое задание");
        System.out.println("Введите размер массива:");
        int mas_len = scanner.nextInt();
        System.out.println("Введите элементы массива:");
        int [] mas = new int[mas_len];
        for (int i = 0; i < mas_len; i++) {
            mas[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < mas_len; i++) {
            sum += mas[i];
        }
        System.out.println("Сумма элементов массива равна " + sum);
        
    }

    // Задание 16
    public static void sixteenthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nШестнадцатое задание");
        System.out.println("Введите размер массива:");
        int mas_len = scanner.nextInt();
        System.out.println("Введите элементы массива:");
        int [] mas = new int[mas_len];
        for (int i = 0; i < mas_len; i++) {
            mas[i] = scanner.nextInt();
        }
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < mas_len; i++) {
            if(mas[i] >= 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.println("В массиве " + positive + " положительных чисел и " + negative + " отрицательных");
        
    }

    // Задание 17
    public static void seventeenthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nСемнадцатое задание");
        System.out.println("Введите два числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String results = "";

        if (a < b) {
            for (int i = a; i <= b; i++) {
                boolean isSimple = true;
                for (int j = 2; j < i; j++) {
                    if(i % j == 0){
                        isSimple = false;
                        break;
                    }
                }
                if (isSimple) {
                    results += i + " ";
                }
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                boolean isSimple = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isSimple = false;
                        break;
                    }
                }
                if (isSimple) {
                    results += i + " ";
                }
            }
        }
        System.out.println("В диапазоне содержатся следующие простые числа:\n"+results);
    }

    // Задание 18
    public static void eighteenthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВосемнадцатое задание");
        System.out.println("Введите предложение:");
        char [] vowel = {'а', 'у', 'о', 'и', 'э', 'ы', 'ю', 'я', 'е', 'ё'};
        scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char letter;
        int vowels_total = 0;
        int consonant_total = 0;
        boolean isVowel;
        for (int i = 0; i < str.length(); i++) {
            isVowel = false;
            letter = str.charAt(i);
            for(char ch : vowel){
                if(letter == ch){
                    vowels_total++;
                    isVowel = true;
                    break;
                }
            }
            if(!isVowel && letter!=' '){
                consonant_total++;
            }
        }
        System.out.println("Во введённом предложении " + vowels_total + " гласных и " + consonant_total + " согласных");
    }

    // Задание 19
    public static void nineteenthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nДевятнадцатое задание");
        System.out.println("Введите предложение:");
        String str = scanner.nextLine();
        String [] str_mas = str.split(" ");
        String out = "";
        for (int i = 0; i < str_mas.length; i++) {
            out = str_mas[i] + " " + out;
        }
        System.out.println("Перевернутое предложение: " + out);
        
    }

    // Задание 20
    public static void twentiethTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nДвадцатое задание");
        String armstrong_num = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < armstrong_num.length(); i++) {
            sum += Math.pow(Character.getNumericValue(armstrong_num.charAt(i)), armstrong_num.length());
        }
        if(Integer.parseInt(armstrong_num) == sum){
            System.out.println("Является числом Армстронга");
        } else{
            System.out.println("Не является числом Армстронга");
        }
        
    }
}
