package com.moovit.design.view.list;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C0801k;
import com.moovit.commons.utils.UiUtils;
import p090g1.C4732a;
import p977zz.C20941h;
import w00.C20261b;
import w00.C20267h;

public class TripleListItemView extends ImageOrTextSubtitleListItemView {

    /* renamed from: q0 */
    public final int f41456q0;

    /* renamed from: r0 */
    public int f41457r0;

    /* renamed from: s0 */
    public ColorStateList f41458s0;

    /* renamed from: t0 */
    public final int f41459t0;

    /* renamed from: u0 */
    public final int f41460u0;

    /* renamed from: v0 */
    public TextView f41461v0;

    public TripleListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C20261b.tripleListItemStyle);
    }

    private int getLabelMeasuredHeight() {
        TextView textView = this.f41461v0;
        if (textView == null || textView.getVisibility() == 8) {
            return 0;
        }
        return this.f41461v0.getMeasuredHeight();
    }

    /* renamed from: f */
    public final void mo23935f(int i, int i2) {
        if (this.f41456q0 == 1 && this.f41461v0 != null) {
            this.f41461v0.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    /* renamed from: g */
    public final void mo23936g(int i) {
        if (this.f41456q0 == 0 && this.f41461v0 != null) {
            this.f41461v0.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public int getExtraBottomViewsMeasuredHeight() {
        if (this.f41456q0 == 1) {
            return getLabelMeasuredHeight() + this.f41460u0;
        }
        return 0;
    }

    public int getExtraTopViewsMeasuredHeight() {
        if (this.f41456q0 == 0) {
            return getLabelMeasuredHeight() + this.f41460u0;
        }
        return 0;
    }

    public int getLabelStyleAttr() {
        return C20261b.tripleListItemLabelStyle;
    }

    public TextView getLabelView() {
        return mo47912u();
    }

    /* renamed from: h */
    public final void mo23939h(int i, int i2, int i3, int i4) {
        if (this.f41456q0 == 1) {
            int i5 = i2 + this.f41460u0;
            TextView textView = this.f41461v0;
            if (textView != null && textView.getVisibility() != 8) {
                this.f41461v0.layout(i, i5, i3, i4);
            }
        }
    }

    /* renamed from: i */
    public final void mo23940i(int i, int i2, int i3, int i4) {
        if (this.f41456q0 == 0) {
            int i5 = i4 - this.f41460u0;
            TextView textView = this.f41461v0;
            if (textView != null && textView.getVisibility() != 8) {
                this.f41461v0.layout(i, i2, i3, i5);
            }
        }
    }

    public void setLabel(CharSequence charSequence) {
        if (charSequence == null) {
            TextView textView = this.f41461v0;
            if (textView != null) {
                removeView(textView);
                this.f41461v0 = null;
                return;
            }
            return;
        }
        mo47912u().setText(charSequence);
    }

    public void setLabelResourceTextColor(int i) {
        ColorStateList colorStateList = C4732a.getColorStateList(getContext(), i);
        if (colorStateList != null) {
            setLabelTextColor(colorStateList);
        }
    }

    public void setLabelTextAppearance(int i) {
        this.f41457r0 = i;
        TextView textView = this.f41461v0;
        if (textView != null) {
            C0801k.m2424f(textView, i);
        }
    }

    public void setLabelTextColor(ColorStateList colorStateList) {
        this.f41458s0 = colorStateList;
        TextView textView = this.f41461v0;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setLabelThemeTextAppearance(int i) {
        setTitleTextAppearance(C20941h.m49047j(i, getContext()));
    }

    public void setLabelThemeTextColor(int i) {
        ColorStateList g = C20941h.m49044g(i, getContext());
        if (g != null) {
            setLabelTextColor(g);
        }
    }

    public void setLabelView(TextView textView) {
        TextView textView2 = this.f41461v0;
        if (textView2 != textView) {
            if (textView2 != null) {
                removeView(textView2);
            }
            this.f41461v0 = textView;
            addView(textView);
        }
    }

    /* renamed from: u */
    public final TextView mo47912u() {
        TextView textView = this.f41461v0;
        if (textView != null) {
            return textView;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, getLabelStyleAttr());
        int i = this.f41457r0;
        if (i != 0) {
            C0801k.m2424f(appCompatTextView, i);
        }
        ColorStateList colorStateList = this.f41458s0;
        if (colorStateList != null) {
            setLabelTextColor(colorStateList);
        }
        int i2 = this.f41459t0;
        if (i2 > 0) {
            appCompatTextView.setMaxLines(i2);
        }
        setLabelView(appCompatTextView);
        return appCompatTextView;
    }

    public TripleListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray o = UiUtils.m40256o(context, attributeSet, C20267h.TripleListItemView, i);
        try {
            this.f41456q0 = o.getInt(C20267h.TripleListItemView_labelPosition, 0);
            this.f41459t0 = o.getInt(C20267h.TripleListItemView_labelMaxLines, 0);
            this.f41457r0 = o.getResourceId(C20267h.TripleListItemView_labelTextAppearance, 0);
            this.f41458s0 = C20941h.m49039b(context, o, C20267h.TripleListItemView_labelTextColor);
            this.f41460u0 = C20941h.m49040c(context, o, C20267h.TripleListItemView_labelSpacing);
            CharSequence text = o.getText(C20267h.TripleListItemView_label);
            if (text != null) {
                setLabel(text);
            }
        } finally {
            o.recycle();
        }
    }

    public void setLabelTextColor(int i) {
        setLabelTextColor(ColorStateList.valueOf(i));
    }
}
