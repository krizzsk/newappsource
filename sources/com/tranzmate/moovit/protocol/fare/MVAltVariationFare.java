package com.tranzmate.moovit.protocol.fare;

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

public class MVAltVariationFare implements TBase<MVAltVariationFare, _Fields>, Serializable, Cloneable, Comparable<MVAltVariationFare> {

    /* renamed from: b */
    public static final C25113c f25622b = new C25113c("altVariation", (byte) 15, 1);

    /* renamed from: c */
    public static final HashMap f25623c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f25624d;
    public List<MVAltIdxWithFare> altVariation;

    public enum _Fields implements C25085c {
        ALT_VARIATION(1, "altVariation");
        
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
            return ALT_VARIATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVAltVariationFare$a */
    public static class C8727a extends C25239c<MVAltVariationFare> {
        public C8727a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAltVariationFare mVAltVariationFare = (MVAltVariationFare) tBase;
            mVAltVariationFare.getClass();
            C25113c cVar = MVAltVariationFare.f25622b;
            gVar.mo61687K();
            if (mVAltVariationFare.altVariation != null) {
                gVar.mo61711x(MVAltVariationFare.f25622b);
                gVar.mo61680D(new C25119e((byte) 12, mVAltVariationFare.altVariation.size()));
                for (MVAltIdxWithFare X0 : mVAltVariationFare.altVariation) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAltVariationFare mVAltVariationFare = (MVAltVariationFare) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAltVariationFare.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVAltVariationFare.altVariation = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVAltIdxWithFare mVAltIdxWithFare = new MVAltIdxWithFare();
                        mVAltIdxWithFare.mo25201C1(gVar);
                        mVAltVariationFare.altVariation.add(mVAltIdxWithFare);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVAltVariationFare$b */
    public static class C8728b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8727a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVAltVariationFare$c */
    public static class C8729c extends C25240d<MVAltVariationFare> {
        public C8729c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAltVariationFare mVAltVariationFare = (MVAltVariationFare) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAltVariationFare.mo27202f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVAltVariationFare.mo27202f()) {
                jVar.mo61678B(mVAltVariationFare.altVariation.size());
                for (MVAltIdxWithFare X0 : mVAltVariationFare.altVariation) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAltVariationFare mVAltVariationFare = (MVAltVariationFare) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                int i = jVar.mo61696i();
                mVAltVariationFare.altVariation = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVAltIdxWithFare mVAltIdxWithFare = new MVAltIdxWithFare();
                    mVAltIdxWithFare.mo25201C1(jVar);
                    mVAltVariationFare.altVariation.add(mVAltIdxWithFare);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVAltVariationFare$d */
    public static class C8730d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8729c(0);
        }
    }

    static {
        new C17394d0("MVAltVariationFare");
        HashMap hashMap = new HashMap();
        f25623c = hashMap;
        hashMap.put(C25239c.class, new C8728b());
        hashMap.put(C25240d.class, new C8730d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ALT_VARIATION, new FieldMetaData("altVariation", (byte) 3, new ListMetaData(new StructMetaData(MVAltIdxWithFare.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25624d = unmodifiableMap;
        FieldMetaData.m61947a(MVAltVariationFare.class, unmodifiableMap);
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
        ((C25238b) f25623c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25623c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVAltVariationFare mVAltVariationFare = (MVAltVariationFare) obj;
        if (!getClass().equals(mVAltVariationFare.getClass())) {
            return getClass().getName().compareTo(mVAltVariationFare.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27202f()).compareTo(Boolean.valueOf(mVAltVariationFare.mo27202f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo27202f() || (h = C25082a.m62844h(this.altVariation, mVAltVariationFare.altVariation)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAltVariationFare)) {
            return false;
        }
        MVAltVariationFare mVAltVariationFare = (MVAltVariationFare) obj;
        boolean f = mo27202f();
        boolean f2 = mVAltVariationFare.mo27202f();
        if ((f || f2) && (!f || !f2 || !this.altVariation.equals(mVAltVariationFare.altVariation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27202f() {
        return this.altVariation != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAltVariationFare(", "altVariation:");
        List<MVAltIdxWithFare> list = this.altVariation;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
