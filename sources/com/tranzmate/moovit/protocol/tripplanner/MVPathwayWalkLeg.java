package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVPathwayWalkLeg implements TBase<MVPathwayWalkLeg, _Fields>, Serializable, Cloneable, Comparable<MVPathwayWalkLeg> {

    /* renamed from: b */
    public static final C25113c f30018b = new C25113c("time", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f30019c = new C25113c("stopId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f30020d = new C25113c("originPathwayId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f30021e = new C25113c("destinationPathwayId", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f30022f = new C25113c("metroId", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f30023g = new C25113c("destParentStopId", (byte) 8, 6);

    /* renamed from: h */
    public static final HashMap f30024h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f30025i;
    private byte __isset_bitfield = 0;
    public int destParentStopId;
    public int destinationPathwayId;
    public int metroId;
    private _Fields[] optionals = {_Fields.ORIGIN_PATHWAY_ID, _Fields.DESTINATION_PATHWAY_ID, _Fields.METRO_ID, _Fields.DEST_PARENT_STOP_ID};
    public int originPathwayId;
    public int stopId;
    public MVTime time;

    public enum _Fields implements C25085c {
        TIME(1, "time"),
        STOP_ID(2, "stopId"),
        ORIGIN_PATHWAY_ID(3, "originPathwayId"),
        DESTINATION_PATHWAY_ID(4, "destinationPathwayId"),
        METRO_ID(5, "metroId"),
        DEST_PARENT_STOP_ID(6, "destParentStopId");
        
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
                    return TIME;
                case 2:
                    return STOP_ID;
                case 3:
                    return ORIGIN_PATHWAY_ID;
                case 4:
                    return DESTINATION_PATHWAY_ID;
                case 5:
                    return METRO_ID;
                case 6:
                    return DEST_PARENT_STOP_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVPathwayWalkLeg$a */
    public static class C11602a extends C25239c<MVPathwayWalkLeg> {
        public C11602a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPathwayWalkLeg mVPathwayWalkLeg = (MVPathwayWalkLeg) tBase;
            MVTime mVTime = mVPathwayWalkLeg.time;
            C25113c cVar = MVPathwayWalkLeg.f30018b;
            gVar.mo61687K();
            if (mVPathwayWalkLeg.time != null) {
                gVar.mo61711x(MVPathwayWalkLeg.f30018b);
                mVPathwayWalkLeg.time.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPathwayWalkLeg.f30019c);
            gVar.mo61678B(mVPathwayWalkLeg.stopId);
            gVar.mo61712y();
            if (mVPathwayWalkLeg.mo34480i()) {
                gVar.mo61711x(MVPathwayWalkLeg.f30020d);
                gVar.mo61678B(mVPathwayWalkLeg.originPathwayId);
                gVar.mo61712y();
            }
            if (mVPathwayWalkLeg.mo34477g()) {
                gVar.mo61711x(MVPathwayWalkLeg.f30021e);
                gVar.mo61678B(mVPathwayWalkLeg.destinationPathwayId);
                gVar.mo61712y();
            }
            if (mVPathwayWalkLeg.mo34478h()) {
                gVar.mo61711x(MVPathwayWalkLeg.f30022f);
                gVar.mo61678B(mVPathwayWalkLeg.metroId);
                gVar.mo61712y();
            }
            if (mVPathwayWalkLeg.mo34476f()) {
                gVar.mo61711x(MVPathwayWalkLeg.f30023g);
                gVar.mo61678B(mVPathwayWalkLeg.destParentStopId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPathwayWalkLeg mVPathwayWalkLeg = (MVPathwayWalkLeg) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTime mVTime = mVPathwayWalkLeg.time;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTime mVTime2 = new MVTime();
                            mVPathwayWalkLeg.time = mVTime2;
                            mVTime2.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPathwayWalkLeg.stopId = gVar.mo61696i();
                            mVPathwayWalkLeg.mo34487q();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPathwayWalkLeg.originPathwayId = gVar.mo61696i();
                            mVPathwayWalkLeg.mo34486p();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPathwayWalkLeg.destinationPathwayId = gVar.mo61696i();
                            mVPathwayWalkLeg.mo34484m();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPathwayWalkLeg.metroId = gVar.mo61696i();
                            mVPathwayWalkLeg.mo34485o();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPathwayWalkLeg.destParentStopId = gVar.mo61696i();
                            mVPathwayWalkLeg.mo34483l();
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVPathwayWalkLeg$b */
    public static class C11603b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11602a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVPathwayWalkLeg$c */
    public static class C11604c extends C25240d<MVPathwayWalkLeg> {
        public C11604c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPathwayWalkLeg mVPathwayWalkLeg = (MVPathwayWalkLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPathwayWalkLeg.mo34482k()) {
                bitSet.set(0);
            }
            if (mVPathwayWalkLeg.mo34481j()) {
                bitSet.set(1);
            }
            if (mVPathwayWalkLeg.mo34480i()) {
                bitSet.set(2);
            }
            if (mVPathwayWalkLeg.mo34477g()) {
                bitSet.set(3);
            }
            if (mVPathwayWalkLeg.mo34478h()) {
                bitSet.set(4);
            }
            if (mVPathwayWalkLeg.mo34476f()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVPathwayWalkLeg.mo34482k()) {
                mVPathwayWalkLeg.time.mo25202X0(jVar);
            }
            if (mVPathwayWalkLeg.mo34481j()) {
                jVar.mo61678B(mVPathwayWalkLeg.stopId);
            }
            if (mVPathwayWalkLeg.mo34480i()) {
                jVar.mo61678B(mVPathwayWalkLeg.originPathwayId);
            }
            if (mVPathwayWalkLeg.mo34477g()) {
                jVar.mo61678B(mVPathwayWalkLeg.destinationPathwayId);
            }
            if (mVPathwayWalkLeg.mo34478h()) {
                jVar.mo61678B(mVPathwayWalkLeg.metroId);
            }
            if (mVPathwayWalkLeg.mo34476f()) {
                jVar.mo61678B(mVPathwayWalkLeg.destParentStopId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPathwayWalkLeg mVPathwayWalkLeg = (MVPathwayWalkLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                MVTime mVTime = new MVTime();
                mVPathwayWalkLeg.time = mVTime;
                mVTime.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVPathwayWalkLeg.stopId = jVar.mo61696i();
                mVPathwayWalkLeg.mo34487q();
            }
            if (T.get(2)) {
                mVPathwayWalkLeg.originPathwayId = jVar.mo61696i();
                mVPathwayWalkLeg.mo34486p();
            }
            if (T.get(3)) {
                mVPathwayWalkLeg.destinationPathwayId = jVar.mo61696i();
                mVPathwayWalkLeg.mo34484m();
            }
            if (T.get(4)) {
                mVPathwayWalkLeg.metroId = jVar.mo61696i();
                mVPathwayWalkLeg.mo34485o();
            }
            if (T.get(5)) {
                mVPathwayWalkLeg.destParentStopId = jVar.mo61696i();
                mVPathwayWalkLeg.mo34483l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVPathwayWalkLeg$d */
    public static class C11605d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11604c(0);
        }
    }

    static {
        new C17394d0("MVPathwayWalkLeg");
        HashMap hashMap = new HashMap();
        f30024h = hashMap;
        hashMap.put(C25239c.class, new C11603b());
        hashMap.put(C25240d.class, new C11605d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new StructMetaData(MVTime.class)));
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ORIGIN_PATHWAY_ID, new FieldMetaData("originPathwayId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DESTINATION_PATHWAY_ID, new FieldMetaData("destinationPathwayId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.METRO_ID, new FieldMetaData("metroId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DEST_PARENT_STOP_ID, new FieldMetaData("destParentStopId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30025i = unmodifiableMap;
        FieldMetaData.m61947a(MVPathwayWalkLeg.class, unmodifiableMap);
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
        ((C25238b) f30024h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30024h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVPathwayWalkLeg mVPathwayWalkLeg = (MVPathwayWalkLeg) obj;
        if (!getClass().equals(mVPathwayWalkLeg.getClass())) {
            return getClass().getName().compareTo(mVPathwayWalkLeg.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34482k()).compareTo(Boolean.valueOf(mVPathwayWalkLeg.mo34482k()));
        if (compareTo != 0 || ((mo34482k() && (compareTo = this.time.compareTo(mVPathwayWalkLeg.time)) != 0) || (compareTo = Boolean.valueOf(mo34481j()).compareTo(Boolean.valueOf(mVPathwayWalkLeg.mo34481j()))) != 0 || ((mo34481j() && (compareTo = C25082a.m62839c(this.stopId, mVPathwayWalkLeg.stopId)) != 0) || (compareTo = Boolean.valueOf(mo34480i()).compareTo(Boolean.valueOf(mVPathwayWalkLeg.mo34480i()))) != 0 || ((mo34480i() && (compareTo = C25082a.m62839c(this.originPathwayId, mVPathwayWalkLeg.originPathwayId)) != 0) || (compareTo = Boolean.valueOf(mo34477g()).compareTo(Boolean.valueOf(mVPathwayWalkLeg.mo34477g()))) != 0 || ((mo34477g() && (compareTo = C25082a.m62839c(this.destinationPathwayId, mVPathwayWalkLeg.destinationPathwayId)) != 0) || (compareTo = Boolean.valueOf(mo34478h()).compareTo(Boolean.valueOf(mVPathwayWalkLeg.mo34478h()))) != 0 || ((mo34478h() && (compareTo = C25082a.m62839c(this.metroId, mVPathwayWalkLeg.metroId)) != 0) || (compareTo = Boolean.valueOf(mo34476f()).compareTo(Boolean.valueOf(mVPathwayWalkLeg.mo34476f()))) != 0)))))) {
            return compareTo;
        }
        if (!mo34476f() || (c = C25082a.m62839c(this.destParentStopId, mVPathwayWalkLeg.destParentStopId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPathwayWalkLeg)) {
            return false;
        }
        MVPathwayWalkLeg mVPathwayWalkLeg = (MVPathwayWalkLeg) obj;
        boolean k = mo34482k();
        boolean k2 = mVPathwayWalkLeg.mo34482k();
        if (((k || k2) && (!k || !k2 || !this.time.mo34573a(mVPathwayWalkLeg.time))) || this.stopId != mVPathwayWalkLeg.stopId) {
            return false;
        }
        boolean i = mo34480i();
        boolean i2 = mVPathwayWalkLeg.mo34480i();
        if ((i || i2) && (!i || !i2 || this.originPathwayId != mVPathwayWalkLeg.originPathwayId)) {
            return false;
        }
        boolean g = mo34477g();
        boolean g2 = mVPathwayWalkLeg.mo34477g();
        if ((g || g2) && (!g || !g2 || this.destinationPathwayId != mVPathwayWalkLeg.destinationPathwayId)) {
            return false;
        }
        boolean h = mo34478h();
        boolean h2 = mVPathwayWalkLeg.mo34478h();
        if ((h || h2) && (!h || !h2 || this.metroId != mVPathwayWalkLeg.metroId)) {
            return false;
        }
        boolean f = mo34476f();
        boolean f2 = mVPathwayWalkLeg.mo34476f();
        if ((f || f2) && (!f || !f2 || this.destParentStopId != mVPathwayWalkLeg.destParentStopId)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34476f() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: g */
    public final boolean mo34477g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo34478h() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34480i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo34481j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo34482k() {
        return this.time != null;
    }

    /* renamed from: l */
    public final void mo34483l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: m */
    public final void mo34484m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: o */
    public final void mo34485o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: p */
    public final void mo34486p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: q */
    public final void mo34487q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPathwayWalkLeg(", "time:");
        MVTime mVTime = this.time;
        if (mVTime == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTime);
        }
        n.append(", ");
        n.append("stopId:");
        n.append(this.stopId);
        if (mo34480i()) {
            n.append(", ");
            n.append("originPathwayId:");
            n.append(this.originPathwayId);
        }
        if (mo34477g()) {
            n.append(", ");
            n.append("destinationPathwayId:");
            n.append(this.destinationPathwayId);
        }
        if (mo34478h()) {
            n.append(", ");
            n.append("metroId:");
            n.append(this.metroId);
        }
        if (mo34476f()) {
            n.append(", ");
            n.append("destParentStopId:");
            n.append(this.destParentStopId);
        }
        n.append(")");
        return n.toString();
    }
}
