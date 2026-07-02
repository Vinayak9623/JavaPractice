package map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapFailDemo {

    static Map<Integer, String> map = new ConcurrentHashMap<>();

    public static void main(String[] args) throws Exception {

        // Pre-fill map so iteration definitely happens
        for (int i = 1; i <= 5; i++) {
            map.put(i, "Initial-" + i);
        }

        Thread reader = new Thread(() -> {
            try {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    System.out.println("Reader: " + entry);
                    sleep(200);
                }
            } catch (Exception e) {
                System.out.println("⚠️ Exception: " + e);
            }
        });

        Thread writer = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                sleep(100);
                map.put(i, "New-" + i);
                System.out.println("Writer added: " + i);
            }
        });

        reader.start();
        writer.start();
    }

    static void sleep(int ms) {
        try { Thread.sleep(ms); } catch (Exception e) {}
    }
}