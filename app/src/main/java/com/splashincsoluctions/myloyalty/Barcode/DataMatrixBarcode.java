package com.splashincsoluctions.myloyalty.Barcode;

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
        return ZXingProduceBarcode(new DataMatrixWriter(), BarcodeFormat.DATA_MATRIX, width, height);
    }
}
