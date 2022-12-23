package com.moovit.app.share.proxy;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import b00.C13556a;
import com.appboy.Constants;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.itinerary.ItineraryActivity;
import com.moovit.app.suggestedroutes.SuggestedRoutesDelegationSearchLocationCallback;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.request.UserRequestError;
import com.moovit.search.SearchLocationActivity;
import com.tranzmate.R;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import k10.C17993a;
import p090g1.C4732a;
import p259t5.C6593c;
import p375aw.C13538a;
import p543hq.C17474b;
import p824tp.C19728f;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p973zv.C20913c;
import p973zv.C20914d;
import p977zz.C20964s0;
import q00.C19047a;

public class SharedEntityProxyItineraryFragment extends C13538a {

    /* renamed from: x */
    public static final /* synthetic */ int f39587x = 0;

    /* renamed from: o */
    public String f39588o;

    /* renamed from: p */
    public ViewGroup f39589p;

    /* renamed from: q */
    public ProgressBar f39590q;

    /* renamed from: r */
    public ImageView f39591r;

    /* renamed from: s */
    public TextView f39592s;

    /* renamed from: t */
    public Button f39593t;

    /* renamed from: u */
    public C13556a f39594u;

    /* renamed from: v */
    public boolean f39595v = true;

    /* renamed from: w */
    public C15313a f39596w = new C15313a();

    public enum ViewState {
        IN_PROGRESS(0, 0, 0),
        NO_NETWORK(R.drawable.img_empty_no_network, R.string.no_network_title, R.string.retry_connect),
        NO_ITINERARY(R.drawable.ic_clock_reset_56_on_surface_emphasis_low, R.string.tripplan_itinerary_share_timeout_message, R.string.tripplan_itinerary_share_timeout_button);
        
        /* access modifiers changed from: private */
        public final int actionResId;
        /* access modifiers changed from: private */
        public final int iconResId;
        /* access modifiers changed from: private */
        public final int messageResId;

        private ViewState(int i, int i2, int i3) {
            this.iconResId = i;
            this.messageResId = i2;
            this.actionResId = i3;
        }
    }

