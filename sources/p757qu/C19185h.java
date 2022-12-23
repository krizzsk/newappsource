package p757qu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import b00.C13556a;
import c00.C13717b;
import c20.C13744a;
import c70.C13751d;
import c70.C13752e;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.model.MotActivationPrice;
import com.moovit.app.mot.model.MotActivationStationInfo;
import com.moovit.app.mot.p417qr.MotQrCodeViewerActivity;
import com.moovit.app.mot.purchase.MotStationExitActivationActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.view.FormatTextView;
import com.moovit.design.view.AlertMessageView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.transit.C7843b;
import com.moovit.util.CurrencyAmount;
import com.moovit.view.PriceView;
import com.tranzmate.R;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import p001a0.C0017h;
import p310x5.C7157b;
import p543hq.C17474b;
import p593ju.C17926b;
import p712ou.C18830b;
import p736pu.C18992a;
import p736pu.C18995d;
import p736pu.C19006n;
import p736pu.C19007o;
import p824tp.C19728f;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import z20.C20806a;

/* renamed from: qu.h */
public class C19185h extends C15682c<MotStationExitActivationActivity> {

    /* renamed from: u */
    public static final /* synthetic */ int f48779u = 0;

    /* renamed from: n */
    public final C19186a f48780n = new C19186a();

    /* renamed from: o */
    public final C19187b f48781o = new C19187b();

    /* renamed from: p */
    public C13556a f48782p = null;

    /* renamed from: q */
    public C13556a f48783q = null;

    /* renamed from: r */
    public LatLonE6 f48784r;

    /* renamed from: s */
    public ViewGroup f48785s;

    /* renamed from: t */
    public AlertMessageView f48786t;

