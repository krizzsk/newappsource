package com.tranzmate.moovit.protocol.micromobility;

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

public class MVMicroMobilityRealTimeInfoResponse implements TBase<MVMicroMobilityRealTimeInfoResponse, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityRealTimeInfoResponse> {

    /* renamed from: b */
    public static final C25113c f26710b = new C25113c("rideStatusInfo", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f26711c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f26712d;
    public MVMicroMobilityRideStatusInfo rideStatusInfo;

    public enum _Fields implements C25085c {
        RIDE_STATUS_INFO(1, "rideStatusInfo");
        
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
            if (i != 1) {
                return null;
            }
            return RIDE_STATUS_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRealTimeInfoResponse$a */
    public static class C9332a extends C25239c<MVMicroMobilityRealTimeInfoResponse> {
        public C9332a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRealTimeInfoResponse mVMicroMobilityRealTimeInfoResponse = (MVMicroMobilityRealTimeInfoResponse) tBase;
            mVMicroMobilityRealTimeInfoResponse.getClass();
            C25113c cVar = MVMicroMobilityRealTimeInfoResponse.f26710b;
            gVar.mo61687K();
            if (mVMicroMobilityRealTimeInfoResponse.rideStatusInfo != null) {
                gVar.mo61711x(MVMicroMobilityRealTimeInfoResponse.f26710b);
                mVMicroMobilityRealTimeInfoResponse.rideStatusInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRealTimeInfoResponse mVMicroMobilityRealTimeInfoResponse = (MVMicroMobilityRealTimeInfoResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityRealTimeInfoResponse.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVMicroMobilityRideStatusInfo mVMicroMobilityRideStatusInfo = new MVMicroMobilityRideStatusInfo();
                    mVMicroMobilityRealTimeInfoResponse.rideStatusInfo = mVMicroMobilityRideStatusInfo;
                    mVMicroMobilityRideStatusInfo.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRealTimeInfoResponse$b */
    public static class C9333b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9332a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRealTimeInfoResponse$c */
    public static class C9334c extends C25240d<MVMicroMobilityRealTimeInfoResponse> {
        public C9334c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRealTimeInfoResponse mVMicroMobilityRealTimeInfoResponse = (MVMicroMobilityRealTimeInfoResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityRealTimeInfoResponse.mo28950f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVMicroMobilityRealTimeInfoResponse.mo28950f()) {
                mVMicroMobilityRealTimeInfoResponse.rideStatusInfo.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRealTimeInfoResponse mVMicroMobilityRealTimeInfoResponse = (MVMicroMobilityRealTimeInfoResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVMicroMobilityRideStatusInfo mVMicroMobilityRideStatusInfo = new MVMicroMobilityRideStatusInfo();
                mVMicroMobilityRealTimeInfoResponse.rideStatusInfo = mVMicroMobilityRideStatusInfo;
                mVMicroMobilityRideStatusInfo.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRealTimeInfoResponse$d */
    public static class C9335d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9334c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityRealTimeInfoResponse");
        HashMap hashMap = new HashMap();
        f26711c = hashMap;
        hashMap.put(C25239c.class, new C9333b());
        hashMap.put(C25240d.class, new C9335d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_STATUS_INFO, new FieldMetaData("rideStatusInfo", (byte) 3, new StructMetaData(MVMicroMobilityRideStatusInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26712d = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityRealTimeInfoResponse.class, unmodifiableMap);
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
        ((C25238b) f26711c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26711c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityRealTimeInfoResponse mVMicroMobilityRealTimeInfoResponse = (MVMicroMobilityRealTimeInfoResponse) obj;
        if (!getClass().equals(mVMicroMobilityRealTimeInfoResponse.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityRealTimeInfoResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28950f()).compareTo(Boolean.valueOf(mVMicroMobilityRealTimeInfoResponse.mo28950f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo28950f() || (compareTo = this.rideStatusInfo.compareTo(mVMicroMobilityRealTimeInfoResponse.rideStatusInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityRealTimeInfoResponse)) {
            return false;
        }
        MVMicroMobilityRealTimeInfoResponse mVMicroMobilityRealTimeInfoResponse = (MVMicroMobilityRealTimeInfoResponse) obj;
        boolean f = mo28950f();
        boolean f2 = mVMicroMobilityRealTimeInfoResponse.mo28950f();
        if ((f || f2) && (!f || !f2 || !this.rideStatusInfo.mo29016a(mVMicroMobilityRealTimeInfoResponse.rideStatusInfo))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28950f() {
        return this.rideStatusInfo != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityRealTimeInfoResponse(", "rideStatusInfo:");
        MVMicroMobilityRideStatusInfo mVMicroMobilityRideStatusInfo = this.rideStatusInfo;
        if (mVMicroMobilityRideStatusInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMicroMobilityRideStatusInfo);
        }
        n.append(")");
        return n.toString();
    }
}
