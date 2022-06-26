package main.java.com.zzx.api;

import java.util.*;

/**
 * Java11 集合增强
 */
public class CollectionTest {

    public static void main(String[] args) {
        var list = List.of("Java", "Python", "C"); //不可变集合
        var copy = List.copyOf(list); //copyOf判断是否是不可变集合类型，如果是直接返回
        System.out.println(list == copy); // true

        var list2 = new ArrayList<String>(); // 这里返回正常的集合
        var copy2 = List.copyOf(list2); // 这里返回一个不可变集合
        System.out.println(list2 == copy2); // false


        var set = Set.of("Java", "Python", "C");
        var copy3 = Set.copyOf(set);
        System.out.println(set == copy3); // true

        var set1 = new HashSet<String>();
        var copy4 = List.copyOf(set1);
        System.out.println(set1 == copy4); // false


        var map = Map.of("Java", 1, "Python", 2, "C", 3);
        var copy5 = Map.copyOf(map);
        System.out.println(map == copy5); // true

        var map1 = new HashMap<String, Integer>();
        var copy6 = Map.copyOf(map1);
        System.out.println(map1 == copy6); // false


    }
}
