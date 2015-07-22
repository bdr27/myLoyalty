package com.splashincsoluctions.myloyalty.BarcodeGenerator;

/**
 * Created by Brendan on 22/07/2015.
 */
public abstract class ABarcode {
    private String format;
    private String content;

    public ABarcode(String format, String content){
        this.format = format;
        this.content = content;
    }
}
