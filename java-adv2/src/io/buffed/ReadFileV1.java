package io.buffed;

import java.io.FileInputStream;
import java.io.IOException;

import static io.buffed.BuffedConst.FILE_NAME;

public class ReadFileV1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();

        int fileSize = 0;
        int data;
        while ((data = fis.read()) != -1) {
            fileSize++;
        }

        fis.close();

        long endTime = System.currentTimeMillis();
        System.out.println("File created : " + FILE_NAME);
        System.out.println("File size : " + fileSize / 1024 / 1024 + "MB");
        System.out.println("Time taken : " + (endTime - startTime) + "ms");
    }

    /*

    10MB 파일 하나 쓰는데 오래 걸리는 이유 :

    - 자바에서 1byte 씩 디스크에 데이터를 전달하기 때문.

    - write() 나 read()를 호출할 때마다 OS의 시스템 콜을 통해 파일을 읽거나 쓰는 명령어를 전달.
    (이런 시스템 콜은 상대적으로 무거운 작업)

    - HDD, SDD 같은 장치들도 하나의 데이터를 읽고 쓸 때마다 필요한 시간이 있음. HDD의 경우 더욱 느린데, 물맂거으로 디스크의 회전이 필요.

     */
}
