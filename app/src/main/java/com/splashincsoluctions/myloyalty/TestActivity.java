package com.splashincsoluctions.myloyalty;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.splashincsoluctions.myloyalty.BarcodeGenerator.ABarcode;
import com.splashincsoluctions.myloyalty.BarcodeGenerator.BarcodeHelper;

public class TestActivity extends Activity implements View.OnClickListener
{
    private Button scanBtn;
    private TextView formatTxt, contentTxt;
    private ImageView mImageView;

    @Override
    public void onClick(View v){
        if(v.getId()==R.id.scan_button){
            IntentIntegrator scanIntegrator = new IntentIntegrator(this);
            scanIntegrator.initiateScan();
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        IntentResult scanningResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
        if (scanningResult != null) {
            String scanContent = scanningResult.getContents();
            String scanFormat = scanningResult.getFormatName();
            formatTxt.setText("FORMAT: " + scanFormat);
            contentTxt.setText("CONTENT: " + scanContent);
            ABarcode bc = BarcodeHelper.GetBarcode(scanFormat, scanContent);
            Bitmap bitmap = null;
            try {
                if (bc != null) {
                    bitmap = bc.GetBarcode(1080, 600);
                }
                if (bitmap != null) {
                    mImageView.setImageBitmap(bitmap);
                }
            }catch(Exception ex){
                ex.printStackTrace();
                Toast toast = Toast.makeText(getApplicationContext(), "An unexpected error occured", Toast.LENGTH_SHORT);
                toast.show();
            }


        } else{
            Toast toast = Toast.makeText(getApplicationContext(), "No Can data recieved!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scanBtn = (Button)findViewById(R.id.scan_button);
        formatTxt = (TextView)findViewById(R.id.scan_format);
        contentTxt = (TextView)findViewById(R.id.scan_content);
        mImageView = (ImageView)findViewById(R.id.imageView);
        scanBtn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
