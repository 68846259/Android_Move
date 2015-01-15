package com.zengw.tetris;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Shape extends LinearLayout {
	private Context context;
	private int WIDTH = 10;
	private int HEIGH = 24;
	private int cell_width;

	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		super.onSizeChanged(w, h, oldw, oldh);
		cell_width = Math.min(w / WIDTH, h / HEIGH);
		Draw();
	}

	private void Draw() {
		ImageView iv;
		LinearLayout line;
		LinearLayout.LayoutParams lineLp;
		for (int y = 0; y < HEIGH; y++) {
			line = new LinearLayout(getContext());
//			lineLp = new LinearLayout.LayoutParams(-1, cell_width);
			addView(line);
			for (int x = 0; x < WIDTH; x++) {
				iv = new ImageView(context);
				iv.setBackgroundResource(R.drawable.cube_960_011);
				line.addView(iv, cell_width, cell_width);
			}

		}
	}

	public Shape(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.context = context;
	}

	public Shape(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
		setOrientation(LinearLayout.VERTICAL);

	}

	public Shape(Context context) {
		super(context);
		this.context = context;
	}

}
