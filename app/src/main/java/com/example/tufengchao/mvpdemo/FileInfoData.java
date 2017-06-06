package com.example.tufengchao.mvpdemo;

import java.util.List;

/**
 * Created by tufengchao on 2017/6/5.
 */

public class FileInfoData {

    private String result;
    private String message;
    private String filmNum;
    private List<FileInfo> filmInfo;

    public List<FileInfo> getFilmInfo() {
        return filmInfo;
    }

    public void setFilmInfo(List<FileInfo> filmInfo) {
        this.filmInfo = filmInfo;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFilmNum() {
        return filmNum;
    }

    public void setFilmNum(String filmNum) {
        this.filmNum = filmNum;
    }
}
