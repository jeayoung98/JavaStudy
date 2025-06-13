package io.start;

import java.io.IOException;
import java.io.PrintStream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class PrintStreamMain {
    public static void main(String[] args) throws IOException {
        PrintStream printStream = System.out;

        byte[] bytes = "Hello!\n".getBytes(UTF_8);
        printStream.write(bytes);
        printStream.println("Print!");

        /*

        InputStream 과 OutputStream 이 다양한 스트림들을 추상화 했을 때 장점 :

        - 일관성 : 모든 종류의 입출력 작업에 대해 동일한 인터페이스를 사용할 수 있어, 코드의 일관성이 유지됨.

        - 유연성 : 실제 데이터 소스나 목적지가 무엇인지에 관계없이 동일한 방식으로 코드를 작성할 수 있음.
        (ex : 파일, 네트워크, 메모리 등 다양한 소스에 대해 동일한 메서드를 사용할 수 있음.)

        - 확장성 : 새로운 유형의 입출력 스트림을 쉽게 추가할 수 있음.

        - 재사용성 : 다양한 스트림 클래스들을 조합하여 복잡한 입출력 작업을 수행할 수 있음.
        (ex : BuffedInputStream 을 사용하여 성능을 향상 시키거나, DataInputStream 을 사용하여 기본 데이터 타입을 쉽게 읽을 수 있음.)

        - 에러 처리 : 표준화된 예외 처리 매커니즘을 통해 일관된 방식으로 오류를 처리할 수 있음.

         */
    }
}
