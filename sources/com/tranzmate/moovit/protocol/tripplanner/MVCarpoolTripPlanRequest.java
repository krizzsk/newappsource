package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVRouteType;
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
import p001a0.C0017h;
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

public class MVCarpoolTripPlanRequest implements TBase<MVCarpoolTripPlanRequest, _Fields>, Serializable, Cloneable, Comparable<MVCarpoolTripPlanRequest> {

    /* renamed from: b */
    public static final C25113c f29866b = new C25113c("tripPlanPref", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29867c = new C25113c("time", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f29868d = new C25113c("timeType", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f29869e = new C25113c("currentTimeSelected", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f29870f = new C25113c("routeTypes", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f29871g = new C25113c("fromLocation", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f29872h = new C25113c("toLocation", (byte) 12, 7);

    /* renamed from: i */
    public static final C25113c f29873i = new C25113c("smartTripPlanRequest", (byte) 2, 8);

    /* renamed from: j */
    public static final HashMap f29874j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f29875k;
    private byte __isset_bitfield = 0;
    public boolean currentTimeSelected;
    public MVLocationTarget fromLocation;
    public List<MVRouteType> routeTypes;
    public boolean smartTripPlanRequest;
    public long time;
    public MVTimeType timeType;
    public MVLocationTarget toLocation;
    public MVTripPlanPref tripPlanPref;

    public enum _Fields implements C25085c {
        TRIP_PLAN_PREF(1, "tripPlanPref"),
        TIME(2, "time"),
        TIME_TYPE(3, "timeType"),
        CURRENT_TIME_SELECTED(4, "currentTimeSelected"),
        ROUTE_TYPES(5, "routeTypes"),
        FROM_LOCATION(6, "fromLocation"),
        TO_LOCATION(7, "toLocation"),
        SMART_TRIP_PLAN_REQUEST(8, "smartTripPlanRequest");
        
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
                    return TRIP_PLAN_PREF;
                case 2:
                    return TIME;
                case 3:
                    return TIME_TYPE;
                case 4:
                    return CURRENT_TIME_SELECTED;
                case 5:
                    return ROUTE_TYPES;
                case 6:
                    return FROM_LOCATION;
                case 7:
                    return TO_LOCATION;
                case 8:
                    return SMART_TRIP_PLAN_REQUEST;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVCarpoolTripPlanRequest$a */
    public static class C11517a extends C25239c<MVCarpoolTripPlanRequest> {
        public C11517a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarpoolTripPlanRequest mVCarpoolTripPlanRequest = (MVCarpoolTripPlanRequest) tBase;
            MVLocationTarget mVLocationTarget = mVCarpoolTripPlanRequest.fromLocation;
            if (mVLocationTarget != null) {
                mVLocationTarget.mo34391h();
            }
            MVLocationTarget mVLocationTarget2 = mVCarpoolTripPlanRequest.toLocation;
            if (mVLocationTarget2 != null) {
                mVLocationTarget2.mo34391h();
            }
            C25113c cVar = MVCarpoolTripPlanRequest.f29866b;
            gVar.mo61687K();
            if (mVCarpoolTripPlanRequest.tripPlanPref != null) {
                gVar.mo61711x(MVCarpoolTripPlanRequest.f29866b);
                gVar.mo61678B(mVCarpoolTripPlanRequest.tripPlanPref.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCarpoolTripPlanRequest.f29867c);
            gVar.mo61679C(mVCarpoolTripPlanRequest.time);
            gVar.mo61712y();
            if (mVCarpoolTripPlanRequest.timeType != null) {
                gVar.mo61711x(MVCarpoolTripPlanRequest.f29868d);
                gVar.mo61678B(mVCarpoolTripPlanRequest.timeType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCarpoolTripPlanRequest.f29869e);
            gVar.mo61708u(mVCarpoolTripPlanRequest.currentTimeSelected);
            gVar.mo61712y();
            if (mVCarpoolTripPlanRequest.routeTypes != null) {
                gVar.mo61711x(MVCarpoolTripPlanRequest.f29870f);
                gVar.mo61680D(new C25119e((byte) 8, mVCarpoolTripPlanRequest.routeTypes.size()));
                for (MVRouteType value : mVCarpoolTripPlanRequest.routeTypes) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVCarpoolTripPlanRequest.fromLocation != null) {
                gVar.mo61711x(MVCarpoolTripPlanRequest.f29871g);
                mVCarpoolTripPlanRequest.fromLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCarpoolTripPlanRequest.toLocation != null) {
                gVar.mo61711x(MVCarpoolTripPlanRequest.f29872h);
                mVCarpoolTripPlanRequest.toLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCarpoolTripPlanRequest.f29873i);
            C0017h.m62S(gVar, mVCarpoolTripPlanRequest.smartTripPlanRequest);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarpoolTripPlanRequest mVCarpoolTripPlanRequest = (MVCarpoolTripPlanRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLocationTarget mVLocationTarget = mVCarpoolTripPlanRequest.fromLocation;
                    if (mVLocationTarget != null) {
                        mVLocationTarget.mo34391h();
                    }
                    MVLocationTarget mVLocationTarget2 = mVCarpoolTripPlanRequest.toLocation;
                    if (mVLocationTarget2 != null) {
                        mVLocationTarget2.mo34391h();
                        return;
                    }
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolTripPlanRequest.tripPlanPref = MVTripPlanPref.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 2:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolTripPlanRequest.time = gVar.mo61697j();
                            mVCarpoolTripPlanRequest.mo34231q();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolTripPlanRequest.timeType = MVTimeType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 4:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolTripPlanRequest.currentTimeSelected = gVar.mo61690c();
                            mVCarpoolTripPlanRequest.mo34229o();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVCarpoolTripPlanRequest.routeTypes = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                mVCarpoolTripPlanRequest.routeTypes.add(MVRouteType.findByValue(gVar.mo61696i()));
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationTarget mVLocationTarget3 = new MVLocationTarget();
                            mVCarpoolTripPlanRequest.fromLocation = mVLocationTarget3;
                            mVLocationTarget3.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationTarget mVLocationTarget4 = new MVLocationTarget();
                            mVCarpoolTripPlanRequest.toLocation = mVLocationTarget4;
                            mVLocationTarget4.mo25201C1(gVar);
                            break;
                        }
                    case 8:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarpoolTripPlanRequest.smartTripPlanRequest = gVar.mo61690c();
                            mVCarpoolTripPlanRequest.mo34230p();
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVCarpoolTripPlanRequest$b */
    public static class C11518b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11517a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVCarpoolTripPlanRequest$c */
    public static class C11519c extends C25240d<MVCarpoolTripPlanRequest> {
        public C11519c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarpoolTripPlanRequest mVCarpoolTripPlanRequest = (MVCarpoolTripPlanRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCarpoolTripPlanRequest.mo34228m()) {
                bitSet.set(0);
            }
            if (mVCarpoolTripPlanRequest.mo34225j()) {
                bitSet.set(1);
            }
            if (mVCarpoolTripPlanRequest.mo34226k()) {
                bitSet.set(2);
            }
            if (mVCarpoolTripPlanRequest.mo34220f()) {
                bitSet.set(3);
            }
            if (mVCarpoolTripPlanRequest.mo34222h()) {
                bitSet.set(4);
            }
            if (mVCarpoolTripPlanRequest.mo34221g()) {
                bitSet.set(5);
            }
            if (mVCarpoolTripPlanRequest.mo34227l()) {
                bitSet.set(6);
            }
            if (mVCarpoolTripPlanRequest.mo34224i()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVCarpoolTripPlanRequest.mo34228m()) {
                jVar.mo61678B(mVCarpoolTripPlanRequest.tripPlanPref.getValue());
            }
            if (mVCarpoolTripPlanRequest.mo34225j()) {
                jVar.mo61679C(mVCarpoolTripPlanRequest.time);
            }
            if (mVCarpoolTripPlanRequest.mo34226k()) {
                jVar.mo61678B(mVCarpoolTripPlanRequest.timeType.getValue());
            }
            if (mVCarpoolTripPlanRequest.mo34220f()) {
                jVar.mo61708u(mVCarpoolTripPlanRequest.currentTimeSelected);
            }
            if (mVCarpoolTripPlanRequest.mo34222h()) {
                jVar.mo61678B(mVCarpoolTripPlanRequest.routeTypes.size());
                for (MVRouteType value : mVCarpoolTripPlanRequest.routeTypes) {
                    jVar.mo61678B(value.getValue());
                }
            }
            if (mVCarpoolTripPlanRequest.mo34221g()) {
                mVCarpoolTripPlanRequest.fromLocation.mo25202X0(jVar);
            }
            if (mVCarpoolTripPlanRequest.mo34227l()) {
                mVCarpoolTripPlanRequest.toLocation.mo25202X0(jVar);
            }
            if (mVCarpoolTripPlanRequest.mo34224i()) {
                jVar.mo61708u(mVCarpoolTripPlanRequest.smartTripPlanRequest);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarpoolTripPlanRequest mVCarpoolTripPlanRequest = (MVCarpoolTripPlanRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVCarpoolTripPlanRequest.tripPlanPref = MVTripPlanPref.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVCarpoolTripPlanRequest.time = jVar.mo61697j();
                mVCarpoolTripPlanRequest.mo34231q();
            }
            if (T.get(2)) {
                mVCarpoolTripPlanRequest.timeType = MVTimeType.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                mVCarpoolTripPlanRequest.currentTimeSelected = jVar.mo61690c();
                mVCarpoolTripPlanRequest.mo34229o();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVCarpoolTripPlanRequest.routeTypes = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVCarpoolTripPlanRequest.routeTypes.add(MVRouteType.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(5)) {
                MVLocationTarget mVLocationTarget = new MVLocationTarget();
                mVCarpoolTripPlanRequest.fromLocation = mVLocationTarget;
                mVLocationTarget.mo25201C1(jVar);
            }
            if (T.get(6)) {
                MVLocationTarget mVLocationTarget2 = new MVLocationTarget();
                mVCarpoolTripPlanRequest.toLocation = mVLocationTarget2;
                mVLocationTarget2.mo25201C1(jVar);
            }
            if (T.get(7)) {
                mVCarpoolTripPlanRequest.smartTripPlanRequest = jVar.mo61690c();
                mVCarpoolTripPlanRequest.mo34230p();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVCarpoolTripPlanRequest$d */
    public static class C11520d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11519c(0);
        }
    }

    static {
        new C17394d0("MVCarpoolTripPlanRequest");
        HashMap hashMap = new HashMap();
        f29874j = hashMap;
        hashMap.put(C25239c.class, new C11518b());
        hashMap.put(C25240d.class, new C11520d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TRIP_PLAN_PREF, new FieldMetaData("tripPlanPref", (byte) 3, new EnumMetaData(MVTripPlanPref.class)));
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.TIME_TYPE, new FieldMetaData("timeType", (byte) 3, new EnumMetaData(MVTimeType.class)));
        enumMap.put(_Fields.CURRENT_TIME_SELECTED, new FieldMetaData("currentTimeSelected", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.ROUTE_TYPES, new FieldMetaData("routeTypes", (byte) 3, new ListMetaData(new EnumMetaData(MVRouteType.class))));
        enumMap.put(_Fields.FROM_LOCATION, new FieldMetaData("fromLocation", (byte) 3, new StructMetaData(MVLocationTarget.class)));
        enumMap.put(_Fields.TO_LOCATION, new FieldMetaData("toLocation", (byte) 3, new StructMetaData(MVLocationTarget.class)));
        enumMap.put(_Fields.SMART_TRIP_PLAN_REQUEST, new FieldMetaData("smartTripPlanRequest", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29875k = unmodifiableMap;
        FieldMetaData.m61947a(MVCarpoolTripPlanRequest.class, unmodifiableMap);
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
        ((C25238b) f29874j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29874j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVCarpoolTripPlanRequest mVCarpoolTripPlanRequest = (MVCarpoolTripPlanRequest) obj;
        if (!getClass().equals(mVCarpoolTripPlanRequest.getClass())) {
            return getClass().getName().compareTo(mVCarpoolTripPlanRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34228m()).compareTo(Boolean.valueOf(mVCarpoolTripPlanRequest.mo34228m()));
        if (compareTo != 0 || ((mo34228m() && (compareTo = this.tripPlanPref.compareTo(mVCarpoolTripPlanRequest.tripPlanPref)) != 0) || (compareTo = Boolean.valueOf(mo34225j()).compareTo(Boolean.valueOf(mVCarpoolTripPlanRequest.mo34225j()))) != 0 || ((mo34225j() && (compareTo = C25082a.m62840d(this.time, mVCarpoolTripPlanRequest.time)) != 0) || (compareTo = Boolean.valueOf(mo34226k()).compareTo(Boolean.valueOf(mVCarpoolTripPlanRequest.mo34226k()))) != 0 || ((mo34226k() && (compareTo = this.timeType.compareTo(mVCarpoolTripPlanRequest.timeType)) != 0) || (compareTo = Boolean.valueOf(mo34220f()).compareTo(Boolean.valueOf(mVCarpoolTripPlanRequest.mo34220f()))) != 0 || ((mo34220f() && (compareTo = C25082a.m62848l(this.currentTimeSelected, mVCarpoolTripPlanRequest.currentTimeSelected)) != 0) || (compareTo = Boolean.valueOf(mo34222h()).compareTo(Boolean.valueOf(mVCarpoolTripPlanRequest.mo34222h()))) != 0 || ((mo34222h() && (compareTo = C25082a.m62844h(this.routeTypes, mVCarpoolTripPlanRequest.routeTypes)) != 0) || (compareTo = Boolean.valueOf(mo34221g()).compareTo(Boolean.valueOf(mVCarpoolTripPlanRequest.mo34221g()))) != 0 || ((mo34221g() && (compareTo = this.fromLocation.compareTo(mVCarpoolTripPlanRequest.fromLocation)) != 0) || (compareTo = Boolean.valueOf(mo34227l()).compareTo(Boolean.valueOf(mVCarpoolTripPlanRequest.mo34227l()))) != 0 || ((mo34227l() && (compareTo = this.toLocation.compareTo(mVCarpoolTripPlanRequest.toLocation)) != 0) || (compareTo = Boolean.valueOf(mo34224i()).compareTo(Boolean.valueOf(mVCarpoolTripPlanRequest.mo34224i()))) != 0)))))))) {
            return compareTo;
        }
        if (!mo34224i() || (l = C25082a.m62848l(this.smartTripPlanRequest, mVCarpoolTripPlanRequest.smartTripPlanRequest)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCarpoolTripPlanRequest)) {
            return false;
        }
        MVCarpoolTripPlanRequest mVCarpoolTripPlanRequest = (MVCarpoolTripPlanRequest) obj;
        boolean m = mo34228m();
        boolean m2 = mVCarpoolTripPlanRequest.mo34228m();
        if (((m || m2) && (!m || !m2 || !this.tripPlanPref.equals(mVCarpoolTripPlanRequest.tripPlanPref))) || this.time != mVCarpoolTripPlanRequest.time) {
            return false;
        }
        boolean k = mo34226k();
        boolean k2 = mVCarpoolTripPlanRequest.mo34226k();
        if (((k || k2) && (!k || !k2 || !this.timeType.equals(mVCarpoolTripPlanRequest.timeType))) || this.currentTimeSelected != mVCarpoolTripPlanRequest.currentTimeSelected) {
            return false;
        }
        boolean h = mo34222h();
        boolean h2 = mVCarpoolTripPlanRequest.mo34222h();
        if ((h || h2) && (!h || !h2 || !this.routeTypes.equals(mVCarpoolTripPlanRequest.routeTypes))) {
            return false;
        }
        boolean g = mo34221g();
        boolean g2 = mVCarpoolTripPlanRequest.mo34221g();
        if ((g || g2) && (!g || !g2 || !this.fromLocation.mo34386a(mVCarpoolTripPlanRequest.fromLocation))) {
            return false;
        }
        boolean l = mo34227l();
        boolean l2 = mVCarpoolTripPlanRequest.mo34227l();
        if (((l || l2) && (!l || !l2 || !this.toLocation.mo34386a(mVCarpoolTripPlanRequest.toLocation))) || this.smartTripPlanRequest != mVCarpoolTripPlanRequest.smartTripPlanRequest) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34220f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo34221g() {
        return this.fromLocation != null;
    }

    /* renamed from: h */
    public final boolean mo34222h() {
        return this.routeTypes != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34224i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final boolean mo34225j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo34226k() {
        return this.timeType != null;
    }

    /* renamed from: l */
    public final boolean mo34227l() {
        return this.toLocation != null;
    }

    /* renamed from: m */
    public final boolean mo34228m() {
        return this.tripPlanPref != null;
    }

    /* renamed from: o */
    public final void mo34229o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: p */
    public final void mo34230p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: q */
    public final void mo34231q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCarpoolTripPlanRequest(", "tripPlanPref:");
        MVTripPlanPref mVTripPlanPref = this.tripPlanPref;
        if (mVTripPlanPref == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTripPlanPref);
        }
        n.append(", ");
        n.append("time:");
        C25541a.m63889t(n, this.time, ", ", "timeType:");
        MVTimeType mVTimeType = this.timeType;
        if (mVTimeType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTimeType);
        }
        n.append(", ");
        n.append("currentTimeSelected:");
        C13555b.m33977q(n, this.currentTimeSelected, ", ", "routeTypes:");
        List<MVRouteType> list = this.routeTypes;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("fromLocation:");
        MVLocationTarget mVLocationTarget = this.fromLocation;
        if (mVLocationTarget == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationTarget);
        }
        n.append(", ");
        n.append("toLocation:");
        MVLocationTarget mVLocationTarget2 = this.toLocation;
        if (mVLocationTarget2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationTarget2);
        }
        n.append(", ");
        n.append("smartTripPlanRequest:");
        return C25541a.m63885p(n, this.smartTripPlanRequest, ")");
    }
}
