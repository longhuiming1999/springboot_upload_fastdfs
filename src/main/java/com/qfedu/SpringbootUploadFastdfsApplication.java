package com.qfedu;

import com.github.tobato.fastdfs.FdfsClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackages = "com.qfedu")
@Import(FdfsClientConfig.class)
public class SpringbootUploadFastdfsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootUploadFastdfsApplication.class, args);
    }

}
