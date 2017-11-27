package intellij;

import java.util.Arrays;

/**
 * Stream Debugger plugin 을 시험해보는 샘플 클래스 입니다.
 * 1. Java sdk 1.8
 * 2. plugins > install JetBrains plugins > Java stream debugger
 * 3. add mark for debug
 * 4. debug StreamDebuggerSample.main()
 * 5. alt + o
 */
public class StreamDebuggerSample {
    public static void main(String[] args) {
        int[] result =              // <- debug mark here
                Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10})
                        .filter(value -> value < 7)
                        .map(value -> value + 3)
                        .map(value -> value * -1)
                        .sorted()
                        .toArray();
        System.out.println(Arrays.toString(result));
    }
}
