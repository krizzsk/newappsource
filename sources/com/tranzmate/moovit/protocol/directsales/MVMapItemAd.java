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

public class MVMapItemAd implements TBase<MVMapItemAd, _Fields>, Serializable, Cloneable, Comparable<MVMapItemAd> {

    /* renamed from: b */
    public static final C25113c f25561b = new C25113c("id", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25562c = new C25113c("creative", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f25563d = new C25113c("analyticsId", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f25564e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25565f;
    public String analyticsId;
    public MVMapItemAdCreative creative;

    /* renamed from: id */
    public String f25566id;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        CREATIVE(2, "creative"),
        ANALYTICS_ID(3, "analyticsId");
        
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
            return ANALYTICS_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVMapItemAd$a */
    public static class C8685a extends C25239c<MVMapItemAd> {
        public C8685a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMapItemAd mVMapItemAd = (MVMapItemAd) tBase;
            mVMapItemAd.getClass();
            C25113c cVar = MVMapItemAd.f25561b;
            gVar.mo61687K();
            if (mVMapItemAd.f25566id != null) {
                gVar.mo61711x(MVMapItemAd.f25561b);
                gVar.mo61686J(mVMapItemAd.f25566id);
                gVar.mo61712y();
            }
            if (mVMapItemAd.creative != null) {
                gVar.mo61711x(MVMapItemAd.f25562c);
                mVMapItemAd.creative.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMapItemAd.analyticsId != null) {
                gVar.mo61711x(MVMapItemAd.f25563d);
                gVar.mo61686J(mVMapItemAd.analyticsId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMapItemAd mVMapItemAd = (MVMapItemAd) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMapItemAd.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVMapItemAd.analyticsId = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVMapItemAdCreative mVMapItemAdCreative = new MVMapItemAdCreative();
                        mVMapItemAd.creative = mVMapItemAdCreative;
                        mVMapItemAdCreative.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMapItemAd.f25566id = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVMapItemAd$b */
    public static class C8686b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8685a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVMapItemAd$c */
    public static class C8687c extends C25240d<MVMapItemAd> {
        public C8687c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMapItemAd mVMapItemAd = (MVMapItemAd) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMapItemAd.mo27104h()) {
                bitSet.set(0);
            }
            if (mVMapItemAd.mo27103g()) {
                bitSet.set(1);
            }
            if (mVMapItemAd.mo27102f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVMapItemAd.mo27104h()) {
                jVar.mo61686J(mVMapItemAd.f25566id);
            }
            if (mVMapItemAd.mo27103g()) {
                mVMapItemAd.creative.mo25202X0(jVar);
            }
            if (mVMapItemAd.mo27102f()) {
                jVar.mo61686J(mVMapItemAd.analyticsId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMapItemAd mVMapItemAd = (MVMapItemAd) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVMapItemAd.f25566id = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVMapItemAdCreative mVMapItemAdCreative = new MVMapItemAdCreative();
                mVMapItemAd.creative = mVMapItemAdCreative;
                mVMapItemAdCreative.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVMapItemAd.analyticsId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVMapItemAd$d */
    public static class C8688d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8687c(0);
        }
    }

    static {
        new C17394d0("MVMapItemAd");
        HashMap hashMap = new HashMap();
        f25564e = hashMap;
        hashMap.put(C25239c.class, new C8686b());
        hashMap.put(C25240d.class, new C8688d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CREATIVE, new FieldMetaData("creative", (byte) 3, new StructMetaData(MVMapItemAdCreative.class)));
        enumMap.put(_Fields.ANALYTICS_ID, new FieldMetaData("analyticsId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25565f = unmodifiableMap;
        FieldMetaData.m61947a(MVMapItemAd.class, unmodifiableMap);
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
        ((C25238b) f25564e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25564e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27099a(com.tranzmate.moovit.protocol.directsales.MVMapItemAd r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6.mo27104h()
            boolean r2 = r7.mo27104h()
            if (r1 != 0) goto L_0x0010
            if (r2 == 0) goto L_0x0020
        L_0x0010:
            if (r1 == 0) goto L_0x006e
            if (r2 != 0) goto L_0x0015
            goto L_0x006e
        L_0x0015:
            java.lang.String r1 = r6.f25566id
            java.lang.String r2 = r7.f25566id
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0020
            return r0
        L_0x0020:
            boolean r1 = r6.mo27103g()
            boolean r2 = r7.mo27103g()
            r3 = 1
            if (r1 != 0) goto L_0x002d
            if (r2 == 0) goto L_0x0051
        L_0x002d:
            if (r1 == 0) goto L_0x006e
            if (r2 != 0) goto L_0x0032
            goto L_0x006e
        L_0x0032:
            com.tranzmate.moovit.protocol.directsales.MVMapItemAdCreative r1 = r6.creative
            com.tranzmate.moovit.protocol.directsales.MVMapItemAdCreative r2 = r7.creative
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
            boolean r1 = r6.mo27102f()
            boolean r2 = r7.mo27102f()
            if (r1 != 0) goto L_0x005d
            if (r2 == 0) goto L_0x006d
        L_0x005d:
            if (r1 == 0) goto L_0x006e
            if (r2 != 0) goto L_0x0062
            goto L_0x006e
        L_0x0062:
            java.lang.String r1 = r6.analyticsId
            java.lang.String r7 = r7.analyticsId
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto L_0x006d
            return r0
        L_0x006d:
            return r3
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.directsales.MVMapItemAd.mo27099a(com.tranzmate.moovit.protocol.directsales.MVMapItemAd):boolean");
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMapItemAd mVMapItemAd = (MVMapItemAd) obj;
        if (!getClass().equals(mVMapItemAd.getClass())) {
            return getClass().getName().compareTo(mVMapItemAd.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27104h()).compareTo(Boolean.valueOf(mVMapItemAd.mo27104h()));
        if (compareTo2 != 0 || ((mo27104h() && (compareTo2 = this.f25566id.compareTo(mVMapItemAd.f25566id)) != 0) || (compareTo2 = Boolean.valueOf(mo27103g()).compareTo(Boolean.valueOf(mVMapItemAd.mo27103g()))) != 0 || ((mo27103g() && (compareTo2 = this.creative.compareTo(mVMapItemAd.creative)) != 0) || (compareTo2 = Boolean.valueOf(mo27102f()).compareTo(Boolean.valueOf(mVMapItemAd.mo27102f()))) != 0))) {
            return compareTo2;
        }
        if (!mo27102f() || (compareTo = this.analyticsId.compareTo(mVMapItemAd.analyticsId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMapItemAd)) {
            return mo27099a((MVMapItemAd) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27102f() {
        return this.analyticsId != null;
    }

    /* renamed from: g */
    public final boolean mo27103g() {
        return this.creative != null;
    }

    /* renamed from: h */
    public final boolean mo27104h() {
        return this.f25566id != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMapItemAd(", "id:");
        String str = this.f25566id;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("creative:");
        MVMapItemAdCreative mVMapItemAdCreative = this.creative;
        if (mVMapItemAdCreative == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMapItemAdCreative);
        }
        n.append(", ");
        n.append("analyticsId:");
        String str2 = this.analyticsId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
