package com.splashincsolutions.myloyalty.BardcodeGenerator;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.oned.Code39Writer;

/**
 * Created by Brendan on 22/07/2015.
 */
public class C39Barcode extends ABarcode {

    public C39Barcode(String content){
        super(content);
    }

    @Override
    public Bitmap GetBarcode(int width, int height){
        return ZXingProduceBarcode(new Code39Writer(), BarcodeFormat.CODE_39, width, height);
    }
}
