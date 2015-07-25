package com.splashincsoluctions.myloyalty.BarcodeGenerator;

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
        /*QRCodeWriter writer = new QRCodeWriter();
        BitMatrix bm = null;
        Bitmap bitmap = null;
        try {
            bm = writer.encode(content, BarcodeFormat.QR_CODE, width, height);
        } catch (WriterException e) {
            e.printStackTrace();
        }

        if (bm != null) {
            bitmap = ProduceBarcode(bm, width, height);
        }
        return bitmap;*/

        return ProduceBarcode(new QRCodeWriter(), BarcodeFormat.QR_CODE, width, height);
    }
}
