package com.moovit.app.linedetail.p416ui;

import a00.C13382a;
import aa0.C7540l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListPopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import b00.C13556a;
import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import ce0.C21100e;
import com.facebook.appevents.C2341k;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.realtimehelp.RealTimeHelpBannerView;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.commons.view.pager.CharacterPagerStrip;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.design.view.AlertMessageView;
import com.moovit.genies.Genie;
import com.moovit.location.C16202a;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.request.UserRequestError;
import com.moovit.tracing.TraceEvent;
import com.moovit.transit.C7843b;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitType;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import ga0.C12699d;
import h20.C17296a;
import h20.C17297b;
import ja0.C12797f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import k00.C17988b;
import m10.C18316a;
import m10.C18321b;
import n00.C18492b;
import o00.C18669f;
import o00.C18670g;
import o00.C18674j;
import o00.C18675k;
import p001a0.C0016g;
import p039c7.C1800c;
import p041ca.C1832r;
import p066e0.C4452q0;
import p073e7.C4583a;
import p241s0.C6302b;
import p241s0.C6307g;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p297w5.C6996c;
import p304x.C7038d0;
import p304x.C7070l;
import p304x.C7105t1;
import p427cu.C16497a;
import p435de.C16596f;
import p451du.C16706c;
import p451du.C16708e;
import p451du.C16710g;
import p451du.C16712i;
import p475eu.C16882b;
import p499fu.C17073a;
import p499fu.C17074b;
import p523gu.C17228a;
import p523gu.C17231c;
import p543hq.C17474b;
import p567iq.C17637d;
import p664mu.C18454l;
import p824tp.C19728f;
import p858uz.C20061g;
import p906wz.C20430b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20437h;
import p952yy.C20786b;
import p952yy.C20787c;
import p952yy.C20789d;
import p952yy.C20791e;
import p977zz.C20943i;
import p977zz.C20944i0;
import p977zz.C20975x0;
import q00.C19047a;
import t90.C13120a;
import z20.C20806a;

/* renamed from: com.moovit.app.linedetail.ui.a */
public class C15101a extends C15682c<MoovitActivity> implements C17228a.C17229a, C17074b.C17075a, C17231c.C17233b {

    /* renamed from: T */
    public static final /* synthetic */ int f38810T = 0;

    /* renamed from: A */
    public Time f38811A;

    /* renamed from: B */
    public ServerId f38812B;

    /* renamed from: C */
    public ServerId f38813C;

    /* renamed from: D */
    public TextView f38814D;

    /* renamed from: E */
    public C15106e f38815E;

    /* renamed from: F */
    public TransitLine f38816F;

    /* renamed from: G */
    public TransitLineGroup f38817G;

    /* renamed from: H */
    public Map<ServerId, List<TransitPatternTrips>> f38818H;

    /* renamed from: I */
    public C15104c f38819I;

    /* renamed from: J */
    public C13556a f38820J;

    /* renamed from: K */
    public final RecyclerView.C1143r f38821K = new RecyclerView.C1143r();

    /* renamed from: L */
    public final C6302b f38822L = new C6302b();

    /* renamed from: M */
    public C16882b f38823M;

    /* renamed from: N */
    public final C6302b f38824N = new C6302b();

    /* renamed from: O */
    public final C6302b f38825O = new C6302b();

    /* renamed from: P */
    public boolean f38826P;

    /* renamed from: Q */
    public Map<CharSequence, List<TransitStop>> f38827Q;

    /* renamed from: R */
    public int f38828R;

    /* renamed from: S */
    public View f38829S;

    /* renamed from: n */
    public final C15102a f38830n = new C15102a();

    /* renamed from: o */
    public final C15103b f38831o = new C15103b();

    /* renamed from: p */
    public ServerId f38832p;

    /* renamed from: q */
    public AlertMessageView f38833q;

    /* renamed from: r */
    public View f38834r;

    /* renamed from: s */
    public ViewGroup f38835s;

    /* renamed from: t */
    public ViewPager f38836t;

    /* renamed from: u */
    public RealTimeHelpBannerView f38837u;

    /* renamed from: v */
    public View f38838v;

    /* renamed from: w */
    public TextView f38839w;

    /* renamed from: x */
    public List<RecyclerView.C1133l> f38840x = Collections.emptyList();

    /* renamed from: y */
    public C13556a f38841y;

    /* renamed from: z */
    public C15107f f38842z;

    /* renamed from: com.moovit.app.linedetail.ui.a$a */
    public class C15102a extends C7540l {
        public C15102a() {
        }

        /* renamed from: a */
        public final void mo19433a() {
            if (!C15101a.this.isAdded() || C15101a.this.mo46783R1() == null) {
                C16596f.m42113a().mo49364c(new IllegalStateException("Refresh runnable invoked without RequestContext"));
            } else {
                C15101a.this.mo45449D2();
            }
        }
    }

    /* renamed from: com.moovit.app.linedetail.ui.a$b */
    public class C15103b extends RecyclerView.C1133l {
        public C15103b() {
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
            if (C18674j.m45653a(recyclerView, view)) {
                C1832r rVar = new C1832r(0);
                int i = C15101a.f38810T;
                Integer num = (Integer) C15101a.this.mo46779N1(LineDetailActivity.class, rVar);
                if (num != null) {
                    rect.set(0, 0, 0, num.intValue());
                }
            }
        }
    }

    /* renamed from: com.moovit.app.linedetail.ui.a$c */
    public class C15104c extends C16497a {
        public C15104c(TransitLineGroup transitLineGroup, Map map, Map map2, ServerId serverId, ServerId serverId2, ServerId serverId3, Time time, LatLonE6 latLonE6) {
            super(transitLineGroup, map, map2, serverId, serverId2, serverId3, time, latLonE6);
        }

