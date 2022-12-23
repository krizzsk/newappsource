package com.tranzmate.moovit.protocol.checkin;

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

public class MVGeofenceMetadata implements TBase<MVGeofenceMetadata, _Fields>, Serializable, Cloneable, Comparable<MVGeofenceMetadata> {

    /* renamed from: b */
    public static final C25113c f24945b = new C25113c("timeToDestinationSecs", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24946c = new C25113c("distanceToDestinationMeters", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f24947d = new C25113c("stopsToDestination", (byte) 6, 3);

    /* renamed from: e */
    public static final C25113c f24948e = new C25113c("stopIndex", (byte) 6, 4);

    /* renamed from: f */
    public static final C25113c f24949f = new C25113c("flags", (byte) 3, 5);

    /* renamed from: g */
    public static final C25113c f24950g = new C25113c("expirationFromEtaMinutes", (byte) 3, 6);

    /* renamed from: h */
    public static final HashMap f24951h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f24952i;
    private byte __isset_bitfield = 0;
    public int distanceToDestinationMeters;
    public byte expirationFromEtaMinutes;
    public byte flags;
    private _Fields[] optionals = {_Fields.STOP_INDEX};
    public short stopIndex;
    public short stopsToDestination;
    public int timeToDestinationSecs;

    public enum _Fields implements C25085c {
        TIME_TO_DESTINATION_SECS(1, "timeToDestinationSecs"),
        DISTANCE_TO_DESTINATION_METERS(2, "distanceToDestinationMeters"),
        STOPS_TO_DESTINATION(3, "stopsToDestination"),
        STOP_INDEX(4, "stopIndex"),
        FLAGS(5, "flags"),
        EXPIRATION_FROM_ETA_MINUTES(6, "expirationFromEtaMinutes");
        
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
            switch (i) {
                case 1:
                    return TIME_TO_DESTINATION_SECS;
                case 2:
                    return DISTANCE_TO_DESTINATION_METERS;
                case 3:
                    return STOPS_TO_DESTINATION;
                case 4:
                    return STOP_INDEX;
                case 5:
                    return FLAGS;
                case 6:
                    return EXPIRATION_FROM_ETA_MINUTES;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVGeofenceMetadata$a */
    public static class C8352a extends C25239c<MVGeofenceMetadata> {
        public C8352a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGeofenceMetadata mVGeofenceMetadata = (MVGeofenceMetadata) tBase;
            mVGeofenceMetadata.getClass();
            C25113c cVar = MVGeofenceMetadata.f24945b;
            gVar.mo61687K();
            gVar.mo61711x(MVGeofenceMetadata.f24945b);
            gVar.mo61678B(mVGeofenceMetadata.timeToDestinationSecs);
            gVar.mo61712y();
            gVar.mo61711x(MVGeofenceMetadata.f24946c);
            gVar.mo61678B(mVGeofenceMetadata.distanceToDestinationMeters);
            gVar.mo61712y();
            gVar.mo61711x(MVGeofenceMetadata.f24947d);
            gVar.mo61677A(mVGeofenceMetadata.stopsToDestination);
            gVar.mo61712y();
            if (mVGeofenceMetadata.mo26028i()) {
                gVar.mo61711x(MVGeofenceMetadata.f24948e);
                gVar.mo61677A(mVGeofenceMetadata.stopIndex);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVGeofenceMetadata.f24949f);
            gVar.mo61709v(mVGeofenceMetadata.flags);
            gVar.mo61712y();
            gVar.mo61711x(MVGeofenceMetadata.f24950g);
            gVar.mo61709v(mVGeofenceMetadata.expirationFromEtaMinutes);
            gVar.mo61712y();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGeofenceMetadata mVGeofenceMetadata = (MVGeofenceMetadata) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVGeofenceMetadata.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGeofenceMetadata.timeToDestinationSecs = gVar.mo61696i();
                            mVGeofenceMetadata.mo26036r();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGeofenceMetadata.distanceToDestinationMeters = gVar.mo61696i();
                            mVGeofenceMetadata.mo26031l();
                            break;
                        }
                    case 3:
                        if (b != 6) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGeofenceMetadata.stopsToDestination = gVar.mo61695h();
                            mVGeofenceMetadata.mo26035q();
                            break;
                        }
                    case 4:
                        if (b != 6) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGeofenceMetadata.stopIndex = gVar.mo61695h();
                            mVGeofenceMetadata.mo26034p();
                            break;
                        }
                    case 5:
                        if (b != 3) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGeofenceMetadata.flags = gVar.mo61691d();
                            mVGeofenceMetadata.mo26033o();
                            break;
                        }
                    case 6:
                        if (b != 3) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGeofenceMetadata.expirationFromEtaMinutes = gVar.mo61691d();
                            mVGeofenceMetadata.mo26032m();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVGeofenceMetadata$b */
    public static class C8353b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8352a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVGeofenceMetadata$c */
    public static class C8354c extends C25240d<MVGeofenceMetadata> {
        public C8354c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGeofenceMetadata mVGeofenceMetadata = (MVGeofenceMetadata) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGeofenceMetadata.mo26030k()) {
                bitSet.set(0);
            }
            if (mVGeofenceMetadata.mo26024f()) {
                bitSet.set(1);
            }
            if (mVGeofenceMetadata.mo26029j()) {
                bitSet.set(2);
            }
            if (mVGeofenceMetadata.mo26028i()) {
                bitSet.set(3);
            }
            if (mVGeofenceMetadata.mo26026h()) {
                bitSet.set(4);
            }
            if (mVGeofenceMetadata.mo26025g()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVGeofenceMetadata.mo26030k()) {
                jVar.mo61678B(mVGeofenceMetadata.timeToDestinationSecs);
            }
            if (mVGeofenceMetadata.mo26024f()) {
                jVar.mo61678B(mVGeofenceMetadata.distanceToDestinationMeters);
            }
            if (mVGeofenceMetadata.mo26029j()) {
                jVar.mo61677A(mVGeofenceMetadata.stopsToDestination);
            }
            if (mVGeofenceMetadata.mo26028i()) {
                jVar.mo61677A(mVGeofenceMetadata.stopIndex);
            }
            if (mVGeofenceMetadata.mo26026h()) {
                jVar.mo61716P(mVGeofenceMetadata.flags);
            }
            if (mVGeofenceMetadata.mo26025g()) {
                jVar.mo61716P(mVGeofenceMetadata.expirationFromEtaMinutes);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGeofenceMetadata mVGeofenceMetadata = (MVGeofenceMetadata) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVGeofenceMetadata.timeToDestinationSecs = jVar.mo61696i();
                mVGeofenceMetadata.mo26036r();
            }
            if (T.get(1)) {
                mVGeofenceMetadata.distanceToDestinationMeters = jVar.mo61696i();
                mVGeofenceMetadata.mo26031l();
            }
            if (T.get(2)) {
                mVGeofenceMetadata.stopsToDestination = jVar.mo61695h();
                mVGeofenceMetadata.mo26035q();
            }
            if (T.get(3)) {
                mVGeofenceMetadata.stopIndex = jVar.mo61695h();
                mVGeofenceMetadata.mo26034p();
            }
            if (T.get(4)) {
                mVGeofenceMetadata.flags = jVar.mo61691d();
                mVGeofenceMetadata.mo26033o();
            }
            if (T.get(5)) {
                mVGeofenceMetadata.expirationFromEtaMinutes = jVar.mo61691d();
                mVGeofenceMetadata.mo26032m();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVGeofenceMetadata$d */
    public static class C8355d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8354c(0);
        }
    }

