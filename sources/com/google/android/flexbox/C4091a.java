package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* renamed from: com.google.android.flexbox.a */
public interface C4091a {
    /* renamed from: a */
    void mo16767a(View view, int i, int i2, C4092b bVar);

    /* renamed from: b */
    int mo16769b(int i, int i2, int i3);

    /* renamed from: c */
    View mo16770c(int i);

    /* renamed from: d */
    int mo16772d(int i, int i2, int i3);

    /* renamed from: e */
    int mo16773e(View view);

    /* renamed from: f */
    void mo16774f(C4092b bVar);

    /* renamed from: g */
    View mo16775g(int i);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<C4092b> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    /* renamed from: h */
    void mo16793h(int i, View view);

    /* renamed from: i */
    int mo16794i(View view, int i, int i2);

    /* renamed from: j */
    boolean mo16795j();

    void setFlexLines(List<C4092b> list);
}
