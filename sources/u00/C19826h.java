package u00;

import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import ce0.C21100e;
import com.facebook.appevents.C2342l;
import com.moovit.MoovitApplication;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseJobQueue;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.DbEntityRef;
import com.moovit.database.StatementHelper;
import com.moovit.database.Tables$LineSearchFts;
import com.moovit.database.Tokenizer;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.image.C16019d;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitType;
import com.tranzmate.moovit.protocol.common.MVSearchLineGroupItem;
import com.tranzmate.moovit.protocol.search.MVSearchLineGroupSection;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n10.C18509f;
import p115i0.C5227c;
import p241s0.C6302b;
import p389bl.C13641g;
import p435de.C16596f;
import p583jk.C17884p;
import p641lu.C18277b;
import p714ow.C18847a;
import p714ow.C18848b;
import p810sz.C19575a;
import p810sz.C19576b;
import p810sz.C19589j;
import p810sz.C19600l;
import p898wr.C20400b;
import p977zz.C20943i;
import p977zz.C20944i0;
import p977zz.C20964s0;
import p977zz.C20975x0;
import s00.C19391d;
import s00.C19393f;
import u00.C19806a;
import x00.C20440a;

/* renamed from: u00.h */
public final class C19826h extends C19806a {

    /* renamed from: b */
    public static final C19827a f50375b = new C19827a();

    /* renamed from: c */
    public static final C19828b f50376c = new C19828b();

    /* renamed from: d */
    public static final C19829c f50377d = new C19829c();

    /* renamed from: e */
    public static final C19830d f50378e = new C19830d();

    /* renamed from: f */
    public static final StatementHelper f50379f = StatementHelper.newInsertHelper("line_search_data", 5, "metro_id", "revision", "search_data_id", "search_data_order_index", "search_data_sorting_index", "search_data_title", "search_data_transit_type_id", "search_data_agency_id", "search_data_line_number", "search_data_subtitle", "search_data_image_data", "search_data_metadata", "search_data_city1", "search_data_city2");

    /* renamed from: g */
    public static final StatementHelper f50380g = StatementHelper.newDeleteHelper("line_search_data", "metro_id", "revision");

    /* renamed from: h */
    public static final StatementHelper f50381h = StatementHelper.newInsertHelper("line_search_fts", 5, "rowid", "transit_type", "agency", "line_number", "city1", "city2", "title", "subtitle", "metadata");

    /* renamed from: i */
    public static StatementHelper f50382i = new StatementHelper("DELETE FROM line_search_fts WHERE rowid IN (SELECT rowid FROM line_search_data WHERE line_search_data.metro_id = ? AND line_search_data.revision = ?)", StatementHelper.EMPTY_COLUMNS, new String[]{"metro_id", "revision"});

    /* renamed from: u00.h$a */
    public class C19827a extends ThreadLocal<ByteArrayOutputStream> {
        public final Object initialValue() {
            return new ByteArrayOutputStream(512);
        }
    }

    /* renamed from: u00.h$b */
    public class C19828b extends ThreadLocal<StringBuilder> {
        public final Object initialValue() {
            return new StringBuilder();
        }
    }

    /* renamed from: u00.h$c */
    public class C19829c extends ThreadLocal<LinkedHashSet<String>> {
        public final Object initialValue() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: u00.h$d */
    public class C19830d extends ThreadLocal<ArrayList<C20440a>> {
        public final Object initialValue() {
            return new ArrayList();
        }
    }

    /* renamed from: u00.h$e */
    public class C19831e extends C19806a.C19807a {

        /* renamed from: d */
        public final List<MVSearchLineGroupSection> f50383d;

