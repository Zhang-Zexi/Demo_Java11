package main.java.com.zzx.api;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Stream增强
 */
public class StreamTest {

    public static void main(String[] args) {
        // 此方法可以接收null来创建一个空流
//        Stream.of(null); //报错
//        Stream.ofNullable(null);

        // 此方法根据Predicate接口来判断如果为true就 取出 来生成一个新的流,只要碰到false就终止，不管后边的元素是否符合条件。
//        Stream<Integer> integerStream = Stream.of(6, 10, 11, 15, 20);
//        Stream<Integer> takeWhile = integerStream.takeWhile(t -> t % 2 == 0);
//        takeWhile.forEach(System.out::println); // 6,10

        // 此方法根据Predicate接口来判断如果为true就 丢弃 来生成一个新的流,只要碰到false就终止，不管后边的元素是否符合条件。
//        Stream<Integer> integerStream = Stream.of(6, 10, 11, 15, 20);
//        Stream<Integer> takeWhile = integerStream.dropWhile(t -> t % 2 == 0);
//        takeWhile.forEach(System.out::println); //11,15,20

//        // iterate重载
//        // 以前使用iterate方法生成无限流需要配合limit进行截断
//        Stream<Integer> limit = Stream.iterate(1, i -> i + 1).limit(5);
//        limit.forEach(System.out::println); //1,2,3,4,5
//        // 现在重载后这个方法增加了个判断参数
//        Stream<Integer> iterate = Stream.iterate(1, i -> i <= 5, i -> i + 1);
//        iterate.forEach(System.out::println); //1,2,3,4,5

        // Optional增强
        //返回Optional值的流
//        Stream<String> stream = Optional.of("Java 11").stream();
//        stream.forEach(System.out::println); // Java 11
        //返回空流
//        Stream<Object> stream = Optional.ofNullable(null).stream();
//        stream.forEach(System.out::println); //


////        个人感觉这个方法就是结合isPresent()对Else的增强，ifPresentOrElse 方法的用途是，如果一个 Optional 包含值，则对其包含的值调用函数 action，即 action.accept(value)，这与 ifPresent 一致；与 ifPresent 方法的区别在于，ifPresentOrElse 还有第二个参数 emptyAction —— 如果 Optional 不包含值，那么 ifPresentOrElse 便会调用 emptyAction，即 emptyAction.run()。
//        Optional<Integer> optional = Optional.of(1);
//        optional.ifPresentOrElse( x -> System.out.println("Value: " + x),() ->
//                System.out.println("Not Present.")); //Value: 1
//        optional = Optional.empty();
//        optional.ifPresentOrElse( x -> System.out.println("Value: " + x),() ->
//                System.out.println("Not Present.")); //Not Present.

        Optional<String> optional1 = Optional.of("Java");
        Supplier<Optional<String>> supplierString = () -> Optional.of("Not Present");
        optional1 = optional1.or( supplierString);
        optional1.ifPresent( x -> System.out.println("Value: " + x)); //Value: Java

        optional1 = Optional.empty();
        optional1 = optional1.or( supplierString);
        optional1.ifPresent( x -> System.out.println("Value: " + x)); //Value: Not Present


    }

}
