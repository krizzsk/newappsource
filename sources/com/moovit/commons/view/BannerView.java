package com.moovit.commons.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.C0801k;
import com.moovit.commons.utils.UiUtils;
import f00.C16918f;
import f00.C16919g;
import k00.C17988b;
import p310x5.C7156a;
import p622kz.C18159a;
import p622kz.C18162d;
import p622kz.C18164f;
import p622kz.C18165g;
import p977zz.C20964s0;

public class BannerView extends ConstraintLayout {

    /* renamed from: j */
    public static final /* synthetic */ int f41046j = 0;

    /* renamed from: h */
    public final TextView f41047h;

    /* renamed from: i */
    public final ImageButton f41048i;

    public BannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C18159a.bannerViewStyle);
    }

    /* renamed from: c */
    public final void mo47021c(int i, CharSequence charSequence, String str) {
        C16918f fVar;
        if (C20964s0.m49090h(charSequence)) {
            setVisibility(8);
            return;
        }
        Context context = getContext();
        if (!C20964s0.m49090h(str)) {
            fVar = new C16918f(context.getSharedPreferences("banner_view", 0), new C16919g.C16920a(str, false));
        } else {
            fVar = null;
        }
        if (fVar == null || !((Boolean) fVar.mo49542a()).booleanValue()) {
            this.f41047h.setText(charSequence);
            TextView textView = this.f41047h;
            UiUtils.m40261t(textView, UiUtils.Edge.LEFT, C17988b.m44611b(i, textView.getContext()));
            this.f41048i.setOnClickListener(new C7156a(5, this, fVar));
            setVisibility(0);
            return;
        }
        setVisibility(8);
    }

    public void setTextAppearance(int i) {
        C0801k.m2424f(this.f41047h, i);
    }

    public BannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C18164f.banner_view, this, true);
        this.f41047h = (TextView) findViewById(C18162d.text);
        ImageButton imageButton = (ImageButton) findViewById(C18162d.button);
        this.f41048i = imageButton;
        TypedArray o = UiUtils.m40256o(context, attributeSet, C18165g.BannerView, i);
        try {
            int i2 = 0;
            int resourceId = o.getResourceId(C18165g.BannerView_android_textAppearance, 0);
            if (resourceId != 0) {
                setTextAppearance(resourceId);
            }
            Drawable drawable = o.getDrawable(C18165g.BannerView_dismissIcon);
            int resourceId2 = o.getResourceId(C18165g.BannerView_dismissIconContentDescription, 0);
            imageButton.setImageDrawable(drawable);
            imageButton.setVisibility(drawable == null ? 8 : i2);
            imageButton.setContentDescription(resourceId2 != 0 ? imageButton.getContext().getString(resourceId2) : null);
        } finally {
            o.recycle();
        }
    }
}
