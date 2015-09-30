package com.splashincsoluctions.myloyalty.Barcode;

/**
 * Created by Brendan on 30/09/2015.
 */
public class UserBarcode {
    private String location;
    private String type;
    private String content;

    public UserBarcode(String location, String type, String content)
    {
        this.location = location;
        this.type = type;
        this.content = content;
    }
}
