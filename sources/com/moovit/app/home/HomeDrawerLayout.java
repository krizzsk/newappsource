package com.moovit.app.home;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.drawerlayout.widget.DrawerLayout;

public class HomeDrawerLayout extends DrawerLayout {
    public HomeDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean fitSystemWindows(Rect rect) {
        return true;
    }

    public HomeDrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
