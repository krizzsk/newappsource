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

public class MVBoundingBox implements TBase<MVBoundingBox, _Fields>, Serializable, Cloneable, Comparable<MVBoundingBox> {

    /* renamed from: b */
    public static final C25113c f24973b = new C25113c("south", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24974c = new C25113c("north", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f24975d = new C25113c("west", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f24976e = new C25113c("east", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f24977f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f24978g;
    private byte __isset_bitfield = 0;
    public int east;
    public int north;
    public int south;
    public int west;

    public enum _Fields implements C25085c {
        SOUTH(1, "south"),
        NORTH(2, "north"),
        WEST(3, "west"),
        EAST(4, "east");
        
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
                return SOUTH;
            }
            if (i == 2) {
                return NORTH;
            }
            if (i == 3) {
                return WEST;
            }
            if (i != 4) {
                return null;
            }
            return EAST;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVBoundingBox$a */
    public static class C8368a extends C25239c<MVBoundingBox> {
        public C8368a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBoundingBox mVBoundingBox = (MVBoundingBox) tBase;
            mVBoundingBox.getClass();
            C25113c cVar = MVBoundingBox.f24973b;
            gVar.mo61687K();
            gVar.mo61711x(MVBoundingBox.f24973b);
            gVar.mo61678B(mVBoundingBox.south);
            gVar.mo61712y();
            gVar.mo61711x(MVBoundingBox.f24974c);
            gVar.mo61678B(mVBoundingBox.north);
            gVar.mo61712y();
            gVar.mo61711x(MVBoundingBox.f24975d);
            gVar.mo61678B(mVBoundingBox.west);
            gVar.mo61712y();
            gVar.mo61711x(MVBoundingBox.f24976e);
            C16530d.m42020n(gVar, mVBoundingBox.east);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBoundingBox mVBoundingBox = (MVBoundingBox) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVBoundingBox.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVBoundingBox.east = gVar.mo61696i();
                                mVBoundingBox.mo26084j();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVBoundingBox.west = gVar.mo61696i();
                            mVBoundingBox.mo26087m();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVBoundingBox.north = gVar.mo61696i();
                        mVBoundingBox.mo26085k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVBoundingBox.south = gVar.mo61696i();
                    mVBoundingBox.mo26086l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVBoundingBox$b */
    public static class C8369b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8368a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVBoundingBox$c */
    public static class C8370c extends C25240d<MVBoundingBox> {
        public C8370c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBoundingBox mVBoundingBox = (MVBoundingBox) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVBoundingBox.mo26081h()) {
                bitSet.set(0);
            }
            if (mVBoundingBox.mo26080g()) {
                bitSet.set(1);
            }
            if (mVBoundingBox.mo26083i()) {
                bitSet.set(2);
            }
            if (mVBoundingBox.mo26079f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVBoundingBox.mo26081h()) {
                jVar.mo61678B(mVBoundingBox.south);
            }
            if (mVBoundingBox.mo26080g()) {
                jVar.mo61678B(mVBoundingBox.north);
            }
            if (mVBoundingBox.mo26083i()) {
                jVar.mo61678B(mVBoundingBox.west);
            }
            if (mVBoundingBox.mo26079f()) {
                jVar.mo61678B(mVBoundingBox.east);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBoundingBox mVBoundingBox = (MVBoundingBox) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVBoundingBox.south = jVar.mo61696i();
                mVBoundingBox.mo26086l();
            }
            if (T.get(1)) {
                mVBoundingBox.north = jVar.mo61696i();
                mVBoundingBox.mo26085k();
            }
            if (T.get(2)) {
                mVBoundingBox.west = jVar.mo61696i();
                mVBoundingBox.mo26087m();
            }
            if (T.get(3)) {
                mVBoundingBox.east = jVar.mo61696i();
                mVBoundingBox.mo26084j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVBoundingBox$d */
    public static class C8371d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8370c(0);
        }
    }

    static {
        new C17394d0("MVBoundingBox");
        HashMap hashMap = new HashMap();
        f24977f = hashMap;
        hashMap.put(C25239c.class, new C8369b());
        hashMap.put(C25240d.class, new C8371d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SOUTH, new FieldMetaData("south", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NORTH, new FieldMetaData("north", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.WEST, new FieldMetaData("west", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.EAST, new FieldMetaData("east", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24978g = unmodifiableMap;
        FieldMetaData.m61947a(MVBoundingBox.class, unmodifiableMap);
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
        ((C25238b) f24977f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24977f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26076a(MVBoundingBox mVBoundingBox) {
        if (mVBoundingBox != null && this.south == mVBoundingBox.south && this.north == mVBoundingBox.north && this.west == mVBoundingBox.west && this.east == mVBoundingBox.east) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int c;
        MVBoundingBox mVBoundingBox = (MVBoundingBox) obj;
        if (!getClass().equals(mVBoundingBox.getClass())) {
            return getClass().getName().compareTo(mVBoundingBox.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26081h()).compareTo(Boolean.valueOf(mVBoundingBox.mo26081h()));
        if (compareTo != 0 || ((mo26081h() && (compareTo = C25082a.m62839c(this.south, mVBoundingBox.south)) != 0) || (compareTo = Boolean.valueOf(mo26080g()).compareTo(Boolean.valueOf(mVBoundingBox.mo26080g()))) != 0 || ((mo26080g() && (compareTo = C25082a.m62839c(this.north, mVBoundingBox.north)) != 0) || (compareTo = Boolean.valueOf(mo26083i()).compareTo(Boolean.valueOf(mVBoundingBox.mo26083i()))) != 0 || ((mo26083i() && (compareTo = C25082a.m62839c(this.west, mVBoundingBox.west)) != 0) || (compareTo = Boolean.valueOf(mo26079f()).compareTo(Boolean.valueOf(mVBoundingBox.mo26079f()))) != 0)))) {
            return compareTo;
        }
        if (!mo26079f() || (c = C25082a.m62839c(this.east, mVBoundingBox.east)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVBoundingBox)) {
            return mo26076a((MVBoundingBox) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26079f() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: g */
    public final boolean mo26080g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo26081h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26083i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final void mo26084j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: k */
    public final void mo26085k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: l */
    public final void mo26086l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: m */
    public final void mo26087m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVBoundingBox(", "south:");
        C0016g.m42z(n, this.south, ", ", "north:");
        C0016g.m42z(n, this.north, ", ", "west:");
        C0016g.m42z(n, this.west, ", ", "east:");
        return C13437d.m33707l(n, this.east, ")");
    }
}
