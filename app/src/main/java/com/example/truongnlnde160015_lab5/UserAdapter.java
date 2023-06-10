package com.example.truongnlnde160015_lab5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder>{
    // Store a member variable for the User
    private final ArrayList<User> userList;

    public UserAdapter(ArrayList<User> userList){
        this.userList = userList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_username;
        TextView tv_fullname;
        TextView  tv_email;
        public ViewHolder (@NonNull View itemView){
            super (itemView);

            tv_username = itemView.findViewById(R.id.tv_username);
            tv_fullname = itemView.findViewById(R.id.tv_fullname);
            tv_email = itemView.findViewById(R.id.tv_email);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        // Inflate the custom Layout
        View view= layoutInflater.inflate(R.layout.item_user, parent, false);

        // Return a new holder instance
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Get the data model based on position
        User User = userList.get(position);

        // Set item views based on your views and data model
        holder.tv_username.setText("User name: "+ User.getUsername());
        holder.tv_fullname.setText("Full name: "+ User.getFullname());
        holder.tv_email.setText("Email: "+ User.getEmail());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}