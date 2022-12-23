package com.tranzmate.moovit.protocol.mapitems;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVDirectAdMetaData implements TBase<MVDirectAdMetaData, _Fields>, Serializable, Cloneable, Comparable<MVDirectAdMetaData> {

    /* renamed from: b */
    public static final C25113c f26262b = new C25113c("adId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26263c = new C25113c("analyticsData", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f26264d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26265e;
    public String adId;
    public String analyticsData;

    public enum _Fields implements C25085c {
        AD_ID(1, "adId"),
        ANALYTICS_DATA(2, "analyticsData");
        
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
                return AD_ID;
            }
            if (i != 2) {
                return null;
            }
            return ANALYTICS_DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDirectAdMetaData$a */
    public static class C9069a extends C25239c<MVDirectAdMetaData> {
        public C9069a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDirectAdMetaData mVDirectAdMetaData = (MVDirectAdMetaData) tBase;
            mVDirectAdMetaData.getClass();
            C25113c cVar = MVDirectAdMetaData.f26262b;
            gVar.mo61687K();
            if (mVDirectAdMetaData.adId != null) {
                gVar.mo61711x(MVDirectAdMetaData.f26262b);
                gVar.mo61686J(mVDirectAdMetaData.adId);
                gVar.mo61712y();
            }
            if (mVDirectAdMetaData.analyticsData != null) {
                gVar.mo61711x(MVDirectAdMetaData.f26263c);
                gVar.mo61686J(mVDirectAdMetaData.analyticsData);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDirectAdMetaData mVDirectAdMetaData = (MVDirectAdMetaData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDirectAdMetaData.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVDirectAdMetaData.analyticsData = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVDirectAdMetaData.adId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDirectAdMetaData$b */
    public static class C9070b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9069a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDirectAdMetaData$c */
    public static class C9071c extends C25240d<MVDirectAdMetaData> {
        public C9071c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDirectAdMetaData mVDirectAdMetaData = (MVDirectAdMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDirectAdMetaData.mo28243f()) {
                bitSet.set(0);
            }
            if (mVDirectAdMetaData.mo28244g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVDirectAdMetaData.mo28243f()) {
                jVar.mo61686J(mVDirectAdMetaData.adId);
            }
            if (mVDirectAdMetaData.mo28244g()) {
                jVar.mo61686J(mVDirectAdMetaData.analyticsData);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDirectAdMetaData mVDirectAdMetaData = (MVDirectAdMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVDirectAdMetaData.adId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVDirectAdMetaData.analyticsData = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDirectAdMetaData$d */
    public static class C9072d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9071c(0);
        }
    }

    static {
        new C17394d0("MVDirectAdMetaData");
        HashMap hashMap = new HashMap();
        f26264d = hashMap;
        hashMap.put(C25239c.class, new C9070b());
        hashMap.put(C25240d.class, new C9072d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.AD_ID, new FieldMetaData("adId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ANALYTICS_DATA, new FieldMetaData("analyticsData", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26265e = unmodifiableMap;
        FieldMetaData.m61947a(MVDirectAdMetaData.class, unmodifiableMap);
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
        ((C25238b) f26264d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26264d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVDirectAdMetaData mVDirectAdMetaData = (MVDirectAdMetaData) obj;
        if (!getClass().equals(mVDirectAdMetaData.getClass())) {
            return getClass().getName().compareTo(mVDirectAdMetaData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28243f()).compareTo(Boolean.valueOf(mVDirectAdMetaData.mo28243f()));
        if (compareTo2 != 0 || ((mo28243f() && (compareTo2 = this.adId.compareTo(mVDirectAdMetaData.adId)) != 0) || (compareTo2 = Boolean.valueOf(mo28244g()).compareTo(Boolean.valueOf(mVDirectAdMetaData.mo28244g()))) != 0)) {
            return compareTo2;
        }
        if (!mo28244g() || (compareTo = this.analyticsData.compareTo(mVDirectAdMetaData.analyticsData)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDirectAdMetaData)) {
            return false;
        }
        MVDirectAdMetaData mVDirectAdMetaData = (MVDirectAdMetaData) obj;
        boolean f = mo28243f();
        boolean f2 = mVDirectAdMetaData.mo28243f();
        if ((f || f2) && (!f || !f2 || !this.adId.equals(mVDirectAdMetaData.adId))) {
            return false;
        }
        boolean g = mo28244g();
        boolean g2 = mVDirectAdMetaData.mo28244g();
        if ((g || g2) && (!g || !g2 || !this.analyticsData.equals(mVDirectAdMetaData.analyticsData))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28243f() {
        return this.adId != null;
    }

    /* renamed from: g */
    public final boolean mo28244g() {
        return this.analyticsData != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDirectAdMetaData(", "adId:");
        String str = this.adId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("analyticsData:");
        String str2 = this.analyticsData;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
