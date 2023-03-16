package com.example.android_study.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.android_study.presenter.QuestionPresenter;

public class QuestionFragment extends MvpFragment<QuestionPresenter> {
    public static QuestionFragment create() {
        return new QuestionFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView view = new TextView(getActivity());
        view.setText("问答");
        view .setGravity(Gravity.CENTER);
        view .setTextColor(Color.RED);
        return view;
    }

    @Override
    protected int getLayoutRes() {
        return 0;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected QuestionPresenter initPresenter() {
        return new QuestionPresenter();
    }

    @Override
    protected void loadData() {

    }
}

