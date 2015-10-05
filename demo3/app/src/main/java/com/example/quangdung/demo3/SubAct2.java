package com.example.quangdung.demo3;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubAct2 extends AppCompatActivity {

    Button btnChanDoan;
    EditText height_input, weight_input;
    TextView danhgia,chiso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_act2);
        Button btn_sub2 = (Button) findViewById(R.id.btn_sub2);
        btn_sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnChanDoan = (Button) findViewById(R.id.btn_dochiso);
        btnChanDoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                height_input=(EditText) findViewById(R.id.height_input);
                weight_input=(EditText) findViewById(R.id.weight_input);
                danhgia = (TextView) findViewById(R.id.danhgia);
                chiso = (TextView) findViewById(R.id.chiso);

                double weight = Double.parseDouble(weight_input.getText() + "");
                double height = Double.parseDouble(height_input.getText() + "");
                double BMI = weight/Math.pow(height,2);
                chiso.setText(String.format("%.2f",BMI));
                String cd = "";
                if (BMI < 18) {
                    cd = "Ban qua gay";
                } else if(BMI <= 24.9) {
                    cd = "Ban binh thuong";
                } else if(BMI <= 29.9) {
                    cd = "Ban bat dau beo";
                } else {
                    cd = "Ban qua beo, super fat!!";
                }
                danhgia.setText(cd);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sub_act2, menu);
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
