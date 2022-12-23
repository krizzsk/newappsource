package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p355ac.C13401b;
import p355ac.C13407h;

public final class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: t */
    public static final int[] f35337t = {C13401b.snackbarButtonStyle, C13401b.snackbarTextViewStyle};

    /* renamed from: q */
    public final AccessibilityManager f35338q;

    /* renamed from: r */
    public boolean f35339r;

    /* renamed from: s */
    public C14123a f35340s;

    public static final class SnackbarLayout extends BaseTransientBottomBar.C14121f {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$a */
    public static class C14123a extends BaseTransientBottomBar.C14119d<Snackbar> {
        /* renamed from: c */
        public void mo42237b(Snackbar snackbar) {
        }
    }

    public Snackbar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f35338q = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: k */
    public static Snackbar m35158k(int i, View view, CharSequence charSequence) {
        ViewGroup viewGroup;
        int i2;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (!(view instanceof CoordinatorLayout)) {
                if (view instanceof FrameLayout) {
                    if (view.getId() == 16908290) {
                        viewGroup = (ViewGroup) view;
                        break;
                    }
                    viewGroup2 = (ViewGroup) view;
                }
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                        continue;
                    } else {
                        view = null;
                        continue;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                viewGroup = (ViewGroup) view;
                break;
            }
        }
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f35337t);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            boolean z = true;
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            if (resourceId == -1 || resourceId2 == -1) {
                z = false;
            }
            if (z) {
                i2 = C13407h.mtrl_layout_snackbar_include;
            } else {
                i2 = C13407h.design_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, viewGroup, false);
            Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) snackbar.f35310c.getChildAt(0)).getMessageView().setText(charSequence);
            snackbar.f35312e = i;
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* renamed from: l */
    public static Snackbar m35159l(View view, int i, int i2) {
        return m35158k(i2, view, view.getResources().getText(i));
    }

    /* renamed from: b */
    public final void mo42225b() {
        mo42226c(3);
    }

    /* renamed from: j */
    public final int mo42255j() {
        int i;
        int i2 = this.f35312e;
        if (i2 == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f35339r) {
                i = 4;
            } else {
                i = 0;
            }
            return this.f35338q.getRecommendedTimeoutMillis(i2, i | 1 | 2);
        } else if (!this.f35339r || !this.f35338q.isTouchExplorationEnabled()) {
            return i2;
        } else {
            return -2;
        }
    }

    /* renamed from: m */
    public final void mo42256m(int i, View.OnClickListener onClickListener) {
        mo42257n(this.f35309b.getText(i), onClickListener);
    }

    /* renamed from: n */
    public final void mo42257n(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f35310c.getChildAt(0)).getActionView();
        if (!TextUtils.isEmpty(charSequence)) {
            this.f35339r = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new C14131h(this, onClickListener));
            return;
        }
        actionView.setVisibility(8);
        actionView.setOnClickListener((View.OnClickListener) null);
        this.f35339r = false;
    }

    /* renamed from: o */
    public final void mo42258o(int i) {
        ((SnackbarContentLayout) this.f35310c.getChildAt(0)).getMessageView().setText(this.f35309b.getText(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42259p() {
        /*
            r7 = this;
            com.google.android.material.snackbar.i r0 = com.google.android.material.snackbar.C14132i.m35170b()
            int r1 = r7.mo42255j()
            com.google.android.material.snackbar.BaseTransientBottomBar$c r2 = r7.f35321n
            java.lang.Object r3 = r0.f35354a
            monitor-enter(r3)
            boolean r4 = r0.mo42276c(r2)     // Catch:{ all -> 0x0073 }
            if (r4 == 0) goto L_0x0023
            com.google.android.material.snackbar.i$c r2 = r0.f35356c     // Catch:{ all -> 0x0073 }
            r2.f35360b = r1     // Catch:{ all -> 0x0073 }
            android.os.Handler r1 = r0.f35355b     // Catch:{ all -> 0x0073 }
            r1.removeCallbacksAndMessages(r2)     // Catch:{ all -> 0x0073 }
            com.google.android.material.snackbar.i$c r1 = r0.f35356c     // Catch:{ all -> 0x0073 }
            r0.mo42277d(r1)     // Catch:{ all -> 0x0073 }
            monitor-exit(r3)     // Catch:{ all -> 0x0073 }
            goto L_0x0070
        L_0x0023:
            com.google.android.material.snackbar.i$c r4 = r0.f35357d     // Catch:{ all -> 0x0073 }
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0039
            if (r2 == 0) goto L_0x0035
            java.lang.ref.WeakReference<com.google.android.material.snackbar.i$b> r4 = r4.f35359a     // Catch:{ all -> 0x0073 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0073 }
            if (r4 != r2) goto L_0x0035
            r4 = 1
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            if (r4 == 0) goto L_0x0039
            r5 = 1
        L_0x0039:
            if (r5 == 0) goto L_0x0040
            com.google.android.material.snackbar.i$c r2 = r0.f35357d     // Catch:{ all -> 0x0073 }
            r2.f35360b = r1     // Catch:{ all -> 0x0073 }
            goto L_0x0047
        L_0x0040:
            com.google.android.material.snackbar.i$c r4 = new com.google.android.material.snackbar.i$c     // Catch:{ all -> 0x0073 }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x0073 }
            r0.f35357d = r4     // Catch:{ all -> 0x0073 }
        L_0x0047:
            com.google.android.material.snackbar.i$c r1 = r0.f35356c     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0054
            r2 = 4
            boolean r1 = r0.mo42275a(r1, r2)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0054
            monitor-exit(r3)     // Catch:{ all -> 0x0073 }
            goto L_0x0070
        L_0x0054:
            r1 = 0
            r0.f35356c = r1     // Catch:{ all -> 0x0073 }
            com.google.android.material.snackbar.i$c r2 = r0.f35357d     // Catch:{ all -> 0x0073 }
            if (r2 == 0) goto L_0x006f
            r0.f35356c = r2     // Catch:{ all -> 0x0073 }
            r0.f35357d = r1     // Catch:{ all -> 0x0073 }
            java.lang.ref.WeakReference<com.google.android.material.snackbar.i$b> r2 = r2.f35359a     // Catch:{ all -> 0x0073 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0073 }
            com.google.android.material.snackbar.i$b r2 = (com.google.android.material.snackbar.C14132i.C14134b) r2     // Catch:{ all -> 0x0073 }
            if (r2 == 0) goto L_0x006d
            r2.show()     // Catch:{ all -> 0x0073 }
            goto L_0x006f
        L_0x006d:
            r0.f35356c = r1     // Catch:{ all -> 0x0073 }
        L_0x006f:
            monitor-exit(r3)     // Catch:{ all -> 0x0073 }
        L_0x0070:
            return
        L_0x0071:
            monitor-exit(r3)     // Catch:{ all -> 0x0073 }
            throw r0
        L_0x0073:
            r0 = move-exception
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.Snackbar.mo42259p():void");
    }
}
