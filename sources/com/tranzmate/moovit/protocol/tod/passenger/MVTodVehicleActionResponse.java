package com.tranzmate.moovit.protocol.tod.passenger;

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

public class MVTodVehicleActionResponse implements TBase<MVTodVehicleActionResponse, _Fields>, Serializable, Cloneable, Comparable<MVTodVehicleActionResponse> {

    /* renamed from: b */
    public static final C25113c f29671b = new C25113c("info", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f29672c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f29673d;
    public MVTodRideRealTimeInfo info;

    public enum _Fields implements C25085c {
        INFO(1, "info");
        
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
            return INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionResponse$a */
    public static class C11374a extends C25239c<MVTodVehicleActionResponse> {
        public C11374a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleActionResponse mVTodVehicleActionResponse = (MVTodVehicleActionResponse) tBase;
            MVTodRideRealTimeInfo mVTodRideRealTimeInfo = mVTodVehicleActionResponse.info;
            if (mVTodRideRealTimeInfo != null) {
                mVTodRideRealTimeInfo.mo33725y();
            }
            C25113c cVar = MVTodVehicleActionResponse.f29671b;
            gVar.mo61687K();
            if (mVTodVehicleActionResponse.info != null) {
                gVar.mo61711x(MVTodVehicleActionResponse.f29671b);
                mVTodVehicleActionResponse.info.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleActionResponse mVTodVehicleActionResponse = (MVTodVehicleActionResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVTodRideRealTimeInfo mVTodRideRealTimeInfo = new MVTodRideRealTimeInfo();
                    mVTodVehicleActionResponse.info = mVTodRideRealTimeInfo;
                    mVTodRideRealTimeInfo.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVTodRideRealTimeInfo mVTodRideRealTimeInfo2 = mVTodVehicleActionResponse.info;
            if (mVTodRideRealTimeInfo2 != null) {
                mVTodRideRealTimeInfo2.mo33725y();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionResponse$b */
    public static class C11375b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11374a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionResponse$c */
    public static class C11376c extends C25240d<MVTodVehicleActionResponse> {
        public C11376c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleActionResponse mVTodVehicleActionResponse = (MVTodVehicleActionResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodVehicleActionResponse.mo33887f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVTodVehicleActionResponse.mo33887f()) {
                mVTodVehicleActionResponse.info.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleActionResponse mVTodVehicleActionResponse = (MVTodVehicleActionResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVTodRideRealTimeInfo mVTodRideRealTimeInfo = new MVTodRideRealTimeInfo();
                mVTodVehicleActionResponse.info = mVTodRideRealTimeInfo;
                mVTodRideRealTimeInfo.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionResponse$d */
    public static class C11377d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11376c(0);
        }
    }

    static {
        new C17394d0("MVTodVehicleActionResponse");
        HashMap hashMap = new HashMap();
        f29672c = hashMap;
        hashMap.put(C25239c.class, new C11375b());
        hashMap.put(C25240d.class, new C11377d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.INFO, new FieldMetaData("info", (byte) 3, new StructMetaData(MVTodRideRealTimeInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29673d = unmodifiableMap;
        FieldMetaData.m61947a(MVTodVehicleActionResponse.class, unmodifiableMap);
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
        ((C25238b) f29672c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29672c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodVehicleActionResponse mVTodVehicleActionResponse = (MVTodVehicleActionResponse) obj;
        if (!getClass().equals(mVTodVehicleActionResponse.getClass())) {
            return getClass().getName().compareTo(mVTodVehicleActionResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33887f()).compareTo(Boolean.valueOf(mVTodVehicleActionResponse.mo33887f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo33887f() || (compareTo = this.info.compareTo(mVTodVehicleActionResponse.info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodVehicleActionResponse)) {
            return false;
        }
        MVTodVehicleActionResponse mVTodVehicleActionResponse = (MVTodVehicleActionResponse) obj;
        boolean f = mo33887f();
        boolean f2 = mVTodVehicleActionResponse.mo33887f();
        if ((f || f2) && (!f || !f2 || !this.info.mo33703a(mVTodVehicleActionResponse.info))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33887f() {
        return this.info != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodVehicleActionResponse(", "info:");
        MVTodRideRealTimeInfo mVTodRideRealTimeInfo = this.info;
        if (mVTodRideRealTimeInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodRideRealTimeInfo);
        }
        n.append(")");
        return n.toString();
    }
}
