package main.java.com.zzx.switchtest;

import java.util.HashMap;
import java.util.Map;

/**
 * Java17对switch支持模式匹配
 */
public class SwitchTest {

    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();
        data.put("key1", "aaa");
        data.put("key2", 111);

//        if (data.get("key1") instanceof String) {
//            System.out.println(data.get("key1"));
//        }




    }

//    static String formatterPatternSwitch(Object o) {
//        return switch (o) {
//            case Integer i -> String.format("int %d", i);
//            case Long l    -> String.format("long %d", l);
//            case Double d  -> String.format("double %f", d);
//            case String s  -> String.format("String %s", s);
//            default        -> o.toString();
//        };
//    }
}
