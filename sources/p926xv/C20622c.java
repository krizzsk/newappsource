package p926xv;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import c00.C13717b;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.C15676b;
import com.moovit.app.MoovitAppActivity;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.list.FixedListView;
import com.moovit.design.view.list.ImageOrTextSubtitleListItemView;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.servicealerts.ServiceAlertAffectedLine;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.tranzmate.R;
import j80.C12773b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import p073e7.C4583a;
import p073e7.C4585c;
import p567iq.C17635b;
import p805su.C19557m;

/* renamed from: xv.c */
public class C20622c extends C15676b<MoovitAppActivity> {

    /* renamed from: i */
    public static final /* synthetic */ int f52134i = 0;

    /* renamed from: h */
    public ArrayList f52135h;

    public C20622c() {
        super(MoovitAppActivity.class);
        setStyle(0, 2131952793);
    }

    /* renamed from: S1 */
    public final void mo52812S1(View view, ArrayList arrayList, C12773b bVar) {
        Map<ServerId, SearchLineItem> map;
        SearchLineItem searchLineItem;
        if (bVar != null) {
            map = bVar.f31572h;
        } else {
            map = Collections.emptyMap();
        }
        int i = 1;
        UiUtils.m40238F(0, view.findViewById(R.id.title), view.findViewById(R.id.cancel));
        FixedListView fixedListView = (FixedListView) view.findViewById(R.id.list);
        Context context = view.getContext();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LineServiceAlertDigest lineServiceAlertDigest = (LineServiceAlertDigest) it.next();
            ServiceStatusCategory serviceStatusCategory = lineServiceAlertDigest.f23186c.f23213b;
            ServiceAlertAffectedLine serviceAlertAffectedLine = lineServiceAlertDigest.f23185b;
            ServerId serverId = serviceAlertAffectedLine.f23206d;
            if (serverId != null) {
                searchLineItem = map.get(serverId);
            } else {
                searchLineItem = null;
            }
            ImageOrTextSubtitleListItemView imageOrTextSubtitleListItemView = new ImageOrTextSubtitleListItemView(context, (AttributeSet) null, R.attr.transitLineListItemStyle);
            if (searchLineItem != null) {
                imageOrTextSubtitleListItemView.setIcon(searchLineItem.f41641f);
                imageOrTextSubtitleListItemView.setTitle((CharSequence) searchLineItem.f41642g);
                imageOrTextSubtitleListItemView.setSubtitleItems(searchLineItem.f41643h);
            } else {
                imageOrTextSubtitleListItemView.setIcon(serviceAlertAffectedLine.f23205c);
                imageOrTextSubtitleListItemView.setTitle((CharSequence) serviceAlertAffectedLine.f23204b);
            }
            imageOrTextSubtitleListItemView.setAccessoryDrawable(serviceStatusCategory.getIconResId());
            imageOrTextSubtitleListItemView.setTag(lineServiceAlertDigest);
            imageOrTextSubtitleListItemView.setOnClickListener(new C4585c(this, 23));
            fixedListView.addView(imageOrTextSubtitleListItemView, i);
            i++;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList parcelableArrayList = getArguments().getParcelableArrayList("digests");
        this.f52135h = parcelableArrayList;
        if (C13717b.m34258e(parcelableArrayList)) {
            dismissAllowingStateLoss();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.line_service_alert_digests_chooser_layout, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((Button) view.findViewById(R.id.cancel)).setOnClickListener(new C4583a(this, 23));
        MoovitAppActivity moovitAppActivity = (MoovitAppActivity) this.f40792c;
        C17635b.m43779f(moovitAppActivity).f50174d.mo39624d(false).addOnSuccessListener((Activity) moovitAppActivity, new C20621b(0, this, view)).addOnFailureListener((Activity) moovitAppActivity, (OnFailureListener) new C19557m(this, view, 1));
    }
}
