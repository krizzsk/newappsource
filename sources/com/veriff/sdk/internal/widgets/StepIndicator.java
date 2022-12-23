package com.veriff.sdk.internal.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bf0.C21050d;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C22700xq;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.R$color;
import mobi.lab.veriff.R$dimen;
import mobi.lab.veriff.R$drawable;
import mobi.lab.veriff.R$styleable;
import mobi.lab.veriff.util.C24469n;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0019"}, mo59060d2 = {"Lcom/veriff/sdk/internal/widgets/StepIndicator;", "Landroid/widget/LinearLayout;", "", "level", "Lbf0/d;", "addIndicator", "color", "addSpacer", "index", "count", "populate", "indicatorSize", "I", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "resourcesProvider", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "spacerHeight", "spacerWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class StepIndicator extends LinearLayout {

    /* renamed from: a */
    private final C22700xq f57302a;

    /* renamed from: b */
    private final int f57303b;

    /* renamed from: c */
    private final int f57304c;

    /* renamed from: d */
    private final int f57305d;

    public StepIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StepIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: b */
    private final void m55225b(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f57305d, this.f57304c);
        layoutParams.gravity = 16;
        View view = new View(getContext());
        view.setBackground(new ColorDrawable(i));
        C21050d dVar = C21050d.f52856a;
        addView(view, layoutParams);
    }

    /* renamed from: a */
    public final void mo57004a(int i, int i2) {
        int i3;
        removeAllViews();
        int i4 = 0;
        while (i4 < i2) {
            m55224a(i4 < i ? 0 : i4 == i ? 1 : 2);
            if (i4 < i2 - 1) {
                if (i4 < i) {
                    i3 = this.f57302a.mo57135v().mo57095j();
                } else {
                    i3 = getResources().getColor(R$color.vrffDocument_selection_sepparator);
                }
                m55225b(i3);
            }
            i4++;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StepIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        int i2 = 0;
        setOrientation(0);
        setGravity(1);
        setShowDividers(0);
        TypedArray obtainAttributes = attributeSet != null ? getResources().obtainAttributes(attributeSet, R$styleable.vrffStepIndicator) : null;
        int integer = obtainAttributes != null ? obtainAttributes.getInteger(R$styleable.vrffStepIndicator_vrff_step_count, 4) : 4;
        i2 = obtainAttributes != null ? obtainAttributes.getInteger(R$styleable.vrffStepIndicator_vrff_step_index, 0) : i2;
        this.f57302a = new C22700xq(context, C24469n.f61931a.mo60713a());
        this.f57303b = getResources().getDimensionPixelSize(R$dimen.vrff_margin_l);
        this.f57304c = getResources().getDimensionPixelSize(R$dimen.vrff_step_spacer_height);
        this.f57305d = getResources().getDimensionPixelSize(R$dimen.vrff_step_spacer_width);
        mo57004a(i2, integer);
        if (obtainAttributes != null) {
            obtainAttributes.recycle();
        }
    }

    /* renamed from: a */
    private final void m55224a(int i) {
        Drawable drawable;
        int i2 = this.f57303b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 16;
        if (i != 2) {
            drawable = this.f57302a.mo57134u();
        } else {
            drawable = getResources().getDrawable(R$drawable.vrff_step_indicator);
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(drawable);
        imageView.setImageLevel(i);
        C21050d dVar = C21050d.f52856a;
        addView(imageView, layoutParams);
    }
}
