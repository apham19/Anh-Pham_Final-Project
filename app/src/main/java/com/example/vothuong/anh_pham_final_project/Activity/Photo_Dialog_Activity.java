package com.example.vothuong.anh_pham_final_project.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.example.vothuong.anh_pham_final_project.BaseActivity;
import com.example.vothuong.anh_pham_final_project.Dialog.Photo10_dialog;
import com.example.vothuong.anh_pham_final_project.Dialog.Photo1_dialog;
import com.example.vothuong.anh_pham_final_project.Dialog.Photo2_dialog;
import com.example.vothuong.anh_pham_final_project.Dialog.Photo3_dialog;
import com.example.vothuong.anh_pham_final_project.Dialog.Photo4_dialog;
import com.example.vothuong.anh_pham_final_project.Dialog.Photo5_dialog;
import com.example.vothuong.anh_pham_final_project.Dialog.Photo6_dialog;
import com.example.vothuong.anh_pham_final_project.Dialog.Photo7_dialog;
import com.example.vothuong.anh_pham_final_project.Dialog.Photo8_dialog;
import com.example.vothuong.anh_pham_final_project.Dialog.Photo9_dialog;
import com.example.vothuong.anh_pham_final_project.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Photo_Dialog_Activity extends BaseActivity {

    private int checkedID;
    private final int DIALOG = 12345;

    Handler mHandler = new Handler(){

        public void handlerMessage(Message msg){
            switch (msg.what){
                case DIALOG:
                    Bundle bundle = msg.getData();
                    String s = bundle.getString("msg");
                    toastShort("Dialog Message:"+s);
                    break;
                default:
            }
            super.handleMessage(msg);
        }
    };
    @BindView(R.id.rdg)
    RadioGroup radioGroup;

    public void okClick() {
        switch (checkedID) {
            case R.id.p1:
                photo1_show();
                break;
            case R.id.p2:
                photo2_show();
                break;
            case R.id.p3:
                photo3_show();
                break;
            case R.id.p4:
                photo4_show();
                break;
            case R.id.p5:
                photo5_show();
                break;
            case R.id.p6:
                photo6_show();
                break;
            case R.id.p7:
                photo7_show();
                break;
            case R.id.p8:
                photo8_show();
                break;
            case R.id.p9:
                photo9_show();
                break;
            case R.id.p10:
                photo10_show();
                break;
            case R.id.progress:
                progressDialog();
                break;
            default:
        }
    }

    private void photo10_show() {
        Photo10_dialog dialog = new Photo10_dialog(this, new Photo10_dialog.ICustomDialogEventListener(){

            @Override
            public void OnClickListener() {
                Intent intent = new Intent();
                intent.putExtra("message","Dialog");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        dialog.show();
    }



    private void photo9_show() {
        Photo9_dialog dialog = new Photo9_dialog(this, new Photo9_dialog.ICustomDialogEventListener(){

            @Override
            public void OnClickListener() {
                Intent intent = new Intent();
                intent.putExtra("message","Dialog");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        dialog.show();
    }



    private void photo8_show() {
        Photo8_dialog dialog = new Photo8_dialog(this, new Photo8_dialog.ICustomDialogEventListener(){

            @Override
            public void OnClickListener() {
                Intent intent = new Intent();
                intent.putExtra("message","Dialog");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        dialog.show();
    }



    private void photo7_show() {
        Photo7_dialog dialog = new Photo7_dialog(this, new Photo7_dialog.ICustomDialogEventListener(){

            @Override
            public void OnClickListener() {
                Intent intent = new Intent();
                intent.putExtra("message","Dialog");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        dialog.show();
    }



    private void photo6_show() {
        Photo6_dialog dialog = new Photo6_dialog(this, new Photo6_dialog.ICustomDialogEventListener(){

            @Override
            public void OnClickListener() {
                Intent intent = new Intent();
                intent.putExtra("message","Dialog");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        dialog.show();
    }



    private void photo5_show() {
        Photo5_dialog dialog = new Photo5_dialog(this, new Photo5_dialog.ICustomDialogEventListener(){

            @Override
            public void OnClickListener() {
                Intent intent = new Intent();
                intent.putExtra("message","Dialog");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        dialog.show();
    }



    private void photo4_show(){
    Photo4_dialog dialog = new Photo4_dialog(this, new Photo4_dialog.ICustomDialogEventListener(){

        @Override
        public void OnClickListener() {
            Intent intent = new Intent();
            intent.putExtra("message","Dialog");
            setResult(RESULT_OK,intent);
            finish();
        }
    });
        dialog.show();
}

    private void photo3_show() {
        Photo3_dialog dialog = new Photo3_dialog(this, new Photo3_dialog.ICustomDialogEventListener(){

            @Override
            public void OnClickListener() {
                Intent intent = new Intent();
                intent.putExtra("message","Dialog");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        dialog.show();
    }


    private void photo2_show() {
        Photo2_dialog dialog = new Photo2_dialog(this, new Photo2_dialog.ICustomDialogEventListener(){

            @Override
            public void OnClickListener() {
                Intent intent = new Intent();
                intent.putExtra("message","Dialog");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        dialog.show();
    }

    private void photo1_show() {
        Photo1_dialog dialog = new Photo1_dialog(this, new Photo1_dialog.ICustomDialogEventListener(){

            @Override
            public void OnClickListener() {
                Intent intent = new Intent();
                intent.putExtra("message","Dialog");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        dialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo__dialog_);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                toastShort("You checked photo" + checkedId);
                checkedID = checkedId;
            }
        } );
        ButterKnife.bind(this);
    }

    private void progressDialog() {
        final int MAX_PROGRESS = 100;
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setProgress(0);
        progressDialog.setTitle("Downloading");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setMax(MAX_PROGRESS);
        progressDialog.show();

        new Thread(new Runnable() {
            @Override
            public void run() {
                int progress = 0;
                while (progress < MAX_PROGRESS) {
                    try {
                        Thread.sleep(100);
                        progress++;
                        progressDialog.setProgress(progress);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                Bundle bundle =  new Bundle();
                bundle.putString("msg","Download Success");
                Message msg = Message.obtain();
                msg.what = DIALOG;
                msg.setData(bundle);
                mHandler.sendMessage(msg);
                progressDialog.cancel();
            }
        }).start();
    }
}

