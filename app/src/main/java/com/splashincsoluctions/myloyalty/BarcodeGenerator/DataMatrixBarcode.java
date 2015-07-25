package com.splashincsoluctions.myloyalty.BarcodeGenerator;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.datamatrix.DataMatrixWriter;

/**
 * Created by Brendan on 23/07/2015.
 */
public class DataMatrixBarcode extends ABarcode {
    public DataMatrixBarcode(String content) {
        super(content);
    }

    @Override
    public Bitmap GetBarcode(int width, int height) {
        /*DataMatrixWriter writer = new DataMatrixWriter();
        BitMatrix bm = null;
        Bitmap bitmap = null;
        try {
            bm = writer.encode(content, BarcodeFormat.DATA_MATRIX, width, height);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (bm != null) {
            bitmap = ProduceBarcode(bm, width, height);
        }
        return bitmap;*/
        return ProduceBarcode(new DataMatrixWriter(), BarcodeFormat.DATA_MATRIX, width, height);
    }
}
