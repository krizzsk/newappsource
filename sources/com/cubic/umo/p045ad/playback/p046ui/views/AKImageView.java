package com.cubic.umo.p045ad.playback.p046ui.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB%\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R\"\u0010\t\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, mo59060d2 = {"Lcom/cubic/umo/ad/playback/ui/views/AKImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "b", "Z", "isStretchEnabled$ads_release", "()Z", "setStretchEnabled$ads_release", "(Z)V", "isStretchEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.playback.ui.views.AKImageView */
public final class AKImageView extends AppCompatImageView {

    /* renamed from: b */
    public boolean f7337b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C24362h.m61208c(context);
    }

    public final void onMeasure(int i, int i2) {
        if (!this.f7337b) {
            super.onMeasure(i, i2);
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, (drawable.getIntrinsicHeight() * size) / drawable.getIntrinsicWidth());
    }

    public final void setStretchEnabled$ads_release(boolean z) {
        this.f7337b = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C24362h.m61208c(context);
    }
}
