package com.example.sifat.lovecalc;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
        TextView tv,tv2;
        ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Typeface tf2 = Typeface.createFromAsset(getAssets(), "fonts/KINKEE__.TTF");
        Typeface tf3 = Typeface.createFromAsset(getAssets(), "fonts/Love Letters.ttf");
        Typeface tf4 = Typeface.createFromAsset(getAssets(), "fonts/Mf Love Song.ttf");


        tv= (TextView)findViewById(R.id.resultgreen);
        tv2= (TextView)findViewById(R.id.resultred);

        iv= (ImageView) findViewById(R.id.image);
        tv.setTypeface(tf4);
        tv2.setTypeface(tf4);

        String s1= getIntent().getStringExtra("s1");
        String s3= getIntent().getStringExtra("s3");

        int result= getIntent().getIntExtra("result",0);



                        if (result>=100) {
                            tv.setText(s1 + "  Loves  " + s3 + "\n" + "100%");
                            tv.setVisibility(View.VISIBLE);

                        }


                        else if (result > 50)
                        {
                            tv.setText(s1+"  Loves  "+s3+"\n"  + result+"%");
                            tv.setVisibility(View.VISIBLE);
                        }


                        else if (result < 50 && result>14)
                        {
                            tv2.setText(s1+"  Loves  "+s3+"\n"  + result+"%");
                            tv2.setVisibility(View.VISIBLE);
                        }


                        else {
                            tv2.setText(s1+"  Loves  "+s3+"\n"+ "15%");
                            tv2.setVisibility(View.VISIBLE);
                        }


                        if (result==100)
                        {
                            int id=R.drawable.z;
                            iv.setImageResource(id);


                        }


                       else if (result>80)
                        {
                            int id=R.drawable.e;
                            iv.setImageResource(id);


                                        }
                       else   if (result>60)
                        {
                            int id=R.drawable.d;
                            iv.setImageResource(id);

                        }
                        else   if (result>40)
                        {
                            int id=R.drawable.c;
                            iv.setImageResource(id);


                        }
                        else   if (result>20)
                        {
                            int id=R.drawable.b;
                            iv.setImageResource(id);


                        }
                        else   if (result>00)
                        {
                            int id=R.drawable.a;
                            iv.setImageResource(id);


                        }




    }

}
