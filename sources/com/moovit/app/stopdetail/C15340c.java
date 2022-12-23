package com.moovit.app.stopdetail;

import a00.C13382a;
import aa0.C7554s;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c00.C13733n;
import ce0.C21100e;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.realtimehelp.RealTimeHelpBannerView;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.arrivals.ArrivalsResponseKey;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.database.DbEntityRef;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.design.view.AlertMessageView;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.metro.ReportCategoryType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitType;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.CongestionLevel;
import com.moovit.util.time.CongestionSource;
import com.moovit.util.time.StopRealTimeCongestion;
import com.moovit.util.time.StopRealTimeInformation;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import g20.C17161i;
import j80.C12775d;
import ja0.C12797f;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import k00.C17988b;
import p241s0.C6302b;
import p241s0.C6307g;
import p259t5.C6592b;
import p451du.C16723t;
import p453dw.C16738n;
import p455dy.C16753e;
import p732pq.C18947h;
import p824tp.C19728f;
import p824tp.C19735m;
import p824tp.C19739q;
import p824tp.C19746x;
import p874vr.C20199a;
import p952yy.C20787c;
import p977zz.C20941h;
import p977zz.C20964s0;
import q00.C19047a;
import x00.C20440a;

/* renamed from: com.moovit.app.stopdetail.c */
public final class C15340c extends RecyclerView.Adapter<RecyclerView.C1119a0> {

    /* renamed from: g */
    public final C15341a f39702g = new C15341a();

    /* renamed from: h */
    public final C15342b f39703h = new C15342b();

    /* renamed from: i */
    public final C15343c f39704i = new C15343c();

    /* renamed from: j */
    public final TransitStop f39705j;

    /* renamed from: k */
    public Map<ServerId, C12775d> f39706k;

    /* renamed from: l */
    public final HashSet f39707l;

    /* renamed from: m */
    public final C6302b f39708m;

    /* renamed from: n */
    public Time f39709n = null;

    /* renamed from: o */
    public boolean f39710o = false;

    /* renamed from: p */
    public ArrivalsResponseKey f39711p = ArrivalsResponseKey.NOW_BASED_RESPONSE;

    /* renamed from: q */
    public TransitType f39712q = null;

    /* renamed from: r */
    public CharSequence f39713r = null;

    /* renamed from: s */
    public StopRealTimeCongestion f39714s = null;

    /* renamed from: t */
    public Drawable f39715t = null;

    /* renamed from: u */
    public final C15345e f39716u;

    /* renamed from: v */
    public ServerId f39717v;

    /* renamed from: w */
    public final C16738n f39718w;

    /* renamed from: com.moovit.app.stopdetail.c$a */
    public class C15341a implements View.OnClickListener {
        public C15341a() {
        }

        public final void onClick(View view) {
            C15340c cVar = C15340c.this;
            cVar.f39716u.mo45912W((TextView) view, cVar.f39709n);
        }
    }

    /* renamed from: com.moovit.app.stopdetail.c$b */
    public class C15342b implements View.OnClickListener {
        public C15342b() {
        }

        public final void onClick(View view) {
            C15340c.this.f39716u.mo45909N0();
        }
    }

    /* renamed from: com.moovit.app.stopdetail.c$c */
    public class C15343c implements View.OnClickListener {
        public C15343c() {
        }

        public final void onClick(View view) {
            C15340c.this.f39716u.mo45908N();
            C15340c.this.notifyDataSetChanged();
        }
    }

    /* renamed from: com.moovit.app.stopdetail.c$d */
    public static /* synthetic */ class C15344d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39722a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.transit.TransitType$ViewType[] r0 = com.moovit.transit.TransitType.ViewType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39722a = r0
                com.moovit.transit.TransitType$ViewType r1 = com.moovit.transit.TransitType.ViewType.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39722a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.transit.TransitType$ViewType r1 = com.moovit.transit.TransitType.ViewType.TRIPS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f39722a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.transit.TransitType$ViewType r1 = com.moovit.transit.TransitType.ViewType.PLATFORMS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.stopdetail.C15340c.C15344d.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.stopdetail.c$e */
    public interface C15345e {
        /* renamed from: N */
        void mo45908N();

