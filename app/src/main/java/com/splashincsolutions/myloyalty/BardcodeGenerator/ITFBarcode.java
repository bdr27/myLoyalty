package com.splashincsolutions.myloyalty.BardcodeGenerator;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.oned.ITFWriter;

/**
 * Created by Brendan on 22/07/2015.
 */
public class ITFBarcode extends ABarcode {
    public ITFBarcode(String content){
        super(content);
    }

    @Override
    public Bitmap GetBarcode(int width, int height) {
        return ZXingProduceBarcode(new ITFWriter(), BarcodeFormat.ITF, width, height);
    }
}