    static {
        new C17394d0("MVGeofenceMetadata");
        HashMap hashMap = new HashMap();
        f24951h = hashMap;
        hashMap.put(C25239c.class, new C8353b());
        hashMap.put(C25240d.class, new C8355d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIME_TO_DESTINATION_SECS, new FieldMetaData("timeToDestinationSecs", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DISTANCE_TO_DESTINATION_METERS, new FieldMetaData("distanceToDestinationMeters", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STOPS_TO_DESTINATION, new FieldMetaData("stopsToDestination", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.STOP_INDEX, new FieldMetaData("stopIndex", (byte) 2, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.FLAGS, new FieldMetaData("flags", (byte) 3, new FieldValueMetaData((byte) 3, false)));
        enumMap.put(_Fields.EXPIRATION_FROM_ETA_MINUTES, new FieldMetaData("expirationFromEtaMinutes", (byte) 3, new FieldValueMetaData((byte) 3, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24952i = unmodifiableMap;
        FieldMetaData.m61947a(MVGeofenceMetadata.class, unmodifiableMap);
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
        ((C25238b) f24951h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24951h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26021a(MVGeofenceMetadata mVGeofenceMetadata) {
        if (mVGeofenceMetadata == null || this.timeToDestinationSecs != mVGeofenceMetadata.timeToDestinationSecs || this.distanceToDestinationMeters != mVGeofenceMetadata.distanceToDestinationMeters || this.stopsToDestination != mVGeofenceMetadata.stopsToDestination) {
            return false;
        }
        boolean i = mo26028i();
        boolean i2 = mVGeofenceMetadata.mo26028i();
        if (((!i && !i2) || (i && i2 && this.stopIndex == mVGeofenceMetadata.stopIndex)) && this.flags == mVGeofenceMetadata.flags && this.expirationFromEtaMinutes == mVGeofenceMetadata.expirationFromEtaMinutes) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int a;
        MVGeofenceMetadata mVGeofenceMetadata = (MVGeofenceMetadata) obj;
        if (!getClass().equals(mVGeofenceMetadata.getClass())) {
            return getClass().getName().compareTo(mVGeofenceMetadata.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26030k()).compareTo(Boolean.valueOf(mVGeofenceMetadata.mo26030k()));
        if (compareTo != 0 || ((mo26030k() && (compareTo = C25082a.m62839c(this.timeToDestinationSecs, mVGeofenceMetadata.timeToDestinationSecs)) != 0) || (compareTo = Boolean.valueOf(mo26024f()).compareTo(Boolean.valueOf(mVGeofenceMetadata.mo26024f()))) != 0 || ((mo26024f() && (compareTo = C25082a.m62839c(this.distanceToDestinationMeters, mVGeofenceMetadata.distanceToDestinationMeters)) != 0) || (compareTo = Boolean.valueOf(mo26029j()).compareTo(Boolean.valueOf(mVGeofenceMetadata.mo26029j()))) != 0 || ((mo26029j() && (compareTo = C25082a.m62847k(this.stopsToDestination, mVGeofenceMetadata.stopsToDestination)) != 0) || (compareTo = Boolean.valueOf(mo26028i()).compareTo(Boolean.valueOf(mVGeofenceMetadata.mo26028i()))) != 0 || ((mo26028i() && (compareTo = C25082a.m62847k(this.stopIndex, mVGeofenceMetadata.stopIndex)) != 0) || (compareTo = Boolean.valueOf(mo26026h()).compareTo(Boolean.valueOf(mVGeofenceMetadata.mo26026h()))) != 0 || ((mo26026h() && (compareTo = C25082a.m62837a(this.flags, mVGeofenceMetadata.flags)) != 0) || (compareTo = Boolean.valueOf(mo26025g()).compareTo(Boolean.valueOf(mVGeofenceMetadata.mo26025g()))) != 0)))))) {
            return compareTo;
        }
        if (!mo26025g() || (a = C25082a.m62837a(this.expirationFromEtaMinutes, mVGeofenceMetadata.expirationFromEtaMinutes)) == 0) {
            return 0;
        }
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVGeofenceMetadata)) {
            return mo26021a((MVGeofenceMetadata) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26024f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo26025g() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: h */
    public final boolean mo26026h() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26028i() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: j */
    public final boolean mo26029j() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: k */
    public final boolean mo26030k() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: l */
    public final void mo26031l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo26032m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: o */
    public final void mo26033o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: p */
    public final void mo26034p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: q */
    public final void mo26035q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: r */
    public final void mo26036r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGeofenceMetadata(", "timeToDestinationSecs:");
        C0016g.m42z(n, this.timeToDestinationSecs, ", ", "distanceToDestinationMeters:");
        C0016g.m42z(n, this.distanceToDestinationMeters, ", ", "stopsToDestination:");
        n.append(this.stopsToDestination);
        if (mo26028i()) {
            n.append(", ");
            n.append("stopIndex:");
            n.append(this.stopIndex);
        }
        n.append(", ");
        n.append("flags:");
        C0016g.m42z(n, this.flags, ", ", "expirationFromEtaMinutes:");
        return C13437d.m33707l(n, this.expirationFromEtaMinutes, ")");
    }
}
