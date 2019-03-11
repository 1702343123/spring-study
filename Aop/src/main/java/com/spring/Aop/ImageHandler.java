package com.spring.Aop;

import cn.hutool.core.util.ImageUtil;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 * Created by Administrator on 2019/3/11.
 */
@Aspect
public class ImageHandler {
    private static final org.slf4j.Logger logger= LoggerFactory.getLogger(ImageHandler.class);
    @Pointcut("execution(* com.spring.Aop.ImageCopy.copyImage())")
    public void handleImage(){
    }
    @Before(value="handleImage()")
    public void pressTextOnImage()throws IOException{
        logger.info("开始给图片添加水印");
        File srcFile=new File("D:/bg.jpg");
        InputStream input=new FileInputStream(srcFile);
        BufferedImage srcImg= ImageIO.read(input);
        int width=srcImg.getWidth();
        int height=srcImg.getHeight();
        int size=20;
        File destFile=new File("D:/bg1.jpg");
        Color color=new Color(211,71,38);
        Font font=new Font("微软雅黑",Font.BOLD,size);
        String text="海贼王";
        ImageUtil.pressText(srcFile,destFile,text,color,font,(width-text.length()*size)/2,height/2-size,1.0f);
    }
    @AfterReturning("handleImage()")
    public void grayImage(){
        logger.info("开始将图片转成黑白");
        File srcFile=new File("E:/bg.jpg");
        File destFile=new File("E:/bg2.jpg");
        ImageUtil.gray(srcFile,destFile);
    }
}
