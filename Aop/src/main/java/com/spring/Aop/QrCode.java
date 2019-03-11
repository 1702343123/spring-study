package com.spring.Aop;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

/**
 * Created by Administrator on 2019/3/11.
 */
public class QrCode {
    public static void main(String[] args) {
        QrConfig config = new QrConfig(300, 300);
        config.setImg("D:/lufei04.jpg");
        // 设置边距，既二维码和背景之间的边距
        config.setMargin(3);
        // 设置前景色，既二维码颜色（青色）
        config.setForeColor(Color.CYAN.getRGB());
        // 设置背景色（灰色）
        config.setBackColor(Color.GRAY.getRGB());
        // 生成二维码到文件，也可以到流
        QrCodeUtil.generate("https://www.jianshu.com/u/ec5ebfec0565",config, FileUtil.file("d:/my_code.jpg"));
    }

}
