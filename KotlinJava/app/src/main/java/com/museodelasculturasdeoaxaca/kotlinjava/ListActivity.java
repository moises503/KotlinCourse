package com.museodelasculturasdeoaxaca.kotlinjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    RecyclerView rvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        rvList = (RecyclerView) findViewById(R.id.rvList);
        TextView user = (TextView) findViewById(R.id.user);
        if(getIntent() != null){
            Bundle bundle = getIntent().getExtras();
            String name = bundle.getString("user", "");
            user.setText("Bienvenido " + name);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvList.setLayoutManager(linearLayoutManager);
        rvList.setAdapter(new RvListAdapter(getFakeData()));
    }

    public List<BasicPojo> getFakeData() {
        List<BasicPojo> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(new BasicPojo("Título "+ i, "Descripción "+ i));
        }
        return list;
    }
}
