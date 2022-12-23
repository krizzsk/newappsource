package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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

public class MVTodPassengerActionRequest implements TBase<MVTodPassengerActionRequest, _Fields>, Serializable, Cloneable, Comparable<MVTodPassengerActionRequest> {

    /* renamed from: b */
    public static final C25113c f29474b = new C25113c("rideId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29475c = new C25113c("actionId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29476d = new C25113c("actionInfo", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f29477e = new C25113c("currentUserLocation", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f29478f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29479g;
    public String actionId;
    public MVTodPassengerActionAdditionalInfo actionInfo;
    public MVLatLon currentUserLocation;
    private _Fields[] optionals = {_Fields.ACTION_INFO, _Fields.CURRENT_USER_LOCATION};
    public String rideId;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        ACTION_ID(2, "actionId"),
        ACTION_INFO(3, "actionInfo"),
        CURRENT_USER_LOCATION(4, "currentUserLocation");
        
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
                return RIDE_ID;
            }
            if (i == 2) {
                return ACTION_ID;
            }
            if (i == 3) {
                return ACTION_INFO;
            }
            if (i != 4) {
                return null;
            }
            return CURRENT_USER_LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequest$a */
    public static class C11266a extends C25239c<MVTodPassengerActionRequest> {
        public C11266a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerActionRequest mVTodPassengerActionRequest = (MVTodPassengerActionRequest) tBase;
            MVLatLon mVLatLon = mVTodPassengerActionRequest.currentUserLocation;
            C25113c cVar = MVTodPassengerActionRequest.f29474b;
            gVar.mo61687K();
            if (mVTodPassengerActionRequest.rideId != null) {
                gVar.mo61711x(MVTodPassengerActionRequest.f29474b);
                gVar.mo61686J(mVTodPassengerActionRequest.rideId);
                gVar.mo61712y();
            }
            if (mVTodPassengerActionRequest.actionId != null) {
                gVar.mo61711x(MVTodPassengerActionRequest.f29475c);
                gVar.mo61686J(mVTodPassengerActionRequest.actionId);
                gVar.mo61712y();
            }
            if (mVTodPassengerActionRequest.actionInfo != null && mVTodPassengerActionRequest.mo33559g()) {
                gVar.mo61711x(MVTodPassengerActionRequest.f29476d);
                mVTodPassengerActionRequest.actionInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodPassengerActionRequest.currentUserLocation != null && mVTodPassengerActionRequest.mo33560h()) {
                gVar.mo61711x(MVTodPassengerActionRequest.f29477e);
                mVTodPassengerActionRequest.currentUserLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerActionRequest mVTodPassengerActionRequest = (MVTodPassengerActionRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVTodPassengerActionRequest.currentUserLocation;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVLatLon mVLatLon2 = new MVLatLon();
                                mVTodPassengerActionRequest.currentUserLocation = mVLatLon2;
                                mVLatLon2.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVTodPassengerActionAdditionalInfo mVTodPassengerActionAdditionalInfo = new MVTodPassengerActionAdditionalInfo();
                            mVTodPassengerActionRequest.actionInfo = mVTodPassengerActionAdditionalInfo;
                            mVTodPassengerActionAdditionalInfo.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTodPassengerActionRequest.actionId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodPassengerActionRequest.rideId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequest$b */
    public static class C11267b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11266a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequest$c */
    public static class C11268c extends C25240d<MVTodPassengerActionRequest> {
        public C11268c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerActionRequest mVTodPassengerActionRequest = (MVTodPassengerActionRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodPassengerActionRequest.mo33562i()) {
                bitSet.set(0);
            }
            if (mVTodPassengerActionRequest.mo33558f()) {
                bitSet.set(1);
            }
            if (mVTodPassengerActionRequest.mo33559g()) {
                bitSet.set(2);
            }
            if (mVTodPassengerActionRequest.mo33560h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTodPassengerActionRequest.mo33562i()) {
                jVar.mo61686J(mVTodPassengerActionRequest.rideId);
            }
            if (mVTodPassengerActionRequest.mo33558f()) {
                jVar.mo61686J(mVTodPassengerActionRequest.actionId);
            }
            if (mVTodPassengerActionRequest.mo33559g()) {
                mVTodPassengerActionRequest.actionInfo.mo25202X0(jVar);
            }
            if (mVTodPassengerActionRequest.mo33560h()) {
                mVTodPassengerActionRequest.currentUserLocation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerActionRequest mVTodPassengerActionRequest = (MVTodPassengerActionRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTodPassengerActionRequest.rideId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTodPassengerActionRequest.actionId = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVTodPassengerActionAdditionalInfo mVTodPassengerActionAdditionalInfo = new MVTodPassengerActionAdditionalInfo();
                mVTodPassengerActionRequest.actionInfo = mVTodPassengerActionAdditionalInfo;
                mVTodPassengerActionAdditionalInfo.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVTodPassengerActionRequest.currentUserLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequest$d */
    public static class C11269d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11268c(0);
        }
    }

    static {
        new C17394d0("MVTodPassengerActionRequest");
        HashMap hashMap = new HashMap();
        f29478f = hashMap;
        hashMap.put(C25239c.class, new C11267b());
        hashMap.put(C25240d.class, new C11269d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACTION_ID, new FieldMetaData("actionId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACTION_INFO, new FieldMetaData("actionInfo", (byte) 2, new StructMetaData(MVTodPassengerActionAdditionalInfo.class)));
        enumMap.put(_Fields.CURRENT_USER_LOCATION, new FieldMetaData("currentUserLocation", (byte) 2, new StructMetaData(MVLatLon.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29479g = unmodifiableMap;
        FieldMetaData.m61947a(MVTodPassengerActionRequest.class, unmodifiableMap);
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
        ((C25238b) f29478f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29478f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodPassengerActionRequest mVTodPassengerActionRequest = (MVTodPassengerActionRequest) obj;
        if (!getClass().equals(mVTodPassengerActionRequest.getClass())) {
            return getClass().getName().compareTo(mVTodPassengerActionRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33562i()).compareTo(Boolean.valueOf(mVTodPassengerActionRequest.mo33562i()));
        if (compareTo2 != 0 || ((mo33562i() && (compareTo2 = this.rideId.compareTo(mVTodPassengerActionRequest.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo33558f()).compareTo(Boolean.valueOf(mVTodPassengerActionRequest.mo33558f()))) != 0 || ((mo33558f() && (compareTo2 = this.actionId.compareTo(mVTodPassengerActionRequest.actionId)) != 0) || (compareTo2 = Boolean.valueOf(mo33559g()).compareTo(Boolean.valueOf(mVTodPassengerActionRequest.mo33559g()))) != 0 || ((mo33559g() && (compareTo2 = this.actionInfo.compareTo(mVTodPassengerActionRequest.actionInfo)) != 0) || (compareTo2 = Boolean.valueOf(mo33560h()).compareTo(Boolean.valueOf(mVTodPassengerActionRequest.mo33560h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo33560h() || (compareTo = this.currentUserLocation.compareTo(mVTodPassengerActionRequest.currentUserLocation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequest
            r2 = 1
            if (r1 == 0) goto L_0x0092
            com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequest r7 = (com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequest) r7
            boolean r1 = r6.mo33562i()
            boolean r3 = r7.mo33562i()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x0029
        L_0x0017:
            if (r1 == 0) goto L_0x0092
            if (r3 != 0) goto L_0x001d
            goto L_0x0092
        L_0x001d:
            java.lang.String r1 = r6.rideId
            java.lang.String r3 = r7.rideId
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0092
        L_0x0029:
            boolean r1 = r6.mo33558f()
            boolean r3 = r7.mo33558f()
            if (r1 != 0) goto L_0x0035
            if (r3 == 0) goto L_0x0045
        L_0x0035:
            if (r1 == 0) goto L_0x0092
            if (r3 != 0) goto L_0x003a
            goto L_0x0092
        L_0x003a:
            java.lang.String r1 = r6.actionId
            java.lang.String r3 = r7.actionId
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0045
            goto L_0x0092
        L_0x0045:
            boolean r1 = r6.mo33559g()
            boolean r3 = r7.mo33559g()
            if (r1 != 0) goto L_0x0051
            if (r3 == 0) goto L_0x0075
        L_0x0051:
            if (r1 == 0) goto L_0x0092
            if (r3 != 0) goto L_0x0056
            goto L_0x0092
        L_0x0056:
            com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionAdditionalInfo r1 = r6.actionInfo
            com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionAdditionalInfo r3 = r7.actionInfo
            if (r3 == 0) goto L_0x006e
            F r4 = r1.setField_
            F r5 = r3.setField_
            if (r4 != r5) goto L_0x0071
            java.lang.Object r1 = r1.value_
            java.lang.Object r3 = r3.value_
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0071
            r1 = 1
            goto L_0x0072
        L_0x006e:
            r1.getClass()
        L_0x0071:
            r1 = 0
        L_0x0072:
            if (r1 != 0) goto L_0x0075
            goto L_0x0092
        L_0x0075:
            boolean r1 = r6.mo33560h()
            boolean r3 = r7.mo33560h()
            if (r1 != 0) goto L_0x0081
            if (r3 == 0) goto L_0x0091
        L_0x0081:
            if (r1 == 0) goto L_0x0092
            if (r3 != 0) goto L_0x0086
            goto L_0x0092
        L_0x0086:
            com.tranzmate.moovit.protocol.common.MVLatLon r1 = r6.currentUserLocation
            com.tranzmate.moovit.protocol.common.MVLatLon r7 = r7.currentUserLocation
            boolean r7 = r1.mo26290a(r7)
            if (r7 != 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r0 = 1
        L_0x0092:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequest.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo33558f() {
        return this.actionId != null;
    }

    /* renamed from: g */
    public final boolean mo33559g() {
        return this.actionInfo != null;
    }

    /* renamed from: h */
    public final boolean mo33560h() {
        return this.currentUserLocation != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33562i() {
        return this.rideId != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodPassengerActionRequest(", "rideId:");
        String str = this.rideId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("actionId:");
        String str2 = this.actionId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo33559g()) {
            n.append(", ");
            n.append("actionInfo:");
            MVTodPassengerActionAdditionalInfo mVTodPassengerActionAdditionalInfo = this.actionInfo;
            if (mVTodPassengerActionAdditionalInfo == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTodPassengerActionAdditionalInfo);
            }
        }
        if (mo33560h()) {
            n.append(", ");
            n.append("currentUserLocation:");
            MVLatLon mVLatLon = this.currentUserLocation;
            if (mVLatLon == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLatLon);
            }
        }
        n.append(")");
        return n.toString();
    }
}
