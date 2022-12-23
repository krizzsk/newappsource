package com.tranzmate.moovit.protocol.checkin;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVGeofence;
import com.tranzmate.moovit.protocol.reports.MVReportMode;
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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVCheckin implements TBase<MVCheckin, _Fields>, Serializable, Cloneable, Comparable<MVCheckin> {

    /* renamed from: b */
    public static final C25113c f24922b = new C25113c("guid", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f24923c = new C25113c("arePathsReliable", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f24924d = new C25113c("nextRefreshSecs", (byte) 6, 3);

    /* renamed from: e */
    public static final C25113c f24925e = new C25113c("shapes", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f24926f = new C25113c("destinationStopId", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f24927g = new C25113c("criticalAreas", (byte) 15, 6);

    /* renamed from: h */
    public static final C25113c f24928h = new C25113c("relativeExpirationSeconds", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f24929i = new C25113c("reliableStartingPoint", (byte) 2, 8);

    /* renamed from: j */
    public static final C25113c f24930j = new C25113c("reportMode", (byte) 8, 9);

    /* renamed from: k */
    public static final C25113c f24931k = new C25113c("pendingFixExpirationTimeMinutes", (byte) 3, 10);

    /* renamed from: l */
    public static final HashMap f24932l;

    /* renamed from: m */
    public static final Map<_Fields, FieldMetaData> f24933m;
    private byte __isset_bitfield = 0;
    public boolean arePathsReliable;
    public List<MVGeofence> criticalAreas;
    public int destinationStopId;
    public String guid;
    public short nextRefreshSecs;
    public byte pendingFixExpirationTimeMinutes;
    public int relativeExpirationSeconds;
    public boolean reliableStartingPoint;
    public MVReportMode reportMode;
    public List<MVShape> shapes;

    public enum _Fields implements C25085c {
        GUID(1, "guid"),
        ARE_PATHS_RELIABLE(2, "arePathsReliable"),
        NEXT_REFRESH_SECS(3, "nextRefreshSecs"),
        SHAPES(4, "shapes"),
        DESTINATION_STOP_ID(5, "destinationStopId"),
        CRITICAL_AREAS(6, "criticalAreas"),
        RELATIVE_EXPIRATION_SECONDS(7, "relativeExpirationSeconds"),
        RELIABLE_STARTING_POINT(8, "reliableStartingPoint"),
        REPORT_MODE(9, "reportMode"),
        PENDING_FIX_EXPIRATION_TIME_MINUTES(10, "pendingFixExpirationTimeMinutes");
        
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
                    return GUID;
                case 2:
                    return ARE_PATHS_RELIABLE;
                case 3:
                    return NEXT_REFRESH_SECS;
                case 4:
                    return SHAPES;
                case 5:
                    return DESTINATION_STOP_ID;
                case 6:
                    return CRITICAL_AREAS;
                case 7:
                    return RELATIVE_EXPIRATION_SECONDS;
                case 8:
                    return RELIABLE_STARTING_POINT;
                case 9:
                    return REPORT_MODE;
                case 10:
                    return PENDING_FIX_EXPIRATION_TIME_MINUTES;
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

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVCheckin$a */
    public static class C8340a extends C25239c<MVCheckin> {
        public C8340a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCheckin mVCheckin = (MVCheckin) tBase;
            mVCheckin.getClass();
            C25113c cVar = MVCheckin.f24922b;
            gVar.mo61687K();
            if (mVCheckin.guid != null) {
                gVar.mo61711x(MVCheckin.f24922b);
                gVar.mo61686J(mVCheckin.guid);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCheckin.f24923c);
            gVar.mo61708u(mVCheckin.arePathsReliable);
            gVar.mo61712y();
            gVar.mo61711x(MVCheckin.f24924d);
            gVar.mo61677A(mVCheckin.nextRefreshSecs);
            gVar.mo61712y();
            if (mVCheckin.shapes != null) {
                gVar.mo61711x(MVCheckin.f24925e);
                gVar.mo61680D(new C25119e((byte) 12, mVCheckin.shapes.size()));
                for (MVShape X0 : mVCheckin.shapes) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCheckin.f24926f);
            gVar.mo61678B(mVCheckin.destinationStopId);
            gVar.mo61712y();
            if (mVCheckin.criticalAreas != null) {
                gVar.mo61711x(MVCheckin.f24927g);
                gVar.mo61680D(new C25119e((byte) 12, mVCheckin.criticalAreas.size()));
                for (MVGeofence X02 : mVCheckin.criticalAreas) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCheckin.f24928h);
            gVar.mo61678B(mVCheckin.relativeExpirationSeconds);
            gVar.mo61712y();
            gVar.mo61711x(MVCheckin.f24929i);
            gVar.mo61708u(mVCheckin.reliableStartingPoint);
            gVar.mo61712y();
            if (mVCheckin.reportMode != null) {
                gVar.mo61711x(MVCheckin.f24930j);
                gVar.mo61678B(mVCheckin.reportMode.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCheckin.f24931k);
            gVar.mo61709v(mVCheckin.pendingFixExpirationTimeMinutes);
            gVar.mo61712y();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCheckin mVCheckin = (MVCheckin) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCheckin.getClass();
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCheckin.guid = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCheckin.arePathsReliable = gVar.mo61690c();
                            mVCheckin.mo25993q();
                            break;
                        }
                    case 3:
                        if (b != 6) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCheckin.nextRefreshSecs = gVar.mo61695h();
                            mVCheckin.mo25995s();
                            break;
                        }
                    case 4:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVCheckin.shapes = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVShape mVShape = new MVShape();
                                mVShape.mo25201C1(gVar);
                                mVCheckin.shapes.add(mVShape);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCheckin.destinationStopId = gVar.mo61696i();
                            mVCheckin.mo25994r();
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVCheckin.criticalAreas = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                MVGeofence mVGeofence = new MVGeofence();
                                mVGeofence.mo25201C1(gVar);
                                mVCheckin.criticalAreas.add(mVGeofence);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCheckin.relativeExpirationSeconds = gVar.mo61696i();
                            mVCheckin.mo25998u();
                            break;
                        }
                    case 8:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCheckin.reliableStartingPoint = gVar.mo61690c();
                            mVCheckin.mo25999v();
                            break;
                        }
                    case 9:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCheckin.reportMode = MVReportMode.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 10:
                        if (b != 3) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCheckin.pendingFixExpirationTimeMinutes = gVar.mo61691d();
                            mVCheckin.mo25996t();
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

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVCheckin$b */
    public static class C8341b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8340a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVCheckin$c */
    public static class C8342c extends C25240d<MVCheckin> {
        public C8342c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCheckin mVCheckin = (MVCheckin) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCheckin.mo25986i()) {
                bitSet.set(0);
            }
            if (mVCheckin.mo25982f()) {
                bitSet.set(1);
            }
            if (mVCheckin.mo25987j()) {
                bitSet.set(2);
            }
            if (mVCheckin.mo25992p()) {
                bitSet.set(3);
            }
            if (mVCheckin.mo25984h()) {
                bitSet.set(4);
            }
            if (mVCheckin.mo25983g()) {
                bitSet.set(5);
            }
            if (mVCheckin.mo25989l()) {
                bitSet.set(6);
            }
            if (mVCheckin.mo25990m()) {
                bitSet.set(7);
            }
            if (mVCheckin.mo25991o()) {
                bitSet.set(8);
            }
            if (mVCheckin.mo25988k()) {
                bitSet.set(9);
            }
            jVar.mo61738U(bitSet, 10);
            if (mVCheckin.mo25986i()) {
                jVar.mo61686J(mVCheckin.guid);
            }
            if (mVCheckin.mo25982f()) {
                jVar.mo61708u(mVCheckin.arePathsReliable);
            }
            if (mVCheckin.mo25987j()) {
                jVar.mo61677A(mVCheckin.nextRefreshSecs);
            }
            if (mVCheckin.mo25992p()) {
                jVar.mo61678B(mVCheckin.shapes.size());
                for (MVShape X0 : mVCheckin.shapes) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVCheckin.mo25984h()) {
                jVar.mo61678B(mVCheckin.destinationStopId);
            }
            if (mVCheckin.mo25983g()) {
                jVar.mo61678B(mVCheckin.criticalAreas.size());
                for (MVGeofence X02 : mVCheckin.criticalAreas) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVCheckin.mo25989l()) {
                jVar.mo61678B(mVCheckin.relativeExpirationSeconds);
            }
            if (mVCheckin.mo25990m()) {
                jVar.mo61708u(mVCheckin.reliableStartingPoint);
            }
            if (mVCheckin.mo25991o()) {
                jVar.mo61678B(mVCheckin.reportMode.getValue());
            }
            if (mVCheckin.mo25988k()) {
                jVar.mo61716P(mVCheckin.pendingFixExpirationTimeMinutes);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCheckin mVCheckin = (MVCheckin) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(10);
            if (T.get(0)) {
                mVCheckin.guid = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVCheckin.arePathsReliable = jVar.mo61690c();
                mVCheckin.mo25993q();
            }
            if (T.get(2)) {
                mVCheckin.nextRefreshSecs = jVar.mo61695h();
                mVCheckin.mo25995s();
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVCheckin.shapes = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVShape mVShape = new MVShape();
                    mVShape.mo25201C1(jVar);
                    mVCheckin.shapes.add(mVShape);
                }
            }
            if (T.get(4)) {
                mVCheckin.destinationStopId = jVar.mo61696i();
                mVCheckin.mo25994r();
            }
            if (T.get(5)) {
                int i3 = jVar.mo61696i();
                mVCheckin.criticalAreas = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVGeofence mVGeofence = new MVGeofence();
                    mVGeofence.mo25201C1(jVar);
                    mVCheckin.criticalAreas.add(mVGeofence);
                }
            }
            if (T.get(6)) {
                mVCheckin.relativeExpirationSeconds = jVar.mo61696i();
                mVCheckin.mo25998u();
            }
            if (T.get(7)) {
                mVCheckin.reliableStartingPoint = jVar.mo61690c();
                mVCheckin.mo25999v();
            }
            if (T.get(8)) {
                mVCheckin.reportMode = MVReportMode.findByValue(jVar.mo61696i());
            }
            if (T.get(9)) {
                mVCheckin.pendingFixExpirationTimeMinutes = jVar.mo61691d();
                mVCheckin.mo25996t();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVCheckin$d */
    public static class C8343d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8342c(0);
        }
    }

    static {
        new C17394d0("MVCheckin");
        HashMap hashMap = new HashMap();
        f24932l = hashMap;
        hashMap.put(C25239c.class, new C8341b());
        hashMap.put(C25240d.class, new C8343d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.GUID, new FieldMetaData("guid", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ARE_PATHS_RELIABLE, new FieldMetaData("arePathsReliable", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.NEXT_REFRESH_SECS, new FieldMetaData("nextRefreshSecs", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.SHAPES, new FieldMetaData("shapes", (byte) 3, new ListMetaData(new StructMetaData(MVShape.class))));
        enumMap.put(_Fields.DESTINATION_STOP_ID, new FieldMetaData("destinationStopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CRITICAL_AREAS, new FieldMetaData("criticalAreas", (byte) 3, new ListMetaData(new StructMetaData(MVGeofence.class))));
        enumMap.put(_Fields.RELATIVE_EXPIRATION_SECONDS, new FieldMetaData("relativeExpirationSeconds", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.RELIABLE_STARTING_POINT, new FieldMetaData("reliableStartingPoint", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.REPORT_MODE, new FieldMetaData("reportMode", (byte) 3, new EnumMetaData(MVReportMode.class)));
        enumMap.put(_Fields.PENDING_FIX_EXPIRATION_TIME_MINUTES, new FieldMetaData("pendingFixExpirationTimeMinutes", (byte) 3, new FieldValueMetaData((byte) 3, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24933m = unmodifiableMap;
        FieldMetaData.m61947a(MVCheckin.class, unmodifiableMap);
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
        ((C25238b) f24932l.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24932l.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25979a(MVCheckin mVCheckin) {
        if (mVCheckin == null) {
            return false;
        }
        boolean i = mo25986i();
        boolean i2 = mVCheckin.mo25986i();
        if (((i || i2) && (!i || !i2 || !this.guid.equals(mVCheckin.guid))) || this.arePathsReliable != mVCheckin.arePathsReliable || this.nextRefreshSecs != mVCheckin.nextRefreshSecs) {
            return false;
        }
        boolean p = mo25992p();
        boolean p2 = mVCheckin.mo25992p();
        if (((p || p2) && (!p || !p2 || !this.shapes.equals(mVCheckin.shapes))) || this.destinationStopId != mVCheckin.destinationStopId) {
            return false;
        }
        boolean g = mo25983g();
        boolean g2 = mVCheckin.mo25983g();
        if (((g || g2) && (!g || !g2 || !this.criticalAreas.equals(mVCheckin.criticalAreas))) || this.relativeExpirationSeconds != mVCheckin.relativeExpirationSeconds || this.reliableStartingPoint != mVCheckin.reliableStartingPoint) {
            return false;
        }
        boolean o = mo25991o();
        boolean o2 = mVCheckin.mo25991o();
        if (((o || o2) && (!o || !o2 || !this.reportMode.equals(mVCheckin.reportMode))) || this.pendingFixExpirationTimeMinutes != mVCheckin.pendingFixExpirationTimeMinutes) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int a;
        MVCheckin mVCheckin = (MVCheckin) obj;
        if (!getClass().equals(mVCheckin.getClass())) {
            return getClass().getName().compareTo(mVCheckin.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25986i()).compareTo(Boolean.valueOf(mVCheckin.mo25986i()));
        if (compareTo != 0 || ((mo25986i() && (compareTo = this.guid.compareTo(mVCheckin.guid)) != 0) || (compareTo = Boolean.valueOf(mo25982f()).compareTo(Boolean.valueOf(mVCheckin.mo25982f()))) != 0 || ((mo25982f() && (compareTo = C25082a.m62848l(this.arePathsReliable, mVCheckin.arePathsReliable)) != 0) || (compareTo = Boolean.valueOf(mo25987j()).compareTo(Boolean.valueOf(mVCheckin.mo25987j()))) != 0 || ((mo25987j() && (compareTo = C25082a.m62847k(this.nextRefreshSecs, mVCheckin.nextRefreshSecs)) != 0) || (compareTo = Boolean.valueOf(mo25992p()).compareTo(Boolean.valueOf(mVCheckin.mo25992p()))) != 0 || ((mo25992p() && (compareTo = C25082a.m62844h(this.shapes, mVCheckin.shapes)) != 0) || (compareTo = Boolean.valueOf(mo25984h()).compareTo(Boolean.valueOf(mVCheckin.mo25984h()))) != 0 || ((mo25984h() && (compareTo = C25082a.m62839c(this.destinationStopId, mVCheckin.destinationStopId)) != 0) || (compareTo = Boolean.valueOf(mo25983g()).compareTo(Boolean.valueOf(mVCheckin.mo25983g()))) != 0 || ((mo25983g() && (compareTo = C25082a.m62844h(this.criticalAreas, mVCheckin.criticalAreas)) != 0) || (compareTo = Boolean.valueOf(mo25989l()).compareTo(Boolean.valueOf(mVCheckin.mo25989l()))) != 0 || ((mo25989l() && (compareTo = C25082a.m62839c(this.relativeExpirationSeconds, mVCheckin.relativeExpirationSeconds)) != 0) || (compareTo = Boolean.valueOf(mo25990m()).compareTo(Boolean.valueOf(mVCheckin.mo25990m()))) != 0 || ((mo25990m() && (compareTo = C25082a.m62848l(this.reliableStartingPoint, mVCheckin.reliableStartingPoint)) != 0) || (compareTo = Boolean.valueOf(mo25991o()).compareTo(Boolean.valueOf(mVCheckin.mo25991o()))) != 0 || ((mo25991o() && (compareTo = this.reportMode.compareTo(mVCheckin.reportMode)) != 0) || (compareTo = Boolean.valueOf(mo25988k()).compareTo(Boolean.valueOf(mVCheckin.mo25988k()))) != 0)))))))))) {
            return compareTo;
        }
        if (!mo25988k() || (a = C25082a.m62837a(this.pendingFixExpirationTimeMinutes, mVCheckin.pendingFixExpirationTimeMinutes)) == 0) {
            return 0;
        }
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVCheckin)) {
            return mo25979a((MVCheckin) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25982f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo25983g() {
        return this.criticalAreas != null;
    }

    /* renamed from: h */
    public final boolean mo25984h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25986i() {
        return this.guid != null;
    }

    /* renamed from: j */
    public final boolean mo25987j() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: k */
    public final boolean mo25988k() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: l */
    public final boolean mo25989l() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: m */
    public final boolean mo25990m() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: o */
    public final boolean mo25991o() {
        return this.reportMode != null;
    }

    /* renamed from: p */
    public final boolean mo25992p() {
        return this.shapes != null;
    }

    /* renamed from: q */
    public final void mo25993q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: r */
    public final void mo25994r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: s */
    public final void mo25995s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: t */
    public final void mo25996t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCheckin(", "guid:");
        String str = this.guid;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("arePathsReliable:");
        C13555b.m33977q(n, this.arePathsReliable, ", ", "nextRefreshSecs:");
        C0016g.m42z(n, this.nextRefreshSecs, ", ", "shapes:");
        List<MVShape> list = this.shapes;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("destinationStopId:");
        C0016g.m42z(n, this.destinationStopId, ", ", "criticalAreas:");
        List<MVGeofence> list2 = this.criticalAreas;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(", ");
        n.append("relativeExpirationSeconds:");
        C0016g.m42z(n, this.relativeExpirationSeconds, ", ", "reliableStartingPoint:");
        C13555b.m33977q(n, this.reliableStartingPoint, ", ", "reportMode:");
        MVReportMode mVReportMode = this.reportMode;
        if (mVReportMode == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVReportMode);
        }
        n.append(", ");
        n.append("pendingFixExpirationTimeMinutes:");
        return C13437d.m33707l(n, this.pendingFixExpirationTimeMinutes, ")");
    }

    /* renamed from: u */
    public final void mo25998u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: v */
    public final void mo25999v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }
}
