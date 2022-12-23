package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
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

public class MVTodChangeRideDestinationRequest implements TBase<MVTodChangeRideDestinationRequest, _Fields>, Serializable, Cloneable, Comparable<MVTodChangeRideDestinationRequest> {

    /* renamed from: b */
    public static final C25113c f29374b = new C25113c("rideId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29375c = new C25113c("newDestination", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f29376d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29377e;
    public MVLocationDescriptor newDestination;
    public String rideId;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        NEW_DESTINATION(2, "newDestination");
        
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
            if (i != 2) {
                return null;
            }
            return NEW_DESTINATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodChangeRideDestinationRequest$a */
    public static class C11205a extends C25239c<MVTodChangeRideDestinationRequest> {
        public C11205a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodChangeRideDestinationRequest mVTodChangeRideDestinationRequest = (MVTodChangeRideDestinationRequest) tBase;
            MVLocationDescriptor mVLocationDescriptor = mVTodChangeRideDestinationRequest.newDestination;
            if (mVLocationDescriptor != null) {
                mVLocationDescriptor.mo26333s();
            }
            C25113c cVar = MVTodChangeRideDestinationRequest.f29374b;
            gVar.mo61687K();
            if (mVTodChangeRideDestinationRequest.rideId != null) {
                gVar.mo61711x(MVTodChangeRideDestinationRequest.f29374b);
                gVar.mo61686J(mVTodChangeRideDestinationRequest.rideId);
                gVar.mo61712y();
            }
            if (mVTodChangeRideDestinationRequest.newDestination != null) {
                gVar.mo61711x(MVTodChangeRideDestinationRequest.f29375c);
                mVTodChangeRideDestinationRequest.newDestination.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodChangeRideDestinationRequest mVTodChangeRideDestinationRequest = (MVTodChangeRideDestinationRequest) tBase;
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
                        MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                        mVTodChangeRideDestinationRequest.newDestination = mVLocationDescriptor;
                        mVLocationDescriptor.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodChangeRideDestinationRequest.rideId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVLocationDescriptor mVLocationDescriptor2 = mVTodChangeRideDestinationRequest.newDestination;
            if (mVLocationDescriptor2 != null) {
                mVLocationDescriptor2.mo26333s();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodChangeRideDestinationRequest$b */
    public static class C11206b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11205a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodChangeRideDestinationRequest$c */
    public static class C11207c extends C25240d<MVTodChangeRideDestinationRequest> {
        public C11207c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodChangeRideDestinationRequest mVTodChangeRideDestinationRequest = (MVTodChangeRideDestinationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodChangeRideDestinationRequest.mo33389g()) {
                bitSet.set(0);
            }
            if (mVTodChangeRideDestinationRequest.mo33388f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTodChangeRideDestinationRequest.mo33389g()) {
                jVar.mo61686J(mVTodChangeRideDestinationRequest.rideId);
            }
            if (mVTodChangeRideDestinationRequest.mo33388f()) {
                mVTodChangeRideDestinationRequest.newDestination.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodChangeRideDestinationRequest mVTodChangeRideDestinationRequest = (MVTodChangeRideDestinationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTodChangeRideDestinationRequest.rideId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVTodChangeRideDestinationRequest.newDestination = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodChangeRideDestinationRequest$d */
    public static class C11208d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11207c(0);
        }
    }

    static {
        new C17394d0("MVTodChangeRideDestinationRequest");
        HashMap hashMap = new HashMap();
        f29376d = hashMap;
        hashMap.put(C25239c.class, new C11206b());
        hashMap.put(C25240d.class, new C11208d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NEW_DESTINATION, new FieldMetaData("newDestination", (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29377e = unmodifiableMap;
        FieldMetaData.m61947a(MVTodChangeRideDestinationRequest.class, unmodifiableMap);
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
        ((C25238b) f29376d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29376d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodChangeRideDestinationRequest mVTodChangeRideDestinationRequest = (MVTodChangeRideDestinationRequest) obj;
        if (!getClass().equals(mVTodChangeRideDestinationRequest.getClass())) {
            return getClass().getName().compareTo(mVTodChangeRideDestinationRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33389g()).compareTo(Boolean.valueOf(mVTodChangeRideDestinationRequest.mo33389g()));
        if (compareTo2 != 0 || ((mo33389g() && (compareTo2 = this.rideId.compareTo(mVTodChangeRideDestinationRequest.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo33388f()).compareTo(Boolean.valueOf(mVTodChangeRideDestinationRequest.mo33388f()))) != 0)) {
            return compareTo2;
        }
        if (!mo33388f() || (compareTo = this.newDestination.compareTo(mVTodChangeRideDestinationRequest.newDestination)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodChangeRideDestinationRequest)) {
            return false;
        }
        MVTodChangeRideDestinationRequest mVTodChangeRideDestinationRequest = (MVTodChangeRideDestinationRequest) obj;
        boolean g = mo33389g();
        boolean g2 = mVTodChangeRideDestinationRequest.mo33389g();
        if ((g || g2) && (!g || !g2 || !this.rideId.equals(mVTodChangeRideDestinationRequest.rideId))) {
            return false;
        }
        boolean f = mo33388f();
        boolean f2 = mVTodChangeRideDestinationRequest.mo33388f();
        if ((f || f2) && (!f || !f2 || !this.newDestination.mo26317a(mVTodChangeRideDestinationRequest.newDestination))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33388f() {
        return this.newDestination != null;
    }

    /* renamed from: g */
    public final boolean mo33389g() {
        return this.rideId != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodChangeRideDestinationRequest(", "rideId:");
        String str = this.rideId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("newDestination:");
        MVLocationDescriptor mVLocationDescriptor = this.newDestination;
        if (mVLocationDescriptor == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor);
        }
        n.append(")");
        return n.toString();
    }
}
