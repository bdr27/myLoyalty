package com.splashincsoluctions.myloyalty.Barcode;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
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
        return ZXingProduceBarcode(new CodaBarWriter(), BarcodeFormat.CODABAR, width, height);
    }


}
