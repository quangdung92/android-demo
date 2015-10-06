package com.example.quangdung.demo3;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SubAct3 extends AppCompatActivity {
    private Button btnCel, btnFar, btnSub3;
    private EditText CInput, FInput;
    private View.OnClickListener temOnclicklisten = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String c = ((Button)v).getTag().toString();
            if (c.equals("CtoF")) {
                Toast.makeText(SubAct3.this, "You press C to F done!", Toast.LENGTH_LONG).show();
                CInput = (EditText) findViewById(R.id.C_input);
                Double cel = Double.parseDouble(CInput.getText() + "");
                if (cel == null) {
                    Toast.makeText(SubAct3.this, "celsius not null!", Toast.LENGTH_LONG).show();
                } else {
                    Double far = cel * 9/5 + 32;
                    Log.d("FARKQ",far + "");
                    FInput = (EditText) findViewById(R.id.F_input);
                    FInput.setText(far+"");
                }
            } else if (c.equals("FtoC")) {
                Toast.makeText(SubAct3.this, "You press F to C done!", Toast.LENGTH_LONG).show();
                FInput = (EditText) findViewById(R.id.F_input);
                Double fah = Double.parseDouble(FInput.getText() + "");
                if (fah == null) {
                    Toast.makeText(SubAct3.this, "fahrenheit not null!", Toast.LENGTH_LONG).show();
                } else {
                    Double cel = (fah - 32) * 5/9;
                    Log.d("CelKq",cel + "");
                    CInput = (EditText) findViewById(R.id.C_input);
                    CInput.setText(cel + "");
                }
            } else {
                AlertDialog.Builder ale = new AlertDialog.Builder(SubAct3.this);
                ale.setTitle("Button");
                ale.setMessage(c);
                ale.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                ale.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                ale.create().show();
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_act3);
        btnSub3 = (Button) findViewById(R.id.btn_sub3);
        btnSub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnCel = (Button) findViewById(R.id.C_btn);
        btnCel.setOnClickListener(temOnclicklisten);

        btnFar = (Button) findViewById(R.id.F_btn);
        btnFar.setOnClickListener(temOnclicklisten);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sub_act3, menu);
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
