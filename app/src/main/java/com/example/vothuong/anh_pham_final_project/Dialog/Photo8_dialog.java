package com.example.vothuong.anh_pham_final_project.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.vothuong.anh_pham_final_project.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Photo8_dialog extends Dialog {

    @OnClick(R.id.dialog_view)
    public void okClick(){
        listener.OnClickListener();
        dismiss();
    }
    private Photo8_dialog.ICustomDialogEventListener listener;

    public interface ICustomDialogEventListener{
        public void OnClickListener();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo8_dialog);
        ButterKnife.bind(this);
    }

    public Photo8_dialog(@NonNull Context context, Photo8_dialog.ICustomDialogEventListener ICustomDialogEventListener) {
        super(context, R.style.dialog);
        this.listener = ICustomDialogEventListener;
    }
}
