package com.moovit.app.itinerary.nogroup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.moovit.app.itinerary.nogroup.NoGroupTransitLegView;
import com.tranzmate.R;

public class NoGroupItineraryView extends LinearLayout {

    /* renamed from: b */
    public final ViewGroup f38607b;

    /* renamed from: c */
    public C15059a f38608c;

    /* renamed from: d */
    public boolean f38609d;

    /* renamed from: com.moovit.app.itinerary.nogroup.NoGroupItineraryView$a */
    public interface C15059a extends NoGroupTransitLegView.C15062c {
    }

    public NoGroupItineraryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NoGroupItineraryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.itinerary_ng_itinerary_layout, this, true);
        this.f38607b = (ViewGroup) findViewById(R.id.transitLegs);
    }
}
