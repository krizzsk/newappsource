package p243s2;

import android.database.Cursor;
import com.appsflyer.share.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p281v2.C6846a;

/* renamed from: s2.d */
public final class C6421d {

    /* renamed from: a */
    public final String f20086a;

    /* renamed from: b */
    public final Map<String, C6422a> f20087b;

    /* renamed from: c */
    public final Set<C6423b> f20088c;

    /* renamed from: d */
    public final Set<C6425d> f20089d;

    /* renamed from: s2.d$a */
    public static final class C6422a {

        /* renamed from: a */
        public final String f20090a;

        /* renamed from: b */
        public final String f20091b;

        /* renamed from: c */
        public final int f20092c;

        /* renamed from: d */
        public final boolean f20093d;

        /* renamed from: e */
        public final int f20094e;

        /* renamed from: f */
        public final String f20095f;

        /* renamed from: g */
        public final int f20096g;

        public C6422a(int i, String str, String str2, String str3, boolean z, int i2) {
            this.f20090a = str;
            this.f20091b = str2;
            this.f20093d = z;
            this.f20094e = i;
            int i3 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i3 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i3 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f20092c = i3;
            this.f20095f = str3;
            this.f20096g = i2;
        }

        public final boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6422a)) {
                return false;
            }
            C6422a aVar = (C6422a) obj;
            if (this.f20094e != aVar.f20094e || !this.f20090a.equals(aVar.f20090a) || this.f20093d != aVar.f20093d) {
                return false;
            }
            if (this.f20096g == 1 && aVar.f20096g == 2 && (str3 = this.f20095f) != null && !str3.equals(aVar.f20095f)) {
                return false;
            }
            if (this.f20096g == 2 && aVar.f20096g == 1 && (str2 = aVar.f20095f) != null && !str2.equals(this.f20095f)) {
                return false;
            }
            int i = this.f20096g;
            if ((i == 0 || i != aVar.f20096g || ((str = this.f20095f) == null ? aVar.f20095f == null : str.equals(aVar.f20095f))) && this.f20092c == aVar.f20092c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int hashCode = ((this.f20090a.hashCode() * 31) + this.f20092c) * 31;
            if (this.f20093d) {
                i = 1231;
            } else {
                i = 1237;
            }
            return ((hashCode + i) * 31) + this.f20094e;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("Column{name='");
            C25541a.m63890u(k, this.f20090a, '\'', ", type='");
            C25541a.m63890u(k, this.f20091b, '\'', ", affinity='");
            k.append(this.f20092c);
            k.append('\'');
            k.append(", notNull=");
            k.append(this.f20093d);
            k.append(", primaryKeyPosition=");
            k.append(this.f20094e);
            k.append(", defaultValue='");
            k.append(this.f20095f);
            k.append('\'');
            k.append('}');
            return k.toString();
        }
    }

    /* renamed from: s2.d$b */
    public static final class C6423b {

        /* renamed from: a */
        public final String f20097a;

        /* renamed from: b */
        public final String f20098b;

        /* renamed from: c */
        public final String f20099c;

        /* renamed from: d */
        public final List<String> f20100d;

        /* renamed from: e */
        public final List<String> f20101e;

        public C6423b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f20097a = str;
            this.f20098b = str2;
            this.f20099c = str3;
            this.f20100d = Collections.unmodifiableList(list);
            this.f20101e = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6423b)) {
                return false;
            }
            C6423b bVar = (C6423b) obj;
            if (this.f20097a.equals(bVar.f20097a) && this.f20098b.equals(bVar.f20098b) && this.f20099c.equals(bVar.f20099c) && this.f20100d.equals(bVar.f20100d)) {
                return this.f20101e.equals(bVar.f20101e);
            }
            return false;
        }

        public final int hashCode() {
            int d = C13715c.m34238d(this.f20099c, C13715c.m34238d(this.f20098b, this.f20097a.hashCode() * 31, 31), 31);
            return this.f20101e.hashCode() + ((this.f20100d.hashCode() + d) * 31);
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("ForeignKey{referenceTable='");
            C25541a.m63890u(k, this.f20097a, '\'', ", onDelete='");
            C25541a.m63890u(k, this.f20098b, '\'', ", onUpdate='");
            C25541a.m63890u(k, this.f20099c, '\'', ", columnNames=");
            k.append(this.f20100d);
            k.append(", referenceColumnNames=");
            return C13555b.m33970i(k, this.f20101e, '}');
        }
    }

    /* renamed from: s2.d$c */
    public static class C6424c implements Comparable<C6424c> {

        /* renamed from: b */
        public final int f20102b;

        /* renamed from: c */
        public final int f20103c;

        /* renamed from: d */
        public final String f20104d;

        /* renamed from: e */
        public final String f20105e;

        public C6424c(int i, int i2, String str, String str2) {
            this.f20102b = i;
            this.f20103c = i2;
            this.f20104d = str;
            this.f20105e = str2;
        }

        public final int compareTo(Object obj) {
            C6424c cVar = (C6424c) obj;
            int i = this.f20102b - cVar.f20102b;
            if (i == 0) {
                return this.f20103c - cVar.f20103c;
            }
            return i;
        }
    }

    /* renamed from: s2.d$d */
    public static final class C6425d {

        /* renamed from: a */
        public final String f20106a;

        /* renamed from: b */
        public final boolean f20107b;

        /* renamed from: c */
        public final List<String> f20108c;

        public C6425d(List list, String str, boolean z) {
            this.f20106a = str;
            this.f20107b = z;
            this.f20108c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6425d)) {
                return false;
            }
            C6425d dVar = (C6425d) obj;
            if (this.f20107b != dVar.f20107b || !this.f20108c.equals(dVar.f20108c)) {
                return false;
            }
            if (this.f20106a.startsWith("index_")) {
                return dVar.f20106a.startsWith("index_");
            }
            return this.f20106a.equals(dVar.f20106a);
        }

        public final int hashCode() {
            int i;
            if (this.f20106a.startsWith("index_")) {
                i = -1184239155;
            } else {
                i = this.f20106a.hashCode();
            }
            return this.f20108c.hashCode() + (((i * 31) + (this.f20107b ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("Index{name='");
            C25541a.m63890u(k, this.f20106a, '\'', ", unique=");
            k.append(this.f20107b);
            k.append(", columns=");
            return C13555b.m33970i(k, this.f20108c, '}');
        }
    }

    public C6421d(String str, HashMap hashMap, HashSet hashSet, HashSet hashSet2) {
        Set<C6425d> set;
        this.f20086a = str;
        this.f20087b = Collections.unmodifiableMap(hashMap);
        this.f20088c = Collections.unmodifiableSet(hashSet);
        if (hashSet2 == null) {
            set = null;
        } else {
            set = Collections.unmodifiableSet(hashSet2);
        }
        this.f20089d = set;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static C6421d m15329a(C6846a aVar, String str) {
        boolean z;
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        boolean z2;
        C6846a aVar2 = aVar;
        String str2 = str;
        Cursor f = aVar2.mo23088f("PRAGMA table_info(`" + str2 + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (f.getColumnCount() > 0) {
                int columnIndex = f.getColumnIndex("name");
                int columnIndex2 = f.getColumnIndex("type");
                int columnIndex3 = f.getColumnIndex("notnull");
                int columnIndex4 = f.getColumnIndex("pk");
                int columnIndex5 = f.getColumnIndex("dflt_value");
                while (f.moveToNext()) {
                    String string = f.getString(columnIndex);
                    String string2 = f.getString(columnIndex2);
                    if (f.getInt(columnIndex3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C6422a aVar3 = r14;
                    C6422a aVar4 = new C6422a(f.getInt(columnIndex4), string, string2, f.getString(columnIndex5), z2, 2);
                    hashMap.put(string, aVar4);
                }
            }
            f.close();
            HashSet hashSet = new HashSet();
            Cursor f2 = aVar2.mo23088f("PRAGMA foreign_key_list(`" + str2 + "`)");
            try {
                int columnIndex6 = f2.getColumnIndex("id");
                int columnIndex7 = f2.getColumnIndex("seq");
                int columnIndex8 = f2.getColumnIndex("table");
                int columnIndex9 = f2.getColumnIndex("on_delete");
                int columnIndex10 = f2.getColumnIndex("on_update");
                ArrayList b = m15330b(f2);
                int count = f2.getCount();
                int i4 = 0;
                while (i4 < count) {
                    f2.moveToPosition(i4);
                    if (f2.getInt(columnIndex7) != 0) {
                        i3 = columnIndex6;
                        i2 = columnIndex7;
                        arrayList = b;
                        i = count;
                    } else {
                        int i5 = f2.getInt(columnIndex6);
                        i3 = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        i2 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = b.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList4 = b;
                            C6424c cVar = (C6424c) it.next();
                            int i6 = count;
                            if (cVar.f20102b == i5) {
                                arrayList2.add(cVar.f20104d);
                                arrayList3.add(cVar.f20105e);
                            }
                            b = arrayList4;
                            count = i6;
                        }
                        arrayList = b;
                        i = count;
                        hashSet.add(new C6423b(f2.getString(columnIndex8), f2.getString(columnIndex9), f2.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i4++;
                    columnIndex6 = i3;
                    columnIndex7 = i2;
                    b = arrayList;
                    count = i;
                }
                f2.close();
                Cursor f3 = aVar2.mo23088f("PRAGMA index_list(`" + str2 + "`)");
                try {
                    int columnIndex11 = f3.getColumnIndex("name");
                    int columnIndex12 = f3.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                    int columnIndex13 = f3.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1) {
                        if (columnIndex13 != -1) {
                            HashSet hashSet3 = new HashSet();
                            while (f3.moveToNext()) {
                                if (Constants.URL_CAMPAIGN.equals(f3.getString(columnIndex12))) {
                                    String string3 = f3.getString(columnIndex11);
                                    if (f3.getInt(columnIndex13) == 1) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    C6425d c = m15331c(aVar2, string3, z);
                                    if (c != null) {
                                        hashSet3.add(c);
                                    }
                                }
                            }
                            f3.close();
                            hashSet2 = hashSet3;
                            return new C6421d(str2, hashMap, hashSet, hashSet2);
                        }
                    }
                    return new C6421d(str2, hashMap, hashSet, hashSet2);
                } finally {
                    f3.close();
                }
            } catch (Throwable th) {
                f2.close();
                throw th;
            }
        } catch (Throwable th2) {
            f.close();
            throw th2;
        }
    }

    /* renamed from: b */
    public static ArrayList m15330b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C6424c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static C6425d m15331c(C6846a aVar, String str, boolean z) {
        Cursor f = aVar.mo23088f("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = f.getColumnIndex("seqno");
            int columnIndex2 = f.getColumnIndex(com.appboy.Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY);
            int columnIndex3 = f.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (f.moveToNext()) {
                        if (f.getInt(columnIndex2) >= 0) {
                            int i = f.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), f.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    C6425d dVar = new C6425d(arrayList, str, z);
                    f.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            f.close();
        }
    }

    public final boolean equals(Object obj) {
        Set<C6425d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6421d)) {
            return false;
        }
        C6421d dVar = (C6421d) obj;
        String str = this.f20086a;
        if (str == null ? dVar.f20086a != null : !str.equals(dVar.f20086a)) {
            return false;
        }
        Map<String, C6422a> map = this.f20087b;
        if (map == null ? dVar.f20087b != null : !map.equals(dVar.f20087b)) {
            return false;
        }
        Set<C6423b> set2 = this.f20088c;
        if (set2 == null ? dVar.f20088c != null : !set2.equals(dVar.f20088c)) {
            return false;
        }
        Set<C6425d> set3 = this.f20089d;
        if (set3 == null || (set = dVar.f20089d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f20086a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Map<String, C6422a> map = this.f20087b;
        if (map != null) {
            i2 = map.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Set<C6423b> set = this.f20088c;
        if (set != null) {
            i3 = set.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TableInfo{name='");
        C25541a.m63890u(k, this.f20086a, '\'', ", columns=");
        k.append(this.f20087b);
        k.append(", foreignKeys=");
        k.append(this.f20088c);
        k.append(", indices=");
        k.append(this.f20089d);
        k.append('}');
        return k.toString();
    }
}
