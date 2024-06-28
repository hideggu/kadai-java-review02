
public class Review02 {

    public static void main(String[] args) {

        // iの値を設定して、0から100までカウントアップする
        for (int i = 1; i <= 100; i++) {

        // iが3と5の両方で割り切れる場合は"FizzBuzz"と表示する
        if (i % 3 == 0 && i % 5 == 0 ) {
            System.out.println("FizzBuzz");
            // iが3だけで割り切れる場合は"Fizz"と表示する
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
            // iが5だけで割り切れる場合は"Buzz"と表示する
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
            // それ以外は数字を表示する
        } else {
            System.out.println(i);
        }
        }
    }

}
