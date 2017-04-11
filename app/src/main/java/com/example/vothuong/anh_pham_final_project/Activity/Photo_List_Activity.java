package com.example.vothuong.anh_pham_final_project.Activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.*;

import com.example.vothuong.anh_pham_final_project.Adapter.ListViewAdapter;
import com.example.vothuong.anh_pham_final_project.BaseActivity;
import com.example.vothuong.anh_pham_final_project.MainActivity;
import com.example.vothuong.anh_pham_final_project.R;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Photo_List_Activity extends BaseActivity implements AdapterView.OnItemClickListener{
    private ArrayList<String> listResult;
    private ArrayList<Integer> imageResult;


    ImageView p1;
    private ListView listView;
    private LinearLayout listViewHeader;

    @OnClick(R.id.to_home)
    void to_home(){
        toActivity(MainActivity.class);
    }

    public Photo_List_Activity() throws MalformedURLException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo__list_);
        listResult = new ArrayList<String>();
        imageResult = new ArrayList<Integer>();
        create_list_result();
        create_image_result();
        initialView();
        ButterKnife.bind(this);
    }

    private void create_image_result() {
        imageResult.add(R.mipmap.page_1);
        imageResult.add(R.mipmap.page_2);
        imageResult.add(R.mipmap.page_3);
        imageResult.add(R.mipmap.page_4);
        imageResult.add(R.mipmap.page_5);
        imageResult.add(R.mipmap.page_6);
        imageResult.add(R.mipmap.page_7);
        imageResult.add(R.mipmap.page_8);
        imageResult.add(R.mipmap.page_9);
        imageResult.add(R.mipmap.page_10);
    }

    private void create_list_result() {
        listResult.add("Photo 1");
        listResult.add("Photo 2");
        listResult.add("Photo 3");
        listResult.add("Photo 4");
        listResult.add("Photo 5");
        listResult.add("Photo 6");
        listResult.add("Photo 7");
        listResult.add("Photo 8");
        listResult.add("Photo 9");
        listResult.add("Photo 10");
    }

    private void initialView(){
        listView = (ListView) findViewById(R.id.photo_list_view);
        View view = getLayoutInflater().inflate(R.layout.list_view_header,null);
        listViewHeader = (LinearLayout) view.findViewById(R.id.list_view_header);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this, listResult,imageResult);
        listView.addHeaderView(listViewHeader);
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"You clicked picture " +position,Toast.LENGTH_LONG).show();
        Log.d("testListViewActivity",String.valueOf(position));
    }
}
