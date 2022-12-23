package com.tranzmate.moovit.protocol.share;

import com.appboy.support.StringUtils;
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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
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

public class MVGetShareEntityLinkRequest implements TBase<MVGetShareEntityLinkRequest, _Fields>, Serializable, Cloneable, Comparable<MVGetShareEntityLinkRequest> {

    /* renamed from: b */
    public static final C25113c f28297b = new C25113c("entityType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28298c = new C25113c("entityId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28299d = new C25113c("itinerary", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f28300e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28301f;
    public String entityId;
    public MVShareEntityType entityType;
    public MVTripPlanItinerary itinerary;
    private _Fields[] optionals = {_Fields.ITINERARY};

    public enum _Fields implements C25085c {
        ENTITY_TYPE(1, "entityType"),
        ENTITY_ID(2, "entityId"),
        ITINERARY(3, "itinerary");
        
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
                return ENTITY_TYPE;
            }
            if (i == 2) {
                return ENTITY_ID;
            }
            if (i != 3) {
                return null;
            }
            return ITINERARY;
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

    /* renamed from: com.tranzmate.moovit.protocol.share.MVGetShareEntityLinkRequest$a */
    public static class C10511a extends C25239c<MVGetShareEntityLinkRequest> {
        public C10511a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetShareEntityLinkRequest mVGetShareEntityLinkRequest = (MVGetShareEntityLinkRequest) tBase;
            MVTripPlanItinerary mVTripPlanItinerary = mVGetShareEntityLinkRequest.itinerary;
            C25113c cVar = MVGetShareEntityLinkRequest.f28297b;
            gVar.mo61687K();
            if (mVGetShareEntityLinkRequest.entityType != null) {
                gVar.mo61711x(MVGetShareEntityLinkRequest.f28297b);
                gVar.mo61678B(mVGetShareEntityLinkRequest.entityType.getValue());
                gVar.mo61712y();
            }
            if (mVGetShareEntityLinkRequest.entityId != null) {
                gVar.mo61711x(MVGetShareEntityLinkRequest.f28298c);
                gVar.mo61686J(mVGetShareEntityLinkRequest.entityId);
                gVar.mo61712y();
            }
            if (mVGetShareEntityLinkRequest.itinerary != null && mVGetShareEntityLinkRequest.mo31691h()) {
                gVar.mo61711x(MVGetShareEntityLinkRequest.f28299d);
                mVGetShareEntityLinkRequest.itinerary.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetShareEntityLinkRequest mVGetShareEntityLinkRequest = (MVGetShareEntityLinkRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTripPlanItinerary mVTripPlanItinerary = mVGetShareEntityLinkRequest.itinerary;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVTripPlanItinerary mVTripPlanItinerary2 = new MVTripPlanItinerary();
                            mVGetShareEntityLinkRequest.itinerary = mVTripPlanItinerary2;
                            mVTripPlanItinerary2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVGetShareEntityLinkRequest.entityId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVGetShareEntityLinkRequest.entityType = MVShareEntityType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.share.MVGetShareEntityLinkRequest$b */
    public static class C10512b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10511a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.share.MVGetShareEntityLinkRequest$c */
    public static class C10513c extends C25240d<MVGetShareEntityLinkRequest> {
        public C10513c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetShareEntityLinkRequest mVGetShareEntityLinkRequest = (MVGetShareEntityLinkRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetShareEntityLinkRequest.mo31690g()) {
                bitSet.set(0);
            }
            if (mVGetShareEntityLinkRequest.mo31689f()) {
                bitSet.set(1);
            }
            if (mVGetShareEntityLinkRequest.mo31691h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVGetShareEntityLinkRequest.mo31690g()) {
                jVar.mo61678B(mVGetShareEntityLinkRequest.entityType.getValue());
            }
            if (mVGetShareEntityLinkRequest.mo31689f()) {
                jVar.mo61686J(mVGetShareEntityLinkRequest.entityId);
            }
            if (mVGetShareEntityLinkRequest.mo31691h()) {
                mVGetShareEntityLinkRequest.itinerary.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetShareEntityLinkRequest mVGetShareEntityLinkRequest = (MVGetShareEntityLinkRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVGetShareEntityLinkRequest.entityType = MVShareEntityType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVGetShareEntityLinkRequest.entityId = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVTripPlanItinerary mVTripPlanItinerary = new MVTripPlanItinerary();
                mVGetShareEntityLinkRequest.itinerary = mVTripPlanItinerary;
                mVTripPlanItinerary.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.share.MVGetShareEntityLinkRequest$d */
    public static class C10514d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10513c(0);
        }
    }

    static {
        new C17394d0("MVGetShareEntityLinkRequest");
        HashMap hashMap = new HashMap();
        f28300e = hashMap;
        hashMap.put(C25239c.class, new C10512b());
        hashMap.put(C25240d.class, new C10514d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ENTITY_TYPE, new FieldMetaData("entityType", (byte) 3, new EnumMetaData(MVShareEntityType.class)));
        enumMap.put(_Fields.ENTITY_ID, new FieldMetaData("entityId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ITINERARY, new FieldMetaData("itinerary", (byte) 2, new StructMetaData(MVTripPlanItinerary.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28301f = unmodifiableMap;
        FieldMetaData.m61947a(MVGetShareEntityLinkRequest.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
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
        ((C25238b) f28300e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28300e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGetShareEntityLinkRequest mVGetShareEntityLinkRequest = (MVGetShareEntityLinkRequest) obj;
        if (!getClass().equals(mVGetShareEntityLinkRequest.getClass())) {
            return getClass().getName().compareTo(mVGetShareEntityLinkRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31690g()).compareTo(Boolean.valueOf(mVGetShareEntityLinkRequest.mo31690g()));
        if (compareTo2 != 0 || ((mo31690g() && (compareTo2 = this.entityType.compareTo(mVGetShareEntityLinkRequest.entityType)) != 0) || (compareTo2 = Boolean.valueOf(mo31689f()).compareTo(Boolean.valueOf(mVGetShareEntityLinkRequest.mo31689f()))) != 0 || ((mo31689f() && (compareTo2 = this.entityId.compareTo(mVGetShareEntityLinkRequest.entityId)) != 0) || (compareTo2 = Boolean.valueOf(mo31691h()).compareTo(Boolean.valueOf(mVGetShareEntityLinkRequest.mo31691h()))) != 0))) {
            return compareTo2;
        }
        if (!mo31691h() || (compareTo = this.itinerary.compareTo(mVGetShareEntityLinkRequest.itinerary)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetShareEntityLinkRequest)) {
            return false;
        }
        MVGetShareEntityLinkRequest mVGetShareEntityLinkRequest = (MVGetShareEntityLinkRequest) obj;
        boolean g = mo31690g();
        boolean g2 = mVGetShareEntityLinkRequest.mo31690g();
        if ((g || g2) && (!g || !g2 || !this.entityType.equals(mVGetShareEntityLinkRequest.entityType))) {
            return false;
        }
        boolean f = mo31689f();
        boolean f2 = mVGetShareEntityLinkRequest.mo31689f();
        if ((f || f2) && (!f || !f2 || !this.entityId.equals(mVGetShareEntityLinkRequest.entityId))) {
            return false;
        }
        boolean h = mo31691h();
        boolean h2 = mVGetShareEntityLinkRequest.mo31691h();
        if ((h || h2) && (!h || !h2 || !this.itinerary.mo34623a(mVGetShareEntityLinkRequest.itinerary))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31689f() {
        return this.entityId != null;
    }

    /* renamed from: g */
    public final boolean mo31690g() {
        return this.entityType != null;
    }

    /* renamed from: h */
    public final boolean mo31691h() {
        return this.itinerary != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetShareEntityLinkRequest(", "entityType:");
        MVShareEntityType mVShareEntityType = this.entityType;
        if (mVShareEntityType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVShareEntityType);
        }
        n.append(", ");
        n.append("entityId:");
        String str = this.entityId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo31691h()) {
            n.append(", ");
            n.append("itinerary:");
            MVTripPlanItinerary mVTripPlanItinerary = this.itinerary;
            if (mVTripPlanItinerary == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTripPlanItinerary);
            }
        }
        n.append(")");
        return n.toString();
    }
}
