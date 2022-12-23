package com.tranzmate.moovit.protocol.kinesis;

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
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
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

public class MVDeepLinkInstallation implements TBase<MVDeepLinkInstallation, _Fields>, Serializable, Cloneable, Comparable<MVDeepLinkInstallation> {

    /* renamed from: b */
    public static final C25113c f25916b = new C25113c("deepLink", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25917c = new C25113c("timestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final HashMap f25918d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25919e;
    private byte __isset_bitfield = 0;
    public String deepLink;
    public long timestamp;

    public enum _Fields implements C25085c {
        DEEP_LINK(1, "deepLink"),
        TIMESTAMP(2, "timestamp");
        
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
                return DEEP_LINK;
            }
            if (i != 2) {
                return null;
            }
            return TIMESTAMP;
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVDeepLinkInstallation$a */
    public static class C8903a extends C25239c<MVDeepLinkInstallation> {
        public C8903a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDeepLinkInstallation mVDeepLinkInstallation = (MVDeepLinkInstallation) tBase;
            mVDeepLinkInstallation.getClass();
            C25113c cVar = MVDeepLinkInstallation.f25916b;
            gVar.mo61687K();
            if (mVDeepLinkInstallation.deepLink != null) {
                gVar.mo61711x(MVDeepLinkInstallation.f25916b);
                gVar.mo61686J(mVDeepLinkInstallation.deepLink);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDeepLinkInstallation.f25917c);
            C25541a.m63891v(gVar, mVDeepLinkInstallation.timestamp);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDeepLinkInstallation mVDeepLinkInstallation = (MVDeepLinkInstallation) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDeepLinkInstallation.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 10) {
                        mVDeepLinkInstallation.timestamp = gVar.mo61697j();
                        mVDeepLinkInstallation.mo27729h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVDeepLinkInstallation.deepLink = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVDeepLinkInstallation$b */
    public static class C8904b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8903a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVDeepLinkInstallation$c */
    public static class C8905c extends C25240d<MVDeepLinkInstallation> {
        public C8905c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDeepLinkInstallation mVDeepLinkInstallation = (MVDeepLinkInstallation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDeepLinkInstallation.mo27727f()) {
                bitSet.set(0);
            }
            if (mVDeepLinkInstallation.mo27728g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVDeepLinkInstallation.mo27727f()) {
                jVar.mo61686J(mVDeepLinkInstallation.deepLink);
            }
            if (mVDeepLinkInstallation.mo27728g()) {
                jVar.mo61679C(mVDeepLinkInstallation.timestamp);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDeepLinkInstallation mVDeepLinkInstallation = (MVDeepLinkInstallation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVDeepLinkInstallation.deepLink = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVDeepLinkInstallation.timestamp = jVar.mo61697j();
                mVDeepLinkInstallation.mo27729h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVDeepLinkInstallation$d */
    public static class C8906d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8905c(0);
        }
    }

    static {
        new C17394d0("MVDeepLinkInstallation");
        HashMap hashMap = new HashMap();
        f25918d = hashMap;
        hashMap.put(C25239c.class, new C8904b());
        hashMap.put(C25240d.class, new C8906d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DEEP_LINK, new FieldMetaData("deepLink", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25919e = unmodifiableMap;
        FieldMetaData.m61947a(MVDeepLinkInstallation.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
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
        ((C25238b) f25918d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25918d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVDeepLinkInstallation mVDeepLinkInstallation = (MVDeepLinkInstallation) obj;
        if (!getClass().equals(mVDeepLinkInstallation.getClass())) {
            return getClass().getName().compareTo(mVDeepLinkInstallation.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27727f()).compareTo(Boolean.valueOf(mVDeepLinkInstallation.mo27727f()));
        if (compareTo != 0 || ((mo27727f() && (compareTo = this.deepLink.compareTo(mVDeepLinkInstallation.deepLink)) != 0) || (compareTo = Boolean.valueOf(mo27728g()).compareTo(Boolean.valueOf(mVDeepLinkInstallation.mo27728g()))) != 0)) {
            return compareTo;
        }
        if (!mo27728g() || (d = C25082a.m62840d(this.timestamp, mVDeepLinkInstallation.timestamp)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDeepLinkInstallation)) {
            return false;
        }
        MVDeepLinkInstallation mVDeepLinkInstallation = (MVDeepLinkInstallation) obj;
        boolean f = mo27727f();
        boolean f2 = mVDeepLinkInstallation.mo27727f();
        if (((f || f2) && (!f || !f2 || !this.deepLink.equals(mVDeepLinkInstallation.deepLink))) || this.timestamp != mVDeepLinkInstallation.timestamp) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27727f() {
        return this.deepLink != null;
    }

    /* renamed from: g */
    public final boolean mo27728g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo27729h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDeepLinkInstallation(", "deepLink:");
        String str = this.deepLink;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("timestamp:");
        return C25541a.m63884o(n, this.timestamp, ")");
    }
}
