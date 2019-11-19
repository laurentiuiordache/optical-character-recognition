package com.iordaches.ocr;

import net.sourceforge.tess4j.Tesseract;

import java.io.File;

public class TextTranscriptionUsingOcr {
    private static final String PATH_TO_IMAGE = "C:\\dev\\personal-repos\\optical-character-recognition\\src\\main\\resources\\Capture.PNG";
    public static void main(String[] args) {

        try {
            Tesseract tesseract = new Tesseract();
            tesseract.setLanguage("ron");
            tesseract.setDatapath("C:\\dev\\teseract-data");


            String text = tesseract.doOCR(new File(PATH_TO_IMAGE));
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
