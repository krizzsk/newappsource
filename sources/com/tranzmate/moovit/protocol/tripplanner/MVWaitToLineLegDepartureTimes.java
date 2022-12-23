package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.linearrivals.MVArrival;
import com.tranzmate.moovit.protocol.linearrivals.MVStopRealTimeInformation;
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

public class MVWaitToLineLegDepartureTimes implements TBase<MVWaitToLineLegDepartureTimes, _Fields>, Serializable, Cloneable, Comparable<MVWaitToLineLegDepartureTimes> {

    /* renamed from: b */
    public static final C25113c f30245b = new C25113c("epochDay", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30246c = new C25113c("futureDepartures", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f30247d = new C25113c("stopRealTimeInfo", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f30248e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f30249f;
    private byte __isset_bitfield = 0;
    public int epochDay;
    public List<MVArrival> futureDepartures;
    private _Fields[] optionals = {_Fields.STOP_REAL_TIME_INFO};
    public MVStopRealTimeInformation stopRealTimeInfo;

    public enum _Fields implements C25085c {
        EPOCH_DAY(1, "epochDay"),
        FUTURE_DEPARTURES(2, "futureDepartures"),
        STOP_REAL_TIME_INFO(3, "stopRealTimeInfo");
        
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
                return EPOCH_DAY;
            }
            if (i == 2) {
                return FUTURE_DEPARTURES;
            }
            if (i != 3) {
                return null;
            }
            return STOP_REAL_TIME_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToLineLegDepartureTimes$a */
    public static class C11710a extends C25239c<MVWaitToLineLegDepartureTimes> {
        public C11710a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWaitToLineLegDepartureTimes mVWaitToLineLegDepartureTimes = (MVWaitToLineLegDepartureTimes) tBase;
            MVStopRealTimeInformation mVStopRealTimeInformation = mVWaitToLineLegDepartureTimes.stopRealTimeInfo;
            C25113c cVar = MVWaitToLineLegDepartureTimes.f30245b;
            gVar.mo61687K();
            gVar.mo61711x(MVWaitToLineLegDepartureTimes.f30245b);
            gVar.mo61678B(mVWaitToLineLegDepartureTimes.epochDay);
            gVar.mo61712y();
            if (mVWaitToLineLegDepartureTimes.futureDepartures != null) {
                gVar.mo61711x(MVWaitToLineLegDepartureTimes.f30246c);
                gVar.mo61680D(new C25119e((byte) 12, mVWaitToLineLegDepartureTimes.futureDepartures.size()));
                for (MVArrival X0 : mVWaitToLineLegDepartureTimes.futureDepartures) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVWaitToLineLegDepartureTimes.stopRealTimeInfo != null && mVWaitToLineLegDepartureTimes.mo34859h()) {
                gVar.mo61711x(MVWaitToLineLegDepartureTimes.f30247d);
                mVWaitToLineLegDepartureTimes.stopRealTimeInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWaitToLineLegDepartureTimes mVWaitToLineLegDepartureTimes = (MVWaitToLineLegDepartureTimes) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVStopRealTimeInformation mVStopRealTimeInformation = mVWaitToLineLegDepartureTimes.stopRealTimeInfo;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVStopRealTimeInformation mVStopRealTimeInformation2 = new MVStopRealTimeInformation();
                            mVWaitToLineLegDepartureTimes.stopRealTimeInfo = mVStopRealTimeInformation2;
                            mVStopRealTimeInformation2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVWaitToLineLegDepartureTimes.futureDepartures = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVArrival mVArrival = new MVArrival();
                            mVArrival.mo25201C1(gVar);
                            mVWaitToLineLegDepartureTimes.futureDepartures.add(mVArrival);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVWaitToLineLegDepartureTimes.epochDay = gVar.mo61696i();
                    mVWaitToLineLegDepartureTimes.mo34861i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToLineLegDepartureTimes$b */
    public static class C11711b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11710a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToLineLegDepartureTimes$c */
    public static class C11712c extends C25240d<MVWaitToLineLegDepartureTimes> {
        public C11712c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWaitToLineLegDepartureTimes mVWaitToLineLegDepartureTimes = (MVWaitToLineLegDepartureTimes) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWaitToLineLegDepartureTimes.mo34857f()) {
                bitSet.set(0);
            }
            if (mVWaitToLineLegDepartureTimes.mo34858g()) {
                bitSet.set(1);
            }
            if (mVWaitToLineLegDepartureTimes.mo34859h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVWaitToLineLegDepartureTimes.mo34857f()) {
                jVar.mo61678B(mVWaitToLineLegDepartureTimes.epochDay);
            }
            if (mVWaitToLineLegDepartureTimes.mo34858g()) {
                jVar.mo61678B(mVWaitToLineLegDepartureTimes.futureDepartures.size());
                for (MVArrival X0 : mVWaitToLineLegDepartureTimes.futureDepartures) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVWaitToLineLegDepartureTimes.mo34859h()) {
                mVWaitToLineLegDepartureTimes.stopRealTimeInfo.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWaitToLineLegDepartureTimes mVWaitToLineLegDepartureTimes = (MVWaitToLineLegDepartureTimes) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVWaitToLineLegDepartureTimes.epochDay = jVar.mo61696i();
                mVWaitToLineLegDepartureTimes.mo34861i();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVWaitToLineLegDepartureTimes.futureDepartures = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVArrival mVArrival = new MVArrival();
                    mVArrival.mo25201C1(jVar);
                    mVWaitToLineLegDepartureTimes.futureDepartures.add(mVArrival);
                }
            }
            if (T.get(2)) {
                MVStopRealTimeInformation mVStopRealTimeInformation = new MVStopRealTimeInformation();
                mVWaitToLineLegDepartureTimes.stopRealTimeInfo = mVStopRealTimeInformation;
                mVStopRealTimeInformation.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToLineLegDepartureTimes$d */
    public static class C11713d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11712c(0);
        }
    }

    static {
        new C17394d0("MVWaitToLineLegDepartureTimes");
        HashMap hashMap = new HashMap();
        f30248e = hashMap;
        hashMap.put(C25239c.class, new C11711b());
        hashMap.put(C25240d.class, new C11713d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.EPOCH_DAY, new FieldMetaData("epochDay", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FUTURE_DEPARTURES, new FieldMetaData("futureDepartures", (byte) 3, new ListMetaData(new StructMetaData(MVArrival.class))));
        enumMap.put(_Fields.STOP_REAL_TIME_INFO, new FieldMetaData("stopRealTimeInfo", (byte) 2, new StructMetaData(MVStopRealTimeInformation.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30249f = unmodifiableMap;
        FieldMetaData.m61947a(MVWaitToLineLegDepartureTimes.class, unmodifiableMap);
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
        ((C25238b) f30248e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30248e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34854a(MVWaitToLineLegDepartureTimes mVWaitToLineLegDepartureTimes) {
        if (mVWaitToLineLegDepartureTimes == null || this.epochDay != mVWaitToLineLegDepartureTimes.epochDay) {
            return false;
        }
        boolean g = mo34858g();
        boolean g2 = mVWaitToLineLegDepartureTimes.mo34858g();
        if ((g || g2) && (!g || !g2 || !this.futureDepartures.equals(mVWaitToLineLegDepartureTimes.futureDepartures))) {
            return false;
        }
        boolean h = mo34859h();
        boolean h2 = mVWaitToLineLegDepartureTimes.mo34859h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || !this.stopRealTimeInfo.mo28101a(mVWaitToLineLegDepartureTimes.stopRealTimeInfo)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWaitToLineLegDepartureTimes mVWaitToLineLegDepartureTimes = (MVWaitToLineLegDepartureTimes) obj;
        if (!getClass().equals(mVWaitToLineLegDepartureTimes.getClass())) {
            return getClass().getName().compareTo(mVWaitToLineLegDepartureTimes.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34857f()).compareTo(Boolean.valueOf(mVWaitToLineLegDepartureTimes.mo34857f()));
        if (compareTo2 != 0 || ((mo34857f() && (compareTo2 = C25082a.m62839c(this.epochDay, mVWaitToLineLegDepartureTimes.epochDay)) != 0) || (compareTo2 = Boolean.valueOf(mo34858g()).compareTo(Boolean.valueOf(mVWaitToLineLegDepartureTimes.mo34858g()))) != 0 || ((mo34858g() && (compareTo2 = C25082a.m62844h(this.futureDepartures, mVWaitToLineLegDepartureTimes.futureDepartures)) != 0) || (compareTo2 = Boolean.valueOf(mo34859h()).compareTo(Boolean.valueOf(mVWaitToLineLegDepartureTimes.mo34859h()))) != 0))) {
            return compareTo2;
        }
        if (!mo34859h() || (compareTo = this.stopRealTimeInfo.compareTo(mVWaitToLineLegDepartureTimes.stopRealTimeInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVWaitToLineLegDepartureTimes)) {
            return mo34854a((MVWaitToLineLegDepartureTimes) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34857f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo34858g() {
        return this.futureDepartures != null;
    }

    /* renamed from: h */
    public final boolean mo34859h() {
        return this.stopRealTimeInfo != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo34861i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWaitToLineLegDepartureTimes(", "epochDay:");
        C0016g.m42z(n, this.epochDay, ", ", "futureDepartures:");
        List<MVArrival> list = this.futureDepartures;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo34859h()) {
            n.append(", ");
            n.append("stopRealTimeInfo:");
            MVStopRealTimeInformation mVStopRealTimeInformation = this.stopRealTimeInfo;
            if (mVStopRealTimeInformation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVStopRealTimeInformation);
            }
        }
        n.append(")");
        return n.toString();
    }
}
