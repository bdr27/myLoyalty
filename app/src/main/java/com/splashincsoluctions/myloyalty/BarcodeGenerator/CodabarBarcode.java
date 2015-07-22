package com.splashincsoluctions.myloyalty.BarcodeGenerator;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.CodaBarWriter;

/**
 * Created by Brendan on 22/07/2015.
 */
public class CodabarBarcode extends ABarcode {
    public CodabarBarcode(String content){
        super(content);
    }

    @Override
    public Bitmap GetBarcode(int width, int height) {
        CodaBarWriter writer = new CodaBarWriter();
        BitMatrix bm = null;
        Bitmap bitmap = null;
        try {
            bm = writer.encode(content, BarcodeFormat.CODABAR, width, height);
        } catch (WriterException e) {
            e.printStackTrace();
        }

        if(bm != null) {
            bitmap = ProduceBarcode(bm, width, height);
        }
        return bitmap;
    }


}
