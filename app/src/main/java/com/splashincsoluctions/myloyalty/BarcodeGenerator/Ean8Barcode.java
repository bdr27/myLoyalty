package com.splashincsoluctions.myloyalty.BarcodeGenerator;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.oned.EAN8Writer;

/**
 * Created by Brendan on 22/07/2015.
 */
public class Ean8Barcode extends ABarcode {
    public Ean8Barcode(String content){
        super(content);
    }

    @Override
    public Bitmap GetBarcode(int width, int height) {
        /*EAN8Writer writer = new EAN8Writer();
        BitMatrix bm = null;
        Bitmap bitmap = null;
        try {
            bm = writer.encode(content, BarcodeFormat.EAN_8, width, height);
        } catch (WriterException e) {
            e.printStackTrace();
        }

        if(bm != null) {
            bitmap = ProduceBarcode(bm, width, height);
        }
        return bitmap;*/

        return ProduceBarcode(new EAN8Writer(), BarcodeFormat.EAN_8, width, height);
    }
}
