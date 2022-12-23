package com.tranzmate.moovit.protocol.common;

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
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
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

public class MVImageReferenceWithPartialParams implements TBase<MVImageReferenceWithPartialParams, _Fields>, Serializable, Cloneable, Comparable<MVImageReferenceWithPartialParams> {

    /* renamed from: b */
    public static final C25113c f25060b = new C25113c("imageId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25061c = new C25113c("params", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f25062d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25063e;
    private byte __isset_bitfield = 0;
    public int imageId;
    public List<String> params;

    public enum _Fields implements C25085c {
        IMAGE_ID(1, "imageId"),
        PARAMS(2, "params");
        
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
                return IMAGE_ID;
            }
            if (i != 2) {
                return null;
            }
            return PARAMS;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceWithPartialParams$a */
    public static class C8440a extends C25239c<MVImageReferenceWithPartialParams> {
        public C8440a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams = (MVImageReferenceWithPartialParams) tBase;
            mVImageReferenceWithPartialParams.getClass();
            C25113c cVar = MVImageReferenceWithPartialParams.f25060b;
            gVar.mo61687K();
            gVar.mo61711x(MVImageReferenceWithPartialParams.f25060b);
            gVar.mo61678B(mVImageReferenceWithPartialParams.imageId);
            gVar.mo61712y();
            if (mVImageReferenceWithPartialParams.params != null) {
                gVar.mo61711x(MVImageReferenceWithPartialParams.f25061c);
                gVar.mo61680D(new C25119e((byte) 11, mVImageReferenceWithPartialParams.params.size()));
                for (String J : mVImageReferenceWithPartialParams.params) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams = (MVImageReferenceWithPartialParams) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVImageReferenceWithPartialParams.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVImageReferenceWithPartialParams.params = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            mVImageReferenceWithPartialParams.params.add(gVar.mo61704q());
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVImageReferenceWithPartialParams.imageId = gVar.mo61696i();
                    mVImageReferenceWithPartialParams.mo26259h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceWithPartialParams$b */
    public static class C8441b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8440a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceWithPartialParams$c */
    public static class C8442c extends C25240d<MVImageReferenceWithPartialParams> {
        public C8442c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams = (MVImageReferenceWithPartialParams) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVImageReferenceWithPartialParams.mo26257f()) {
                bitSet.set(0);
            }
            if (mVImageReferenceWithPartialParams.mo26258g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVImageReferenceWithPartialParams.mo26257f()) {
                jVar.mo61678B(mVImageReferenceWithPartialParams.imageId);
            }
            if (mVImageReferenceWithPartialParams.mo26258g()) {
                jVar.mo61678B(mVImageReferenceWithPartialParams.params.size());
                for (String J : mVImageReferenceWithPartialParams.params) {
                    jVar.mo61686J(J);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams = (MVImageReferenceWithPartialParams) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVImageReferenceWithPartialParams.imageId = jVar.mo61696i();
                mVImageReferenceWithPartialParams.mo26259h();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVImageReferenceWithPartialParams.params = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVImageReferenceWithPartialParams.params.add(jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceWithPartialParams$d */
    public static class C8443d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8442c(0);
        }
    }

    static {
        new C17394d0("MVImageReferenceWithPartialParams");
        HashMap hashMap = new HashMap();
        f25062d = hashMap;
        hashMap.put(C25239c.class, new C8441b());
        hashMap.put(C25240d.class, new C8443d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IMAGE_ID, new FieldMetaData("imageId", (byte) 3, new FieldValueMetaData((byte) 8, "MVImageReference")));
        enumMap.put(_Fields.PARAMS, new FieldMetaData("params", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25063e = unmodifiableMap;
        FieldMetaData.m61947a(MVImageReferenceWithPartialParams.class, unmodifiableMap);
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
        ((C25238b) f25062d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25062d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26254a(MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams) {
        if (mVImageReferenceWithPartialParams == null || this.imageId != mVImageReferenceWithPartialParams.imageId) {
            return false;
        }
        boolean g = mo26258g();
        boolean g2 = mVImageReferenceWithPartialParams.mo26258g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.params.equals(mVImageReferenceWithPartialParams.params)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams = (MVImageReferenceWithPartialParams) obj;
        if (!getClass().equals(mVImageReferenceWithPartialParams.getClass())) {
            return getClass().getName().compareTo(mVImageReferenceWithPartialParams.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26257f()).compareTo(Boolean.valueOf(mVImageReferenceWithPartialParams.mo26257f()));
        if (compareTo != 0 || ((mo26257f() && (compareTo = C25082a.m62839c(this.imageId, mVImageReferenceWithPartialParams.imageId)) != 0) || (compareTo = Boolean.valueOf(mo26258g()).compareTo(Boolean.valueOf(mVImageReferenceWithPartialParams.mo26258g()))) != 0)) {
            return compareTo;
        }
        if (!mo26258g() || (h = C25082a.m62844h(this.params, mVImageReferenceWithPartialParams.params)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVImageReferenceWithPartialParams)) {
            return mo26254a((MVImageReferenceWithPartialParams) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26257f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26258g() {
        return this.params != null;
    }

    /* renamed from: h */
    public final void mo26259h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVImageReferenceWithPartialParams(", "imageId:");
        C0016g.m42z(n, this.imageId, ", ", "params:");
        List<String> list = this.params;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
