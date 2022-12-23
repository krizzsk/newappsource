package com.moovit.commons.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.moovit.commons.utils.UiUtils;
import java.util.WeakHashMap;
import k00.C17988b;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p977zz.C20943i;

/* renamed from: com.moovit.commons.utils.a */
public final class C15780a {

    /* renamed from: com.moovit.commons.utils.a$a */
    public static /* synthetic */ class C15781a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41036a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.commons.utils.UiUtils$Edge[] r0 = com.moovit.commons.utils.UiUtils.Edge.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41036a = r0
                com.moovit.commons.utils.UiUtils$Edge r1 = com.moovit.commons.utils.UiUtils.Edge.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f41036a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.commons.utils.UiUtils$Edge r1 = com.moovit.commons.utils.UiUtils.Edge.TOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f41036a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.commons.utils.UiUtils$Edge r1 = com.moovit.commons.utils.UiUtils.Edge.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f41036a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.commons.utils.UiUtils$Edge r1 = com.moovit.commons.utils.UiUtils.Edge.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.commons.utils.C15780a.C15781a.<clinit>():void");
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static boolean m40268a(Context context) {
        if (!C20943i.m49051d(17) || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: b */
    public static boolean m40269b(View view) {
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6338e.m15063d(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m40270c(View view, int i, View view2, int i2, int i3, int i4, int i5) {
        if (m40269b(view)) {
            int i6 = i - i2;
            i2 = i6 - (i4 - i2);
            i4 = i6;
        }
        view2.layout(i2, i3, i4, i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r9 != 4) goto L_0x002d;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m40271d(android.widget.TextView r8, com.moovit.commons.utils.UiUtils.Edge r9, android.graphics.drawable.Drawable r10) {
        /*
            r0 = 17
            boolean r0 = p977zz.C20943i.m49051d(r0)
            if (r0 == 0) goto L_0x0034
            android.graphics.drawable.Drawable[] r0 = r8.getCompoundDrawablesRelative()
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            r3 = r0[r2]
            r4 = 2
            r5 = r0[r4]
            r6 = 3
            r0 = r0[r6]
            int[] r7 = com.moovit.commons.utils.C15780a.C15781a.f41036a
            int r9 = r9.ordinal()
            r9 = r7[r9]
            if (r9 == r2) goto L_0x0030
            if (r9 == r4) goto L_0x002c
            if (r9 == r6) goto L_0x002a
            r2 = 4
            if (r9 == r2) goto L_0x002e
            goto L_0x002d
        L_0x002a:
            r5 = r10
            goto L_0x002d
        L_0x002c:
            r3 = r10
        L_0x002d:
            r10 = r0
        L_0x002e:
            r0 = r10
            r10 = r1
        L_0x0030:
            r8.setCompoundDrawablesRelativeWithIntrinsicBounds(r10, r3, r5, r0)
            goto L_0x0037
        L_0x0034:
            com.moovit.commons.utils.UiUtils.m40261t(r8, r9, r10)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.commons.utils.C15780a.m40271d(android.widget.TextView, com.moovit.commons.utils.UiUtils$Edge, android.graphics.drawable.Drawable):void");
    }

    /* renamed from: e */
    public static void m40272e(TextView textView, int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = C17988b.m44611b(i, textView.getContext());
        }
        m40271d(textView, UiUtils.Edge.LEFT, drawable);
    }

    /* renamed from: f */
    public static void m40273f(int i, View view) {
        if (C20943i.m49051d(17)) {
            view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        } else {
            view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
    }
}
