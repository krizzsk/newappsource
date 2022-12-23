package o10;

import android.content.Context;
import android.database.Cursor;
import c00.C13720d;
import c00.C13722f;
import ce0.C21100e;
import com.google.android.gms.actions.SearchIntents;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.home.stops.search.SearchStopItem;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitType;
import com.moovit.util.ServerIdMap;
import d00.C16531a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p977zz.C20964s0;
import s00.C19391d;
import u00.C19838j;

/* renamed from: o10.g */
public final class C18692g extends C16531a<C18693a> {

    /* renamed from: b */
    public final C19391d f47589b;

    /* renamed from: c */
    public final String f47590c;

    /* renamed from: d */
    public final TransitType f47591d;

    /* renamed from: o10.g$a */
    public static class C18693a {

        /* renamed from: a */
        public final String f47592a;

        /* renamed from: b */
        public final C19391d f47593b;

        /* renamed from: c */
        public final List<SearchStopItem> f47594c;

        /* renamed from: d */
        public final Cursor f47595d;

        public C18693a(String str, C19391d dVar, ArrayList arrayList, Cursor cursor) {
            C21100e.m49373x(str, SearchIntents.EXTRA_QUERY);
            this.f47592a = str;
            C21100e.m49373x(dVar, "metroDal");
            this.f47593b = dVar;
            this.f47594c = arrayList;
            C21100e.m49373x(cursor, "cursor");
            this.f47595d = cursor;
        }
    }

    public C18692g(Context context, C19391d dVar, String str, TransitType transitType) {
        super(context);
        this.f47589b = dVar;
        C21100e.m49373x(str, SearchIntents.EXTRA_QUERY);
        this.f47590c = str;
        this.f47591d = transitType;
    }

    /* renamed from: b */
    public final void mo48168b(Object obj) {
        ((C18693a) obj).f47595d.close();
    }

    public final Object loadInBackground() {
        List list;
        Cursor cursor;
        String str;
        Throwable th;
        Class<C19838j> cls = C19838j.class;
        SQLiteDatabase readableDatabase = DatabaseHelper.get(getContext()).getReadableDatabase();
        String str2 = this.f47590c;
        C19391d dVar = this.f47589b;
        C18688d f = C18688d.m45685f(getContext());
        f.mo51499b();
        List<T> e = f.f48438c.mo40647e();
        C19838j jVar = (C19838j) this.f47589b.mo51794a(cls);
        Context context = getContext();
        String str3 = this.f47590c;
        TransitType transitType = this.f47591d;
        jVar.getClass();
        if (e.isEmpty()) {
            list = Collections.emptyList();
        } else {
            String h = C19838j.m47304h(context, str3, transitType);
            ArrayList arrayList = new ArrayList(e.size() + 3);
            arrayList.add(jVar.mo52108e());
            arrayList.add(jVar.mo52110g());
            C13720d.m34276f(e, (C13722f) null, ServerId.f15139d, arrayList);
            if (C20964s0.m49090h(h)) {
                str = "SELECT stop_id,stop_name,stop_code,stop_image_data FROM stops WHERE metro_id = ? AND revision = ? AND stop_id IN (%s);";
            } else {
                arrayList.add(h);
                str = "SELECT stop_id,stop_name,stop_code,stop_image_data FROM stops WHERE metro_id = ? AND revision = ? AND stop_id IN (%s) AND rowid IN (SELECT rowid FROM stop_search_fts WHERE stop_search_fts MATCH ?);";
            }
            Cursor rawQuery = readableDatabase.rawQuery(String.format((Locale) null, str, new Object[]{DatabaseUtils.createInClausePlaceHolders(e.size())}), DatabaseUtils.createSelectionArgs((Collection<String>) arrayList));
            try {
                int columnIndex = rawQuery.getColumnIndex("stop_id");
                int columnIndex2 = rawQuery.getColumnIndex("stop_name");
                int columnIndex3 = rawQuery.getColumnIndex("stop_code");
                int columnIndex4 = rawQuery.getColumnIndex("stop_image_data");
                ArrayList arrayList2 = new ArrayList(rawQuery.getCount());
                while (rawQuery.moveToNext()) {
                    arrayList2.add(C19838j.m47305j(rawQuery, columnIndex, columnIndex2, columnIndex3, columnIndex4));
                }
                rawQuery.close();
                list = arrayList2;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        ServerIdMap a = ServerIdMap.m17949a(list);
        ArrayList arrayList3 = new ArrayList(e.size());
        for (T t : e) {
            SearchStopItem searchStopItem = (SearchStopItem) a.get(t);
            if (searchStopItem != null) {
                arrayList3.add(searchStopItem);
            }
        }
        C19838j jVar2 = (C19838j) this.f47589b.mo51794a(cls);
        Context context2 = getContext();
        String str4 = this.f47590c;
        TransitType transitType2 = this.f47591d;
        jVar2.getClass();
        String h2 = C19838j.m47304h(context2, str4, transitType2);
        if (C20964s0.m49090h(h2)) {
            cursor = readableDatabase.rawQuery("SELECT stop_id,stop_name,stop_code,stop_image_data FROM stops WHERE metro_id = ? AND revision = ? ORDER BY stop_name ASC;", DatabaseUtils.createSelectionArgs(jVar2.mo52108e(), jVar2.mo52110g()));
        } else {
            cursor = readableDatabase.rawQuery("SELECT stop_id,stop_name,stop_code,stop_image_data FROM stops WHERE metro_id = ? AND revision = ? AND rowid IN (SELECT rowid FROM stop_search_fts WHERE stop_search_fts MATCH ?) ORDER BY stop_name ASC;", DatabaseUtils.createSelectionArgs(jVar2.mo52108e(), jVar2.mo52110g(), h2));
        }
        return new C18693a(str2, dVar, arrayList3, cursor);
        throw th;
    }
}
