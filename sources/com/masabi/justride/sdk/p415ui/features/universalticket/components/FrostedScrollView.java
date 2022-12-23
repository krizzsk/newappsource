package com.masabi.justride.sdk.p415ui.features.universalticket.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;
import p605ki.C18059m;
import p605ki.C18061o;
import p605ki.C18063q;
import p895wo.C20380a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\f"}, mo59060d2 = {"Lcom/masabi/justride/sdk/ui/features/universalticket/components/FrostedScrollView;", "Landroid/widget/RelativeLayout;", "Landroid/view/View;", "getScrollSubview", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.components.FrostedScrollView */
public final class FrostedScrollView extends RelativeLayout {

    /* renamed from: g */
    public static final /* synthetic */ int f37222g = 0;

    /* renamed from: b */
    public final float f37223b;

    /* renamed from: c */
    public float f37224c;

    /* renamed from: d */
    public final NestedScrollView f37225d;

    /* renamed from: e */
    public final View f37226e;

    /* renamed from: f */
    public final View f37227f;

    public FrostedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo44452a(View view) {
        C24362h.m61211f(view, "subview");
        this.f37225d.setScrollY(0);
        this.f37225d.removeAllViews();
        this.f37225d.addView(view);
    }

    /* renamed from: b */
    public final void mo44453b(int i) {
        float f = (float) i;
        float f2 = this.f37223b;
        if (f < f2) {
            this.f37226e.setAlpha(f / f2);
        } else {
            this.f37226e.setAlpha(1.0f);
        }
        float f3 = this.f37224c;
        if (f > f3) {
            this.f37227f.setAlpha(((float) 1) - ((f - f3) / this.f37223b));
            return;
        }
        this.f37227f.setAlpha(1.0f);
    }

    public final View getScrollSubview() {
        return this.f37225d.getChildAt(0);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View scrollSubview = getScrollSubview();
        if (scrollSubview == null) {
            this.f37224c = BitmapDescriptorFactory.HUE_RED;
            this.f37226e.setAlpha(BitmapDescriptorFactory.HUE_RED);
            this.f37227f.setAlpha(BitmapDescriptorFactory.HUE_RED);
            return;
        }
        this.f37224c = ((float) (scrollSubview.getHeight() - this.f37225d.getHeight())) - this.f37223b;
        mo44453b(this.f37225d.getScrollY());
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            int size = View.MeasureSpec.getSize(i2);
            View scrollSubview = getScrollSubview();
            if (scrollSubview != null) {
                i3 = scrollSubview.getMeasuredHeight();
            } else {
                i3 = 0;
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(getPaddingBottom() + getPaddingTop() + i3, size), mode));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FrostedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        this.f37223b = getResources().getDimension(C18059m.com_masabi_justride_sdk_frosted_cover_height);
        View.inflate(context, C18063q.frosted_scroll_view, this);
        View findViewById = findViewById(C18061o.nestedScrollView);
        C24362h.m61210e(findViewById, "findViewById(R.id.nestedScrollView)");
        NestedScrollView nestedScrollView = (NestedScrollView) findViewById;
        this.f37225d = nestedScrollView;
        View findViewById2 = findViewById(C18061o.frostedCoverTop);
        C24362h.m61210e(findViewById2, "findViewById(R.id.frostedCoverTop)");
        this.f37226e = findViewById2;
        View findViewById3 = findViewById(C18061o.frostedCoverBottom);
        C24362h.m61210e(findViewById3, "findViewById(R.id.frostedCoverBottom)");
        this.f37227f = findViewById3;
        nestedScrollView.setOnScrollChangeListener(new C20380a(this));
    }
}
