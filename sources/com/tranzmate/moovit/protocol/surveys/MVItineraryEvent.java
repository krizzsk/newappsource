package com.tranzmate.moovit.protocol.surveys;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.tripplanner.MVJourney;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanItinerary;
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

public class MVItineraryEvent implements TBase<MVItineraryEvent, _Fields>, Serializable, Cloneable, Comparable<MVItineraryEvent> {

    /* renamed from: b */
    public static final C25113c f28396b = new C25113c("timestamp", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f28397c = new C25113c("itinerary", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28398d = new C25113c("journey", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f28399e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28400f;
    private byte __isset_bitfield = 0;
    public MVTripPlanItinerary itinerary;
    public MVJourney journey;
    public long timestamp;

    public enum _Fields implements C25085c {
        TIMESTAMP(1, "timestamp"),
        ITINERARY(2, "itinerary"),
        JOURNEY(3, "journey");
        
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
                return TIMESTAMP;
            }
            if (i == 2) {
                return ITINERARY;
            }
            if (i != 3) {
                return null;
            }
            return JOURNEY;
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

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVItineraryEvent$a */
    public static class C10597a extends C25239c<MVItineraryEvent> {
        public C10597a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVItineraryEvent mVItineraryEvent = (MVItineraryEvent) tBase;
            MVTripPlanItinerary mVTripPlanItinerary = mVItineraryEvent.itinerary;
            MVJourney mVJourney = mVItineraryEvent.journey;
            if (mVJourney != null) {
                mVJourney.mo34352h();
            }
            C25113c cVar = MVItineraryEvent.f28396b;
            gVar.mo61687K();
            gVar.mo61711x(MVItineraryEvent.f28396b);
            gVar.mo61679C(mVItineraryEvent.timestamp);
            gVar.mo61712y();
            if (mVItineraryEvent.itinerary != null) {
                gVar.mo61711x(MVItineraryEvent.f28397c);
                mVItineraryEvent.itinerary.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVItineraryEvent.journey != null) {
                gVar.mo61711x(MVItineraryEvent.f28398d);
                mVItineraryEvent.journey.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVItineraryEvent mVItineraryEvent = (MVItineraryEvent) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVJourney mVJourney = new MVJourney();
                            mVItineraryEvent.journey = mVJourney;
                            mVJourney.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVTripPlanItinerary mVTripPlanItinerary = new MVTripPlanItinerary();
                        mVItineraryEvent.itinerary = mVTripPlanItinerary;
                        mVTripPlanItinerary.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVItineraryEvent.timestamp = gVar.mo61697j();
                    mVItineraryEvent.mo31869i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVTripPlanItinerary mVTripPlanItinerary2 = mVItineraryEvent.itinerary;
            MVJourney mVJourney2 = mVItineraryEvent.journey;
            if (mVJourney2 != null) {
                mVJourney2.mo34352h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVItineraryEvent$b */
    public static class C10598b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10597a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVItineraryEvent$c */
    public static class C10599c extends C25240d<MVItineraryEvent> {
        public C10599c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVItineraryEvent mVItineraryEvent = (MVItineraryEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVItineraryEvent.mo31867h()) {
                bitSet.set(0);
            }
            if (mVItineraryEvent.mo31865f()) {
                bitSet.set(1);
            }
            if (mVItineraryEvent.mo31866g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVItineraryEvent.mo31867h()) {
                jVar.mo61679C(mVItineraryEvent.timestamp);
            }
            if (mVItineraryEvent.mo31865f()) {
                mVItineraryEvent.itinerary.mo25202X0(jVar);
            }
            if (mVItineraryEvent.mo31866g()) {
                mVItineraryEvent.journey.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVItineraryEvent mVItineraryEvent = (MVItineraryEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVItineraryEvent.timestamp = jVar.mo61697j();
                mVItineraryEvent.mo31869i();
            }
            if (T.get(1)) {
                MVTripPlanItinerary mVTripPlanItinerary = new MVTripPlanItinerary();
                mVItineraryEvent.itinerary = mVTripPlanItinerary;
                mVTripPlanItinerary.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVJourney mVJourney = new MVJourney();
                mVItineraryEvent.journey = mVJourney;
                mVJourney.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVItineraryEvent$d */
    public static class C10600d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10599c(0);
        }
    }

    static {
        new C17394d0("MVItineraryEvent");
        HashMap hashMap = new HashMap();
        f28399e = hashMap;
        hashMap.put(C25239c.class, new C10598b());
        hashMap.put(C25240d.class, new C10600d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.ITINERARY, new FieldMetaData("itinerary", (byte) 3, new StructMetaData(MVTripPlanItinerary.class)));
        enumMap.put(_Fields.JOURNEY, new FieldMetaData("journey", (byte) 3, new StructMetaData(MVJourney.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28400f = unmodifiableMap;
        FieldMetaData.m61947a(MVItineraryEvent.class, unmodifiableMap);
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
        ((C25238b) f28399e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28399e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVItineraryEvent mVItineraryEvent = (MVItineraryEvent) obj;
        if (!getClass().equals(mVItineraryEvent.getClass())) {
            return getClass().getName().compareTo(mVItineraryEvent.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31867h()).compareTo(Boolean.valueOf(mVItineraryEvent.mo31867h()));
        if (compareTo2 != 0 || ((mo31867h() && (compareTo2 = C25082a.m62840d(this.timestamp, mVItineraryEvent.timestamp)) != 0) || (compareTo2 = Boolean.valueOf(mo31865f()).compareTo(Boolean.valueOf(mVItineraryEvent.mo31865f()))) != 0 || ((mo31865f() && (compareTo2 = this.itinerary.compareTo(mVItineraryEvent.itinerary)) != 0) || (compareTo2 = Boolean.valueOf(mo31866g()).compareTo(Boolean.valueOf(mVItineraryEvent.mo31866g()))) != 0))) {
            return compareTo2;
        }
        if (!mo31866g() || (compareTo = this.journey.compareTo(mVItineraryEvent.journey)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVItineraryEvent)) {
            return false;
        }
        MVItineraryEvent mVItineraryEvent = (MVItineraryEvent) obj;
        if (this.timestamp != mVItineraryEvent.timestamp) {
            return false;
        }
        boolean f = mo31865f();
        boolean f2 = mVItineraryEvent.mo31865f();
        if ((f || f2) && (!f || !f2 || !this.itinerary.mo34623a(mVItineraryEvent.itinerary))) {
            return false;
        }
        boolean g = mo31866g();
        boolean g2 = mVItineraryEvent.mo31866g();
        if ((g || g2) && (!g || !g2 || !this.journey.mo34347a(mVItineraryEvent.journey))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31865f() {
        return this.itinerary != null;
    }

    /* renamed from: g */
    public final boolean mo31866g() {
        return this.journey != null;
    }

    /* renamed from: h */
    public final boolean mo31867h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo31869i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVItineraryEvent(", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "itinerary:");
        MVTripPlanItinerary mVTripPlanItinerary = this.itinerary;
        if (mVTripPlanItinerary == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTripPlanItinerary);
        }
        n.append(", ");
        n.append("journey:");
        MVJourney mVJourney = this.journey;
        if (mVJourney == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVJourney);
        }
        n.append(")");
        return n.toString();
    }
}
