package com.tranzmate.moovit.protocol.payments;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import p531he.C17394d0;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVPaymentMethodNoInfo implements TBase<MVPaymentMethodNoInfo, _Fields>, Serializable, Cloneable, Comparable<MVPaymentMethodNoInfo> {

    /* renamed from: b */
    public static final HashMap f27505b;

    /* renamed from: c */
    public static final Map<_Fields, FieldMetaData> f27506c;

    public enum _Fields implements C25085c {
        ;
        
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
            return null;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethodNoInfo$a */
    public static class C9918a extends C25239c<MVPaymentMethodNoInfo> {
        public C9918a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            ((MVPaymentMethodNoInfo) tBase).getClass();
            HashMap hashMap = MVPaymentMethodNoInfo.f27505b;
            gVar.mo61687K();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentMethodNoInfo mVPaymentMethodNoInfo = (MVPaymentMethodNoInfo) tBase;
            gVar.mo61705r();
            while (true) {
                byte b = gVar.mo61693f().f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentMethodNoInfo.getClass();
                    return;
                }
                C25122h.m63098a(gVar, b);
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethodNoInfo$b */
    public static class C9919b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9918a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethodNoInfo$c */
    public static class C9920c extends C25240d<MVPaymentMethodNoInfo> {
        public C9920c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentMethodNoInfo mVPaymentMethodNoInfo = (MVPaymentMethodNoInfo) tBase;
            C25124j jVar = (C25124j) gVar;
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentMethodNoInfo mVPaymentMethodNoInfo = (MVPaymentMethodNoInfo) tBase;
            C25124j jVar = (C25124j) gVar;
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethodNoInfo$d */
    public static class C9921d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9920c(0);
        }
    }

    static {
        new C17394d0("MVPaymentMethodNoInfo");
        HashMap hashMap = new HashMap();
        f27505b = hashMap;
        hashMap.put(C25239c.class, new C9919b());
        hashMap.put(C25240d.class, new C9921d());
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
        f27506c = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentMethodNoInfo.class, unmodifiableMap);
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
        ((C25238b) f27505b.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27505b.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        MVPaymentMethodNoInfo mVPaymentMethodNoInfo = (MVPaymentMethodNoInfo) obj;
        if (!getClass().equals(mVPaymentMethodNoInfo.getClass())) {
            return getClass().getName().compareTo(mVPaymentMethodNoInfo.getClass().getName());
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentMethodNoInfo)) {
            return false;
        }
        MVPaymentMethodNoInfo mVPaymentMethodNoInfo = (MVPaymentMethodNoInfo) obj;
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "MVPaymentMethodNoInfo()";
    }
}
