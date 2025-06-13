package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp/hello.dat");
        byte[] input = {65, 66, 67};
        fos.write(input);
        fos.close();

        FileInputStream fis = new FileInputStream("temp/hello.dat");
        byte[] readAllBytes = fis.readAllBytes();
        System.out.println(Arrays.toString(readAllBytes));
        fis.close();

        /*

        한번에 읽기 vs 부분으로 나눠 읽기

        read(byte[], offset, length) :
        - 스트림의 내용을 부분적으로 읽거나, 읽은 내용을 처리하면서 스트림을 계속 읽어야할 경우 적합.
        - 메모리 사용량 제어 가능.
        - 100MB 의 파일을 1MB 단위로 나눠 읽고 처리하는 방식을 사용하면 한 번에 최대 1MB의 메모리만 사용됨.

        readAllBytes() :
        - 한 번의 호출로 모든 데이터를 읽을 수 있어 편리함.
        - 작은 파일이나 메모리에 모든 내용을 올려서 처리해야 하는 경우 적합.
        - 메모리 사용량 제어 X
        - 큰 파일일 경우 OutOfMemoryError 발생할 수 있음.


         */
    }
}
