package com.xworkz.imageupload.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
@RequestMapping("/")
public class ImageController {

    public ImageController()
    {
        System.out.println("Created ImageController");
    }

    @PostMapping("upload-file")
    public String uploadImage(@RequestParam MultipartFile file) throws IOException {
        System.out.println("Image upload");
        System.out.println("file getName :" +file.getName());
        System.out.println("file getSize :" +file.getSize());
        System.out.println("file getContentType : " +file.getContentType());
        System.out.println("file getResource :" +file.getResource());
        System.out.println("file getBytes: " +file.getBytes());
        System.out.println("file getOriginalFilename " +file.getOriginalFilename());



        byte[] bytes=file.getBytes();
        Path path= Paths.get("C:\\Users\\kavya\\image",file.getOriginalFilename());
        Files.write(path,bytes);

        System.out.println("fileName:"+file.getOriginalFilename()+"ContentType:"+file.getContentType());
        return "ContactForm";

    }

    @GetMapping("download")
    public void download(HttpServletResponse response,@RequestParam String fileName)
    {
        System.out.println("Running download method...");
        response.setContentType("image/jpeg");
        File file=new File("C:\\Users\\kavya\\image\\"+fileName);
        try {
            InputStream buffer=new BufferedInputStream(new FileInputStream(file));
            ServletOutputStream outputStream =response.getOutputStream();
            IOUtils.copy(buffer,outputStream);
            response.flushBuffer();
        } catch (AccessDeniedException e) {
            System.err.println("Access denied: " + e.getMessage());
        }catch (IOException e) {
            e.printStackTrace();

            //throw new RuntimeException(e);
        }

    }

}