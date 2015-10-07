package com.example.quangdung.demo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;

public class ListOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_one);
        ListView listone = (ListView) findViewById(R.id.listOne);

        RadioGroup radio_group = (RadioGroup) findViewById(R.id.radio_group);
        radio_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Log.d("ischecked", group.getCheckedRadioButtonId() + "");
            }
        });
        int idradio = radio_group.getCheckedRadioButtonId();
        Log.d("ischecked", idradio + "");
        String arr[] = {""};
        switch (idradio) {
            case R.id.dlclass_radio:
                    arr = new String[]{"John","Marie","Tom"};
                break;
            case R.id.dlXml_radio:
                    arr = getResources().getStringArray(R.array.dulieu_demo);
                break;
            default:
                break;
        }
//        final String arr[] = {""};
//        final String arr[] = getResources().getStringArray(R.array.dulieu_demo);
//        final String arr[] = {"John","Marie","Tom"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
        Log.d("Adapter",adapter + "");
        listone.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_one, menu);
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
