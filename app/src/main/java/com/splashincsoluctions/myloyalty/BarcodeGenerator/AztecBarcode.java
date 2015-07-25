package com.splashincsoluctions.myloyalty.BarcodeGenerator;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.aztec.AztecWriter;

/**
 * Created by Brendan on 23/07/2015.
 */
public class AztecBarcode extends ABarcode {

    public AztecBarcode(String content) {
        super(content);
    }

    @Override
    public Bitmap GetBarcode(int width, int height) {
        return ProduceBarcode(new AztecWriter(), BarcodeFormat.AZTEC, width, height);
    }
}
