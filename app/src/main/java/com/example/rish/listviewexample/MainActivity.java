package com.example.rish.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        ArrayList<ListItem> listItems = new ArrayList<ListItem>();
        ListItem obj1= new ListItem("Orange","50000",R.drawable.orange);

       listItems.add(obj1);

       listItems.add(new ListItem("Orange","50000",R.drawable.orange));

        ListItem obj2= new ListItem();
        obj2.setName("Mango");
        obj2.setQuantity("60000");
        obj2.setImage(R.drawable.ic_launcher_background);

        listItems.add(obj2);

        final MyListAdapter adapter = new MyListAdapter(MainActivity.this,listItems);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListItem obj= adapter.getItem(position);
                Toast.makeText(MainActivity.this,obj.getImage(),Toast.LENGTH_SHORT).show();

            }
        });


    }
}
