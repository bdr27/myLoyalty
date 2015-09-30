package com.splashincsoluctions.myloyalty.Barcode;

import android.graphics.Bitmap;
import android.graphics.Color;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;

/**
 * Created by Brendan on 22/07/2015.
 */
public abstract class ABarcode {
    private String content;

    public ABarcode(String content){
        this.content = content;
    }

    public abstract Bitmap GetBarcode(int width, int height);

    protected Bitmap ZXingProduceBarcode(Writer writer, BarcodeFormat barcodeFormat, int width, int height) {
        Bitmap mBitmap = null;
        BitMatrix bm = null;

        try {
            bm = writer.encode(content, barcodeFormat, width, height);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(bm != null){
            mBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            for(int i = 0; i < width; i++){
                for(int j = 0; j < height; j++){
                    mBitmap.setPixel(i, j, bm.get(i,j) ? Color.BLACK : Color.WHITE);
                }
            }
        }
        return mBitmap;
    }
}
