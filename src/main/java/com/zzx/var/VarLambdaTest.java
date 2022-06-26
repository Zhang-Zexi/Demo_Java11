package main.java.com.zzx.var;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * var在lambda中的使用
 */
public class VarLambdaTest {

    public static void main(String[] args) {
        Consumer<String> Consumer  = (String i) -> System.out.println(i);
//        Consumer<String> Consumer  = (var i) -> System.out.println(i);
        List arrList = new ArrayList();
        arrList.add(1);
        arrList.add(2);
        arrList.stream().forEach(i -> {
//            var a = 1;
            var b = i;
            System.out.println(i);
        });
    }
}
