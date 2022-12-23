package com.tranzmate.moovit.protocol.users;

import com.appboy.support.StringUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
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

public class MVExternalSystemLoginDetails implements TBase<MVExternalSystemLoginDetails, _Fields>, Serializable, Cloneable, Comparable<MVExternalSystemLoginDetails> {

    /* renamed from: b */
    public static final C25113c f30402b = new C25113c(FirebaseMessagingService.EXTRA_TOKEN, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30403c = new C25113c("id", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f30404d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30405e;

    /* renamed from: id */
    public String f30406id;
    public String token;

    public enum _Fields implements C25085c {
        TOKEN(1, FirebaseMessagingService.EXTRA_TOKEN),
        ID(2, "id");
        
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
                return TOKEN;
            }
            if (i != 2) {
                return null;
            }
            return ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVExternalSystemLoginDetails$a */
    public static class C11804a extends C25239c<MVExternalSystemLoginDetails> {
        public C11804a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVExternalSystemLoginDetails mVExternalSystemLoginDetails = (MVExternalSystemLoginDetails) tBase;
            mVExternalSystemLoginDetails.getClass();
            C25113c cVar = MVExternalSystemLoginDetails.f30402b;
            gVar.mo61687K();
            if (mVExternalSystemLoginDetails.token != null) {
                gVar.mo61711x(MVExternalSystemLoginDetails.f30402b);
                gVar.mo61686J(mVExternalSystemLoginDetails.token);
                gVar.mo61712y();
            }
            if (mVExternalSystemLoginDetails.f30406id != null) {
                gVar.mo61711x(MVExternalSystemLoginDetails.f30403c);
                gVar.mo61686J(mVExternalSystemLoginDetails.f30406id);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVExternalSystemLoginDetails mVExternalSystemLoginDetails = (MVExternalSystemLoginDetails) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVExternalSystemLoginDetails.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVExternalSystemLoginDetails.f30406id = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVExternalSystemLoginDetails.token = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVExternalSystemLoginDetails$b */
    public static class C11805b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11804a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVExternalSystemLoginDetails$c */
    public static class C11806c extends C25240d<MVExternalSystemLoginDetails> {
        public C11806c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVExternalSystemLoginDetails mVExternalSystemLoginDetails = (MVExternalSystemLoginDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVExternalSystemLoginDetails.mo35117g()) {
                bitSet.set(0);
            }
            if (mVExternalSystemLoginDetails.mo35116f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVExternalSystemLoginDetails.mo35117g()) {
                jVar.mo61686J(mVExternalSystemLoginDetails.token);
            }
            if (mVExternalSystemLoginDetails.mo35116f()) {
                jVar.mo61686J(mVExternalSystemLoginDetails.f30406id);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVExternalSystemLoginDetails mVExternalSystemLoginDetails = (MVExternalSystemLoginDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVExternalSystemLoginDetails.token = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVExternalSystemLoginDetails.f30406id = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVExternalSystemLoginDetails$d */
    public static class C11807d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11806c(0);
        }
    }

    static {
        new C17394d0("MVExternalSystemLoginDetails");
        HashMap hashMap = new HashMap();
        f30404d = hashMap;
        hashMap.put(C25239c.class, new C11805b());
        hashMap.put(C25240d.class, new C11807d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TOKEN, new FieldMetaData(FirebaseMessagingService.EXTRA_TOKEN, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30405e = unmodifiableMap;
        FieldMetaData.m61947a(MVExternalSystemLoginDetails.class, unmodifiableMap);
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
        ((C25238b) f30404d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30404d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVExternalSystemLoginDetails mVExternalSystemLoginDetails = (MVExternalSystemLoginDetails) obj;
        if (!getClass().equals(mVExternalSystemLoginDetails.getClass())) {
            return getClass().getName().compareTo(mVExternalSystemLoginDetails.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35117g()).compareTo(Boolean.valueOf(mVExternalSystemLoginDetails.mo35117g()));
        if (compareTo2 != 0 || ((mo35117g() && (compareTo2 = this.token.compareTo(mVExternalSystemLoginDetails.token)) != 0) || (compareTo2 = Boolean.valueOf(mo35116f()).compareTo(Boolean.valueOf(mVExternalSystemLoginDetails.mo35116f()))) != 0)) {
            return compareTo2;
        }
        if (!mo35116f() || (compareTo = this.f30406id.compareTo(mVExternalSystemLoginDetails.f30406id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVExternalSystemLoginDetails)) {
            return false;
        }
        MVExternalSystemLoginDetails mVExternalSystemLoginDetails = (MVExternalSystemLoginDetails) obj;
        boolean g = mo35117g();
        boolean g2 = mVExternalSystemLoginDetails.mo35117g();
        if ((g || g2) && (!g || !g2 || !this.token.equals(mVExternalSystemLoginDetails.token))) {
            return false;
        }
        boolean f = mo35116f();
        boolean f2 = mVExternalSystemLoginDetails.mo35116f();
        if ((f || f2) && (!f || !f2 || !this.f30406id.equals(mVExternalSystemLoginDetails.f30406id))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35116f() {
        return this.f30406id != null;
    }

    /* renamed from: g */
    public final boolean mo35117g() {
        return this.token != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVExternalSystemLoginDetails(", "token:");
        String str = this.token;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("id:");
        String str2 = this.f30406id;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
