package main.java.com.zzx.var;

/**
 * var循环中定义局部变量
 */
public class VarForeachTest {

    public static void main(String[] args) {
        for (var i = 0; i < 5 ; i++) {
            System.out.println(i);
        }
    }
}
