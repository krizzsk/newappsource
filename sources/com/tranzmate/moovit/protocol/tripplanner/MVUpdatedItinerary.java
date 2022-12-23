package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.fare.MVItineraryFare;
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

public class MVUpdatedItinerary implements TBase<MVUpdatedItinerary, _Fields>, Serializable, Cloneable, Comparable<MVUpdatedItinerary> {

    /* renamed from: b */
    public static final C25113c f30211b = new C25113c("guid", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30212c = new C25113c("legs", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f30213d = new C25113c("hasPrev", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f30214e = new C25113c("hasNext", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f30215f = new C25113c("relevantForRealtime", (byte) 2, 5);

    /* renamed from: g */
    public static final C25113c f30216g = new C25113c("itineraryFare", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f30217h = new C25113c("serverContext", (byte) 11, 7);

    /* renamed from: i */
    public static final HashMap f30218i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f30219j;
    private byte __isset_bitfield = 0;
    public String guid;
    public boolean hasNext;
    public boolean hasPrev;
    public MVItineraryFare itineraryFare;
    public List<MVUpdatedTripPlanLeg> legs;
    private _Fields[] optionals = {_Fields.ITINERARY_FARE, _Fields.SERVER_CONTEXT};
    public boolean relevantForRealtime;
    public String serverContext;

    public enum _Fields implements C25085c {
        GUID(1, "guid"),
        LEGS(2, "legs"),
        HAS_PREV(3, "hasPrev"),
        HAS_NEXT(4, "hasNext"),
        RELEVANT_FOR_REALTIME(5, "relevantForRealtime"),
        ITINERARY_FARE(6, "itineraryFare"),
        SERVER_CONTEXT(7, "serverContext");
        
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
                    return LEGS;
                case 3:
                    return HAS_PREV;
                case 4:
                    return HAS_NEXT;
                case 5:
                    return RELEVANT_FOR_REALTIME;
                case 6:
                    return ITINERARY_FARE;
                case 7:
                    return SERVER_CONTEXT;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVUpdatedItinerary$a */
    public static class C11697a extends C25239c<MVUpdatedItinerary> {
        public C11697a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUpdatedItinerary mVUpdatedItinerary = (MVUpdatedItinerary) tBase;
            mVUpdatedItinerary.getClass();
            C25113c cVar = MVUpdatedItinerary.f30211b;
            gVar.mo61687K();
            if (mVUpdatedItinerary.guid != null) {
                gVar.mo61711x(MVUpdatedItinerary.f30211b);
                gVar.mo61686J(mVUpdatedItinerary.guid);
                gVar.mo61712y();
            }
            if (mVUpdatedItinerary.legs != null) {
                gVar.mo61711x(MVUpdatedItinerary.f30212c);
                gVar.mo61680D(new C25119e((byte) 12, mVUpdatedItinerary.legs.size()));
                for (MVUpdatedTripPlanLeg X0 : mVUpdatedItinerary.legs) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVUpdatedItinerary.f30213d);
            gVar.mo61708u(mVUpdatedItinerary.hasPrev);
            gVar.mo61712y();
            gVar.mo61711x(MVUpdatedItinerary.f30214e);
            gVar.mo61708u(mVUpdatedItinerary.hasNext);
            gVar.mo61712y();
            gVar.mo61711x(MVUpdatedItinerary.f30215f);
            gVar.mo61708u(mVUpdatedItinerary.relevantForRealtime);
            gVar.mo61712y();
            if (mVUpdatedItinerary.itineraryFare != null && mVUpdatedItinerary.mo34804i()) {
                gVar.mo61711x(MVUpdatedItinerary.f30216g);
                mVUpdatedItinerary.itineraryFare.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVUpdatedItinerary.serverContext != null && mVUpdatedItinerary.mo34807l()) {
                gVar.mo61711x(MVUpdatedItinerary.f30217h);
                gVar.mo61686J(mVUpdatedItinerary.serverContext);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUpdatedItinerary mVUpdatedItinerary = (MVUpdatedItinerary) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUpdatedItinerary.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUpdatedItinerary.guid = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVUpdatedItinerary.legs = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVUpdatedTripPlanLeg mVUpdatedTripPlanLeg = new MVUpdatedTripPlanLeg();
                                mVUpdatedTripPlanLeg.mo25201C1(gVar);
                                mVUpdatedItinerary.legs.add(mVUpdatedTripPlanLeg);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 3:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUpdatedItinerary.hasPrev = gVar.mo61690c();
                            mVUpdatedItinerary.mo34809o();
                            break;
                        }
                    case 4:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUpdatedItinerary.hasNext = gVar.mo61690c();
                            mVUpdatedItinerary.mo34808m();
                            break;
                        }
                    case 5:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUpdatedItinerary.relevantForRealtime = gVar.mo61690c();
                            mVUpdatedItinerary.mo34810p();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVItineraryFare mVItineraryFare = new MVItineraryFare();
                            mVUpdatedItinerary.itineraryFare = mVItineraryFare;
                            mVItineraryFare.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUpdatedItinerary.serverContext = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVUpdatedItinerary$b */
    public static class C11698b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11697a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVUpdatedItinerary$c */
    public static class C11699c extends C25240d<MVUpdatedItinerary> {
        public C11699c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUpdatedItinerary mVUpdatedItinerary = (MVUpdatedItinerary) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUpdatedItinerary.mo34800f()) {
                bitSet.set(0);
            }
            if (mVUpdatedItinerary.mo34805j()) {
                bitSet.set(1);
            }
            if (mVUpdatedItinerary.mo34802h()) {
                bitSet.set(2);
            }
            if (mVUpdatedItinerary.mo34801g()) {
                bitSet.set(3);
            }
            if (mVUpdatedItinerary.mo34806k()) {
                bitSet.set(4);
            }
            if (mVUpdatedItinerary.mo34804i()) {
                bitSet.set(5);
            }
            if (mVUpdatedItinerary.mo34807l()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVUpdatedItinerary.mo34800f()) {
                jVar.mo61686J(mVUpdatedItinerary.guid);
            }
            if (mVUpdatedItinerary.mo34805j()) {
                jVar.mo61678B(mVUpdatedItinerary.legs.size());
                for (MVUpdatedTripPlanLeg X0 : mVUpdatedItinerary.legs) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVUpdatedItinerary.mo34802h()) {
                jVar.mo61708u(mVUpdatedItinerary.hasPrev);
            }
            if (mVUpdatedItinerary.mo34801g()) {
                jVar.mo61708u(mVUpdatedItinerary.hasNext);
            }
            if (mVUpdatedItinerary.mo34806k()) {
                jVar.mo61708u(mVUpdatedItinerary.relevantForRealtime);
            }
            if (mVUpdatedItinerary.mo34804i()) {
                mVUpdatedItinerary.itineraryFare.mo25202X0(jVar);
            }
            if (mVUpdatedItinerary.mo34807l()) {
                jVar.mo61686J(mVUpdatedItinerary.serverContext);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUpdatedItinerary mVUpdatedItinerary = (MVUpdatedItinerary) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVUpdatedItinerary.guid = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVUpdatedItinerary.legs = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVUpdatedTripPlanLeg mVUpdatedTripPlanLeg = new MVUpdatedTripPlanLeg();
                    mVUpdatedTripPlanLeg.mo25201C1(jVar);
                    mVUpdatedItinerary.legs.add(mVUpdatedTripPlanLeg);
                }
            }
            if (T.get(2)) {
                mVUpdatedItinerary.hasPrev = jVar.mo61690c();
                mVUpdatedItinerary.mo34809o();
            }
            if (T.get(3)) {
                mVUpdatedItinerary.hasNext = jVar.mo61690c();
                mVUpdatedItinerary.mo34808m();
            }
            if (T.get(4)) {
                mVUpdatedItinerary.relevantForRealtime = jVar.mo61690c();
                mVUpdatedItinerary.mo34810p();
            }
            if (T.get(5)) {
                MVItineraryFare mVItineraryFare = new MVItineraryFare();
                mVUpdatedItinerary.itineraryFare = mVItineraryFare;
                mVItineraryFare.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVUpdatedItinerary.serverContext = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVUpdatedItinerary$d */
    public static class C11700d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11699c(0);
        }
    }

    static {
        new C17394d0("MVUpdatedItinerary");
        HashMap hashMap = new HashMap();
        f30218i = hashMap;
        hashMap.put(C25239c.class, new C11698b());
        hashMap.put(C25240d.class, new C11700d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.GUID, new FieldMetaData("guid", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LEGS, new FieldMetaData("legs", (byte) 3, new ListMetaData(new StructMetaData(MVUpdatedTripPlanLeg.class))));
        enumMap.put(_Fields.HAS_PREV, new FieldMetaData("hasPrev", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.HAS_NEXT, new FieldMetaData("hasNext", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.RELEVANT_FOR_REALTIME, new FieldMetaData("relevantForRealtime", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.ITINERARY_FARE, new FieldMetaData("itineraryFare", (byte) 2, new StructMetaData(MVItineraryFare.class)));
        enumMap.put(_Fields.SERVER_CONTEXT, new FieldMetaData("serverContext", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30219j = unmodifiableMap;
        FieldMetaData.m61947a(MVUpdatedItinerary.class, unmodifiableMap);
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
        ((C25238b) f30218i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30218i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34797a(MVUpdatedItinerary mVUpdatedItinerary) {
        if (mVUpdatedItinerary == null) {
            return false;
        }
        boolean f = mo34800f();
        boolean f2 = mVUpdatedItinerary.mo34800f();
        if ((f || f2) && (!f || !f2 || !this.guid.equals(mVUpdatedItinerary.guid))) {
            return false;
        }
        boolean j = mo34805j();
        boolean j2 = mVUpdatedItinerary.mo34805j();
        if (((j || j2) && (!j || !j2 || !this.legs.equals(mVUpdatedItinerary.legs))) || this.hasPrev != mVUpdatedItinerary.hasPrev || this.hasNext != mVUpdatedItinerary.hasNext || this.relevantForRealtime != mVUpdatedItinerary.relevantForRealtime) {
            return false;
        }
        boolean i = mo34804i();
        boolean i2 = mVUpdatedItinerary.mo34804i();
        if ((i || i2) && (!i || !i2 || !this.itineraryFare.mo27233a(mVUpdatedItinerary.itineraryFare))) {
            return false;
        }
        boolean l = mo34807l();
        boolean l2 = mVUpdatedItinerary.mo34807l();
        if (!l && !l2) {
            return true;
        }
        if (!l || !l2 || !this.serverContext.equals(mVUpdatedItinerary.serverContext)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVUpdatedItinerary mVUpdatedItinerary = (MVUpdatedItinerary) obj;
        if (!getClass().equals(mVUpdatedItinerary.getClass())) {
            return getClass().getName().compareTo(mVUpdatedItinerary.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34800f()).compareTo(Boolean.valueOf(mVUpdatedItinerary.mo34800f()));
        if (compareTo2 != 0 || ((mo34800f() && (compareTo2 = this.guid.compareTo(mVUpdatedItinerary.guid)) != 0) || (compareTo2 = Boolean.valueOf(mo34805j()).compareTo(Boolean.valueOf(mVUpdatedItinerary.mo34805j()))) != 0 || ((mo34805j() && (compareTo2 = C25082a.m62844h(this.legs, mVUpdatedItinerary.legs)) != 0) || (compareTo2 = Boolean.valueOf(mo34802h()).compareTo(Boolean.valueOf(mVUpdatedItinerary.mo34802h()))) != 0 || ((mo34802h() && (compareTo2 = C25082a.m62848l(this.hasPrev, mVUpdatedItinerary.hasPrev)) != 0) || (compareTo2 = Boolean.valueOf(mo34801g()).compareTo(Boolean.valueOf(mVUpdatedItinerary.mo34801g()))) != 0 || ((mo34801g() && (compareTo2 = C25082a.m62848l(this.hasNext, mVUpdatedItinerary.hasNext)) != 0) || (compareTo2 = Boolean.valueOf(mo34806k()).compareTo(Boolean.valueOf(mVUpdatedItinerary.mo34806k()))) != 0 || ((mo34806k() && (compareTo2 = C25082a.m62848l(this.relevantForRealtime, mVUpdatedItinerary.relevantForRealtime)) != 0) || (compareTo2 = Boolean.valueOf(mo34804i()).compareTo(Boolean.valueOf(mVUpdatedItinerary.mo34804i()))) != 0 || ((mo34804i() && (compareTo2 = this.itineraryFare.compareTo(mVUpdatedItinerary.itineraryFare)) != 0) || (compareTo2 = Boolean.valueOf(mo34807l()).compareTo(Boolean.valueOf(mVUpdatedItinerary.mo34807l()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo34807l() || (compareTo = this.serverContext.compareTo(mVUpdatedItinerary.serverContext)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVUpdatedItinerary)) {
            return mo34797a((MVUpdatedItinerary) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34800f() {
        return this.guid != null;
    }

    /* renamed from: g */
    public final boolean mo34801g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo34802h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34804i() {
        return this.itineraryFare != null;
    }

    /* renamed from: j */
    public final boolean mo34805j() {
        return this.legs != null;
    }

    /* renamed from: k */
    public final boolean mo34806k() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: l */
    public final boolean mo34807l() {
        return this.serverContext != null;
    }

    /* renamed from: m */
    public final void mo34808m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: o */
    public final void mo34809o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: p */
    public final void mo34810p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUpdatedItinerary(", "guid:");
        String str = this.guid;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("legs:");
        List<MVUpdatedTripPlanLeg> list = this.legs;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("hasPrev:");
        C13555b.m33977q(n, this.hasPrev, ", ", "hasNext:");
        C13555b.m33977q(n, this.hasNext, ", ", "relevantForRealtime:");
        n.append(this.relevantForRealtime);
        if (mo34804i()) {
            n.append(", ");
            n.append("itineraryFare:");
            MVItineraryFare mVItineraryFare = this.itineraryFare;
            if (mVItineraryFare == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVItineraryFare);
            }
        }
        if (mo34807l()) {
            n.append(", ");
            n.append("serverContext:");
            String str2 = this.serverContext;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
