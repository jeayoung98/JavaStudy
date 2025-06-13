package io.buffed;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import static io.buffed.BuffedConst.BUFFER_SIZE;
import static io.buffed.BuffedConst.FILE_NAME;

public class ReadFileV3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        BufferedInputStream bis = new BufferedInputStream(fis, BUFFER_SIZE);
        long startTime = System.currentTimeMillis();

        int fileSize = 0;
        int data;
        while ((data = bis.read()) != -1) {
            fileSize++;
        }

        bis.close();

        long endTime = System.currentTimeMillis();
        System.out.println("File created : " + FILE_NAME);
        System.out.println("File size : " + fileSize / 1024 / 1024 + "MB");
        System.out.println("Time taken : " + (endTime - startTime) + "ms");
    }

    /*

    - BufferedInputStream 은 버퍼의 크기만큼 데이터를 미리 읽어서 버퍼에 보관.
    - 따라서 read() 를 통해 1byte 씩 데이터를 조회해도, 성능이 최적화 됨.

    버퍼를 직접 다루는 것 보다 Buffed~ 의 성능이 떨어지는 이유 :
    - 동기화 때문.
    - Buffered~ 클래스는 모두 동기화 처리가 되어있음.
    - 결과적으로 락을 걸고 푸는 코드가 호출되기 때문.

     */
}
