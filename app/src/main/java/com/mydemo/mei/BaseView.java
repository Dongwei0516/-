package com.mydemo.mei;

import android.view.View;

public class BaseView {

	public boolean isScroll=true;
	public View view;
	public MyMoveView myMoveView;
	

	public void setMyMoveView(MyMoveView myMoveView) {
		this.myMoveView = myMoveView;
	}

	public boolean isScroll() {
		return isScroll;
	}

	public void setScroll(boolean isScroll) {
		this.isScroll = isScroll;
	}

	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}
	
}
