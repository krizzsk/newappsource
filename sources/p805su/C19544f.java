package p805su;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.model.MotActivationPrice;
import com.moovit.app.mot.purchase.model.MotQrCodeStationFare;
import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.map.C16281i;
import com.moovit.map.C16285j;
import com.moovit.map.LineStyle;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.view.PriceView;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import g20.C17161i;
import ja0.C12793c;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import k00.C17988b;
import o20.C18699e;
import p054d0.C4268a1;
import p072e6.C4565c;
import p073e7.C4583a;
import p241s0.C6302b;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p297w5.C6994a;
import p543hq.C17474b;
import p687nt.C18602j;
import p781ru.C19331d;
import p824tp.C19728f;
import p829tu.C19780k;
import q00.C19047a;
import z00.C20795a;
import z20.C20806a;

/* renamed from: su.f */
public class C19544f extends C19539a {

    /* renamed from: s */
    public static final /* synthetic */ int f49659s = 0;

    /* renamed from: n */
    public final C6302b<ServerId, Object> f49660n = new C6302b<>(0);

    /* renamed from: o */
    public MapFragment f49661o;

    /* renamed from: p */
    public RecyclerView f49662p;

    /* renamed from: q */
    public Button f49663q;

    /* renamed from: r */
    public MotQrCodeTrip f49664r;

    /* renamed from: su.f$a */
    public class C19545a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final C6994a f49665g;

        /* renamed from: h */
        public final C17161i<C16181a.C16184c, TransitLine> f49666h;

        /* renamed from: i */
        public final List<C19546b> f49667i;

        /* renamed from: j */
        public int f49668j;

        public C19545a() {
            throw null;
        }

        public C19545a(C19728f fVar, ArrayList arrayList) {
            this.f49665g = new C6994a(this, 20);
            this.f49668j = -1;
            this.f49666h = fVar.mo52082b(LinePresentationType.STOP_DETAIL);
            this.f49667i = arrayList;
        }

        public final int getItemCount() {
            return this.f49667i.size();
        }

        public final int getItemViewType(int i) {
            return this.f49667i.get(i).f49670a;
        }

