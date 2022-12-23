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
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
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

public class MVCommercialData implements TBase<MVCommercialData, _Fields>, Serializable, Cloneable, Comparable<MVCommercialData> {

    /* renamed from: b */
    public static final C25113c f26248b = new C25113c("commercialId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26249c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26250d = new C25113c("commercialText", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f26251e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f26252f;
    private byte __isset_bitfield = 0;
    public int commercialId;
    public String commercialText;
    public String title;

    public enum _Fields implements C25085c {
        COMMERCIAL_ID(1, "commercialId"),
        TITLE(2, "title"),
        COMMERCIAL_TEXT(3, "commercialText");
        
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
                return COMMERCIAL_ID;
            }
            if (i == 2) {
                return TITLE;
            }
            if (i != 3) {
                return null;
            }
            return COMMERCIAL_TEXT;
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCommercialData$a */
    public static class C9053a extends C25239c<MVCommercialData> {
        public C9053a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCommercialData mVCommercialData = (MVCommercialData) tBase;
            mVCommercialData.getClass();
            C25113c cVar = MVCommercialData.f26248b;
            gVar.mo61687K();
            gVar.mo61711x(MVCommercialData.f26248b);
            gVar.mo61678B(mVCommercialData.commercialId);
            gVar.mo61712y();
            if (mVCommercialData.title != null) {
                gVar.mo61711x(MVCommercialData.f26249c);
                gVar.mo61686J(mVCommercialData.title);
                gVar.mo61712y();
            }
            if (mVCommercialData.commercialText != null) {
                gVar.mo61711x(MVCommercialData.f26250d);
                gVar.mo61686J(mVCommercialData.commercialText);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCommercialData mVCommercialData = (MVCommercialData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCommercialData.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVCommercialData.commercialText = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVCommercialData.title = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVCommercialData.commercialId = gVar.mo61696i();
                    mVCommercialData.mo28218i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCommercialData$b */
    public static class C9054b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9053a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCommercialData$c */
    public static class C9055c extends C25240d<MVCommercialData> {
        public C9055c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCommercialData mVCommercialData = (MVCommercialData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCommercialData.mo28214f()) {
                bitSet.set(0);
            }
            if (mVCommercialData.mo28216h()) {
                bitSet.set(1);
            }
            if (mVCommercialData.mo28215g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVCommercialData.mo28214f()) {
                jVar.mo61678B(mVCommercialData.commercialId);
            }
            if (mVCommercialData.mo28216h()) {
                jVar.mo61686J(mVCommercialData.title);
            }
            if (mVCommercialData.mo28215g()) {
                jVar.mo61686J(mVCommercialData.commercialText);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCommercialData mVCommercialData = (MVCommercialData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVCommercialData.commercialId = jVar.mo61696i();
                mVCommercialData.mo28218i();
            }
            if (T.get(1)) {
                mVCommercialData.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVCommercialData.commercialText = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCommercialData$d */
    public static class C9056d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9055c(0);
        }
    }

    static {
        new C17394d0("MVCommercialData");
        HashMap hashMap = new HashMap();
        f26251e = hashMap;
        hashMap.put(C25239c.class, new C9054b());
        hashMap.put(C25240d.class, new C9056d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.COMMERCIAL_ID, new FieldMetaData("commercialId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.COMMERCIAL_TEXT, new FieldMetaData("commercialText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26252f = unmodifiableMap;
        FieldMetaData.m61947a(MVCommercialData.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
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
        ((C25238b) f26251e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26251e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCommercialData mVCommercialData = (MVCommercialData) obj;
        if (!getClass().equals(mVCommercialData.getClass())) {
            return getClass().getName().compareTo(mVCommercialData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28214f()).compareTo(Boolean.valueOf(mVCommercialData.mo28214f()));
        if (compareTo2 != 0 || ((mo28214f() && (compareTo2 = C25082a.m62839c(this.commercialId, mVCommercialData.commercialId)) != 0) || (compareTo2 = Boolean.valueOf(mo28216h()).compareTo(Boolean.valueOf(mVCommercialData.mo28216h()))) != 0 || ((mo28216h() && (compareTo2 = this.title.compareTo(mVCommercialData.title)) != 0) || (compareTo2 = Boolean.valueOf(mo28215g()).compareTo(Boolean.valueOf(mVCommercialData.mo28215g()))) != 0))) {
            return compareTo2;
        }
        if (!mo28215g() || (compareTo = this.commercialText.compareTo(mVCommercialData.commercialText)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCommercialData)) {
            return false;
        }
        MVCommercialData mVCommercialData = (MVCommercialData) obj;
        if (this.commercialId != mVCommercialData.commercialId) {
            return false;
        }
        boolean h = mo28216h();
        boolean h2 = mVCommercialData.mo28216h();
        if ((h || h2) && (!h || !h2 || !this.title.equals(mVCommercialData.title))) {
            return false;
        }
        boolean g = mo28215g();
        boolean g2 = mVCommercialData.mo28215g();
        if ((g || g2) && (!g || !g2 || !this.commercialText.equals(mVCommercialData.commercialText))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28214f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo28215g() {
        return this.commercialText != null;
    }

    /* renamed from: h */
    public final boolean mo28216h() {
        return this.title != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo28218i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCommercialData(", "commercialId:");
        C0016g.m42z(n, this.commercialId, ", ", "title:");
        String str = this.title;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("commercialText:");
        String str2 = this.commercialText;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
