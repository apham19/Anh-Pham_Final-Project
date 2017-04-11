package com.example.vothuong.anh_pham_final_project.Adapter;

import android.content.Context;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.example.vothuong.anh_pham_final_project.R;
import com.example.vothuong.anh_pham_final_project.util.UtilDensity;

import java.util.ArrayList;


public class ListViewAdapter extends BaseAdapter {

    private final LayoutInflater nInflater;
    private final ArrayList<String> listResult;
    private final ArrayList<Integer> imageResult;
    private Context nContext;



    public ListViewAdapter(Context context, ArrayList<String> listResult, ArrayList<Integer> imageResult){
        this.nContext = context;
        this.listResult = listResult;
        this.imageResult = imageResult;
        nInflater= (LayoutInflater) nContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listResult.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            convertView = nInflater.inflate(R.layout.list_item, parent,false);
            holder = new ViewHolder();
            holder.imageView1 = (ImageView)convertView.findViewById(R.id.image_view_1);
            holder.textView1 = (TextView) convertView.findViewById(R.id.text_view_1);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.imageView1.setImageResource(imageResult.get(position));
        holder.textView1.setText(listResult.get(position));
        return convertView;
    }

class ViewHolder {
        ImageView imageView1;
        TextView textView1;

    }



}
