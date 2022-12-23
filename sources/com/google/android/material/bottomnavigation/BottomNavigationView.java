package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.navigation.C14103d;
import com.google.android.material.navigation.NavigationBarView;
import p355ac.C13401b;
import p433dc.C16539b;

public class BottomNavigationView extends NavigationBarView {

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    public interface C13915a extends NavigationBarView.C14091b {
    }

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    public interface C13916b extends NavigationBarView.C14092c {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.bottomNavigationStyle);
    }

    /* renamed from: a */
    public final C14103d mo41046a(Context context) {
        return new C16539b(context);
    }

    public int getMaxItemCount() {
        return 5;
    }

    public final void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            int paddingTop = getPaddingTop();
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getPaddingBottom() + paddingTop + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        C16539b bVar = (C16539b) getMenuView();
        if (bVar.f43173J != z) {
            bVar.setItemHorizontalTranslationEnabled(z);
            getPresenter().mo1054i(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(C13915a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(C13916b bVar) {
        setOnItemSelectedListener(bVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomNavigationView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = p355ac.C13410k.Widget_Design_BottomNavigationView
            r6.<init>(r7, r8, r9, r4)
            android.content.Context r0 = r6.getContext()
            int[] r2 = p355ac.C13411l.BottomNavigationView
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            androidx.appcompat.widget.h1 r8 = com.google.android.material.internal.C14077m.m35061e(r0, r1, r2, r3, r4, r5)
            int r9 = p355ac.C13411l.BottomNavigationView_itemHorizontalTranslationEnabled
            r0 = 1
            boolean r9 = r8.mo2087a(r9, r0)
            r6.setItemHorizontalTranslationEnabled(r9)
            int r9 = p355ac.C13411l.BottomNavigationView_android_minHeight
            boolean r0 = r8.mo2098l(r9)
            if (r0 == 0) goto L_0x002d
            int r7 = r8.mo2090d(r9, r7)
            r6.setMinimumHeight(r7)
        L_0x002d:
            r8.mo2099n()
            dc.c r7 = new dc.c
            r7.<init>()
            com.google.android.material.internal.C14083r.m35065a(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomnavigation.BottomNavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
