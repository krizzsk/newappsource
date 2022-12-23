package p495fq;

import aa0.C7530f;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.widget.Button;
import c00.C13717b;
import c00.C13723g;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.actions.notifydriver.NotifyDriverLineSelectionActivity;
import com.moovit.app.intro.UserCreationFailureActivity;
import com.moovit.app.search.locations.C15284a;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.location.C16202a;
import com.moovit.map.C16287l;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p543hq.C17474b;
import p713ov.C18837f;
import p732pq.C18949j;
import p732pq.C18951l;
import p977zz.C20935e;
import p977zz.C20944i0;
import p977zz.C20961r;

/* renamed from: fq.c */
public final /* synthetic */ class C17058c implements C20935e {

    /* renamed from: b */
    public final /* synthetic */ int f44221b;

    /* renamed from: c */
    public final /* synthetic */ Object f44222c;

    public /* synthetic */ C17058c(Object obj, int i) {
        this.f44221b = i;
        this.f44222c = obj;
    }

    public final void invoke(Object obj) {
        LatLonE6 j;
        boolean z = false;
        switch (this.f44221b) {
            case 0:
                C17059d dVar = (C17059d) this.f44222c;
                dVar.getClass();
                if (((Integer) obj).intValue() == 0) {
                    dVar.f44224f = null;
                    dVar.mo49522q(dVar.mo49514i());
                    return;
                }
                return;
            case 1:
                C18951l lVar = (C18951l) this.f44222c;
                C20961r rVar = (C20961r) obj;
                int i = C18951l.f48251v;
                lVar.mo50553o2();
                if (rVar.f52711a && (j = LatLonE6.m40177j((Location) rVar.f52712b)) != null) {
                    C18951l.C18952a A2 = lVar.mo51466A2();
                    if (!A2.f48256b.isEmpty() && !A2.f48257c.isEmpty()) {
                        TransitStop transitStop = (TransitStop) Collections.min(A2.f48256b, C7530f.m17270c(j));
                        if (LatLonE6.m40174c(j, transitStop) > 100.0f) {
                            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "notify_driver_not_in_range_dialog_show");
                            lVar.mo46797j2(aVar.mo49933a());
                            AlertDialogFragment.C15856a k = new AlertDialogFragment.C15856a(lVar.requireContext()).mo47682k("notify_driver_not_in_station_dialog_fragment_tag");
                            k.mo47676e(R.drawable.img_cancel_warning, false);
                            k.mo47678g(R.string.accessibility_notify_driver_location_error_title).mo47681j(R.string.got_it).mo47673b().show(lVar.getChildFragmentManager(), "notify_driver_not_in_station_dialog_fragment_tag");
                            return;
                        }
                        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "notify_driver_line_selection_bottom_dialog");
                        lVar.mo46797j2(aVar2.mo49933a());
                        ArrayList<T> c = C13723g.m34282c(A2.f48257c, new C18949j(transitStop, 0));
                        Context requireContext = lVar.requireContext();
                        int i2 = NotifyDriverLineSelectionActivity.f37425r0;
                        Intent intent = new Intent(requireContext, NotifyDriverLineSelectionActivity.class);
                        intent.putExtra("stop", transitStop);
                        intent.putParcelableArrayListExtra("lines", C13717b.m34264k(c));
                        lVar.startActivity(intent);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                UserCreationFailureActivity userCreationFailureActivity = (UserCreationFailureActivity) this.f44222c;
                int i3 = UserCreationFailureActivity.f38450X;
                userCreationFailureActivity.getClass();
                if (((Integer) obj).intValue() == 0) {
                    MoovitAppApplication x = MoovitAppApplication.m37038x();
                    Intent y2 = userCreationFailureActivity.mo45252y2();
                    x.f37321e.mo50689b("USER_CONTEXT");
                    x.mo44574v(userCreationFailureActivity, y2);
                    return;
                }
                return;
            case 3:
                Button button = ((C18837f) this.f44222c).f47963r;
                if (((C18837f.C18839b) obj).f47966h != -1) {
                    z = true;
                }
                button.setEnabled(z);
                return;
            case 4:
                C15284a aVar3 = (C15284a) this.f44222c;
                Void voidR = (Void) obj;
                ServerId serverId = C15284a.f39471U;
                A a = aVar3.f40822c;
                if (a != null && aVar3.f40824e) {
                    C16202a.get(a).requestLocationSettings().addOnSuccessListener((Activity) a, aVar3.f39494Q);
                    return;
                }
                return;
            default:
                C20944i0 i0Var = (C20944i0) obj;
                Iterator it = ((C16287l) this.f44222c).f42563d.iterator();
                while (it.hasNext()) {
                    Set set = (Set) i0Var.f52692a;
                    ((C16287l.C16290c) it.next()).mo48822F((Set) i0Var.f52693b);
                }
                return;
        }
    }
}
