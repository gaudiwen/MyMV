package com.example.administrator.mymvpdemo.presenter.ipresenter;

import android.content.Context;
import android.widget.EditText;

import java.util.List;

public interface IPageActivityPresenter {

    void initData(List<EditText> editList);
    void finishActivity(Context context);
}
