package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
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

public class MVMicroMobilityRideStatusInfo implements TBase<MVMicroMobilityRideStatusInfo, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityRideStatusInfo> {

    /* renamed from: b */
    public static final C25113c f26752b = new C25113c("isCancelable", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f26753c = new C25113c(ServerParameters.STATUS, (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f26754d = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f26755e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f26756f;
    private byte __isset_bitfield = 0;
    public boolean isCancelable;
    private _Fields[] optionals = {_Fields.PRICE};
    public MVCurrencyAmount price;
    public MVMicroMobilityRideStatus status;

    public enum _Fields implements C25085c {
        IS_CANCELABLE(1, "isCancelable"),
        STATUS(2, ServerParameters.STATUS),
        PRICE(3, InAppPurchaseMetaData.KEY_PRICE);
        
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
                return IS_CANCELABLE;
            }
            if (i == 2) {
                return STATUS;
            }
            if (i != 3) {
                return null;
            }
            return PRICE;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatusInfo$a */
    public static class C9352a extends C25239c<MVMicroMobilityRideStatusInfo> {
        public C9352a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRideStatusInfo mVMicroMobilityRideStatusInfo = (MVMicroMobilityRideStatusInfo) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVMicroMobilityRideStatusInfo.price;
            C25113c cVar = MVMicroMobilityRideStatusInfo.f26752b;
            gVar.mo61687K();
            gVar.mo61711x(MVMicroMobilityRideStatusInfo.f26752b);
            gVar.mo61708u(mVMicroMobilityRideStatusInfo.isCancelable);
            gVar.mo61712y();
            if (mVMicroMobilityRideStatusInfo.status != null) {
                gVar.mo61711x(MVMicroMobilityRideStatusInfo.f26753c);
                gVar.mo61678B(mVMicroMobilityRideStatusInfo.status.getValue());
                gVar.mo61712y();
            }
            if (mVMicroMobilityRideStatusInfo.price != null && mVMicroMobilityRideStatusInfo.mo29020g()) {
                gVar.mo61711x(MVMicroMobilityRideStatusInfo.f26754d);
                mVMicroMobilityRideStatusInfo.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRideStatusInfo mVMicroMobilityRideStatusInfo = (MVMicroMobilityRideStatusInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVMicroMobilityRideStatusInfo.price;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVMicroMobilityRideStatusInfo.price = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVMicroMobilityRideStatusInfo.status = MVMicroMobilityRideStatus.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVMicroMobilityRideStatusInfo.isCancelable = gVar.mo61690c();
                    mVMicroMobilityRideStatusInfo.mo29023i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatusInfo$b */
    public static class C9353b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9352a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatusInfo$c */
    public static class C9354c extends C25240d<MVMicroMobilityRideStatusInfo> {
        public C9354c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRideStatusInfo mVMicroMobilityRideStatusInfo = (MVMicroMobilityRideStatusInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityRideStatusInfo.mo29019f()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityRideStatusInfo.mo29021h()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityRideStatusInfo.mo29020g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVMicroMobilityRideStatusInfo.mo29019f()) {
                jVar.mo61708u(mVMicroMobilityRideStatusInfo.isCancelable);
            }
            if (mVMicroMobilityRideStatusInfo.mo29021h()) {
                jVar.mo61678B(mVMicroMobilityRideStatusInfo.status.getValue());
            }
            if (mVMicroMobilityRideStatusInfo.mo29020g()) {
                mVMicroMobilityRideStatusInfo.price.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRideStatusInfo mVMicroMobilityRideStatusInfo = (MVMicroMobilityRideStatusInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVMicroMobilityRideStatusInfo.isCancelable = jVar.mo61690c();
                mVMicroMobilityRideStatusInfo.mo29023i();
            }
            if (T.get(1)) {
                mVMicroMobilityRideStatusInfo.status = MVMicroMobilityRideStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(2)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVMicroMobilityRideStatusInfo.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideStatusInfo$d */
    public static class C9355d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9354c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityRideStatusInfo");
        HashMap hashMap = new HashMap();
        f26755e = hashMap;
        hashMap.put(C25239c.class, new C9353b());
        hashMap.put(C25240d.class, new C9355d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IS_CANCELABLE, new FieldMetaData("isCancelable", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.STATUS, new FieldMetaData(ServerParameters.STATUS, (byte) 3, new EnumMetaData(MVMicroMobilityRideStatus.class)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26756f = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityRideStatusInfo.class, unmodifiableMap);
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
        ((C25238b) f26755e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26755e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29016a(MVMicroMobilityRideStatusInfo mVMicroMobilityRideStatusInfo) {
        if (mVMicroMobilityRideStatusInfo == null || this.isCancelable != mVMicroMobilityRideStatusInfo.isCancelable) {
            return false;
        }
        boolean h = mo29021h();
        boolean h2 = mVMicroMobilityRideStatusInfo.mo29021h();
        if ((h || h2) && (!h || !h2 || !this.status.equals(mVMicroMobilityRideStatusInfo.status))) {
            return false;
        }
        boolean g = mo29020g();
        boolean g2 = mVMicroMobilityRideStatusInfo.mo29020g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.price.mo26102a(mVMicroMobilityRideStatusInfo.price)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityRideStatusInfo mVMicroMobilityRideStatusInfo = (MVMicroMobilityRideStatusInfo) obj;
        if (!getClass().equals(mVMicroMobilityRideStatusInfo.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityRideStatusInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29019f()).compareTo(Boolean.valueOf(mVMicroMobilityRideStatusInfo.mo29019f()));
        if (compareTo2 != 0 || ((mo29019f() && (compareTo2 = C25082a.m62848l(this.isCancelable, mVMicroMobilityRideStatusInfo.isCancelable)) != 0) || (compareTo2 = Boolean.valueOf(mo29021h()).compareTo(Boolean.valueOf(mVMicroMobilityRideStatusInfo.mo29021h()))) != 0 || ((mo29021h() && (compareTo2 = this.status.compareTo(mVMicroMobilityRideStatusInfo.status)) != 0) || (compareTo2 = Boolean.valueOf(mo29020g()).compareTo(Boolean.valueOf(mVMicroMobilityRideStatusInfo.mo29020g()))) != 0))) {
            return compareTo2;
        }
        if (!mo29020g() || (compareTo = this.price.compareTo(mVMicroMobilityRideStatusInfo.price)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMicroMobilityRideStatusInfo)) {
            return mo29016a((MVMicroMobilityRideStatusInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29019f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo29020g() {
        return this.price != null;
    }

    /* renamed from: h */
    public final boolean mo29021h() {
        return this.status != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo29023i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityRideStatusInfo(", "isCancelable:");
        C13555b.m33977q(n, this.isCancelable, ", ", "status:");
        MVMicroMobilityRideStatus mVMicroMobilityRideStatus = this.status;
        if (mVMicroMobilityRideStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMicroMobilityRideStatus);
        }
        if (mo29020g()) {
            n.append(", ");
            n.append("price:");
            MVCurrencyAmount mVCurrencyAmount = this.price;
            if (mVCurrencyAmount == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount);
            }
        }
        n.append(")");
        return n.toString();
    }
}
