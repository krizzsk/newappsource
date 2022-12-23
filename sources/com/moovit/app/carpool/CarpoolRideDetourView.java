package com.moovit.app.carpool;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.moovit.carpool.CarpoolRideDetour;
import com.moovit.commons.view.CheckedView;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;

public class CarpoolRideDetourView extends CheckedView {

    /* renamed from: g */
    public final TextView f37646g;

    /* renamed from: h */
    public final TextView f37647h;

    public CarpoolRideDetourView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CarpoolRideDetour getRideDetour() {
        return (CarpoolRideDetour) getTag(R.id.view_tag_param1);
    }

    public void setRideDetour(CarpoolRideDetour carpoolRideDetour) {
        boolean z;
        setTag(R.id.view_tag_param1, carpoolRideDetour);
        if (carpoolRideDetour == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        CurrencyAmount currencyAmount = carpoolRideDetour.f40921c;
        CurrencyAmount currencyAmount2 = carpoolRideDetour.f40922d;
        if (currencyAmount.f23845c.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f37646g.setText(currencyAmount2.toString());
            TextView textView = this.f37646g;
            textView.setPaintFlags(textView.getPaintFlags() | 16);
            this.f37647h.setVisibility(0);
            return;
        }
        this.f37646g.setText(currencyAmount.toString());
        TextView textView2 = this.f37646g;
        textView2.setPaintFlags(textView2.getPaintFlags() & -17);
        this.f37647h.setVisibility(8);
    }

    public CarpoolRideDetourView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.carpool_ride_detour_view, this, true);
        this.f37646g = (TextView) findViewById(R.id.fee_price);
        this.f37647h = (TextView) findViewById(R.id.fee_disclaimer);
    }
}
