package com.tranzmate.moovit.protocol.paymentaccount;

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

public class MVAccountFlowHtmlStepResult implements TBase<MVAccountFlowHtmlStepResult, _Fields>, Serializable, Cloneable, Comparable<MVAccountFlowHtmlStepResult> {

    /* renamed from: b */
    public static final C25113c f26909b = new C25113c("identifier", (byte) 11, 1);

    /* renamed from: c */
    public static final HashMap f26910c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f26911d;
    public String identifier;

    public enum _Fields implements C25085c {
        IDENTIFIER(1, "identifier");
        
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
            return IDENTIFIER;
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowHtmlStepResult$a */
    public static class C9473a extends C25239c<MVAccountFlowHtmlStepResult> {
        public C9473a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowHtmlStepResult mVAccountFlowHtmlStepResult = (MVAccountFlowHtmlStepResult) tBase;
            mVAccountFlowHtmlStepResult.getClass();
            C25113c cVar = MVAccountFlowHtmlStepResult.f26909b;
            gVar.mo61687K();
            if (mVAccountFlowHtmlStepResult.identifier != null) {
                gVar.mo61711x(MVAccountFlowHtmlStepResult.f26909b);
                gVar.mo61686J(mVAccountFlowHtmlStepResult.identifier);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowHtmlStepResult mVAccountFlowHtmlStepResult = (MVAccountFlowHtmlStepResult) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAccountFlowHtmlStepResult.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 11) {
                    mVAccountFlowHtmlStepResult.identifier = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowHtmlStepResult$b */
    public static class C9474b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9473a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowHtmlStepResult$c */
    public static class C9475c extends C25240d<MVAccountFlowHtmlStepResult> {
        public C9475c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowHtmlStepResult mVAccountFlowHtmlStepResult = (MVAccountFlowHtmlStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAccountFlowHtmlStepResult.mo29292f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVAccountFlowHtmlStepResult.mo29292f()) {
                jVar.mo61686J(mVAccountFlowHtmlStepResult.identifier);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowHtmlStepResult mVAccountFlowHtmlStepResult = (MVAccountFlowHtmlStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVAccountFlowHtmlStepResult.identifier = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowHtmlStepResult$d */
    public static class C9476d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9475c(0);
        }
    }

    static {
        new C17394d0("MVAccountFlowHtmlStepResult");
        HashMap hashMap = new HashMap();
        f26910c = hashMap;
        hashMap.put(C25239c.class, new C9474b());
        hashMap.put(C25240d.class, new C9476d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IDENTIFIER, new FieldMetaData("identifier", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26911d = unmodifiableMap;
        FieldMetaData.m61947a(MVAccountFlowHtmlStepResult.class, unmodifiableMap);
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
        ((C25238b) f26910c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26910c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAccountFlowHtmlStepResult mVAccountFlowHtmlStepResult = (MVAccountFlowHtmlStepResult) obj;
        if (!getClass().equals(mVAccountFlowHtmlStepResult.getClass())) {
            return getClass().getName().compareTo(mVAccountFlowHtmlStepResult.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29292f()).compareTo(Boolean.valueOf(mVAccountFlowHtmlStepResult.mo29292f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo29292f() || (compareTo = this.identifier.compareTo(mVAccountFlowHtmlStepResult.identifier)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAccountFlowHtmlStepResult)) {
            return false;
        }
        MVAccountFlowHtmlStepResult mVAccountFlowHtmlStepResult = (MVAccountFlowHtmlStepResult) obj;
        boolean f = mo29292f();
        boolean f2 = mVAccountFlowHtmlStepResult.mo29292f();
        if ((f || f2) && (!f || !f2 || !this.identifier.equals(mVAccountFlowHtmlStepResult.identifier))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29292f() {
        return this.identifier != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAccountFlowHtmlStepResult(", "identifier:");
        String str = this.identifier;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
