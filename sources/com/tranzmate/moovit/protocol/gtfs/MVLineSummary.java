package com.tranzmate.moovit.protocol.gtfs;

import com.appboy.support.StringUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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

public class MVLineSummary implements TBase<MVLineSummary, _Fields>, Serializable, Cloneable, Comparable<MVLineSummary> {

    /* renamed from: b */
    public static final C25113c f25727b = new C25113c("lineId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25728c = new C25113c(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25729d = new C25113c("destination", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f25730e = new C25113c("routeLongName", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f25731f = new C25113c("subGroupId", (byte) 3, 5);

    /* renamed from: g */
    public static final C25113c f25732g = new C25113c("onTimeAccuracyScore", (byte) 8, 6);

    /* renamed from: h */
    public static final HashMap f25733h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f25734i;
    private byte __isset_bitfield = 0;
    public String destination;
    public int lineId;
    public int onTimeAccuracyScore;
    private _Fields[] optionals = {_Fields.ORIGIN, _Fields.ROUTE_LONG_NAME, _Fields.SUB_GROUP_ID, _Fields.ON_TIME_ACCURACY_SCORE};
    public String origin;
    public String routeLongName;
    public byte subGroupId;

    public enum _Fields implements C25085c {
        LINE_ID(1, "lineId"),
        ORIGIN(2, AppMeasurementSdk.ConditionalUserProperty.ORIGIN),
        DESTINATION(3, "destination"),
        ROUTE_LONG_NAME(4, "routeLongName"),
        SUB_GROUP_ID(5, "subGroupId"),
        ON_TIME_ACCURACY_SCORE(6, "onTimeAccuracyScore");
        
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
                    return LINE_ID;
                case 2:
                    return ORIGIN;
                case 3:
                    return DESTINATION;
                case 4:
                    return ROUTE_LONG_NAME;
                case 5:
                    return SUB_GROUP_ID;
                case 6:
                    return ON_TIME_ACCURACY_SCORE;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineSummary$a */
    public static class C8791a extends C25239c<MVLineSummary> {
        public C8791a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineSummary mVLineSummary = (MVLineSummary) tBase;
            mVLineSummary.getClass();
            C25113c cVar = MVLineSummary.f25727b;
            gVar.mo61687K();
            gVar.mo61711x(MVLineSummary.f25727b);
            gVar.mo61678B(mVLineSummary.lineId);
            gVar.mo61712y();
            if (mVLineSummary.origin != null && mVLineSummary.mo27396i()) {
                gVar.mo61711x(MVLineSummary.f25728c);
                gVar.mo61686J(mVLineSummary.origin);
                gVar.mo61712y();
            }
            if (mVLineSummary.destination != null) {
                gVar.mo61711x(MVLineSummary.f25729d);
                gVar.mo61686J(mVLineSummary.destination);
                gVar.mo61712y();
            }
            if (mVLineSummary.routeLongName != null && mVLineSummary.mo27397j()) {
                gVar.mo61711x(MVLineSummary.f25730e);
                gVar.mo61686J(mVLineSummary.routeLongName);
                gVar.mo61712y();
            }
            if (mVLineSummary.mo27398k()) {
                gVar.mo61711x(MVLineSummary.f25731f);
                gVar.mo61709v(mVLineSummary.subGroupId);
                gVar.mo61712y();
            }
            if (mVLineSummary.mo27394h()) {
                gVar.mo61711x(MVLineSummary.f25732g);
                gVar.mo61678B(mVLineSummary.onTimeAccuracyScore);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineSummary mVLineSummary = (MVLineSummary) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLineSummary.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineSummary.lineId = gVar.mo61696i();
                            mVLineSummary.mo27399l();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineSummary.origin = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineSummary.destination = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineSummary.routeLongName = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 3) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineSummary.subGroupId = gVar.mo61691d();
                            mVLineSummary.mo27401o();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineSummary.onTimeAccuracyScore = gVar.mo61696i();
                            mVLineSummary.mo27400m();
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineSummary$b */
    public static class C8792b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8791a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineSummary$c */
    public static class C8793c extends C25240d<MVLineSummary> {
        public C8793c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineSummary mVLineSummary = (MVLineSummary) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLineSummary.mo27393g()) {
                bitSet.set(0);
            }
            if (mVLineSummary.mo27396i()) {
                bitSet.set(1);
            }
            if (mVLineSummary.mo27392f()) {
                bitSet.set(2);
            }
            if (mVLineSummary.mo27397j()) {
                bitSet.set(3);
            }
            if (mVLineSummary.mo27398k()) {
                bitSet.set(4);
            }
            if (mVLineSummary.mo27394h()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVLineSummary.mo27393g()) {
                jVar.mo61678B(mVLineSummary.lineId);
            }
            if (mVLineSummary.mo27396i()) {
                jVar.mo61686J(mVLineSummary.origin);
            }
            if (mVLineSummary.mo27392f()) {
                jVar.mo61686J(mVLineSummary.destination);
            }
            if (mVLineSummary.mo27397j()) {
                jVar.mo61686J(mVLineSummary.routeLongName);
            }
            if (mVLineSummary.mo27398k()) {
                jVar.mo61716P(mVLineSummary.subGroupId);
            }
            if (mVLineSummary.mo27394h()) {
                jVar.mo61678B(mVLineSummary.onTimeAccuracyScore);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineSummary mVLineSummary = (MVLineSummary) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVLineSummary.lineId = jVar.mo61696i();
                mVLineSummary.mo27399l();
            }
            if (T.get(1)) {
                mVLineSummary.origin = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVLineSummary.destination = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVLineSummary.routeLongName = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVLineSummary.subGroupId = jVar.mo61691d();
                mVLineSummary.mo27401o();
            }
            if (T.get(5)) {
                mVLineSummary.onTimeAccuracyScore = jVar.mo61696i();
                mVLineSummary.mo27400m();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineSummary$d */
    public static class C8794d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8793c(0);
        }
    }

    static {
        new C17394d0("MVLineSummary");
        HashMap hashMap = new HashMap();
        f25733h = hashMap;
        hashMap.put(C25239c.class, new C8792b());
        hashMap.put(C25240d.class, new C8794d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ORIGIN, new FieldMetaData(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DESTINATION, new FieldMetaData("destination", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ROUTE_LONG_NAME, new FieldMetaData("routeLongName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUB_GROUP_ID, new FieldMetaData("subGroupId", (byte) 2, new FieldValueMetaData((byte) 3, false)));
        enumMap.put(_Fields.ON_TIME_ACCURACY_SCORE, new FieldMetaData("onTimeAccuracyScore", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25734i = unmodifiableMap;
        FieldMetaData.m61947a(MVLineSummary.class, unmodifiableMap);
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
        ((C25238b) f25733h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25733h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVLineSummary mVLineSummary = (MVLineSummary) obj;
        if (!getClass().equals(mVLineSummary.getClass())) {
            return getClass().getName().compareTo(mVLineSummary.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27393g()).compareTo(Boolean.valueOf(mVLineSummary.mo27393g()));
        if (compareTo != 0 || ((mo27393g() && (compareTo = C25082a.m62839c(this.lineId, mVLineSummary.lineId)) != 0) || (compareTo = Boolean.valueOf(mo27396i()).compareTo(Boolean.valueOf(mVLineSummary.mo27396i()))) != 0 || ((mo27396i() && (compareTo = this.origin.compareTo(mVLineSummary.origin)) != 0) || (compareTo = Boolean.valueOf(mo27392f()).compareTo(Boolean.valueOf(mVLineSummary.mo27392f()))) != 0 || ((mo27392f() && (compareTo = this.destination.compareTo(mVLineSummary.destination)) != 0) || (compareTo = Boolean.valueOf(mo27397j()).compareTo(Boolean.valueOf(mVLineSummary.mo27397j()))) != 0 || ((mo27397j() && (compareTo = this.routeLongName.compareTo(mVLineSummary.routeLongName)) != 0) || (compareTo = Boolean.valueOf(mo27398k()).compareTo(Boolean.valueOf(mVLineSummary.mo27398k()))) != 0 || ((mo27398k() && (compareTo = C25082a.m62837a(this.subGroupId, mVLineSummary.subGroupId)) != 0) || (compareTo = Boolean.valueOf(mo27394h()).compareTo(Boolean.valueOf(mVLineSummary.mo27394h()))) != 0)))))) {
            return compareTo;
        }
        if (!mo27394h() || (c = C25082a.m62839c(this.onTimeAccuracyScore, mVLineSummary.onTimeAccuracyScore)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVLineSummary)) {
            return false;
        }
        MVLineSummary mVLineSummary = (MVLineSummary) obj;
        if (this.lineId != mVLineSummary.lineId) {
            return false;
        }
        boolean i = mo27396i();
        boolean i2 = mVLineSummary.mo27396i();
        if ((i || i2) && (!i || !i2 || !this.origin.equals(mVLineSummary.origin))) {
            return false;
        }
        boolean f = mo27392f();
        boolean f2 = mVLineSummary.mo27392f();
        if ((f || f2) && (!f || !f2 || !this.destination.equals(mVLineSummary.destination))) {
            return false;
        }
        boolean j = mo27397j();
        boolean j2 = mVLineSummary.mo27397j();
        if ((j || j2) && (!j || !j2 || !this.routeLongName.equals(mVLineSummary.routeLongName))) {
            return false;
        }
        boolean k = mo27398k();
        boolean k2 = mVLineSummary.mo27398k();
        if ((k || k2) && (!k || !k2 || this.subGroupId != mVLineSummary.subGroupId)) {
            return false;
        }
        boolean h = mo27394h();
        boolean h2 = mVLineSummary.mo27394h();
        if ((h || h2) && (!h || !h2 || this.onTimeAccuracyScore != mVLineSummary.onTimeAccuracyScore)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27392f() {
        return this.destination != null;
    }

    /* renamed from: g */
    public final boolean mo27393g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo27394h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27396i() {
        return this.origin != null;
    }

    /* renamed from: j */
    public final boolean mo27397j() {
        return this.routeLongName != null;
    }

    /* renamed from: k */
    public final boolean mo27398k() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: l */
    public final void mo27399l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: m */
    public final void mo27400m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: o */
    public final void mo27401o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLineSummary(", "lineId:");
        n.append(this.lineId);
        if (mo27396i()) {
            n.append(", ");
            n.append("origin:");
            String str = this.origin;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(", ");
        n.append("destination:");
        String str2 = this.destination;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo27397j()) {
            n.append(", ");
            n.append("routeLongName:");
            String str3 = this.routeLongName;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo27398k()) {
            n.append(", ");
            n.append("subGroupId:");
            n.append(this.subGroupId);
        }
        if (mo27394h()) {
            n.append(", ");
            n.append("onTimeAccuracyScore:");
            n.append(this.onTimeAccuracyScore);
        }
        n.append(")");
        return n.toString();
    }
}
