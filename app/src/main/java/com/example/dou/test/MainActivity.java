package com.example.dou.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TabHost;

public class MainActivity extends Activity implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup mainTab;
    private TabHost tabhost;
    private Intent iHome;
    private Intent iNews;
    private Intent iInfo;
    private Intent iSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainTab=(RadioGroup)findViewById(R.id.main_tab);
        mainTab.setOnCheckedChangeListener(this);
        tabhost = (TabHost)findViewById(R.id.tabhost);

        iHome = new Intent(this, HomeActivity.class);
        /*tabhost.addTab(tabhost.newTabSpec("Home")
                .setIndicator(getResources().getString(R.string.main_home), getResources().getDrawable(R.drawable.tou))
                .setContent(iHome));
       */
        iNews = new Intent(this, SaleActivity.class);
        /*tabhost.addTab(tabhost.newTabSpec("sale")
                .setIndicator(getResources().getString(R.string.main_news), getResources().getDrawable(R.drawable.test))
                .setContent(iNews));
        */
        iInfo = new Intent(this, RecommendActivity.class);
        /*tabhost.addTab(tabhost.newTabSpec("recommend")
                .setIndicator(getResources().getString(R.string.main_my_info), getResources().getDrawable(R.drawable.test))
                .setContent(iInfo));
        */
        iSearch = new Intent(this,InfoActivity.class);
        /*tabhost.addTab(tabhost.newTabSpec("me")
                .setIndicator(getResources().getString(R.string.menu_search), getResources().getDrawable(R.drawable.test))
                .setContent(iSearch));
         */
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch(checkedId){
            case R.id.radio_button0:
                this.tabhost.setCurrentTabByTag("Home");
                break;
            case R.id.radio_button1:
                this.tabhost.setCurrentTabByTag("sale");
                break;
            case R.id.radio_button3:
                this.tabhost.setCurrentTabByTag("recommand");
                break;
            case R.id.radio_button4:
                this.tabhost.setCurrentTabByTag("info");
                break;
        }
    }
}
