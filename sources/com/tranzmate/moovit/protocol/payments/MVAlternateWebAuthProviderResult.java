package com.tranzmate.moovit.protocol.payments;

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

public class MVAlternateWebAuthProviderResult implements TBase<MVAlternateWebAuthProviderResult, _Fields>, Serializable, Cloneable, Comparable<MVAlternateWebAuthProviderResult> {

    /* renamed from: b */
    public static final C25113c f27071b = new C25113c("resultUrl", (byte) 11, 1);

    /* renamed from: c */
    public static final HashMap f27072c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27073d;
    public String resultUrl;

    public enum _Fields implements C25085c {
        RESULT_URL(1, "resultUrl");
        
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
            return RESULT_URL;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAlternateWebAuthProviderResult$a */
    public static class C9580a extends C25239c<MVAlternateWebAuthProviderResult> {
        public C9580a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAlternateWebAuthProviderResult mVAlternateWebAuthProviderResult = (MVAlternateWebAuthProviderResult) tBase;
            mVAlternateWebAuthProviderResult.getClass();
            C25113c cVar = MVAlternateWebAuthProviderResult.f27071b;
            gVar.mo61687K();
            if (mVAlternateWebAuthProviderResult.resultUrl != null) {
                gVar.mo61711x(MVAlternateWebAuthProviderResult.f27071b);
                gVar.mo61686J(mVAlternateWebAuthProviderResult.resultUrl);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAlternateWebAuthProviderResult mVAlternateWebAuthProviderResult = (MVAlternateWebAuthProviderResult) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAlternateWebAuthProviderResult.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 11) {
                    mVAlternateWebAuthProviderResult.resultUrl = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAlternateWebAuthProviderResult$b */
    public static class C9581b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9580a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAlternateWebAuthProviderResult$c */
    public static class C9582c extends C25240d<MVAlternateWebAuthProviderResult> {
        public C9582c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAlternateWebAuthProviderResult mVAlternateWebAuthProviderResult = (MVAlternateWebAuthProviderResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAlternateWebAuthProviderResult.mo29523f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVAlternateWebAuthProviderResult.mo29523f()) {
                jVar.mo61686J(mVAlternateWebAuthProviderResult.resultUrl);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAlternateWebAuthProviderResult mVAlternateWebAuthProviderResult = (MVAlternateWebAuthProviderResult) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVAlternateWebAuthProviderResult.resultUrl = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAlternateWebAuthProviderResult$d */
    public static class C9583d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9582c(0);
        }
    }

    static {
        new C17394d0("MVAlternateWebAuthProviderResult");
        HashMap hashMap = new HashMap();
        f27072c = hashMap;
        hashMap.put(C25239c.class, new C9581b());
        hashMap.put(C25240d.class, new C9583d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RESULT_URL, new FieldMetaData("resultUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27073d = unmodifiableMap;
        FieldMetaData.m61947a(MVAlternateWebAuthProviderResult.class, unmodifiableMap);
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
        ((C25238b) f27072c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27072c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAlternateWebAuthProviderResult mVAlternateWebAuthProviderResult = (MVAlternateWebAuthProviderResult) obj;
        if (!getClass().equals(mVAlternateWebAuthProviderResult.getClass())) {
            return getClass().getName().compareTo(mVAlternateWebAuthProviderResult.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29523f()).compareTo(Boolean.valueOf(mVAlternateWebAuthProviderResult.mo29523f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo29523f() || (compareTo = this.resultUrl.compareTo(mVAlternateWebAuthProviderResult.resultUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAlternateWebAuthProviderResult)) {
            return false;
        }
        MVAlternateWebAuthProviderResult mVAlternateWebAuthProviderResult = (MVAlternateWebAuthProviderResult) obj;
        boolean f = mo29523f();
        boolean f2 = mVAlternateWebAuthProviderResult.mo29523f();
        if ((f || f2) && (!f || !f2 || !this.resultUrl.equals(mVAlternateWebAuthProviderResult.resultUrl))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29523f() {
        return this.resultUrl != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAlternateWebAuthProviderResult(", "resultUrl:");
        String str = this.resultUrl;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
