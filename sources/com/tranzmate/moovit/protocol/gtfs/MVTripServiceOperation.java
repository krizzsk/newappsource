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

public class MVTripServiceOperation implements TBase<MVTripServiceOperation, _Fields>, Serializable, Cloneable, Comparable<MVTripServiceOperation> {

    /* renamed from: b */
    public static final C25113c f25853b = new C25113c("serviceOperationId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25854c = new C25113c("activeDaysMask", (byte) 3, 2);

    /* renamed from: d */
    public static final C25113c f25855d = new C25113c("startDate", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f25856e = new C25113c("endDate", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f25857f = new C25113c("additionalDates", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f25858g = new C25113c("omittedDates", (byte) 15, 6);

    /* renamed from: h */
    public static final HashMap f25859h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f25860i;
    private byte __isset_bitfield = 0;
    public byte activeDaysMask;
    public List<Integer> additionalDates;
    public int endDate;
    public List<Integer> omittedDates;
    public int serviceOperationId;
    public int startDate;

    public enum _Fields implements C25085c {
        SERVICE_OPERATION_ID(1, "serviceOperationId"),
        ACTIVE_DAYS_MASK(2, "activeDaysMask"),
        START_DATE(3, "startDate"),
        END_DATE(4, "endDate"),
        ADDITIONAL_DATES(5, "additionalDates"),
        OMITTED_DATES(6, "omittedDates");
        
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
                    return SERVICE_OPERATION_ID;
                case 2:
                    return ACTIVE_DAYS_MASK;
                case 3:
                    return START_DATE;
                case 4:
                    return END_DATE;
                case 5:
                    return ADDITIONAL_DATES;
                case 6:
                    return OMITTED_DATES;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripServiceOperation$a */
    public static class C8867a extends C25239c<MVTripServiceOperation> {
        public C8867a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripServiceOperation mVTripServiceOperation = (MVTripServiceOperation) tBase;
            mVTripServiceOperation.getClass();
            C25113c cVar = MVTripServiceOperation.f25853b;
            gVar.mo61687K();
            gVar.mo61711x(MVTripServiceOperation.f25853b);
            gVar.mo61678B(mVTripServiceOperation.serviceOperationId);
            gVar.mo61712y();
            gVar.mo61711x(MVTripServiceOperation.f25854c);
            gVar.mo61709v(mVTripServiceOperation.activeDaysMask);
            gVar.mo61712y();
            gVar.mo61711x(MVTripServiceOperation.f25855d);
            gVar.mo61678B(mVTripServiceOperation.startDate);
            gVar.mo61712y();
            gVar.mo61711x(MVTripServiceOperation.f25856e);
            gVar.mo61678B(mVTripServiceOperation.endDate);
            gVar.mo61712y();
            if (mVTripServiceOperation.additionalDates != null) {
                gVar.mo61711x(MVTripServiceOperation.f25857f);
                gVar.mo61680D(new C25119e((byte) 8, mVTripServiceOperation.additionalDates.size()));
                for (Integer intValue : mVTripServiceOperation.additionalDates) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTripServiceOperation.omittedDates != null) {
                gVar.mo61711x(MVTripServiceOperation.f25858g);
                gVar.mo61680D(new C25119e((byte) 8, mVTripServiceOperation.omittedDates.size()));
                for (Integer intValue2 : mVTripServiceOperation.omittedDates) {
                    gVar.mo61678B(intValue2.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripServiceOperation mVTripServiceOperation = (MVTripServiceOperation) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTripServiceOperation.getClass();
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripServiceOperation.serviceOperationId = gVar.mo61696i();
                            mVTripServiceOperation.mo27621o();
                            break;
                        }
                    case 2:
                        if (b != 3) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripServiceOperation.activeDaysMask = gVar.mo61691d();
                            mVTripServiceOperation.mo27619l();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripServiceOperation.startDate = gVar.mo61696i();
                            mVTripServiceOperation.mo27622p();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripServiceOperation.endDate = gVar.mo61696i();
                            mVTripServiceOperation.mo27620m();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVTripServiceOperation.additionalDates = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVTripServiceOperation.additionalDates, i, 1);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVTripServiceOperation.omittedDates = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVTripServiceOperation.omittedDates, i, 1);
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripServiceOperation$b */
    public static class C8868b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8867a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripServiceOperation$c */
    public static class C8869c extends C25240d<MVTripServiceOperation> {
        public C8869c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripServiceOperation mVTripServiceOperation = (MVTripServiceOperation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripServiceOperation.mo27617j()) {
                bitSet.set(0);
            }
            if (mVTripServiceOperation.mo27612f()) {
                bitSet.set(1);
            }
            if (mVTripServiceOperation.mo27618k()) {
                bitSet.set(2);
            }
            if (mVTripServiceOperation.mo27614h()) {
                bitSet.set(3);
            }
            if (mVTripServiceOperation.mo27613g()) {
                bitSet.set(4);
            }
            if (mVTripServiceOperation.mo27616i()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVTripServiceOperation.mo27617j()) {
                jVar.mo61678B(mVTripServiceOperation.serviceOperationId);
            }
            if (mVTripServiceOperation.mo27612f()) {
                jVar.mo61716P(mVTripServiceOperation.activeDaysMask);
            }
            if (mVTripServiceOperation.mo27618k()) {
                jVar.mo61678B(mVTripServiceOperation.startDate);
            }
            if (mVTripServiceOperation.mo27614h()) {
                jVar.mo61678B(mVTripServiceOperation.endDate);
            }
            if (mVTripServiceOperation.mo27613g()) {
                jVar.mo61678B(mVTripServiceOperation.additionalDates.size());
                for (Integer intValue : mVTripServiceOperation.additionalDates) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
            if (mVTripServiceOperation.mo27616i()) {
                jVar.mo61678B(mVTripServiceOperation.omittedDates.size());
                for (Integer intValue2 : mVTripServiceOperation.omittedDates) {
                    jVar.mo61678B(intValue2.intValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripServiceOperation mVTripServiceOperation = (MVTripServiceOperation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVTripServiceOperation.serviceOperationId = jVar.mo61696i();
                mVTripServiceOperation.mo27621o();
            }
            if (T.get(1)) {
                mVTripServiceOperation.activeDaysMask = jVar.mo61691d();
                mVTripServiceOperation.mo27619l();
            }
            if (T.get(2)) {
                mVTripServiceOperation.startDate = jVar.mo61696i();
                mVTripServiceOperation.mo27622p();
            }
            if (T.get(3)) {
                mVTripServiceOperation.endDate = jVar.mo61696i();
                mVTripServiceOperation.mo27620m();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVTripServiceOperation.additionalDates = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2 = C13437d.m33701f(jVar.mo61696i(), mVTripServiceOperation.additionalDates, i2, 1)) {
                }
            }
            if (T.get(5)) {
                int i3 = jVar.mo61696i();
                mVTripServiceOperation.omittedDates = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4 = C13437d.m33701f(jVar.mo61696i(), mVTripServiceOperation.omittedDates, i4, 1)) {
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripServiceOperation$d */
    public static class C8870d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8869c(0);
        }
    }

    static {
        new C17394d0("MVTripServiceOperation");
        HashMap hashMap = new HashMap();
        f25859h = hashMap;
        hashMap.put(C25239c.class, new C8868b());
        hashMap.put(C25240d.class, new C8870d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SERVICE_OPERATION_ID, new FieldMetaData("serviceOperationId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ACTIVE_DAYS_MASK, new FieldMetaData("activeDaysMask", (byte) 3, new FieldValueMetaData((byte) 3, false)));
        enumMap.put(_Fields.START_DATE, new FieldMetaData("startDate", (byte) 3, new FieldValueMetaData((byte) 8, "EpocDay")));
        enumMap.put(_Fields.END_DATE, new FieldMetaData("endDate", (byte) 3, new FieldValueMetaData((byte) 8, "EpocDay")));
        enumMap.put(_Fields.ADDITIONAL_DATES, new FieldMetaData("additionalDates", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, "EpocDay"))));
        enumMap.put(_Fields.OMITTED_DATES, new FieldMetaData("omittedDates", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, "EpocDay"))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25860i = unmodifiableMap;
        FieldMetaData.m61947a(MVTripServiceOperation.class, unmodifiableMap);
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
        ((C25238b) f25859h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25859h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVTripServiceOperation mVTripServiceOperation = (MVTripServiceOperation) obj;
        if (!getClass().equals(mVTripServiceOperation.getClass())) {
            return getClass().getName().compareTo(mVTripServiceOperation.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27617j()).compareTo(Boolean.valueOf(mVTripServiceOperation.mo27617j()));
        if (compareTo != 0 || ((mo27617j() && (compareTo = C25082a.m62839c(this.serviceOperationId, mVTripServiceOperation.serviceOperationId)) != 0) || (compareTo = Boolean.valueOf(mo27612f()).compareTo(Boolean.valueOf(mVTripServiceOperation.mo27612f()))) != 0 || ((mo27612f() && (compareTo = C25082a.m62837a(this.activeDaysMask, mVTripServiceOperation.activeDaysMask)) != 0) || (compareTo = Boolean.valueOf(mo27618k()).compareTo(Boolean.valueOf(mVTripServiceOperation.mo27618k()))) != 0 || ((mo27618k() && (compareTo = C25082a.m62839c(this.startDate, mVTripServiceOperation.startDate)) != 0) || (compareTo = Boolean.valueOf(mo27614h()).compareTo(Boolean.valueOf(mVTripServiceOperation.mo27614h()))) != 0 || ((mo27614h() && (compareTo = C25082a.m62839c(this.endDate, mVTripServiceOperation.endDate)) != 0) || (compareTo = Boolean.valueOf(mo27613g()).compareTo(Boolean.valueOf(mVTripServiceOperation.mo27613g()))) != 0 || ((mo27613g() && (compareTo = C25082a.m62844h(this.additionalDates, mVTripServiceOperation.additionalDates)) != 0) || (compareTo = Boolean.valueOf(mo27616i()).compareTo(Boolean.valueOf(mVTripServiceOperation.mo27616i()))) != 0)))))) {
            return compareTo;
        }
        if (!mo27616i() || (h = C25082a.m62844h(this.omittedDates, mVTripServiceOperation.omittedDates)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTripServiceOperation)) {
            return false;
        }
        MVTripServiceOperation mVTripServiceOperation = (MVTripServiceOperation) obj;
        if (this.serviceOperationId != mVTripServiceOperation.serviceOperationId || this.activeDaysMask != mVTripServiceOperation.activeDaysMask || this.startDate != mVTripServiceOperation.startDate || this.endDate != mVTripServiceOperation.endDate) {
            return false;
        }
        boolean g = mo27613g();
        boolean g2 = mVTripServiceOperation.mo27613g();
        if ((g || g2) && (!g || !g2 || !this.additionalDates.equals(mVTripServiceOperation.additionalDates))) {
            return false;
        }
        boolean i = mo27616i();
        boolean i2 = mVTripServiceOperation.mo27616i();
        if ((i || i2) && (!i || !i2 || !this.omittedDates.equals(mVTripServiceOperation.omittedDates))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27612f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo27613g() {
        return this.additionalDates != null;
    }

    /* renamed from: h */
    public final boolean mo27614h() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27616i() {
        return this.omittedDates != null;
    }

    /* renamed from: j */
    public final boolean mo27617j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo27618k() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: l */
    public final void mo27619l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo27620m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: o */
    public final void mo27621o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: p */
    public final void mo27622p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripServiceOperation(", "serviceOperationId:");
        C0016g.m42z(n, this.serviceOperationId, ", ", "activeDaysMask:");
        C0016g.m42z(n, this.activeDaysMask, ", ", "startDate:");
        C0016g.m42z(n, this.startDate, ", ", "endDate:");
        C0016g.m42z(n, this.endDate, ", ", "additionalDates:");
        List<Integer> list = this.additionalDates;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("omittedDates:");
        List<Integer> list2 = this.omittedDates;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(")");
        return n.toString();
    }
}