        /* renamed from: N0 */
        void mo45909N0();

        /* renamed from: R */
        void mo45910R(TransitStop transitStop, CongestionLevel congestionLevel);

        /* renamed from: T */
        void mo45911T(TransitStop transitStop);

        /* renamed from: W */
        void mo45912W(TextView textView, Time time);

        /* renamed from: Y */
        void mo45913Y(TransitLine transitLine, C12775d dVar, String str);

        /* renamed from: h0 */
        void mo45914h0(TransitLine transitLine, Time time, C12775d dVar);
    }

    /* renamed from: com.moovit.app.stopdetail.c$f */
    public static class C15346f implements C13733n<DbEntityRef<TransitLine>, TransitType> {
        public final Object convert(Object obj) throws Exception {
            DbEntityRef dbEntityRef = (DbEntityRef) obj;
            TransitLine transitLine = (TransitLine) dbEntityRef.get();
            if (transitLine != null) {
                TransitAgency transitAgency = transitLine.mo24369b().f23696d.get();
                if (transitAgency != null) {
                    TransitType transitType = transitAgency.f23674d.get();
                    if (transitType != null) {
                        return transitType;
                    }
                    StringBuilder k = C13555b.m33972k("Unable to resolve transit line, ");
                    k.append(dbEntityRef.getServerId());
                    k.append(", transit type");
                    throw new IllegalStateException(k.toString());
                }
                StringBuilder k2 = C13555b.m33972k("Unable to resolve transit line, ");
                k2.append(dbEntityRef.getServerId());
                k2.append(", agency");
                throw new IllegalStateException(k2.toString());
            }
            StringBuilder k3 = C13555b.m33972k("Unable to resolve transit line: ");
            k3.append(dbEntityRef.getServerId());
            throw new IllegalStateException(k3.toString());
        }
    }

    /* renamed from: com.moovit.app.stopdetail.c$g */
    public static class C15347g implements C13722f<DbEntityRef<TransitLine>> {

        /* renamed from: b */
        public final TransitType f39723b;

        public C15347g(TransitType transitType) {
            this.f39723b = transitType;
        }

        /* renamed from: o */
        public final boolean mo19661o(Object obj) {
            TransitAgency transitAgency;
            TransitLine transitLine = (TransitLine) ((DbEntityRef) obj).get();
            if (transitLine == null || (transitAgency = transitLine.mo24369b().f23696d.get()) == null) {
                return false;
            }
            return this.f39723b.equals(transitAgency.f23674d.get());
        }
    }

    /* renamed from: com.moovit.app.stopdetail.c$h */
    public static class C15348h implements C13733n<TransitType, TransitType.ViewType> {

        /* renamed from: b */
        public final TransitStop f39724b;

        public C15348h(TransitStop transitStop) {
            C21100e.m49373x(transitStop, "stop");
            this.f39724b = transitStop;
        }

        /* renamed from: a */
        public final TransitType.ViewType convert(TransitType transitType) throws RuntimeException {
            TransitType.ViewType viewType = transitType.f23761f;
            if (!TransitType.ViewType.PLATFORMS.equals(viewType)) {
                return viewType;
            }
            for (DbEntityRef<TransitLine> serverId : this.f39724b.f23735g) {
                if (this.f39724b.mo24411c(serverId.getServerId()) == null) {
                    return TransitType.ViewType.DEFAULT;
                }
            }
            return viewType;
        }
    }

    /* renamed from: com.moovit.app.stopdetail.c$i */
    public interface C15349i {
        /* renamed from: b */
        void mo45890b(String str);

        /* renamed from: d */
        RecyclerView.Adapter<?> mo45891d();

        /* renamed from: e */
        void mo45892e(Context context, Time time, boolean z, Map<ArrivalsResponseKey, Map<ServerId, C20787c>> map);

        /* renamed from: f */
        boolean mo45893f();

        /* renamed from: h */
        boolean mo45894h();
    }

