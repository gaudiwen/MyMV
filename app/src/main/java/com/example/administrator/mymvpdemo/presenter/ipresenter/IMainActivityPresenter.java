package com.example.administrator.mymvpdemo.presenter.ipresenter;


import android.content.Context;
import android.widget.EditText;
import android.widget.ProgressBar;

import java.util.List;

public interface IMainActivityPresenter {

    void submitData(Context context , List<EditText> editList, ProgressBar progressBar);
    void initData(List<EditText> editList);

}
