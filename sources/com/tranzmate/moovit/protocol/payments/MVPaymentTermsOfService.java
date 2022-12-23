package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLinkedText;
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

public class MVPaymentTermsOfService implements TBase<MVPaymentTermsOfService, _Fields>, Serializable, Cloneable, Comparable<MVPaymentTermsOfService> {

    /* renamed from: b */
    public static final C25113c f27620b = new C25113c("termsOfService", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f27621c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27622d;
    public MVLinkedText termsOfService;

    public enum _Fields implements C25085c {
        TERMS_OF_SERVICE(1, "termsOfService");
        
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
            return TERMS_OF_SERVICE;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentTermsOfService$a */
    public static class C10011a extends C25239c<MVPaymentTermsOfService> {
        public C10011a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentTermsOfService mVPaymentTermsOfService = (MVPaymentTermsOfService) tBase;
            MVLinkedText mVLinkedText = mVPaymentTermsOfService.termsOfService;
            C25113c cVar = MVPaymentTermsOfService.f27620b;
            gVar.mo61687K();
            if (mVPaymentTermsOfService.termsOfService != null) {
                gVar.mo61711x(MVPaymentTermsOfService.f27620b);
                mVPaymentTermsOfService.termsOfService.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentTermsOfService mVPaymentTermsOfService = (MVPaymentTermsOfService) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLinkedText mVLinkedText = mVPaymentTermsOfService.termsOfService;
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVLinkedText mVLinkedText2 = new MVLinkedText();
                    mVPaymentTermsOfService.termsOfService = mVLinkedText2;
                    mVLinkedText2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentTermsOfService$b */
    public static class C10012b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10011a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentTermsOfService$c */
    public static class C10013c extends C25240d<MVPaymentTermsOfService> {
        public C10013c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentTermsOfService mVPaymentTermsOfService = (MVPaymentTermsOfService) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentTermsOfService.mo30459f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVPaymentTermsOfService.mo30459f()) {
                mVPaymentTermsOfService.termsOfService.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentTermsOfService mVPaymentTermsOfService = (MVPaymentTermsOfService) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVLinkedText mVLinkedText = new MVLinkedText();
                mVPaymentTermsOfService.termsOfService = mVLinkedText;
                mVLinkedText.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentTermsOfService$d */
    public static class C10014d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10013c(0);
        }
    }

    static {
        new C17394d0("MVPaymentTermsOfService");
        HashMap hashMap = new HashMap();
        f27621c = hashMap;
        hashMap.put(C25239c.class, new C10012b());
        hashMap.put(C25240d.class, new C10014d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TERMS_OF_SERVICE, new FieldMetaData("termsOfService", (byte) 3, new StructMetaData(MVLinkedText.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27622d = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentTermsOfService.class, unmodifiableMap);
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
        ((C25238b) f27621c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27621c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30456a(MVPaymentTermsOfService mVPaymentTermsOfService) {
        if (mVPaymentTermsOfService == null) {
            return false;
        }
        boolean f = mo30459f();
        boolean f2 = mVPaymentTermsOfService.mo30459f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.termsOfService.mo26301a(mVPaymentTermsOfService.termsOfService)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentTermsOfService mVPaymentTermsOfService = (MVPaymentTermsOfService) obj;
        if (!getClass().equals(mVPaymentTermsOfService.getClass())) {
            return getClass().getName().compareTo(mVPaymentTermsOfService.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30459f()).compareTo(Boolean.valueOf(mVPaymentTermsOfService.mo30459f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo30459f() || (compareTo = this.termsOfService.compareTo(mVPaymentTermsOfService.termsOfService)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPaymentTermsOfService)) {
            return mo30456a((MVPaymentTermsOfService) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30459f() {
        return this.termsOfService != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentTermsOfService(", "termsOfService:");
        MVLinkedText mVLinkedText = this.termsOfService;
        if (mVLinkedText == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLinkedText);
        }
        n.append(")");
        return n.toString();
    }
}
