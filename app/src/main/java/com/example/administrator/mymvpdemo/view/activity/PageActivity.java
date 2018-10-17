package com.example.administrator.mymvpdemo.view.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.administrator.mymvpdemo.R;
import com.example.administrator.mymvpdemo.presenter.compl.PageActivityPresenterCompl;
import com.example.administrator.mymvpdemo.view.interfaceview.IPageActivityView;

import butterknife.ButterKnife;

public class PageActivity extends Activity implements IPageActivityView{

    protected Context context;
    PageActivityPresenterCompl pageActivityPresenterCompl;
    private Button btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        ButterKnife.bind(this);
        context = this;
        initView();
    }

    private void initView() {

        btnFinish=(Button)findViewById(R.id.btn_finish);

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.v("Test","Onclick Test！");
                finishActivity();
            }
        });
    }

    @Override
    public void initData() {

    }

    @Override
    public void finishActivity() {

        pageActivityPresenterCompl=new PageActivityPresenterCompl();
        pageActivityPresenterCompl.finishActivity(this);
    }



/*    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_finish:

                Log.v("Test","Onclick Test！");
                finishActivity();
        }
    }*/
}
