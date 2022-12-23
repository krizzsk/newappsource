package com.tranzmate.moovit.protocol.directsales;

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

public class MVAdSize implements TBase<MVAdSize, _Fields>, Serializable, Cloneable, Comparable<MVAdSize> {

    /* renamed from: b */
    public static final C25113c f25515b = new C25113c("width", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25516c = new C25113c("height", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f25517d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25518e;
    private byte __isset_bitfield = 0;
    public int height;
    public int width;

    public enum _Fields implements C25085c {
        WIDTH(1, "width"),
        HEIGHT(2, "height");
        
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
                return WIDTH;
            }
            if (i != 2) {
                return null;
            }
            return HEIGHT;
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

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVAdSize$a */
    public static class C8645a extends C25239c<MVAdSize> {
        public C8645a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAdSize mVAdSize = (MVAdSize) tBase;
            mVAdSize.getClass();
            C25113c cVar = MVAdSize.f25515b;
            gVar.mo61687K();
            gVar.mo61711x(MVAdSize.f25515b);
            gVar.mo61678B(mVAdSize.width);
            gVar.mo61712y();
            gVar.mo61711x(MVAdSize.f25516c);
            C16530d.m42020n(gVar, mVAdSize.height);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAdSize mVAdSize = (MVAdSize) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAdSize.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVAdSize.height = gVar.mo61696i();
                        mVAdSize.mo27025h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVAdSize.width = gVar.mo61696i();
                    mVAdSize.mo27027i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVAdSize$b */
    public static class C8646b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8645a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVAdSize$c */
    public static class C8647c extends C25240d<MVAdSize> {
        public C8647c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAdSize mVAdSize = (MVAdSize) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAdSize.mo27024g()) {
                bitSet.set(0);
            }
            if (mVAdSize.mo27023f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVAdSize.mo27024g()) {
                jVar.mo61678B(mVAdSize.width);
            }
            if (mVAdSize.mo27023f()) {
                jVar.mo61678B(mVAdSize.height);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAdSize mVAdSize = (MVAdSize) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVAdSize.width = jVar.mo61696i();
                mVAdSize.mo27027i();
            }
            if (T.get(1)) {
                mVAdSize.height = jVar.mo61696i();
                mVAdSize.mo27025h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVAdSize$d */
    public static class C8648d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8647c(0);
        }
    }

    static {
        new C17394d0("MVAdSize");
        HashMap hashMap = new HashMap();
        f25517d = hashMap;
        hashMap.put(C25239c.class, new C8646b());
        hashMap.put(C25240d.class, new C8648d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.WIDTH, new FieldMetaData("width", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.HEIGHT, new FieldMetaData("height", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25518e = unmodifiableMap;
        FieldMetaData.m61947a(MVAdSize.class, unmodifiableMap);
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
        ((C25238b) f25517d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25517d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo27020a(MVAdSize mVAdSize) {
        if (mVAdSize != null && this.width == mVAdSize.width && this.height == mVAdSize.height) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int c;
        MVAdSize mVAdSize = (MVAdSize) obj;
        if (!getClass().equals(mVAdSize.getClass())) {
            return getClass().getName().compareTo(mVAdSize.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27024g()).compareTo(Boolean.valueOf(mVAdSize.mo27024g()));
        if (compareTo != 0 || ((mo27024g() && (compareTo = C25082a.m62839c(this.width, mVAdSize.width)) != 0) || (compareTo = Boolean.valueOf(mo27023f()).compareTo(Boolean.valueOf(mVAdSize.mo27023f()))) != 0)) {
            return compareTo;
        }
        if (!mo27023f() || (c = C25082a.m62839c(this.height, mVAdSize.height)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVAdSize)) {
            return mo27020a((MVAdSize) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27023f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo27024g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo27025h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27027i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAdSize(", "width:");
        C0016g.m42z(n, this.width, ", ", "height:");
        return C13437d.m33707l(n, this.height, ")");
    }
}
