import com.heima.file.service.FileStorageService;
import com.heima.MinIOApplication;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import io.minio.errors.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @Project: heima-leadnews
 * @Package: PACKAGE_NAME
 * @ClassName: MinIOTest
 * @Description: TODO
 * @Author: xueyujiao
 * @Date: 2024/3/18
 * @Version 1.0
 */
@SpringBootTest(classes = MinIOApplication.class)
@RunWith(SpringRunner.class)
public class MinIOTest {

    @Resource
    FileStorageService fileStorageService;

    @Test
    public void T(){
        // 集成 fileStarter
//        try {
//            FileInputStream fileInputStream = new FileInputStream("F://html.txt");
//            String s = fileStorageService.uploadHtmlFile("", "list.html", fileInputStream);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        System.out.println("123");
    }
    @Test
    public void T1(){
        try {
            FileInputStream fileInputStream = new FileInputStream("F://html.txt");


            // 获取minio的连接信息，创建一个minio客户端
            MinioClient build =
                    MinioClient.builder()
                            .credentials("xueyujiao", "Xue233201!")
                            .endpoint("http://localhost:9000").build();
            // 上传
            PutObjectArgs putObjectArgs =
                    PutObjectArgs.builder().object("html") // 文件名称
                            .contentType("txt") // 文件类型
                            .bucket("leadnews") // 桶的名称
                            .stream(fileInputStream, fileInputStream.available(),-1)
                            .build();
            build.putObject(putObjectArgs);

            // 访问路径
            System.out.println("http://localhost:9000/leadnews/html.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ErrorResponseException e) {
            e.printStackTrace();
        } catch (InsufficientDataException e) {
            e.printStackTrace();
        } catch (InternalException e) {
            e.printStackTrace();
        } catch (InvalidBucketNameException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidResponseException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (XmlParserException e) {
            e.printStackTrace();
        }

    }
}
