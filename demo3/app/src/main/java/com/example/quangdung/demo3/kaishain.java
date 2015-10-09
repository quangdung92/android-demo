package com.example.quangdung.demo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class kaishain extends AppCompatActivity {

    ArrayList<Employs> arrEmployee = new ArrayList<Employs>();
    EmployArrayAdapter adapter;
    ListView list_kaisha;
    Button create_emp;
    EditText name_input,id_input;
    RadioGroup radio_group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaishain);
        create_emp = (Button) findViewById(R.id.btn_create);
        name_input = (EditText) findViewById(R.id.name_input);
        id_input = (EditText) findViewById(R.id.ma_input);
        radio_group = (RadioGroup) findViewById(R.id.gender_group);
        list_kaisha = (ListView) findViewById(R.id.list_kaishain);
        arrEmployee = new ArrayList<Employs>();

        adapter = new EmployArrayAdapter(this, R.layout.itemlist_layout, arrEmployee);
        list_kaisha.setAdapter(adapter);

        create_emp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ma = id_input.getText()+"";
                String name = name_input.getText()+"";
                boolean sex = false;
                if (radio_group.getCheckedRadioButtonId() == R.id.radio_male) {
                    sex = true;
                }
                Employs emps = new Employs();
                emps.setId(ma);
                emps.setName(name);
                emps.setGender(sex);
                arrEmployee.add(emps);
                adapter.notifyDataSetChanged();
//                    remove previous values
                name_input.setText("");
                id_input.setText("");
                id_input.requestFocus();
            }
        });

        //Set values to arrays
    }
    public void xulyXoa()
    {
        for(int i=lvNhanvien.getChildCount()-1;i>=0;i--)
        {
            View v=lvNhanvien.getChildAt(i);
            CheckBox chk=(CheckBox) v.findViewById(R.id.chkitem);
            if(chk.isChecked())
            {
                arrEmployee.remove(i);
            }
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kaishain, menu);
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

//    public void xoaemployee(View view) {
//            for(int i=lvNhanvien.getChildCount()-1;i>=0;i--)
//            {
//                View v=lvNhanvien.getChildAt(i);
//                CheckBox chk=(CheckBox) v.findViewById(R.id.chkitem);
//                if(chk.isChecked())
//                {
//                    arrEmployee.remove(i);
//                }
//            }
//            adapter.notifyDataSetChanged();
//        }
}
