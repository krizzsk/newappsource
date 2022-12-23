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

public class MVGetInterstitialAdRequest implements TBase<MVGetInterstitialAdRequest, _Fields>, Serializable, Cloneable, Comparable<MVGetInterstitialAdRequest> {

    /* renamed from: b */
    public static final C25113c f25538b = new C25113c("placementId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25539c = new C25113c("targeting", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f25540d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25541e;
    public String placementId;
    public MVAdTargeting targeting;

    public enum _Fields implements C25085c {
        PLACEMENT_ID(1, "placementId"),
        TARGETING(2, "targeting");
        
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
            if (i != 2) {
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

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVGetInterstitialAdRequest$a */
    public static class C8665a extends C25239c<MVGetInterstitialAdRequest> {
        public C8665a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetInterstitialAdRequest mVGetInterstitialAdRequest = (MVGetInterstitialAdRequest) tBase;
            MVAdTargeting mVAdTargeting = mVGetInterstitialAdRequest.targeting;
            if (mVAdTargeting != null) {
                mVAdTargeting.mo27035h();
            }
            C25113c cVar = MVGetInterstitialAdRequest.f25538b;
            gVar.mo61687K();
            if (mVGetInterstitialAdRequest.placementId != null) {
                gVar.mo61711x(MVGetInterstitialAdRequest.f25538b);
                gVar.mo61686J(mVGetInterstitialAdRequest.placementId);
                gVar.mo61712y();
            }
            if (mVGetInterstitialAdRequest.targeting != null) {
                gVar.mo61711x(MVGetInterstitialAdRequest.f25539c);
                mVGetInterstitialAdRequest.targeting.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetInterstitialAdRequest mVGetInterstitialAdRequest = (MVGetInterstitialAdRequest) tBase;
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
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVAdTargeting mVAdTargeting = new MVAdTargeting();
                        mVGetInterstitialAdRequest.targeting = mVAdTargeting;
                        mVAdTargeting.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVGetInterstitialAdRequest.placementId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVAdTargeting mVAdTargeting2 = mVGetInterstitialAdRequest.targeting;
            if (mVAdTargeting2 != null) {
                mVAdTargeting2.mo27035h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVGetInterstitialAdRequest$b */
    public static class C8666b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8665a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVGetInterstitialAdRequest$c */
    public static class C8667c extends C25240d<MVGetInterstitialAdRequest> {
        public C8667c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetInterstitialAdRequest mVGetInterstitialAdRequest = (MVGetInterstitialAdRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetInterstitialAdRequest.mo27064f()) {
                bitSet.set(0);
            }
            if (mVGetInterstitialAdRequest.mo27065g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVGetInterstitialAdRequest.mo27064f()) {
                jVar.mo61686J(mVGetInterstitialAdRequest.placementId);
            }
            if (mVGetInterstitialAdRequest.mo27065g()) {
                mVGetInterstitialAdRequest.targeting.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetInterstitialAdRequest mVGetInterstitialAdRequest = (MVGetInterstitialAdRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVGetInterstitialAdRequest.placementId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVAdTargeting mVAdTargeting = new MVAdTargeting();
                mVGetInterstitialAdRequest.targeting = mVAdTargeting;
                mVAdTargeting.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVGetInterstitialAdRequest$d */
    public static class C8668d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8667c(0);
        }
    }

    static {
        new C17394d0("MVGetInterstitialAdRequest");
        HashMap hashMap = new HashMap();
        f25540d = hashMap;
        hashMap.put(C25239c.class, new C8666b());
        hashMap.put(C25240d.class, new C8668d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PLACEMENT_ID, new FieldMetaData("placementId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TARGETING, new FieldMetaData("targeting", (byte) 3, new StructMetaData(MVAdTargeting.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25541e = unmodifiableMap;
        FieldMetaData.m61947a(MVGetInterstitialAdRequest.class, unmodifiableMap);
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
        ((C25238b) f25540d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25540d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGetInterstitialAdRequest mVGetInterstitialAdRequest = (MVGetInterstitialAdRequest) obj;
        if (!getClass().equals(mVGetInterstitialAdRequest.getClass())) {
            return getClass().getName().compareTo(mVGetInterstitialAdRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27064f()).compareTo(Boolean.valueOf(mVGetInterstitialAdRequest.mo27064f()));
        if (compareTo2 != 0 || ((mo27064f() && (compareTo2 = this.placementId.compareTo(mVGetInterstitialAdRequest.placementId)) != 0) || (compareTo2 = Boolean.valueOf(mo27065g()).compareTo(Boolean.valueOf(mVGetInterstitialAdRequest.mo27065g()))) != 0)) {
            return compareTo2;
        }
        if (!mo27065g() || (compareTo = this.targeting.compareTo(mVGetInterstitialAdRequest.targeting)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetInterstitialAdRequest)) {
            return false;
        }
        MVGetInterstitialAdRequest mVGetInterstitialAdRequest = (MVGetInterstitialAdRequest) obj;
        boolean f = mo27064f();
        boolean f2 = mVGetInterstitialAdRequest.mo27064f();
        if ((f || f2) && (!f || !f2 || !this.placementId.equals(mVGetInterstitialAdRequest.placementId))) {
            return false;
        }
        boolean g = mo27065g();
        boolean g2 = mVGetInterstitialAdRequest.mo27065g();
        if ((g || g2) && (!g || !g2 || !this.targeting.mo27030a(mVGetInterstitialAdRequest.targeting))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27064f() {
        return this.placementId != null;
    }

    /* renamed from: g */
    public final boolean mo27065g() {
        return this.targeting != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetInterstitialAdRequest(", "placementId:");
        String str = this.placementId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
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
