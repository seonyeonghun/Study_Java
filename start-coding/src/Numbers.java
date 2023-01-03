public class Numbers {
    public static void main(String[] args) {
        int intX = 1234;
        System.out.println(intX); //4 byte -21억 ~ 21억 ★

        short shortX = 23450;
        System.out.println(shortX); // 2 byte -3만2천 ~ 3만2천

        long longX = 234234234; // 8byte 엄청나게 큰수 -2^63 ~ 2^63 만큼?
        System.out.println(longX);

        // 소수점이 있는 수(부동소수점 | 실수형)
        float floatX = 2342.234f;
        System.out.println(floatX);

        double doubleX = 2423.345; // ★
        System.out.println(doubleX);
    }
}
