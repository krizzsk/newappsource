package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
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

public class MVSetRideRequest implements TBase<MVSetRideRequest, _Fields>, Serializable, Cloneable, Comparable<MVSetRideRequest> {

    /* renamed from: b */
    public static final C25113c f24884b = new C25113c("data", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24885c = new C25113c("validateNextRideCredit", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f24886d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f24887e;
    public MVRideRequestMetaData data;
    public MVCarPoolPrice validateNextRideCredit;

    public enum _Fields implements C25085c {
        DATA(1, "data"),
        VALIDATE_NEXT_RIDE_CREDIT(2, "validateNextRideCredit");
        
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
                return DATA;
            }
            if (i != 2) {
                return null;
            }
            return VALIDATE_NEXT_RIDE_CREDIT;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVSetRideRequest$a */
    public static class C8319a extends C25239c<MVSetRideRequest> {
        public C8319a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetRideRequest mVSetRideRequest = (MVSetRideRequest) tBase;
            MVRideRequestMetaData mVRideRequestMetaData = mVSetRideRequest.data;
            if (mVRideRequestMetaData != null) {
                mVRideRequestMetaData.mo25913t();
            }
            C25113c cVar = MVSetRideRequest.f24884b;
            gVar.mo61687K();
            if (mVSetRideRequest.data != null) {
                gVar.mo61711x(MVSetRideRequest.f24884b);
                mVSetRideRequest.data.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSetRideRequest.validateNextRideCredit != null) {
                gVar.mo61711x(MVSetRideRequest.f24885c);
                mVSetRideRequest.validateNextRideCredit.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetRideRequest mVSetRideRequest = (MVSetRideRequest) tBase;
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
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVCarPoolPrice mVCarPoolPrice = new MVCarPoolPrice();
                        mVSetRideRequest.validateNextRideCredit = mVCarPoolPrice;
                        mVCarPoolPrice.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVRideRequestMetaData mVRideRequestMetaData = new MVRideRequestMetaData();
                    mVSetRideRequest.data = mVRideRequestMetaData;
                    mVRideRequestMetaData.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVRideRequestMetaData mVRideRequestMetaData2 = mVSetRideRequest.data;
            if (mVRideRequestMetaData2 != null) {
                mVRideRequestMetaData2.mo25913t();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVSetRideRequest$b */
    public static class C8320b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8319a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVSetRideRequest$c */
    public static class C8321c extends C25240d<MVSetRideRequest> {
        public C8321c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetRideRequest mVSetRideRequest = (MVSetRideRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSetRideRequest.mo25920f()) {
                bitSet.set(0);
            }
            if (mVSetRideRequest.mo25921g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVSetRideRequest.mo25920f()) {
                mVSetRideRequest.data.mo25202X0(jVar);
            }
            if (mVSetRideRequest.mo25921g()) {
                mVSetRideRequest.validateNextRideCredit.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetRideRequest mVSetRideRequest = (MVSetRideRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVRideRequestMetaData mVRideRequestMetaData = new MVRideRequestMetaData();
                mVSetRideRequest.data = mVRideRequestMetaData;
                mVRideRequestMetaData.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVCarPoolPrice mVCarPoolPrice = new MVCarPoolPrice();
                mVSetRideRequest.validateNextRideCredit = mVCarPoolPrice;
                mVCarPoolPrice.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVSetRideRequest$d */
    public static class C8322d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8321c(0);
        }
    }

    static {
        new C17394d0("MVSetRideRequest");
        HashMap hashMap = new HashMap();
        f24886d = hashMap;
        hashMap.put(C25239c.class, new C8320b());
        hashMap.put(C25240d.class, new C8322d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DATA, new FieldMetaData("data", (byte) 3, new StructMetaData(MVRideRequestMetaData.class)));
        enumMap.put(_Fields.VALIDATE_NEXT_RIDE_CREDIT, new FieldMetaData("validateNextRideCredit", (byte) 3, new StructMetaData(MVCarPoolPrice.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24887e = unmodifiableMap;
        FieldMetaData.m61947a(MVSetRideRequest.class, unmodifiableMap);
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
        ((C25238b) f24886d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24886d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSetRideRequest mVSetRideRequest = (MVSetRideRequest) obj;
        if (!getClass().equals(mVSetRideRequest.getClass())) {
            return getClass().getName().compareTo(mVSetRideRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25920f()).compareTo(Boolean.valueOf(mVSetRideRequest.mo25920f()));
        if (compareTo2 != 0 || ((mo25920f() && (compareTo2 = this.data.compareTo(mVSetRideRequest.data)) != 0) || (compareTo2 = Boolean.valueOf(mo25921g()).compareTo(Boolean.valueOf(mVSetRideRequest.mo25921g()))) != 0)) {
            return compareTo2;
        }
        if (!mo25921g() || (compareTo = this.validateNextRideCredit.compareTo(mVSetRideRequest.validateNextRideCredit)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSetRideRequest)) {
            return false;
        }
        MVSetRideRequest mVSetRideRequest = (MVSetRideRequest) obj;
        boolean f = mo25920f();
        boolean f2 = mVSetRideRequest.mo25920f();
        if ((f || f2) && (!f || !f2 || !this.data.mo25896a(mVSetRideRequest.data))) {
            return false;
        }
        boolean g = mo25921g();
        boolean g2 = mVSetRideRequest.mo25921g();
        if ((g || g2) && (!g || !g2 || !this.validateNextRideCredit.mo25461a(mVSetRideRequest.validateNextRideCredit))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25920f() {
        return this.data != null;
    }

    /* renamed from: g */
    public final boolean mo25921g() {
        return this.validateNextRideCredit != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSetRideRequest(", "data:");
        MVRideRequestMetaData mVRideRequestMetaData = this.data;
        if (mVRideRequestMetaData == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRideRequestMetaData);
        }
        n.append(", ");
        n.append("validateNextRideCredit:");
        MVCarPoolPrice mVCarPoolPrice = this.validateNextRideCredit;
        if (mVCarPoolPrice == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarPoolPrice);
        }
        n.append(")");
        return n.toString();
    }
}
