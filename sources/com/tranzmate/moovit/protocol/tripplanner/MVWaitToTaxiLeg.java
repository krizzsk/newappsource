package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
import com.tranzmate.moovit.protocol.taxi.MVTaxiPrice;
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

public class MVWaitToTaxiLeg implements TBase<MVWaitToTaxiLeg, _Fields>, Serializable, Cloneable, Comparable<MVWaitToTaxiLeg> {

    /* renamed from: b */
    public static final C25113c f30261b = new C25113c("time", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f30262c = new C25113c("waitAtLocation", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f30263d = new C25113c("taxiPrice", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f30264e = new C25113c("approxWaitingSecFromOrdering", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f30265f = new C25113c("taxiId", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f30266g = new C25113c("customParameters", (byte) 15, 6);

    /* renamed from: h */
    public static final HashMap f30267h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f30268i;
    private byte __isset_bitfield = 0;
    public int approxWaitingSecFromOrdering;
    public List<MVTaxiLegCustomDeepLinkParameter> customParameters;
    private _Fields[] optionals = {_Fields.TAXI_PRICE, _Fields.CUSTOM_PARAMETERS};
    public int taxiId;
    public MVTaxiPrice taxiPrice;
    public MVTime time;
    public MVLocationDescriptor waitAtLocation;

    public enum _Fields implements C25085c {
        TIME(1, "time"),
        WAIT_AT_LOCATION(2, "waitAtLocation"),
        TAXI_PRICE(3, "taxiPrice"),
        APPROX_WAITING_SEC_FROM_ORDERING(4, "approxWaitingSecFromOrdering"),
        TAXI_ID(5, "taxiId"),
        CUSTOM_PARAMETERS(6, "customParameters");
        
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
                    return WAIT_AT_LOCATION;
                case 3:
                    return TAXI_PRICE;
                case 4:
                    return APPROX_WAITING_SEC_FROM_ORDERING;
                case 5:
                    return TAXI_ID;
                case 6:
                    return CUSTOM_PARAMETERS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToTaxiLeg$a */
    public static class C11718a extends C25239c<MVWaitToTaxiLeg> {
        public C11718a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWaitToTaxiLeg mVWaitToTaxiLeg = (MVWaitToTaxiLeg) tBase;
            MVLocationDescriptor mVLocationDescriptor = mVWaitToTaxiLeg.waitAtLocation;
            if (mVLocationDescriptor != null) {
                mVLocationDescriptor.mo26333s();
            }
            C25113c cVar = MVWaitToTaxiLeg.f30261b;
            gVar.mo61687K();
            if (mVWaitToTaxiLeg.time != null) {
                gVar.mo61711x(MVWaitToTaxiLeg.f30261b);
                mVWaitToTaxiLeg.time.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVWaitToTaxiLeg.waitAtLocation != null) {
                gVar.mo61711x(MVWaitToTaxiLeg.f30262c);
                mVWaitToTaxiLeg.waitAtLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVWaitToTaxiLeg.taxiPrice != null && mVWaitToTaxiLeg.mo34890i()) {
                gVar.mo61711x(MVWaitToTaxiLeg.f30263d);
                mVWaitToTaxiLeg.taxiPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVWaitToTaxiLeg.f30264e);
            gVar.mo61678B(mVWaitToTaxiLeg.approxWaitingSecFromOrdering);
            gVar.mo61712y();
            gVar.mo61711x(MVWaitToTaxiLeg.f30265f);
            gVar.mo61678B(mVWaitToTaxiLeg.taxiId);
            gVar.mo61712y();
            if (mVWaitToTaxiLeg.customParameters != null && mVWaitToTaxiLeg.mo34887g()) {
                gVar.mo61711x(MVWaitToTaxiLeg.f30266g);
                gVar.mo61680D(new C25119e((byte) 12, mVWaitToTaxiLeg.customParameters.size()));
                for (MVTaxiLegCustomDeepLinkParameter X0 : mVWaitToTaxiLeg.customParameters) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWaitToTaxiLeg mVWaitToTaxiLeg = (MVWaitToTaxiLeg) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLocationDescriptor mVLocationDescriptor = mVWaitToTaxiLeg.waitAtLocation;
                    if (mVLocationDescriptor != null) {
                        mVLocationDescriptor.mo26333s();
                        return;
                    }
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTime mVTime = new MVTime();
                            mVWaitToTaxiLeg.time = mVTime;
                            mVTime.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                            mVWaitToTaxiLeg.waitAtLocation = mVLocationDescriptor2;
                            mVLocationDescriptor2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTaxiPrice mVTaxiPrice = new MVTaxiPrice();
                            mVWaitToTaxiLeg.taxiPrice = mVTaxiPrice;
                            mVTaxiPrice.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWaitToTaxiLeg.approxWaitingSecFromOrdering = gVar.mo61696i();
                            mVWaitToTaxiLeg.mo34893l();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWaitToTaxiLeg.taxiId = gVar.mo61696i();
                            mVWaitToTaxiLeg.mo34894m();
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVWaitToTaxiLeg.customParameters = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVTaxiLegCustomDeepLinkParameter mVTaxiLegCustomDeepLinkParameter = new MVTaxiLegCustomDeepLinkParameter();
                                mVTaxiLegCustomDeepLinkParameter.mo25201C1(gVar);
                                mVWaitToTaxiLeg.customParameters.add(mVTaxiLegCustomDeepLinkParameter);
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToTaxiLeg$b */
    public static class C11719b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11718a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToTaxiLeg$c */
    public static class C11720c extends C25240d<MVWaitToTaxiLeg> {
        public C11720c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWaitToTaxiLeg mVWaitToTaxiLeg = (MVWaitToTaxiLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWaitToTaxiLeg.mo34891j()) {
                bitSet.set(0);
            }
            if (mVWaitToTaxiLeg.mo34892k()) {
                bitSet.set(1);
            }
            if (mVWaitToTaxiLeg.mo34890i()) {
                bitSet.set(2);
            }
            if (mVWaitToTaxiLeg.mo34886f()) {
                bitSet.set(3);
            }
            if (mVWaitToTaxiLeg.mo34888h()) {
                bitSet.set(4);
            }
            if (mVWaitToTaxiLeg.mo34887g()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVWaitToTaxiLeg.mo34891j()) {
                mVWaitToTaxiLeg.time.mo25202X0(jVar);
            }
            if (mVWaitToTaxiLeg.mo34892k()) {
                mVWaitToTaxiLeg.waitAtLocation.mo25202X0(jVar);
            }
            if (mVWaitToTaxiLeg.mo34890i()) {
                mVWaitToTaxiLeg.taxiPrice.mo25202X0(jVar);
            }
            if (mVWaitToTaxiLeg.mo34886f()) {
                jVar.mo61678B(mVWaitToTaxiLeg.approxWaitingSecFromOrdering);
            }
            if (mVWaitToTaxiLeg.mo34888h()) {
                jVar.mo61678B(mVWaitToTaxiLeg.taxiId);
            }
            if (mVWaitToTaxiLeg.mo34887g()) {
                jVar.mo61678B(mVWaitToTaxiLeg.customParameters.size());
                for (MVTaxiLegCustomDeepLinkParameter X0 : mVWaitToTaxiLeg.customParameters) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWaitToTaxiLeg mVWaitToTaxiLeg = (MVWaitToTaxiLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                MVTime mVTime = new MVTime();
                mVWaitToTaxiLeg.time = mVTime;
                mVTime.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVWaitToTaxiLeg.waitAtLocation = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVTaxiPrice mVTaxiPrice = new MVTaxiPrice();
                mVWaitToTaxiLeg.taxiPrice = mVTaxiPrice;
                mVTaxiPrice.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVWaitToTaxiLeg.approxWaitingSecFromOrdering = jVar.mo61696i();
                mVWaitToTaxiLeg.mo34893l();
            }
            if (T.get(4)) {
                mVWaitToTaxiLeg.taxiId = jVar.mo61696i();
                mVWaitToTaxiLeg.mo34894m();
            }
            if (T.get(5)) {
                int i = jVar.mo61696i();
                mVWaitToTaxiLeg.customParameters = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTaxiLegCustomDeepLinkParameter mVTaxiLegCustomDeepLinkParameter = new MVTaxiLegCustomDeepLinkParameter();
                    mVTaxiLegCustomDeepLinkParameter.mo25201C1(jVar);
                    mVWaitToTaxiLeg.customParameters.add(mVTaxiLegCustomDeepLinkParameter);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToTaxiLeg$d */
    public static class C11721d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11720c(0);
        }
    }

    static {
        new C17394d0("MVWaitToTaxiLeg");
        HashMap hashMap = new HashMap();
        f30267h = hashMap;
        hashMap.put(C25239c.class, new C11719b());
        hashMap.put(C25240d.class, new C11721d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new StructMetaData(MVTime.class)));
        enumMap.put(_Fields.WAIT_AT_LOCATION, new FieldMetaData("waitAtLocation", (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.TAXI_PRICE, new FieldMetaData("taxiPrice", (byte) 2, new StructMetaData(MVTaxiPrice.class)));
        enumMap.put(_Fields.APPROX_WAITING_SEC_FROM_ORDERING, new FieldMetaData("approxWaitingSecFromOrdering", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TAXI_ID, new FieldMetaData("taxiId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CUSTOM_PARAMETERS, new FieldMetaData("customParameters", (byte) 2, new ListMetaData(new StructMetaData(MVTaxiLegCustomDeepLinkParameter.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30268i = unmodifiableMap;
        FieldMetaData.m61947a(MVWaitToTaxiLeg.class, unmodifiableMap);
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
        ((C25238b) f30267h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30267h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVWaitToTaxiLeg mVWaitToTaxiLeg = (MVWaitToTaxiLeg) obj;
        if (!getClass().equals(mVWaitToTaxiLeg.getClass())) {
            return getClass().getName().compareTo(mVWaitToTaxiLeg.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34891j()).compareTo(Boolean.valueOf(mVWaitToTaxiLeg.mo34891j()));
        if (compareTo != 0 || ((mo34891j() && (compareTo = this.time.compareTo(mVWaitToTaxiLeg.time)) != 0) || (compareTo = Boolean.valueOf(mo34892k()).compareTo(Boolean.valueOf(mVWaitToTaxiLeg.mo34892k()))) != 0 || ((mo34892k() && (compareTo = this.waitAtLocation.compareTo(mVWaitToTaxiLeg.waitAtLocation)) != 0) || (compareTo = Boolean.valueOf(mo34890i()).compareTo(Boolean.valueOf(mVWaitToTaxiLeg.mo34890i()))) != 0 || ((mo34890i() && (compareTo = this.taxiPrice.compareTo(mVWaitToTaxiLeg.taxiPrice)) != 0) || (compareTo = Boolean.valueOf(mo34886f()).compareTo(Boolean.valueOf(mVWaitToTaxiLeg.mo34886f()))) != 0 || ((mo34886f() && (compareTo = C25082a.m62839c(this.approxWaitingSecFromOrdering, mVWaitToTaxiLeg.approxWaitingSecFromOrdering)) != 0) || (compareTo = Boolean.valueOf(mo34888h()).compareTo(Boolean.valueOf(mVWaitToTaxiLeg.mo34888h()))) != 0 || ((mo34888h() && (compareTo = C25082a.m62839c(this.taxiId, mVWaitToTaxiLeg.taxiId)) != 0) || (compareTo = Boolean.valueOf(mo34887g()).compareTo(Boolean.valueOf(mVWaitToTaxiLeg.mo34887g()))) != 0)))))) {
            return compareTo;
        }
        if (!mo34887g() || (h = C25082a.m62844h(this.customParameters, mVWaitToTaxiLeg.customParameters)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVWaitToTaxiLeg)) {
            return false;
        }
        MVWaitToTaxiLeg mVWaitToTaxiLeg = (MVWaitToTaxiLeg) obj;
        boolean j = mo34891j();
        boolean j2 = mVWaitToTaxiLeg.mo34891j();
        if ((j || j2) && (!j || !j2 || !this.time.mo34573a(mVWaitToTaxiLeg.time))) {
            return false;
        }
        boolean k = mo34892k();
        boolean k2 = mVWaitToTaxiLeg.mo34892k();
        if ((k || k2) && (!k || !k2 || !this.waitAtLocation.mo26317a(mVWaitToTaxiLeg.waitAtLocation))) {
            return false;
        }
        boolean i = mo34890i();
        boolean i2 = mVWaitToTaxiLeg.mo34890i();
        if (((i || i2) && (!i || !i2 || !this.taxiPrice.mo32244a(mVWaitToTaxiLeg.taxiPrice))) || this.approxWaitingSecFromOrdering != mVWaitToTaxiLeg.approxWaitingSecFromOrdering || this.taxiId != mVWaitToTaxiLeg.taxiId) {
            return false;
        }
        boolean g = mo34887g();
        boolean g2 = mVWaitToTaxiLeg.mo34887g();
        if ((g || g2) && (!g || !g2 || !this.customParameters.equals(mVWaitToTaxiLeg.customParameters))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34886f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo34887g() {
        return this.customParameters != null;
    }

    /* renamed from: h */
    public final boolean mo34888h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34890i() {
        return this.taxiPrice != null;
    }

    /* renamed from: j */
    public final boolean mo34891j() {
        return this.time != null;
    }

    /* renamed from: k */
    public final boolean mo34892k() {
        return this.waitAtLocation != null;
    }

    /* renamed from: l */
    public final void mo34893l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: m */
    public final void mo34894m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWaitToTaxiLeg(", "time:");
        MVTime mVTime = this.time;
        if (mVTime == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTime);
        }
        n.append(", ");
        n.append("waitAtLocation:");
        MVLocationDescriptor mVLocationDescriptor = this.waitAtLocation;
        if (mVLocationDescriptor == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor);
        }
        if (mo34890i()) {
            n.append(", ");
            n.append("taxiPrice:");
            MVTaxiPrice mVTaxiPrice = this.taxiPrice;
            if (mVTaxiPrice == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTaxiPrice);
            }
        }
        n.append(", ");
        n.append("approxWaitingSecFromOrdering:");
        C0016g.m42z(n, this.approxWaitingSecFromOrdering, ", ", "taxiId:");
        n.append(this.taxiId);
        if (mo34887g()) {
            n.append(", ");
            n.append("customParameters:");
            List<MVTaxiLegCustomDeepLinkParameter> list = this.customParameters;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        n.append(")");
        return n.toString();
    }
}
