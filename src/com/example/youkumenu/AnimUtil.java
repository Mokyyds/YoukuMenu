package com.example.youkumenu;

import android.view.animation.RotateAnimation;
import android.widget.RelativeLayout;

public class AnimUtil {
	public static void closeMenu(RelativeLayout rl) {
		//旋转对象
		RotateAnimation animation = new RotateAnimation(0, -180,
				RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF,
				1);
		animation.setDuration(500);
		rl.startAnimation(animation);
	}
}
