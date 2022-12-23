package com.tranzmate.moovit.protocol.common;

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

public class MVImageReferenceWithoutParamsSetEntry implements TBase<MVImageReferenceWithoutParamsSetEntry, _Fields>, Serializable, Cloneable, Comparable<MVImageReferenceWithoutParamsSetEntry> {

    /* renamed from: b */
    public static final C25113c f25067b = new C25113c("index", (byte) 6, 1);

    /* renamed from: c */
    public static final C25113c f25068c = new C25113c("image", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f25069d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25070e;
    private byte __isset_bitfield = 0;
    public int image;
    public short index;

    public enum _Fields implements C25085c {
        INDEX(1, "index"),
        IMAGE(2, "image");
        
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
                return INDEX;
            }
            if (i != 2) {
                return null;
            }
            return IMAGE;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceWithoutParamsSetEntry$a */
    public static class C8448a extends C25239c<MVImageReferenceWithoutParamsSetEntry> {
        public C8448a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceWithoutParamsSetEntry mVImageReferenceWithoutParamsSetEntry = (MVImageReferenceWithoutParamsSetEntry) tBase;
            mVImageReferenceWithoutParamsSetEntry.getClass();
            C25113c cVar = MVImageReferenceWithoutParamsSetEntry.f25067b;
            gVar.mo61687K();
            gVar.mo61711x(MVImageReferenceWithoutParamsSetEntry.f25067b);
            gVar.mo61677A(mVImageReferenceWithoutParamsSetEntry.index);
            gVar.mo61712y();
            gVar.mo61711x(MVImageReferenceWithoutParamsSetEntry.f25068c);
            C16530d.m42020n(gVar, mVImageReferenceWithoutParamsSetEntry.image);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceWithoutParamsSetEntry mVImageReferenceWithoutParamsSetEntry = (MVImageReferenceWithoutParamsSetEntry) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVImageReferenceWithoutParamsSetEntry.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVImageReferenceWithoutParamsSetEntry.image = gVar.mo61696i();
                        mVImageReferenceWithoutParamsSetEntry.mo26274h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 6) {
                    mVImageReferenceWithoutParamsSetEntry.index = gVar.mo61695h();
                    mVImageReferenceWithoutParamsSetEntry.mo26276i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceWithoutParamsSetEntry$b */
    public static class C8449b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8448a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceWithoutParamsSetEntry$c */
    public static class C8450c extends C25240d<MVImageReferenceWithoutParamsSetEntry> {
        public C8450c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceWithoutParamsSetEntry mVImageReferenceWithoutParamsSetEntry = (MVImageReferenceWithoutParamsSetEntry) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVImageReferenceWithoutParamsSetEntry.mo26273g()) {
                bitSet.set(0);
            }
            if (mVImageReferenceWithoutParamsSetEntry.mo26272f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVImageReferenceWithoutParamsSetEntry.mo26273g()) {
                jVar.mo61677A(mVImageReferenceWithoutParamsSetEntry.index);
            }
            if (mVImageReferenceWithoutParamsSetEntry.mo26272f()) {
                jVar.mo61678B(mVImageReferenceWithoutParamsSetEntry.image);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceWithoutParamsSetEntry mVImageReferenceWithoutParamsSetEntry = (MVImageReferenceWithoutParamsSetEntry) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVImageReferenceWithoutParamsSetEntry.index = jVar.mo61695h();
                mVImageReferenceWithoutParamsSetEntry.mo26276i();
            }
            if (T.get(1)) {
                mVImageReferenceWithoutParamsSetEntry.image = jVar.mo61696i();
                mVImageReferenceWithoutParamsSetEntry.mo26274h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceWithoutParamsSetEntry$d */
    public static class C8451d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8450c(0);
        }
    }

    static {
        new C17394d0("MVImageReferenceWithoutParamsSetEntry");
        HashMap hashMap = new HashMap();
        f25069d = hashMap;
        hashMap.put(C25239c.class, new C8449b());
        hashMap.put(C25240d.class, new C8451d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.INDEX, new FieldMetaData("index", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 3, new FieldValueMetaData((byte) 8, "MVImageReferenceWithoutParams")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25070e = unmodifiableMap;
        FieldMetaData.m61947a(MVImageReferenceWithoutParamsSetEntry.class, unmodifiableMap);
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
        ((C25238b) f25069d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25069d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVImageReferenceWithoutParamsSetEntry mVImageReferenceWithoutParamsSetEntry = (MVImageReferenceWithoutParamsSetEntry) obj;
        if (!getClass().equals(mVImageReferenceWithoutParamsSetEntry.getClass())) {
            return getClass().getName().compareTo(mVImageReferenceWithoutParamsSetEntry.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26273g()).compareTo(Boolean.valueOf(mVImageReferenceWithoutParamsSetEntry.mo26273g()));
        if (compareTo != 0 || ((mo26273g() && (compareTo = C25082a.m62847k(this.index, mVImageReferenceWithoutParamsSetEntry.index)) != 0) || (compareTo = Boolean.valueOf(mo26272f()).compareTo(Boolean.valueOf(mVImageReferenceWithoutParamsSetEntry.mo26272f()))) != 0)) {
            return compareTo;
        }
        if (!mo26272f() || (c = C25082a.m62839c(this.image, mVImageReferenceWithoutParamsSetEntry.image)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVImageReferenceWithoutParamsSetEntry)) {
            return false;
        }
        MVImageReferenceWithoutParamsSetEntry mVImageReferenceWithoutParamsSetEntry = (MVImageReferenceWithoutParamsSetEntry) obj;
        if (this.index == mVImageReferenceWithoutParamsSetEntry.index && this.image == mVImageReferenceWithoutParamsSetEntry.image) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26272f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo26273g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo26274h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26276i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVImageReferenceWithoutParamsSetEntry(", "index:");
        C0016g.m42z(n, this.index, ", ", "image:");
        return C13437d.m33707l(n, this.image, ")");
    }
}
