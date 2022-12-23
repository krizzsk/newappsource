package com.tranzmate.moovit.protocol.gtfs;

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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVLineStaticArrivals implements TBase<MVLineStaticArrivals, _Fields>, Serializable, Cloneable, Comparable<MVLineStaticArrivals> {

    /* renamed from: b */
    public static final C25113c f25719b = new C25113c("lineId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25720c = new C25113c("tripGroups", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f25721d = new C25113c("tripPatterns", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f25722e = new C25113c("tripIntervals", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f25723f = new C25113c("serviceOperation", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f25724g = new C25113c("tripShapes", (byte) 15, 6);

    /* renamed from: h */
    public static final HashMap f25725h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f25726i;
    private byte __isset_bitfield = 0;
    public int lineId;
    private _Fields[] optionals = {_Fields.SERVICE_OPERATION};
    public List<MVTripServiceOperation> serviceOperation;
    public List<MVTripGroup> tripGroups;
    public List<MVTripIntervals> tripIntervals;
    public List<MVTripPattern> tripPatterns;
    public List<MVTripShape> tripShapes;

    public enum _Fields implements C25085c {
        LINE_ID(1, "lineId"),
        TRIP_GROUPS(2, "tripGroups"),
        TRIP_PATTERNS(3, "tripPatterns"),
        TRIP_INTERVALS(4, "tripIntervals"),
        SERVICE_OPERATION(5, "serviceOperation"),
        TRIP_SHAPES(6, "tripShapes");
        
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
                    return TRIP_GROUPS;
                case 3:
                    return TRIP_PATTERNS;
                case 4:
                    return TRIP_INTERVALS;
                case 5:
                    return SERVICE_OPERATION;
                case 6:
                    return TRIP_SHAPES;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineStaticArrivals$a */
    public static class C8787a extends C25239c<MVLineStaticArrivals> {
        public C8787a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineStaticArrivals mVLineStaticArrivals = (MVLineStaticArrivals) tBase;
            mVLineStaticArrivals.getClass();
            C25113c cVar = MVLineStaticArrivals.f25719b;
            gVar.mo61687K();
            gVar.mo61711x(MVLineStaticArrivals.f25719b);
            gVar.mo61678B(mVLineStaticArrivals.lineId);
            gVar.mo61712y();
            if (mVLineStaticArrivals.tripGroups != null) {
                gVar.mo61711x(MVLineStaticArrivals.f25720c);
                gVar.mo61680D(new C25119e((byte) 12, mVLineStaticArrivals.tripGroups.size()));
                for (MVTripGroup X0 : mVLineStaticArrivals.tripGroups) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVLineStaticArrivals.tripPatterns != null) {
                gVar.mo61711x(MVLineStaticArrivals.f25721d);
                gVar.mo61680D(new C25119e((byte) 12, mVLineStaticArrivals.tripPatterns.size()));
                for (MVTripPattern X02 : mVLineStaticArrivals.tripPatterns) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVLineStaticArrivals.tripIntervals != null) {
                gVar.mo61711x(MVLineStaticArrivals.f25722e);
                gVar.mo61680D(new C25119e((byte) 12, mVLineStaticArrivals.tripIntervals.size()));
                for (MVTripIntervals X03 : mVLineStaticArrivals.tripIntervals) {
                    X03.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVLineStaticArrivals.serviceOperation != null && mVLineStaticArrivals.mo27381g()) {
                gVar.mo61711x(MVLineStaticArrivals.f25723f);
                gVar.mo61680D(new C25119e((byte) 12, mVLineStaticArrivals.serviceOperation.size()));
                for (MVTripServiceOperation X04 : mVLineStaticArrivals.serviceOperation) {
                    X04.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVLineStaticArrivals.tripShapes != null) {
                gVar.mo61711x(MVLineStaticArrivals.f25724g);
                gVar.mo61680D(new C25119e((byte) 12, mVLineStaticArrivals.tripShapes.size()));
                for (MVTripShape X05 : mVLineStaticArrivals.tripShapes) {
                    X05.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineStaticArrivals mVLineStaticArrivals = (MVLineStaticArrivals) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLineStaticArrivals.getClass();
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineStaticArrivals.lineId = gVar.mo61696i();
                            mVLineStaticArrivals.mo27387l();
                            break;
                        }
                    case 2:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVLineStaticArrivals.tripGroups = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVTripGroup mVTripGroup = new MVTripGroup();
                                mVTripGroup.mo25201C1(gVar);
                                mVLineStaticArrivals.tripGroups.add(mVTripGroup);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 3:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVLineStaticArrivals.tripPatterns = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                MVTripPattern mVTripPattern = new MVTripPattern();
                                mVTripPattern.mo25201C1(gVar);
                                mVLineStaticArrivals.tripPatterns.add(mVTripPattern);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 4:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k3 = gVar.mo61698k();
                            mVLineStaticArrivals.tripIntervals = new ArrayList(k3.f63395b);
                            while (i < k3.f63395b) {
                                MVTripIntervals mVTripIntervals = new MVTripIntervals();
                                mVTripIntervals.mo25201C1(gVar);
                                mVLineStaticArrivals.tripIntervals.add(mVTripIntervals);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k4 = gVar.mo61698k();
                            mVLineStaticArrivals.serviceOperation = new ArrayList(k4.f63395b);
                            while (i < k4.f63395b) {
                                MVTripServiceOperation mVTripServiceOperation = new MVTripServiceOperation();
                                mVTripServiceOperation.mo25201C1(gVar);
                                mVLineStaticArrivals.serviceOperation.add(mVTripServiceOperation);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k5 = gVar.mo61698k();
                            mVLineStaticArrivals.tripShapes = new ArrayList(k5.f63395b);
                            while (i < k5.f63395b) {
                                MVTripShape mVTripShape = new MVTripShape();
                                mVTripShape.mo25201C1(gVar);
                                mVLineStaticArrivals.tripShapes.add(mVTripShape);
                                i++;
                            }
                            gVar.mo61699l();
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineStaticArrivals$b */
    public static class C8788b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8787a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineStaticArrivals$c */
    public static class C8789c extends C25240d<MVLineStaticArrivals> {
        public C8789c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineStaticArrivals mVLineStaticArrivals = (MVLineStaticArrivals) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLineStaticArrivals.mo27380f()) {
                bitSet.set(0);
            }
            if (mVLineStaticArrivals.mo27382h()) {
                bitSet.set(1);
            }
            if (mVLineStaticArrivals.mo27385j()) {
                bitSet.set(2);
            }
            if (mVLineStaticArrivals.mo27384i()) {
                bitSet.set(3);
            }
            if (mVLineStaticArrivals.mo27381g()) {
                bitSet.set(4);
            }
            if (mVLineStaticArrivals.mo27386k()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVLineStaticArrivals.mo27380f()) {
                jVar.mo61678B(mVLineStaticArrivals.lineId);
            }
            if (mVLineStaticArrivals.mo27382h()) {
                jVar.mo61678B(mVLineStaticArrivals.tripGroups.size());
                for (MVTripGroup X0 : mVLineStaticArrivals.tripGroups) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVLineStaticArrivals.mo27385j()) {
                jVar.mo61678B(mVLineStaticArrivals.tripPatterns.size());
                for (MVTripPattern X02 : mVLineStaticArrivals.tripPatterns) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVLineStaticArrivals.mo27384i()) {
                jVar.mo61678B(mVLineStaticArrivals.tripIntervals.size());
                for (MVTripIntervals X03 : mVLineStaticArrivals.tripIntervals) {
                    X03.mo25202X0(jVar);
                }
            }
            if (mVLineStaticArrivals.mo27381g()) {
                jVar.mo61678B(mVLineStaticArrivals.serviceOperation.size());
                for (MVTripServiceOperation X04 : mVLineStaticArrivals.serviceOperation) {
                    X04.mo25202X0(jVar);
                }
            }
            if (mVLineStaticArrivals.mo27386k()) {
                jVar.mo61678B(mVLineStaticArrivals.tripShapes.size());
                for (MVTripShape X05 : mVLineStaticArrivals.tripShapes) {
                    X05.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineStaticArrivals mVLineStaticArrivals = (MVLineStaticArrivals) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVLineStaticArrivals.lineId = jVar.mo61696i();
                mVLineStaticArrivals.mo27387l();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVLineStaticArrivals.tripGroups = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTripGroup mVTripGroup = new MVTripGroup();
                    mVTripGroup.mo25201C1(jVar);
                    mVLineStaticArrivals.tripGroups.add(mVTripGroup);
                }
            }
            if (T.get(2)) {
                int i3 = jVar.mo61696i();
                mVLineStaticArrivals.tripPatterns = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVTripPattern mVTripPattern = new MVTripPattern();
                    mVTripPattern.mo25201C1(jVar);
                    mVLineStaticArrivals.tripPatterns.add(mVTripPattern);
                }
            }
            if (T.get(3)) {
                int i5 = jVar.mo61696i();
                mVLineStaticArrivals.tripIntervals = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    MVTripIntervals mVTripIntervals = new MVTripIntervals();
                    mVTripIntervals.mo25201C1(jVar);
                    mVLineStaticArrivals.tripIntervals.add(mVTripIntervals);
                }
            }
            if (T.get(4)) {
                int i7 = jVar.mo61696i();
                mVLineStaticArrivals.serviceOperation = new ArrayList(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    MVTripServiceOperation mVTripServiceOperation = new MVTripServiceOperation();
                    mVTripServiceOperation.mo25201C1(jVar);
                    mVLineStaticArrivals.serviceOperation.add(mVTripServiceOperation);
                }
            }
            if (T.get(5)) {
                int i9 = jVar.mo61696i();
                mVLineStaticArrivals.tripShapes = new ArrayList(i9);
                for (int i11 = 0; i11 < i9; i11++) {
                    MVTripShape mVTripShape = new MVTripShape();
                    mVTripShape.mo25201C1(jVar);
                    mVLineStaticArrivals.tripShapes.add(mVTripShape);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineStaticArrivals$d */
    public static class C8790d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8789c(0);
        }
    }

    static {
        new C17394d0("MVLineStaticArrivals");
        HashMap hashMap = new HashMap();
        f25725h = hashMap;
        hashMap.put(C25239c.class, new C8788b());
        hashMap.put(C25240d.class, new C8790d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TRIP_GROUPS, new FieldMetaData("tripGroups", (byte) 3, new ListMetaData(new StructMetaData(MVTripGroup.class))));
        enumMap.put(_Fields.TRIP_PATTERNS, new FieldMetaData("tripPatterns", (byte) 3, new ListMetaData(new StructMetaData(MVTripPattern.class))));
        enumMap.put(_Fields.TRIP_INTERVALS, new FieldMetaData("tripIntervals", (byte) 3, new ListMetaData(new StructMetaData(MVTripIntervals.class))));
        enumMap.put(_Fields.SERVICE_OPERATION, new FieldMetaData("serviceOperation", (byte) 2, new ListMetaData(new StructMetaData(MVTripServiceOperation.class))));
        enumMap.put(_Fields.TRIP_SHAPES, new FieldMetaData("tripShapes", (byte) 3, new ListMetaData(new StructMetaData(MVTripShape.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25726i = unmodifiableMap;
        FieldMetaData.m61947a(MVLineStaticArrivals.class, unmodifiableMap);
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
        ((C25238b) f25725h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25725h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVLineStaticArrivals mVLineStaticArrivals = (MVLineStaticArrivals) obj;
        if (!getClass().equals(mVLineStaticArrivals.getClass())) {
            return getClass().getName().compareTo(mVLineStaticArrivals.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27380f()).compareTo(Boolean.valueOf(mVLineStaticArrivals.mo27380f()));
        if (compareTo != 0 || ((mo27380f() && (compareTo = C25082a.m62839c(this.lineId, mVLineStaticArrivals.lineId)) != 0) || (compareTo = Boolean.valueOf(mo27382h()).compareTo(Boolean.valueOf(mVLineStaticArrivals.mo27382h()))) != 0 || ((mo27382h() && (compareTo = C25082a.m62844h(this.tripGroups, mVLineStaticArrivals.tripGroups)) != 0) || (compareTo = Boolean.valueOf(mo27385j()).compareTo(Boolean.valueOf(mVLineStaticArrivals.mo27385j()))) != 0 || ((mo27385j() && (compareTo = C25082a.m62844h(this.tripPatterns, mVLineStaticArrivals.tripPatterns)) != 0) || (compareTo = Boolean.valueOf(mo27384i()).compareTo(Boolean.valueOf(mVLineStaticArrivals.mo27384i()))) != 0 || ((mo27384i() && (compareTo = C25082a.m62844h(this.tripIntervals, mVLineStaticArrivals.tripIntervals)) != 0) || (compareTo = Boolean.valueOf(mo27381g()).compareTo(Boolean.valueOf(mVLineStaticArrivals.mo27381g()))) != 0 || ((mo27381g() && (compareTo = C25082a.m62844h(this.serviceOperation, mVLineStaticArrivals.serviceOperation)) != 0) || (compareTo = Boolean.valueOf(mo27386k()).compareTo(Boolean.valueOf(mVLineStaticArrivals.mo27386k()))) != 0)))))) {
            return compareTo;
        }
        if (!mo27386k() || (h = C25082a.m62844h(this.tripShapes, mVLineStaticArrivals.tripShapes)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVLineStaticArrivals)) {
            return false;
        }
        MVLineStaticArrivals mVLineStaticArrivals = (MVLineStaticArrivals) obj;
        if (this.lineId != mVLineStaticArrivals.lineId) {
            return false;
        }
        boolean h = mo27382h();
        boolean h2 = mVLineStaticArrivals.mo27382h();
        if ((h || h2) && (!h || !h2 || !this.tripGroups.equals(mVLineStaticArrivals.tripGroups))) {
            return false;
        }
        boolean j = mo27385j();
        boolean j2 = mVLineStaticArrivals.mo27385j();
        if ((j || j2) && (!j || !j2 || !this.tripPatterns.equals(mVLineStaticArrivals.tripPatterns))) {
            return false;
        }
        boolean i = mo27384i();
        boolean i2 = mVLineStaticArrivals.mo27384i();
        if ((i || i2) && (!i || !i2 || !this.tripIntervals.equals(mVLineStaticArrivals.tripIntervals))) {
            return false;
        }
        boolean g = mo27381g();
        boolean g2 = mVLineStaticArrivals.mo27381g();
        if ((g || g2) && (!g || !g2 || !this.serviceOperation.equals(mVLineStaticArrivals.serviceOperation))) {
            return false;
        }
        boolean k = mo27386k();
        boolean k2 = mVLineStaticArrivals.mo27386k();
        if ((k || k2) && (!k || !k2 || !this.tripShapes.equals(mVLineStaticArrivals.tripShapes))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27380f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo27381g() {
        return this.serviceOperation != null;
    }

    /* renamed from: h */
    public final boolean mo27382h() {
        return this.tripGroups != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27384i() {
        return this.tripIntervals != null;
    }

    /* renamed from: j */
    public final boolean mo27385j() {
        return this.tripPatterns != null;
    }

    /* renamed from: k */
    public final boolean mo27386k() {
        return this.tripShapes != null;
    }

    /* renamed from: l */
    public final void mo27387l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLineStaticArrivals(", "lineId:");
        C0016g.m42z(n, this.lineId, ", ", "tripGroups:");
        List<MVTripGroup> list = this.tripGroups;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("tripPatterns:");
        List<MVTripPattern> list2 = this.tripPatterns;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(", ");
        n.append("tripIntervals:");
        List<MVTripIntervals> list3 = this.tripIntervals;
        if (list3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list3);
        }
        if (mo27381g()) {
            n.append(", ");
            n.append("serviceOperation:");
            List<MVTripServiceOperation> list4 = this.serviceOperation;
            if (list4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list4);
            }
        }
        n.append(", ");
        n.append("tripShapes:");
        List<MVTripShape> list5 = this.tripShapes;
        if (list5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list5);
        }
        n.append(")");
        return n.toString();
    }
}
