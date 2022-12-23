package com.tranzmate.moovit.protocol.users;

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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVPushNotificationPayloadRequest implements TBase<MVPushNotificationPayloadRequest, _Fields>, Serializable, Cloneable, Comparable<MVPushNotificationPayloadRequest> {

    /* renamed from: b */
    public static final C25113c f30499b = new C25113c("pushId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30500c = new C25113c("locale", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f30501d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30502e;
    private byte __isset_bitfield = 0;
    public MVLocale locale;
    private _Fields[] optionals = {_Fields.LOCALE};
    public int pushId;

    public enum _Fields implements C25085c {
        PUSH_ID(1, "pushId"),
        LOCALE(2, "locale");
        
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
                return PUSH_ID;
            }
            if (i != 2) {
                return null;
            }
            return LOCALE;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVPushNotificationPayloadRequest$a */
    public static class C11873a extends C25239c<MVPushNotificationPayloadRequest> {
        public C11873a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPushNotificationPayloadRequest mVPushNotificationPayloadRequest = (MVPushNotificationPayloadRequest) tBase;
            MVLocale mVLocale = mVPushNotificationPayloadRequest.locale;
            C25113c cVar = MVPushNotificationPayloadRequest.f30499b;
            gVar.mo61687K();
            gVar.mo61711x(MVPushNotificationPayloadRequest.f30499b);
            gVar.mo61678B(mVPushNotificationPayloadRequest.pushId);
            gVar.mo61712y();
            if (mVPushNotificationPayloadRequest.locale != null && mVPushNotificationPayloadRequest.mo35275f()) {
                gVar.mo61711x(MVPushNotificationPayloadRequest.f30500c);
                mVPushNotificationPayloadRequest.locale.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPushNotificationPayloadRequest mVPushNotificationPayloadRequest = (MVPushNotificationPayloadRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLocale mVLocale = mVPushNotificationPayloadRequest.locale;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVLocale mVLocale2 = new MVLocale();
                        mVPushNotificationPayloadRequest.locale = mVLocale2;
                        mVLocale2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPushNotificationPayloadRequest.pushId = gVar.mo61696i();
                    mVPushNotificationPayloadRequest.mo35277h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVPushNotificationPayloadRequest$b */
    public static class C11874b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11873a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVPushNotificationPayloadRequest$c */
    public static class C11875c extends C25240d<MVPushNotificationPayloadRequest> {
        public C11875c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPushNotificationPayloadRequest mVPushNotificationPayloadRequest = (MVPushNotificationPayloadRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPushNotificationPayloadRequest.mo35276g()) {
                bitSet.set(0);
            }
            if (mVPushNotificationPayloadRequest.mo35275f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPushNotificationPayloadRequest.mo35276g()) {
                jVar.mo61678B(mVPushNotificationPayloadRequest.pushId);
            }
            if (mVPushNotificationPayloadRequest.mo35275f()) {
                mVPushNotificationPayloadRequest.locale.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPushNotificationPayloadRequest mVPushNotificationPayloadRequest = (MVPushNotificationPayloadRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPushNotificationPayloadRequest.pushId = jVar.mo61696i();
                mVPushNotificationPayloadRequest.mo35277h();
            }
            if (T.get(1)) {
                MVLocale mVLocale = new MVLocale();
                mVPushNotificationPayloadRequest.locale = mVLocale;
                mVLocale.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVPushNotificationPayloadRequest$d */
    public static class C11876d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11875c(0);
        }
    }

    static {
        new C17394d0("MVPushNotificationPayloadRequest");
        HashMap hashMap = new HashMap();
        f30501d = hashMap;
        hashMap.put(C25239c.class, new C11874b());
        hashMap.put(C25240d.class, new C11876d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PUSH_ID, new FieldMetaData("pushId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LOCALE, new FieldMetaData("locale", (byte) 2, new StructMetaData(MVLocale.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30502e = unmodifiableMap;
        FieldMetaData.m61947a(MVPushNotificationPayloadRequest.class, unmodifiableMap);
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
        ((C25238b) f30501d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30501d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPushNotificationPayloadRequest mVPushNotificationPayloadRequest = (MVPushNotificationPayloadRequest) obj;
        if (!getClass().equals(mVPushNotificationPayloadRequest.getClass())) {
            return getClass().getName().compareTo(mVPushNotificationPayloadRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35276g()).compareTo(Boolean.valueOf(mVPushNotificationPayloadRequest.mo35276g()));
        if (compareTo2 != 0 || ((mo35276g() && (compareTo2 = C25082a.m62839c(this.pushId, mVPushNotificationPayloadRequest.pushId)) != 0) || (compareTo2 = Boolean.valueOf(mo35275f()).compareTo(Boolean.valueOf(mVPushNotificationPayloadRequest.mo35275f()))) != 0)) {
            return compareTo2;
        }
        if (!mo35275f() || (compareTo = this.locale.compareTo(mVPushNotificationPayloadRequest.locale)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPushNotificationPayloadRequest)) {
            return false;
        }
        MVPushNotificationPayloadRequest mVPushNotificationPayloadRequest = (MVPushNotificationPayloadRequest) obj;
        if (this.pushId != mVPushNotificationPayloadRequest.pushId) {
            return false;
        }
        boolean f = mo35275f();
        boolean f2 = mVPushNotificationPayloadRequest.mo35275f();
        if ((f || f2) && (!f || !f2 || !this.locale.mo35206a(mVPushNotificationPayloadRequest.locale))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35275f() {
        return this.locale != null;
    }

    /* renamed from: g */
    public final boolean mo35276g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo35277h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPushNotificationPayloadRequest(", "pushId:");
        n.append(this.pushId);
        if (mo35275f()) {
            n.append(", ");
            n.append("locale:");
            MVLocale mVLocale = this.locale;
            if (mVLocale == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLocale);
            }
        }
        n.append(")");
        return n.toString();
    }
}
