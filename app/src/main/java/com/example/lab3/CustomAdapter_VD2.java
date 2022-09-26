package com.example.lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter_VD2 extends BaseAdapter {
    Context context;
    String[] list;
    int[] avatars;
    LayoutInflater inflater;

    public CustomAdapter_VD2(Context context, String[] idol, int[] avatar) {
        this.context = context;
        this.list = idol;
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
        convertView = inflater.inflate(R.layout.listview_vd2, parent, false);
        TextView idolName = (TextView) convertView.findViewById(R.id.nameIdol);
        ImageView avatar = (ImageView) convertView.findViewById(R.id.imgAvatar);
        idolName.setText(list[position]);
        avatar.setImageResource(avatars[position]);
        return convertView;
    }
}