    /* renamed from: com.moovit.app.share.proxy.SharedEntityProxyItineraryFragment$a */
    public class C15313a extends C20438i<C20913c, C20914d> {
        public C15313a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C20913c cVar2 = (C20913c) cVar;
            SharedEntityProxyItineraryFragment sharedEntityProxyItineraryFragment = SharedEntityProxyItineraryFragment.this;
            Itinerary itinerary = ((C20914d) gVar).f52661m;
            int i = SharedEntityProxyItineraryFragment.f39587x;
            sharedEntityProxyItineraryFragment.getClass();
            if (itinerary == null) {
                sharedEntityProxyItineraryFragment.mo45859n2(ViewState.NO_ITINERARY);
                return;
            }
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SHARED_ENTITY_SHOWN);
            aVar.mo49939g(AnalyticsAttributeKey.ITINERARY_GUID, itinerary.f41894b);
            sharedEntityProxyItineraryFragment.mo46797j2(aVar.mo49933a());
            Context context = sharedEntityProxyItineraryFragment.getContext();
            Intent z2 = ItineraryActivity.m37992z2(context, Collections.singletonList(itinerary), true, true);
            if (!sharedEntityProxyItineraryFragment.f39595v) {
                sharedEntityProxyItineraryFragment.startActivity(z2);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(C14226d.m35335A0(context).putExtra(C17993a.f46076b, "suppress_popups"));
                arrayList.add(z2);
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    if (!C4732a.startActivities(context, intentArr, (Bundle) null)) {
                        Intent intent = new Intent(intentArr[intentArr.length - 1]);
                        intent.addFlags(268435456);
                        context.startActivity(intent);
                    }
                } else {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                }
            }
            ((SharedEntityProxyActivity) sharedEntityProxyItineraryFragment.f40822c).finish();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C20913c cVar2 = (C20913c) cVar;
            SharedEntityProxyItineraryFragment sharedEntityProxyItineraryFragment = SharedEntityProxyItineraryFragment.this;
            int i = SharedEntityProxyItineraryFragment.f39587x;
            sharedEntityProxyItineraryFragment.getClass();
            if (exc instanceof UserRequestError) {
                sharedEntityProxyItineraryFragment.mo45859n2(ViewState.NO_ITINERARY);
                return true;
            }
            sharedEntityProxyItineraryFragment.mo45859n2(ViewState.NO_NETWORK);
            return true;
        }
    }

    /* renamed from: com.moovit.app.share.proxy.SharedEntityProxyItineraryFragment$b */
    public static /* synthetic */ class C15314b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39598a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.app.share.proxy.SharedEntityProxyItineraryFragment$ViewState[] r0 = com.moovit.app.share.proxy.SharedEntityProxyItineraryFragment.ViewState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39598a = r0
                com.moovit.app.share.proxy.SharedEntityProxyItineraryFragment$ViewState r1 = com.moovit.app.share.proxy.SharedEntityProxyItineraryFragment.ViewState.NO_NETWORK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39598a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.share.proxy.SharedEntityProxyItineraryFragment$ViewState r1 = com.moovit.app.share.proxy.SharedEntityProxyItineraryFragment.ViewState.NO_ITINERARY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f39598a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.share.proxy.SharedEntityProxyItineraryFragment$ViewState r1 = com.moovit.app.share.proxy.SharedEntityProxyItineraryFragment.ViewState.IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.share.proxy.SharedEntityProxyItineraryFragment.C15314b.<clinit>():void");
        }
    }

    static {
        Class<SharedEntityProxyItineraryFragment> cls = SharedEntityProxyItineraryFragment.class;
    }

    /* renamed from: m2 */
    public static void m39175m2(SharedEntityProxyItineraryFragment sharedEntityProxyItineraryFragment, View view) {
        Context context;
        sharedEntityProxyItineraryFragment.getClass();
        int i = C15314b.f39598a[((ViewState) view.getTag()).ordinal()];
        if (i == 1) {
            sharedEntityProxyItineraryFragment.mo45860o2();
        } else if (i == 2 && (context = sharedEntityProxyItineraryFragment.getContext()) != null) {
            Intent y2 = SearchLocationActivity.m17347y2(context, new SuggestedRoutesDelegationSearchLocationCallback(), (String) null, (String) null);
            if (!sharedEntityProxyItineraryFragment.f39595v) {
                sharedEntityProxyItineraryFragment.startActivity(y2);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(C14226d.m35335A0(context).putExtra(C17993a.f46076b, "suppress_popups"));
            arrayList.add(y2);
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                if (!C4732a.startActivities(context, intentArr, (Bundle) null)) {
                    Intent intent = new Intent(intentArr[intentArr.length - 1]);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                return;
            }
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return C16530d.m42016i(2, "CONFIGURATION", "METRO_CONTEXT");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        mo45860o2();
    }

    /* renamed from: n2 */
    public final void mo45859n2(ViewState viewState) {
        int[] iArr = C15314b.f39598a;
        int i = iArr[viewState.ordinal()];
        if (i == 1) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SHARED_ENTITY_ERROR_SHOWN);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "network_error");
            mo46797j2(aVar.mo49933a());
        } else if (i == 2) {
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.SHARED_ENTITY_ERROR_SHOWN);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "shared_entity_unavailable");
            mo46797j2(aVar2.mo49933a());
        }
        if (iArr[viewState.ordinal()] != 3) {
            this.f39591r.setImageResource(viewState.iconResId);
            this.f39592s.setText(viewState.messageResId);
            this.f39593t.setText(viewState.actionResId);
            this.f39593t.setTag(viewState);
            this.f39589p.setVisibility(0);
            this.f39590q.setVisibility(8);
            return;
        }
        this.f39589p.setVisibility(8);
        this.f39590q.setVisibility(0);
    }

    /* renamed from: o2 */
    public final void mo45860o2() {
        if (this.f39594u == null && this.f40824e && mo46775H1()) {
            mo45859n2(ViewState.IN_PROGRESS);
            this.f39594u = mo46793f2(String.format("%1$s_%2$s", new Object[]{"GetSharedItineraryRequest", this.f39588o}), new C20913c(mo46783R1(), (C19728f) mo46776J1("METRO_CONTEXT"), (C19047a) mo46776J1("CONFIGURATION"), this.f39588o), mo46777L1(), this.f39596w);
        }
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        Uri uri = (Uri) mo46782Q1().getParcelable("uri");
        if (uri != null) {
            String queryParameter = uri.getQueryParameter(Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
            if (!C20964s0.m49090h(queryParameter)) {
                if (C20964s0.m49108z(queryParameter, DiskLruCache.VERSION_1) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f39595v = z;
            }
            this.f39588o = uri.getLastPathSegment();
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SHARED_ENTITY_RECEIVED);
            aVar.mo49939g(AnalyticsAttributeKey.SHARED_ENTITY_TYPE, "shared_entity_type_itinerary");
            aVar.mo49939g(AnalyticsAttributeKey.SHARED_ENTITY_ID, this.f39588o);
            mo46797j2(aVar.mo49933a());
            return;
        }
        throw new ApplicationBugException("Uri may not be null!");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.share_entity_proxy_itinerary_fragment, viewGroup, false);
        this.f39589p = (ViewGroup) inflate.findViewById(R.id.message_container);
        this.f39590q = (ProgressBar) inflate.findViewById(R.id.progress);
        this.f39591r = (ImageView) inflate.findViewById(R.id.icon);
        this.f39592s = (TextView) inflate.findViewById(R.id.message);
        Button button = (Button) inflate.findViewById(R.id.action);
        this.f39593t = button;
        button.setOnClickListener(new C6593c(this, 27));
        mo45859n2(ViewState.IN_PROGRESS);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        mo45860o2();
    }

    public final void onStop() {
        super.onStop();
        C13556a aVar = this.f39594u;
        if (aVar != null) {
            aVar.cancel(true);
            this.f39594u = null;
        }
    }
}
