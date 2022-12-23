package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
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

public class MVVDVTicketReceipt implements TBase<MVVDVTicketReceipt, _Fields>, Serializable, Cloneable, Comparable<MVVDVTicketReceipt> {

    /* renamed from: b */
    public static final C25113c f29316b = new C25113c("data", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29317c = new C25113c("orgId", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f29318d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29319e;
    public ByteBuffer data;
    public String orgId;

    public enum _Fields implements C25085c {
        DATA(1, "data"),
        ORG_ID(2, "orgId");
        
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
                return DATA;
            }
            if (i != 2) {
                return null;
            }
            return ORG_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVVDVTicketReceipt$a */
    public static class C11160a extends C25239c<MVVDVTicketReceipt> {
        public C11160a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVDVTicketReceipt mVVDVTicketReceipt = (MVVDVTicketReceipt) tBase;
            mVVDVTicketReceipt.getClass();
            C25113c cVar = MVVDVTicketReceipt.f29316b;
            gVar.mo61687K();
            if (mVVDVTicketReceipt.data != null) {
                gVar.mo61711x(MVVDVTicketReceipt.f29316b);
                gVar.mo61707t(mVVDVTicketReceipt.data);
                gVar.mo61712y();
            }
            if (mVVDVTicketReceipt.orgId != null) {
                gVar.mo61711x(MVVDVTicketReceipt.f29317c);
                gVar.mo61686J(mVVDVTicketReceipt.orgId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVDVTicketReceipt mVVDVTicketReceipt = (MVVDVTicketReceipt) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVVDVTicketReceipt.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVVDVTicketReceipt.orgId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVVDVTicketReceipt.data = gVar.mo61689b();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVVDVTicketReceipt$b */
    public static class C11161b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11160a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVVDVTicketReceipt$c */
    public static class C11162c extends C25240d<MVVDVTicketReceipt> {
        public C11162c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVDVTicketReceipt mVVDVTicketReceipt = (MVVDVTicketReceipt) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVVDVTicketReceipt.mo33287f()) {
                bitSet.set(0);
            }
            if (mVVDVTicketReceipt.mo33288g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVVDVTicketReceipt.mo33287f()) {
                jVar.mo61707t(mVVDVTicketReceipt.data);
            }
            if (mVVDVTicketReceipt.mo33288g()) {
                jVar.mo61686J(mVVDVTicketReceipt.orgId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVDVTicketReceipt mVVDVTicketReceipt = (MVVDVTicketReceipt) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVVDVTicketReceipt.data = jVar.mo61689b();
            }
            if (T.get(1)) {
                mVVDVTicketReceipt.orgId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVVDVTicketReceipt$d */
    public static class C11163d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11162c(0);
        }
    }

    static {
        new C17394d0("MVVDVTicketReceipt");
        HashMap hashMap = new HashMap();
        f29318d = hashMap;
        hashMap.put(C25239c.class, new C11161b());
        hashMap.put(C25240d.class, new C11163d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DATA, new FieldMetaData("data", (byte) 3, new FieldValueMetaData((byte) 11, true)));
        enumMap.put(_Fields.ORG_ID, new FieldMetaData("orgId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29319e = unmodifiableMap;
        FieldMetaData.m61947a(MVVDVTicketReceipt.class, unmodifiableMap);
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
        ((C25238b) f29318d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29318d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVVDVTicketReceipt mVVDVTicketReceipt = (MVVDVTicketReceipt) obj;
        if (!getClass().equals(mVVDVTicketReceipt.getClass())) {
            return getClass().getName().compareTo(mVVDVTicketReceipt.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33287f()).compareTo(Boolean.valueOf(mVVDVTicketReceipt.mo33287f()));
        if (compareTo2 != 0 || ((mo33287f() && (compareTo2 = this.data.compareTo(mVVDVTicketReceipt.data)) != 0) || (compareTo2 = Boolean.valueOf(mo33288g()).compareTo(Boolean.valueOf(mVVDVTicketReceipt.mo33288g()))) != 0)) {
            return compareTo2;
        }
        if (!mo33288g() || (compareTo = this.orgId.compareTo(mVVDVTicketReceipt.orgId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVVDVTicketReceipt)) {
            return false;
        }
        MVVDVTicketReceipt mVVDVTicketReceipt = (MVVDVTicketReceipt) obj;
        boolean f = mo33287f();
        boolean f2 = mVVDVTicketReceipt.mo33287f();
        if ((f || f2) && (!f || !f2 || !this.data.equals(mVVDVTicketReceipt.data))) {
            return false;
        }
        boolean g = mo33288g();
        boolean g2 = mVVDVTicketReceipt.mo33288g();
        if ((g || g2) && (!g || !g2 || !this.orgId.equals(mVVDVTicketReceipt.orgId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33287f() {
        return this.data != null;
    }

    /* renamed from: g */
    public final boolean mo33288g() {
        return this.orgId != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVVDVTicketReceipt(", "data:");
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            C25082a.m62851o(byteBuffer, n);
        }
        n.append(", ");
        n.append("orgId:");
        String str = this.orgId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
