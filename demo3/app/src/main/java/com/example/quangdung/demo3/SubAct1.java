package com.example.quangdung.demo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SubAct1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_act1);
        Button btn_sub1 = (Button) findViewById(R.id.btn_sub1);
        btn_sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Button nhay_sub = (Button) findViewById(R.id.nhay_sub);
        nhay_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubAct1.this, SubAct2.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText
                (this, "on remuse act1", Toast.LENGTH_LONG)
                .show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(
                this, "on Stop act1", Toast.LENGTH_LONG).show();
    }





    //    Tinh Tong
    public void tinhtong(View v) {
        EditText soA = (EditText) findViewById(R.id.soA_edit);
        int a = Integer.parseInt(soA.getText()+"");

        EditText soB = (EditText) findViewById(R.id.soB_edit);
        int b = Integer.parseInt(soB.getText()+"");

        TextView ketqua = (TextView) findViewById(R.id.Kq_edit);
        ketqua.setText((a + b) + "");
    }

    //    Tinh Hieu
    public void tinhhieu(View v) {
        EditText soA = (EditText) findViewById(R.id.soA_edit);
        int a = Integer.parseInt(soA.getText()+"");

        EditText soB = (EditText) findViewById(R.id.soB_edit);
        int b = Integer.parseInt(soB.getText()+"");

        TextView ketqua = (TextView) findViewById(R.id.Kq_edit);
        ketqua.setText((a - b) + "");
    }
    //    Tinh Hieu
    public void boiso(View v) {
        EditText soA = (EditText) findViewById(R.id.soA_edit);
        int a = Integer.parseInt(soA.getText()+"");

        EditText soB = (EditText) findViewById(R.id.soB_edit);
        int b = Integer.parseInt(soB.getText()+"");

        if (a%b == 0) {
            TextView ketqua = (TextView) findViewById(R.id.Kq_edit);
            ketqua.setText(true + "");
        } else {
            TextView ketqua = (TextView) findViewById(R.id.Kq_edit);
            ketqua.setText(false + "");
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sub_act1, menu);
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
