package com.example.youkumenu;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;


public class MainActivity extends Activity implements OnClickListener{
	private String tag = MainActivity.class.getSimpleName();
	private ImageView iv_home;
	private boolean isShowLevel2 = true;//是否显示二级菜单
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initListener();
    }

	private void initView() {
		setContentView(R.layout.activity_main);
		iv_home = (ImageView) findViewById(R.id.iv_home);
		
	}
	
	private void initListener() {
		iv_home.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.iv_home:
			if (isShowLevel2) {
				//需要隐藏
				Log.e(tag, "执行隐藏");
			}else {
				//需要显示
				Log.e(tag, "执行显示");
			}
			isShowLevel2 = !isShowLevel2;
			break;

		default:
			break;
		}
	}

}
