package com.splashincsoluctions.myloyalty.BarcodeGenerator;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.pdf417.PDF417Writer;

/**
 * Created by Brendan on 23/07/2015.
 */
public class PDF417Barcode extends ABarcode {
    public PDF417Barcode(String content) {
        super(content);
    }

    @Override
    public Bitmap GetBarcode(int width, int height) {
        return ZXingProduceBarcode(new PDF417Writer(), BarcodeFormat.PDF_417, width, height);
    }
}
