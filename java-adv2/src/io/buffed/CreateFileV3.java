package io.buffed;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static io.buffed.BuffedConst.*;

public class CreateFileV3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < FILE_SIZE; i++) {
            bos.write(1);
        }
        bos.close(); // bos.flush(), fos.close() 까지 연쇄적으로 호출됨.

        long endTime = System.currentTimeMillis();
        System.out.println("File created : " + FILE_NAME);
        System.out.println("File size : " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("Time taken : " + (endTime - startTime) + "ms");
    }

    /*

    - BufferedOutputStream 은 내부에서 단순히 버퍼 기능만 제공.
    - 따라서 반드시 대상 OutputStream 이 있어야함.

    - 코드를 보면 버퍼를 위한 byte[] 을 직접 다루지 않고, 마치 CreateFileV1 과 같이 단순하게 코드작성 가능.

    - CreateFileV2 보다는 다소 떨어짐.

     */
}
