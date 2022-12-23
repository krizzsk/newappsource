package com.moovit.app.home.lines.favorites;

import a00.C13382a;
import aa0.C7530f;
import aa0.C7540l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b00.C13556a;
import b00.C13557b;
import c00.C13717b;
import c00.C13723g;
import c20.C13744a;
import c70.C13752e;
import ce0.C21100e;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.design.view.AlertMessageView;
import com.moovit.design.view.ImagesOrTextsView;
import com.moovit.design.view.list.ImageOrTextSubtitleListItemView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.location.C16202a;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.transit.C7843b;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitType;
import com.moovit.util.time.StopRealTimeInformation;
import com.moovit.view.ScheduleView;
import com.tranzmate.R;
import g20.C17161i;
import g30.C4776h;
import i30.C5265a;
import i30.C5267c;
import i30.C5268d;
import i30.C5269e;
import i30.C5271f;
import i30.C5272g;
import ja0.C12793c;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k80.C12817k;
import k80.C12818l;
import o00.C18671h;
import o00.C18676l;
import o00.C18681n;
import p011aa.C0141e;
import p054d0.C4267a0;
import p073e7.C4583a;
import p130j2.C5367a;
import p241s0.C6302b;
import p241s0.C6304d;
import p259t5.C6592b;
import p259t5.C6593c;
import p372at.C13514a;
import p435de.C16596f;
import p455dy.C16753e;
import p543hq.C17474b;
import p567iq.C17635b;
import p583jk.C17884p;
import p640lt.C18275a;
import p824tp.C19728f;
import p858uz.C20061g;
import p872vp.C20195b;
import p898wr.C20400b;
import p899ws.C20406f;
import p906wz.C20430b;
import p906wz.C20431c;
import p906wz.C20436g;
import p952yy.C20787c;
import p952yy.C20789d;
import p952yy.C20791e;
import p977zz.C20941h;
import p977zz.C20944i0;
import p977zz.C20964s0;
import p977zz.C20975x0;
import q00.C19047a;
import u00.C19826h;
import x00.C20440a;

public class FavoriteLinesFragment extends C15682c<MoovitActivity> implements C16753e.C16755b, C16753e.C16757d {

    /* renamed from: E */
    public static final /* synthetic */ int f38373E = 0;

    /* renamed from: A */
    public C13556a f38374A = null;

    /* renamed from: B */
    public SwipeRefreshLayout f38375B;

    /* renamed from: C */
    public RecyclerView f38376C;

    /* renamed from: D */
    public C17474b f38377D;

    /* renamed from: n */
    public final C14996a f38378n = new C14996a();

    /* renamed from: o */
    public final C14997b f38379o = new C14997b();

    /* renamed from: p */
    public final C14998c f38380p = new C14998c(R.layout.favorites_lines_fragment_empty);

    /* renamed from: q */
    public final ScheduleView.C7927a f38381q = new ScheduleView.C7927a();

    /* renamed from: r */
    public final C15006k f38382r = new C15006k();

    /* renamed from: s */
    public C16753e f38383s;

    /* renamed from: t */
    public C19728f f38384t;

    /* renamed from: u */
    public C19047a f38385u;

    /* renamed from: v */
    public C17161i<C16181a.C16184c, TransitLine> f38386v;

    /* renamed from: w */
    public C19826h f38387w;

    /* renamed from: x */
    public C13556a f38388x = null;

    /* renamed from: y */
    public C13556a f38389y = null;

    /* renamed from: z */
    public C13556a f38390z = null;

    public enum ShowMeHowType {
        FAVORITE_LINE(R.raw.mov_favorite_line, R.string.favorite_line_empty_state_popup_message, R.string.favorite_line_empty_state_popup_title, "add_line_guide_clicked"),
        FAVORITE_LINE_STOP(R.raw.mov_favorite_line_add_station, R.string.favorite_line_station_popup_message, R.string.favorite_line_station_popup_title, "add_line_stops_guide_clicked");
        
        public String analyticsConstant;
        public int messageId;
        public int titleId;
        public int videoId;

        private ShowMeHowType(int i, int i2, int i3, String str) {
            this.videoId = i;
            this.messageId = i2;
            this.titleId = i3;
            C21100e.m49373x(str, "analyticsConstant");
            this.analyticsConstant = str;
        }
    }

