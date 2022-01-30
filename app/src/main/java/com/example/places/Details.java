package com.example.places;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    final int HORIZONTALMARGIN = 20;
    ImageView imageView;
    TextView textViewName, textViewDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = (ImageView) findViewById(R.id.details_img);
        textViewName = (TextView) findViewById(R.id.details_name);
        textViewDesc = (TextView) findViewById(R.id.details_desc);


        Bundle bundle = getIntent().getExtras();
        System.out.println(bundle);
        if (bundle != null) {
            int detailsImage = bundle.getInt("detailsImage");
            String detailsName = bundle.getString("detailsName");
            String detailsDesc = bundle.getString("detailsDesc");


            //System.out.println("DetailsName: " + detailsName);
            //System.out.println("DetailsDesc: " + detailsDesc);



            imageView.setImageResource(detailsImage);
            textViewName.setText(detailsName);
            textViewDesc.setText(detailsDesc);

            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            float dpHeight = displayMetrics.heightPixels / displayMetrics.density;
            float dpWidth = displayMetrics.widthPixels / displayMetrics.density;

            Drawable drawable = getResources().getDrawable(detailsImage);
            int width = drawable.getIntrinsicWidth();
            int height = drawable.getIntrinsicHeight();

            float resizedWidth = dpWidth - HORIZONTALMARGIN * 2;
            float resizedHeight = (height * dpWidth) / width;

            int resizedHeightPixels = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,  resizedHeight, getResources().getDisplayMetrics());
            int resizedWidthPixels = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,  resizedWidth, getResources().getDisplayMetrics());
            ViewGroup.LayoutParams lp = imageView.getLayoutParams();

            lp.height = resizedHeightPixels;
            lp.width = resizedWidthPixels;
            imageView.setLayoutParams(lp);
        }
    }
}
