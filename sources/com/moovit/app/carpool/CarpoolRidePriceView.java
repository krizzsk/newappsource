package com.moovit.app.carpool;

import android.content.Context;
import android.util.AttributeSet;
import com.moovit.carpool.CarpoolRide;
import com.moovit.carpool.CarpoolRideDetour;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.util.CurrencyAmount;
import com.moovit.view.PriceView;
import com.tranzmate.R;
import p977zz.C20964s0;

public class CarpoolRidePriceView extends PriceView {
    public CarpoolRidePriceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setFreeText((int) R.string.carpool_free_ride);
        C20964s0.m49107y(this.f23945d, R.attr.textAppearanceFootnote, R.attr.colorOnSurfaceEmphasisLow);
        C20964s0.m49107y(this.f23947f, R.attr.textAppearanceBodyStrong, R.attr.colorTertiary);
    }

    /* renamed from: d */
    public final void mo44828d(FutureCarpoolRide futureCarpoolRide, CarpoolRideDetour carpoolRideDetour) {
        boolean z;
        int i;
        CurrencyAmount currencyAmount;
        CurrencyAmount currencyAmount2;
        boolean equals = FutureCarpoolRide.InvitationState.REJECTED_BY_DRIVER.equals(futureCarpoolRide.f40938c);
        if (futureCarpoolRide.f40939d || equals) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = R.attr.colorOnSurfaceEmphasisLow;
        } else {
            i = R.attr.colorOnSurfaceEmphasisHigh;
        }
        setPriceTextThemeColor(i);
        CarpoolRide carpoolRide = futureCarpoolRide.f40937b;
        if (carpoolRideDetour != null) {
            currencyAmount = CurrencyAmount.m17926b(carpoolRide.f40917i, carpoolRideDetour.f40921c);
        } else {
            currencyAmount = carpoolRide.f40917i;
        }
        if (carpoolRideDetour != null) {
            currencyAmount2 = CurrencyAmount.m17926b(carpoolRide.f40918j, carpoolRideDetour.f40922d);
        } else {
            currencyAmount2 = carpoolRide.f40918j;
        }
        mo24682a(currencyAmount, currencyAmount2, (String) null);
    }

    public CarpoolRidePriceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setFreeText((int) R.string.carpool_free_ride);
        C20964s0.m49107y(this.f23945d, R.attr.textAppearanceFootnote, R.attr.colorOnSurfaceEmphasisLow);
        C20964s0.m49107y(this.f23947f, R.attr.textAppearanceBodyStrong, R.attr.colorTertiary);
    }
}
