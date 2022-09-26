package com.example.lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter_Bai1 extends BaseAdapter {
    Context context;
    String[] list;
    String[] phone;
    int[] avatars;
    LayoutInflater inflater;

    public CustomAdapter_Bai1(Context context, String[] name, String[] phone, int[] avatar) {
        this.context = context;
        this.list = name;
        this.phone = phone;
        this.avatars = avatar;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return list.length;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.listview_bai1, parent, false);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView phoneNumber = (TextView) convertView.findViewById(R.id.phone);
        ImageView avatar = (ImageView) convertView.findViewById(R.id.img);
        name.setText(list[position]);
        phoneNumber.setText(phone[position]);
        avatar.setImageResource(avatars[position]);
        return convertView;
    }
}
