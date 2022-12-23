package com.moovit.commons.view.property;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.property.C15828a;
import p622kz.C18165g;

public class FractionalRelativeLayout extends RelativeLayout implements C15828a {

    /* renamed from: b */
    public C15828a.C15829a f41311b;

    public FractionalRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public float getFractionX() {
        return getTranslationX() / ((float) getWidth());
    }

    public float getFractionY() {
        return getTranslationY() / ((float) getHeight());
    }

    public void setFractionX(float f) {
        if (getWidth() == 0) {
            if (this.f41311b == null) {
                this.f41311b = new C15828a.C15829a(this, this);
            }
            this.f41311b.f41314d = f;
            return;
        }
        this.f41311b = null;
        setTranslationX(f * ((float) getWidth()));
    }

    public void setFractionY(float f) {
        if (getHeight() == 0) {
            if (this.f41311b == null) {
                this.f41311b = new C15828a.C15829a(this, this);
            }
            this.f41311b.f41315e = f;
            return;
        }
        this.f41311b = null;
        setTranslationY(f * ((float) getHeight()));
    }

    public FractionalRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41311b = null;
        TypedArray o = UiUtils.m40256o(context, attributeSet, C18165g.FractionalView, i);
        try {
            float f = o.getFloat(C18165g.FractionalView_fractionX, BitmapDescriptorFactory.HUE_RED);
            if (f != BitmapDescriptorFactory.HUE_RED) {
                setFractionX(f);
            }
            float f2 = o.getFloat(C18165g.FractionalView_fractionY, BitmapDescriptorFactory.HUE_RED);
            if (f2 != BitmapDescriptorFactory.HUE_RED) {
                setFractionY(f2);
            }
        } finally {
            o.recycle();
        }
    }
}
