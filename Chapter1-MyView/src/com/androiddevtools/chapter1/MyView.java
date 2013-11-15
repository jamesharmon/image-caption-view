package com.androiddevtools.chapter1;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class MyView extends View {

	private static final String TAG = MyView.class.getSimpleName();

	public MyView(Context context) {
		super(context);
		Log.v(TAG, "MyView(Context)");
	}

	public MyView(Context context, AttributeSet attrs) {
		super(context, attrs);
		Log.v(TAG, "MyView(Context, AttributeSet)" + displayAllAttrs(attrs));
	}

	public MyView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		Log.v(TAG, "MyView(Context, AttributeSet, int)" + attrs.toString() + Integer.toString(defStyle));
	}

	private String displayAllAttrs(AttributeSet attrs) {
		StringBuilder attrsString = new StringBuilder();
		int length = attrs.getAttributeCount();
		for (int i = 0; i < length; i++) {
			attrsString.append( "[" + attrs.getAttributeName(i) + "] ");
		}
		return attrsString.toString();
	}

}
