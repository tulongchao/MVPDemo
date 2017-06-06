package com.example.tufengchao.mvpdemo;

import com.google.gson.Gson;

/**
 * Created by tufengchao on 2017/6/5.
 */

public class MainPresenterImpl implements IMainPresenter {
    private MainView mainView;
    private MainModel mainModel;

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
        mainModel = new MainModelImpl();
    }

    public void load() {
        mainModel.load(new Listener<FileInfoData>() {
            @Override
            public void success(FileInfoData fileInfoData) {
                mainView.setTextView(new Gson().toJson(fileInfoData));
            }

            @Override
            public void error(Exception ex) {

            }
        });
    }

    @Override
    public void destoryView() {
        mainView = null;
        mainModel = null;
    }
}
