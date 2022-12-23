package com.moovit.app.ridesharing.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.view.FormatTextView;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import p977zz.C20941h;
import p977zz.C20964s0;

public class BookingOptionListItemView extends ListItemView {

    /* renamed from: q0 */
    public final FormatTextView f39401q0;

    public BookingOptionListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listItemStyle);
    }

    /* renamed from: f */
    public final void mo23935f(int i, int i2) {
        this.f39401q0.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getExtraBottomViewsMeasuredHeight() {
        if (this.f39401q0.getVisibility() == 8) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f39401q0.getLayoutParams();
        return this.f39401q0.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: h */
    public final void mo23939h(int i, int i2, int i3, int i4) {
        if (this.f39401q0.getVisibility() != 8) {
            int measuredWidth = this.f39401q0.getMeasuredWidth();
            int measuredHeight = this.f39401q0.getMeasuredHeight();
            int i5 = i2 + ((ViewGroup.MarginLayoutParams) this.f39401q0.getLayoutParams()).topMargin;
            int i6 = measuredHeight + i5;
            if (C15780a.m40269b(this)) {
                i = i3 - measuredWidth;
            } else {
                i3 = i + measuredWidth;
            }
            this.f39401q0.layout(i, i5, i3, i6);
        }
    }

    public void setReferral(String str) {
        if (!C20964s0.m49090h(str)) {
            this.f39401q0.setArguments(str);
            this.f39401q0.setVisibility(0);
            return;
        }
        this.f39401q0.setVisibility(8);
    }

    public BookingOptionListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setCheckable(true);
        setIcon(C20941h.m49045h(16843289, getContext()));
        setAccessoryView((int) R.layout.booking_option_list_item_accessory);
        LayoutInflater.from(context).inflate(R.layout.booking_option_list_item_bottom_accessory, this, true);
        this.f39401q0 = (FormatTextView) findViewById(R.id.referral);
    }
}