        public C19831e(Context context, ServerId serverId, long j, List<MVSearchLineGroupSection> list) {
            super(context, serverId, j);
            C21100e.m49373x(list, "mvSections");
            this.f50383d = list;
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            Map<K, V> unmodifiableMap;
            Map<K, V> unmodifiableMap2;
            HashMap hashMap;
            int i;
            String str;
            String str2;
            String str3;
            String str4;
            int i2;
            Context context2 = context;
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            C19855r i3 = ((C19391d) C19826h.this.f49320a).mo51807i();
            synchronized (i3) {
                i3.mo52154h(context2);
                unmodifiableMap = Collections.unmodifiableMap(i3.f50475c);
            }
            SparseArray<V> n = C13717b.m34267n(unmodifiableMap, new C18847a(1));
            C19844m c = ((C19391d) C19826h.this.f49320a).mo51801c();
            synchronized (c) {
                c.mo52145h(context2);
                unmodifiableMap2 = Collections.unmodifiableMap(c.f50436b);
            }
            SparseArray<V> n2 = C13717b.m34267n(unmodifiableMap2, new C18848b(2));
            C19832f fVar = new C19832f();
            fVar.f50394j = new ArrayList();
            int i4 = serverId.f15142b;
            SQLiteStatement prepare = C19826h.f50379f.prepare(sQLiteDatabase2);
            SQLiteStatement prepare2 = C19826h.f50381h.prepare(sQLiteDatabase2);
            List<MVSearchLineGroupSection> list = this.f50383d;
            try {
                HashSet hashSet = new HashSet();
                for (MVSearchLineGroupSection mVSearchLineGroupSection : list) {
                    for (MVSearchLineGroupItem mVSearchLineGroupItem : mVSearchLineGroupSection.items) {
                        hashSet.add(mVSearchLineGroupItem.lineNumber);
                    }
                }
                ArrayList arrayList = new ArrayList(hashSet);
                Collections.sort(arrayList, new C18509f(arrayList.size()));
                int size = arrayList.size();
                HashMap hashMap2 = new HashMap(size);
                for (int i5 = 0; i5 < size; i5++) {
                    hashMap2.put((String) arrayList.get(i5), Integer.valueOf(i5));
                }
                hashMap = hashMap2;
            } catch (Throwable th) {
                C16596f.m42113a().mo49364c(new ApplicationBugException("Failed to sort line numbers!", th));
                hashMap = Collections.emptyMap();
            }
            Map map = hashMap;
            Iterator<MVSearchLineGroupSection> it = this.f50383d.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                MVSearchLineGroupSection next = it.next();
                for (MVSearchLineGroupItem next2 : next.items) {
                    fVar.f50385a = next2.lineGroupId;
                    fVar.f50386b = next.routeTypeId.getValue();
                    if (next.mo31469f()) {
                        i = next.agencyId;
                    } else {
                        i = 0;
                    }
                    fVar.f50387c = i;
                    if (next2.mo26382j()) {
                        str = next2.lineNumber;
                    } else {
                        str = "";
                    }
                    fVar.f50388d = str;
                    if (next2.mo26377f()) {
                        str2 = next2.city1;
                    } else {
                        str2 = null;
                    }
                    fVar.f50389e = str2;
                    if (next2.mo26378g()) {
                        str3 = next2.city2;
                    } else {
                        str3 = null;
                    }
                    fVar.f50390f = str3;
                    fVar.f50391g = next2.metadata;
                    fVar.f50392h = C16028g.m40829g(next2.image);
                    if (C20964s0.m49090h(next2.title)) {
                        str4 = null;
                    } else {
                        str4 = next2.title;
                    }
                    fVar.f50393i = str4;
                    fVar.f50394j.clear();
                    C13720d.m34276f(next2.subtitle, (C13722f) null, new C2342l(11), fVar.f50394j);
                    List<String> list2 = fVar.f50391g;
                    if (list2 != null) {
                        list2.remove(fVar.f50388d);
                        fVar.f50391g.remove(fVar.f50389e);
                        fVar.f50391g.remove(fVar.f50390f);
                    }
                    Integer num = (Integer) map.get(next2.lineNumber);
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 0;
                    }
                    int i7 = i6 + 1;
                    StatementHelper statementHelper = C19826h.f50379f;
                    statementHelper.bindValue(prepare, "metro_id", (long) i4);
                    statementHelper.bindValue(prepare, "revision", j);
                    Map map2 = map;
                    statementHelper.bindValue(prepare, "search_data_id", (long) fVar.f50385a);
                    statementHelper.bindValue(prepare, "search_data_transit_type_id", (long) fVar.f50386b);
                    int i8 = fVar.f50387c;
                    if (i8 != 0) {
                        statementHelper.bindValue(prepare, "search_data_agency_id", (long) i8);
                    } else {
                        statementHelper.bindNullValue(prepare, "search_data_agency_id");
                    }
                    statementHelper.bindValue(prepare, "search_data_line_number", fVar.f50388d);
                    statementHelper.bindValue(prepare, "search_data_sorting_index", (long) i2);
                    statementHelper.bindValue(prepare, "search_data_order_index", (long) i6);
                    String str5 = fVar.f50393i;
                    if (str5 != null) {
                        statementHelper.bindValue(prepare, "search_data_title", str5);
                    } else {
                        statementHelper.bindNullValue(prepare, "search_data_title");
                    }
                    if (!C13717b.m34258e(fVar.f50394j)) {
                        statementHelper.bindValue(prepare, "search_data_subtitle", C13641g.m34111C(fVar.f50394j, C19576b.m46958a(C20440a.f51780d), (ByteArrayOutputStream) C19826h.f50375b.get()));
                    } else {
                        statementHelper.bindNullValue(prepare, "search_data_subtitle");
                    }
                    Image image = fVar.f50392h;
                    if (image != null) {
                        statementHelper.bindValue(prepare, "search_data_image_data", C13641g.m34111C(image, C16019d.m40803a().f41718d, (ByteArrayOutputStream) C19826h.f50375b.get()));
                    } else {
                        statementHelper.bindNullValue(prepare, "search_data_image_data");
                    }
                    if (!C13717b.m34258e(fVar.f50391g)) {
                        statementHelper.bindValue(prepare, "search_data_metadata", C13641g.m34111C(fVar.f50391g, C19576b.m46958a(C19600l.f49790t), (ByteArrayOutputStream) C19826h.f50375b.get()));
                    } else {
                        statementHelper.bindNullValue(prepare, "search_data_metadata");
                    }
                    String str6 = fVar.f50389e;
                    if (str6 != null) {
                        statementHelper.bindValue(prepare, "search_data_city1", str6);
                    } else {
                        statementHelper.bindNullValue(prepare, "search_data_city1");
                    }
                    String str7 = fVar.f50390f;
                    if (str7 != null) {
                        statementHelper.bindValue(prepare, "search_data_city2", str7);
                    } else {
                        statementHelper.bindNullValue(prepare, "search_data_city2");
                    }
                    C19826h.m47290h(context, n, n2, prepare2, prepare.executeInsert(), fVar);
                    prepare2.executeInsert();
                    next = next;
                    i6 = i7;
                    map = map2;
                }
            }
            sQLiteDatabase2.execSQL(Tables$LineSearchFts.rebuild());
        }
    }

    /* renamed from: u00.h$f */
    public static class C19832f {

        /* renamed from: a */
        public int f50385a = -1;

        /* renamed from: b */
        public int f50386b = -1;

        /* renamed from: c */
        public int f50387c = -1;

        /* renamed from: d */
        public String f50388d = null;

        /* renamed from: e */
        public String f50389e = null;

        /* renamed from: f */
        public String f50390f = null;

        /* renamed from: g */
        public List<String> f50391g = null;

        /* renamed from: h */
        public Image f50392h = null;

        /* renamed from: i */
        public String f50393i = null;

        /* renamed from: j */
        public List<C20440a> f50394j = null;
    }

    /* renamed from: u00.h$g */
    public class C19833g extends C19806a.C19807a {
        public C19833g(Context context, ServerId serverId, long j) {
            super(context, serverId, j);
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            Map<K, V> unmodifiableMap;
            Map<K, V> unmodifiableMap2;
            int i;
            int i2;
            int i3;
            Context context2 = context;
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            C19855r i4 = ((C19391d) C19826h.this.f49320a).mo51807i();
            synchronized (i4) {
                i4.mo52154h(context2);
                unmodifiableMap = Collections.unmodifiableMap(i4.f50475c);
            }
            SparseArray<V> n = C13717b.m34267n(unmodifiableMap, new C5227c(1));
            C19844m c = ((C19391d) C19826h.this.f49320a).mo51801c();
            synchronized (c) {
                c.mo52145h(context2);
                unmodifiableMap2 = Collections.unmodifiableMap(c.f50436b);
            }
            SparseArray<V> n2 = C13717b.m34267n(unmodifiableMap2, new C19837i(0));
            Cursor rawQuery = sQLiteDatabase2.rawQuery("SELECT rowid,search_data_id,search_data_transit_type_id,search_data_agency_id,search_data_line_number,search_data_city1,search_data_city2,search_data_title,search_data_subtitle,search_data_metadata FROM line_search_data WHERE line_search_data.metro_id = ? AND line_search_data.revision = ? ORDER BY search_data_order_index ASC;", DatabaseUtils.createSelectionArgs(C19826h.this.mo52108e(), C19826h.this.mo52110g()));
            int columnIndex = rawQuery.getColumnIndex("rowid");
            int columnIndex2 = rawQuery.getColumnIndex("search_data_id");
            int columnIndex3 = rawQuery.getColumnIndex("search_data_transit_type_id");
            int columnIndex4 = rawQuery.getColumnIndex("search_data_agency_id");
            int columnIndex5 = rawQuery.getColumnIndex("search_data_line_number");
            int columnIndex6 = rawQuery.getColumnIndex("search_data_title");
            int columnIndex7 = rawQuery.getColumnIndex("search_data_subtitle");
            int columnIndex8 = rawQuery.getColumnIndex("search_data_image_data");
            int columnIndex9 = rawQuery.getColumnIndex("search_data_metadata");
            int columnIndex10 = rawQuery.getColumnIndex("search_data_city1");
            int columnIndex11 = rawQuery.getColumnIndex("search_data_city2");
            rawQuery.getColumnIndex("htt");
            rawQuery.getColumnIndex("ha");
            rawQuery.getColumnIndex("hc1");
            rawQuery.getColumnIndex("hc2");
            rawQuery.getColumnIndex("ht");
            rawQuery.getColumnIndex("hs");
            C19832f fVar = new C19832f();
            SparseArray<V> sparseArray = n2;
            SQLiteStatement prepare = C19826h.f50381h.prepare(sQLiteDatabase2);
            while (rawQuery.moveToNext()) {
                int i5 = rawQuery.getInt(columnIndex);
                int i6 = columnIndex;
                int i7 = -1;
                fVar.f50385a = -1;
                if (columnIndex2 != -1) {
                    fVar.f50385a = rawQuery.getInt(columnIndex2);
                    i7 = -1;
                }
                fVar.f50386b = i7;
                if (columnIndex3 != i7) {
                    fVar.f50386b = rawQuery.getInt(columnIndex3);
                    i7 = -1;
                }
                fVar.f50387c = i7;
                if (columnIndex4 != i7) {
                    if (rawQuery.isNull(columnIndex4)) {
                        i3 = 0;
                    } else {
                        i3 = rawQuery.getInt(columnIndex4);
                    }
                    fVar.f50387c = i3;
                }
                fVar.f50388d = null;
                if (columnIndex5 != -1) {
                    fVar.f50388d = rawQuery.getString(columnIndex5);
                }
                fVar.f50389e = null;
                if (columnIndex10 != -1 && !rawQuery.isNull(columnIndex10)) {
                    fVar.f50389e = rawQuery.getString(columnIndex10);
                }
                fVar.f50390f = null;
                if (columnIndex11 != -1 && !rawQuery.isNull(columnIndex11)) {
                    fVar.f50390f = rawQuery.getString(columnIndex11);
                }
                fVar.f50391g = null;
                if (columnIndex9 == -1 || rawQuery.isNull(columnIndex9)) {
                    i2 = columnIndex11;
                    i = columnIndex9;
                } else {
                    i2 = columnIndex11;
                    i = columnIndex9;
                    fVar.f50391g = (List) C13641g.m34120h(rawQuery.getBlob(columnIndex9), C19575a.m46957a(C19589j.f49779k, false));
                }
                fVar.f50393i = null;
                if (columnIndex6 != -1 && !rawQuery.isNull(columnIndex6)) {
                    fVar.f50393i = rawQuery.getString(columnIndex6);
                }
                fVar.f50394j = null;
                if (columnIndex7 != -1 && !rawQuery.isNull(columnIndex7)) {
                    fVar.f50394j = (List) C13641g.m34120h(rawQuery.getBlob(columnIndex7), C19575a.m46957a(C20440a.f51780d, false));
                }
                fVar.f50392h = null;
                if (columnIndex8 != -1 && !rawQuery.isNull(columnIndex8)) {
                    fVar.f50392h = (Image) C13641g.m34120h(rawQuery.getBlob(columnIndex8), C16019d.m40803a().f41718d);
                }
                long j2 = (long) i5;
                int i8 = i;
                int i9 = columnIndex4;
                long j3 = j2;
                C19826h.m47290h(context, n, sparseArray, prepare, j3, fVar);
                prepare.executeInsert();
                columnIndex2 = columnIndex2;
                columnIndex9 = i8;
                columnIndex3 = columnIndex3;
                columnIndex8 = columnIndex8;
                columnIndex11 = i2;
                columnIndex7 = columnIndex7;
                columnIndex6 = columnIndex6;
                columnIndex4 = i9;
                columnIndex5 = columnIndex5;
                columnIndex = i6;
                SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase;
            }
            sQLiteDatabase.execSQL(Tables$LineSearchFts.rebuild());
        }
    }

    /* renamed from: u00.h$h */
    public static class C19834h {

        /* renamed from: a */
        public final int f50396a;

        /* renamed from: b */
        public final int f50397b;

        /* renamed from: c */
        public final int f50398c;

        /* renamed from: d */
        public final int f50399d;

        /* renamed from: e */
        public final int f50400e;

        /* renamed from: f */
        public final int f50401f;

        /* renamed from: g */
        public final int f50402g;

        /* renamed from: h */
        public final int f50403h;

        /* renamed from: i */
        public final int f50404i;

        /* renamed from: j */
        public final int f50405j;

        /* renamed from: k */
        public final int f50406k;

        /* renamed from: l */
        public final int f50407l;

        /* renamed from: m */
        public final int f50408m;

        public C19834h(Cursor cursor) {
            cursor.getColumnIndex("rowid");
            this.f50396a = cursor.getColumnIndex("search_data_id");
            this.f50397b = cursor.getColumnIndex("search_data_transit_type_id");
            this.f50398c = cursor.getColumnIndex("search_data_agency_id");
            this.f50399d = cursor.getColumnIndex("search_data_line_number");
            this.f50400e = cursor.getColumnIndex("search_data_title");
            this.f50401f = cursor.getColumnIndex("search_data_subtitle");
            this.f50402g = cursor.getColumnIndex("search_data_image_data");
            cursor.getColumnIndex("search_data_metadata");
            cursor.getColumnIndex("search_data_city1");
            cursor.getColumnIndex("search_data_city2");
            this.f50403h = cursor.getColumnIndex("htt");
            this.f50404i = cursor.getColumnIndex("ha");
            this.f50405j = cursor.getColumnIndex("hc1");
            this.f50406k = cursor.getColumnIndex("hc2");
            this.f50407l = cursor.getColumnIndex("ht");
            this.f50408m = cursor.getColumnIndex("hs");
        }
    }

    /* renamed from: u00.h$i */
    public static class C19835i {

        /* renamed from: a */
        public final Spanned f50409a;

        /* renamed from: b */
        public final Spanned f50410b;

        /* renamed from: c */
        public final CharSequence f50411c;

        /* renamed from: d */
        public final CharSequence f50412d;

        /* renamed from: e */
        public final CharSequence f50413e;

        /* renamed from: f */
        public final CharSequence f50414f;

        /* renamed from: g */
        public Set<String> f50415g = null;

        /* renamed from: h */
        public Set<String> f50416h = null;

        public C19835i(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, SpannableStringBuilder spannableStringBuilder3, SpannableStringBuilder spannableStringBuilder4, SpannableStringBuilder spannableStringBuilder5, SpannableStringBuilder spannableStringBuilder6) {
            this.f50409a = spannableStringBuilder;
            this.f50410b = spannableStringBuilder2;
            this.f50411c = spannableStringBuilder3;
            this.f50412d = spannableStringBuilder4;
            this.f50413e = spannableStringBuilder5;
            this.f50414f = spannableStringBuilder6;
        }

        /* renamed from: a */
        public static SpannableString m47302a(String str, Set set) {
            Iterator it = set.iterator();
            SpannableString spannableString = null;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                int length = str2.length();
                int i = 0;
                while (true) {
                    int indexOf = str.indexOf(str2, i);
                    if (indexOf != -1) {
                        if (spannableString == null) {
                            spannableString = new SpannableString(str);
                        }
                        int i2 = indexOf + length;
                        spannableString.setSpan(new StyleSpan(1), indexOf, i2, 33);
                        i = i2;
                    }
                }
            }
            return spannableString;
        }

        /* renamed from: b */
        public static Set<String> m47303b(Spanned spanned) {
            if (spanned == null) {
                return Collections.emptySet();
            }
            LinkedHashSet linkedHashSet = (LinkedHashSet) C19826h.f50377d.get();
            linkedHashSet.clear();
            for (StyleSpan styleSpan : (StyleSpan[]) spanned.getSpans(0, spanned.length(), StyleSpan.class)) {
                CharSequence subSequence = spanned.subSequence(spanned.getSpanStart(styleSpan), spanned.getSpanEnd(styleSpan));
                if (subSequence != null) {
                    linkedHashSet.add(subSequence.toString());
                }
            }
            if (linkedHashSet.isEmpty()) {
                return Collections.emptySet();
            }
            return new HashSet(linkedHashSet);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C19835i)) {
                return false;
            }
            C19835i iVar = (C19835i) obj;
            if (!C20975x0.m49118e(this.f50409a, iVar.f50409a) || !C20975x0.m49118e(this.f50410b, iVar.f50410b) || !C20975x0.m49118e(this.f50411c, iVar.f50411c) || !C20975x0.m49118e(this.f50412d, iVar.f50412d) || !C20975x0.m49118e(this.f50413e, iVar.f50413e) || !C20975x0.m49118e(this.f50414f, iVar.f50414f)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return C17884p.m44333D(C17884p.m44335F(this.f50409a), C17884p.m44335F(this.f50410b), C17884p.m44335F(this.f50411c), C17884p.m44335F(this.f50412d), C17884p.m44335F(this.f50413e), C17884p.m44335F(this.f50414f));
        }
    }

    /* renamed from: u00.h$j */
    public static class C19836j {

        /* renamed from: a */
        public final int f50417a;

        /* renamed from: b */
        public final Cursor f50418b;

        /* renamed from: c */
        public final C19834h f50419c;

        public C19836j(int i, Cursor cursor) {
            this.f50417a = i;
            C21100e.m49373x(cursor, "cursor");
            this.f50418b = cursor;
            this.f50419c = new C19834h(cursor);
        }
    }

    public C19826h(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: h */
    public static void m47290h(Context context, SparseArray sparseArray, SparseArray sparseArray2, SQLiteStatement sQLiteStatement, long j, C19832f fVar) {
        LinkedHashSet linkedHashSet;
        String str;
        LinkedHashSet linkedHashSet2;
        StatementHelper statementHelper = f50381h;
        statementHelper.bindValue(sQLiteStatement, "rowid", j);
        statementHelper.bindValue(sQLiteStatement, "transit_type", context.getString(((TransitType) sparseArray.get(fVar.f50386b)).f23758c));
        int i = fVar.f50387c;
        if (i != 0) {
            statementHelper.bindValue(sQLiteStatement, "agency", ((TransitAgency) sparseArray2.get(i)).f23673c);
        } else {
            statementHelper.bindNullValue(sQLiteStatement, "agency");
        }
        statementHelper.bindValue(sQLiteStatement, "line_number", fVar.f50388d);
        String str2 = fVar.f50389e;
        if (str2 != null) {
            statementHelper.bindValue(sQLiteStatement, "city1", str2);
        } else {
            statementHelper.bindNullValue(sQLiteStatement, "city1");
        }
        String str3 = fVar.f50390f;
        if (str3 != null) {
            statementHelper.bindValue(sQLiteStatement, "city2", str3);
        } else {
            statementHelper.bindNullValue(sQLiteStatement, "city2");
        }
        String str4 = fVar.f50393i;
        if (str4 != null) {
            statementHelper.bindValue(sQLiteStatement, "title", str4);
        } else {
            statementHelper.bindNullValue(sQLiteStatement, "title");
        }
        List<C20440a> list = fVar.f50394j;
        String str5 = null;
        if (C13717b.m34258e(list)) {
            linkedHashSet = null;
        } else {
            linkedHashSet = (LinkedHashSet) f50377d.get();
            linkedHashSet.clear();
            for (C20440a next : list) {
                if (next.mo52636a()) {
                    linkedHashSet.add(next.f51782b.toString());
                }
            }
        }
        if (C13717b.m34258e(linkedHashSet)) {
            str = null;
        } else {
            StringBuilder sb = (StringBuilder) f50376c.get();
            sb.setLength(0);
            str = C20964s0.m49101s(" ", linkedHashSet, sb);
        }
        if (str != null) {
            f50381h.bindValue(sQLiteStatement, "subtitle", str);
        } else {
            f50381h.bindNullValue(sQLiteStatement, "subtitle");
        }
        List<String> list2 = fVar.f50391g;
        if (C13717b.m34258e(list2)) {
            linkedHashSet2 = null;
        } else {
            linkedHashSet2 = (LinkedHashSet) f50377d.get();
            linkedHashSet2.clear();
            linkedHashSet2.addAll(list2);
        }
        if (!C13717b.m34258e(linkedHashSet2)) {
            StringBuilder sb2 = (StringBuilder) f50376c.get();
            sb2.setLength(0);
            str5 = C20964s0.m49101s(" ", linkedHashSet2, sb2);
        }
        if (str5 != null) {
            f50381h.bindValue(sQLiteStatement, "metadata", str5);
        } else {
            f50381h.bindNullValue(sQLiteStatement, "metadata");
        }
    }

    /* renamed from: i */
    public static String m47291i(Context context, String str, TransitType transitType, TransitAgency transitAgency) {
        boolean z;
        boolean z2;
        boolean z3;
        String str2 = str;
        TransitType transitType2 = transitType;
        TransitAgency transitAgency2 = transitAgency;
        StringBuilder sb = (StringBuilder) f50376c.get();
        sb.setLength(0);
        boolean z4 = true;
        if (transitType2 == null && transitAgency2 == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (transitType2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (transitAgency2 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z2 || !z3) {
                z4 = false;
            }
            if (z4) {
                sb.append('(');
            }
            if (z2) {
                sb.append('(');
                sb.append("transit_type");
                sb.append(':');
                sb.append('^');
                sb.append('\"');
                sb.append(context.getString(transitType2.f23758c));
                sb.append('\"');
                sb.append(')');
            }
            if (z4) {
                sb.append(" AND ");
            }
            if (z3) {
                sb.append('(');
                sb.append("agency");
                sb.append(':');
                sb.append('^');
                sb.append('\"');
                sb.append(transitAgency2.f23673c);
                sb.append('\"');
                sb.append(')');
            }
            if (z4) {
                sb.append(')');
            }
        }
        if (!C20964s0.m49090h(str)) {
            if (z) {
                sb.append(" AND ");
                sb.append('(');
            }
            sb.append('(');
            sb.append('{');
            sb.append("transit_type");
            sb.append(' ');
            sb.append("agency");
            sb.append(' ');
            sb.append("line_number");
            sb.append(' ');
            sb.append("city1");
            sb.append(' ');
            sb.append("city2");
            sb.append('}');
            sb.append(':');
            sb.append('(');
            sb.append('(');
            sb.append('^');
            sb.append('\"');
            sb.append(str2);
            sb.append('\"');
            sb.append(')');
            sb.append(" OR ");
            sb.append('(');
            sb.append('^');
            sb.append('\"');
            sb.append(str2);
            sb.append('\"');
            sb.append('*');
            sb.append(')');
            sb.append(')');
            sb.append(')');
            sb.append(" OR ");
            String[] strArr = Tokenizer.tokenize(str);
            int length = strArr.length;
            sb.append('(');
            int i = length - 1;
            for (int i2 = 0; i2 < length; i2++) {
                sb.append('\"');
                sb.append(strArr[i2]);
                sb.append('\"');
                sb.append('*');
                if (i2 != i) {
                    sb.append(' ');
                }
            }
            sb.append(')');
            if (z) {
                sb.append(')');
            }
        }
        return sb.toString();
    }

    /* renamed from: k */
    public static SpannableStringBuilder m47292k(Cursor cursor, int i) {
        String string;
        if (i == -1 || (string = cursor.getString(i)) == null) {
            return null;
        }
        int i2 = 0;
        int indexOf = string.indexOf("<b>", 0);
        if (indexOf == -1) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        do {
            int i3 = indexOf + 3;
            int indexOf2 = string.indexOf("</b>", i3);
            if (i2 < indexOf) {
                spannableStringBuilder.append(string, i2, indexOf);
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(string, i3, indexOf2);
            spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
            i2 = indexOf2 + 4;
            indexOf = string.indexOf("<b>", i2);
        } while (indexOf != -1);
        int length2 = string.length();
        if (i2 < length2) {
            spannableStringBuilder.append(string, i2, length2);
        }
        return spannableStringBuilder;
    }

    /* renamed from: l */
    public static SearchLineItem m47293l(Cursor cursor, C19834h hVar) {
        DbEntityRef<TransitAgency> dbEntityRef;
        List list;
        Image image;
        ServerId serverId = new ServerId(cursor.getInt(hVar.f50396a));
        String string = cursor.getString(hVar.f50399d);
        DbEntityRef<TransitType> newTransitTypeRef = DbEntityRef.newTransitTypeRef(new ServerId(cursor.getInt(hVar.f50397b)));
        if (!cursor.isNull(hVar.f50398c)) {
            dbEntityRef = DbEntityRef.newAgencyRef(new ServerId(cursor.getInt(hVar.f50398c)));
        } else {
            dbEntityRef = null;
        }
        String string2 = cursor.getString(hVar.f50400e);
        if (!cursor.isNull(hVar.f50401f)) {
            list = (List) C13641g.m34120h(cursor.getBlob(hVar.f50401f), C19575a.m46957a(C20440a.f51780d, false));
        } else {
            list = null;
        }
        if (!cursor.isNull(hVar.f50402g)) {
            image = (Image) C13641g.m34120h(cursor.getBlob(hVar.f50402g), C16019d.m40803a().f41718d);
        } else {
            image = null;
        }
        return new SearchLineItem(serverId, string, newTransitTypeRef, dbEntityRef, image, string2, list);
    }

    /* renamed from: m */
    public static C19835i m47294m(Cursor cursor, C19834h hVar) {
        return new C19835i(m47292k(cursor, hVar.f50407l), m47292k(cursor, hVar.f50408m), m47292k(cursor, hVar.f50403h), m47292k(cursor, hVar.f50404i), m47292k(cursor, hVar.f50405j), m47292k(cursor, hVar.f50406k));
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        ServerId d = mo52107d();
        long f = mo52109f();
        SQLiteStatement prepare = f50382i.prepare(writableDatabase);
        f50382i.bindWhereArg(prepare, "metro_id", d);
        f50382i.bindWhereArg(prepare, "revision", f);
        prepare.executeUpdateDelete();
        Objects.toString(d);
        StatementHelper statementHelper = f50380g;
        SQLiteStatement prepare2 = statementHelper.prepare(writableDatabase);
        statementHelper.bindWhereArg(prepare2, "metro_id", d);
        statementHelper.bindWhereArg(prepare2, "revision", f);
        prepare2.executeUpdateDelete();
        Objects.toString(d);
    }

    /* renamed from: b */
    public final void mo51798b(Configuration configuration) {
        MoovitApplication<?, ?, ?> moovitApplication = MoovitApplication.f37317k;
        if (!C20975x0.m49118e(C20943i.m49050c(configuration), (Locale) C19393f.f49325q.f49332f.mo52326c(DatabaseHelper.get(moovitApplication).getReadableDatabase(), mo52107d(), mo52109f()))) {
            DatabaseJobQueue.get().postJob(new C19833g(moovitApplication, mo52107d(), mo52109f()));
        }
    }

    /* renamed from: j */
    public final HashMap mo52130j(Context context, Collection collection) {
        Map<ServerId, C20944i0<SearchLineItem, C19835i>> o = mo52132o(context, DatabaseHelper.get(context).getReadableDatabase(), "", (TransitType) null, (TransitAgency) null, collection);
        C18277b bVar = new C18277b(1);
        HashMap hashMap = new HashMap(o.size());
        C13720d.m34275e(o, hashMap, C13720d.f33796a, bVar);
        return hashMap;
    }

    /* renamed from: n */
    public final C6302b mo52131n(Context context, Cursor cursor) {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        C19855r i = ((C19391d) this.f49320a).mo51807i();
        synchronized (i) {
            i.mo52154h(context);
            unmodifiableMap = Collections.unmodifiableMap(i.f50475c);
        }
        C19844m c = ((C19391d) this.f49320a).mo51801c();
        synchronized (c) {
            c.mo52145h(context);
            unmodifiableMap2 = Collections.unmodifiableMap(c.f50436b);
        }
        C19834h hVar = new C19834h(cursor);
        C6302b bVar = new C6302b(cursor.getCount());
        while (cursor.moveToNext()) {
            SearchLineItem l = m47293l(cursor, hVar);
            C19835i m = m47294m(cursor, hVar);
            DbEntityRef<TransitType> dbEntityRef = l.f41639d;
            if (!dbEntityRef.isResolved()) {
                dbEntityRef.resolveTo((TransitType) unmodifiableMap.get(dbEntityRef.getServerId()));
            }
            DbEntityRef<TransitAgency> dbEntityRef2 = l.f41640e;
            if (dbEntityRef2 != null && !dbEntityRef2.isResolved()) {
                dbEntityRef2.resolveTo((TransitAgency) unmodifiableMap2.get(dbEntityRef2.getServerId()));
            }
            bVar.put(l.f41637b, new C20944i0(l, m));
        }
        return bVar;
    }

    /* renamed from: o */
    public final Map<ServerId, C20944i0<SearchLineItem, C19835i>> mo52132o(Context context, SQLiteDatabase sQLiteDatabase, String str, TransitType transitType, TransitAgency transitAgency, Collection<ServerId> collection) {
        String str2;
        if (collection.isEmpty()) {
            return Collections.emptyMap();
        }
        String i = m47291i(context, str.replace('\"', ' ').trim(), transitType, transitAgency);
        ArrayList arrayList = new ArrayList(collection.size() + 3);
        arrayList.add(mo52108e());
        arrayList.add(mo52110g());
        C13720d.m34276f(collection, (C13722f) null, ServerId.f15139d, arrayList);
        if (C20964s0.m49090h(i)) {
            str2 = "SELECT search_data_id,search_data_transit_type_id,search_data_agency_id,search_data_line_number,search_data_title,search_data_subtitle,search_data_image_data FROM line_search_data WHERE line_search_data.metro_id = ? AND line_search_data.revision = ? AND line_search_data.search_data_id IN (%s);";
        } else {
            arrayList.add(i);
            str2 = "SELECT search_data_id,search_data_transit_type_id,search_data_agency_id,search_data_line_number,search_data_title,search_data_subtitle,search_data_image_data,highlight(line_search_fts, 0, '<b>', '</b>') as htt,highlight(line_search_fts, 1, '<b>', '</b>') as ha,highlight(line_search_fts, 3, '<b>', '</b>') as hc1,(CASE WHEN city1 = city2 THEN NULL ELSE highlight(line_search_fts, 4, '<b>', '</b>') END) as hc2,highlight(line_search_fts, 5, '<b>', '</b>') as ht,highlight(line_search_fts, 6, '<b>', '</b>') as hs FROM line_search_data JOIN line_search_fts ON line_search_data.rowid = line_search_fts.rowid WHERE line_search_data.metro_id = ? AND line_search_data.revision = ? AND line_search_data.search_data_id IN (%s) AND line_search_fts MATCH ?;";
        }
        Cursor rawQuery = sQLiteDatabase.rawQuery(String.format((Locale) null, str2, new Object[]{DatabaseUtils.createInClausePlaceHolders(collection.size())}), DatabaseUtils.createSelectionArgs((Collection<String>) arrayList));
        try {
            C6302b n = mo52131n(context, rawQuery);
            rawQuery.close();
            return n;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
