package com.splashincsoluctions.myloyalty.BarcodeGenerator;

import android.graphics.Bitmap;
import android.graphics.Color;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

/**
 * Created by Brendan on 22/07/2015.
 */
public abstract class ABarcode {
    protected String content;

    public ABarcode(String content){
        this.content = content;
    }

    public abstract Bitmap GetBarcode(int width, int height);

    protected Bitmap ProduceBarcode(BitMatrix bm, int width, int height) {
        Bitmap mBitmap = null;

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
