package com.tranzmate.moovit.protocol.tod.passenger;

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
import p001a0.C0017h;
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

public class MVTodVehicleAudio implements TBase<MVTodVehicleAudio, _Fields>, Serializable, Cloneable, Comparable<MVTodVehicleAudio> {

    /* renamed from: b */
    public static final C25113c f29674b = new C25113c("playing", (byte) 2, 1);

    /* renamed from: c */
    public static final HashMap f29675c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f29676d;
    private byte __isset_bitfield = 0;
    public boolean playing;

    public enum _Fields implements C25085c {
        PLAYING(1, "playing");
        
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
            return PLAYING;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAudio$a */
    public static class C11378a extends C25239c<MVTodVehicleAudio> {
        public C11378a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleAudio mVTodVehicleAudio = (MVTodVehicleAudio) tBase;
            mVTodVehicleAudio.getClass();
            C25113c cVar = MVTodVehicleAudio.f29674b;
            gVar.mo61687K();
            gVar.mo61711x(MVTodVehicleAudio.f29674b);
            C0017h.m62S(gVar, mVTodVehicleAudio.playing);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleAudio mVTodVehicleAudio = (MVTodVehicleAudio) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodVehicleAudio.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 2) {
                    mVTodVehicleAudio.playing = gVar.mo61690c();
                    mVTodVehicleAudio.mo33894g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAudio$b */
    public static class C11379b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11378a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAudio$c */
    public static class C11380c extends C25240d<MVTodVehicleAudio> {
        public C11380c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleAudio mVTodVehicleAudio = (MVTodVehicleAudio) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodVehicleAudio.mo33893f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVTodVehicleAudio.mo33893f()) {
                jVar.mo61708u(mVTodVehicleAudio.playing);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleAudio mVTodVehicleAudio = (MVTodVehicleAudio) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVTodVehicleAudio.playing = jVar.mo61690c();
                mVTodVehicleAudio.mo33894g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAudio$d */
    public static class C11381d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11380c(0);
        }
    }

    static {
        new C17394d0("MVTodVehicleAudio");
        HashMap hashMap = new HashMap();
        f29675c = hashMap;
        hashMap.put(C25239c.class, new C11379b());
        hashMap.put(C25240d.class, new C11381d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PLAYING, new FieldMetaData("playing", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29676d = unmodifiableMap;
        FieldMetaData.m61947a(MVTodVehicleAudio.class, unmodifiableMap);
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
        ((C25238b) f29675c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29675c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVTodVehicleAudio mVTodVehicleAudio = (MVTodVehicleAudio) obj;
        if (!getClass().equals(mVTodVehicleAudio.getClass())) {
            return getClass().getName().compareTo(mVTodVehicleAudio.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33893f()).compareTo(Boolean.valueOf(mVTodVehicleAudio.mo33893f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo33893f() || (l = C25082a.m62848l(this.playing, mVTodVehicleAudio.playing)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodVehicleAudio) && this.playing == ((MVTodVehicleAudio) obj).playing) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33893f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo33894g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return C25541a.m63885p(C13437d.m33708n("MVTodVehicleAudio(", "playing:"), this.playing, ")");
    }
}
