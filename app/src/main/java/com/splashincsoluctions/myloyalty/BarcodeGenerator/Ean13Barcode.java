package com.splashincsoluctions.myloyalty.BarcodeGenerator;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.oned.EAN13Writer;

/**
 * Created by Brendan on 22/07/2015.
 */
public class Ean13Barcode extends ABarcode {
    public Ean13Barcode(String content){
        super(content);
    }

    @Override
    public Bitmap GetBarcode(int width, int height) {
        /*EAN13Writer writer = new EAN13Writer();
        BitMatrix bm = null;
        Bitmap bitmap = null;
        try {
            bm = writer.encode(content, BarcodeFormat.EAN_13, width, height);
        } catch (WriterException e) {
            e.printStackTrace();
        }

        if(bm != null) {
            bitmap = ProduceBarcode(bm, width, height);
        }
        return bitmap;*/

        return ProduceBarcode(new EAN13Writer(), BarcodeFormat.EAN_13, width, height);
    }
}
