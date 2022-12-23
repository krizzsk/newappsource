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

public class MVInterstitialAd implements TBase<MVInterstitialAd, _Fields>, Serializable, Cloneable, Comparable<MVInterstitialAd> {

    /* renamed from: b */
    public static final C25113c f25554b = new C25113c("id", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25555c = new C25113c("creative", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f25556d = new C25113c("analyticsData", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f25557e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25558f;
    public String analyticsData;
    public MVAdInterstitalCreative creative;

    /* renamed from: id */
    public String f25559id;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        CREATIVE(2, "creative"),
        ANALYTICS_DATA(3, "analyticsData");
        
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
                return ID;
            }
            if (i == 2) {
                return CREATIVE;
            }
            if (i != 3) {
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

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVInterstitialAd$a */
    public static class C8681a extends C25239c<MVInterstitialAd> {
        public C8681a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVInterstitialAd mVInterstitialAd = (MVInterstitialAd) tBase;
            mVInterstitialAd.getClass();
            C25113c cVar = MVInterstitialAd.f25554b;
            gVar.mo61687K();
            if (mVInterstitialAd.f25559id != null) {
                gVar.mo61711x(MVInterstitialAd.f25554b);
                gVar.mo61686J(mVInterstitialAd.f25559id);
                gVar.mo61712y();
            }
            if (mVInterstitialAd.creative != null) {
                gVar.mo61711x(MVInterstitialAd.f25555c);
                mVInterstitialAd.creative.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVInterstitialAd.analyticsData != null) {
                gVar.mo61711x(MVInterstitialAd.f25556d);
                gVar.mo61686J(mVInterstitialAd.analyticsData);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVInterstitialAd mVInterstitialAd = (MVInterstitialAd) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVInterstitialAd.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVInterstitialAd.analyticsData = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVAdInterstitalCreative mVAdInterstitalCreative = new MVAdInterstitalCreative();
                        mVInterstitialAd.creative = mVAdInterstitalCreative;
                        mVAdInterstitalCreative.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVInterstitialAd.f25559id = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVInterstitialAd$b */
    public static class C8682b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8681a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVInterstitialAd$c */
    public static class C8683c extends C25240d<MVInterstitialAd> {
        public C8683c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVInterstitialAd mVInterstitialAd = (MVInterstitialAd) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVInterstitialAd.mo27095h()) {
                bitSet.set(0);
            }
            if (mVInterstitialAd.mo27094g()) {
                bitSet.set(1);
            }
            if (mVInterstitialAd.mo27093f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVInterstitialAd.mo27095h()) {
                jVar.mo61686J(mVInterstitialAd.f25559id);
            }
            if (mVInterstitialAd.mo27094g()) {
                mVInterstitialAd.creative.mo25202X0(jVar);
            }
            if (mVInterstitialAd.mo27093f()) {
                jVar.mo61686J(mVInterstitialAd.analyticsData);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVInterstitialAd mVInterstitialAd = (MVInterstitialAd) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVInterstitialAd.f25559id = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVAdInterstitalCreative mVAdInterstitalCreative = new MVAdInterstitalCreative();
                mVInterstitialAd.creative = mVAdInterstitalCreative;
                mVAdInterstitalCreative.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVInterstitialAd.analyticsData = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVInterstitialAd$d */
    public static class C8684d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8683c(0);
        }
    }

    static {
        new C17394d0("MVInterstitialAd");
        HashMap hashMap = new HashMap();
        f25557e = hashMap;
        hashMap.put(C25239c.class, new C8682b());
        hashMap.put(C25240d.class, new C8684d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CREATIVE, new FieldMetaData("creative", (byte) 3, new StructMetaData(MVAdInterstitalCreative.class)));
        enumMap.put(_Fields.ANALYTICS_DATA, new FieldMetaData("analyticsData", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25558f = unmodifiableMap;
        FieldMetaData.m61947a(MVInterstitialAd.class, unmodifiableMap);
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
        ((C25238b) f25557e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25557e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27090a(com.tranzmate.moovit.protocol.directsales.MVInterstitialAd r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6.mo27095h()
            boolean r2 = r7.mo27095h()
            if (r1 != 0) goto L_0x0010
            if (r2 == 0) goto L_0x0020
        L_0x0010:
            if (r1 == 0) goto L_0x006e
            if (r2 != 0) goto L_0x0015
            goto L_0x006e
        L_0x0015:
            java.lang.String r1 = r6.f25559id
            java.lang.String r2 = r7.f25559id
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0020
            return r0
        L_0x0020:
            boolean r1 = r6.mo27094g()
            boolean r2 = r7.mo27094g()
            r3 = 1
            if (r1 != 0) goto L_0x002d
            if (r2 == 0) goto L_0x0051
        L_0x002d:
            if (r1 == 0) goto L_0x006e
            if (r2 != 0) goto L_0x0032
            goto L_0x006e
        L_0x0032:
            com.tranzmate.moovit.protocol.directsales.MVAdInterstitalCreative r1 = r6.creative
            com.tranzmate.moovit.protocol.directsales.MVAdInterstitalCreative r2 = r7.creative
            if (r2 == 0) goto L_0x004a
            F r4 = r1.setField_
            F r5 = r2.setField_
            if (r4 != r5) goto L_0x004d
            java.lang.Object r1 = r1.value_
            java.lang.Object r2 = r2.value_
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004d
            r1 = 1
            goto L_0x004e
        L_0x004a:
            r1.getClass()
        L_0x004d:
            r1 = 0
        L_0x004e:
            if (r1 != 0) goto L_0x0051
            return r0
        L_0x0051:
            boolean r1 = r6.mo27093f()
            boolean r2 = r7.mo27093f()
            if (r1 != 0) goto L_0x005d
            if (r2 == 0) goto L_0x006d
        L_0x005d:
            if (r1 == 0) goto L_0x006e
            if (r2 != 0) goto L_0x0062
            goto L_0x006e
        L_0x0062:
            java.lang.String r1 = r6.analyticsData
            java.lang.String r7 = r7.analyticsData
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto L_0x006d
            return r0
        L_0x006d:
            return r3
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.directsales.MVInterstitialAd.mo27090a(com.tranzmate.moovit.protocol.directsales.MVInterstitialAd):boolean");
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVInterstitialAd mVInterstitialAd = (MVInterstitialAd) obj;
        if (!getClass().equals(mVInterstitialAd.getClass())) {
            return getClass().getName().compareTo(mVInterstitialAd.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27095h()).compareTo(Boolean.valueOf(mVInterstitialAd.mo27095h()));
        if (compareTo2 != 0 || ((mo27095h() && (compareTo2 = this.f25559id.compareTo(mVInterstitialAd.f25559id)) != 0) || (compareTo2 = Boolean.valueOf(mo27094g()).compareTo(Boolean.valueOf(mVInterstitialAd.mo27094g()))) != 0 || ((mo27094g() && (compareTo2 = this.creative.compareTo(mVInterstitialAd.creative)) != 0) || (compareTo2 = Boolean.valueOf(mo27093f()).compareTo(Boolean.valueOf(mVInterstitialAd.mo27093f()))) != 0))) {
            return compareTo2;
        }
        if (!mo27093f() || (compareTo = this.analyticsData.compareTo(mVInterstitialAd.analyticsData)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVInterstitialAd)) {
            return mo27090a((MVInterstitialAd) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27093f() {
        return this.analyticsData != null;
    }

    /* renamed from: g */
    public final boolean mo27094g() {
        return this.creative != null;
    }

    /* renamed from: h */
    public final boolean mo27095h() {
        return this.f25559id != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVInterstitialAd(", "id:");
        String str = this.f25559id;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("creative:");
        MVAdInterstitalCreative mVAdInterstitalCreative = this.creative;
        if (mVAdInterstitalCreative == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAdInterstitalCreative);
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
