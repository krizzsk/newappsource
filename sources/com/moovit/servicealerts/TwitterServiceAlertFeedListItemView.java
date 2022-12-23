package com.moovit.servicealerts;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.textview.MaterialTextView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ImageOrTextSubtitleListItemView;
import p824tp.C19735m;
import p977zz.C20964s0;

public final class TwitterServiceAlertFeedListItemView extends ImageOrTextSubtitleListItemView {

    /* renamed from: q0 */
    public final MaterialTextView f23215q0;

    public TwitterServiceAlertFeedListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C19735m.twitterServiceAlertFeedStyle);
    }

    /* renamed from: g */
    public final void mo23936g(int i) {
        this.f23215q0.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public int getExtraTopViewsMeasuredHeight() {
        if (this.f23215q0.getVisibility() == 8) {
            return 0;
        }
        return this.f23215q0.getMeasuredHeight();
    }

    /* renamed from: i */
    public final void mo23940i(int i, int i2, int i3, int i4) {
        if (this.f23215q0.getVisibility() != 8) {
            this.f23215q0.layout(i, i2, i3, i4);
        }
    }

    public void setHandle(CharSequence charSequence) {
        UiUtils.m40234B(this.f23215q0, charSequence);
    }

    public TwitterServiceAlertFeedListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MaterialTextView materialTextView = new MaterialTextView(context, (AttributeSet) null);
        materialTextView.setLines(1);
        materialTextView.setVisibility(8);
        materialTextView.setEllipsize(TextUtils.TruncateAt.END);
        C20964s0.m49107y(materialTextView, C19735m.textAppearanceBodySmall, C19735m.colorPrimary);
        this.f23215q0 = materialTextView;
        addView(materialTextView);
    }
}
