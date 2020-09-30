package com.fragment.use.vegetables.util.img;

import net.coobird.thumbnailator.Thumbnails;

import java.io.IOException;

public class ImageTest {

    public static void main(String[] args) throws IOException {
        Thumbnails.of("D:\\J-USER\\desktop7\\test\\java.jpg").size(300, 210).
                toFile("D:\\J-USER\\desktop7\\test\\javas.jpg");
        /*
         * size(width,height) 若图片横比200小，高比300小，不变
         * 若图片横比200小，高比300大，高缩小到300，图片比例不变 若图片横比200大，高比300小，横缩小到200，图片比例不变
         * 若图片横比200大，高比300大，图片按比例缩小，横为200或高为300         */
       /* Thumbnails.of("images/test.jpg").size(200, 300).toFile("C:/image_200x300.jpg");
        Thumbnails.of("images/test.jpg").size(2560, 2048).toFile("C:/image_2560x2048.jpg");*/
    }
}
