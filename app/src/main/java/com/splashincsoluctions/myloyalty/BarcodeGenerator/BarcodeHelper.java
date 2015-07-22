package com.splashincsoluctions.myloyalty.BarcodeGenerator;

/**
 * Created by Brendan on 22/07/2015.
 */
public class BarcodeHelper {
    public static ABarcode GetBarcode(String format, String content)
    {
        ABarcode bc = null;
        switch (format){
            case "CODE_39":
                bc = new C39Barcode(content);
                break;
            case "CODE_128":
                bc = new C128Barcode(content);
                break;
        }
        return bc;
    }
}
