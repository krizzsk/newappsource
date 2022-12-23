package com.moovit.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import c20.C13744a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import p242s1.C6333d0;
import p583jk.C17884p;
import p883wc.C20289a;
import p977zz.C20941h;
import r10.C19220d;
import r10.C19221e;
import w00.C20261b;
import w00.C20263d;
import w00.C20264e;
import w00.C20266g;
import w00.C20267h;

public class AlertMessageView extends LinearLayout {

    /* renamed from: j */
    public static final int f41341j = C20266g.Widget_Moovit_AlertMessage;

    /* renamed from: b */
    public final ImageView f41342b;

    /* renamed from: c */
    public final Space f41343c;

    /* renamed from: d */
    public final TextView f41344d;

    /* renamed from: e */
    public final View f41345e;

    /* renamed from: f */
    public final TextView f41346f;

    /* renamed from: g */
    public final View f41347g;

    /* renamed from: h */
    public final Button f41348h;

    /* renamed from: i */
    public final Button f41349i;

    public AlertMessageView() {
        throw null;
    }

    public AlertMessageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C20261b.alertMessageStyle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (com.moovit.commons.utils.UiUtils.m40242a(r6.f41342b, r6.f41344d, r6.f41346f) != false) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47690a() {
        /*
            r6 = this;
            java.util.WeakHashMap<android.view.View, s1.p0> r0 = p242s1.C6333d0.f19990a
            boolean r0 = p242s1.C6333d0.C6340g.m15075b(r6)
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            android.widget.ImageView r0 = r6.f41342b
            int r0 = r0.getVisibility()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001d
            android.widget.TextView r0 = r6.f41344d
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x001d
            r0 = 1
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            android.widget.Space r3 = r6.f41343c
            r4 = 8
            if (r0 == 0) goto L_0x0026
            r0 = 0
            goto L_0x0028
        L_0x0026:
            r0 = 8
        L_0x0028:
            r3.setVisibility(r0)
            android.widget.TextView r0 = r6.f41346f
            int r0 = r0.getVisibility()
            r3 = 2
            if (r0 != 0) goto L_0x0046
            android.view.View[] r0 = new android.view.View[r3]
            android.widget.ImageView r5 = r6.f41342b
            r0[r2] = r5
            android.widget.TextView r5 = r6.f41344d
            r0[r1] = r5
            boolean r0 = com.moovit.commons.utils.UiUtils.m40242a(r0)
            if (r0 == 0) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            android.view.View r5 = r6.f41345e
            if (r0 == 0) goto L_0x004d
            r0 = 0
            goto L_0x004f
        L_0x004d:
            r0 = 8
        L_0x004f:
            r5.setVisibility(r0)
            android.view.View[] r0 = new android.view.View[r3]
            android.widget.Button r5 = r6.f41348h
            r0[r2] = r5
            android.widget.Button r5 = r6.f41349i
            r0[r1] = r5
            boolean r0 = com.moovit.commons.utils.UiUtils.m40242a(r0)
            if (r0 == 0) goto L_0x0078
            r0 = 3
            android.view.View[] r0 = new android.view.View[r0]
            android.widget.ImageView r5 = r6.f41342b
            r0[r2] = r5
            android.widget.TextView r5 = r6.f41344d
            r0[r1] = r5
            android.widget.TextView r5 = r6.f41346f
            r0[r3] = r5
            boolean r0 = com.moovit.commons.utils.UiUtils.m40242a(r0)
            if (r0 == 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r1 = 0
        L_0x0079:
            android.view.View r0 = r6.f41347g
            if (r1 == 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r2 = 8
        L_0x0080:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.design.view.AlertMessageView.mo47690a():void");
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo47690a();
    }

    public void setImage(Image image) {
        C13744a.m34300b(this.f41342b, image);
        mo47690a();
    }

    public void setImageAdjustViewBounds(boolean z) {
        ImageView.ScaleType scaleType;
        this.f41342b.setAdjustViewBounds(z);
        ImageView imageView = this.f41342b;
        if (z) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else {
            scaleType = ImageView.ScaleType.CENTER_INSIDE;
        }
        imageView.setScaleType(scaleType);
    }

    public void setNegativeButton(CharSequence charSequence) {
        UiUtils.m40234B(this.f41349i, charSequence);
        mo47690a();
    }

    public void setNegativeButtonClickListener(View.OnClickListener onClickListener) {
        this.f41349i.setOnClickListener(onClickListener);
    }

    public void setPositiveButton(CharSequence charSequence) {
        UiUtils.m40234B(this.f41348h, charSequence);
        mo47690a();
    }

    public void setPositiveButtonClickListener(View.OnClickListener onClickListener) {
        this.f41348h.setOnClickListener(onClickListener);
    }

    public void setSubtitle(CharSequence charSequence) {
        UiUtils.m40234B(this.f41346f, charSequence);
        mo47690a();
    }

    public void setTitle(CharSequence charSequence) {
        UiUtils.m40234B(this.f41344d, charSequence);
        mo47690a();
    }

    public AlertMessageView(Context context, AttributeSet attributeSet, int i) {
        super(C20289a.m47861a(context, attributeSet, i, f41341j), attributeSet, i);
        Context context2 = getContext();
        setOrientation(1);
        setGravity(1);
        LayoutInflater.from(context2).inflate(C20264e.alert_message_view, this, true);
        this.f41342b = (ImageView) findViewById(C20263d.icon);
        this.f41343c = (Space) findViewById(C20263d.title_space);
        TextView textView = (TextView) findViewById(C20263d.title);
        this.f41344d = textView;
        C6333d0.m15030r(textView, true);
        this.f41345e = findViewById(C20263d.subtitle_space);
        this.f41346f = (TextView) findViewById(C20263d.subtitle);
        this.f41347g = findViewById(C20263d.buttons_space);
        Button button = (Button) findViewById(C20263d.positive_button);
        this.f41348h = button;
        Button button2 = (Button) findViewById(C20263d.negative_button);
        this.f41349i = button2;
        TypedArray o = UiUtils.m40256o(context2, attributeSet, C20267h.AlertMessageView, i);
        try {
            setImage(C20941h.m49042e(context2, o, C20267h.AlertMessageView_android_icon));
            setImageAdjustViewBounds(o.getBoolean(C20267h.AlertMessageView_icon_adjustViewBounds, false));
            setTitle(o.getText(C20267h.AlertMessageView_title));
            setSubtitle(o.getText(C20267h.AlertMessageView_android_subtitle));
            setPositiveButton(o.getText(C20267h.AlertMessageView_android_positiveButtonText));
            setNegativeButton(o.getText(C20267h.AlertMessageView_android_negativeButtonText));
            int layoutDimension = o.getLayoutDimension(C20267h.AlertMessageView_buttons_layoutWidth, -2);
            button.getLayoutParams().width = layoutDimension;
            button2.getLayoutParams().width = layoutDimension;
        } finally {
            o.recycle();
        }
    }

    public void setImage(Drawable drawable) {
        ImageView imageView = this.f41342b;
        if (drawable != null) {
            ((C19220d) C17884p.m44354Y(imageView).mo10871m().mo10852V(drawable)).mo10850T(imageView);
            imageView.setVisibility(0);
        } else {
            C17884p.m44354Y(imageView).mo10872n(imageView);
            imageView.setImageDrawable((Drawable) null);
            imageView.setVisibility(8);
        }
        mo47690a();
    }

    public void setNegativeButton(int i) {
        UiUtils.m40233A(this.f41349i, i);
        mo47690a();
    }

    public void setPositiveButton(int i) {
        UiUtils.m40233A(this.f41348h, i);
        mo47690a();
    }

    public void setSubtitle(int i) {
        UiUtils.m40233A(this.f41346f, i);
        mo47690a();
    }

    public void setTitle(int i) {
        UiUtils.m40233A(this.f41344d, i);
        mo47690a();
    }

    public void setImage(int i) {
        ImageView imageView = this.f41342b;
        if (i != 0) {
            C19221e Y = C17884p.m44354Y(imageView);
            ((C19220d) Y.mo10871m().mo10854X(Integer.valueOf(i))).mo10850T(imageView);
            imageView.setVisibility(0);
        } else {
            C17884p.m44354Y(imageView).mo10872n(imageView);
            imageView.setImageDrawable((Drawable) null);
            imageView.setVisibility(8);
        }
        mo47690a();
    }
}
