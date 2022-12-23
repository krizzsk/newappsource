package com.moovit.app.itinerary.view.leg;

import a00.C13382a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.itinerary.model.leg.PathwayWalkLeg;
import com.moovit.transit.TransitStopPathway;
import com.tranzmate.R;
import p977zz.C20964s0;

public class PathwayWalkLegExtraView extends LinearLayout {

    /* renamed from: b */
    public final TextView f38711b;

    /* renamed from: c */
    public final TextView f38712c;

    public PathwayWalkLegExtraView() {
        throw null;
    }

    public PathwayWalkLegExtraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo45399a(PathwayWalkLeg pathwayWalkLeg) {
        TransitStopPathway transitStopPathway;
        TransitStopPathway transitStopPathway2;
        String str;
        String str2 = null;
        if (pathwayWalkLeg.f42093e == null) {
            transitStopPathway = null;
        } else {
            transitStopPathway = pathwayWalkLeg.f42092d.get().f23740l.get(pathwayWalkLeg.f42093e);
        }
        if (pathwayWalkLeg.f42094f == null) {
            transitStopPathway2 = null;
        } else {
            transitStopPathway2 = pathwayWalkLeg.f42092d.get().f23740l.get(pathwayWalkLeg.f42094f);
        }
        Context context = getContext();
        if (transitStopPathway == null || !transitStopPathway.mo24419c() || C20964s0.m49090h(transitStopPathway.f23750d)) {
            str = null;
        } else {
            str = context.getString(R.string.pathway_guidance_entrance, new Object[]{transitStopPathway.f23750d});
        }
        UiUtils.m40234B(this.f38711b, str);
        TextView textView = this.f38711b;
        textView.setContentDescription(textView.getText());
        if (transitStopPathway2 != null && transitStopPathway2.mo24420d() && !C20964s0.m49090h(transitStopPathway2.f23750d)) {
            str2 = context.getString(R.string.pathway_guidance_exit, new Object[]{transitStopPathway2.f23750d});
        }
        UiUtils.m40234B(this.f38712c, str2);
        TextView textView2 = this.f38712c;
        textView2.setContentDescription(textView2.getText());
        setContentDescription(C13382a.m33667c(this.f38711b.getContentDescription(), this.f38712c.getContentDescription()));
    }

    public PathwayWalkLegExtraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        View.inflate(context, R.layout.pathway_walk_leg_extra_view, this);
        this.f38711b = (TextView) findViewById(R.id.origin);
        this.f38712c = (TextView) findViewById(R.id.destination);
    }
}
