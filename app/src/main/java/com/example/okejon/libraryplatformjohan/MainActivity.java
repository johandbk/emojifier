package com.example.okejon.libraryplatformjohan;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView myImageView = (ImageView) findViewById(R.id.imgview);
                Emojifier emoji = new Emojifier();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inMutable=true;

                Bitmap myBitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.aku, options);

                myImageView.setImageBitmap(emoji.detectFaces(getApplicationContext(), myBitmap));
                //myImageView.setImageDrawable(new BitmapDrawable(v,tempBitmap));
            }
        });
    }

}
