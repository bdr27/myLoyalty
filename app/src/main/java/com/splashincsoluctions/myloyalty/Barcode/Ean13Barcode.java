package com.splashincsoluctions.myloyalty.Barcode;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.oned.EAN13Writer;

/**
 * Created by Brendan on 22/07/2015.
 */
public class Ean13Barcode extends ABarcode {
    public Ean13Barcode(String content){
        super(content);
    }

    @Override
    public Bitmap GetBarcode(int width, int height) {
        return ZXingProduceBarcode(new EAN13Writer(), BarcodeFormat.EAN_13, width, height);
    }
}
