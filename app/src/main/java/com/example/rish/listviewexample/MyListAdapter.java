package com.example.rish.listviewexample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapter extends ArrayAdapter<ListItem> {

    private Context context;


    public MyListAdapter(Activity context, ArrayList<ListItem> list) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViewsw, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, list );
        this.context=context;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = view;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_layout, parent, false);
        }

        final ListItem listItem=getItem(position);

        ImageView imageview = (ImageView) listItemView.findViewById(R.id.item_image);

        imageview.setImageResource(listItem.getImage());

        TextView textView =(TextView) listItemView.findViewById(R.id.item_name);
        textView.setText(listItem.getName());

        TextView textView1 =(TextView) listItemView.findViewById(R.id.item_quant);
        textView1.setText(listItem.getQuantity());


        return listItemView;
    }
}
