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

public class MVBannerAd implements TBase<MVBannerAd, _Fields>, Serializable, Cloneable, Comparable<MVBannerAd> {

    /* renamed from: b */
    public static final C25113c f25523b = new C25113c("id", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25524c = new C25113c("creative", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f25525d = new C25113c("analyticsData", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f25526e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25527f;
    public String analyticsData;
    public MVAdBannerCreative creative;

    /* renamed from: id */
    public String f25528id;

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

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVBannerAd$a */
    public static class C8653a extends C25239c<MVBannerAd> {
        public C8653a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBannerAd mVBannerAd = (MVBannerAd) tBase;
            mVBannerAd.getClass();
            C25113c cVar = MVBannerAd.f25523b;
            gVar.mo61687K();
            if (mVBannerAd.f25528id != null) {
                gVar.mo61711x(MVBannerAd.f25523b);
                gVar.mo61686J(mVBannerAd.f25528id);
                gVar.mo61712y();
            }
            if (mVBannerAd.creative != null) {
                gVar.mo61711x(MVBannerAd.f25524c);
                mVBannerAd.creative.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVBannerAd.analyticsData != null) {
                gVar.mo61711x(MVBannerAd.f25525d);
                gVar.mo61686J(mVBannerAd.analyticsData);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBannerAd mVBannerAd = (MVBannerAd) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVBannerAd.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVBannerAd.analyticsData = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVAdBannerCreative mVAdBannerCreative = new MVAdBannerCreative();
                        mVBannerAd.creative = mVAdBannerCreative;
                        mVAdBannerCreative.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVBannerAd.f25528id = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVBannerAd$b */
    public static class C8654b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8653a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVBannerAd$c */
    public static class C8655c extends C25240d<MVBannerAd> {
        public C8655c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBannerAd mVBannerAd = (MVBannerAd) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVBannerAd.mo27044h()) {
                bitSet.set(0);
            }
            if (mVBannerAd.mo27043g()) {
                bitSet.set(1);
            }
            if (mVBannerAd.mo27042f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVBannerAd.mo27044h()) {
                jVar.mo61686J(mVBannerAd.f25528id);
            }
            if (mVBannerAd.mo27043g()) {
                mVBannerAd.creative.mo25202X0(jVar);
            }
            if (mVBannerAd.mo27042f()) {
                jVar.mo61686J(mVBannerAd.analyticsData);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBannerAd mVBannerAd = (MVBannerAd) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVBannerAd.f25528id = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVAdBannerCreative mVAdBannerCreative = new MVAdBannerCreative();
                mVBannerAd.creative = mVAdBannerCreative;
                mVAdBannerCreative.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVBannerAd.analyticsData = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVBannerAd$d */
    public static class C8656d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8655c(0);
        }
    }

    static {
        new C17394d0("MVBannerAd");
        HashMap hashMap = new HashMap();
        f25526e = hashMap;
        hashMap.put(C25239c.class, new C8654b());
        hashMap.put(C25240d.class, new C8656d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CREATIVE, new FieldMetaData("creative", (byte) 3, new StructMetaData(MVAdBannerCreative.class)));
        enumMap.put(_Fields.ANALYTICS_DATA, new FieldMetaData("analyticsData", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25527f = unmodifiableMap;
        FieldMetaData.m61947a(MVBannerAd.class, unmodifiableMap);
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
        ((C25238b) f25526e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25526e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27039a(com.tranzmate.moovit.protocol.directsales.MVBannerAd r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6.mo27044h()
            boolean r2 = r7.mo27044h()
            if (r1 != 0) goto L_0x0010
            if (r2 == 0) goto L_0x0020
        L_0x0010:
            if (r1 == 0) goto L_0x006e
            if (r2 != 0) goto L_0x0015
            goto L_0x006e
        L_0x0015:
            java.lang.String r1 = r6.f25528id
            java.lang.String r2 = r7.f25528id
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0020
            return r0
        L_0x0020:
            boolean r1 = r6.mo27043g()
            boolean r2 = r7.mo27043g()
            r3 = 1
            if (r1 != 0) goto L_0x002d
            if (r2 == 0) goto L_0x0051
        L_0x002d:
            if (r1 == 0) goto L_0x006e
            if (r2 != 0) goto L_0x0032
            goto L_0x006e
        L_0x0032:
            com.tranzmate.moovit.protocol.directsales.MVAdBannerCreative r1 = r6.creative
            com.tranzmate.moovit.protocol.directsales.MVAdBannerCreative r2 = r7.creative
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
            boolean r1 = r6.mo27042f()
            boolean r2 = r7.mo27042f()
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
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.directsales.MVBannerAd.mo27039a(com.tranzmate.moovit.protocol.directsales.MVBannerAd):boolean");
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVBannerAd mVBannerAd = (MVBannerAd) obj;
        if (!getClass().equals(mVBannerAd.getClass())) {
            return getClass().getName().compareTo(mVBannerAd.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27044h()).compareTo(Boolean.valueOf(mVBannerAd.mo27044h()));
        if (compareTo2 != 0 || ((mo27044h() && (compareTo2 = this.f25528id.compareTo(mVBannerAd.f25528id)) != 0) || (compareTo2 = Boolean.valueOf(mo27043g()).compareTo(Boolean.valueOf(mVBannerAd.mo27043g()))) != 0 || ((mo27043g() && (compareTo2 = this.creative.compareTo(mVBannerAd.creative)) != 0) || (compareTo2 = Boolean.valueOf(mo27042f()).compareTo(Boolean.valueOf(mVBannerAd.mo27042f()))) != 0))) {
            return compareTo2;
        }
        if (!mo27042f() || (compareTo = this.analyticsData.compareTo(mVBannerAd.analyticsData)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVBannerAd)) {
            return mo27039a((MVBannerAd) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27042f() {
        return this.analyticsData != null;
    }

    /* renamed from: g */
    public final boolean mo27043g() {
        return this.creative != null;
    }

    /* renamed from: h */
    public final boolean mo27044h() {
        return this.f25528id != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVBannerAd(", "id:");
        String str = this.f25528id;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("creative:");
        MVAdBannerCreative mVAdBannerCreative = this.creative;
        if (mVAdBannerCreative == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAdBannerCreative);
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
