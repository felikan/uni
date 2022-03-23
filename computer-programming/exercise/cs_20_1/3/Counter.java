package cs20_1_3;

public class Counter extends java.lang.Object {

    private int result = 0;

    public int getResult() {

        return this.result;
    }

    public void count() {

        for (int i = 0; i < 100; i++) {

            this.result += i + 1;
        }
    }
}
