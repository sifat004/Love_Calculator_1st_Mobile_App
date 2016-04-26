package com.example.sifat.lovecalc;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    Button button;
    EditText e1, e2, e3, e4;
    String s1,s3;
    char[] c1,c2;
    ImageView iv;


    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Typeface tf2 = Typeface.createFromAsset(getAssets(), "fonts/KINKEE__.TTF");
        Typeface tf3 = Typeface.createFromAsset(getAssets(), "fonts/Love Letters.ttf");
        Typeface tf4 = Typeface.createFromAsset(getAssets(), "fonts/Mf Love Song.ttf");



        e1 = (EditText) findViewById(R.id.name1);
        e2 = (EditText) findViewById(R.id.date1);
        e3 = (EditText) findViewById(R.id.name2);
        e4 = (EditText) findViewById(R.id.date2);

        button=(Button) findViewById(R.id.but);
        e1.setTypeface(tf4);
        e2.setTypeface(tf4);
        e3.setTypeface(tf4);
        e4.setTypeface(tf4);
        button.setTypeface(tf2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {






                if (e1.getText().length() == 0) {
                    e1.setError("Please Put Your Name");
                } else if (e2.getText().length() == 0) {
                    e2.setError("Please Put Your Date of Birth");
                } else if (e3.getText().length() == 0) {
                    e3.setError("Please Put the Name of Your Love");
                } else if (e4.getText().length() == 0) {
                    e4.setError("Please Put the Date of Birth of Your Love ");
                } else {
                    String s1 = e1.getText().toString();
                    char[] c1 = s1.toLowerCase().toCharArray();

                    String s3 = e3.getText().toString();
                    char[] c2 = s3.toLowerCase().toCharArray();

                    String s2 = e2.getText().toString();
                    int d2 = Integer.parseInt(s2);


                    String s4 = e4.getText().toString();
                    int d4 = Integer.parseInt(s4);
                    if ((d2 > 31)||(d2<=0)) {
                        e2.setError("Invalid Dste");
                    } else if ((d4 > 31)||(d4<=0)) {
                        e4.setError("Invalid Dste");
                    } else {


                        int count = 0;
                        int result = 0;








                        for (int i = 0; i <= c1.length - 1; i++) {
                            for (int j = 0; j <= c2.length - 1; j++) {
                                if (c1[i] == c2[j]) {
                                    count++;
                                }
                            }

                        }
                        if (count < 5) {
                            result = (count * 19 + (d4 - d2));
                        } else if (count < 7) {
                            result = (count * 17 + (d4 - d2));
                        }
                        else {
                            result = 99;
                        }




                        if ((s1.equalsIgnoreCase("myesha")||s1.equalsIgnoreCase("esh"))&& (s3.equalsIgnoreCase("sifat")||s3.equalsIgnoreCase("ift")))
                        {
                            result=100;
                            s1="esh";
                            s3="ift";


                        }
                        else if ((s3.equalsIgnoreCase("myesha")||s3.equalsIgnoreCase("esh"))&& (s1.equalsIgnoreCase("sifat")||s1.equalsIgnoreCase("ift")))
                        {
                            result=100;
                            s3="esh";
                            s1="ift";


                        }






                        Intent i= new Intent(SecondActivity.this,ThirdActivity.class);
                        i.putExtra("result",result);
                        i.putExtra("s1",s1);
                        i.putExtra("s3",s3);

                        startActivity(i);




//                       /* if (result>100)
//                            tv.setText(s1+"\n\nLoves\n\n"+s3+"\n\n"  + "100%");
//                        else if (result > 15)
//                            tv.setText(s1+"\n\nLoves\n\n"+s3+"\n\n"  + result+"%");
//
//                        else tv.setText(s1+"\n\nLoves\n\n"+s3+"\n\n"+ "15%");*/

                    }
                }
            }
        });

    }

}
