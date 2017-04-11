package com.example.vothuong.anh_pham_final_project.Activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.vothuong.anh_pham_final_project.Adapter.ViewPagerAdapter;
import com.example.vothuong.anh_pham_final_project.BaseActivity;
import com.example.vothuong.anh_pham_final_project.Fragment.Page10_Fragment;
import com.example.vothuong.anh_pham_final_project.Fragment.Page1_Fragment;
import com.example.vothuong.anh_pham_final_project.Fragment.Page2_Fragment;
import com.example.vothuong.anh_pham_final_project.Fragment.Page3_Fragment;
import com.example.vothuong.anh_pham_final_project.Fragment.Page4_Fragment;
import com.example.vothuong.anh_pham_final_project.Fragment.Page5_Fragment;
import com.example.vothuong.anh_pham_final_project.Fragment.Page6_Fragment;
import com.example.vothuong.anh_pham_final_project.Fragment.Page7_Fragment;
import com.example.vothuong.anh_pham_final_project.Fragment.Page8_Fragment;
import com.example.vothuong.anh_pham_final_project.Fragment.Page9_Fragment;
import com.example.vothuong.anh_pham_final_project.MainActivity;
import com.example.vothuong.anh_pham_final_project.R;
import com.example.vothuong.anh_pham_final_project.bean.Book;
import com.example.vothuong.anh_pham_final_project.util.UtilLog;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Photo_Slide_Activity extends BaseActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();

    @OnClick(R.id.to_home)
    void to_home(){
        toActivity(MainActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo__slide_);
        /*Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String message = intent.getStringExtra("key");
        int number = bundle.getInt("Integer",0);
        int fakeNumber = bundle.getInt("fake",0);
        Book book = (Book) bundle.getSerializable("book");

        UtilLog.logD("ViewPagerActivity, value is", message);
        UtilLog.logD("ViewPagerActivity, number is", ""+number);
        UtilLog.logD("ViewPagerActivity, fake number is", ""+fakeNumber);
        UtilLog.logD("ViewPagerActivity, book author is", ""+book.getAuthor());*/
        initial();
        ButterKnife.bind(this);
    }
    protected void onStart() {
        super.onStart();
    }
    public void initial(){
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        fragmentList.add(new Page1_Fragment());
        fragmentList.add(new Page2_Fragment());
        fragmentList.add(new Page3_Fragment());
        fragmentList.add(new Page4_Fragment());
        fragmentList.add(new Page5_Fragment());
        fragmentList.add(new Page6_Fragment());
        fragmentList.add(new Page7_Fragment());
        fragmentList.add(new Page8_Fragment());
        fragmentList.add(new Page9_Fragment());
        fragmentList.add(new Page10_Fragment());
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        viewPager.setAdapter(viewPagerAdapter);
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("message", "backed");
        setResult(RESULT_OK, intent);
        super.onBackPressed();
    }
}
