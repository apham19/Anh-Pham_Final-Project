package com.example.vothuong.anh_pham_final_project;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.example.vothuong.anh_pham_final_project.Activity.Photo_Dialog_Activity;
import com.example.vothuong.anh_pham_final_project.Activity.Photo_List_Activity;
import com.example.vothuong.anh_pham_final_project.Activity.Photo_Slide_Activity;
import com.example.vothuong.anh_pham_final_project.util.UtilLog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements View.OnTouchListener {

    @OnClick(R.id.photo_list)
    void to_photo_list(){
        toActivity(Photo_List_Activity.class);
    }
    @OnClick(R.id.photo_slide)
    void to_photo_slide(){
        toActivity(Photo_Slide_Activity.class);
    }
    @OnClick(R.id.photo_dialog)
    void to_photo_dialog(){
        toActivity(Photo_Dialog_Activity.class);
    }
    @BindView(R.id.main_fl)FrameLayout fl;
    @BindView(R.id.listOfActivity)
    LinearLayout ll;
    int count=0;
    void show_profile(){
        if(count==0){
            ObjectAnimator animator = ObjectAnimator.ofFloat(ll, "translationX", 0, 950, 950,950,950); //translationY
            animator.setDuration(1000);
            animator.start();
            count++;
        }
        else{
            ObjectAnimator animator = ObjectAnimator.ofFloat(ll, "translationX", 950, 0, 0,0,0); //translationY
            animator.setDuration(1000);
            animator.start();
            count=0;
        }

    }

    @OnClick(R.id.p_photo_list)
    void p_to_photo_list(){
        to_photo_list();
    }

    @OnClick(R.id.p_photo_slide)
    void p_to_photo_slide(){
        to_photo_slide();
    }

    @OnClick(R.id.p_photo_dialog)
    void p_to_photo_dialog(){
        to_photo_dialog();
    }



    private GestureDetector mGestureDetector;
    public boolean onTouch(View v, MotionEvent event){
        return mGestureDetector.onTouchEvent(event);

    }
    private class simpleGestureListener extends
            GestureDetector.SimpleOnGestureListener{

        public boolean onDown(MotionEvent e){
//            UtilLog.logD("MyGesture", "onDown");
            toastShort("onDown");
            show_profile();
            return true;
        }
        public void onShowPress(MotionEvent e){
//            UtilLog.logD("MyGesture", "onShowPress");
            toastShort("onShowPress");
        }
        public void onLongPress(MotionEvent e){
//            UtilLog.logD("MyGesture", "onLongPress");
            toastShort("onLongPress");
        }
        public boolean onSingleTapUp(MotionEvent e){
//            UtilLog.logD("myGesture", "onSingleTapUp");
            toastShort("onSingleTapUp");
            return true;
        }
        public boolean onSingleTapConfirmed(MotionEvent e){
//            UtilLog.logD("myGesture", "onSingleTapUp");
            toastShort("onSingleTapConfirmed");
            return true;
        }
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY){
            UtilLog.logD("myGesture", "onScroll:" + (e2.getX() - e1.getX()) + " " + distanceX);
            toastShort("onScroll");
            return true;
        }
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY){
            //           UtilLog.logD("myGesture", "onFling");
            toastShort("onFling");
            return true;
        }
        public boolean onDoubleTap(MotionEvent e){
            //           UtilLog.logD("myGesture", "onDoubleTap");
            //           toastShort("onDoubleTap");
            return true;
        }
        public boolean onDoubleTapEvent(MotionEvent e){
            //           UtilLog.logD("myGesture", "onDoubleTapEvent");
            //           toastShort("onDoubleTapEvent");
            return true;
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mGestureDetector = new GestureDetector(this, new simpleGestureListener());
        fl.setOnTouchListener(this);
    }

    protected void onStart() {
        super.onStart();
        toastShort("Welcome");
    }


}
