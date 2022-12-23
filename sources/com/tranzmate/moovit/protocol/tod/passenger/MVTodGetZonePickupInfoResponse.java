package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
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

public class MVTodGetZonePickupInfoResponse implements TBase<MVTodGetZonePickupInfoResponse, _Fields>, Serializable, Cloneable, Comparable<MVTodGetZonePickupInfoResponse> {

    /* renamed from: b */
    public static final C25113c f29406b = new C25113c("pickupShapes", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f29407c = new C25113c("hasServiceAreas", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f29408d = new C25113c("pickupExplanationURL", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f29409e = new C25113c("pickupStops", (byte) 15, 4);

    /* renamed from: f */
    public static final HashMap f29410f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29411g;
    private byte __isset_bitfield = 0;
    public boolean hasServiceAreas;
    private _Fields[] optionals = {_Fields.PICKUP_EXPLANATION_URL};
    public String pickupExplanationURL;
    public List<MVTodZoneShape> pickupShapes;
    public List<MVLocationDescriptor> pickupStops;

    public enum _Fields implements C25085c {
        PICKUP_SHAPES(1, "pickupShapes"),
        HAS_SERVICE_AREAS(2, "hasServiceAreas"),
        PICKUP_EXPLANATION_URL(3, "pickupExplanationURL"),
        PICKUP_STOPS(4, "pickupStops");
        
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
                return PICKUP_SHAPES;
            }
            if (i == 2) {
                return HAS_SERVICE_AREAS;
            }
            if (i == 3) {
                return PICKUP_EXPLANATION_URL;
            }
            if (i != 4) {
                return null;
            }
            return PICKUP_STOPS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZonePickupInfoResponse$a */
    public static class C11237a extends C25239c<MVTodGetZonePickupInfoResponse> {
        public C11237a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodGetZonePickupInfoResponse mVTodGetZonePickupInfoResponse = (MVTodGetZonePickupInfoResponse) tBase;
            mVTodGetZonePickupInfoResponse.getClass();
            C25113c cVar = MVTodGetZonePickupInfoResponse.f29406b;
            gVar.mo61687K();
            if (mVTodGetZonePickupInfoResponse.pickupShapes != null) {
                gVar.mo61711x(MVTodGetZonePickupInfoResponse.f29406b);
                gVar.mo61680D(new C25119e((byte) 12, mVTodGetZonePickupInfoResponse.pickupShapes.size()));
                for (MVTodZoneShape X0 : mVTodGetZonePickupInfoResponse.pickupShapes) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTodGetZonePickupInfoResponse.f29407c);
            gVar.mo61708u(mVTodGetZonePickupInfoResponse.hasServiceAreas);
            gVar.mo61712y();
            if (mVTodGetZonePickupInfoResponse.pickupExplanationURL != null && mVTodGetZonePickupInfoResponse.mo33448g()) {
                gVar.mo61711x(MVTodGetZonePickupInfoResponse.f29408d);
                gVar.mo61686J(mVTodGetZonePickupInfoResponse.pickupExplanationURL);
                gVar.mo61712y();
            }
            if (mVTodGetZonePickupInfoResponse.pickupStops != null) {
                gVar.mo61711x(MVTodGetZonePickupInfoResponse.f29409e);
                gVar.mo61680D(new C25119e((byte) 12, mVTodGetZonePickupInfoResponse.pickupStops.size()));
                for (MVLocationDescriptor X02 : mVTodGetZonePickupInfoResponse.pickupStops) {
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
            MVTodGetZonePickupInfoResponse mVTodGetZonePickupInfoResponse = (MVTodGetZonePickupInfoResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodGetZonePickupInfoResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 15) {
                                C25119e k = gVar.mo61698k();
                                mVTodGetZonePickupInfoResponse.pickupStops = new ArrayList(k.f63395b);
                                while (i < k.f63395b) {
                                    MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                                    mVLocationDescriptor.mo25201C1(gVar);
                                    mVTodGetZonePickupInfoResponse.pickupStops.add(mVLocationDescriptor);
                                    i++;
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVTodGetZonePickupInfoResponse.pickupExplanationURL = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVTodGetZonePickupInfoResponse.hasServiceAreas = gVar.mo61690c();
                        mVTodGetZonePickupInfoResponse.mo33452j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k2 = gVar.mo61698k();
                    mVTodGetZonePickupInfoResponse.pickupShapes = new ArrayList(k2.f63395b);
                    while (i < k2.f63395b) {
                        MVTodZoneShape mVTodZoneShape = new MVTodZoneShape();
                        mVTodZoneShape.mo25201C1(gVar);
                        mVTodGetZonePickupInfoResponse.pickupShapes.add(mVTodZoneShape);
                        i++;
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZonePickupInfoResponse$b */
    public static class C11238b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11237a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZonePickupInfoResponse$c */
    public static class C11239c extends C25240d<MVTodGetZonePickupInfoResponse> {
        public C11239c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodGetZonePickupInfoResponse mVTodGetZonePickupInfoResponse = (MVTodGetZonePickupInfoResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodGetZonePickupInfoResponse.mo33449h()) {
                bitSet.set(0);
            }
            if (mVTodGetZonePickupInfoResponse.mo33447f()) {
                bitSet.set(1);
            }
            if (mVTodGetZonePickupInfoResponse.mo33448g()) {
                bitSet.set(2);
            }
            if (mVTodGetZonePickupInfoResponse.mo33451i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTodGetZonePickupInfoResponse.mo33449h()) {
                jVar.mo61678B(mVTodGetZonePickupInfoResponse.pickupShapes.size());
                for (MVTodZoneShape X0 : mVTodGetZonePickupInfoResponse.pickupShapes) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVTodGetZonePickupInfoResponse.mo33447f()) {
                jVar.mo61708u(mVTodGetZonePickupInfoResponse.hasServiceAreas);
            }
            if (mVTodGetZonePickupInfoResponse.mo33448g()) {
                jVar.mo61686J(mVTodGetZonePickupInfoResponse.pickupExplanationURL);
            }
            if (mVTodGetZonePickupInfoResponse.mo33451i()) {
                jVar.mo61678B(mVTodGetZonePickupInfoResponse.pickupStops.size());
                for (MVLocationDescriptor X02 : mVTodGetZonePickupInfoResponse.pickupStops) {
                    X02.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodGetZonePickupInfoResponse mVTodGetZonePickupInfoResponse = (MVTodGetZonePickupInfoResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVTodGetZonePickupInfoResponse.pickupShapes = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTodZoneShape mVTodZoneShape = new MVTodZoneShape();
                    mVTodZoneShape.mo25201C1(jVar);
                    mVTodGetZonePickupInfoResponse.pickupShapes.add(mVTodZoneShape);
                }
            }
            if (T.get(1)) {
                mVTodGetZonePickupInfoResponse.hasServiceAreas = jVar.mo61690c();
                mVTodGetZonePickupInfoResponse.mo33452j();
            }
            if (T.get(2)) {
                mVTodGetZonePickupInfoResponse.pickupExplanationURL = jVar.mo61704q();
            }
            if (T.get(3)) {
                int i3 = jVar.mo61696i();
                mVTodGetZonePickupInfoResponse.pickupStops = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                    mVLocationDescriptor.mo25201C1(jVar);
                    mVTodGetZonePickupInfoResponse.pickupStops.add(mVLocationDescriptor);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZonePickupInfoResponse$d */
    public static class C11240d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11239c(0);
        }
    }

    static {
        new C17394d0("MVTodGetZonePickupInfoResponse");
        HashMap hashMap = new HashMap();
        f29410f = hashMap;
        hashMap.put(C25239c.class, new C11238b());
        hashMap.put(C25240d.class, new C11240d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PICKUP_SHAPES, new FieldMetaData("pickupShapes", (byte) 3, new ListMetaData(new StructMetaData(MVTodZoneShape.class))));
        enumMap.put(_Fields.HAS_SERVICE_AREAS, new FieldMetaData("hasServiceAreas", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PICKUP_EXPLANATION_URL, new FieldMetaData("pickupExplanationURL", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PICKUP_STOPS, new FieldMetaData("pickupStops", (byte) 3, new ListMetaData(new StructMetaData(MVLocationDescriptor.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29411g = unmodifiableMap;
        FieldMetaData.m61947a(MVTodGetZonePickupInfoResponse.class, unmodifiableMap);
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
        ((C25238b) f29410f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29410f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVTodGetZonePickupInfoResponse mVTodGetZonePickupInfoResponse = (MVTodGetZonePickupInfoResponse) obj;
        if (!getClass().equals(mVTodGetZonePickupInfoResponse.getClass())) {
            return getClass().getName().compareTo(mVTodGetZonePickupInfoResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33449h()).compareTo(Boolean.valueOf(mVTodGetZonePickupInfoResponse.mo33449h()));
        if (compareTo != 0 || ((mo33449h() && (compareTo = C25082a.m62844h(this.pickupShapes, mVTodGetZonePickupInfoResponse.pickupShapes)) != 0) || (compareTo = Boolean.valueOf(mo33447f()).compareTo(Boolean.valueOf(mVTodGetZonePickupInfoResponse.mo33447f()))) != 0 || ((mo33447f() && (compareTo = C25082a.m62848l(this.hasServiceAreas, mVTodGetZonePickupInfoResponse.hasServiceAreas)) != 0) || (compareTo = Boolean.valueOf(mo33448g()).compareTo(Boolean.valueOf(mVTodGetZonePickupInfoResponse.mo33448g()))) != 0 || ((mo33448g() && (compareTo = this.pickupExplanationURL.compareTo(mVTodGetZonePickupInfoResponse.pickupExplanationURL)) != 0) || (compareTo = Boolean.valueOf(mo33451i()).compareTo(Boolean.valueOf(mVTodGetZonePickupInfoResponse.mo33451i()))) != 0)))) {
            return compareTo;
        }
        if (!mo33451i() || (h = C25082a.m62844h(this.pickupStops, mVTodGetZonePickupInfoResponse.pickupStops)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodGetZonePickupInfoResponse)) {
            return false;
        }
        MVTodGetZonePickupInfoResponse mVTodGetZonePickupInfoResponse = (MVTodGetZonePickupInfoResponse) obj;
        boolean h = mo33449h();
        boolean h2 = mVTodGetZonePickupInfoResponse.mo33449h();
        if (((h || h2) && (!h || !h2 || !this.pickupShapes.equals(mVTodGetZonePickupInfoResponse.pickupShapes))) || this.hasServiceAreas != mVTodGetZonePickupInfoResponse.hasServiceAreas) {
            return false;
        }
        boolean g = mo33448g();
        boolean g2 = mVTodGetZonePickupInfoResponse.mo33448g();
        if ((g || g2) && (!g || !g2 || !this.pickupExplanationURL.equals(mVTodGetZonePickupInfoResponse.pickupExplanationURL))) {
            return false;
        }
        boolean i = mo33451i();
        boolean i2 = mVTodGetZonePickupInfoResponse.mo33451i();
        if ((i || i2) && (!i || !i2 || !this.pickupStops.equals(mVTodGetZonePickupInfoResponse.pickupStops))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33447f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo33448g() {
        return this.pickupExplanationURL != null;
    }

    /* renamed from: h */
    public final boolean mo33449h() {
        return this.pickupShapes != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33451i() {
        return this.pickupStops != null;
    }

    /* renamed from: j */
    public final void mo33452j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodGetZonePickupInfoResponse(", "pickupShapes:");
        List<MVTodZoneShape> list = this.pickupShapes;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("hasServiceAreas:");
        n.append(this.hasServiceAreas);
        if (mo33448g()) {
            n.append(", ");
            n.append("pickupExplanationURL:");
            String str = this.pickupExplanationURL;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(", ");
        n.append("pickupStops:");
        List<MVLocationDescriptor> list2 = this.pickupStops;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(")");
        return n.toString();
    }
}
