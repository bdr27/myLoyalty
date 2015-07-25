package com.splashincsoluctions.myloyalty.BarcodeGenerator;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.oned.ITFWriter;

/**
 * Created by Brendan on 22/07/2015.
 */
public class ITFBarcode extends ABarcode {
    public ITFBarcode(String content){
        super(content);
    }

    @Override
    public Bitmap GetBarcode(int width, int height) {
        /*ITFWriter writer = new ITFWriter();
        BitMatrix bm = null;
        Bitmap bitmap = null;
        try {
            bm = writer.encode(content, BarcodeFormat.ITF, width, height);
        } catch (WriterException e) {
            e.printStackTrace();
        }

        if(bm != null) {
            bitmap = ProduceBarcode(bm, width, height);
        }
        return bitmap;*/

        return ProduceBarcode(new ITFWriter(), BarcodeFormat.ITF, width, height);
    }
}
