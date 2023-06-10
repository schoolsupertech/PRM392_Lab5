package com.example.truongnlnde160015_lab5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lookup the RecyclerView in Activity Layout
        RecyclerView rvUser = findViewById(R.id.rcView);

        // Initialize user list
        userList = new ArrayList<>();
        userList.add(new User("NguyenTT", "Tran Thanh Nguyen", "nguyentt@fpt.edu.vn"));
        userList.add(new User("AnTV", "Tran Van An", "antv@fpt.edu.vn"));
        userList.add(new User("BangTT", "Tran Thanh Bang", "bangtt@fpt.edu.vn"));
        userList.add(new User("KhangTT", "Tran Thanh Khang", "khangtt@fpt.edu.vn"));
        userList.add(new User("BaoNT", "Nguyen Thanh Nguyen", "baont@fpt.edu.vn"));
        userList.add(new User("HungVH", "Vo Huy Hung", "huyvh@fpt.edu.vn"));

        // Create adapter passing in the sample user data
        UserAdapter userAdapter = new UserAdapter(userList);

        // Attach the userAdapter to the RecyclerView to populist item
        rvUser.setAdapter(userAdapter);

        // Set layout manager to position the item
        rvUser.setLayoutManager(new LinearLayoutManager(this));
    }
}