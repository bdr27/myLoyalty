package com.splashincsolutions.myloyalty.BardcodeGenerator;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.oned.EAN8Writer;

/**
 * Created by Brendan on 22/07/2015.
 */
public class Ean8Barcode extends ABarcode {
    public Ean8Barcode(String content){
        super(content);
    }

    @Override
    public Bitmap GetBarcode(int width, int height) {
        return ZXingProduceBarcode(new EAN8Writer(), BarcodeFormat.EAN_8, width, height);
    }
}
