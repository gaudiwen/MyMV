package com.example.administrator.mymvpdemo.presenter.compl;

import android.content.Context;
import android.util.Log;
import android.widget.EditText;

import com.example.administrator.mymvpdemo.presenter.ipresenter.IPageActivityPresenter;

import java.util.List;

public class PageActivityPresenterCompl implements IPageActivityPresenter {

    @Override
    public void initData(List<EditText> editList) {

    }

    @Override
    public void finishActivity(Context context) {

        Log.v("Test","This is Mvp Test！");
    }


}
