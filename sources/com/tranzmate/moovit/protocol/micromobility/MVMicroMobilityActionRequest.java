package com.tranzmate.moovit.protocol.micromobility;

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
import p001a0.C0016g;
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

public class MVMicroMobilityActionRequest implements TBase<MVMicroMobilityActionRequest, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityActionRequest> {

    /* renamed from: b */
    public static final C25113c f26489b = new C25113c("rideId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26490c = new C25113c("actionId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26491d = new C25113c("additionalInfo", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f26492e = new C25113c("currentUserLocation", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f26493f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26494g;
    private byte __isset_bitfield = 0;
    public String actionId;
    public MVMicroMobilityActionAdditionalInfo additionalInfo;
    public MVLatLon currentUserLocation;
    private _Fields[] optionals = {_Fields.ADDITIONAL_INFO, _Fields.CURRENT_USER_LOCATION};
    public int rideId;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        ACTION_ID(2, "actionId"),
        ADDITIONAL_INFO(3, "additionalInfo"),
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
                return ADDITIONAL_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequest$a */
    public static class C9189a extends C25239c<MVMicroMobilityActionRequest> {
        public C9189a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionRequest mVMicroMobilityActionRequest = (MVMicroMobilityActionRequest) tBase;
            MVLatLon mVLatLon = mVMicroMobilityActionRequest.currentUserLocation;
            C25113c cVar = MVMicroMobilityActionRequest.f26489b;
            gVar.mo61687K();
            gVar.mo61711x(MVMicroMobilityActionRequest.f26489b);
            gVar.mo61678B(mVMicroMobilityActionRequest.rideId);
            gVar.mo61712y();
            if (mVMicroMobilityActionRequest.actionId != null) {
                gVar.mo61711x(MVMicroMobilityActionRequest.f26490c);
                gVar.mo61686J(mVMicroMobilityActionRequest.actionId);
                gVar.mo61712y();
            }
            if (mVMicroMobilityActionRequest.additionalInfo != null && mVMicroMobilityActionRequest.mo28623g()) {
                gVar.mo61711x(MVMicroMobilityActionRequest.f26491d);
                mVMicroMobilityActionRequest.additionalInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityActionRequest.currentUserLocation != null && mVMicroMobilityActionRequest.mo28624h()) {
                gVar.mo61711x(MVMicroMobilityActionRequest.f26492e);
                mVMicroMobilityActionRequest.currentUserLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionRequest mVMicroMobilityActionRequest = (MVMicroMobilityActionRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVMicroMobilityActionRequest.currentUserLocation;
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
                                mVMicroMobilityActionRequest.currentUserLocation = mVLatLon2;
                                mVLatLon2.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVMicroMobilityActionAdditionalInfo mVMicroMobilityActionAdditionalInfo = new MVMicroMobilityActionAdditionalInfo();
                            mVMicroMobilityActionRequest.additionalInfo = mVMicroMobilityActionAdditionalInfo;
                            mVMicroMobilityActionAdditionalInfo.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVMicroMobilityActionRequest.actionId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVMicroMobilityActionRequest.rideId = gVar.mo61696i();
                    mVMicroMobilityActionRequest.mo28627j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequest$b */
    public static class C9190b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9189a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequest$c */
    public static class C9191c extends C25240d<MVMicroMobilityActionRequest> {
        public C9191c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionRequest mVMicroMobilityActionRequest = (MVMicroMobilityActionRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityActionRequest.mo28626i()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityActionRequest.mo28622f()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityActionRequest.mo28623g()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityActionRequest.mo28624h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVMicroMobilityActionRequest.mo28626i()) {
                jVar.mo61678B(mVMicroMobilityActionRequest.rideId);
            }
            if (mVMicroMobilityActionRequest.mo28622f()) {
                jVar.mo61686J(mVMicroMobilityActionRequest.actionId);
            }
            if (mVMicroMobilityActionRequest.mo28623g()) {
                mVMicroMobilityActionRequest.additionalInfo.mo25202X0(jVar);
            }
            if (mVMicroMobilityActionRequest.mo28624h()) {
                mVMicroMobilityActionRequest.currentUserLocation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionRequest mVMicroMobilityActionRequest = (MVMicroMobilityActionRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVMicroMobilityActionRequest.rideId = jVar.mo61696i();
                mVMicroMobilityActionRequest.mo28627j();
            }
            if (T.get(1)) {
                mVMicroMobilityActionRequest.actionId = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVMicroMobilityActionAdditionalInfo mVMicroMobilityActionAdditionalInfo = new MVMicroMobilityActionAdditionalInfo();
                mVMicroMobilityActionRequest.additionalInfo = mVMicroMobilityActionAdditionalInfo;
                mVMicroMobilityActionAdditionalInfo.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVMicroMobilityActionRequest.currentUserLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequest$d */
    public static class C9192d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9191c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityActionRequest");
        HashMap hashMap = new HashMap();
        f26493f = hashMap;
        hashMap.put(C25239c.class, new C9190b());
        hashMap.put(C25240d.class, new C9192d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ACTION_ID, new FieldMetaData("actionId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ADDITIONAL_INFO, new FieldMetaData("additionalInfo", (byte) 2, new StructMetaData(MVMicroMobilityActionAdditionalInfo.class)));
        enumMap.put(_Fields.CURRENT_USER_LOCATION, new FieldMetaData("currentUserLocation", (byte) 2, new StructMetaData(MVLatLon.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26494g = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityActionRequest.class, unmodifiableMap);
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
        ((C25238b) f26493f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26493f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityActionRequest mVMicroMobilityActionRequest = (MVMicroMobilityActionRequest) obj;
        if (!getClass().equals(mVMicroMobilityActionRequest.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityActionRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28626i()).compareTo(Boolean.valueOf(mVMicroMobilityActionRequest.mo28626i()));
        if (compareTo2 != 0 || ((mo28626i() && (compareTo2 = C25082a.m62839c(this.rideId, mVMicroMobilityActionRequest.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo28622f()).compareTo(Boolean.valueOf(mVMicroMobilityActionRequest.mo28622f()))) != 0 || ((mo28622f() && (compareTo2 = this.actionId.compareTo(mVMicroMobilityActionRequest.actionId)) != 0) || (compareTo2 = Boolean.valueOf(mo28623g()).compareTo(Boolean.valueOf(mVMicroMobilityActionRequest.mo28623g()))) != 0 || ((mo28623g() && (compareTo2 = this.additionalInfo.compareTo(mVMicroMobilityActionRequest.additionalInfo)) != 0) || (compareTo2 = Boolean.valueOf(mo28624h()).compareTo(Boolean.valueOf(mVMicroMobilityActionRequest.mo28624h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo28624h() || (compareTo = this.currentUserLocation.compareTo(mVMicroMobilityActionRequest.currentUserLocation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequest
            r2 = 1
            if (r1 == 0) goto L_0x007c
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequest r7 = (com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequest) r7
            int r1 = r6.rideId
            int r3 = r7.rideId
            if (r1 == r3) goto L_0x0013
            goto L_0x007c
        L_0x0013:
            boolean r1 = r6.mo28622f()
            boolean r3 = r7.mo28622f()
            if (r1 != 0) goto L_0x001f
            if (r3 == 0) goto L_0x002f
        L_0x001f:
            if (r1 == 0) goto L_0x007c
            if (r3 != 0) goto L_0x0024
            goto L_0x007c
        L_0x0024:
            java.lang.String r1 = r6.actionId
            java.lang.String r3 = r7.actionId
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x002f
            goto L_0x007c
        L_0x002f:
            boolean r1 = r6.mo28623g()
            boolean r3 = r7.mo28623g()
            if (r1 != 0) goto L_0x003b
            if (r3 == 0) goto L_0x005f
        L_0x003b:
            if (r1 == 0) goto L_0x007c
            if (r3 != 0) goto L_0x0040
            goto L_0x007c
        L_0x0040:
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionAdditionalInfo r1 = r6.additionalInfo
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionAdditionalInfo r3 = r7.additionalInfo
            if (r3 == 0) goto L_0x0058
            F r4 = r1.setField_
            F r5 = r3.setField_
            if (r4 != r5) goto L_0x005b
            java.lang.Object r1 = r1.value_
            java.lang.Object r3 = r3.value_
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005b
            r1 = 1
            goto L_0x005c
        L_0x0058:
            r1.getClass()
        L_0x005b:
            r1 = 0
        L_0x005c:
            if (r1 != 0) goto L_0x005f
            goto L_0x007c
        L_0x005f:
            boolean r1 = r6.mo28624h()
            boolean r3 = r7.mo28624h()
            if (r1 != 0) goto L_0x006b
            if (r3 == 0) goto L_0x007b
        L_0x006b:
            if (r1 == 0) goto L_0x007c
            if (r3 != 0) goto L_0x0070
            goto L_0x007c
        L_0x0070:
            com.tranzmate.moovit.protocol.common.MVLatLon r1 = r6.currentUserLocation
            com.tranzmate.moovit.protocol.common.MVLatLon r7 = r7.currentUserLocation
            boolean r7 = r1.mo26290a(r7)
            if (r7 != 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r0 = 1
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequest.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo28622f() {
        return this.actionId != null;
    }

    /* renamed from: g */
    public final boolean mo28623g() {
        return this.additionalInfo != null;
    }

    /* renamed from: h */
    public final boolean mo28624h() {
        return this.currentUserLocation != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28626i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final void mo28627j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityActionRequest(", "rideId:");
        C0016g.m42z(n, this.rideId, ", ", "actionId:");
        String str = this.actionId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo28623g()) {
            n.append(", ");
            n.append("additionalInfo:");
            MVMicroMobilityActionAdditionalInfo mVMicroMobilityActionAdditionalInfo = this.additionalInfo;
            if (mVMicroMobilityActionAdditionalInfo == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVMicroMobilityActionAdditionalInfo);
            }
        }
        if (mo28624h()) {
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
