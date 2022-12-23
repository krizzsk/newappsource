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

public class MVGetInterstitialAdResponse implements TBase<MVGetInterstitialAdResponse, _Fields>, Serializable, Cloneable, Comparable<MVGetInterstitialAdResponse> {

    /* renamed from: b */
    public static final C25113c f25542b = new C25113c("interstitial", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f25543c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f25544d;
    public MVInterstitialAd interstitial;

    public enum _Fields implements C25085c {
        INTERSTITIAL(1, "interstitial");
        
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
            if (i != 1) {
                return null;
            }
            return INTERSTITIAL;
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

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVGetInterstitialAdResponse$a */
    public static class C8669a extends C25239c<MVGetInterstitialAdResponse> {
        public C8669a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetInterstitialAdResponse mVGetInterstitialAdResponse = (MVGetInterstitialAdResponse) tBase;
            MVInterstitialAd mVInterstitialAd = mVGetInterstitialAdResponse.interstitial;
            C25113c cVar = MVGetInterstitialAdResponse.f25542b;
            gVar.mo61687K();
            if (mVGetInterstitialAdResponse.interstitial != null) {
                gVar.mo61711x(MVGetInterstitialAdResponse.f25542b);
                mVGetInterstitialAdResponse.interstitial.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetInterstitialAdResponse mVGetInterstitialAdResponse = (MVGetInterstitialAdResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVInterstitialAd mVInterstitialAd = mVGetInterstitialAdResponse.interstitial;
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVInterstitialAd mVInterstitialAd2 = new MVInterstitialAd();
                    mVGetInterstitialAdResponse.interstitial = mVInterstitialAd2;
                    mVInterstitialAd2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVGetInterstitialAdResponse$b */
    public static class C8670b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8669a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVGetInterstitialAdResponse$c */
    public static class C8671c extends C25240d<MVGetInterstitialAdResponse> {
        public C8671c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetInterstitialAdResponse mVGetInterstitialAdResponse = (MVGetInterstitialAdResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetInterstitialAdResponse.mo27071f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVGetInterstitialAdResponse.mo27071f()) {
                mVGetInterstitialAdResponse.interstitial.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetInterstitialAdResponse mVGetInterstitialAdResponse = (MVGetInterstitialAdResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVInterstitialAd mVInterstitialAd = new MVInterstitialAd();
                mVGetInterstitialAdResponse.interstitial = mVInterstitialAd;
                mVInterstitialAd.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVGetInterstitialAdResponse$d */
    public static class C8672d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8671c(0);
        }
    }

    static {
        new C17394d0("MVGetInterstitialAdResponse");
        HashMap hashMap = new HashMap();
        f25543c = hashMap;
        hashMap.put(C25239c.class, new C8670b());
        hashMap.put(C25240d.class, new C8672d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.INTERSTITIAL, new FieldMetaData("interstitial", (byte) 3, new StructMetaData(MVInterstitialAd.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25544d = unmodifiableMap;
        FieldMetaData.m61947a(MVGetInterstitialAdResponse.class, unmodifiableMap);
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
        ((C25238b) f25543c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25543c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGetInterstitialAdResponse mVGetInterstitialAdResponse = (MVGetInterstitialAdResponse) obj;
        if (!getClass().equals(mVGetInterstitialAdResponse.getClass())) {
            return getClass().getName().compareTo(mVGetInterstitialAdResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27071f()).compareTo(Boolean.valueOf(mVGetInterstitialAdResponse.mo27071f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo27071f() || (compareTo = this.interstitial.compareTo(mVGetInterstitialAdResponse.interstitial)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetInterstitialAdResponse)) {
            return false;
        }
        MVGetInterstitialAdResponse mVGetInterstitialAdResponse = (MVGetInterstitialAdResponse) obj;
        boolean f = mo27071f();
        boolean f2 = mVGetInterstitialAdResponse.mo27071f();
        if ((f || f2) && (!f || !f2 || !this.interstitial.mo27090a(mVGetInterstitialAdResponse.interstitial))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27071f() {
        return this.interstitial != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetInterstitialAdResponse(", "interstitial:");
        MVInterstitialAd mVInterstitialAd = this.interstitial;
        if (mVInterstitialAd == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVInterstitialAd);
        }
        n.append(")");
        return n.toString();
    }
}
