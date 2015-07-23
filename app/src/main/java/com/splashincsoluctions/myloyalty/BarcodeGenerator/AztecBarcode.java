package com.splashincsoluctions.myloyalty.BarcodeGenerator;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.aztec.AztecWriter;
import com.google.zxing.common.BitMatrix;

/**
 * Created by Brendan on 23/07/2015.
 */
public class AztecBarcode extends ABarcode {

    public AztecBarcode(String content) {
        super(content);
    }

    @Override
    public Bitmap GetBarcode(int width, int height) {
        AztecWriter writer = new AztecWriter();
        BitMatrix bm = null;
        Bitmap bitmap = null;
        try {
            bm = writer.encode(content, BarcodeFormat.AZTEC, width, height);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (bm != null) {
            bitmap = ProduceBarcode(bm, width, height);
        }
        return bitmap;
    }
}
