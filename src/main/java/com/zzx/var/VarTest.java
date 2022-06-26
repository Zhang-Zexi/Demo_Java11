package main.java.com.zzx.var;

import java.util.ArrayList;
import java.util.List;

public class VarTest {

    public static void main(String[] args) {
        int a1 = 1;
        var a2 = 1;
        System.out.println(a1);
        System.out.println(a2);
        String a3 = "zzx";
        var a4 = "zzx";
        System.out.println(a3);
        System.out.println(a4);
        List a5 = new ArrayList<>();
        a5.add("1");
        a5.add("2");
        var a6 = a5;
        System.out.println(a6);
        var i = change();
        System.out.println(i);

    }

    private static int change() {
        return 2;
    }
}
