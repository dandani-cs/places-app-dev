package com.example.places;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

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
        if(bundle != null)
        {
            int detailsImage = bundle.getInt("detailsImage");
            String detailsName = bundle.getString("detailsName");
            String detailsDesc = bundle.getString("detailsDesc");


            //System.out.println("DetailsName: " + detailsName);
            //System.out.println("DetailsDesc: " + detailsDesc);

            imageView.setImageResource(detailsImage);
            textViewName.setText(detailsName);
            textViewDesc.setText(detailsDesc);
        }
    }


}