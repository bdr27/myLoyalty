package com.splashincsolutions.myloyalty.BardcodeGenerator;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.oned.Code128Writer;

/**
 * Created by Brendan on 22/07/2015.
 */
public class C128Barcode extends ABarcode {

    public C128Barcode(String content){
        super(content);
    }

    @Override
    public Bitmap GetBarcode(int width, int height) {
        /*Code128Writer writer = new Code128Writer();
        BitMatrix bm = null;
        Bitmap bitmap = null;
        try {
            bm = writer.encode(content, BarcodeFormat.CODE_128, width, height);
        } catch (WriterException e) {
            e.printStackTrace();
        }

        if(bm != null) {
            bitmap = ZXingProduceBarcode(bm, width, height);
        }
        return bitmap;*/

        return ZXingProduceBarcode(new Code128Writer(), BarcodeFormat.CODE_128, width, height);
    }
}
