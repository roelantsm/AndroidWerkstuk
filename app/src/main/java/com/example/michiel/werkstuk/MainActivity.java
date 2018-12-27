package com.example.michiel.werkstuk;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.michiel.werkstuk.adapter.UserAdapter;
import com.example.michiel.werkstuk.model.User;

import java.util.ArrayList;

public class MainActivity extends ListActivity {


    ArrayList<User> users;
    private TextView txtItemSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        users = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            User user = new User("firts" + i, "last", "email");
            users.add(user);
        }

        setListAdapter(new UserAdapter(this, R.layout.row, users));
        txtItemSelected = findViewById(R.id.txt_selected_item);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // when a list item gets clicked, display the name stored at that position
        txtItemSelected.setText(users.get(position).getEmail());
    }
}
