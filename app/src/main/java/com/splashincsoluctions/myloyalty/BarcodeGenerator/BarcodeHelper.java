package com.splashincsoluctions.myloyalty.BarcodeGenerator;

/**
 * Created by Brendan on 22/07/2015.
 */
public class BarcodeHelper {
    public static ABarcode GetBarcode(String format, String content)
    {
        ABarcode bc = null;
        switch (format.toUpperCase()){
            case "AZTEC":
                bc = new AztecBarcode(content);
                break;
            case "CODE_39":
                bc = new C39Barcode(content);
                break;
            case "CODE_128":
                bc = new C128Barcode(content);
                break;
            case "CODABAR":
                bc = new CodabarBarcode(content);
                break;
            case "DATA_MATRIX":
                bc = new DataMatrixBarcode(content);
                break;
            case "EAN_8":
                bc = new Ean8Barcode(content);
                break;
            case "EAN_13":
                bc = new Ean13Barcode(content);
                break;
            case "ITF":
                bc = new ITFBarcode(content);
                break;
            case "QR_CODE":
                bc = new QRBarcode(content);
                break;
        }
        return bc;
    }
}
