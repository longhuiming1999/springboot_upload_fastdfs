package com.qfedu.controller;/*
 *@ClassName:TestController
 *@Author:lg
 *@Description:
 *@Date:2020/6/817:47
 */

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private FastFileStorageClient fastFileStorageClient;

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) {

        System.out.println(file == null);

        if (file != null) {
            try {
                StorePath path = fastFileStorageClient.uploadImageAndCrtThumbImage(file.getInputStream(), file.getSize(), "JPG", null);

                System.out.println("存储文件的位置: " + path.getFullPath());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "OK";
    }
}