        public final void onCancelled() {
            C15101a.m38470n2(C15101a.this);
        }
    }

    /* renamed from: com.moovit.app.linedetail.ui.a$d */
    public class C15105d extends C20430b<C20789d, C20791e> {
        public C15105d() {
        }

        /* renamed from: b */
        public final void mo21077b(C20431c cVar, ArrayList arrayList, ArrayList arrayList2) {
            C20789d dVar = (C20789d) cVar;
            C15101a.this.f38820J = null;
            if (arrayList2.isEmpty()) {
                C15101a aVar = C15101a.this;
                aVar.getClass();
                CollectionHashMap.ArrayListHashMap arrayListHashMap = new CollectionHashMap.ArrayListHashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C20787c cVar2 = ((C20791e) it.next()).f52474m;
                    if (cVar2 != null) {
                        arrayListHashMap.mo47001a(cVar2.f52456a, cVar2);
                    }
                }
                Iterator it2 = ((C6307g.C6312e) aVar.f38824N.values()).iterator();
                while (true) {
                    C6307g.C6308a aVar2 = (C6307g.C6308a) it2;
                    if (!aVar2.hasNext()) {
                        break;
                    }
                    for (C17231c l : ((C17228a) aVar2.next()).f44530c) {
                        l.mo49675l(arrayListHashMap);
                    }
                }
                Iterator it3 = ((C6307g.C6312e) aVar.f38825O.values()).iterator();
                while (true) {
                    C6307g.C6308a aVar3 = (C6307g.C6308a) it3;
                    if (aVar3.hasNext()) {
                        ((C17074b) aVar3.next()).f44259b.mo49675l(arrayListHashMap);
                    } else {
                        aVar.mo45469w2();
                        aVar.mo45457L2(aVar.mo45463q2());
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.moovit.app.linedetail.ui.a$e */
    public abstract class C15106e implements View.OnClickListener {
        public C15106e() {
        }

        /* renamed from: a */
        public abstract void mo45474a();

        public final void onClick(View view) {
            C15101a aVar = C15101a.this;
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "change_direction_clicked");
            aVar.mo46797j2(aVar2.mo49933a());
            C18321b.f46725c.mo49545d(view.getContext().getSharedPreferences("genies_prefs", 0), Boolean.TRUE);
            mo45474a();
        }
    }

    /* renamed from: com.moovit.app.linedetail.ui.a$f */
    public class C15107f implements C20437h<C17296a, C17297b> {

        /* renamed from: b */
        public final C17296a f38848b;

        /* renamed from: c */
        public final ServerId f38849c;

        /* renamed from: d */
        public final ServerId f38850d;

        /* renamed from: e */
        public final LatLonE6 f38851e;

        /* renamed from: f */
        public final Time f38852f;

        /* renamed from: g */
        public final int f38853g;

        public C15107f(C17296a aVar, int i, ServerId serverId, ServerId serverId2, LatLonE6 latLonE6, Time time) {
            this.f38848b = aVar;
            this.f38849c = serverId;
            this.f38850d = serverId2;
            this.f38851e = latLonE6;
            this.f38852f = time;
            this.f38853g = i;
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17296a aVar = (C17296a) cVar;
            C15101a aVar2 = C15101a.this;
            aVar2.f38841y = null;
            if (aVar2.f38819I == null) {
                aVar2.mo45453H2(this.f38852f, false);
                C15101a aVar3 = C15101a.this;
                aVar3.mo46786U1(C15108g.class, new C7070l(aVar3.f38811A, 7));
            }
        }

        /* renamed from: b */
        public final C13556a mo45476b() {
            C15101a aVar = C15101a.this;
            C17296a aVar2 = this.f38848b;
            return aVar.mo46794g2(aVar2.f44679B, aVar2, this);
        }

        /* renamed from: c */
        public final boolean mo315c(C20431c cVar, ServerException serverException) {
            C17296a aVar = (C17296a) cVar;
            if (!(serverException instanceof UserRequestError)) {
                return true;
            }
            C15101a aVar2 = C15101a.this;
            String c = ((UserRequestError) serverException).mo49161c();
            Drawable b = C17988b.m44611b(R.drawable.img_empty_error, aVar.f51759b);
            int i = C15101a.f38810T;
            aVar2.mo45454I2(c, b);
            return true;
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            C17296a aVar = (C17296a) cVar;
            C15101a aVar2 = C15101a.this;
            int i = C15101a.f38810T;
            aVar2.mo45455J2(R.string.request_send_error_message, R.drawable.img_empty_no_network);
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            C17296a aVar = (C17296a) cVar;
            C15101a aVar2 = C15101a.this;
            int i = C15101a.f38810T;
            aVar2.mo45455J2(R.string.response_read_error_message, R.drawable.img_empty_error);
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            boolean z;
            boolean z2;
            C15106e eVar;
            int i;
            Drawable drawable;
            List<RecyclerView.C1133l> list;
            C17296a aVar = (C17296a) cVar;
            C17297b bVar = (C17297b) gVar;
            C15101a aVar2 = C15101a.this;
            if (aVar2.f38817G == null) {
                z = true;
            } else {
                z = false;
            }
            TransitLineGroup transitLineGroup = bVar.f44685m;
            aVar2.f38817G = transitLineGroup;
            aVar2.f38816F = transitLineGroup.f23700h.get(0);
            if (aVar2.f38817G.f23695c == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            aVar2.f38826P = z2;
            aVar2.f38827Q = bVar.f44687o;
            aVar2.f38818H = bVar.f44686n;
            aVar2.mo46786U1(C15108g.class, new C7105t1(aVar2, z));
            if (z) {
                TransitLineGroup transitLineGroup2 = aVar2.f38817G;
                C16882b bVar2 = new C16882b(aVar2.requireContext(), aVar2.f38817G);
                aVar2.f38823M = bVar2;
                int count = bVar2.getCount();
                if (count == 0 || count == 1) {
                    eVar = null;
                } else if (count != 2) {
                    eVar = new C15109h(aVar2.requireContext());
                } else {
                    eVar = new C15110i();
                }
                aVar2.f38815E = eVar;
                aVar2.f38814D = (TextView) aVar2.mo46799l2(R.id.line_direction);
                TextView textView = (TextView) aVar2.mo46799l2(R.id.line_direction_desc);
                textView.setTag(textView.getBackground());
                if (aVar2.f38815E != null) {
                    i = 0;
                } else {
                    i = 8;
                }
                textView.setVisibility(i);
                if (transitLineGroup2.f23700h.size() > 2) {
                    drawable = (Drawable) textView.getTag();
                } else {
                    drawable = null;
                }
                C20943i.m49053f(textView, drawable);
                if (!C18454l.m45315k()) {
                    C18316a.f46708c.mo50767a(Genie.LINE_VIEW_DIRECTIONS, textView, aVar2.f40822c);
                }
                aVar2.f38834r.setOnClickListener(aVar2.f38815E);
                Context requireContext = aVar2.requireContext();
                boolean z3 = ((C17637d) requireContext.getSystemService("ui_configuration")).f45347d;
                C18670g e = C18670g.m45652e(UiUtils.m40249h(requireContext.getResources(), 12.0f));
                C18669f e2 = C18669f.m45651e(UiUtils.m40249h(requireContext.getResources(), 24.0f));
                C18675k kVar = new C18675k(requireContext, R.drawable.shadow_scroll);
                if (z3) {
                    list = Arrays.asList(new RecyclerView.C1133l[]{e, e2, kVar, aVar2.f38831o});
                } else {
                    list = Arrays.asList(new RecyclerView.C1133l[]{e, e2, kVar});
                }
                aVar2.f38840x = list;
            }
            Map<ServerId, List<TransitPatternTrips>> map = aVar2.f38818H;
            C15107f fVar = aVar2.f38842z;
            Time time = fVar.f38852f;
            ServerId serverId = fVar.f38849c;
            aVar2.mo45461o2(map, time, serverId, fVar.f38850d, (ServerId) aVar2.f38822L.getOrDefault(serverId, null), aVar2.f38842z.f38851e);
            C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.VIEW_TYPE_SHOWN);
            aVar3.mo49939g(AnalyticsAttributeKey.TYPE, C0016g.m14D(C7843b.m17878e(aVar2.f38816F)));
            aVar2.mo46797j2(aVar3.mo49933a());
            C20806a.C20807a aVar4 = new C20806a.C20807a("line_details_view");
            aVar4.mo52934b(aVar2.f38817G.f23697e, "line_number");
            aVar4.f52526d = 30;
            MarketingEventImpressionBinder.m41586a(aVar2, aVar4.mo52933a());
        }
    }

    /* renamed from: com.moovit.app.linedetail.ui.a$g */
    public interface C15108g {
        /* renamed from: B0 */
        void mo45407B0();

        /* renamed from: G0 */
        void mo45412G0();

        /* renamed from: H */
        void mo45414H();

        /* renamed from: I0 */
        void mo45416I0(boolean z, boolean z2, TransitLine transitLine, BoxE6 boxE6, List list, List list2, TransitStop transitStop, Integer num, ServerId serverId);

        /* renamed from: c1 */
        void mo45419c1(List<Time> list);

        /* renamed from: i */
        void mo45420i(boolean z, List<TransitPatternTrips> list, TransitStop transitStop, int i, List<TransitStop> list2, TransitStop transitStop2, int i2);

        /* renamed from: k0 */
        void mo45421k0(Time time);

        /* renamed from: l1 */
        void mo45422l1(TransitLine transitLine);

        /* renamed from: w0 */
        void mo45425w0(TransitLineGroup transitLineGroup, boolean z, boolean z2);
    }

    /* renamed from: com.moovit.app.linedetail.ui.a$h */
    public class C15109h extends C15106e {

        /* renamed from: c */
        public final ListPopupWindow f38855c;

        public C15109h(Context context) {
            super();
            ListPopupWindow listPopupWindow = new ListPopupWindow(context);
            this.f38855c = listPopupWindow;
            listPopupWindow.setModal(true);
            listPopupWindow.setAnchorView(C15101a.this.f38834r);
            listPopupWindow.setAdapter(C15101a.this.f38823M);
            listPopupWindow.setOnItemClickListener(new C16712i(this));
        }

        /* renamed from: a */
        public final void mo45474a() {
            this.f38855c.show();
        }
    }

    /* renamed from: com.moovit.app.linedetail.ui.a$i */
    public class C15110i extends C15106e {
        public C15110i() {
            super();
        }

        /* renamed from: a */
        public final void mo45474a() {
            int i;
            C15101a aVar = C15101a.this;
            C16882b bVar = aVar.f38823M;
            if (bVar != null) {
                if (bVar.f43906j == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                C15101a.m38469m2(aVar, i);
            }
        }
    }

    public C15101a() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public static void m38469m2(C15101a aVar, int i) {
        C18321b.f46725c.mo49545d(aVar.requireContext().getSharedPreferences("genies_prefs", 0), Boolean.TRUE);
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "change_direction_clicked");
        aVar.mo46797j2(aVar2.mo49933a());
        CharSequence charSequence = (CharSequence) aVar.f38823M.getItem(i);
        ArrayList c = C13720d.m34273c((List) aVar.f38823M.f43905i.get(i), (C13722f) null, ServerId.f15138c);
        if (aVar.f38826P) {
            aVar.mo45471y2(charSequence, c);
        } else {
            aVar.mo45445A2((ServerId) c.get(0));
        }
    }

    /* renamed from: n2 */
    public static void m38470n2(C15101a aVar) {
        aVar.f38819I = null;
        aVar.mo46786U1(C15108g.class, new C7070l(aVar.f38811A, 7));
        if (aVar.isResumed()) {
            aVar.f40822c.mo44551z1().mo40025c(TraceEvent.LINE_DETAIL_ACTIVITY_LOADED);
        }
    }

    /* renamed from: A2 */
    public final void mo45445A2(ServerId serverId) {
        int i;
        this.f38826P = false;
        this.f38812B = serverId;
        C17228a aVar = (C17228a) this.f38824N.getOrDefault(serverId, null);
        TransitLine transitLine = aVar.f44529b;
        this.f38816F = transitLine;
        mo45456K2("directions_and_options", !aVar.f44530c.isEmpty());
        C16882b bVar = this.f38823M;
        int size = bVar.f43905i.size();
        while (true) {
            i = -1;
            size--;
            if (size >= 0) {
                if (((List) bVar.f43905i.get(size)).contains(transitLine)) {
                    bVar.f43906j = size;
                    break;
                }
            } else {
                break;
            }
        }
        C16882b bVar2 = this.f38823M;
        CharSequence charSequence = (CharSequence) bVar2.get(bVar2.f43906j);
        this.f38814D.setText(charSequence);
        C13382a.m33674j(this.f38814D, getString(R.string.voice_over_lineview_direction, charSequence), getString(R.string.voice_over_change_directions_hint));
        mo46799l2(R.id.pager_container).setVisibility(0);
        ViewPager viewPager = (ViewPager) mo46799l2(R.id.pager);
        CharacterPagerStrip characterPagerStrip = (CharacterPagerStrip) mo46799l2(R.id.pager_strip);
        viewPager.setAdapter(new C18492b((PagerAdapter) aVar, getContext()));
        Integer num = aVar.f44531d.get((ServerId) this.f38822L.getOrDefault(transitLine.f23687c, null));
        if (num != null) {
            i = num.intValue();
        }
        viewPager.setCurrentLogicalItem(i);
        mo45452G2(aVar.mo49793c(i));
        if (aVar.getCount() > 1) {
            C13382a.m33674j(characterPagerStrip, getString(R.string.voice_over_lineview_route_letter, characterPagerStrip.mo47317a(i)));
            this.f38838v.setVisibility(0);
        } else {
            this.f38838v.setVisibility(8);
        }
        mo45468v2(this.f38834r, mo45463q2(), transitLine, !aVar.f44530c.isEmpty(), this.f38826P);
    }

    /* renamed from: B0 */
    public final void mo45446B0() {
        mo46786U1(C15108g.class, new C2341k(7));
        if (this.f40822c.mo44539t1("time_picker_dialog_fragment_tag") == null) {
            C12699d.C12701b bVar = new C12699d.C12701b(getContext());
            bVar.mo39494d("time_picker_dialog_fragment_tag");
            bVar.mo39488j();
            bVar.mo39483e(0);
            bVar.mo39486h(getContext());
            bVar.mo39485g();
            if (mo45460e()) {
                bVar.mo39487i(this.f38811A.mo24631g());
            }
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "change_time_clicked");
            mo46797j2(aVar.mo49933a());
            C12699d k = bVar.mo39489k();
            k.setTargetFragment(this, 0);
            k.show(getFragmentManager(), "time_picker_dialog_fragment_tag");
        }
    }

    /* renamed from: B2 */
    public final void mo45447B2(C12797f fVar, boolean z) {
        C17231c p2;
        int adapterPosition = fVar.getAdapterPosition();
        if (adapterPosition != -1 && (p2 = mo45462p2()) != null) {
            TransitLine transitLine = p2.f44539i;
            TransitStop transitStop = p2.f44545o.get(adapterPosition);
            startActivity(StopDetailActivity.m39207B2(getContext(), transitStop.f23730b, transitLine.f23687c, (TransitStop) null, (List) null));
            if (z) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.STOP_DETAILS_CLICKED);
                aVar.mo49937e(AnalyticsAttributeKey.STOP_ID, transitStop.f23730b);
                aVar.mo49935c(AnalyticsAttributeKey.STOP_INDEX, adapterPosition);
                mo46797j2(aVar.mo49933a());
                return;
            }
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "go_to_station_clicked_card");
            aVar2.mo49937e(AnalyticsAttributeKey.STOP_ID, transitStop.f23730b);
            aVar2.mo49935c(AnalyticsAttributeKey.STOP_INDEX, adapterPosition);
            mo46797j2(aVar2.mo49933a());
        }
    }

    /* renamed from: C2 */
    public final void mo45448C2(Map<ServerId, ServerId> map) {
        this.f38824N.clear();
        this.f38825O.clear();
        this.f38822L.clear();
        this.f38822L.putAll(map);
    }

    /* renamed from: D2 */
    public final void mo45449D2() {
        C17231c p2;
        List<TransitLine> list;
        this.f38830n.mo23803d();
        C13556a aVar = this.f38820J;
        if (aVar != null) {
            aVar.cancel(true);
            this.f38820J = null;
        }
        Context context = getContext();
        if (context != null && (p2 = mo45462p2()) != null) {
            if (p2 instanceof C17073a) {
                list = ((C17073a) p2).f44257y;
            } else {
                list = Collections.singletonList(p2.f44539i);
            }
            TransitStop transitStop = p2.f44551u;
            if (transitStop != null) {
                HashSet hashSet = C19728f.f50164e;
                C19728f fVar = (C19728f) context.getSystemService("metro_context");
                C19047a.C19048a aVar2 = C19047a.f48441d;
                C19047a aVar3 = (C19047a) context.getSystemService("user_configuration");
                C13752e R1 = mo46783R1();
                C21100e.m49373x(R1, "requestContext");
                C21100e.m49373x(fVar, "metroContext");
                C21100e.m49373x(aVar3, "configuration");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                C20786b bVar = new C20786b();
                bVar.f52448b = -1;
                ServerId serverId = transitStop.f23730b;
                ServerId c = p2.f44540j.f23717b.mo24385c(p2.f44552v + 1);
                for (TransitLine next : list) {
                    if (C7843b.m17878e(next) == TransitType.ViewType.DEFAULT) {
                        ServerId serverId2 = next.f23687c;
                        arrayList.add(serverId2);
                        arrayList2.add(serverId);
                        if (c != null) {
                            arrayList.add(serverId2);
                            arrayList2.add(c);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    C20789d dVar = new C20789d(R1, fVar, aVar3, arrayList, arrayList2, bVar);
                    String str = dVar.f52463B;
                    RequestOptions L1 = mo46777L1();
                    L1.f42909f = true;
                    this.f38820J = mo46793f2(str, dVar, L1, new C15105d());
                    if (C13382a.m33671g(getContext())) {
                        this.f38830n.mo23802c();
                    }
                }
            }
        }
    }

    /* renamed from: E2 */
    public final void mo45450E2() {
        TransitStop transitStop;
        int i;
        float f;
        TransitLine transitLine = this.f38816F;
        if (mo45466t2()) {
            transitStop = null;
        } else {
            transitStop = mo45462p2().f44551u;
        }
        if (transitLine != null && transitStop != null) {
            if (mo45466t2()) {
                i = 0;
            } else {
                i = mo45462p2().f44552v;
            }
            Location O1 = mo46780O1();
            if (O1 != null) {
                f = O1.distanceTo(transitStop.f23732d.mo46929u((Location) null));
            } else {
                f = -1.0f;
            }
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.STOP_LOADED);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, C0016g.m14D(C7843b.m17878e(transitLine)));
            aVar.mo49937e(AnalyticsAttributeKey.LINE_ID, transitLine.f23687c);
            aVar.mo49939g(AnalyticsAttributeKey.TRANSIT_TYPE, C0016g.m15E(C7843b.m17877d(C7843b.m17876c(transitLine))));
            aVar.mo49937e(AnalyticsAttributeKey.STOP_ID, transitStop.f23730b);
            aVar.mo49935c(AnalyticsAttributeKey.STOP_INDEX, i);
            aVar.mo49934b(AnalyticsAttributeKey.DISTANCE, f);
            mo46797j2(aVar.mo49933a());
        }
    }

    /* renamed from: F2 */
    public final void mo45451F2(ServerId serverId, ServerId serverId2, Time time) {
        C13556a aVar = this.f38841y;
        if (aVar != null) {
            aVar.cancel(true);
            this.f38841y = null;
        }
        C19728f a = C19728f.m47195a(getContext());
        C19047a a2 = C19047a.m46164a(getContext());
        boolean z = ((C17637d) getContext().getSystemService("ui_configuration")).f45347d;
        C15107f fVar = new C15107f(new C17296a(mo46783R1(), a, a2, this.f38832p, time, z), 0, serverId, serverId2, LatLonE6.m40177j(mo46781P1().mo50014i()), time);
        this.f38842z = fVar;
        this.f38841y = fVar.mo45476b();
    }

    /* renamed from: G2 */
    public final void mo45452G2(C17231c cVar) {
        Time time;
        Time time2;
        if (cVar == null) {
            this.f38839w.setTag(R.id.view_tag_param1, (Object) null);
            this.f38839w.setTag(R.id.view_tag_param2, (Object) null);
            this.f38839w.setTag(R.id.view_tag_param3, (Object) null);
        } else {
            TransitPatternTrips transitPatternTrips = cVar.f44540j;
            Time time3 = this.f38811A;
            if (!transitPatternTrips.f23719d.isEmpty()) {
                if (time3 == null) {
                    time3 = new Time(System.currentTimeMillis());
                }
                int i = 0;
                while (true) {
                    if (i >= transitPatternTrips.f23719d.size()) {
                        break;
                    }
                    List<Time> list = transitPatternTrips.f23719d.get(i).f23660b;
                    if (!list.isEmpty()) {
                        time = list.get(0);
                        if (C7925b.m18027o(time3.mo24631g(), time.mo24631g())) {
                            break;
                        }
                    }
                    i++;
                }
            }
            time = null;
            Time time4 = this.f38811A;
            if (!transitPatternTrips.f23719d.isEmpty()) {
                if (time4 == null) {
                    time4 = new Time(System.currentTimeMillis());
                }
                int size = transitPatternTrips.f23719d.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    List<Time> list2 = transitPatternTrips.f23719d.get(size).f23660b;
                    if (!list2.isEmpty()) {
                        time2 = list2.get(0);
                        if (C7925b.m18027o(time4.mo24631g(), time2.mo24631g())) {
                            break;
                        }
                    }
                }
                if (time != null || time2 == null || time.compareTo(time2) >= 0) {
                    this.f38839w.setTag(R.id.view_tag_param1, (Object) null);
                    this.f38839w.setTag(R.id.view_tag_param2, (Object) null);
                    this.f38839w.setTag(R.id.view_tag_param3, (Object) null);
                } else {
                    this.f38839w.setTag(R.id.view_tag_param1, cVar);
                    this.f38839w.setTag(R.id.view_tag_param2, time);
                    this.f38839w.setTag(R.id.view_tag_param3, time2);
                    TextView textView = this.f38839w;
                    textView.setText(textView.getResources().getString(R.string.line_detail_operation_hours, new Object[]{C7925b.m18025m(getContext(), time.mo24631g(), time2.mo24631g())}));
                }
            }
            time2 = null;
            if (time != null) {
            }
            this.f38839w.setTag(R.id.view_tag_param1, (Object) null);
            this.f38839w.setTag(R.id.view_tag_param2, (Object) null);
            this.f38839w.setTag(R.id.view_tag_param3, (Object) null);
        }
        mo45457L2(cVar);
    }

    /* renamed from: H2 */
    public final void mo45453H2(Time time, boolean z) {
        C17231c p2;
        this.f38811A = time;
        mo46786U1(C15108g.class, new C7070l(time, 7));
        if (z && (p2 = mo45462p2()) != null) {
            p2.notifyDataSetChanged();
        }
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(getContext()).getPermissionAwareMedAccuracyInfrequentUpdates();
    }

    /* renamed from: I2 */
    public final void mo45454I2(CharSequence charSequence, Drawable drawable) {
        ViewGroup viewGroup = (ViewGroup) mo46799l2(R.id.root);
        View findViewById = viewGroup.findViewById(R.id.loading_view);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        this.f38835s.setVisibility(4);
        this.f38833q.setVisibility(0);
        this.f38833q.setSubtitle(charSequence);
        this.f38833q.setImage(drawable);
        this.f38833q.setPositiveButton((CharSequence) null);
        mo46786U1(C15108g.class, new C4452q0(9));
    }

    /* renamed from: J2 */
    public final void mo45455J2(int i, int i2) {
        Drawable drawable = null;
        CharSequence text = i == 0 ? null : getText(i);
        if (i2 != 0) {
            drawable = C17988b.m44611b(i2, getContext());
        }
        mo45454I2(text, drawable);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("UI_CONFIGURATION");
    }

    /* renamed from: K2 */
    public final void mo45456K2(String str, boolean z) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.VIEW_TYPE_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, str);
        aVar.mo49941i(AnalyticsAttributeKey.EMPTY_STATE_SHOWN, !z);
        mo46797j2(aVar.mo49933a());
    }

    /* renamed from: L2 */
    public final void mo45457L2(C17231c cVar) {
        Schedule schedule;
        TransitStop transitStop;
        Schedule schedule2;
        C17231c cVar2 = (C17231c) this.f38839w.getTag(R.id.view_tag_param1);
        Time time = (Time) this.f38839w.getTag(R.id.view_tag_param2);
        Time time2 = (Time) this.f38839w.getTag(R.id.view_tag_param3);
        if (cVar2 == null || cVar2 != cVar || time == null || time2 == null) {
            this.f38839w.setVisibility(8);
            return;
        }
        int i = cVar.f44552v;
        Time time3 = null;
        if (cVar.getItemViewType(i) == 2 && (transitStop = cVar.f44551u) != null) {
            ServerId serverId = transitStop.f23730b;
            schedule = cVar.mo49674k(i, serverId);
            if (cVar.f44549s.mo45460e()) {
                schedule2 = null;
            } else {
                schedule2 = cVar.mo49673j(i, serverId);
            }
            if (schedule2 != null) {
                schedule = schedule2;
            }
        } else {
            schedule = null;
        }
        if (schedule != null) {
            time3 = schedule.mo24326m();
        }
        if (time3 == null || time3.f23908i == null) {
            this.f38839w.setVisibility(8);
        } else {
            this.f38839w.setVisibility(0);
        }
    }

    /* renamed from: Z0 */
    public final Time mo45458Z0() {
        return this.f38811A;
    }

    /* renamed from: Z1 */
    public final void mo40440Z1(int i, String str) {
        Time time;
        long j;
        long j2;
        boolean z;
        TransitStop transitStop;
        if ("time_picker_dialog_fragment_tag".equals(str) && i == -1) {
            C12699d dVar = (C12699d) this.f40822c.mo44539t1(str);
            if (dVar.f31361z) {
                time = null;
            } else {
                time = new Time(dVar.mo39477W1());
            }
            if (!C20975x0.m49118e(this.f38811A, time)) {
                Time time2 = this.f38811A;
                if (time2 == null) {
                    j = System.currentTimeMillis();
                } else {
                    j = time2.mo24631g();
                }
                if (time == null) {
                    j2 = System.currentTimeMillis();
                } else {
                    j2 = time.mo24631g();
                }
                boolean o = C7925b.m18027o(j, j2);
                ServerId serverId = this.f38812B;
                ServerId serverId2 = this.f38813C;
                C17231c p2 = mo45462p2();
                if (!(p2 == null || (transitStop = p2.f44551u) == null)) {
                    serverId2 = transitStop.f23730b;
                }
                ServerId serverId3 = serverId2;
                if (o) {
                    if (this.f38842z.f38853g != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        Map<ServerId, List<TransitPatternTrips>> map = this.f38818H;
                        if (map != null) {
                            mo45461o2(map, time, serverId, serverId3, (ServerId) this.f38822L.getOrDefault(serverId, null), LatLonE6.m40177j(mo46781P1().mo50014i()));
                        }
                        mo45453H2(time, true);
                        return;
                    }
                }
                mo45451F2(serverId, serverId3, time);
            }
        }
    }

    /* renamed from: a2 */
    public final void mo45459a2() {
        C15104c cVar = this.f38819I;
        if (cVar != null) {
            cVar.cancel(true);
            this.f38819I = null;
        }
    }

    /* renamed from: e */
    public final boolean mo45460e() {
        return this.f38811A != null;
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: o2 */
    public final void mo45461o2(Map<ServerId, List<TransitPatternTrips>> map, Time time, ServerId serverId, ServerId serverId2, ServerId serverId3, LatLonE6 latLonE6) {
        C15104c cVar = this.f38819I;
        if (cVar != null) {
            cVar.cancel(true);
        }
        C15104c cVar2 = new C15104c(this.f38817G, map, this.f38827Q, serverId, serverId3, serverId2, time, latLonE6);
        this.f38819I = cVar2;
        cVar2.execute(new Void[0]);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        A a = this.f40822c;
        if (a instanceof C15108g) {
            ((C15108g) a).mo45421k0(this.f38811A);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.f38832p = (ServerId) requireArguments.getParcelable("lineGroupId");
        this.f38812B = (ServerId) requireArguments.getParcelable("lineId");
        this.f38813C = (ServerId) requireArguments.getParcelable("stopId");
        this.f38811A = (Time) requireArguments.getParcelable("time");
        ((C13120a) this.f40822c.mo44551z1()).mo40028g(TraceEvent.LINE_DETAIL_ACTIVITY_LOADED, new C20944i0("line_group_id", this.f38832p.mo19751c()));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2 = 0;
        View inflate = layoutInflater.inflate(R.layout.line_detail_content_fragment, viewGroup, false);
        this.f38834r = inflate.findViewById(R.id.page_handle);
        this.f38838v = inflate.findViewById(R.id.pager_strip_container);
        this.f38839w = (TextView) inflate.findViewById(R.id.operation_hours);
        this.f38835s = (ViewGroup) inflate.findViewById(R.id.lines_stops_container);
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.pager);
        this.f38836t = viewPager;
        viewPager.addOnAdapterChangeListener(new C16706c(this));
        this.f38836t.addOnPageChangeListener(new C16710g(this, (CharacterPagerStrip) inflate.findViewById(R.id.pager_strip)));
        AlertMessageView alertMessageView = (AlertMessageView) inflate.findViewById(R.id.error_message);
        this.f38833q = alertMessageView;
        alertMessageView.setPositiveButtonClickListener(new C1800c(this, 11));
        if (getActivity() != null) {
            if (C18321b.f46727e.mo19759a(requireContext().getSharedPreferences("genies_prefs", 0)).intValue() > 1) {
                RealTimeHelpBannerView realTimeHelpBannerView = (RealTimeHelpBannerView) inflate.findViewById(R.id.banner);
                this.f38837u = realTimeHelpBannerView;
                if (RealTimeHelpBannerView.m38838d(inflate.getContext())) {
                    i = 0;
                } else {
                    i = 8;
                }
                realTimeHelpBannerView.setVisibility(i);
                this.f38837u.setOnDismissClickListener(new C4583a(this, 15));
                this.f38837u.setOnLinkClickListener(new C6996c(this, 18));
            }
        }
        View findViewById = inflate.findViewById(R.id.handle);
        if (!((C17637d) inflate.getContext().getSystemService("ui_configuration")).f45347d) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        return inflate;
    }

    public final void onPause() {
        super.onPause();
        this.f38830n.mo23803d();
        C13556a aVar = this.f38820J;
        if (aVar != null) {
            aVar.cancel(true);
            this.f38820J = null;
        }
    }

    public final void onStart() {
        super.onStart();
        mo45451F2(this.f38812B, this.f38813C, this.f38811A);
    }

    public final void onStop() {
        super.onStop();
        C13556a aVar = this.f38841y;
        if (aVar != null) {
            aVar.cancel(true);
            this.f38841y = null;
        }
        C15104c cVar = this.f38819I;
        if (cVar != null) {
            cVar.cancel(true);
            this.f38819I = null;
        }
    }

    /* renamed from: p2 */
    public final C17231c mo45462p2() {
        if (this.f38826P) {
            return mo45464r2();
        }
        return mo45463q2();
    }

    /* renamed from: q2 */
    public final C17231c mo45463q2() {
        PagerAdapter s2 = mo45465s2();
        if (s2 != null && (s2 instanceof C17228a)) {
            return ((C17228a) s2).mo49793c(this.f38836t.getCurrentLogicalItem());
        }
        return null;
    }

    /* renamed from: r2 */
    public final C17073a mo45464r2() {
        PagerAdapter s2 = mo45465s2();
        if (s2 != null && (s2 instanceof C17074b)) {
            return ((C17074b) s2).f44259b;
        }
        return null;
    }

    /* renamed from: s2 */
    public final PagerAdapter mo45465s2() {
        C18492b bVar = (C18492b) this.f38836t.getAdapter();
        if (bVar == null) {
            return null;
        }
        return bVar.f47097a;
    }

    /* renamed from: t2 */
    public final boolean mo45466t2() {
        return mo45463q2() == null && mo45464r2() == null;
    }

    /* renamed from: u2 */
    public final boolean mo45467u2() {
        if (mo45466t2()) {
            return false;
        }
        if (this.f38826P) {
            return !mo45464r2().f44258z.isEmpty();
        }
        return !((C17228a) mo45465s2()).f44530c.isEmpty();
    }

    /* renamed from: v2 */
    public final void mo45468v2(View view, C17231c cVar, TransitLine transitLine, boolean z, boolean z2) {
        boolean z3;
        Schedule schedule;
        Class<C15108g> cls = C15108g.class;
        mo46786U1(cls, new C16708e(view, cVar, transitLine, z, z2));
        if (z) {
            if (this.f38842z.f38853g != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                TransitPatternTrips transitPatternTrips = cVar.f44540j;
                Time time = null;
                if (transitPatternTrips != null) {
                    schedule = transitPatternTrips.f23725j.get(0);
                } else {
                    schedule = null;
                }
                if (schedule != null) {
                    time = schedule.mo24326m();
                }
                mo46786U1(cls, new C7070l(time, 7));
            }
        }
    }

    /* renamed from: w2 */
    public final void mo45469w2() {
        Integer num;
        if (!this.f38826P) {
            C17231c p2 = mo45462p2();
            List list = null;
            if (p2 == null || p2.f44551u == null) {
                num = null;
            } else {
                num = Integer.valueOf(p2.f44552v);
            }
            if (num != null) {
                list = p2.f44543m.get(num.intValue());
            }
            mo46786U1(C15108g.class, new C7038d0(list, 6));
        }
    }

    /* renamed from: x2 */
    public final void mo45470x2(Time time) {
        ViewGroup viewGroup = (ViewGroup) mo46799l2(R.id.root);
        View findViewById = viewGroup.findViewById(R.id.loading_view);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        this.f38835s.setVisibility(0);
        this.f38833q.setVisibility(4);
        mo46786U1(C15108g.class, new C4452q0(10));
        mo45453H2(time, false);
    }

    /* renamed from: y2 */
    public final void mo45471y2(CharSequence charSequence, ArrayList arrayList) {
        TransitLine transitLine;
        TransitLine transitLine2;
        this.f38826P = true;
        this.f38812B = (ServerId) arrayList.get(0);
        C17074b bVar = (C17074b) this.f38825O.getOrDefault(charSequence, null);
        C17073a aVar = bVar.f44259b;
        ServerId serverId = this.f38812B;
        Iterator<TransitLine> it = aVar.f44257y.iterator();
        while (true) {
            if (!it.hasNext()) {
                transitLine = null;
                break;
            }
            transitLine = it.next();
            if (transitLine.f23687c.equals(serverId)) {
                break;
            }
        }
        if (transitLine == null) {
            transitLine2 = aVar.f44257y.get(0);
        } else {
            transitLine2 = transitLine;
        }
        this.f38816F = transitLine2;
        mo45456K2("directions_only", !aVar.f44258z.isEmpty());
        C16882b bVar2 = this.f38823M;
        int count = bVar2.getCount();
        while (true) {
            count--;
            if (count >= 0) {
                if (((CharSequence) bVar2.get(count)).equals(charSequence)) {
                    bVar2.f43906j = count;
                    break;
                }
            } else {
                break;
            }
        }
        C16882b bVar3 = this.f38823M;
        CharSequence charSequence2 = (CharSequence) bVar3.get(bVar3.f43906j);
        this.f38814D.setText(charSequence2);
        C13382a.m33674j(this.f38814D, getString(R.string.voice_over_lineview_direction, charSequence2), getString(R.string.voice_over_change_directions_hint));
        mo46799l2(R.id.pager_container).setVisibility(0);
        this.f38838v.setVisibility(8);
        ((ViewPager) mo46799l2(R.id.pager)).setAdapter(new C18492b((PagerAdapter) bVar, getContext()));
        mo45468v2(this.f38834r, aVar, transitLine2, !aVar.f44258z.isEmpty(), this.f38826P);
        if (!aVar.f44258z.isEmpty()) {
            mo45449D2();
            return;
        }
        this.f38830n.mo23803d();
        C13556a aVar2 = this.f38820J;
        if (aVar2 != null) {
            aVar2.cancel(true);
            this.f38820J = null;
        }
    }

    /* renamed from: z2 */
    public final void mo45472z2() {
        this.f38828R = this.f38836t.getCurrentLogicalItem();
        View view = this.f38829S;
        if (view != null) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6342i.m15103t(view, false);
        }
        ViewPager viewPager = this.f38836t;
        StringBuilder k = C13555b.m33972k("item#");
        k.append(this.f38836t.getCurrentLogicalItem());
        View findViewWithTag = viewPager.findViewWithTag(k.toString());
        this.f38829S = findViewWithTag;
        WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
        C6333d0.C6342i.m15103t(findViewWithTag, true);
        TextView textView = (TextView) mo46799l2(R.id.pattern_header);
        PagerAdapter s2 = mo45465s2();
        if (s2 != null && !(s2 instanceof C17074b)) {
            boolean u2 = mo45467u2();
            C17231c p2 = mo45462p2();
            if (!u2) {
                textView.setText((CharSequence) null);
                mo45452G2((C17231c) null);
            } else {
                this.f38822L.put(p2.f44539i.f23687c, p2.f44540j.f23717b.f23708b);
                mo46786U1(C15108g.class, new C7070l(this.f38811A, 7));
                int i = p2.f44554x;
                textView.setText(getResources().getQuantityString(R.plurals.stops, i, new Object[]{Integer.valueOf(i)}));
                mo45452G2(p2);
                mo45449D2();
            }
            mo45469w2();
            mo45468v2(this.f38834r, p2, this.f38816F, u2, this.f38826P);
        }
    }
}
