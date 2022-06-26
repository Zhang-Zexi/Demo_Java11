package main.java.com.zzx.api;

/**
 * Java11 api增强
 */
public class ApiTest {

    public static void main(String[] args) {
//        " ".isBlank(); // true
        // 判断字符串是否为空白
        System.out.println(" ".isBlank());
//        " Hello Java11 ".strip(); // "Hello Java11"
        // 去除首尾空格
        System.out.println(" Hello Java11 ".strip());
//        " Hello Java11 ".stripTrailing(); // " Hello Java11"
        // 去除尾部空格
        System.out.println(" Hello Java11 ".stripTrailing());
//        " Hello Java11 ".stripLeading(); // "Hello Java11 "
        // 去除首部空格
        System.out.println(" Hello Java11 ".stripLeading());
//        "Java11".repeat(3); // "Java11Java11Java11"
        // 复制字符串
        System.out.println("Java11".repeat(3));
//        "AnBnC".lines().count(); // 3
        // 行数统计
        System.out.println("AnBnC".lines().count());
    }
}
