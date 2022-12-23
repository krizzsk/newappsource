package com.moovit.home.lines.search;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.google.android.material.textview.MaterialTextView;
import com.moovit.design.view.list.ImageOrTextSubtitleListItemView;
import com.moovit.servicealerts.LineServiceAlertDigest;
import p824tp.C19735m;
import p977zz.C20964s0;

public final class SearchLineListItemView extends ImageOrTextSubtitleListItemView {

    /* renamed from: q0 */
    public final MaterialTextView f41644q0;

    public SearchLineListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C19735m.searchLineListItemStyle);
    }

    /* renamed from: g */
    public final void mo23936g(int i) {
        this.f41644q0.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public int getExtraBottomViewsMeasuredHeight() {
        if (this.f41644q0.getVisibility() == 8) {
            return 0;
        }
        return this.f41644q0.getMeasuredHeight();
    }

    /* renamed from: h */
    public final void mo23939h(int i, int i2, int i3, int i4) {
        if (this.f41644q0.getVisibility() != 8) {
            this.f41644q0.layout(i, i2, i3, i4);
        }
    }

    public void setAttributes(CharSequence charSequence) {
        if (charSequence != null) {
            this.f41644q0.setText(charSequence);
            this.f41644q0.setVisibility(0);
            return;
        }
        this.f41644q0.setVisibility(8);
    }

    public void setServiceAlert(LineServiceAlertDigest lineServiceAlertDigest) {
        ImageView imageView = (ImageView) getAccessoryView();
        if (lineServiceAlertDigest != null) {
            imageView.setImageResource(lineServiceAlertDigest.f23186c.f23213b.getIconResId());
            imageView.setVisibility(0);
            setAccessoryContentDescription(getContext().getString(lineServiceAlertDigest.f23186c.f23213b.getAccessibilityResId()));
            return;
        }
        imageView.setVisibility(8);
        setAccessoryContentDescription((CharSequence) null);
    }

    public SearchLineListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MaterialTextView materialTextView = new MaterialTextView(context, (AttributeSet) null);
        materialTextView.setMaxLines(2);
        materialTextView.setVisibility(8);
        materialTextView.setEllipsize(TextUtils.TruncateAt.END);
        C20964s0.m49107y(materialTextView, C19735m.textAppearanceCaption, C19735m.colorOnSurfaceEmphasisMedium);
        this.f41644q0 = materialTextView;
        addView(materialTextView);
        AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context, (AttributeSet) null, C19735m.listItemAccessoryIconStyle);
        appCompatImageButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        appCompatImageButton.setVisibility(8);
        setAccessoryView((View) appCompatImageButton);
    }
}