    /* renamed from: com.moovit.app.stopdetail.c$j */
    public static class C15350j {

        /* renamed from: a */
        public final Context f39725a;

        /* renamed from: b */
        public final C15340c f39726b;

        /* renamed from: c */
        public final TransitStop f39727c;

        /* renamed from: d */
        public final List<TransitLine> f39728d;

        /* renamed from: e */
        public final Set<ServerId> f39729e;

        /* renamed from: f */
        public final C17161i<C16181a.C16184c, TransitLine> f39730f;

        /* renamed from: g */
        public final C16753e f39731g;

        /* renamed from: h */
        public final C15345e f39732h;

        public C15350j(Context context, C15340c cVar, TransitStop transitStop, TransitType transitType, StopDetailActivity.C15330b bVar, C15345e eVar) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f39725a = context;
            C21100e.m49373x(cVar, "parent");
            this.f39726b = cVar;
            C21100e.m49373x(transitStop, "stop");
            this.f39727c = transitStop;
            List<TransitLine> entities = DbEntityRef.getEntities(C13723g.m34282c(transitStop.f23735g, new C15347g(transitType)));
            this.f39728d = entities;
            HashSet hashSet = new HashSet(entities.size());
            ServerId.m11394f(entities, hashSet);
            this.f39729e = hashSet;
            HashSet hashSet2 = C19728f.f50164e;
            this.f39730f = ((C19728f) context.getSystemService("metro_context")).mo52082b(LinePresentationType.STOP_DETAIL);
            this.f39731g = (C16753e) context.getSystemService("user_favorites_manager_service");
            C21100e.m49373x(bVar, "coordinator");
            C21100e.m49373x(eVar, "clickListener");
            this.f39732h = eVar;
        }
    }

    public C15340c(Context context, TransitStop transitStop, ServerId serverId, StopDetailActivity.C15330b bVar, C15345e eVar, C16738n nVar) {
        Object obj;
        TransitStop transitStop2 = transitStop;
        C15345e eVar2 = eVar;
        C16738n nVar2 = nVar;
        C21100e.m49373x(transitStop2, "stop");
        this.f39705j = transitStop2;
        this.f39717v = serverId;
        C21100e.m49373x(eVar2, "clickListener");
        this.f39716u = eVar2;
        C21100e.m49373x(nVar2, "stopImagesManager");
        this.f39718w = nVar2;
        this.f39706k = Collections.emptyMap();
        HashSet<O> g = C13720d.m34277g(transitStop2.f23735g, (C13722f) null, new C15346f());
        C15348h hVar = new C15348h(transitStop2);
        this.f39707l = C13720d.m34277g(g, (C13722f) null, hVar);
        this.f39708m = new C6302b(g.size());
        for (O o : g) {
            TransitType.ViewType a = hVar.convert(o);
            C6302b bVar2 = this.f39708m;
            C15350j jVar = new C15350j(context, this, transitStop, o, bVar, eVar);
            int i = C15344d.f39722a[a.ordinal()];
            if (i == 1) {
                obj = new C15338a(jVar);
            } else if (i == 2) {
                obj = new C15355e(new C15351d(jVar), transitStop2.f23730b);
            } else if (i == 3) {
                obj = new C15339b(jVar);
            } else {
                throw new IllegalStateException("Unknown transit type view type: " + a);
            }
            bVar2.put(o, obj);
        }
    }

    public final int getItemCount() {
        int i = 0;
        if (this.f39708m.getOrDefault(this.f39712q, null) != null) {
            i = 0 + ((C15349i) this.f39708m.getOrDefault(this.f39712q, null)).mo45891d().getItemCount();
        }
        return mo45923j() + i;
    }

    public final int getItemViewType(int i) {
        int i2;
        if (i == 0) {
            return -1;
        }
        if (this.f39713r != null) {
            return -3;
        }
        if (this.f39712q == null) {
            return -2;
        }
        boolean d = RealTimeHelpBannerView.m38838d(MoovitAppApplication.m37038x());
        boolean z = true;
        if (i == 1 && d) {
            return -4;
        }
        if (d) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        if (this.f39714s == null || i != i2) {
            z = false;
        }
        if (z) {
            return -5;
        }
        return ((C15349i) this.f39708m.getOrDefault(this.f39712q, null)).mo45891d().getItemViewType(i - mo45923j());
    }

    /* renamed from: j */
    public final int mo45923j() {
        int i = 2;
        if (this.f39712q == null || this.f39713r != null) {
            return 2;
        }
        if (!RealTimeHelpBannerView.m38838d(MoovitAppApplication.m37038x())) {
            i = 1;
        }
        if (this.f39714s != null) {
            return i + 1;
        }
        return i;
    }

    /* renamed from: k */
    public final void mo45924k(Context context, Time time, boolean z, Map<ArrivalsResponseKey, Map<ServerId, C20787c>> map) {
        Collection collection;
        StopRealTimeInformation stopRealTimeInformation;
        StopRealTimeCongestion stopRealTimeCongestion;
        long j;
        this.f39709n = time;
        this.f39710o = z;
        ArrivalsResponseKey keyType = ArrivalsResponseKey.getKeyType(time, z);
        this.f39711p = keyType;
        StopRealTimeCongestion stopRealTimeCongestion2 = null;
        this.f39713r = null;
        this.f39715t = null;
        Map map2 = map.get(keyType);
        Map map3 = map.get(ArrivalsResponseKey.NOW_BASED_RESPONSE);
        if (map3 != null) {
            collection = map3.values();
        } else {
            collection = map2.values();
        }
        ServerId serverId = this.f39705j.f23730b;
        int i = C7843b.f23777a;
        C20787c cVar = (C20787c) C13723g.m34286g(collection, new C18947h(serverId, 7));
        if (cVar != null) {
            stopRealTimeInformation = cVar.f52459d;
        } else {
            stopRealTimeInformation = null;
        }
        if (stopRealTimeInformation != null) {
            stopRealTimeCongestion = stopRealTimeInformation.f23898b.get((Object) null);
        } else {
            stopRealTimeCongestion = null;
        }
        C19047a a = C19047a.m46164a(context.getApplicationContext());
        boolean z2 = false;
        if (a != null) {
            if (stopRealTimeCongestion != null) {
                j = C7925b.m18026n(stopRealTimeCongestion.f23895d, System.currentTimeMillis());
            } else {
                j = Long.MAX_VALUE;
            }
            long longValue = ((Long) a.mo51505b(C20199a.f51260V0)).longValue();
            if (0 <= j && j <= TimeUnit.SECONDS.toMinutes(longValue)) {
                z2 = true;
            }
        }
        if (z2) {
            stopRealTimeCongestion2 = stopRealTimeCongestion;
        }
        this.f39714s = stopRealTimeCongestion2;
        Iterator it = ((C6307g.C6312e) this.f39708m.values()).iterator();
        while (it.hasNext()) {
            ((C15349i) it.next()).mo45892e(context, time, z, map);
        }
        notifyDataSetChanged();
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        int i2;
        int i3;
        int i4;
        long j;
        boolean z;
        CharSequence charSequence;
        int i5;
        boolean z2;
        int i6;
        C19728f a;
        boolean z3;
        int i7;
        int i8;
        int i9;
        boolean z4;
        C15349i iVar;
        RecyclerView.C1119a0 a0Var2 = a0Var;
        int itemViewType = a0Var.getItemViewType();
        int i11 = 8;
        if (itemViewType == -5) {
            C12797f fVar = (C12797f) a0Var2;
            StopRealTimeCongestion stopRealTimeCongestion = this.f39714s;
            CongestionLevel congestionLevel = stopRealTimeCongestion.f23893b;
            CongestionSource congestionSource = stopRealTimeCongestion.f23894c;
            ViewGroup viewGroup = (ViewGroup) fVar.mo39639f(R.id.congestion_container);
            Context e = fVar.mo39638e();
            C20440a aVar = C7554s.f23036a;
            int[] iArr = C7554s.C7555a.f23038a;
            switch (iArr[congestionLevel.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    i2 = C19735m.colorSurfaceInfo;
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    i2 = C19735m.colorSurfaceCritical;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            viewGroup.setBackgroundTintList(C20941h.m49044g(i2, e));
            TextView textView = (TextView) fVar.mo39639f(R.id.status);
            switch (iArr[congestionLevel.ordinal()]) {
                case 1:
                    i4 = C19739q.ic_crowded_empty_24_on_surface_emphasis_high;
                    i3 = C19746x.crowdedness_empty;
                    break;
                case 2:
                case 3:
                    i4 = C19739q.ic_crowded_low_24_on_surface_emphasis_high;
                    i3 = C19746x.crowdedness_half_full;
                    break;
                case 4:
                case 5:
                    i4 = C19739q.ic_crowded_medium_24_critical;
                    i3 = C19746x.crowdedness_full;
                    break;
                case 6:
                case 7:
                    i4 = C19739q.ic_crowded_high_24_critical;
                    i3 = C19746x.crowdedness_packed;
                    break;
                default:
                    i4 = 0;
                    i3 = 0;
                    break;
            }
            Context context = textView.getContext();
            C15780a.m40271d(textView, UiUtils.Edge.LEFT, C17988b.m44611b(i4, context));
            textView.setText(i3);
            C13382a.m33674j(textView, context.getString(C19746x.voiceover_station_crowdedness, new Object[]{textView.getText()}));
            TextView textView2 = (TextView) fVar.mo39639f(R.id.time_status);
            StopRealTimeCongestion stopRealTimeCongestion2 = this.f39714s;
            if (stopRealTimeCongestion2 != null) {
                j = C7925b.m18026n(stopRealTimeCongestion2.f23895d, System.currentTimeMillis());
            } else {
                j = Long.MAX_VALUE;
            }
            if (j < 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                charSequence = fVar.mo39638e().getString(R.string.now);
            } else {
                charSequence = DateUtils.getRelativeTimeSpanString(this.f39714s.f23895d, System.currentTimeMillis(), 60000, SQLiteDatabase.OPEN_PRIVATECACHE);
            }
            textView2.setText(charSequence);
            FormatTextView formatTextView = (FormatTextView) fVar.mo39639f(R.id.crowdedness_banner_message);
            switch (iArr[congestionLevel.ordinal()]) {
                case 1:
                    i5 = C19746x.crowdedness_empty;
                    break;
                case 2:
                case 3:
                    i5 = C19746x.crowdedness_half_full;
                    break;
                case 4:
                case 5:
                    i5 = C19746x.crowdedness_full;
                    break;
                case 6:
                case 7:
                    i5 = C19746x.crowdedness_packed;
                    break;
                default:
                    i5 = 0;
                    break;
            }
            if (i5 != 0) {
                formatTextView.setArguments(formatTextView.getContext().getString(i5).toLowerCase());
            } else {
                formatTextView.setText("");
            }
            fVar.mo39639f(R.id.crowdedness_confirmed_view).setOnClickListener(new C16723t(2, this, congestionLevel));
            fVar.mo39639f(R.id.crowdedness_report_view).setOnClickListener(new C6592b(this, 28));
            View f = fVar.mo39639f(R.id.crowdedness_report_group);
            Context e2 = fVar.mo39638e();
            C19047a a2 = C19047a.m46164a(e2.getApplicationContext());
            if (a2 == null || !((Boolean) a2.mo51505b(C20199a.f51284k0)).booleanValue() || (a = C19728f.m47195a(e2.getApplicationContext())) == null || !a.f50165a.f16138m.contains(ReportCategoryType.STOP_CROWDEDNESS) || (CongestionSource.SENSOR.equals(congestionSource) && j <= 2)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            f.setVisibility(i6);
            Context context2 = textView.getContext();
            if (z) {
                charSequence = context2.getText(R.string.now);
            }
            C13382a.m33674j(textView2, context2.getString(R.string.voiceover_crowdedness_update, new Object[]{charSequence}));
        } else if (itemViewType == -4) {
            RealTimeHelpBannerView realTimeHelpBannerView = (RealTimeHelpBannerView) ((C12797f) a0Var2).itemView;
            realTimeHelpBannerView.setOnDismissClickListener(this.f39704i);
            realTimeHelpBannerView.setOnLinkClickListener(this.f39703h);
        } else if (itemViewType == -3) {
            AlertMessageView alertMessageView = (AlertMessageView) ((C12797f) a0Var2).itemView;
            alertMessageView.setSubtitle(this.f39713r);
            alertMessageView.setImage(this.f39715t);
        } else if (itemViewType == -2) {
        } else {
            if (itemViewType != -1) {
                ((C15349i) this.f39708m.getOrDefault(this.f39712q, null)).mo45891d().onBindViewHolder(a0Var2, i - mo45923j());
                return;
            }
            C12797f fVar2 = (C12797f) a0Var2;
            Context e3 = fVar2.mo39638e();
            ((TextView) fVar2.mo39639f(R.id.stop_name)).setText(this.f39705j.f23731c);
            String str = this.f39705j.f23733e;
            boolean z5 = !C20964s0.m49090h(str);
            FormatTextView formatTextView2 = (FormatTextView) fVar2.mo39639f(R.id.stop_code);
            if (z5) {
                formatTextView2.setArguments(str);
                formatTextView2.setVisibility(0);
            } else {
                formatTextView2.setVisibility(8);
            }
            if ((this.f39705j.f23745q.f23627b & 1) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            View f2 = fVar2.mo39639f(R.id.accessibility);
            if (z3) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            f2.setVisibility(i7);
            View f3 = fVar2.mo39639f(R.id.subtitle);
            if (z5 || z3) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            f3.setVisibility(i8);
            View f4 = fVar2.mo39639f(R.id.divider);
            if (!z5 || !z3) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            f4.setVisibility(i9);
            TextView textView3 = (TextView) fVar2.mo39639f(R.id.time_picker);
            textView3.setOnClickListener(this.f39702g);
            TransitType transitType = this.f39712q;
            if (transitType == null || (iVar = (C15349i) this.f39708m.getOrDefault(transitType, null)) == null || !iVar.mo45894h()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z4) {
                i11 = 0;
            }
            textView3.setVisibility(i11);
            UiUtils.m40265x(textView3, fVar2.mo39639f(R.id.time_picker_spacer));
            if (this.f39710o) {
                textView3.setText(R.string.time_filter_last);
            } else {
                Time time = this.f39709n;
                if (time == null) {
                    textView3.setText(R.string.time_filter_next);
                } else {
                    textView3.setText(C7925b.m18018f(e3, time.mo24631g(), false));
                }
            }
            C13382a.m33674j(textView3, e3.getString(R.string.voiceover_choose_departure_tripplan_time), e3.getString(R.string.voiceover_selected, new Object[]{textView3.getText()}));
            this.f39718w.mo49422v2(this.f39705j.f23730b, (ImageView) fVar2.mo39639f(R.id.thumbnail));
        }
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == -5) {
            return new C12797f(from.inflate(R.layout.stop_detail_congestion, viewGroup, false));
        }
        if (i == -4) {
            RealTimeHelpBannerView realTimeHelpBannerView = new RealTimeHelpBannerView(viewGroup.getContext(), (AttributeSet) null);
            realTimeHelpBannerView.setLayoutParams(UiUtils.m40254m());
            return new C12797f(realTimeHelpBannerView);
        } else if (i == -3) {
            return new C12797f(from.inflate(R.layout.stop_detail_error, viewGroup, false));
        } else {
            if (i == -2) {
                return new C12797f(from.inflate(R.layout.stop_detail_drop_off_only, viewGroup, false));
            }
            if (i == -1) {
                return new C12797f(from.inflate(R.layout.stop_detail_header, viewGroup, false));
            }
            return ((C15349i) this.f39708m.getOrDefault(this.f39712q, null)).mo45891d().onCreateViewHolder(viewGroup, i);
        }
    }
}
