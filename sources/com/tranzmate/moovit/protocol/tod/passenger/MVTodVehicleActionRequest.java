package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
import com.usebutton.sdk.internal.events.Events;
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

public class MVTodVehicleActionRequest implements TBase<MVTodVehicleActionRequest, _Fields>, Serializable, Cloneable, Comparable<MVTodVehicleActionRequest> {

    /* renamed from: b */
    public static final C25113c f29666b = new C25113c("rideId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29667c = new C25113c(Events.PROPERTY_ACTION, (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29668d = new C25113c("actionInfo", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f29669e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29670f;
    public String action;
    public MVTodVehicleActionInfo actionInfo;
    private _Fields[] optionals = {_Fields.ACTION_INFO};
    public String rideId;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        ACTION(2, Events.PROPERTY_ACTION),
        ACTION_INFO(3, "actionInfo");
        
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
                return ACTION;
            }
            if (i != 3) {
                return null;
            }
            return ACTION_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionRequest$a */
    public static class C11370a extends C25239c<MVTodVehicleActionRequest> {
        public C11370a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleActionRequest mVTodVehicleActionRequest = (MVTodVehicleActionRequest) tBase;
            mVTodVehicleActionRequest.getClass();
            C25113c cVar = MVTodVehicleActionRequest.f29666b;
            gVar.mo61687K();
            if (mVTodVehicleActionRequest.rideId != null) {
                gVar.mo61711x(MVTodVehicleActionRequest.f29666b);
                gVar.mo61686J(mVTodVehicleActionRequest.rideId);
                gVar.mo61712y();
            }
            if (mVTodVehicleActionRequest.action != null) {
                gVar.mo61711x(MVTodVehicleActionRequest.f29667c);
                gVar.mo61686J(mVTodVehicleActionRequest.action);
                gVar.mo61712y();
            }
            if (mVTodVehicleActionRequest.actionInfo != null && mVTodVehicleActionRequest.mo33880g()) {
                gVar.mo61711x(MVTodVehicleActionRequest.f29668d);
                mVTodVehicleActionRequest.actionInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleActionRequest mVTodVehicleActionRequest = (MVTodVehicleActionRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodVehicleActionRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVTodVehicleActionInfo mVTodVehicleActionInfo = new MVTodVehicleActionInfo();
                            mVTodVehicleActionRequest.actionInfo = mVTodVehicleActionInfo;
                            mVTodVehicleActionInfo.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTodVehicleActionRequest.action = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodVehicleActionRequest.rideId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionRequest$b */
    public static class C11371b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11370a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionRequest$c */
    public static class C11372c extends C25240d<MVTodVehicleActionRequest> {
        public C11372c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleActionRequest mVTodVehicleActionRequest = (MVTodVehicleActionRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodVehicleActionRequest.mo33881h()) {
                bitSet.set(0);
            }
            if (mVTodVehicleActionRequest.mo33879f()) {
                bitSet.set(1);
            }
            if (mVTodVehicleActionRequest.mo33880g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTodVehicleActionRequest.mo33881h()) {
                jVar.mo61686J(mVTodVehicleActionRequest.rideId);
            }
            if (mVTodVehicleActionRequest.mo33879f()) {
                jVar.mo61686J(mVTodVehicleActionRequest.action);
            }
            if (mVTodVehicleActionRequest.mo33880g()) {
                mVTodVehicleActionRequest.actionInfo.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleActionRequest mVTodVehicleActionRequest = (MVTodVehicleActionRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTodVehicleActionRequest.rideId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTodVehicleActionRequest.action = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVTodVehicleActionInfo mVTodVehicleActionInfo = new MVTodVehicleActionInfo();
                mVTodVehicleActionRequest.actionInfo = mVTodVehicleActionInfo;
                mVTodVehicleActionInfo.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionRequest$d */
    public static class C11373d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11372c(0);
        }
    }

    static {
        new C17394d0("MVTodVehicleActionRequest");
        HashMap hashMap = new HashMap();
        f29669e = hashMap;
        hashMap.put(C25239c.class, new C11371b());
        hashMap.put(C25240d.class, new C11373d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACTION, new FieldMetaData(Events.PROPERTY_ACTION, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACTION_INFO, new FieldMetaData("actionInfo", (byte) 2, new StructMetaData(MVTodVehicleActionInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29670f = unmodifiableMap;
        FieldMetaData.m61947a(MVTodVehicleActionRequest.class, unmodifiableMap);
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
        ((C25238b) f29669e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29669e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodVehicleActionRequest mVTodVehicleActionRequest = (MVTodVehicleActionRequest) obj;
        if (!getClass().equals(mVTodVehicleActionRequest.getClass())) {
            return getClass().getName().compareTo(mVTodVehicleActionRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33881h()).compareTo(Boolean.valueOf(mVTodVehicleActionRequest.mo33881h()));
        if (compareTo2 != 0 || ((mo33881h() && (compareTo2 = this.rideId.compareTo(mVTodVehicleActionRequest.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo33879f()).compareTo(Boolean.valueOf(mVTodVehicleActionRequest.mo33879f()))) != 0 || ((mo33879f() && (compareTo2 = this.action.compareTo(mVTodVehicleActionRequest.action)) != 0) || (compareTo2 = Boolean.valueOf(mo33880g()).compareTo(Boolean.valueOf(mVTodVehicleActionRequest.mo33880g()))) != 0))) {
            return compareTo2;
        }
        if (!mo33880g() || (compareTo = this.actionInfo.compareTo(mVTodVehicleActionRequest.actionInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionRequest
            r2 = 1
            if (r1 == 0) goto L_0x0074
            com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionRequest r6 = (com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionRequest) r6
            boolean r1 = r5.mo33881h()
            boolean r3 = r6.mo33881h()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x0027
        L_0x0017:
            if (r1 == 0) goto L_0x0074
            if (r3 != 0) goto L_0x001c
            goto L_0x0074
        L_0x001c:
            java.lang.String r1 = r5.rideId
            java.lang.String r3 = r6.rideId
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0027
            goto L_0x0074
        L_0x0027:
            boolean r1 = r5.mo33879f()
            boolean r3 = r6.mo33879f()
            if (r1 != 0) goto L_0x0033
            if (r3 == 0) goto L_0x0043
        L_0x0033:
            if (r1 == 0) goto L_0x0074
            if (r3 != 0) goto L_0x0038
            goto L_0x0074
        L_0x0038:
            java.lang.String r1 = r5.action
            java.lang.String r3 = r6.action
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0043
            goto L_0x0074
        L_0x0043:
            boolean r1 = r5.mo33880g()
            boolean r3 = r6.mo33880g()
            if (r1 != 0) goto L_0x004f
            if (r3 == 0) goto L_0x0073
        L_0x004f:
            if (r1 == 0) goto L_0x0074
            if (r3 != 0) goto L_0x0054
            goto L_0x0074
        L_0x0054:
            com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionInfo r1 = r5.actionInfo
            com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionInfo r6 = r6.actionInfo
            if (r6 == 0) goto L_0x006c
            F r3 = r1.setField_
            F r4 = r6.setField_
            if (r3 != r4) goto L_0x006f
            java.lang.Object r1 = r1.value_
            java.lang.Object r6 = r6.value_
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x006f
            r6 = 1
            goto L_0x0070
        L_0x006c:
            r1.getClass()
        L_0x006f:
            r6 = 0
        L_0x0070:
            if (r6 != 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r0 = 1
        L_0x0074:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionRequest.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo33879f() {
        return this.action != null;
    }

    /* renamed from: g */
    public final boolean mo33880g() {
        return this.actionInfo != null;
    }

    /* renamed from: h */
    public final boolean mo33881h() {
        return this.rideId != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodVehicleActionRequest(", "rideId:");
        String str = this.rideId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("action:");
        String str2 = this.action;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo33880g()) {
            n.append(", ");
            n.append("actionInfo:");
            MVTodVehicleActionInfo mVTodVehicleActionInfo = this.actionInfo;
            if (mVTodVehicleActionInfo == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTodVehicleActionInfo);
            }
        }
        n.append(")");
        return n.toString();
    }
}
