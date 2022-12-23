package com.tranzmate.moovit.protocol.ticketingV2;

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

public class MVVisualCodeTicketReceipt implements TBase<MVVisualCodeTicketReceipt, _Fields>, Serializable, Cloneable, Comparable<MVVisualCodeTicketReceipt> {

    /* renamed from: b */
    public static final C25113c f29320b = new C25113c("format", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29321c = new C25113c("data", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f29322d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29323e;
    public String data;
    public MVVisualCodeFormat format;

    public enum _Fields implements C25085c {
        FORMAT(1, "format"),
        DATA(2, "data");
        
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
                return FORMAT;
            }
            if (i != 2) {
                return null;
            }
            return DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVVisualCodeTicketReceipt$a */
    public static class C11164a extends C25239c<MVVisualCodeTicketReceipt> {
        public C11164a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVisualCodeTicketReceipt mVVisualCodeTicketReceipt = (MVVisualCodeTicketReceipt) tBase;
            mVVisualCodeTicketReceipt.getClass();
            C25113c cVar = MVVisualCodeTicketReceipt.f29320b;
            gVar.mo61687K();
            if (mVVisualCodeTicketReceipt.format != null) {
                gVar.mo61711x(MVVisualCodeTicketReceipt.f29320b);
                gVar.mo61678B(mVVisualCodeTicketReceipt.format.getValue());
                gVar.mo61712y();
            }
            if (mVVisualCodeTicketReceipt.data != null) {
                gVar.mo61711x(MVVisualCodeTicketReceipt.f29321c);
                gVar.mo61686J(mVVisualCodeTicketReceipt.data);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVisualCodeTicketReceipt mVVisualCodeTicketReceipt = (MVVisualCodeTicketReceipt) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVVisualCodeTicketReceipt.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVVisualCodeTicketReceipt.data = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVVisualCodeTicketReceipt.format = MVVisualCodeFormat.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVVisualCodeTicketReceipt$b */
    public static class C11165b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11164a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVVisualCodeTicketReceipt$c */
    public static class C11166c extends C25240d<MVVisualCodeTicketReceipt> {
        public C11166c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVisualCodeTicketReceipt mVVisualCodeTicketReceipt = (MVVisualCodeTicketReceipt) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVVisualCodeTicketReceipt.mo33296g()) {
                bitSet.set(0);
            }
            if (mVVisualCodeTicketReceipt.mo33295f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVVisualCodeTicketReceipt.mo33296g()) {
                jVar.mo61678B(mVVisualCodeTicketReceipt.format.getValue());
            }
            if (mVVisualCodeTicketReceipt.mo33295f()) {
                jVar.mo61686J(mVVisualCodeTicketReceipt.data);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVisualCodeTicketReceipt mVVisualCodeTicketReceipt = (MVVisualCodeTicketReceipt) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVVisualCodeTicketReceipt.format = MVVisualCodeFormat.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVVisualCodeTicketReceipt.data = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVVisualCodeTicketReceipt$d */
    public static class C11167d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11166c(0);
        }
    }

    static {
        new C17394d0("MVVisualCodeTicketReceipt");
        HashMap hashMap = new HashMap();
        f29322d = hashMap;
        hashMap.put(C25239c.class, new C11165b());
        hashMap.put(C25240d.class, new C11167d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FORMAT, new FieldMetaData("format", (byte) 3, new EnumMetaData(MVVisualCodeFormat.class)));
        enumMap.put(_Fields.DATA, new FieldMetaData("data", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29323e = unmodifiableMap;
        FieldMetaData.m61947a(MVVisualCodeTicketReceipt.class, unmodifiableMap);
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
        ((C25238b) f29322d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29322d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVVisualCodeTicketReceipt mVVisualCodeTicketReceipt = (MVVisualCodeTicketReceipt) obj;
        if (!getClass().equals(mVVisualCodeTicketReceipt.getClass())) {
            return getClass().getName().compareTo(mVVisualCodeTicketReceipt.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33296g()).compareTo(Boolean.valueOf(mVVisualCodeTicketReceipt.mo33296g()));
        if (compareTo2 != 0 || ((mo33296g() && (compareTo2 = this.format.compareTo(mVVisualCodeTicketReceipt.format)) != 0) || (compareTo2 = Boolean.valueOf(mo33295f()).compareTo(Boolean.valueOf(mVVisualCodeTicketReceipt.mo33295f()))) != 0)) {
            return compareTo2;
        }
        if (!mo33295f() || (compareTo = this.data.compareTo(mVVisualCodeTicketReceipt.data)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVVisualCodeTicketReceipt)) {
            return false;
        }
        MVVisualCodeTicketReceipt mVVisualCodeTicketReceipt = (MVVisualCodeTicketReceipt) obj;
        boolean g = mo33296g();
        boolean g2 = mVVisualCodeTicketReceipt.mo33296g();
        if ((g || g2) && (!g || !g2 || !this.format.equals(mVVisualCodeTicketReceipt.format))) {
            return false;
        }
        boolean f = mo33295f();
        boolean f2 = mVVisualCodeTicketReceipt.mo33295f();
        if ((f || f2) && (!f || !f2 || !this.data.equals(mVVisualCodeTicketReceipt.data))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33295f() {
        return this.data != null;
    }

    /* renamed from: g */
    public final boolean mo33296g() {
        return this.format != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVVisualCodeTicketReceipt(", "format:");
        MVVisualCodeFormat mVVisualCodeFormat = this.format;
        if (mVVisualCodeFormat == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVVisualCodeFormat);
        }
        n.append(", ");
        n.append("data:");
        String str = this.data;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
