package com.splashincsoluctions.myloyalty.BarcodeGenerator;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
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
        PDF417Writer writer = new PDF417Writer();
        BitMatrix bm = null;
        Bitmap bitmap = null;
        try {
            bm = writer.encode(content, BarcodeFormat.PDF_417, width, height);
        } catch (WriterException e) {
            e.printStackTrace();
        }

        if (bm != null) {
            bitmap = ProduceBarcode(bm, width, height);
        }
        return bitmap;
    }
}
