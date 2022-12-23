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

public class MVImageReferenceSetEntry implements TBase<MVImageReferenceSetEntry, _Fields>, Serializable, Cloneable, Comparable<MVImageReferenceSetEntry> {

    /* renamed from: b */
    public static final C25113c f25045b = new C25113c("index", (byte) 6, 1);

    /* renamed from: c */
    public static final C25113c f25046c = new C25113c("imageRef", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f25047d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25048e;
    private byte __isset_bitfield = 0;
    public int imageRef;
    public short index;

    public enum _Fields implements C25085c {
        INDEX(1, "index"),
        IMAGE_REF(2, "imageRef");
        
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
            return IMAGE_REF;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceSetEntry$a */
    public static class C8424a extends C25239c<MVImageReferenceSetEntry> {
        public C8424a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceSetEntry mVImageReferenceSetEntry = (MVImageReferenceSetEntry) tBase;
            mVImageReferenceSetEntry.getClass();
            C25113c cVar = MVImageReferenceSetEntry.f25045b;
            gVar.mo61687K();
            gVar.mo61711x(MVImageReferenceSetEntry.f25045b);
            gVar.mo61677A(mVImageReferenceSetEntry.index);
            gVar.mo61712y();
            gVar.mo61711x(MVImageReferenceSetEntry.f25046c);
            C16530d.m42020n(gVar, mVImageReferenceSetEntry.imageRef);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceSetEntry mVImageReferenceSetEntry = (MVImageReferenceSetEntry) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVImageReferenceSetEntry.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVImageReferenceSetEntry.imageRef = gVar.mo61696i();
                        mVImageReferenceSetEntry.mo26225h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 6) {
                    mVImageReferenceSetEntry.index = gVar.mo61695h();
                    mVImageReferenceSetEntry.mo26227i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceSetEntry$b */
    public static class C8425b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8424a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceSetEntry$c */
    public static class C8426c extends C25240d<MVImageReferenceSetEntry> {
        public C8426c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceSetEntry mVImageReferenceSetEntry = (MVImageReferenceSetEntry) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVImageReferenceSetEntry.mo26224g()) {
                bitSet.set(0);
            }
            if (mVImageReferenceSetEntry.mo26223f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVImageReferenceSetEntry.mo26224g()) {
                jVar.mo61677A(mVImageReferenceSetEntry.index);
            }
            if (mVImageReferenceSetEntry.mo26223f()) {
                jVar.mo61678B(mVImageReferenceSetEntry.imageRef);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceSetEntry mVImageReferenceSetEntry = (MVImageReferenceSetEntry) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVImageReferenceSetEntry.index = jVar.mo61695h();
                mVImageReferenceSetEntry.mo26227i();
            }
            if (T.get(1)) {
                mVImageReferenceSetEntry.imageRef = jVar.mo61696i();
                mVImageReferenceSetEntry.mo26225h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceSetEntry$d */
    public static class C8427d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8426c(0);
        }
    }

    static {
        new C17394d0("MVImageReferenceSetEntry");
        HashMap hashMap = new HashMap();
        f25047d = hashMap;
        hashMap.put(C25239c.class, new C8425b());
        hashMap.put(C25240d.class, new C8427d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.INDEX, new FieldMetaData("index", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.IMAGE_REF, new FieldMetaData("imageRef", (byte) 3, new FieldValueMetaData((byte) 8, "MVImageReference")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25048e = unmodifiableMap;
        FieldMetaData.m61947a(MVImageReferenceSetEntry.class, unmodifiableMap);
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
        ((C25238b) f25047d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25047d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVImageReferenceSetEntry mVImageReferenceSetEntry = (MVImageReferenceSetEntry) obj;
        if (!getClass().equals(mVImageReferenceSetEntry.getClass())) {
            return getClass().getName().compareTo(mVImageReferenceSetEntry.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26224g()).compareTo(Boolean.valueOf(mVImageReferenceSetEntry.mo26224g()));
        if (compareTo != 0 || ((mo26224g() && (compareTo = C25082a.m62847k(this.index, mVImageReferenceSetEntry.index)) != 0) || (compareTo = Boolean.valueOf(mo26223f()).compareTo(Boolean.valueOf(mVImageReferenceSetEntry.mo26223f()))) != 0)) {
            return compareTo;
        }
        if (!mo26223f() || (c = C25082a.m62839c(this.imageRef, mVImageReferenceSetEntry.imageRef)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVImageReferenceSetEntry)) {
            return false;
        }
        MVImageReferenceSetEntry mVImageReferenceSetEntry = (MVImageReferenceSetEntry) obj;
        if (this.index == mVImageReferenceSetEntry.index && this.imageRef == mVImageReferenceSetEntry.imageRef) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26223f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo26224g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo26225h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26227i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVImageReferenceSetEntry(", "index:");
        C0016g.m42z(n, this.index, ", ", "imageRef:");
        return C13437d.m33707l(n, this.imageRef, ")");
    }
}
