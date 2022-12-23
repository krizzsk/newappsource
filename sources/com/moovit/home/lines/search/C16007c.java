package com.moovit.home.lines.search;

import android.content.Context;
import android.database.Cursor;
import ce0.C21100e;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.DbEntityRef;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitType;
import d00.C16531a;
import j80.C12786g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import n10.C18508e;
import p009a8.C0111k;
import p435de.C16596f;
import p824tp.C19731i;
import p878vv.C20234a;
import p977zz.C20944i0;
import p977zz.C20964s0;
import s00.C19391d;
import u00.C19826h;
import u00.C19844m;
import u00.C19855r;

/* renamed from: com.moovit.home.lines.search.c */
public final class C16007c extends C16531a<C16008a> {

    /* renamed from: b */
    public final C20234a f41670b = new C20234a(this, 1);

    /* renamed from: c */
    public final C19391d f41671c;

    /* renamed from: d */
    public final int f41672d;

    /* renamed from: e */
    public final String f41673e;

    /* renamed from: f */
    public final TransitType f41674f;

    /* renamed from: g */
    public final TransitAgency f41675g;

    /* renamed from: h */
    public final boolean f41676h;

    /* renamed from: i */
    public final boolean f41677i;

    /* renamed from: com.moovit.home.lines.search.c$a */
    public static class C16008a {

        /* renamed from: a */
        public final String f41678a;

        /* renamed from: b */
        public final TransitType f41679b;

        /* renamed from: c */
        public final C19391d f41680c;

        /* renamed from: d */
        public final int f41681d;

        /* renamed from: e */
        public final int[] f41682e;

        /* renamed from: f */
        public final List<C20944i0<SearchLineItem, C19826h.C19835i>> f41683f;

        /* renamed from: g */
        public final C19826h.C19836j f41684g;

        /* renamed from: h */
        public final Map<ServerId, LineServiceAlertDigest> f41685h;

        public C16008a(String str, TransitType transitType, C19391d dVar, int i, int[] iArr, ArrayList arrayList, C19826h.C19836j jVar, Map map, C12786g gVar) {
            C21100e.m49373x(str, SearchIntents.EXTRA_QUERY);
            this.f41678a = str;
            this.f41679b = transitType;
            C21100e.m49373x(dVar, "metroDal");
            this.f41680c = dVar;
            this.f41681d = i;
            this.f41682e = iArr;
            this.f41683f = arrayList;
            this.f41684g = jVar;
            C21100e.m49373x(map, "serviceAlertsByLineGroupId");
            this.f41685h = map;
        }
    }

    public C16007c(Context context, C19391d dVar, int i, String str, TransitType transitType, TransitAgency transitAgency, boolean z, boolean z2) {
        super(context);
        this.f41671c = dVar;
        this.f41672d = i;
        C21100e.m49373x(str, SearchIntents.EXTRA_QUERY);
        this.f41673e = str;
        this.f41674f = transitType;
        this.f41675g = transitAgency;
        this.f41676h = z;
        this.f41677i = z2;
    }

    /* renamed from: a */
    public final void mo21481a(Context context) {
        C18508e g = C18508e.m45376g(context, this.f41671c.f49321d);
        g.mo51499b();
        g.f48438c.mo50903a(this.f41670b);
    }

    /* renamed from: b */
    public final void mo48168b(Object obj) {
        C16008a aVar = (C16008a) obj;
        String str = aVar.f41678a;
        aVar.f41684g.f50418b.close();
    }

    /* renamed from: c */
    public final void mo21482c(Context context) {
        C18508e g = C18508e.m45376g(context, this.f41671c.f49321d);
        g.mo51499b();
        g.f48438c.mo50904b(this.f41670b);
    }

