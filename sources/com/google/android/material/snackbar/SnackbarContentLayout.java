package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13405f;
import p835uc.C19884g;

public class SnackbarContentLayout extends LinearLayout implements C19884g {

    /* renamed from: b */
    public TextView f35341b;

    /* renamed from: c */
    public Button f35342c;

    /* renamed from: d */
    public int f35343d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final boolean mo42261a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f35341b.getPaddingTop() == i2 && this.f35341b.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f35341b;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6338e.m15066g(textView)) {
            C6333d0.C6338e.m15070k(textView, C6333d0.C6338e.m15065f(textView), i2, C6333d0.C6338e.m15064e(textView), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f35342c;
    }

    public TextView getMessageView() {
        return this.f35341b;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f35341b = (TextView) findViewById(C13405f.snackbar_text);
        this.f35342c = (Button) findViewById(C13405f.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (mo42261a(1, r0, r0 - r2) != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (mo42261a(0, r0, r0) != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto L_0x000b
            return
        L_0x000b:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = p355ac.C13403d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = p355ac.C13403d.design_snackbar_padding_vertical
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f35341b
            android.text.Layout r3 = r3.getLayout()
            int r3 = r3.getLineCount()
            r4 = 0
            if (r3 <= r1) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            if (r3 == 0) goto L_0x0048
            int r5 = r7.f35343d
            if (r5 <= 0) goto L_0x0048
            android.widget.Button r5 = r7.f35342c
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f35343d
            if (r5 <= r6) goto L_0x0048
            int r2 = r0 - r2
            boolean r0 = r7.mo42261a(r1, r0, r2)
            if (r0 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0048:
            if (r3 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = r2
        L_0x004c:
            boolean r0 = r7.mo42261a(r4, r0, r0)
            if (r0 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            if (r1 == 0) goto L_0x0059
            super.onMeasure(r8, r9)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f35343d = i;
    }
}
