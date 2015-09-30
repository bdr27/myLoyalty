package com.splashincsoluctions.myloyalty.Barcode;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.qrcode.QRCodeWriter;

/**
 * Created by Brendan on 23/07/2015.
 */
public class QRBarcode extends ABarcode {

    public QRBarcode(String content) {
        super(content);
    }

    @Override
    public Bitmap GetBarcode(int width, int height) {
        return ZXingProduceBarcode(new QRCodeWriter(), BarcodeFormat.QR_CODE, width, height);
    }
}
