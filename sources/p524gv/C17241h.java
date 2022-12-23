package p524gv;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.moovit.C15682c;
import com.moovit.app.reports.community.CommunityReportsActivity;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.commons.view.list.FixedListView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.metro.ReportCategoryType;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Arrays;
import p500fv.C17076a;
import p500fv.C17090o;

/* renamed from: gv.h */
public class C17241h extends C15682c<CommunityReportsActivity> {

    /* renamed from: n */
    public static final /* synthetic */ int f44569n = 0;

    public C17241h() {
        super(CommunityReportsActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.community_reports_list_layout, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<C17076a> arrayList;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.header);
        if (((ReportEntityType) mo46782Q1().getSerializable("reportEntityType")) == ReportEntityType.LINE) {
            textView.setText(R.string.line_report_title);
            arrayList = C17090o.m43019c().mo49688b(Arrays.asList(new ReportCategoryType[]{ReportCategoryType.LINE_OUT_OF_SERVICE, ReportCategoryType.LINE_ROUTE_CHANGE, ReportCategoryType.LINE_LATE_DELAY}));
        } else {
            textView.setText(R.string.station_report_title);
            arrayList = C17090o.m43019c().mo49688b(Arrays.asList(new ReportCategoryType[]{ReportCategoryType.STOP_STATION_CLOSED, ReportCategoryType.STOP_INCORRECT_LOCATION, ReportCategoryType.STOP_MISSING_LINE}));
        }
        C17240g gVar = new C17240g(this);
        Context context = view.getContext();
        FixedListView fixedListView = (FixedListView) view.findViewById(R.id.content);
        for (C17076a aVar : arrayList) {
            ListItemView listItemView = new ListItemView(context);
            listItemView.setTag(aVar);
            listItemView.setIcon(aVar.mo49680e());
            listItemView.setTitle(aVar.mo49682g());
            listItemView.setOnClickListener(gVar);
            fixedListView.addView(listItemView);
        }
    }
}
