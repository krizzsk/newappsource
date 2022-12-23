package com.tranzmate.moovit.protocol.serviceAlerts;

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

public class MVGetServiceAlertByIdResponse implements TBase<MVGetServiceAlertByIdResponse, _Fields>, Serializable, Cloneable, Comparable<MVGetServiceAlertByIdResponse> {

    /* renamed from: b */
    public static final C25113c f28238b = new C25113c("serviceAlert", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f28239c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28240d;
    public MVServiceAlertDetails serviceAlert;

    public enum _Fields implements C25085c {
        SERVICE_ALERT(1, "serviceAlert");
        
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
            return SERVICE_ALERT;
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

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVGetServiceAlertByIdResponse$a */
    public static class C10463a extends C25239c<MVGetServiceAlertByIdResponse> {
        public C10463a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetServiceAlertByIdResponse mVGetServiceAlertByIdResponse = (MVGetServiceAlertByIdResponse) tBase;
            MVServiceAlertDetails mVServiceAlertDetails = mVGetServiceAlertByIdResponse.serviceAlert;
            if (mVServiceAlertDetails != null) {
                mVServiceAlertDetails.mo31644w();
            }
            C25113c cVar = MVGetServiceAlertByIdResponse.f28238b;
            gVar.mo61687K();
            if (mVGetServiceAlertByIdResponse.serviceAlert != null) {
                gVar.mo61711x(MVGetServiceAlertByIdResponse.f28238b);
                mVGetServiceAlertByIdResponse.serviceAlert.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetServiceAlertByIdResponse mVGetServiceAlertByIdResponse = (MVGetServiceAlertByIdResponse) tBase;
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
                    MVServiceAlertDetails mVServiceAlertDetails = new MVServiceAlertDetails();
                    mVGetServiceAlertByIdResponse.serviceAlert = mVServiceAlertDetails;
                    mVServiceAlertDetails.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVServiceAlertDetails mVServiceAlertDetails2 = mVGetServiceAlertByIdResponse.serviceAlert;
            if (mVServiceAlertDetails2 != null) {
                mVServiceAlertDetails2.mo31644w();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVGetServiceAlertByIdResponse$b */
    public static class C10464b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10463a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVGetServiceAlertByIdResponse$c */
    public static class C10465c extends C25240d<MVGetServiceAlertByIdResponse> {
        public C10465c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetServiceAlertByIdResponse mVGetServiceAlertByIdResponse = (MVGetServiceAlertByIdResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetServiceAlertByIdResponse.mo31579f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVGetServiceAlertByIdResponse.mo31579f()) {
                mVGetServiceAlertByIdResponse.serviceAlert.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetServiceAlertByIdResponse mVGetServiceAlertByIdResponse = (MVGetServiceAlertByIdResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVServiceAlertDetails mVServiceAlertDetails = new MVServiceAlertDetails();
                mVGetServiceAlertByIdResponse.serviceAlert = mVServiceAlertDetails;
                mVServiceAlertDetails.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVGetServiceAlertByIdResponse$d */
    public static class C10466d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10465c(0);
        }
    }

    static {
        new C17394d0("MVGetServiceAlertByIdResponse");
        HashMap hashMap = new HashMap();
        f28239c = hashMap;
        hashMap.put(C25239c.class, new C10464b());
        hashMap.put(C25240d.class, new C10466d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SERVICE_ALERT, new FieldMetaData("serviceAlert", (byte) 3, new StructMetaData(MVServiceAlertDetails.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28240d = unmodifiableMap;
        FieldMetaData.m61947a(MVGetServiceAlertByIdResponse.class, unmodifiableMap);
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
        ((C25238b) f28239c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28239c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGetServiceAlertByIdResponse mVGetServiceAlertByIdResponse = (MVGetServiceAlertByIdResponse) obj;
        if (!getClass().equals(mVGetServiceAlertByIdResponse.getClass())) {
            return getClass().getName().compareTo(mVGetServiceAlertByIdResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31579f()).compareTo(Boolean.valueOf(mVGetServiceAlertByIdResponse.mo31579f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo31579f() || (compareTo = this.serviceAlert.compareTo(mVGetServiceAlertByIdResponse.serviceAlert)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetServiceAlertByIdResponse)) {
            return false;
        }
        MVGetServiceAlertByIdResponse mVGetServiceAlertByIdResponse = (MVGetServiceAlertByIdResponse) obj;
        boolean f = mo31579f();
        boolean f2 = mVGetServiceAlertByIdResponse.mo31579f();
        if ((f || f2) && (!f || !f2 || !this.serviceAlert.mo31623a(mVGetServiceAlertByIdResponse.serviceAlert))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31579f() {
        return this.serviceAlert != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetServiceAlertByIdResponse(", "serviceAlert:");
        MVServiceAlertDetails mVServiceAlertDetails = this.serviceAlert;
        if (mVServiceAlertDetails == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVServiceAlertDetails);
        }
        n.append(")");
        return n.toString();
    }
}
