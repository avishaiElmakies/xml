package com.karp.anna.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class test extends AppCompatActivity {
    static final int CIRCLE_SIZE_IN_DP=85;
    static final int CIRCLE_MARGIN_IN_DP=10;
    static final int TEXT_HEIGHT_IN_DP=70;
    static final int TEXT_WIDTH_IN_DP=350;
    static final float MARGIN_TOP_TEXT=17.5f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        CircleImageView circleImageView=findViewById(R.id.flagId);
        DisplayMetrics displayMetrics=getResources().getDisplayMetrics();
        float circlePx=TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,CIRCLE_SIZE_IN_DP,displayMetrics);
        RelativeLayout.LayoutParams imgParams=new RelativeLayout.LayoutParams(Math.round(circlePx),Math.round(circlePx));
        float marginPx=TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,CIRCLE_MARGIN_IN_DP,displayMetrics);
        imgParams.setMargins(Math.round(marginPx),Math.round(marginPx),0,0);
        circleImageView.setLayoutParams(imgParams);
        float height=TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,TEXT_HEIGHT_IN_DP,displayMetrics);
        float marginTop=TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,MARGIN_TOP_TEXT,displayMetrics);
        TextView txt=findViewById(R.id.textView3);
        RelativeLayout.LayoutParams txtParams=((RelativeLayout.LayoutParams)txt.getLayoutParams());
        txtParams.height=Math.round(height);
        txtParams.setMargins(0,Math.round(marginTop),0,0);
        txt.setLayoutParams(txtParams);



    }
}
