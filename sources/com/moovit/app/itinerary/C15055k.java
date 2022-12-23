package com.moovit.app.itinerary;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import c00.C13717b;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.commons.view.list.FixedListView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import java.util.ArrayList;
import p496fr.C17064a;
import p496fr.C17065b;
import p824tp.C19728f;
import p977zz.C20964s0;

/* renamed from: com.moovit.app.itinerary.k */
public class C15055k extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f38594h = 0;

    public C15055k() {
        super(MoovitActivity.class);
        setStyle(0, 2131952793);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.line_or_stop_selection_dialog, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FixedListView fixedListView = (FixedListView) view.findViewById(R.id.list);
        ArrayList<TransitLine> parcelableArrayList = mo46752K1().getParcelableArrayList("linesExtra");
        if (!C13717b.m34258e(parcelableArrayList)) {
            ListItemView listItemView = new ListItemView(getContext(), (AttributeSet) null, R.attr.listItemSectionHeaderStyle);
            listItemView.setTitle((int) R.string.tripplan_itinerary_report_line);
            fixedListView.addView(listItemView, FixedListView.m40337h(getContext(), 2, 0, 2));
            for (TransitLine transitLine : parcelableArrayList) {
                ListItemView listItemView2 = new ListItemView(getContext(), (AttributeSet) null, R.attr.transitLineListItemStyle);
                C16181a.m41233b(C19728f.m47195a(this.f40792c).mo52082b(LinePresentationType.ITINERARY), listItemView2, transitLine);
                listItemView2.setTag(transitLine.f23687c);
                listItemView2.setOnClickListener(new C17065b(2, this, transitLine));
                fixedListView.addView(listItemView2);
            }
        }
        ArrayList<TransitStop> parcelableArrayList2 = mo46752K1().getParcelableArrayList("stopsExtra");
        if (!C13717b.m34258e(parcelableArrayList2)) {
            ListItemView listItemView3 = new ListItemView(getContext(), (AttributeSet) null, R.attr.listItemSectionHeaderStyle);
            listItemView3.setTitle((int) R.string.tripplan_itinerary_report_station);
            fixedListView.addView(listItemView3, FixedListView.m40337h(getContext(), 2, 0, 2));
            for (TransitStop transitStop : parcelableArrayList2) {
                ListItemView listItemView4 = new ListItemView(getContext(), (AttributeSet) null, R.attr.transitLineListItemStyle);
                listItemView4.setTag(transitStop.f23730b);
                listItemView4.setIcon(transitStop.f23734f);
                listItemView4.setTitle((CharSequence) transitStop.f23731c);
                if (!C20964s0.m49090h(transitStop.f23733e)) {
                    listItemView4.setSubtitle((CharSequence) transitStop.f23733e);
                }
                listItemView4.setOnClickListener(new C17064a(4, this, transitStop));
                fixedListView.addView(listItemView4);
            }
        }
    }
}
