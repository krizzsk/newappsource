package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.models.InAppMessageBase;
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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVAgencyMessage implements TBase<MVAgencyMessage, _Fields>, Serializable, Cloneable, Comparable<MVAgencyMessage> {

    /* renamed from: b */
    public static final C25113c f28677b = new C25113c("type", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28678c = new C25113c(InAppMessageBase.MESSAGE, (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28679d = new C25113c("expirationUtc", (byte) 10, 3);

    /* renamed from: e */
    public static final HashMap f28680e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28681f;
    private byte __isset_bitfield = 0;
    public long expirationUtc;
    public String message;
    private _Fields[] optionals = {_Fields.EXPIRATION_UTC};
    public MVAgencyMessageType type;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        MESSAGE(2, InAppMessageBase.MESSAGE),
        EXPIRATION_UTC(3, "expirationUtc");
        
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
                return TYPE;
            }
            if (i == 2) {
                return MESSAGE;
            }
            if (i != 3) {
                return null;
            }
            return EXPIRATION_UTC;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessage$a */
    public static class C10777a extends C25239c<MVAgencyMessage> {
        public C10777a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAgencyMessage mVAgencyMessage = (MVAgencyMessage) tBase;
            mVAgencyMessage.getClass();
            C25113c cVar = MVAgencyMessage.f28677b;
            gVar.mo61687K();
            if (mVAgencyMessage.type != null) {
                gVar.mo61711x(MVAgencyMessage.f28677b);
                gVar.mo61678B(mVAgencyMessage.type.getValue());
                gVar.mo61712y();
            }
            if (mVAgencyMessage.message != null) {
                gVar.mo61711x(MVAgencyMessage.f28678c);
                gVar.mo61686J(mVAgencyMessage.message);
                gVar.mo61712y();
            }
            if (mVAgencyMessage.mo32331f()) {
                gVar.mo61711x(MVAgencyMessage.f28679d);
                gVar.mo61679C(mVAgencyMessage.expirationUtc);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAgencyMessage mVAgencyMessage = (MVAgencyMessage) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAgencyMessage.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 10) {
                            mVAgencyMessage.expirationUtc = gVar.mo61697j();
                            mVAgencyMessage.mo32335i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVAgencyMessage.message = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVAgencyMessage.type = MVAgencyMessageType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessage$b */
    public static class C10778b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10777a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessage$c */
    public static class C10779c extends C25240d<MVAgencyMessage> {
        public C10779c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAgencyMessage mVAgencyMessage = (MVAgencyMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAgencyMessage.mo32333h()) {
                bitSet.set(0);
            }
            if (mVAgencyMessage.mo32332g()) {
                bitSet.set(1);
            }
            if (mVAgencyMessage.mo32331f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVAgencyMessage.mo32333h()) {
                jVar.mo61678B(mVAgencyMessage.type.getValue());
            }
            if (mVAgencyMessage.mo32332g()) {
                jVar.mo61686J(mVAgencyMessage.message);
            }
            if (mVAgencyMessage.mo32331f()) {
                jVar.mo61679C(mVAgencyMessage.expirationUtc);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAgencyMessage mVAgencyMessage = (MVAgencyMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVAgencyMessage.type = MVAgencyMessageType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVAgencyMessage.message = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVAgencyMessage.expirationUtc = jVar.mo61697j();
                mVAgencyMessage.mo32335i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessage$d */
    public static class C10780d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10779c(0);
        }
    }

    static {
        new C17394d0("MVAgencyMessage");
        HashMap hashMap = new HashMap();
        f28680e = hashMap;
        hashMap.put(C25239c.class, new C10778b());
        hashMap.put(C25240d.class, new C10780d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVAgencyMessageType.class)));
        enumMap.put(_Fields.MESSAGE, new FieldMetaData(InAppMessageBase.MESSAGE, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.EXPIRATION_UTC, new FieldMetaData("expirationUtc", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28681f = unmodifiableMap;
        FieldMetaData.m61947a(MVAgencyMessage.class, unmodifiableMap);
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
        ((C25238b) f28680e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28680e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVAgencyMessage mVAgencyMessage = (MVAgencyMessage) obj;
        if (!getClass().equals(mVAgencyMessage.getClass())) {
            return getClass().getName().compareTo(mVAgencyMessage.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32333h()).compareTo(Boolean.valueOf(mVAgencyMessage.mo32333h()));
        if (compareTo != 0 || ((mo32333h() && (compareTo = this.type.compareTo(mVAgencyMessage.type)) != 0) || (compareTo = Boolean.valueOf(mo32332g()).compareTo(Boolean.valueOf(mVAgencyMessage.mo32332g()))) != 0 || ((mo32332g() && (compareTo = this.message.compareTo(mVAgencyMessage.message)) != 0) || (compareTo = Boolean.valueOf(mo32331f()).compareTo(Boolean.valueOf(mVAgencyMessage.mo32331f()))) != 0))) {
            return compareTo;
        }
        if (!mo32331f() || (d = C25082a.m62840d(this.expirationUtc, mVAgencyMessage.expirationUtc)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAgencyMessage)) {
            return false;
        }
        MVAgencyMessage mVAgencyMessage = (MVAgencyMessage) obj;
        boolean h = mo32333h();
        boolean h2 = mVAgencyMessage.mo32333h();
        if ((h || h2) && (!h || !h2 || !this.type.equals(mVAgencyMessage.type))) {
            return false;
        }
        boolean g = mo32332g();
        boolean g2 = mVAgencyMessage.mo32332g();
        if ((g || g2) && (!g || !g2 || !this.message.equals(mVAgencyMessage.message))) {
            return false;
        }
        boolean f = mo32331f();
        boolean f2 = mVAgencyMessage.mo32331f();
        if ((f || f2) && (!f || !f2 || this.expirationUtc != mVAgencyMessage.expirationUtc)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32331f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo32332g() {
        return this.message != null;
    }

    /* renamed from: h */
    public final boolean mo32333h() {
        return this.type != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo32335i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAgencyMessage(", "type:");
        MVAgencyMessageType mVAgencyMessageType = this.type;
        if (mVAgencyMessageType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAgencyMessageType);
        }
        n.append(", ");
        n.append("message:");
        String str = this.message;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo32331f()) {
            n.append(", ");
            n.append("expirationUtc:");
            n.append(this.expirationUtc);
        }
        n.append(")");
        return n.toString();
    }
}
