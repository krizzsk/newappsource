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
import org.apache.thrift.meta_data.FieldValueMetaData;
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

public class MVMicroMobilityItemInfoRequest implements TBase<MVMicroMobilityItemInfoRequest, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityItemInfoRequest> {

    /* renamed from: b */
    public static final C25113c f26556b = new C25113c("serviceId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26557c = new C25113c("itemId", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f26558d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26559e;
    public String itemId;
    public String serviceId;

    public enum _Fields implements C25085c {
        SERVICE_ID(1, "serviceId"),
        ITEM_ID(2, "itemId");
        
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
                return SERVICE_ID;
            }
            if (i != 2) {
                return null;
            }
            return ITEM_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityItemInfoRequest$a */
    public static class C9231a extends C25239c<MVMicroMobilityItemInfoRequest> {
        public C9231a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityItemInfoRequest mVMicroMobilityItemInfoRequest = (MVMicroMobilityItemInfoRequest) tBase;
            mVMicroMobilityItemInfoRequest.getClass();
            C25113c cVar = MVMicroMobilityItemInfoRequest.f26556b;
            gVar.mo61687K();
            if (mVMicroMobilityItemInfoRequest.serviceId != null) {
                gVar.mo61711x(MVMicroMobilityItemInfoRequest.f26556b);
                gVar.mo61686J(mVMicroMobilityItemInfoRequest.serviceId);
                gVar.mo61712y();
            }
            if (mVMicroMobilityItemInfoRequest.itemId != null) {
                gVar.mo61711x(MVMicroMobilityItemInfoRequest.f26557c);
                gVar.mo61686J(mVMicroMobilityItemInfoRequest.itemId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityItemInfoRequest mVMicroMobilityItemInfoRequest = (MVMicroMobilityItemInfoRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityItemInfoRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVMicroMobilityItemInfoRequest.itemId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMicroMobilityItemInfoRequest.serviceId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityItemInfoRequest$b */
    public static class C9232b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9231a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityItemInfoRequest$c */
    public static class C9233c extends C25240d<MVMicroMobilityItemInfoRequest> {
        public C9233c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityItemInfoRequest mVMicroMobilityItemInfoRequest = (MVMicroMobilityItemInfoRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityItemInfoRequest.mo28729g()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityItemInfoRequest.mo28728f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVMicroMobilityItemInfoRequest.mo28729g()) {
                jVar.mo61686J(mVMicroMobilityItemInfoRequest.serviceId);
            }
            if (mVMicroMobilityItemInfoRequest.mo28728f()) {
                jVar.mo61686J(mVMicroMobilityItemInfoRequest.itemId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityItemInfoRequest mVMicroMobilityItemInfoRequest = (MVMicroMobilityItemInfoRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVMicroMobilityItemInfoRequest.serviceId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVMicroMobilityItemInfoRequest.itemId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityItemInfoRequest$d */
    public static class C9234d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9233c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityItemInfoRequest");
        HashMap hashMap = new HashMap();
        f26558d = hashMap;
        hashMap.put(C25239c.class, new C9232b());
        hashMap.put(C25240d.class, new C9234d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SERVICE_ID, new FieldMetaData("serviceId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ITEM_ID, new FieldMetaData("itemId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26559e = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityItemInfoRequest.class, unmodifiableMap);
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
        ((C25238b) f26558d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26558d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityItemInfoRequest mVMicroMobilityItemInfoRequest = (MVMicroMobilityItemInfoRequest) obj;
        if (!getClass().equals(mVMicroMobilityItemInfoRequest.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityItemInfoRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28729g()).compareTo(Boolean.valueOf(mVMicroMobilityItemInfoRequest.mo28729g()));
        if (compareTo2 != 0 || ((mo28729g() && (compareTo2 = this.serviceId.compareTo(mVMicroMobilityItemInfoRequest.serviceId)) != 0) || (compareTo2 = Boolean.valueOf(mo28728f()).compareTo(Boolean.valueOf(mVMicroMobilityItemInfoRequest.mo28728f()))) != 0)) {
            return compareTo2;
        }
        if (!mo28728f() || (compareTo = this.itemId.compareTo(mVMicroMobilityItemInfoRequest.itemId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityItemInfoRequest)) {
            return false;
        }
        MVMicroMobilityItemInfoRequest mVMicroMobilityItemInfoRequest = (MVMicroMobilityItemInfoRequest) obj;
        boolean g = mo28729g();
        boolean g2 = mVMicroMobilityItemInfoRequest.mo28729g();
        if ((g || g2) && (!g || !g2 || !this.serviceId.equals(mVMicroMobilityItemInfoRequest.serviceId))) {
            return false;
        }
        boolean f = mo28728f();
        boolean f2 = mVMicroMobilityItemInfoRequest.mo28728f();
        if ((f || f2) && (!f || !f2 || !this.itemId.equals(mVMicroMobilityItemInfoRequest.itemId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28728f() {
        return this.itemId != null;
    }

    /* renamed from: g */
    public final boolean mo28729g() {
        return this.serviceId != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityItemInfoRequest(", "serviceId:");
        String str = this.serviceId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("itemId:");
        String str2 = this.itemId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
