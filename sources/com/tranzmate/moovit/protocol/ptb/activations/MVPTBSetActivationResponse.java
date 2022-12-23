package com.tranzmate.moovit.protocol.ptb.activations;

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

public class MVPTBSetActivationResponse implements TBase<MVPTBSetActivationResponse, _Fields>, Serializable, Cloneable, Comparable<MVPTBSetActivationResponse> {

    /* renamed from: b */
    public static final C25113c f27968b = new C25113c("activationsGroup", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f27969c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27970d;
    public MVPTBActivationsGroup activationsGroup;

    public enum _Fields implements C25085c {
        ACTIVATIONS_GROUP(1, "activationsGroup");
        
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
            return ACTIVATIONS_GROUP;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBSetActivationResponse$a */
    public static class C10262a extends C25239c<MVPTBSetActivationResponse> {
        public C10262a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBSetActivationResponse mVPTBSetActivationResponse = (MVPTBSetActivationResponse) tBase;
            MVPTBActivationsGroup mVPTBActivationsGroup = mVPTBSetActivationResponse.activationsGroup;
            C25113c cVar = MVPTBSetActivationResponse.f27968b;
            gVar.mo61687K();
            if (mVPTBSetActivationResponse.activationsGroup != null) {
                gVar.mo61711x(MVPTBSetActivationResponse.f27968b);
                mVPTBSetActivationResponse.activationsGroup.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBSetActivationResponse mVPTBSetActivationResponse = (MVPTBSetActivationResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVPTBActivationsGroup mVPTBActivationsGroup = mVPTBSetActivationResponse.activationsGroup;
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVPTBActivationsGroup mVPTBActivationsGroup2 = new MVPTBActivationsGroup();
                    mVPTBSetActivationResponse.activationsGroup = mVPTBActivationsGroup2;
                    mVPTBActivationsGroup2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBSetActivationResponse$b */
    public static class C10263b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10262a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBSetActivationResponse$c */
    public static class C10264c extends C25240d<MVPTBSetActivationResponse> {
        public C10264c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBSetActivationResponse mVPTBSetActivationResponse = (MVPTBSetActivationResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBSetActivationResponse.mo31082f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVPTBSetActivationResponse.mo31082f()) {
                mVPTBSetActivationResponse.activationsGroup.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBSetActivationResponse mVPTBSetActivationResponse = (MVPTBSetActivationResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVPTBActivationsGroup mVPTBActivationsGroup = new MVPTBActivationsGroup();
                mVPTBSetActivationResponse.activationsGroup = mVPTBActivationsGroup;
                mVPTBActivationsGroup.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBSetActivationResponse$d */
    public static class C10265d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10264c(0);
        }
    }

    static {
        new C17394d0("MVPTBSetActivationResponse");
        HashMap hashMap = new HashMap();
        f27969c = hashMap;
        hashMap.put(C25239c.class, new C10263b());
        hashMap.put(C25240d.class, new C10265d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ACTIVATIONS_GROUP, new FieldMetaData("activationsGroup", (byte) 3, new StructMetaData(MVPTBActivationsGroup.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27970d = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBSetActivationResponse.class, unmodifiableMap);
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
        ((C25238b) f27969c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27969c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPTBSetActivationResponse mVPTBSetActivationResponse = (MVPTBSetActivationResponse) obj;
        if (!getClass().equals(mVPTBSetActivationResponse.getClass())) {
            return getClass().getName().compareTo(mVPTBSetActivationResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31082f()).compareTo(Boolean.valueOf(mVPTBSetActivationResponse.mo31082f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo31082f() || (compareTo = this.activationsGroup.compareTo(mVPTBSetActivationResponse.activationsGroup)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPTBSetActivationResponse)) {
            return false;
        }
        MVPTBSetActivationResponse mVPTBSetActivationResponse = (MVPTBSetActivationResponse) obj;
        boolean f = mo31082f();
        boolean f2 = mVPTBSetActivationResponse.mo31082f();
        if ((f || f2) && (!f || !f2 || !this.activationsGroup.mo30840a(mVPTBSetActivationResponse.activationsGroup))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31082f() {
        return this.activationsGroup != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBSetActivationResponse(", "activationsGroup:");
        MVPTBActivationsGroup mVPTBActivationsGroup = this.activationsGroup;
        if (mVPTBActivationsGroup == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPTBActivationsGroup);
        }
        n.append(")");
        return n.toString();
    }
}
