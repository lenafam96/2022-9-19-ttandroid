package com.example.lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter_bai5 extends BaseAdapter {
    Context context;
    int[] avatars;
    LayoutInflater inflater;

    public CustomAdapter_bai5(Context context, int[] avatar) {
        this.context = context;
        this.avatars = avatar;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return avatars.length;
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
        convertView = inflater.inflate(R.layout.gridview_bai2, parent, false);
        ImageView avatar = (ImageView) convertView.findViewById(R.id.imgAvatar);
        avatar.setImageResource(avatars[position]);
        return convertView;
    }
}
