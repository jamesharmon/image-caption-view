package com.androiddevtools.chapter1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {

	public MyView(Context context) {
		super(context);
	}

	public MyView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MyView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

}
