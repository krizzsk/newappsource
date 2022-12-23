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

public class MVGetBannerAdRequest implements TBase<MVGetBannerAdRequest, _Fields>, Serializable, Cloneable, Comparable<MVGetBannerAdRequest> {

    /* renamed from: b */
    public static final C25113c f25530b = new C25113c("placementId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25531c = new C25113c("adSize", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f25532d = new C25113c("targeting", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f25533e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25534f;
    public MVAdSize adSize;
    public String placementId;
    public MVAdTargeting targeting;

    public enum _Fields implements C25085c {
        PLACEMENT_ID(1, "placementId"),
        AD_SIZE(2, "adSize"),
        TARGETING(3, "targeting");
        
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
                return AD_SIZE;
            }
            if (i != 3) {
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

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVGetBannerAdRequest$a */
    public static class C8657a extends C25239c<MVGetBannerAdRequest> {
        public C8657a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetBannerAdRequest mVGetBannerAdRequest = (MVGetBannerAdRequest) tBase;
            MVAdSize mVAdSize = mVGetBannerAdRequest.adSize;
            MVAdTargeting mVAdTargeting = mVGetBannerAdRequest.targeting;
            if (mVAdTargeting != null) {
                mVAdTargeting.mo27035h();
            }
            C25113c cVar = MVGetBannerAdRequest.f25530b;
            gVar.mo61687K();
            if (mVGetBannerAdRequest.placementId != null) {
                gVar.mo61711x(MVGetBannerAdRequest.f25530b);
                gVar.mo61686J(mVGetBannerAdRequest.placementId);
                gVar.mo61712y();
            }
            if (mVGetBannerAdRequest.adSize != null) {
                gVar.mo61711x(MVGetBannerAdRequest.f25531c);
                mVGetBannerAdRequest.adSize.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVGetBannerAdRequest.targeting != null) {
                gVar.mo61711x(MVGetBannerAdRequest.f25532d);
                mVGetBannerAdRequest.targeting.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetBannerAdRequest mVGetBannerAdRequest = (MVGetBannerAdRequest) tBase;
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
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVAdTargeting mVAdTargeting = new MVAdTargeting();
                            mVGetBannerAdRequest.targeting = mVAdTargeting;
                            mVAdTargeting.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVAdSize mVAdSize = new MVAdSize();
                        mVGetBannerAdRequest.adSize = mVAdSize;
                        mVAdSize.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVGetBannerAdRequest.placementId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVAdSize mVAdSize2 = mVGetBannerAdRequest.adSize;
            MVAdTargeting mVAdTargeting2 = mVGetBannerAdRequest.targeting;
            if (mVAdTargeting2 != null) {
                mVAdTargeting2.mo27035h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVGetBannerAdRequest$b */
    public static class C8658b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8657a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVGetBannerAdRequest$c */
    public static class C8659c extends C25240d<MVGetBannerAdRequest> {
        public C8659c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetBannerAdRequest mVGetBannerAdRequest = (MVGetBannerAdRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetBannerAdRequest.mo27051g()) {
                bitSet.set(0);
            }
            if (mVGetBannerAdRequest.mo27050f()) {
                bitSet.set(1);
            }
            if (mVGetBannerAdRequest.mo27052h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVGetBannerAdRequest.mo27051g()) {
                jVar.mo61686J(mVGetBannerAdRequest.placementId);
            }
            if (mVGetBannerAdRequest.mo27050f()) {
                mVGetBannerAdRequest.adSize.mo25202X0(jVar);
            }
            if (mVGetBannerAdRequest.mo27052h()) {
                mVGetBannerAdRequest.targeting.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetBannerAdRequest mVGetBannerAdRequest = (MVGetBannerAdRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVGetBannerAdRequest.placementId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVAdSize mVAdSize = new MVAdSize();
                mVGetBannerAdRequest.adSize = mVAdSize;
                mVAdSize.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVAdTargeting mVAdTargeting = new MVAdTargeting();
                mVGetBannerAdRequest.targeting = mVAdTargeting;
                mVAdTargeting.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVGetBannerAdRequest$d */
    public static class C8660d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8659c(0);
        }
    }

    static {
        new C17394d0("MVGetBannerAdRequest");
        HashMap hashMap = new HashMap();
        f25533e = hashMap;
        hashMap.put(C25239c.class, new C8658b());
        hashMap.put(C25240d.class, new C8660d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PLACEMENT_ID, new FieldMetaData("placementId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AD_SIZE, new FieldMetaData("adSize", (byte) 3, new StructMetaData(MVAdSize.class)));
        enumMap.put(_Fields.TARGETING, new FieldMetaData("targeting", (byte) 3, new StructMetaData(MVAdTargeting.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25534f = unmodifiableMap;
        FieldMetaData.m61947a(MVGetBannerAdRequest.class, unmodifiableMap);
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
        ((C25238b) f25533e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25533e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGetBannerAdRequest mVGetBannerAdRequest = (MVGetBannerAdRequest) obj;
        if (!getClass().equals(mVGetBannerAdRequest.getClass())) {
            return getClass().getName().compareTo(mVGetBannerAdRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27051g()).compareTo(Boolean.valueOf(mVGetBannerAdRequest.mo27051g()));
        if (compareTo2 != 0 || ((mo27051g() && (compareTo2 = this.placementId.compareTo(mVGetBannerAdRequest.placementId)) != 0) || (compareTo2 = Boolean.valueOf(mo27050f()).compareTo(Boolean.valueOf(mVGetBannerAdRequest.mo27050f()))) != 0 || ((mo27050f() && (compareTo2 = this.adSize.compareTo(mVGetBannerAdRequest.adSize)) != 0) || (compareTo2 = Boolean.valueOf(mo27052h()).compareTo(Boolean.valueOf(mVGetBannerAdRequest.mo27052h()))) != 0))) {
            return compareTo2;
        }
        if (!mo27052h() || (compareTo = this.targeting.compareTo(mVGetBannerAdRequest.targeting)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetBannerAdRequest)) {
            return false;
        }
        MVGetBannerAdRequest mVGetBannerAdRequest = (MVGetBannerAdRequest) obj;
        boolean g = mo27051g();
        boolean g2 = mVGetBannerAdRequest.mo27051g();
        if ((g || g2) && (!g || !g2 || !this.placementId.equals(mVGetBannerAdRequest.placementId))) {
            return false;
        }
        boolean f = mo27050f();
        boolean f2 = mVGetBannerAdRequest.mo27050f();
        if ((f || f2) && (!f || !f2 || !this.adSize.mo27020a(mVGetBannerAdRequest.adSize))) {
            return false;
        }
        boolean h = mo27052h();
        boolean h2 = mVGetBannerAdRequest.mo27052h();
        if ((h || h2) && (!h || !h2 || !this.targeting.mo27030a(mVGetBannerAdRequest.targeting))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27050f() {
        return this.adSize != null;
    }

    /* renamed from: g */
    public final boolean mo27051g() {
        return this.placementId != null;
    }

    /* renamed from: h */
    public final boolean mo27052h() {
        return this.targeting != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetBannerAdRequest(", "placementId:");
        String str = this.placementId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
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