    /* renamed from: com.moovit.app.home.lines.favorites.FavoriteLinesFragment$a */
    public class C14996a extends BroadcastReceiver {
        public C14996a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (FavoriteLinesFragment.this.mo46775H1() && FavoriteLinesFragment.this.getView() != null) {
                FavoriteLinesFragment.this.mo45206n2();
            }
        }
    }

    /* renamed from: com.moovit.app.home.lines.favorites.FavoriteLinesFragment$b */
    public class C14997b extends C7540l {
        public C14997b() {
        }

        /* renamed from: a */
        public final void mo19433a() {
            FavoriteLinesFragment favoriteLinesFragment = FavoriteLinesFragment.this;
            if (favoriteLinesFragment.f40822c != null && favoriteLinesFragment.f38388x == null) {
                favoriteLinesFragment.mo45207o2();
            }
        }

        /* renamed from: b */
        public final void mo21414b() {
            FavoriteLinesFragment favoriteLinesFragment = FavoriteLinesFragment.this;
            int i = FavoriteLinesFragment.f38373E;
            C13556a aVar = favoriteLinesFragment.f38390z;
            if (aVar != null) {
                aVar.cancel(true);
                favoriteLinesFragment.f38390z = null;
            }
        }
    }

    /* renamed from: com.moovit.app.home.lines.favorites.FavoriteLinesFragment$c */
    public class C14998c extends C18671h {
        public C14998c(int... iArr) {
            super(iArr);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            ((AlertMessageView) onCreateViewHolder.itemView).setPositiveButtonClickListener(new C6592b(this, 13));
            return onCreateViewHolder;
        }
    }

    /* renamed from: com.moovit.app.home.lines.favorites.FavoriteLinesFragment$d */
    public class C14999d extends C5272g<C5267c, C5271f> {

        /* renamed from: d */
        public final /* synthetic */ List f38394d;

        /* renamed from: e */
        public final /* synthetic */ List f38395e;

        public C14999d(ArrayList arrayList, ArrayList arrayList2) {
            this.f38394d = arrayList;
            this.f38395e = arrayList2;
        }

        /* renamed from: e */
        public final void mo21078e(C5265a aVar, C5268d dVar, ArrayList arrayList) {
            C5267c cVar = (C5267c) aVar;
            FavoriteLinesFragment favoriteLinesFragment = FavoriteLinesFragment.this;
            int i = FavoriteLinesFragment.f38373E;
            C13556a aVar2 = favoriteLinesFragment.f38389y;
            if (aVar2 != null) {
                aVar2.cancel(true);
                favoriteLinesFragment.f38389y = null;
            }
            if (arrayList.isEmpty()) {
                ArrayList b = dVar.f17405b.mo24576b(this.f38394d);
                ArrayList b2 = dVar.f17404a.mo24576b(this.f38395e);
                FavoriteLinesFragment favoriteLinesFragment2 = FavoriteLinesFragment.this;
                C15010o oVar = new C15010o(favoriteLinesFragment2.f38387w, this.f38394d, b, b2, favoriteLinesFragment2.mo46780O1());
                oVar.execute(new Context[]{FavoriteLinesFragment.this.getContext()});
                FavoriteLinesFragment.this.f38389y = oVar;
            } else {
                FavoriteLinesFragment.this.f38376C.setAdapter(new C18671h(R.layout.response_read_error_view));
            }
            FavoriteLinesFragment.this.f38388x = null;
        }
    }

    /* renamed from: com.moovit.app.home.lines.favorites.FavoriteLinesFragment$e */
    public class C15000e extends C20430b<C20789d, C20791e> {
        public C15000e() {
        }

        /* renamed from: b */
        public final void mo21077b(C20431c cVar, ArrayList arrayList, ArrayList arrayList2) {
            boolean z;
            C20789d dVar = (C20789d) cVar;
            if (arrayList2.isEmpty()) {
                FavoriteLinesFragment favoriteLinesFragment = FavoriteLinesFragment.this;
                int i = FavoriteLinesFragment.f38373E;
                favoriteLinesFragment.getClass();
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C20787c cVar2 = ((C20791e) it.next()).f52474m;
                    if (cVar2 != null) {
                        arrayList3.add(cVar2);
                    }
                }
                List<C15007l> q = favoriteLinesFragment.f38382r.mo51054q();
                for (C15007l it2 : q) {
                    Iterator it3 = it2.iterator();
                    while (it3.hasNext()) {
                        ((C15003h) it3.next()).mo45215d(arrayList3);
                    }
                }
                Iterator it4 = q.iterator();
                while (true) {
                    boolean z2 = true;
                    if (!it4.hasNext()) {
                        break;
                    }
                    C15007l lVar = (C15007l) it4.next();
                    if ((lVar instanceof C15009n) || (lVar instanceof C15008m)) {
                        z2 = false;
                    }
                    if (z2) {
                        Collections.sort(lVar, new C18275a(Schedule.m17782D(), 0));
                    }
                }
                for (C15007l lVar2 : q) {
                    if ((lVar2 instanceof C15009n) || (lVar2 instanceof C15008m)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        ArrayList arrayList4 = new ArrayList();
                        C13723g.m34285f(lVar2, arrayList4, new C20406f(2));
                        if (lVar2.isEmpty()) {
                            lVar2.addAll(arrayList4);
                        }
                    }
                }
                favoriteLinesFragment.f38382r.notifyDataSetChanged();
            }
            FavoriteLinesFragment favoriteLinesFragment2 = FavoriteLinesFragment.this;
            favoriteLinesFragment2.f38390z = null;
            favoriteLinesFragment2.mo45210r2();
        }
    }

    /* renamed from: com.moovit.app.home.lines.favorites.FavoriteLinesFragment$f */
    public class C15001f extends C0141e {
        public C15001f() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C12817k kVar = (C12817k) cVar;
            FavoriteLinesFragment favoriteLinesFragment = FavoriteLinesFragment.this;
            favoriteLinesFragment.f38374A = null;
            favoriteLinesFragment.mo45210r2();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C12817k kVar = (C12817k) cVar;
            FavoriteLinesFragment favoriteLinesFragment = FavoriteLinesFragment.this;
            int i = FavoriteLinesFragment.f38373E;
            favoriteLinesFragment.getClass();
            List<LineServiceAlertDigest> list = ((C12818l) gVar).f31681m;
            for (C15007l it : favoriteLinesFragment.f38382r.mo51054q()) {
                Iterator it2 = it.iterator();
                while (it2.hasNext()) {
                    C15003h hVar = (C15003h) it2.next();
                    hVar.getClass();
                    Iterator<LineServiceAlertDigest> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        LineServiceAlertDigest next = it3.next();
                        if (hVar.f38400a.f23694b.equals(next.f23185b.f23206d)) {
                            hVar.f38401b = next;
                            break;
                        }
                    }
                }
            }
            if (!list.isEmpty()) {
                favoriteLinesFragment.f38382r.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.moovit.app.home.lines.favorites.FavoriteLinesFragment$g */
    public static class C15002g extends C15003h {

        /* renamed from: c */
        public final SearchLineItem f38399c;

        public C15002g(TransitLineGroup transitLineGroup, SearchLineItem searchLineItem) {
            super(transitLineGroup);
            this.f38399c = searchLineItem;
        }
    }

    /* renamed from: com.moovit.app.home.lines.favorites.FavoriteLinesFragment$h */
    public static abstract class C15003h {

        /* renamed from: a */
        public final TransitLineGroup f38400a;

        /* renamed from: b */
        public LineServiceAlertDigest f38401b = null;

        public C15003h(TransitLineGroup transitLineGroup) {
            C21100e.m49373x(transitLineGroup, "lineGroup");
            this.f38400a = transitLineGroup;
        }

        /* renamed from: a */
        public C20787c mo45212a() {
            return null;
        }

        /* renamed from: b */
        public TransitStop mo45213b() {
            return null;
        }

        /* renamed from: c */
        public void mo45214c(C20789d.C20790a aVar) {
        }

        /* renamed from: d */
        public void mo45215d(ArrayList arrayList) {
        }
    }

    /* renamed from: com.moovit.app.home.lines.favorites.FavoriteLinesFragment$i */
    public static class C15004i implements Comparator<C15003h> {

        /* renamed from: b */
        public final SparseIntArray f38402b;

        public C15004i(List list) {
            this.f38402b = new SparseIntArray(list.size());
            for (int i = 0; i < list.size(); i++) {
                this.f38402b.put(((ServerId) list.get(i)).f15142b, i);
            }
        }

        public final int compare(Object obj, Object obj2) {
            return C20975x0.m49114a(this.f38402b.get(((C15003h) obj).f38400a.f23694b.f15142b), this.f38402b.get(((C15003h) obj2).f38400a.f23694b.f15142b));
        }
    }

    /* renamed from: com.moovit.app.home.lines.favorites.FavoriteLinesFragment$j */
    public static class C15005j extends C15003h {

        /* renamed from: c */
        public final TransitStop f38403c;

        /* renamed from: d */
        public final List<TransitLine> f38404d;

        /* renamed from: e */
        public final Set<ServerId> f38405e;

        /* renamed from: f */
        public C20787c f38406f = null;

        public C15005j(TransitLineGroup transitLineGroup, TransitStop transitStop, List<TransitLine> list) {
            super(transitLineGroup);
            C21100e.m49373x(transitStop, "stop");
            this.f38403c = transitStop;
            C21100e.m49373x(list, "lines");
            this.f38404d = list;
            HashSet hashSet = new HashSet(list.size());
            ServerId.m11394f(list, hashSet);
            this.f38405e = hashSet;
        }

        /* renamed from: a */
        public final C20787c mo45212a() {
            return this.f38406f;
        }

        /* renamed from: b */
        public final TransitStop mo45213b() {
            return this.f38403c;
        }

        /* renamed from: c */
        public final void mo45214c(C20789d.C20790a aVar) {
            for (TransitLine transitLine : this.f38404d) {
                ServerId serverId = transitLine.f23687c;
                ServerId serverId2 = this.f38403c.f23730b;
                aVar.f52471d.add(serverId);
                aVar.f52472e.add(serverId2);
            }
        }

        /* renamed from: d */
        public final void mo45215d(ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            Iterator it = arrayList.iterator();
            StopRealTimeInformation stopRealTimeInformation = null;
            while (it.hasNext()) {
                C20787c cVar = (C20787c) it.next();
                if (this.f38403c.f23730b.equals(cVar.f52457b)) {
                    if (stopRealTimeInformation == null) {
                        stopRealTimeInformation = cVar.f52459d;
                    }
                    if (this.f38405e.contains(cVar.f52456a)) {
                        arrayList2.addAll(cVar.f52458c.f23660b);
                        hashMap.putAll(cVar.f52460e);
                    }
                }
            }
            this.f38406f = new C20787c(this.f38404d.get(0).f23687c, this.f38403c.f23730b, new Schedule(arrayList2, false), stopRealTimeInformation, hashMap);
        }
    }

    /* renamed from: com.moovit.app.home.lines.favorites.FavoriteLinesFragment$k */
    public class C15006k extends C18676l<C15003h, C15007l, C12797f> {

        /* renamed from: j */
        public final C6593c f38407j = new C6593c(this, 12);

        /* renamed from: k */
        public final C4583a f38408k = new C4583a(this, 11);

        public C15006k() {
        }

        /* renamed from: z */
        public static void m37906z(C15006k kVar, View view) {
            int o;
            boolean z;
            kVar.getClass();
            C12797f fVar = (C12797f) view.getTag();
            int adapterPosition = fVar.getAdapterPosition();
            if (adapterPosition != -1 && (o = kVar.mo51053o(adapterPosition)) >= 0) {
                C18676l.C18679c n = kVar.mo51052n(o);
                int itemViewType = fVar.getItemViewType();
                if (itemViewType != 13) {
                    if (itemViewType == 14) {
                        FavoriteLinesFragment.m37878m2(FavoriteLinesFragment.this, ShowMeHowType.FAVORITE_LINE_STOP);
                        return;
                    } else if (itemViewType != 17) {
                        throw new IllegalStateException(C16759e.m42349e("Unknown favorite line section view type: ", itemViewType));
                    }
                }
                FavoriteLinesFragment favoriteLinesFragment = FavoriteLinesFragment.this;
                C15007l lVar = (C15007l) n;
                int i = FavoriteLinesFragment.f38373E;
                favoriteLinesFragment.getClass();
                if ((lVar instanceof C15009n) || (lVar instanceof C15008m)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar.mo49939g(AnalyticsAttributeKey.TYPE, "stop_from_favorites_clicked");
                    favoriteLinesFragment.mo46797j2(aVar.mo49933a());
                    favoriteLinesFragment.startActivity(StopDetailActivity.m39207B2(favoriteLinesFragment.getContext(), lVar.f38410d.f23730b, (ServerId) null, (TransitStop) null, (List) null));
                }
            }
        }

        /* renamed from: m */
        public final int mo40090m(int i, int i2) {
            C18676l.C18679c n = mo51052n(i);
            C15003h hVar = (C15003h) n.getItem(i2);
            boolean z = true;
            if (i2 != n.mo40089e() - 1) {
                z = false;
            }
            if (hVar instanceof C15002g) {
                if (z) {
                    return 12;
                }
                return 11;
            } else if (z) {
                return 16;
            } else {
                return 15;
            }
        }

        /* renamed from: p */
        public final int mo23815p(int i) {
            C15007l lVar = (C15007l) mo51052n(i);
            if (lVar instanceof C15008m) {
                return 14;
            }
            if (lVar instanceof C15009n) {
                return 13;
            }
            return 17;
        }

        /* renamed from: r */
        public final boolean mo40091r(int i) {
            return i == 11 || i == 12 || i == 15 || i == 16;
        }

        /* renamed from: s */
        public final boolean mo23816s(int i) {
            return i == 13 || i == 14 || i == 17;
        }

        /* renamed from: t */
        public final void mo23817t(RecyclerView.C1119a0 a0Var, int i, int i2) {
            ServiceStatusCategory serviceStatusCategory;
            String str;
            String str2;
            C12797f fVar = (C12797f) a0Var;
            C15003h hVar = (C15003h) mo51052n(i).getItem(i2);
            int itemViewType = fVar.getItemViewType();
            if (itemViewType == 11 || itemViewType == 12) {
                C15002g gVar = (C15002g) hVar;
                ImageOrTextSubtitleListItemView imageOrTextSubtitleListItemView = (ImageOrTextSubtitleListItemView) fVar.mo39639f(R.id.item);
                imageOrTextSubtitleListItemView.setIcon(gVar.f38399c.f41641f);
                imageOrTextSubtitleListItemView.setTitle((CharSequence) gVar.f38399c.f41642g);
                imageOrTextSubtitleListItemView.setSubtitleItems(gVar.f38399c.f41643h);
                Context e = fVar.mo39638e();
                if (!C13382a.m33671g(e)) {
                    Object[] objArr = new Object[1];
                    SearchLineItem searchLineItem = gVar.f38399c;
                    int i3 = C20195b.f51234b;
                    if (searchLineItem != null) {
                        str = searchLineItem.f41638c;
                    } else {
                        str = "";
                    }
                    objArr[0] = str;
                    String string = e.getString(R.string.voice_over_line, objArr);
                    String k = C20195b.m47767k(gVar.f38399c.f41643h);
                    CharSequence[] charSequenceArr = new CharSequence[2];
                    charSequenceArr[0] = string;
                    if (string.equalsIgnoreCase(k)) {
                        str2 = null;
                    } else {
                        str2 = e.getString(R.string.voice_over_towards, new Object[]{k});
                    }
                    charSequenceArr[1] = str2;
                    C13382a.m33674j(imageOrTextSubtitleListItemView, charSequenceArr);
                }
            } else if (itemViewType == 15 || itemViewType == 16) {
                C15005j jVar = (C15005j) hVar;
                ImageOrTextSubtitleListItemView imageOrTextSubtitleListItemView2 = (ImageOrTextSubtitleListItemView) fVar.mo39639f(R.id.item);
                C16181a.m41233b(FavoriteLinesFragment.this.f38386v, imageOrTextSubtitleListItemView2, jVar.f38404d.get(0));
                ScheduleView scheduleView = (ScheduleView) fVar.mo39639f(R.id.schedule);
                C20787c cVar = jVar.f38406f;
                if (cVar != null) {
                    scheduleView.setSchedule(cVar.f52458c);
                    scheduleView.setVisibility(0);
                } else {
                    scheduleView.setVisibility(8);
                }
            } else {
                throw new IllegalStateException(C16759e.m42349e("Unknown favorite line item view type: ", itemViewType));
            }
            fVar.itemView.setOnClickListener(this.f38407j);
            LineServiceAlertDigest lineServiceAlertDigest = hVar.f38401b;
            if (lineServiceAlertDigest != null) {
                serviceStatusCategory = lineServiceAlertDigest.f23186c.f23213b;
            } else {
                serviceStatusCategory = ServiceStatusCategory.UNKNOWN;
            }
            ((ImageOrTextSubtitleListItemView) fVar.mo39639f(R.id.item)).setIconTopEndDecorationDrawable(serviceStatusCategory.getSmallIconResId());
        }

        /* renamed from: v */
        public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
            C12797f fVar = (C12797f) a0Var;
            C15007l lVar = (C15007l) mo51052n(i);
            int itemViewType = fVar.getItemViewType();
            if (itemViewType == 13) {
                ListItemView listItemView = (ListItemView) fVar.itemView;
                listItemView.setTitle((int) R.string.favorite_line_tab_no_station_header);
                listItemView.setOnClickListener(this.f38408k);
            } else if (itemViewType == 14) {
                fVar.mo39639f(R.id.button).setOnClickListener(this.f38408k);
            } else if (itemViewType == 17) {
                Resources resources = fVar.mo39638e().getResources();
                TransitStop transitStop = lVar.f38410d;
                C13744a.m34300b((ImageView) fVar.mo39639f(R.id.image), transitStop.f23734f);
                ((TextView) fVar.mo39639f(R.id.name)).setText(transitStop.f23731c);
                String str = transitStop.f23733e;
                boolean z = !C20964s0.m49090h(str);
                ImagesOrTextsView imagesOrTextsView = (ImagesOrTextsView) fVar.mo39639f(R.id.metadata);
                int i2 = 0;
                if (z) {
                    imagesOrTextsView.setItems(Collections.singletonList(new C20440a((CharSequence) resources.getString(R.string.android_stop_id, new Object[]{str}), (String) null)));
                }
                if (!z) {
                    i2 = 8;
                }
                imagesOrTextsView.setVisibility(i2);
                fVar.itemView.setOnClickListener(this.f38408k);
            } else {
                throw new IllegalStateException(C16759e.m42349e("Unknown favorite section item view type: ", itemViewType));
            }
        }

        /* renamed from: w */
        public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
            View view;
            if (i == 11 || i == 12) {
                view = C13715c.m34239e(viewGroup, R.layout.favorite_line_group_list_item_view, viewGroup, false);
            } else if (i == 15 || i == 16) {
                view = C13715c.m34239e(viewGroup, R.layout.favorite_line_stop_list_item_view, viewGroup, false);
            } else {
                throw new IllegalStateException(C16759e.m42349e("Unknown favorite line item view type: ", i));
            }
            C12797f fVar = new C12797f(view);
            view.setTag(fVar);
            ScheduleView scheduleView = (ScheduleView) fVar.mo39639f(R.id.schedule);
            if (scheduleView != null) {
                scheduleView.setCoordinator(FavoriteLinesFragment.this.f38381q);
            }
            return fVar;
        }

        /* renamed from: x */
        public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
            View view;
            if (i == 13) {
                ListItemView listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, R.attr.listItemSectionHeaderStyle);
                listItemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                view = listItemView;
            } else if (i == 14) {
                view = C13715c.m34239e(viewGroup, R.layout.favorite_line_group_education_section, viewGroup, false);
            } else if (i == 17) {
                view = C13715c.m34239e(viewGroup, R.layout.favorite_stop_list_item_section_view, viewGroup, false);
            } else {
                throw new IllegalStateException(C16759e.m42349e("Unknown section item view type: ", i));
            }
            C12797f fVar = new C12797f(view);
            if (i == 14) {
                fVar.mo39639f(R.id.button).setTag(fVar);
            } else {
                view.setTag(fVar);
            }
            return fVar;
        }
    }

    /* renamed from: com.moovit.app.home.lines.favorites.FavoriteLinesFragment$l */
    public static class C15007l extends C18676l.C18678b<C15003h> {

        /* renamed from: d */
        public final TransitStop f38410d;

        public C15007l(TransitStop transitStop) {
            this.f38410d = transitStop;
        }
    }

    /* renamed from: com.moovit.app.home.lines.favorites.FavoriteLinesFragment$m */
    public static class C15008m extends C15007l {
        public C15008m() {
            super((TransitStop) null);
        }
    }

    /* renamed from: com.moovit.app.home.lines.favorites.FavoriteLinesFragment$n */
    public static class C15009n extends C15007l {
        public C15009n() {
            super((TransitStop) null);
        }
    }

    /* renamed from: com.moovit.app.home.lines.favorites.FavoriteLinesFragment$o */
    public class C15010o extends C13557b<Context, Void, List<C15007l>> {

        /* renamed from: b */
        public final ServerId f38411b = new ServerId(-1);

        /* renamed from: c */
        public final C19826h f38412c;

        /* renamed from: d */
        public final List<ServerId> f38413d;

        /* renamed from: e */
        public final Collection<TransitLineGroup> f38414e;

        /* renamed from: f */
        public final List<TransitStop> f38415f;

        /* renamed from: g */
        public LatLonE6 f38416g;

        /* renamed from: h */
        public HashMap f38417h;

        /* renamed from: i */
        public C6302b f38418i;

        /* renamed from: j */
        public ArrayList f38419j;

        public C15010o(C19826h hVar, List list, ArrayList arrayList, ArrayList arrayList2, Location location) {
            C21100e.m49373x(hVar, "searchLineDal");
            this.f38412c = hVar;
            C21100e.m49373x(list, "favLineGroupIds");
            this.f38413d = list;
            this.f38414e = arrayList;
            ArrayList k = C13717b.m34264k(arrayList2);
            C21100e.m49373x(k, "favStops");
            this.f38415f = k;
            this.f38416g = LatLonE6.m40177j(location);
        }

        public final Object doInBackground(Object[] objArr) {
            ServerId serverId;
            CollectionHashMap.ArrayListHashMap arrayListHashMap;
            TransitAgency transitAgency;
            this.f38417h = this.f38412c.mo52130j(((Context[]) objArr)[0], this.f38413d);
            this.f38418i = new C6302b(this.f38415f.size());
            this.f38419j = new ArrayList(this.f38415f.size());
            LatLonE6 latLonE6 = this.f38416g;
            if (latLonE6 != null) {
                Collections.sort(this.f38415f, C7530f.m17270c(latLonE6));
            }
            for (TransitStop next : this.f38415f) {
                C15007l lVar = new C15007l(next);
                this.f38418i.put(next.f23730b, lVar);
                this.f38419j.add(lVar);
            }
            C15009n nVar = new C15009n();
            this.f38418i.put(this.f38411b, nVar);
            this.f38419j.add(nVar);
            List<TransitStop> list = this.f38415f;
            List<TransitStop> subList = list.subList(0, Math.min(10, list.size()));
            ArrayList arrayList = new ArrayList();
            Iterator<TransitLineGroup> it = this.f38414e.iterator();
            while (true) {
                boolean z = true;
                TransitType.ViewType viewType = null;
                if (!it.hasNext()) {
                    break;
                }
                TransitLineGroup next2 = it.next();
                if (!subList.isEmpty()) {
                    arrayListHashMap = new CollectionHashMap.ArrayListHashMap();
                    for (TransitLine next3 : next2.f23700h) {
                        ServerId serverId2 = next3.f23687c;
                        for (TransitStop next4 : subList) {
                            if (next4.mo24410b(serverId2) != null) {
                                arrayListHashMap.mo47001a(next3, next4);
                            }
                        }
                    }
                } else {
                    arrayListHashMap = null;
                }
                if (arrayListHashMap == null || arrayListHashMap.isEmpty()) {
                    SearchLineItem searchLineItem = (SearchLineItem) this.f38417h.get(next2.f23694b);
                    if (searchLineItem == null) {
                        C16596f a = C16596f.m42113a();
                        StringBuilder k = C13555b.m33972k("Line Group Id: ");
                        k.append(next2.f23694b);
                        a.mo49363b(k.toString());
                        a.mo49364c(new ApplicationBugException("Missing line group search line item"));
                    } else {
                        arrayList.add(new C15002g(next2, searchLineItem));
                    }
                } else {
                    int i = C7843b.f23777a;
                    if (next2 != null) {
                        transitAgency = next2.f23696d.get();
                    } else {
                        transitAgency = null;
                    }
                    TransitType d = C7843b.m17877d(transitAgency);
                    if (d != null) {
                        viewType = d.f23761f;
                    }
                    if (TransitType.ViewType.PLATFORMS.equals(viewType)) {
                        Iterator it2 = arrayListHashMap.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C20944i0 i0Var = (C20944i0) it2.next();
                            if (((TransitStop) i0Var.f52693b).mo24411c(((TransitLine) i0Var.f52692a).f23687c) == null) {
                                break;
                            }
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        CollectionHashMap.ArrayListHashMap arrayListHashMap2 = new CollectionHashMap.ArrayListHashMap();
                        Iterator it3 = arrayListHashMap.iterator();
                        while (it3.hasNext()) {
                            C20944i0 i0Var2 = (C20944i0) it3.next();
                            TransitLine transitLine = (TransitLine) i0Var2.f52692a;
                            arrayListHashMap2.mo47001a(new C20944i0(transitLine.f23689e, (TransitStop) i0Var2.f52693b), transitLine);
                        }
                        for (Map.Entry entry : arrayListHashMap2.entrySet()) {
                            arrayList.add(new C15005j(next2, (TransitStop) ((C20944i0) entry.getKey()).f52693b, (List) entry.getValue()));
                        }
                    } else {
                        Iterator it4 = arrayListHashMap.iterator();
                        while (it4.hasNext()) {
                            C20944i0 i0Var3 = (C20944i0) it4.next();
                            arrayList.add(new C15005j(next2, (TransitStop) i0Var3.f52693b, Collections.singletonList((TransitLine) i0Var3.f52692a)));
                        }
                    }
                }
            }
            Collections.sort(arrayList, new C15004i(this.f38413d));
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                C15003h hVar = (C15003h) it5.next();
                TransitStop b = hVar.mo45213b();
                if (b == null) {
                    serverId = this.f38411b;
                } else {
                    serverId = b.f23730b;
                }
                ((C15007l) this.f38418i.getOrDefault(serverId, null)).add(hVar);
            }
            C13723g.m34285f(this.f38419j, (ArrayList) null, new C13514a(1));
            if (!((C15007l) this.f38418i.getOrDefault(this.f38411b, null)).isEmpty()) {
                this.f38419j.add(new C15008m());
            }
            return this.f38419j;
        }

        public final void onPostExecute(Object obj) {
            int i;
            List list = (List) obj;
            if (!isCancelled()) {
                int size = list.size();
                if (((C15007l) this.f38418i.getOrDefault(this.f38411b, null)).isEmpty()) {
                    i = 0;
                } else {
                    i = 2;
                }
                int i2 = size - i;
                FavoriteLinesFragment favoriteLinesFragment = FavoriteLinesFragment.this;
                int i3 = FavoriteLinesFragment.f38373E;
                favoriteLinesFragment.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.FAVORITES_LOADED);
                aVar.mo49935c(AnalyticsAttributeKey.FAVORITE_LINES_COUNT, Collections.unmodifiableList(favoriteLinesFragment.f38383s.f43618b).size());
                aVar.mo49935c(AnalyticsAttributeKey.FAVORITE_STOP_DISPLAY_COUNT, i2);
                favoriteLinesFragment.mo45209q2(aVar.mo49933a());
                favoriteLinesFragment.f38382r.mo51055y(list);
                RecyclerView.Adapter adapter = favoriteLinesFragment.f38376C.getAdapter();
                C15006k kVar = favoriteLinesFragment.f38382r;
                if (adapter != kVar) {
                    favoriteLinesFragment.f38376C.setAdapter(kVar);
                }
                favoriteLinesFragment.mo45207o2();
                favoriteLinesFragment.mo45208p2();
            }
        }
    }

    public FavoriteLinesFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public static void m37878m2(FavoriteLinesFragment favoriteLinesFragment, ShowMeHowType showMeHowType) {
        favoriteLinesFragment.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, showMeHowType.analyticsConstant);
        favoriteLinesFragment.mo46797j2(aVar.mo49933a());
        AlertDialogFragment.C15856a aVar2 = new AlertDialogFragment.C15856a(favoriteLinesFragment.requireContext());
        Uri V = C17884p.m44351V(favoriteLinesFragment.getResources(), showMeHowType.videoId);
        if (V == null) {
            aVar2.f41328b.remove("video");
        } else {
            aVar2.f41328b.putParcelable("video", V);
        }
        AlertDialogFragment.C15856a g = aVar2.mo47683l(showMeHowType.titleId).mo47678g(showMeHowType.messageId);
        g.f41328b.putBoolean("isMessageCentered", false);
        AlertDialogFragment.C15856a j = g.mo47681j(R.string.got_it);
        j.mo47675d(true);
        j.mo47673b().show(favoriteLinesFragment.getChildFragmentManager(), (String) null);
    }

    /* renamed from: C */
    public final void mo44784C() {
        mo45206n2();
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(getContext()).getPermissionAwareMedAccuracyInfrequentUpdates();
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        HashSet hashSet = new HashSet(6);
        hashSet.add("METRO_CONTEXT");
        hashSet.add("CONFIGURATION");
        hashSet.add("GTFS_METRO_ENTITIES_LOADER");
        hashSet.add("GTFS_TRIPS_SCHEDULE_LOADER");
        hashSet.add("USER_ACCOUNT");
        hashSet.add("SEARCH_LINE_FTS");
        return hashSet;
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        this.f38384t = (C19728f) mo46776J1("METRO_CONTEXT");
        this.f38385u = (C19047a) mo46776J1("CONFIGURATION");
        this.f38386v = this.f38384t.mo52082b(LinePresentationType.NEAR_ME);
        this.f38387w = ((C20400b) C17635b.m43779f(view.getContext()).mo52086d(this.f38384t)).mo51805g();
        C16753e d = ((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46573d();
        this.f38383s = d;
        d.mo49432f(this);
        this.f38383s.mo49436j(this);
        mo45206n2();
    }

    /* renamed from: f */
    public final void mo44785f() {
        mo45206n2();
    }

    /* renamed from: n2 */
    public final void mo45206n2() {
        C13556a aVar = this.f38388x;
        if (aVar != null) {
            aVar.cancel(true);
            this.f38388x = null;
        }
        this.f38379o.mo23803d();
        ArrayList d = ServerId.m11393d(Collections.unmodifiableList(this.f38383s.f43618b));
        if (d.isEmpty()) {
            this.f38376C.setAdapter(this.f38380p);
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.FAVORITES_LOADED);
            aVar2.mo49935c(AnalyticsAttributeKey.FAVORITE_LINES_COUNT, 0);
            aVar2.mo49935c(AnalyticsAttributeKey.FAVORITE_STOP_DISPLAY_COUNT, 0);
            mo45209q2(aVar2.mo49933a());
            return;
        }
        ArrayList d2 = ServerId.m11393d(this.f38383s.mo49438l());
        C13752e R1 = mo46783R1();
        C4776h hVar = C19728f.m47195a(R1.f33852a).f50165a;
        C5269e d3 = C16759e.m42348d(hVar, "metroInfo");
        d3.f17412b.mo47002b(MetroEntityType.TRANSIT_LINE_GROUP, d);
        d3.f17412b.mo47002b(MetroEntityType.TRANSIT_STOP, d2);
        C5267c cVar = new C5267c(R1, "FavoriteLinesFragment", hVar, d3);
        this.f38388x = mo46794g2(cVar.mo21061O(), cVar, new C14999d(d, d2));
        this.f38379o.mo23802c();
    }

    /* renamed from: o2 */
    public final void mo45207o2() {
        C19728f fVar;
        C19047a aVar;
        C13556a aVar2 = this.f38390z;
        if (aVar2 != null) {
            aVar2.cancel(true);
            this.f38390z = null;
        }
        C13752e R1 = mo46783R1();
        if (R1 == null || (fVar = this.f38384t) == null || (aVar = this.f38385u) == null) {
            mo45210r2();
            return;
        }
        C20789d.C20790a aVar3 = new C20789d.C20790a(fVar, aVar, R1);
        for (C15007l it : this.f38382r.mo51054q()) {
            Iterator it2 = it.iterator();
            while (it2.hasNext()) {
                ((C15003h) it2.next()).mo45214c(aVar3);
            }
        }
        if (aVar3.f52471d.isEmpty()) {
            mo45210r2();
            return;
        }
        aVar3.f52473f.f52453g = true;
        C20789d dVar = new C20789d(aVar3.f52468a, aVar3.f52469b, aVar3.f52470c, aVar3.f52471d, aVar3.f52472e, aVar3.f52473f);
        String str = dVar.f52463B;
        RequestOptions L1 = mo46777L1();
        L1.f42909f = true;
        this.f38390z = mo46793f2(str, dVar, L1, new C15000e());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.favorites_lines_fragment, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_refresh_layout);
        this.f38375B = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeColors(C20941h.m49043f(R.attr.colorSecondary, inflate.getContext()));
        this.f38375B.setOnRefreshListener(new C4267a0(this, 3));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        this.f38376C = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        this.f38376C.setAdapter(new C12793c());
        SparseIntArray sparseIntArray = new SparseIntArray(5);
        sparseIntArray.put(11, R.drawable.divider_horizontal);
        sparseIntArray.put(12, R.drawable.divider_horizontal_full);
        sparseIntArray.put(15, R.drawable.divider_horizontal);
        sparseIntArray.put(17, R.drawable.divider_horizontal);
        this.f38376C.mo4593g(new C18681n(inflate.getContext(), sparseIntArray, false), -1);
        SparseIntArray sparseIntArray2 = new SparseIntArray(1);
        sparseIntArray2.put(16, R.drawable.divider_horizontal_full);
        this.f38376C.mo4593g(new C18681n(inflate.getContext(), sparseIntArray2, true), -1);
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C13556a aVar = this.f38388x;
        if (aVar != null) {
            aVar.cancel(true);
            this.f38388x = null;
        }
        C13556a aVar2 = this.f38389y;
        if (aVar2 != null) {
            aVar2.cancel(true);
            this.f38389y = null;
        }
        C13556a aVar3 = this.f38390z;
        if (aVar3 != null) {
            aVar3.cancel(true);
            this.f38390z = null;
        }
        C13556a aVar4 = this.f38374A;
        if (aVar4 != null) {
            aVar4.cancel(true);
            this.f38374A = null;
        }
        Context context = getContext();
        C5367a.m13473a(context).mo21148d(this.f38378n);
        C16753e eVar = this.f38383s;
        if (eVar != null) {
            eVar.mo49444s(this);
            this.f38383s.mo49448w(this);
        }
    }

    public final void onPause() {
        super.onPause();
        this.f38379o.mo23803d();
    }

    public final void onResume() {
        super.onResume();
        this.f38379o.mo23804e();
        mo45209q2(this.f38377D);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        UserAccountManager.m39860h(getContext(), this.f38378n, Arrays.asList(new String[]{"com.moovit.useraccount.user_connect_success", "com.moovit.useraccount.user_disconnect_success"}));
    }

    /* renamed from: p2 */
    public final void mo45208p2() {
        C13556a aVar = this.f38374A;
        if (aVar != null) {
            aVar.cancel(true);
            this.f38374A = null;
        }
        if (mo46783R1() == null) {
            mo45210r2();
            return;
        }
        C6304d dVar = new C6304d();
        for (C15007l it : this.f38382r.mo51054q()) {
            Iterator it2 = it.iterator();
            while (it2.hasNext()) {
                dVar.add(((C15003h) it2.next()).f38400a.f23694b);
            }
        }
        if (dVar.isEmpty()) {
            mo45210r2();
            return;
        }
        C12817k kVar = new C12817k(mo46783R1(), C13717b.m34264k(dVar));
        RequestOptions L1 = mo46777L1();
        L1.f42909f = true;
        this.f38374A = mo46793f2(C12817k.class.getSimpleName() + "_" + C13717b.m34269p(kVar.f31680w), kVar, L1, new C15001f());
    }

    /* renamed from: q */
    public final void mo44782q() {
        mo45206n2();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r0 != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = (p450dt.C16703d) r0;
     */
    /* renamed from: q2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45209q2(p543hq.C17474b r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            r4.f38377D = r5
            androidx.fragment.app.Fragment r0 = r4.getParentFragment()
            boolean r1 = r0 instanceof p450dt.C16703d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0034
            dt.d r0 = (p450dt.C16703d) r0
            android.content.Context r1 = r0.getContext()
            if (r1 != 0) goto L_0x0018
            goto L_0x0034
        L_0x0018:
            com.moovit.analytics.AnalyticsFlowKey r0 = r0.f43498n
            if (r0 == 0) goto L_0x0034
            iq.b r1 = p567iq.C17635b.m43779f(r1)
            u2.a r1 = r1.f50173c
            java.lang.Object r1 = r1.f20759c
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r1.get(r0)
            hq.f r0 = (p543hq.C17479f) r0
            if (r0 == 0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r4.mo46797j2(r5)
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.lines.favorites.FavoriteLinesFragment.mo45209q2(hq.b):void");
    }

    /* renamed from: r2 */
    public final void mo45210r2() {
        boolean z;
        if (this.f38390z == null && this.f38374A == null) {
            z = false;
        } else {
            z = true;
        }
        this.f38375B.setRefreshing(z);
    }

    /* renamed from: v0 */
    public final void mo44783v0() {
        mo45206n2();
    }
}
