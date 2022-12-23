package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C14083r;
import com.google.android.material.tabs.TabLayout;
import p380bc.C13577a;

/* renamed from: com.google.android.material.tabs.a */
public class C14147a {
    /* renamed from: a */
    public static RectF m35210a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f35376C || !(view instanceof TabLayout.C14145i)) {
            return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        }
        TabLayout.C14145i iVar = (TabLayout.C14145i) view;
        int contentWidth = iVar.getContentWidth();
        int contentHeight = iVar.getContentHeight();
        int b = (int) C14083r.m35066b(24, iVar.getContext());
        if (contentWidth < b) {
            contentWidth = b;
        }
        int right = (iVar.getRight() + iVar.getLeft()) / 2;
        int bottom = (iVar.getBottom() + iVar.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF((float) (right - i), (float) (bottom - (contentHeight / 2)), (float) (i + right), (float) ((right / 2) + bottom));
    }

    /* renamed from: b */
    public void mo42381b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF a = m35210a(tabLayout, view);
        RectF a2 = m35210a(tabLayout, view2);
        drawable.setBounds(C13577a.m33994b(f, (int) a.left, (int) a2.left), drawable.getBounds().top, C13577a.m33994b(f, (int) a.right, (int) a2.right), drawable.getBounds().bottom);
    }
}
