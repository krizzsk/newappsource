package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
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
import p001a0.C0017h;
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

public class MVDriverConfirmationSettings implements TBase<MVDriverConfirmationSettings, _Fields>, Serializable, Cloneable, Comparable<MVDriverConfirmationSettings> {

    /* renamed from: b */
    public static final C25113c f24703b = new C25113c(ServerParameters.STATUS, (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24704c = new C25113c("rate", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24705d = new C25113c("canSetAutoConfirm", (byte) 2, 3);

    /* renamed from: e */
    public static final HashMap f24706e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f24707f;
    private byte __isset_bitfield = 0;
    public boolean canSetAutoConfirm;
    private _Fields[] optionals = {_Fields.RATE};
    public MVConfirmationRate rate;
    public MVRideConfirmationStatus status;

    public enum _Fields implements C25085c {
        STATUS(1, ServerParameters.STATUS),
        RATE(2, "rate"),
        CAN_SET_AUTO_CONFIRM(3, "canSetAutoConfirm");
        
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
                return STATUS;
            }
            if (i == 2) {
                return RATE;
            }
            if (i != 3) {
                return null;
            }
            return CAN_SET_AUTO_CONFIRM;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVDriverConfirmationSettings$a */
    public static class C8202a extends C25239c<MVDriverConfirmationSettings> {
        public C8202a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDriverConfirmationSettings mVDriverConfirmationSettings = (MVDriverConfirmationSettings) tBase;
            MVConfirmationRate mVConfirmationRate = mVDriverConfirmationSettings.rate;
            C25113c cVar = MVDriverConfirmationSettings.f24703b;
            gVar.mo61687K();
            if (mVDriverConfirmationSettings.status != null) {
                gVar.mo61711x(MVDriverConfirmationSettings.f24703b);
                gVar.mo61678B(mVDriverConfirmationSettings.status.getValue());
                gVar.mo61712y();
            }
            if (mVDriverConfirmationSettings.rate != null && mVDriverConfirmationSettings.mo25597g()) {
                gVar.mo61711x(MVDriverConfirmationSettings.f24704c);
                mVDriverConfirmationSettings.rate.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDriverConfirmationSettings.f24705d);
            C0017h.m62S(gVar, mVDriverConfirmationSettings.canSetAutoConfirm);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDriverConfirmationSettings mVDriverConfirmationSettings = (MVDriverConfirmationSettings) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVConfirmationRate mVConfirmationRate = mVDriverConfirmationSettings.rate;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 2) {
                            mVDriverConfirmationSettings.canSetAutoConfirm = gVar.mo61690c();
                            mVDriverConfirmationSettings.mo25600i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVConfirmationRate mVConfirmationRate2 = new MVConfirmationRate();
                        mVDriverConfirmationSettings.rate = mVConfirmationRate2;
                        mVConfirmationRate2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVDriverConfirmationSettings.status = MVRideConfirmationStatus.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVDriverConfirmationSettings$b */
    public static class C8203b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8202a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVDriverConfirmationSettings$c */
    public static class C8204c extends C25240d<MVDriverConfirmationSettings> {
        public C8204c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDriverConfirmationSettings mVDriverConfirmationSettings = (MVDriverConfirmationSettings) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDriverConfirmationSettings.mo25598h()) {
                bitSet.set(0);
            }
            if (mVDriverConfirmationSettings.mo25597g()) {
                bitSet.set(1);
            }
            if (mVDriverConfirmationSettings.mo25596f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVDriverConfirmationSettings.mo25598h()) {
                jVar.mo61678B(mVDriverConfirmationSettings.status.getValue());
            }
            if (mVDriverConfirmationSettings.mo25597g()) {
                mVDriverConfirmationSettings.rate.mo25202X0(jVar);
            }
            if (mVDriverConfirmationSettings.mo25596f()) {
                jVar.mo61708u(mVDriverConfirmationSettings.canSetAutoConfirm);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDriverConfirmationSettings mVDriverConfirmationSettings = (MVDriverConfirmationSettings) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVDriverConfirmationSettings.status = MVRideConfirmationStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                MVConfirmationRate mVConfirmationRate = new MVConfirmationRate();
                mVDriverConfirmationSettings.rate = mVConfirmationRate;
                mVConfirmationRate.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVDriverConfirmationSettings.canSetAutoConfirm = jVar.mo61690c();
                mVDriverConfirmationSettings.mo25600i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVDriverConfirmationSettings$d */
    public static class C8205d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8204c(0);
        }
    }

    static {
        new C17394d0("MVDriverConfirmationSettings");
        HashMap hashMap = new HashMap();
        f24706e = hashMap;
        hashMap.put(C25239c.class, new C8203b());
        hashMap.put(C25240d.class, new C8205d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STATUS, new FieldMetaData(ServerParameters.STATUS, (byte) 3, new EnumMetaData(MVRideConfirmationStatus.class)));
        enumMap.put(_Fields.RATE, new FieldMetaData("rate", (byte) 2, new StructMetaData(MVConfirmationRate.class)));
        enumMap.put(_Fields.CAN_SET_AUTO_CONFIRM, new FieldMetaData("canSetAutoConfirm", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24707f = unmodifiableMap;
        FieldMetaData.m61947a(MVDriverConfirmationSettings.class, unmodifiableMap);
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
        ((C25238b) f24706e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24706e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0055 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25593a(com.tranzmate.moovit.protocol.carpool.MVDriverConfirmationSettings r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6.mo25598h()
            boolean r2 = r7.mo25598h()
            if (r1 != 0) goto L_0x0010
            if (r2 == 0) goto L_0x0020
        L_0x0010:
            if (r1 == 0) goto L_0x005e
            if (r2 != 0) goto L_0x0015
            goto L_0x005e
        L_0x0015:
            com.tranzmate.moovit.protocol.carpool.MVRideConfirmationStatus r1 = r6.status
            com.tranzmate.moovit.protocol.carpool.MVRideConfirmationStatus r2 = r7.status
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0020
            return r0
        L_0x0020:
            boolean r1 = r6.mo25597g()
            boolean r2 = r7.mo25597g()
            r3 = 1
            if (r1 != 0) goto L_0x002d
            if (r2 == 0) goto L_0x0056
        L_0x002d:
            if (r1 == 0) goto L_0x005e
            if (r2 != 0) goto L_0x0032
            goto L_0x005e
        L_0x0032:
            com.tranzmate.moovit.protocol.carpool.MVConfirmationRate r1 = r6.rate
            com.tranzmate.moovit.protocol.carpool.MVConfirmationRate r2 = r7.rate
            if (r2 != 0) goto L_0x003d
            r1.getClass()
        L_0x003b:
            r1 = 0
            goto L_0x0053
        L_0x003d:
            int r4 = r1.responseRate
            int r5 = r2.responseRate
            if (r4 == r5) goto L_0x0044
            goto L_0x003b
        L_0x0044:
            int r4 = r1.approvalRate
            int r5 = r2.approvalRate
            if (r4 == r5) goto L_0x004b
            goto L_0x003b
        L_0x004b:
            int r1 = r1.responseTime
            int r2 = r2.responseTime
            if (r1 == r2) goto L_0x0052
            goto L_0x003b
        L_0x0052:
            r1 = 1
        L_0x0053:
            if (r1 != 0) goto L_0x0056
            return r0
        L_0x0056:
            boolean r1 = r6.canSetAutoConfirm
            boolean r7 = r7.canSetAutoConfirm
            if (r1 == r7) goto L_0x005d
            return r0
        L_0x005d:
            return r3
        L_0x005e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.carpool.MVDriverConfirmationSettings.mo25593a(com.tranzmate.moovit.protocol.carpool.MVDriverConfirmationSettings):boolean");
    }

    public final int compareTo(Object obj) {
        int l;
        MVDriverConfirmationSettings mVDriverConfirmationSettings = (MVDriverConfirmationSettings) obj;
        if (!getClass().equals(mVDriverConfirmationSettings.getClass())) {
            return getClass().getName().compareTo(mVDriverConfirmationSettings.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25598h()).compareTo(Boolean.valueOf(mVDriverConfirmationSettings.mo25598h()));
        if (compareTo != 0 || ((mo25598h() && (compareTo = this.status.compareTo(mVDriverConfirmationSettings.status)) != 0) || (compareTo = Boolean.valueOf(mo25597g()).compareTo(Boolean.valueOf(mVDriverConfirmationSettings.mo25597g()))) != 0 || ((mo25597g() && (compareTo = this.rate.compareTo(mVDriverConfirmationSettings.rate)) != 0) || (compareTo = Boolean.valueOf(mo25596f()).compareTo(Boolean.valueOf(mVDriverConfirmationSettings.mo25596f()))) != 0))) {
            return compareTo;
        }
        if (!mo25596f() || (l = C25082a.m62848l(this.canSetAutoConfirm, mVDriverConfirmationSettings.canSetAutoConfirm)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVDriverConfirmationSettings)) {
            return mo25593a((MVDriverConfirmationSettings) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25596f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo25597g() {
        return this.rate != null;
    }

    /* renamed from: h */
    public final boolean mo25598h() {
        return this.status != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo25600i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDriverConfirmationSettings(", "status:");
        MVRideConfirmationStatus mVRideConfirmationStatus = this.status;
        if (mVRideConfirmationStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRideConfirmationStatus);
        }
        if (mo25597g()) {
            n.append(", ");
            n.append("rate:");
            MVConfirmationRate mVConfirmationRate = this.rate;
            if (mVConfirmationRate == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVConfirmationRate);
            }
        }
        n.append(", ");
        n.append("canSetAutoConfirm:");
        return C25541a.m63885p(n, this.canSetAutoConfirm, ")");
    }
}
