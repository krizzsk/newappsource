package com.tranzmate.moovit.protocol.carpool;

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

public class MVStreetViewDetails implements TBase<MVStreetViewDetails, _Fields>, Serializable, Cloneable, Comparable<MVStreetViewDetails> {

    /* renamed from: b */
    public static final C25113c f24897b = new C25113c("zoomLevel", (byte) 4, 1);

    /* renamed from: c */
    public static final C25113c f24898c = new C25113c("bearing", (byte) 4, 2);

    /* renamed from: d */
    public static final C25113c f24899d = new C25113c("tilt", (byte) 4, 3);

    /* renamed from: e */
    public static final HashMap f24900e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f24901f;
    private byte __isset_bitfield = 0;
    public double bearing;
    public double tilt;
    public double zoomLevel;

    public enum _Fields implements C25085c {
        ZOOM_LEVEL(1, "zoomLevel"),
        BEARING(2, "bearing"),
        TILT(3, "tilt");
        
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
                return ZOOM_LEVEL;
            }
            if (i == 2) {
                return BEARING;
            }
            if (i != 3) {
                return null;
            }
            return TILT;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVStreetViewDetails$a */
    public static class C8328a extends C25239c<MVStreetViewDetails> {
        public C8328a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStreetViewDetails mVStreetViewDetails = (MVStreetViewDetails) tBase;
            mVStreetViewDetails.getClass();
            C25113c cVar = MVStreetViewDetails.f24897b;
            gVar.mo61687K();
            gVar.mo61711x(MVStreetViewDetails.f24897b);
            gVar.mo61710w(mVStreetViewDetails.zoomLevel);
            gVar.mo61712y();
            gVar.mo61711x(MVStreetViewDetails.f24898c);
            gVar.mo61710w(mVStreetViewDetails.bearing);
            gVar.mo61712y();
            gVar.mo61711x(MVStreetViewDetails.f24899d);
            gVar.mo61710w(mVStreetViewDetails.tilt);
            gVar.mo61712y();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStreetViewDetails mVStreetViewDetails = (MVStreetViewDetails) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVStreetViewDetails.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 4) {
                            mVStreetViewDetails.tilt = gVar.mo61692e();
                            mVStreetViewDetails.mo25943j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 4) {
                        mVStreetViewDetails.bearing = gVar.mo61692e();
                        mVStreetViewDetails.mo25942i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 4) {
                    mVStreetViewDetails.zoomLevel = gVar.mo61692e();
                    mVStreetViewDetails.mo25944k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVStreetViewDetails$b */
    public static class C8329b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8328a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVStreetViewDetails$c */
    public static class C8330c extends C25240d<MVStreetViewDetails> {
        public C8330c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStreetViewDetails mVStreetViewDetails = (MVStreetViewDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStreetViewDetails.mo25940h()) {
                bitSet.set(0);
            }
            if (mVStreetViewDetails.mo25938f()) {
                bitSet.set(1);
            }
            if (mVStreetViewDetails.mo25939g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVStreetViewDetails.mo25940h()) {
                jVar.mo61710w(mVStreetViewDetails.zoomLevel);
            }
            if (mVStreetViewDetails.mo25938f()) {
                jVar.mo61710w(mVStreetViewDetails.bearing);
            }
            if (mVStreetViewDetails.mo25939g()) {
                jVar.mo61710w(mVStreetViewDetails.tilt);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStreetViewDetails mVStreetViewDetails = (MVStreetViewDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVStreetViewDetails.zoomLevel = jVar.mo61692e();
                mVStreetViewDetails.mo25944k();
            }
            if (T.get(1)) {
                mVStreetViewDetails.bearing = jVar.mo61692e();
                mVStreetViewDetails.mo25942i();
            }
            if (T.get(2)) {
                mVStreetViewDetails.tilt = jVar.mo61692e();
                mVStreetViewDetails.mo25943j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVStreetViewDetails$d */
    public static class C8331d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8330c(0);
        }
    }

    static {
        new C17394d0("MVStreetViewDetails");
        HashMap hashMap = new HashMap();
        f24900e = hashMap;
        hashMap.put(C25239c.class, new C8329b());
        hashMap.put(C25240d.class, new C8331d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ZOOM_LEVEL, new FieldMetaData("zoomLevel", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.BEARING, new FieldMetaData("bearing", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.TILT, new FieldMetaData("tilt", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24901f = unmodifiableMap;
        FieldMetaData.m61947a(MVStreetViewDetails.class, unmodifiableMap);
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
        ((C25238b) f24900e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24900e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25935a(MVStreetViewDetails mVStreetViewDetails) {
        if (mVStreetViewDetails != null && this.zoomLevel == mVStreetViewDetails.zoomLevel && this.bearing == mVStreetViewDetails.bearing && this.tilt == mVStreetViewDetails.tilt) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int b;
        MVStreetViewDetails mVStreetViewDetails = (MVStreetViewDetails) obj;
        if (!getClass().equals(mVStreetViewDetails.getClass())) {
            return getClass().getName().compareTo(mVStreetViewDetails.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25940h()).compareTo(Boolean.valueOf(mVStreetViewDetails.mo25940h()));
        if (compareTo != 0 || ((mo25940h() && (compareTo = C25082a.m62838b(this.zoomLevel, mVStreetViewDetails.zoomLevel)) != 0) || (compareTo = Boolean.valueOf(mo25938f()).compareTo(Boolean.valueOf(mVStreetViewDetails.mo25938f()))) != 0 || ((mo25938f() && (compareTo = C25082a.m62838b(this.bearing, mVStreetViewDetails.bearing)) != 0) || (compareTo = Boolean.valueOf(mo25939g()).compareTo(Boolean.valueOf(mVStreetViewDetails.mo25939g()))) != 0))) {
            return compareTo;
        }
        if (!mo25939g() || (b = C25082a.m62838b(this.tilt, mVStreetViewDetails.tilt)) == 0) {
            return 0;
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVStreetViewDetails)) {
            return mo25935a((MVStreetViewDetails) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25938f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo25939g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo25940h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo25942i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: j */
    public final void mo25943j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: k */
    public final void mo25944k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVStreetViewDetails(", "zoomLevel:");
        C16759e.m42355k(n, this.zoomLevel, ", ", "bearing:");
        C16759e.m42355k(n, this.bearing, ", ", "tilt:");
        n.append(this.tilt);
        n.append(")");
        return n.toString();
    }
}
