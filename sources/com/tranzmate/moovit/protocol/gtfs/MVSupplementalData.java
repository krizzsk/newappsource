package com.tranzmate.moovit.protocol.gtfs;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVSupplementalData implements TBase<MVSupplementalData, _Fields>, Serializable, Cloneable, Comparable<MVSupplementalData> {

    /* renamed from: b */
    public static final C25113c f25818b = new C25113c("lineGroupSummaryList", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f25819c = new C25113c("mVStopSyncedMetaDataList", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f25820d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25821e;
    public List<MVLineGroupSummary> lineGroupSummaryList;
    public List<MVStopMetaData> mVStopSyncedMetaDataList;

    public enum _Fields implements C25085c {
        LINE_GROUP_SUMMARY_LIST(1, "lineGroupSummaryList"),
        M_VSTOP_SYNCED_META_DATA_LIST(2, "mVStopSyncedMetaDataList");
        
        private static final Map<String, _Fields> byName = null;
        private final String _fieldName;
        private final short _thriftId;

        /* access modifiers changed from: public */
        static {
            byName = new HashMap();
            Iterator<E> it = EnumSet.allOf(_Fields.class).iterator();
            while (it.hasNext()) {
                _Fields _fields = (_Fields) it.next();
                byName.put(_fields.getFieldName(), _fields);
            }
        }

        private _Fields(short s, String str) {
            this._thriftId = s;
            this._fieldName = str;
        }

        public static _Fields findByName(String str) {
            return byName.get(str);
        }

        public static _Fields findByThriftId(int i) {
            if (i == 1) {
                return LINE_GROUP_SUMMARY_LIST;
            }
            if (i != 2) {
                return null;
            }
            return M_VSTOP_SYNCED_META_DATA_LIST;
        }

        public static _Fields findByThriftIdOrThrow(int i) {
            _Fields findByThriftId = findByThriftId(i);
            if (findByThriftId != null) {
                return findByThriftId;
            }
            throw new IllegalArgumentException(C25541a.m63878h("Field ", i, " doesn't exist!"));
        }

        public String getFieldName() {
            return this._fieldName;
        }

        public short getThriftFieldId() {
            return this._thriftId;
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVSupplementalData$a */
    public static class C8843a extends C25239c<MVSupplementalData> {
        public C8843a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSupplementalData mVSupplementalData = (MVSupplementalData) tBase;
            mVSupplementalData.getClass();
            C25113c cVar = MVSupplementalData.f25818b;
            gVar.mo61687K();
            if (mVSupplementalData.lineGroupSummaryList != null) {
                gVar.mo61711x(MVSupplementalData.f25818b);
                gVar.mo61680D(new C25119e((byte) 12, mVSupplementalData.lineGroupSummaryList.size()));
                for (MVLineGroupSummary X0 : mVSupplementalData.lineGroupSummaryList) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVSupplementalData.mVStopSyncedMetaDataList != null) {
                gVar.mo61711x(MVSupplementalData.f25819c);
                gVar.mo61680D(new C25119e((byte) 12, mVSupplementalData.mVStopSyncedMetaDataList.size()));
                for (MVStopMetaData X02 : mVSupplementalData.mVStopSyncedMetaDataList) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSupplementalData mVSupplementalData = (MVSupplementalData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSupplementalData.getClass();
                    return;
                }
                short s = f.f63357c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVSupplementalData.mVStopSyncedMetaDataList = new ArrayList(k.f63395b);
                        while (i < k.f63395b) {
                            MVStopMetaData mVStopMetaData = new MVStopMetaData();
                            mVStopMetaData.mo25201C1(gVar);
                            mVSupplementalData.mVStopSyncedMetaDataList.add(mVStopMetaData);
                            i++;
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k2 = gVar.mo61698k();
                    mVSupplementalData.lineGroupSummaryList = new ArrayList(k2.f63395b);
                    while (i < k2.f63395b) {
                        MVLineGroupSummary mVLineGroupSummary = new MVLineGroupSummary();
                        mVLineGroupSummary.mo25201C1(gVar);
                        mVSupplementalData.lineGroupSummaryList.add(mVLineGroupSummary);
                        i++;
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVSupplementalData$b */
    public static class C8844b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8843a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVSupplementalData$c */
    public static class C8845c extends C25240d<MVSupplementalData> {
        public C8845c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSupplementalData mVSupplementalData = (MVSupplementalData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSupplementalData.mo27545f()) {
                bitSet.set(0);
            }
            if (mVSupplementalData.mo27546g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVSupplementalData.mo27545f()) {
                jVar.mo61678B(mVSupplementalData.lineGroupSummaryList.size());
                for (MVLineGroupSummary X0 : mVSupplementalData.lineGroupSummaryList) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVSupplementalData.mo27546g()) {
                jVar.mo61678B(mVSupplementalData.mVStopSyncedMetaDataList.size());
                for (MVStopMetaData X02 : mVSupplementalData.mVStopSyncedMetaDataList) {
                    X02.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSupplementalData mVSupplementalData = (MVSupplementalData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVSupplementalData.lineGroupSummaryList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVLineGroupSummary mVLineGroupSummary = new MVLineGroupSummary();
                    mVLineGroupSummary.mo25201C1(jVar);
                    mVSupplementalData.lineGroupSummaryList.add(mVLineGroupSummary);
                }
            }
            if (T.get(1)) {
                int i3 = jVar.mo61696i();
                mVSupplementalData.mVStopSyncedMetaDataList = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVStopMetaData mVStopMetaData = new MVStopMetaData();
                    mVStopMetaData.mo25201C1(jVar);
                    mVSupplementalData.mVStopSyncedMetaDataList.add(mVStopMetaData);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVSupplementalData$d */
    public static class C8846d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8845c(0);
        }
    }

    static {
        new C17394d0("MVSupplementalData");
        HashMap hashMap = new HashMap();
        f25820d = hashMap;
        hashMap.put(C25239c.class, new C8844b());
        hashMap.put(C25240d.class, new C8846d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LINE_GROUP_SUMMARY_LIST, new FieldMetaData("lineGroupSummaryList", (byte) 3, new ListMetaData(new StructMetaData(MVLineGroupSummary.class))));
        enumMap.put(_Fields.M_VSTOP_SYNCED_META_DATA_LIST, new FieldMetaData("mVStopSyncedMetaDataList", (byte) 3, new ListMetaData(new StructMetaData(MVStopMetaData.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25821e = unmodifiableMap;
        FieldMetaData.m61947a(MVSupplementalData.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            mo25201C1(new C25112b(new C25276a((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            mo25202X0(new C25112b(new C25276a((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f25820d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25820d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo27542a(MVSupplementalData mVSupplementalData) {
        if (mVSupplementalData == null) {
            return false;
        }
        boolean f = mo27545f();
        boolean f2 = mVSupplementalData.mo27545f();
        if ((f || f2) && (!f || !f2 || !this.lineGroupSummaryList.equals(mVSupplementalData.lineGroupSummaryList))) {
            return false;
        }
        boolean g = mo27546g();
        boolean g2 = mVSupplementalData.mo27546g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.mVStopSyncedMetaDataList.equals(mVSupplementalData.mVStopSyncedMetaDataList)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVSupplementalData mVSupplementalData = (MVSupplementalData) obj;
        if (!getClass().equals(mVSupplementalData.getClass())) {
            return getClass().getName().compareTo(mVSupplementalData.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27545f()).compareTo(Boolean.valueOf(mVSupplementalData.mo27545f()));
        if (compareTo != 0 || ((mo27545f() && (compareTo = C25082a.m62844h(this.lineGroupSummaryList, mVSupplementalData.lineGroupSummaryList)) != 0) || (compareTo = Boolean.valueOf(mo27546g()).compareTo(Boolean.valueOf(mVSupplementalData.mo27546g()))) != 0)) {
            return compareTo;
        }
        if (!mo27546g() || (h = C25082a.m62844h(this.mVStopSyncedMetaDataList, mVSupplementalData.mVStopSyncedMetaDataList)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVSupplementalData)) {
            return mo27542a((MVSupplementalData) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27545f() {
        return this.lineGroupSummaryList != null;
    }

    /* renamed from: g */
    public final boolean mo27546g() {
        return this.mVStopSyncedMetaDataList != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSupplementalData(", "lineGroupSummaryList:");
        List<MVLineGroupSummary> list = this.lineGroupSummaryList;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("mVStopSyncedMetaDataList:");
        List<MVStopMetaData> list2 = this.mVStopSyncedMetaDataList;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(")");
        return n.toString();
    }
}