        /* renamed from: j */
        public final void mo51904j(int i, boolean z) {
            int i2 = this.f49668j;
            if (i2 != -1) {
                C19546b bVar = this.f49667i.get(i2);
                TransitStop transitStop = bVar.f49671b;
                MotQrCodeStationFare motQrCodeStationFare = bVar.f49672c;
                C21100e.m49373x(transitStop, "stop");
                C21100e.m49373x(motQrCodeStationFare, "fare");
                this.f49667i.set(this.f49668j, new C19546b(R.layout.mot_qr_code_activation_destination_stop_list_item, transitStop, motQrCodeStationFare));
                notifyItemChanged(this.f49668j);
            }
            this.f49668j = i;
            C19546b bVar2 = this.f49667i.get(i);
            List<C19546b> list = this.f49667i;
            TransitStop transitStop2 = bVar2.f49671b;
            MotQrCodeStationFare motQrCodeStationFare2 = bVar2.f49672c;
            C21100e.m49373x(transitStop2, "stop");
            C21100e.m49373x(motQrCodeStationFare2, "fare");
            list.set(i, new C19546b(R.layout.mot_qr_code_activation_destination_selected_stop_list_item, transitStop2, motQrCodeStationFare2));
            notifyItemChanged(i);
            if (z) {
                C19544f fVar = C19544f.this;
                MotQrCodeStationFare motQrCodeStationFare3 = bVar2.f49672c;
                int i3 = C19544f.f49659s;
                fVar.mo51903s2("mot_dest_stop_clicked", motQrCodeStationFare3);
                MapFragment X = fVar.mo51899X();
                X.mo48664z2(motQrCodeStationFare3.f39069c.f23732d, 16.0f);
                Object orDefault = fVar.f49660n.getOrDefault(motQrCodeStationFare3.f39069c.f23730b, null);
                if (orDefault != null) {
                    MapFragment.C16229j jVar = (MapFragment.C16229j) orDefault;
                    C16285j jVar2 = X.f42368n;
                    if (jVar2 != null) {
                        jVar2.mo48788e(jVar.f42419a);
                    }
                }
                fVar.mo51901q2(motQrCodeStationFare3);
            }
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            C12797f fVar = (C12797f) a0Var;
            C19546b bVar = this.f49667i.get(i);
            switch (fVar.getItemViewType()) {
                case R.layout.mot_qr_code_activation_destination_line_list_item:
                    C16181a.m41233b(this.f49666h, (ListItemView) fVar.itemView, C19544f.this.f49664r.f39073c);
                    return;
                case R.layout.mot_qr_code_activation_destination_origin_stop_list_item:
                    ((ListItemView) fVar.itemView).setTitle((CharSequence) bVar.f49671b.f23731c);
                    return;
                case R.layout.mot_qr_code_activation_destination_selected_stop_list_item:
                    ListItemView listItemView = (ListItemView) fVar.itemView;
                    listItemView.setText((CharSequence) bVar.f49671b.f23731c);
                    listItemView.setActivated(true);
                    MotActivationPrice motActivationPrice = bVar.f49672c.f39071e.f39056c.f39014c;
                    ((PriceView) listItemView.getAccessoryView()).mo24682a(motActivationPrice.f39005b, motActivationPrice.f39006c, (String) null);
                    listItemView.post(new C4268a1(listItemView, 13));
                    return;
                case R.layout.mot_qr_code_activation_destination_stop_list_item:
                    TextView textView = (TextView) fVar.itemView;
                    textView.setOnClickListener(this.f49665g);
                    textView.setText(bVar.f49671b.f23731c);
                    return;
                default:
                    return;
            }
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            View e = C13715c.m34239e(viewGroup, i, viewGroup, false);
            if (i == R.layout.mot_qr_code_activation_destination_title_list_item) {
                C6333d0.m15030r(e, true);
            }
            C12797f fVar = new C12797f(e);
            e.setTag(fVar);
            return fVar;
        }
    }

    /* renamed from: su.f$b */
    public static class C19546b {

        /* renamed from: a */
        public final int f49670a;

        /* renamed from: b */
        public final TransitStop f49671b;

        /* renamed from: c */
        public final MotQrCodeStationFare f49672c;

        public C19546b(int i, TransitStop transitStop, MotQrCodeStationFare motQrCodeStationFare) {
            this.f49670a = i;
            this.f49671b = transitStop;
            this.f49672c = motQrCodeStationFare;
        }
    }

    /* renamed from: su.f$c */
    public static class C19547c extends C4565c {

        /* renamed from: b */
        public final LayoutInflater f49673b;

        public C19547c(Context context) {
            super(2);
            this.f49673b = LayoutInflater.from(context);
        }

        @SuppressLint({"InflateParams"})
        /* renamed from: b */
        public final View mo20078b(Object obj) {
            if (!(obj instanceof MotQrCodeStationFare)) {
                return null;
            }
            TextView textView = (TextView) this.f49673b.inflate(R.layout.mot_qr_code_activation_destination_marker_info, (ViewGroup) null, false);
            textView.setText(((MotQrCodeStationFare) obj).f39069c.f23731c);
            return textView;
        }
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return C16530d.m42016i(2, "METRO_CONTEXT", "CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        Tasks.call(MoovitExecutors.f37327IO, new C19780k(mo51896n2(), mo46783R1(), (C19728f) mo46776J1("METRO_CONTEXT"), (C19047a) mo46776J1("CONFIGURATION"), this.f49664r)).addOnSuccessListener((Activity) requireActivity(), new C19542d(0, this, (C19728f) mo46776J1("METRO_CONTEXT"))).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C19543e(this, 0));
    }

    /* renamed from: X */
    public final MapFragment mo51899X() {
        if (this.f49661o == null) {
            this.f49661o = (MapFragment) getChildFragmentManager().mo3983z(R.id.map_fragment);
        }
        MapFragment mapFragment = this.f49661o;
        C21100e.m49373x(mapFragment, "mapFragment");
        return mapFragment;
    }

    /* renamed from: m2 */
    public final int mo51895m2() {
        return 0;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f49664r = (MotQrCodeTrip) mo46782Q1().getParcelable("trip");
        MarketingEventImpressionBinder.m41586a(this, new C20806a("destination_station_view"));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.mot_qr_code_activation_destination_stop_selection_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MapFragment X = mo51899X();
        C19547c cVar = new C19547c(view.getContext());
        X.f42341D0 = cVar;
        C16285j jVar = X.f42368n;
        if (jVar != null) {
            jVar.mo48813u(cVar);
        }
        X.mo48658u2(new C19540b(this));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f49662p = recyclerView;
        recyclerView.setAdapter(new C12793c());
        Button button = (Button) view.findViewById(R.id.button);
        this.f49663q = button;
        button.setOnClickListener(new C4583a(this, 17));
        View view2 = (View) this.f49663q.getParent();
        UiUtils.m40259r(view2, new C19541c(this, view2, X));
    }

    /* renamed from: p2 */
    public final void mo51900p2(MapFragment mapFragment, C19331d dVar) {
        if (!mapFragment.mo48624U2()) {
            mapFragment.mo48656t2(new C18602j(this, mapFragment, dVar));
            return;
        }
        mapFragment.mo48609E2();
        this.f49660n.mo22405b(dVar.f49191d.size());
        for (TransitStop next : dVar.f49191d) {
            SparseArray<MarkerZoomStyle> c = MarkerZoomStyle.m41440c(next.f23738j);
            C16281i.m41507c(c);
            this.f49660n.put(next.f23730b, mapFragment.mo48648p2(next, dVar.f49192e.get(next.f23730b), C18699e.m45697a(c)));
        }
        Context requireContext = requireContext();
        LineStyle o = C16281i.m41519o(requireContext, C7843b.m17874a(requireContext, this.f49664r.f39073c.mo24369b()));
        mapFragment.mo48642m2(dVar.f49193f, o, C7843b.m17875b(requireContext, o.f42326b));
        if (!dVar.f49191d.isEmpty()) {
            mapFragment.mo48664z2(dVar.f49191d.get(0).f23732d, 16.0f);
        }
    }

    /* renamed from: q2 */
    public final void mo51901q2(MotQrCodeStationFare motQrCodeStationFare) {
        boolean z;
        if (this.f49663q.getTag() == null) {
            z = true;
        } else {
            z = false;
        }
        this.f49663q.setTag(motQrCodeStationFare);
        if (z) {
            ViewGroup viewGroup = (ViewGroup) this.f49663q.getParent();
            viewGroup.setVisibility(0);
            C6382p0 a = C6333d0.m15013a(viewGroup);
            a.mo22499i(BitmapDescriptorFactory.HUE_RED);
            a.mo22498h();
        }
    }

    /* renamed from: r2 */
    public final void mo51902r2() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_dest_stop_selection_impression");
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, false);
        aVar.mo49935c(AnalyticsAttributeKey.COUNT, 0);
        mo46797j2(aVar.mo49933a());
        mo51897o2();
        RecyclerView recyclerView = this.f49662p;
        Context requireContext = requireContext();
        C21100e.m49373x(requireContext, AppActionRequest.KEY_CONTEXT);
        recyclerView.setAdapter(new C20795a(C17988b.m44611b(R.drawable.img_empty_error_sign, requireContext), (CharSequence) null, requireContext.getText(R.string.response_read_error_message)));
    }

    /* renamed from: s2 */
    public final void mo51903s2(String str, MotQrCodeStationFare motQrCodeStationFare) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, str);
        aVar.mo49937e(AnalyticsAttributeKey.ID, motQrCodeStationFare.f39071e.f39055b.f39016b);
        aVar.mo49937e(AnalyticsAttributeKey.ITEM_ID, motQrCodeStationFare.f39071e.f39056c.f39013b.f39009b);
        aVar.mo49937e(AnalyticsAttributeKey.LINE_GROUP_ID, motQrCodeStationFare.f39068b.mo24369b().f23694b);
        aVar.mo49937e(AnalyticsAttributeKey.LINE_ID, motQrCodeStationFare.f39068b.f23687c);
        aVar.mo49937e(AnalyticsAttributeKey.TO_STOP, motQrCodeStationFare.f39069c.f23730b);
        aVar.mo49934b(AnalyticsAttributeKey.DISTANCE, motQrCodeStationFare.f39070d);
        mo46797j2(aVar.mo49933a());
    }
}
