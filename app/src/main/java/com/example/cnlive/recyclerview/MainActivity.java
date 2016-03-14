package com.example.cnlive.recyclerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private List<String> list;
    private RecyclerView recyclerView;
    private UserAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initData();
        iniView();
        adapter=new UserAdapter(this,list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));
    }

    private void iniView() {
    recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
    }

    private void initData() {
        list=new ArrayList<String>();
        for(int i='A';i< 'z';i++){
            list.add(""+(char)i);
        }

//      list.add(new UserCenter(UserCenter.TYPE_HEAD,0,""));
//        list.add(new UserCenter(UserCenter.TYPE_ITEM,R.drawable.ic_download,"缓存"));
//        list.add(new UserCenter(UserCenter.TYPE_ITEM,R.drawable.ic_history,"记录"));
//        list.add(new UserCenter(UserCenter.TYPE_ITEM,R.drawable.ic_like,"收藏"));
//        list.add(new UserCenter(UserCenter.TYPE_ITEM,R.drawable.ic_vip,"开通VIP会员"));
//        list.add(new UserCenter(UserCenter.TYPE_ITEM,R.drawable.ic_buy_history,"购买记录"));
//        list.add(new UserCenter(UserCenter.TYPE_ITEM,R.drawable.ic_set,"设置"));
//        list.add(new UserCenter(UserCenter.TYPE_ITEM,R.drawable.ic_share,"分享"));
//        list.add(new UserCenter(UserCenter.TYPE_ITEM,R.drawable.ic_about,"分享"));
    }

                                                      
}
