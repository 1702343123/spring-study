package com.spring.Aop;

import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2019/3/11.
 */
public class ImageCopy {
    private static final org.slf4j.Logger logger= LoggerFactory.getLogger(ImageCopy.class);
    public void copyImage() throws  IOException{
        logger.info("开始将图片从D盘复制到E盘。。。");
        File srcFile = new File("D:/bg.jpg");
        File destFile=new File("E:/bg.jpg");
        InputStream in=new FileInputStream(srcFile);
        OutputStream out=new FileOutputStream(destFile);
        byte[] bytes=new byte[(int) srcFile.length()];
        int len;
        while((len=in.read(bytes))!=-1){
            out.write(bytes,0,len);
        }
        in.close();
        out.close();
    }

}