    public final Object loadInBackground() {
        C19826h.C19836j jVar;
        C12786g gVar;
        int i;
        int i2;
        int i3;
        int i4;
        Cursor cursor;
        int i5;
        Cursor cursor2;
        C19855r i6 = this.f41671c.mo51807i();
        Context context = getContext();
        synchronized (i6) {
            i6.mo52154h(context);
            Collections.unmodifiableList(i6.f50474b);
        }
        C19844m c = this.f41671c.mo51801c();
        Context context2 = getContext();
        synchronized (c) {
            c.mo52145h(context2);
            Collections.unmodifiableCollection(c.f50436b.values());
        }
        SQLiteDatabase readableDatabase = DatabaseHelper.get(getContext()).getReadableDatabase();
        Context context3 = getContext();
        C18508e g = C18508e.m45376g(context3, this.f41671c.f49321d);
        g.mo51499b();
        List<T> e = g.f48438c.mo40647e();
        Map<ServerId, C20944i0<SearchLineItem, C19826h.C19835i>> o = this.f41671c.mo51805g().mo52132o(context3, readableDatabase, this.f41673e, this.f41674f, this.f41675g, e);
        ArrayList arrayList = new ArrayList(e.size());
        for (T t : e) {
            C20944i0 i0Var = o.get(t);
            if (i0Var != null) {
                ((SearchLineItem) i0Var.f52692a).f41639d.resolve(context3, this.f41671c);
                DbEntityRef<TransitAgency> dbEntityRef = ((SearchLineItem) i0Var.f52692a).f41640e;
                if (dbEntityRef != null) {
                    dbEntityRef.resolve(context3, this.f41671c);
                }
                arrayList.add(i0Var);
            }
        }
        C19826h g2 = this.f41671c.mo51805g();
        Context context4 = getContext();
        int i7 = this.f41672d;
        String str = this.f41673e;
        TransitType transitType = this.f41674f;
        TransitAgency transitAgency = this.f41675g;
        g2.getClass();
        if (i7 == 1) {
            String i8 = C19826h.m47291i(context4, str.replace('\"', ' ').trim(), transitType, transitAgency);
            if (C20964s0.m49090h(i8)) {
                cursor = readableDatabase.rawQuery("SELECT search_data_id,search_data_transit_type_id,search_data_agency_id,search_data_line_number,search_data_title,search_data_subtitle,search_data_image_data,search_data_order_index FROM line_search_data WHERE line_search_data.metro_id = ? AND line_search_data.revision = ? UNION ALL  SELECT  NULL,search_data_transit_type_id,search_data_agency_id, NULL, NULL, NULL, NULL, MIN(search_data_order_index) FROM line_search_data WHERE line_search_data.metro_id = ? AND line_search_data.revision = ? GROUP BY search_data_transit_type_id,search_data_agency_id ORDER BY search_data_order_index,search_data_id ASC;", DatabaseUtils.createSelectionArgs(g2.mo52108e(), g2.mo52110g(), g2.mo52108e(), g2.mo52110g()));
            } else {
                cursor = readableDatabase.rawQuery("SELECT search_data_id,search_data_transit_type_id,search_data_agency_id,search_data_line_number,search_data_title,search_data_subtitle,search_data_image_data,search_data_order_index FROM line_search_data JOIN line_search_fts ON line_search_data.rowid = line_search_fts.rowid WHERE line_search_data.metro_id = ? AND line_search_data.revision = ? AND line_search_fts MATCH ? UNION ALL  SELECT  NULL,search_data_transit_type_id,search_data_agency_id, NULL, NULL, NULL, NULL, MIN(search_data_order_index) FROM line_search_data JOIN line_search_fts ON line_search_data.rowid = line_search_fts.rowid WHERE line_search_data.metro_id = ? AND line_search_data.revision = ? AND line_search_fts MATCH ? GROUP BY search_data_transit_type_id,search_data_agency_id ORDER BY search_data_order_index,search_data_id ASC;", DatabaseUtils.createSelectionArgs(g2.mo52108e(), g2.mo52110g(), i8, g2.mo52108e(), g2.mo52110g(), i8));
            }
            jVar = new C19826h.C19836j(1, cursor);
        } else if (i7 == 2) {
            String trim = str.replace('\"', ' ').trim();
            String i9 = C19826h.m47291i(context4, trim, transitType, transitAgency);
            if (C20964s0.m49090h(i9)) {
                cursor2 = readableDatabase.rawQuery("SELECT search_data_id,search_data_transit_type_id,search_data_agency_id,search_data_line_number,search_data_title,search_data_subtitle,search_data_image_data,search_data_order_index FROM line_search_data WHERE line_search_data.metro_id = ? AND line_search_data.revision = ? UNION ALL  SELECT  NULL,search_data_transit_type_id,search_data_agency_id, NULL, NULL, NULL, NULL, MIN(search_data_order_index) FROM line_search_data WHERE line_search_data.metro_id = ? AND line_search_data.revision = ? GROUP BY search_data_transit_type_id,search_data_agency_id ORDER BY search_data_order_index,search_data_id ASC;", DatabaseUtils.createSelectionArgs(g2.mo52108e(), g2.mo52110g(), g2.mo52108e(), g2.mo52110g()));
            } else if (C20964s0.m49090h(trim)) {
                cursor2 = readableDatabase.rawQuery("SELECT search_data_id,search_data_transit_type_id,search_data_agency_id,search_data_line_number,search_data_title,search_data_subtitle,search_data_image_data,search_data_order_index FROM line_search_data JOIN line_search_fts ON line_search_data.rowid = line_search_fts.rowid WHERE line_search_data.metro_id = ? AND line_search_data.revision = ? AND line_search_fts MATCH ? UNION ALL  SELECT  NULL,search_data_transit_type_id,search_data_agency_id, NULL, NULL, NULL, NULL, MIN(search_data_order_index) FROM line_search_data JOIN line_search_fts ON line_search_data.rowid = line_search_fts.rowid WHERE line_search_data.metro_id = ? AND line_search_data.revision = ? AND line_search_fts MATCH ? GROUP BY search_data_transit_type_id,search_data_agency_id ORDER BY search_data_order_index,search_data_id ASC;", DatabaseUtils.createSelectionArgs(g2.mo52108e(), g2.mo52110g(), i9, g2.mo52108e(), g2.mo52110g(), i9));
            } else {
                cursor2 = readableDatabase.rawQuery("SELECT search_data_id,search_data_transit_type_id,search_data_agency_id,search_data_line_number,search_data_title,search_data_subtitle,search_data_image_data,highlight(line_search_fts, 0, '<b>', '</b>') as htt,highlight(line_search_fts, 1, '<b>', '</b>') as ha,highlight(line_search_fts, 3, '<b>', '</b>') as hc1,(CASE WHEN city1 = city2 THEN NULL ELSE highlight(line_search_fts, 4, '<b>', '</b>') END) as hc2,highlight(line_search_fts, 5, '<b>', '</b>') as ht,highlight(line_search_fts, 6, '<b>', '</b>') as hs FROM line_search_data JOIN line_search_fts ON line_search_data.rowid = line_search_fts.rowid WHERE line_search_data.metro_id = ? AND line_search_data.revision = ? AND line_search_fts MATCH ? AND rank MATCH 'mqt(2.0, 2.0, 3.0, 2.0, 2.0, 1.0, 1.0, 1.0)' ORDER BY rank,search_data_sorting_index,search_data_order_index", DatabaseUtils.createSelectionArgs(g2.mo52108e(), g2.mo52110g(), i9));
                i5 = 2;
                jVar = new C19826h.C19836j(i5, cursor2);
            }
            i5 = 1;
            jVar = new C19826h.C19836j(i5, cursor2);
        } else {
            throw new ApplicationBugException(C16759e.m42349e("Unknown search algorithm: ", i7));
        }
        Map map = null;
        if (this.f41676h) {
            try {
                map = (Map) Tasks.await(C19731i.m47197a(getContext()).f50174d.mo39624d(false).onSuccessTask(MoovitExecutors.COMPUTATION, new C0111k(7)), 5, TimeUnit.SECONDS);
            } catch (Exception unused) {
            }
            if (map == null) {
                map = Collections.emptyMap();
            }
        } else {
            map = Collections.emptyMap();
        }
        Map map2 = map;
        if (this.f41677i) {
            gVar = (C12786g) ((MoovitApplication) getContext().getApplicationContext()).f37321e.mo50695h("TWITTER_SERVICE_ALERTS_FEEDS", false);
            if (gVar == null) {
                gVar = C12786g.m32590a();
            }
        } else {
            gVar = C12786g.m32590a();
        }
        C12786g gVar2 = gVar;
        int i11 = !gVar2.f31607c.isEmpty();
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            i = arrayList.size() + 1;
        }
        int i12 = i11 + i;
        if (i12 <= 0 || jVar.f50417a != 2) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        int i13 = Integer.MIN_VALUE;
        if (i11 == 0) {
            i3 = Integer.MIN_VALUE;
        } else {
            i3 = 0;
        }
        if (i == 0) {
            i11 = Integer.MIN_VALUE;
        }
        if (i2 != 0) {
            i13 = i12;
        }
        int i14 = i12 + i2;
        int[] iArr = {i3, i11, i13, i14};
        try {
            i4 = i14 + jVar.f50418b.getCount();
        } catch (Exception e2) {
            C16596f.m42113a().mo49364c(e2);
            i4 = 0;
        }
        return new C16008a(this.f41673e, this.f41674f, this.f41671c, i4, iArr, arrayList, jVar, map2, gVar2);
    }
}
