package com.example.tidus.ristrat.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.tidus.ristrat.R;
import com.example.tidus.ristrat.adapter.LogListAdapter;
import com.example.tidus.ristrat.application.App;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LogActivity extends AppCompatActivity {

    @BindView(R.id.iv_close)
    ImageView iv_close;
    @BindView(R.id.rv_log_message)
    RecyclerView rv_log_message;
    private List<String> logList;
    private LogListAdapter logListAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_log);
        ButterKnife.bind(this);
        initView(new Intent());

    }

    private void initView(Intent intent) {
        logList = intent.getStringArrayListExtra("logList");
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        logListAdapter = new LogListAdapter(App.getContext());
        rv_log_message.setLayoutManager(new LinearLayoutManager(App.getContext()));
        rv_log_message.setAdapter(logListAdapter);
        logListAdapter.setLogList(logList);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logList = null;
    }
}
