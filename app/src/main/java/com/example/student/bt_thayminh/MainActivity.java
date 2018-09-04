package com.example.student.bt_thayminh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_bai5);

        final RadioGroup rdg_empType= (RadioGroup) findViewById(R.id.rdg_empType);
        final EditText txt_id= (EditText) findViewById(R.id.txt_id);
        final EditText txt_name= (EditText) findViewById(R.id.txt_name);
        Button btn_submit = (Button) findViewById(R.id.btn_submit);
        RadioButton rd_fullTime= (RadioButton) findViewById(R.id.rd_fullTime);
        rd_fullTime.setChecked(true);
        final List<Employee> listEmp=new ArrayList<>();
        final ArrayAdapter<Employee> listViewAdaper=new ArrayAdapter<Employee>(this,android.R.layout.simple_list_item_1,listEmp);
        final ListView listView= (ListView) findViewById(R.id.listEmp);
        listView.setAdapter(listViewAdaper);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id=txt_id.getText().toString();
                String name=txt_name.getText().toString();
                boolean isFullTime;
                switch(rdg_empType.getCheckedRadioButtonId()){
                    case R.id.rd_partTime:
                        isFullTime=false;
                        break;
                    default:
                        isFullTime=true;
                        break;
                }
                listViewAdaper.add(new Employee(id,name,isFullTime));
            }
        });
    }
}
