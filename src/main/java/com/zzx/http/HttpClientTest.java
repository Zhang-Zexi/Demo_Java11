package main.java.com.zzx.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * HttpClient示例
 */
public class HttpClientTest {

    public static void main(String[] args) {
        var request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.baidu.com/"))
                .build();
        var client = HttpClient.newHttpClient();
        // 同步
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(response.body());

        // 异步
        CompletableFuture<HttpResponse<String>> sendAsync = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        //这里会阻塞
        HttpResponse<String> response1 = null;
        try {
            response1 = sendAsync.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(response1.body());

    }
}
