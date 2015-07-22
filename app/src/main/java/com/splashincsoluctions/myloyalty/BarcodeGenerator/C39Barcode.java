package com.splashincsoluctions.myloyalty.BarcodeGenerator;

import android.graphics.Bitmap;
import android.graphics.Color;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code39Writer;

/**
 * Created by Brendan on 22/07/2015.
 */
public class C39Barcode extends ABarcode {

    public C39Barcode(String content){
        super(content);
    }

    @Override
    public Bitmap GetBarcode(int width, int height){
        Code39Writer writer = new Code39Writer();
        BitMatrix bm = null;
        Bitmap bitmap = null;
        try {
            bm = writer.encode(content, BarcodeFormat.CODE_39, width, height);
        } catch (WriterException e) {
            e.printStackTrace();
        }

        if(bm != null) {
            bitmap = ProduceBarcode(bm, width, height);
        }
        return bitmap;
    }
}
