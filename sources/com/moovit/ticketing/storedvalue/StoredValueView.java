package com.moovit.ticketing.storedvalue;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import m80.C12867c;
import m80.C12869e;
import m80.C12870f;

public class StoredValueView extends MaterialCardView {

    /* renamed from: q */
    public final View f23470q;

    /* renamed from: r */
    public final TextView f23471r;

    /* renamed from: s */
    public final TextView f23472s;

    public StoredValueView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StoredValueView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = getResources();
        setRadius(resources.getDimension(C12867c.corner_radius));
        setCardElevation(resources.getDimension(C12867c.elevation_2));
        setUseCompatPadding(true);
        LayoutInflater.from(context).inflate(C12870f.stored_value_view_content, this, true);
        this.f23470q = findViewById(C12869e.ticket_content);
        this.f23471r = (TextView) findViewById(C12869e.ticket_price);
        this.f23472s = (TextView) findViewById(C12869e.ticket_agency);
    }
}
