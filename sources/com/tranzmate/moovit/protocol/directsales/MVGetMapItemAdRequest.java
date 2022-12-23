package com.tranzmate.moovit.protocol.directsales;

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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVGetMapItemAdRequest implements TBase<MVGetMapItemAdRequest, _Fields>, Serializable, Cloneable, Comparable<MVGetMapItemAdRequest> {

    /* renamed from: b */
    public static final C25113c f25545b = new C25113c("placementId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25546c = new C25113c("adId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25547d = new C25113c("adSize", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f25548e = new C25113c("targeting", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f25549f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f25550g;
    public String adId;
    public MVAdSize adSize;
    public String placementId;
    public MVAdTargeting targeting;

    public enum _Fields implements C25085c {
        PLACEMENT_ID(1, "placementId"),
        AD_ID(2, "adId"),
        AD_SIZE(3, "adSize"),
        TARGETING(4, "targeting");
        
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
                return PLACEMENT_ID;
            }
            if (i == 2) {
                return AD_ID;
            }
            if (i == 3) {
                return AD_SIZE;
            }
            if (i != 4) {
                return null;
            }
            return TARGETING;
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

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVGetMapItemAdRequest$a */
    public static class C8673a extends C25239c<MVGetMapItemAdRequest> {
        public C8673a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetMapItemAdRequest mVGetMapItemAdRequest = (MVGetMapItemAdRequest) tBase;
            MVAdSize mVAdSize = mVGetMapItemAdRequest.adSize;
            MVAdTargeting mVAdTargeting = mVGetMapItemAdRequest.targeting;
            if (mVAdTargeting != null) {
                mVAdTargeting.mo27035h();
            }
            C25113c cVar = MVGetMapItemAdRequest.f25545b;
            gVar.mo61687K();
            if (mVGetMapItemAdRequest.placementId != null) {
                gVar.mo61711x(MVGetMapItemAdRequest.f25545b);
                gVar.mo61686J(mVGetMapItemAdRequest.placementId);
                gVar.mo61712y();
            }
            if (mVGetMapItemAdRequest.adId != null) {
                gVar.mo61711x(MVGetMapItemAdRequest.f25546c);
                gVar.mo61686J(mVGetMapItemAdRequest.adId);
                gVar.mo61712y();
            }
            if (mVGetMapItemAdRequest.adSize != null) {
                gVar.mo61711x(MVGetMapItemAdRequest.f25547d);
                mVGetMapItemAdRequest.adSize.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVGetMapItemAdRequest.targeting != null) {
                gVar.mo61711x(MVGetMapItemAdRequest.f25548e);
                mVGetMapItemAdRequest.targeting.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetMapItemAdRequest mVGetMapItemAdRequest = (MVGetMapItemAdRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVAdTargeting mVAdTargeting = new MVAdTargeting();
                                mVGetMapItemAdRequest.targeting = mVAdTargeting;
                                mVAdTargeting.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVAdSize mVAdSize = new MVAdSize();
                            mVGetMapItemAdRequest.adSize = mVAdSize;
                            mVAdSize.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVGetMapItemAdRequest.adId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVGetMapItemAdRequest.placementId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVAdSize mVAdSize2 = mVGetMapItemAdRequest.adSize;
            MVAdTargeting mVAdTargeting2 = mVGetMapItemAdRequest.targeting;
            if (mVAdTargeting2 != null) {
                mVAdTargeting2.mo27035h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVGetMapItemAdRequest$b */
    public static class C8674b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8673a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVGetMapItemAdRequest$c */
    public static class C8675c extends C25240d<MVGetMapItemAdRequest> {
        public C8675c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetMapItemAdRequest mVGetMapItemAdRequest = (MVGetMapItemAdRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetMapItemAdRequest.mo27079h()) {
                bitSet.set(0);
            }
            if (mVGetMapItemAdRequest.mo27077f()) {
                bitSet.set(1);
            }
            if (mVGetMapItemAdRequest.mo27078g()) {
                bitSet.set(2);
            }
            if (mVGetMapItemAdRequest.mo27081i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVGetMapItemAdRequest.mo27079h()) {
                jVar.mo61686J(mVGetMapItemAdRequest.placementId);
            }
            if (mVGetMapItemAdRequest.mo27077f()) {
                jVar.mo61686J(mVGetMapItemAdRequest.adId);
            }
            if (mVGetMapItemAdRequest.mo27078g()) {
                mVGetMapItemAdRequest.adSize.mo25202X0(jVar);
            }
            if (mVGetMapItemAdRequest.mo27081i()) {
                mVGetMapItemAdRequest.targeting.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetMapItemAdRequest mVGetMapItemAdRequest = (MVGetMapItemAdRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVGetMapItemAdRequest.placementId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVGetMapItemAdRequest.adId = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVAdSize mVAdSize = new MVAdSize();
                mVGetMapItemAdRequest.adSize = mVAdSize;
                mVAdSize.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVAdTargeting mVAdTargeting = new MVAdTargeting();
                mVGetMapItemAdRequest.targeting = mVAdTargeting;
                mVAdTargeting.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVGetMapItemAdRequest$d */
    public static class C8676d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8675c(0);
        }
    }

    static {
        new C17394d0("MVGetMapItemAdRequest");
        HashMap hashMap = new HashMap();
        f25549f = hashMap;
        hashMap.put(C25239c.class, new C8674b());
        hashMap.put(C25240d.class, new C8676d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PLACEMENT_ID, new FieldMetaData("placementId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AD_ID, new FieldMetaData("adId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AD_SIZE, new FieldMetaData("adSize", (byte) 3, new StructMetaData(MVAdSize.class)));
        enumMap.put(_Fields.TARGETING, new FieldMetaData("targeting", (byte) 3, new StructMetaData(MVAdTargeting.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25550g = unmodifiableMap;
        FieldMetaData.m61947a(MVGetMapItemAdRequest.class, unmodifiableMap);
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
        ((C25238b) f25549f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25549f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGetMapItemAdRequest mVGetMapItemAdRequest = (MVGetMapItemAdRequest) obj;
        if (!getClass().equals(mVGetMapItemAdRequest.getClass())) {
            return getClass().getName().compareTo(mVGetMapItemAdRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27079h()).compareTo(Boolean.valueOf(mVGetMapItemAdRequest.mo27079h()));
        if (compareTo2 != 0 || ((mo27079h() && (compareTo2 = this.placementId.compareTo(mVGetMapItemAdRequest.placementId)) != 0) || (compareTo2 = Boolean.valueOf(mo27077f()).compareTo(Boolean.valueOf(mVGetMapItemAdRequest.mo27077f()))) != 0 || ((mo27077f() && (compareTo2 = this.adId.compareTo(mVGetMapItemAdRequest.adId)) != 0) || (compareTo2 = Boolean.valueOf(mo27078g()).compareTo(Boolean.valueOf(mVGetMapItemAdRequest.mo27078g()))) != 0 || ((mo27078g() && (compareTo2 = this.adSize.compareTo(mVGetMapItemAdRequest.adSize)) != 0) || (compareTo2 = Boolean.valueOf(mo27081i()).compareTo(Boolean.valueOf(mVGetMapItemAdRequest.mo27081i()))) != 0)))) {
            return compareTo2;
        }
        if (!mo27081i() || (compareTo = this.targeting.compareTo(mVGetMapItemAdRequest.targeting)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetMapItemAdRequest)) {
            return false;
        }
        MVGetMapItemAdRequest mVGetMapItemAdRequest = (MVGetMapItemAdRequest) obj;
        boolean h = mo27079h();
        boolean h2 = mVGetMapItemAdRequest.mo27079h();
        if ((h || h2) && (!h || !h2 || !this.placementId.equals(mVGetMapItemAdRequest.placementId))) {
            return false;
        }
        boolean f = mo27077f();
        boolean f2 = mVGetMapItemAdRequest.mo27077f();
        if ((f || f2) && (!f || !f2 || !this.adId.equals(mVGetMapItemAdRequest.adId))) {
            return false;
        }
        boolean g = mo27078g();
        boolean g2 = mVGetMapItemAdRequest.mo27078g();
        if ((g || g2) && (!g || !g2 || !this.adSize.mo27020a(mVGetMapItemAdRequest.adSize))) {
            return false;
        }
        boolean i = mo27081i();
        boolean i2 = mVGetMapItemAdRequest.mo27081i();
        if ((i || i2) && (!i || !i2 || !this.targeting.mo27030a(mVGetMapItemAdRequest.targeting))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27077f() {
        return this.adId != null;
    }

    /* renamed from: g */
    public final boolean mo27078g() {
        return this.adSize != null;
    }

    /* renamed from: h */
    public final boolean mo27079h() {
        return this.placementId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27081i() {
        return this.targeting != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetMapItemAdRequest(", "placementId:");
        String str = this.placementId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("adId:");
        String str2 = this.adId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("adSize:");
        MVAdSize mVAdSize = this.adSize;
        if (mVAdSize == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAdSize);
        }
        n.append(", ");
        n.append("targeting:");
        MVAdTargeting mVAdTargeting = this.targeting;
        if (mVAdTargeting == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAdTargeting);
        }
        n.append(")");
        return n.toString();
    }
}
