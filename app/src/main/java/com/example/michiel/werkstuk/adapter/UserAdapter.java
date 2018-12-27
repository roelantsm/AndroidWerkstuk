package com.example.michiel.werkstuk.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.michiel.werkstuk.R;
import com.example.michiel.werkstuk.model.User;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<User> {

    private ArrayList<User> users;

    public UserAdapter(Context context, int resource,  ArrayList<User> users) {
        // call the ArrayAdapter constructor with the context, resource ID and data
        super(context, resource, users);
        this.users = users;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View row = layoutInflater.inflate(R.layout.row,null);

        TextView txtRowLabel = row.findViewById(R.id.txt_row_label);
        txtRowLabel.setText(users.get(position).getFirstName());
        //ImageView imgRowImage = (ImageView) row.findViewById(R.id.img_row_image);
        //imgRowImage.setImageResource(R.drawable.ic_add_circle);

        // return the layout with it's values set
        return row;
    }
}