    /* renamed from: qu.h$a */
    public class C19186a extends C20438i<C18992a, C18995d> {
        public C19186a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C18992a aVar = (C18992a) cVar;
            C19185h.this.mo46784S1();
            C19185h.this.f48782p = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            int i;
            C18992a aVar = (C18992a) cVar;
            C18995d dVar = (C18995d) gVar;
            C19185h hVar = C19185h.this;
            int i2 = C19185h.f48779u;
            hVar.getClass();
            ArrayList arrayList = dVar.f48341n;
            if (arrayList != null) {
                FragmentManager supportFragmentManager = ((MotStationExitActivationActivity) hVar.f40822c).getSupportFragmentManager();
                C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("exitStations", C13717b.m34264k(arrayList));
                C19188i iVar = new C19188i();
                iVar.setArguments(bundle);
                K.mo4111f(R.id.fragments_container, iVar, "manual_selection");
                K.mo4040d();
                return;
            }
            C18830b bVar = dVar.f48340m;
            C13744a.m34300b((ImageView) hVar.f48785s.findViewById(R.id.agency_image), bVar.f47944c.f39024c);
            ((TextView) hVar.f48785s.findViewById(R.id.station_name)).setText(bVar.f47944c.f39023b.f23731c);
            ListItemView listItemView = (ListItemView) hVar.f48785s.findViewById(R.id.passenger_ticket_view).findViewById(R.id.ticket_fare_view);
            if (bVar.f47943b.mo45549c()) {
                i = R.string.payment_mot_passenger_fare_discount;
            } else {
                i = R.string.payment_mot_passenger_fare_regular;
            }
            listItemView.setTitle(i);
            MotActivationPrice motActivationPrice = bVar.f47943b;
            ((PriceView) listItemView.getAccessoryView()).mo24682a(motActivationPrice.f39005b, motActivationPrice.f39006c, (String) null);
            CurrencyAmount currencyAmount = bVar.f47943b.f39006c;
            View findViewById = hVar.f48785s.findViewById(R.id.additional_passenger_ticket_view);
            boolean z = false;
            if (((MotStationExitActivationActivity) hVar.f40822c).mo45599z2().size() - 1 > 0) {
                ((ListItemView) findViewById.findViewById(R.id.ticket_fare_view)).setTitle((int) R.string.payment_mot_passenger_fare_extra);
                ((TextView) findViewById.findViewById(R.id.price)).setText(currencyAmount.toString());
                ((FormatTextView) findViewById.findViewById(R.id.passenger_count)).setArguments(Integer.valueOf(((MotStationExitActivationActivity) hVar.f40822c).mo45599z2().size() - 1));
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(8);
            }
            CurrencyAmount b = bVar.f47943b.mo45548b(((MotStationExitActivationActivity) hVar.f40822c).mo45599z2().size());
            ((PriceView) ((ListItemView) hVar.f48785s.findViewById(R.id.total_price_sum)).getAccessoryView()).mo24682a(b, b, (String) null);
            ((Button) hVar.f48785s.findViewById(R.id.finish_ride_view)).setOnClickListener(new C7157b(3, hVar, bVar));
            ((Button) hVar.f48785s.findViewById(R.id.cancel_view)).setOnClickListener(new C4051q(hVar, 20));
            hVar.mo51611p2(bVar);
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "mot_station_impression");
            aVar2.mo49939g(AnalyticsAttributeKey.STATE, "mot_station_location_regular");
            aVar2.mo49937e(AnalyticsAttributeKey.STOP_ID, bVar.f47944c.f39023b.f23730b);
            AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.MANUAL_SELECTION;
            if (hVar.f48784r != null) {
                z = true;
            }
            aVar2.mo49941i(analyticsAttributeKey, z);
            hVar.mo46797j2(aVar2.mo49933a());
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C13751d.m34341b(((C18992a) cVar).f51759b, "station_exit_error_dialog", exc).show(C19185h.this.getChildFragmentManager(), "station_exit_error_dialog");
            return true;
        }
    }

    /* renamed from: qu.h$b */
    public class C19187b extends C20438i<C19006n, C19007o> {
        public C19187b() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C19006n nVar = (C19006n) cVar;
            C19185h.this.mo46784S1();
            C19185h.this.f48783q = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            CurrencyAmount currencyAmount;
            CurrencyAmount currencyAmount2;
            CurrencyAmount currencyAmount3;
            C19006n nVar = (C19006n) cVar;
            C19185h hVar = C19185h.this;
            ArrayList arrayList = ((C19007o) gVar).f48361m;
            int i = C19185h.f48779u;
            hVar.getClass();
            if (!C13717b.m34258e(arrayList)) {
                MotActivation motActivation = (MotActivation) arrayList.get(0);
                MotActivationPrice motActivationPrice = motActivation.f38995l;
                C20806a.C20807a aVar = new C20806a.C20807a(ProductAction.ACTION_PURCHASE);
                aVar.mo52934b("mot", "feature");
                aVar.mo52934b("IsraelMot", "payment_context");
                aVar.mo52936d("item_id", motActivation.f38985b);
                aVar.mo52934b(motActivation.f38986c, "item_name");
                aVar.mo52934b(Integer.valueOf(arrayList.size()), "number_of_items");
                aVar.mo52934b(C25541a.m63895z(C7843b.m17877d(motActivation.mo45524b())), "transit_type");
                aVar.mo52934b(motActivation.mo45529f(), "agency_name");
                if (motActivationPrice != null) {
                    currencyAmount = motActivationPrice.f39005b;
                } else {
                    currencyAmount = null;
                }
                aVar.mo52938f(currencyAmount);
                if (motActivationPrice != null) {
                    currencyAmount2 = motActivationPrice.f39005b;
                } else {
                    currencyAmount2 = null;
                }
                aVar.mo52937e(InAppPurchaseMetaData.KEY_PRICE, currencyAmount2);
                if (motActivationPrice != null) {
                    currencyAmount3 = motActivationPrice.mo45548b(arrayList.size());
                } else {
                    currencyAmount3 = null;
                }
                aVar.mo52937e("revenue", currencyAmount3);
                aVar.mo52935c();
            }
            hVar.startActivity(MotQrCodeViewerActivity.m38705y2(hVar.requireContext(), (ServerId) null, ((MotActivation) arrayList.get(0)).f38989f));
            ((MotStationExitActivationActivity) hVar.f40822c).finish();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C19006n nVar = (C19006n) cVar;
            C19185h hVar = C19185h.this;
            hVar.mo46795h2(C13751d.m34341b(hVar.requireContext(), (String) null, exc));
            return true;
        }
    }

    public C19185h() {
        super(MotStationExitActivationActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("METRO_CONTEXT");
    }

    /* renamed from: m2 */
    public final void mo51608m2() {
        CharSequence charSequence;
        if (this.f48784r == null) {
            charSequence = getResources().getText(R.string.payment_mot_entrance_find_location);
        } else {
            charSequence = "";
        }
        this.f40822c.mo44543u2(charSequence);
        C13556a aVar = this.f48782p;
        if (aVar != null) {
            aVar.cancel(true);
            this.f48782p = null;
        }
        LatLonE6 latLonE6 = this.f48784r;
        if (latLonE6 != null) {
            mo51609n2(latLonE6);
            return;
        }
        LocationSettingsFixer.C16198a aVar2 = new LocationSettingsFixer.C16198a((C15682c<?>) this);
        aVar2.f42260g = true;
        aVar2.mo48528a(new C17926b(this, 1));
    }

    /* renamed from: n2 */
    public final void mo51609n2(LatLonE6 latLonE6) {
        C18992a aVar = new C18992a(mo46783R1(), latLonE6);
        RequestOptions L1 = mo46777L1();
        L1.f42909f = true;
        this.f48782p = mo46793f2(C18992a.class.getName() + aVar.f48337w, aVar, L1, this.f48780n);
    }

    /* renamed from: o2 */
    public final void mo51610o2(LatLonE6 latLonE6) {
        MotActivation motActivation;
        MotActivationStationInfo motActivationStationInfo;
        boolean z;
        if (this.f48783q == null && mo46785T1("METRO_CONTEXT") && (motActivation = (MotActivation) C13717b.m34256c(((MotStationExitActivationActivity) this.f40822c).mo45599z2())) != null && (motActivationStationInfo = motActivation.f38997n) != null) {
            mo46796i2();
            C19728f fVar = (C19728f) mo46776J1("METRO_CONTEXT");
            String str = motActivation.f38989f;
            ServerId c = motActivationStationInfo.mo45575c();
            C13752e R1 = mo46783R1();
            if (this.f48784r != null) {
                z = true;
            } else {
                z = false;
            }
            C19006n nVar = new C19006n(R1, fVar, latLonE6, c, str, z);
            RequestOptions L1 = mo46777L1();
            L1.f42909f = true;
            this.f48783q = mo46793f2(C19006n.class.getName() + nVar.f51768k, nVar, L1, this.f48781o);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f48784r = (LatLonE6) mo46782Q1().getParcelable("manualLocation");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mot_station_exit_activation_fragment, viewGroup, false);
        this.f48785s = (ViewGroup) inflate.findViewById(R.id.activation_details);
        this.f48786t = (AlertMessageView) inflate.findViewById(R.id.error_view);
        return inflate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r2 = this;
            super.onStart()
            com.moovit.commons.geo.LatLonE6 r0 = r2.f48784r
            if (r0 == 0) goto L_0x001d
            android.view.View r0 = r2.getView()
            if (r0 == 0) goto L_0x0017
            r1 = 2131364674(0x7f0a0b42, float:1.8349192E38)
            java.lang.Object r0 = r0.getTag(r1)
            ou.b r0 = (p712ou.C18830b) r0
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 != 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r0 = 0
            goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            if (r0 == 0) goto L_0x0023
            r2.mo51608m2()
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p757qu.C19185h.onStart():void");
    }

    public final void onStop() {
        super.onStop();
        C13556a aVar = this.f48782p;
        if (aVar != null) {
            aVar.cancel(true);
            this.f48782p = null;
        }
    }

    /* renamed from: p2 */
    public final void mo51611p2(C18830b bVar) {
        if (bVar != null) {
            this.f48785s.setTag(R.id.view_tag_param1, bVar);
            this.f48785s.setVisibility(0);
            this.f48786t.setVisibility(8);
            return;
        }
        this.f48785s.setTag(R.id.view_tag_param1, (Object) null);
        this.f48785s.setVisibility(8);
        this.f48786t.setVisibility(0);
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("station_exit_error_dialog".equals(str)) {
            ((MotStationExitActivationActivity) this.f40822c).finish();
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }
}
