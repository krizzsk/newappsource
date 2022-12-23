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

public class MVStopSchedule implements TBase<MVStopSchedule, _Fields>, Serializable, Cloneable, Comparable<MVStopSchedule> {

    /* renamed from: b */
    public static final C25113c f25805b = new C25113c("stopId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25806c = new C25113c("linesSchedulePattrensList", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f25807d = new C25113c("servicesOperation", (byte) 15, 3);

    /* renamed from: e */
    public static final HashMap f25808e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25809f;
    private byte __isset_bitfield = 0;
    public List<MVStopLineSchedulePattern> linesSchedulePattrensList;
    public List<MVTripServiceOperation> servicesOperation;
    public int stopId;

    public enum _Fields implements C25085c {
        STOP_ID(1, "stopId"),
        LINES_SCHEDULE_PATTRENS_LIST(2, "linesSchedulePattrensList"),
        SERVICES_OPERATION(3, "servicesOperation");
        
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
                return STOP_ID;
            }
            if (i == 2) {
                return LINES_SCHEDULE_PATTRENS_LIST;
            }
            if (i != 3) {
                return null;
            }
            return SERVICES_OPERATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVStopSchedule$a */
    public static class C8831a extends C25239c<MVStopSchedule> {
        public C8831a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopSchedule mVStopSchedule = (MVStopSchedule) tBase;
            mVStopSchedule.getClass();
            C25113c cVar = MVStopSchedule.f25805b;
            gVar.mo61687K();
            gVar.mo61711x(MVStopSchedule.f25805b);
            gVar.mo61678B(mVStopSchedule.stopId);
            gVar.mo61712y();
            if (mVStopSchedule.linesSchedulePattrensList != null) {
                gVar.mo61711x(MVStopSchedule.f25806c);
                gVar.mo61680D(new C25119e((byte) 12, mVStopSchedule.linesSchedulePattrensList.size()));
                for (MVStopLineSchedulePattern X0 : mVStopSchedule.linesSchedulePattrensList) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVStopSchedule.servicesOperation != null) {
                gVar.mo61711x(MVStopSchedule.f25807d);
                gVar.mo61680D(new C25119e((byte) 12, mVStopSchedule.servicesOperation.size()));
                for (MVTripServiceOperation X02 : mVStopSchedule.servicesOperation) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopSchedule mVStopSchedule = (MVStopSchedule) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVStopSchedule.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    int i = 0;
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVStopSchedule.servicesOperation = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVTripServiceOperation mVTripServiceOperation = new MVTripServiceOperation();
                                mVTripServiceOperation.mo25201C1(gVar);
                                mVStopSchedule.servicesOperation.add(mVTripServiceOperation);
                                i++;
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k2 = gVar.mo61698k();
                        mVStopSchedule.linesSchedulePattrensList = new ArrayList(k2.f63395b);
                        while (i < k2.f63395b) {
                            MVStopLineSchedulePattern mVStopLineSchedulePattern = new MVStopLineSchedulePattern();
                            mVStopLineSchedulePattern.mo25201C1(gVar);
                            mVStopSchedule.linesSchedulePattrensList.add(mVStopLineSchedulePattern);
                            i++;
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVStopSchedule.stopId = gVar.mo61696i();
                    mVStopSchedule.mo27523i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVStopSchedule$b */
    public static class C8832b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8831a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVStopSchedule$c */
    public static class C8833c extends C25240d<MVStopSchedule> {
        public C8833c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopSchedule mVStopSchedule = (MVStopSchedule) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStopSchedule.mo27521h()) {
                bitSet.set(0);
            }
            if (mVStopSchedule.mo27519f()) {
                bitSet.set(1);
            }
            if (mVStopSchedule.mo27520g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVStopSchedule.mo27521h()) {
                jVar.mo61678B(mVStopSchedule.stopId);
            }
            if (mVStopSchedule.mo27519f()) {
                jVar.mo61678B(mVStopSchedule.linesSchedulePattrensList.size());
                for (MVStopLineSchedulePattern X0 : mVStopSchedule.linesSchedulePattrensList) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVStopSchedule.mo27520g()) {
                jVar.mo61678B(mVStopSchedule.servicesOperation.size());
                for (MVTripServiceOperation X02 : mVStopSchedule.servicesOperation) {
                    X02.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopSchedule mVStopSchedule = (MVStopSchedule) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVStopSchedule.stopId = jVar.mo61696i();
                mVStopSchedule.mo27523i();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVStopSchedule.linesSchedulePattrensList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVStopLineSchedulePattern mVStopLineSchedulePattern = new MVStopLineSchedulePattern();
                    mVStopLineSchedulePattern.mo25201C1(jVar);
                    mVStopSchedule.linesSchedulePattrensList.add(mVStopLineSchedulePattern);
                }
            }
            if (T.get(2)) {
                int i3 = jVar.mo61696i();
                mVStopSchedule.servicesOperation = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVTripServiceOperation mVTripServiceOperation = new MVTripServiceOperation();
                    mVTripServiceOperation.mo25201C1(jVar);
                    mVStopSchedule.servicesOperation.add(mVTripServiceOperation);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVStopSchedule$d */
    public static class C8834d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8833c(0);
        }
    }

    static {
        new C17394d0("MVStopSchedule");
        HashMap hashMap = new HashMap();
        f25808e = hashMap;
        hashMap.put(C25239c.class, new C8832b());
        hashMap.put(C25240d.class, new C8834d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LINES_SCHEDULE_PATTRENS_LIST, new FieldMetaData("linesSchedulePattrensList", (byte) 3, new ListMetaData(new StructMetaData(MVStopLineSchedulePattern.class))));
        enumMap.put(_Fields.SERVICES_OPERATION, new FieldMetaData("servicesOperation", (byte) 3, new ListMetaData(new StructMetaData(MVTripServiceOperation.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25809f = unmodifiableMap;
        FieldMetaData.m61947a(MVStopSchedule.class, unmodifiableMap);
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
        ((C25238b) f25808e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25808e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVStopSchedule mVStopSchedule = (MVStopSchedule) obj;
        if (!getClass().equals(mVStopSchedule.getClass())) {
            return getClass().getName().compareTo(mVStopSchedule.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27521h()).compareTo(Boolean.valueOf(mVStopSchedule.mo27521h()));
        if (compareTo != 0 || ((mo27521h() && (compareTo = C25082a.m62839c(this.stopId, mVStopSchedule.stopId)) != 0) || (compareTo = Boolean.valueOf(mo27519f()).compareTo(Boolean.valueOf(mVStopSchedule.mo27519f()))) != 0 || ((mo27519f() && (compareTo = C25082a.m62844h(this.linesSchedulePattrensList, mVStopSchedule.linesSchedulePattrensList)) != 0) || (compareTo = Boolean.valueOf(mo27520g()).compareTo(Boolean.valueOf(mVStopSchedule.mo27520g()))) != 0))) {
            return compareTo;
        }
        if (!mo27520g() || (h = C25082a.m62844h(this.servicesOperation, mVStopSchedule.servicesOperation)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVStopSchedule)) {
            return false;
        }
        MVStopSchedule mVStopSchedule = (MVStopSchedule) obj;
        if (this.stopId != mVStopSchedule.stopId) {
            return false;
        }
        boolean f = mo27519f();
        boolean f2 = mVStopSchedule.mo27519f();
        if ((f || f2) && (!f || !f2 || !this.linesSchedulePattrensList.equals(mVStopSchedule.linesSchedulePattrensList))) {
            return false;
        }
        boolean g = mo27520g();
        boolean g2 = mVStopSchedule.mo27520g();
        if ((g || g2) && (!g || !g2 || !this.servicesOperation.equals(mVStopSchedule.servicesOperation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27519f() {
        return this.linesSchedulePattrensList != null;
    }

    /* renamed from: g */
    public final boolean mo27520g() {
        return this.servicesOperation != null;
    }

    /* renamed from: h */
    public final boolean mo27521h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27523i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVStopSchedule(", "stopId:");
        C0016g.m42z(n, this.stopId, ", ", "linesSchedulePattrensList:");
        List<MVStopLineSchedulePattern> list = this.linesSchedulePattrensList;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("servicesOperation:");
        List<MVTripServiceOperation> list2 = this.servicesOperation;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(")");
        return n.toString();
    }
}
