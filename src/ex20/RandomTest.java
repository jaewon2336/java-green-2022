package ex20;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random(); // 새로운 난수 발생기 객체를 생성한다.

        byte[] bytes = new byte[10];
        random.nextBytes(bytes); // byte형의 난수를 발생하여서 주어진 배열을 채운다.

        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        int i = 5;

        boolean ranBool = random.nextBoolean(); // boolean형의 난수를 발생한다.
        System.out.println("boolean형 : " + ranBool);

        int ranInt = random.nextInt(); // 0에서 100 사이의 난수를 발생한다.
        System.out.println("int형 : " + ranInt);

        int nextInt = random.nextInt(i); // 0과 i 사이의 int형의 난수를 발생한다.
        System.out.println("0과 " + i + "사이 int형 : " + nextInt);

        double ranDouble = random.nextDouble(); // double형의 0.0과 1.0 사이의 난수를 발생한다.
        System.out.println("double형 : " + ranDouble);

        float ranFloat = random.nextFloat(); // float형의 0.0과 1.0 사이의 난수를 발생한다.
        System.out.println("flaot형 : " + ranFloat);

        long ranLong = random.nextLong(); // long형의 난수를 발생한다.
        System.out.println("long형 : " + ranLong);

    }
}
