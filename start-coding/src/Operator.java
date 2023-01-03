public class Operator {
    public static void main(String[] args) {
        // int, short, long
        // float, double
        // boolean
        // byte
        // char, String

        // 대입연산자
        int intX = 90;
        intX += 80;
        System.out.println(intX);
        intX = 9;
        System.out.println(intX);

        // 산술연산자
        // 용어에 민감할 필요가?;
        int valueA = 100;
        int valueB = 30;
        int plus = valueA + valueB;
        System.out.println(plus);
        int multi = valueA * valueB;
        System.out.println(multi);
        int minus = valueA - valueB;
        System.out.println(minus);
        int divide = valueA / valueB;
        System.out.println(divide);
        int remain = valueA % valueB;
        System.out.println(remain);

        // 중감연산자
        int increaseNum = 0;
        increaseNum++;
        System.out.println(increaseNum);
        ++increaseNum;
        System.out.println(increaseNum);

        int decreaseNum = 0;
        decreaseNum++;
        System.out.println(decreaseNum);
        ++decreaseNum;
        System.out.println(decreaseNum);

        // 비교연산자
        boolean isGreater = 5 < 6;
        System.out.println(isGreater);
        // 순서 : = 가장 마지막에 실행,
        boolean isEqual = 5 == 6;
        System.out.println(isEqual);

        // 논리 연산자
    }
}
