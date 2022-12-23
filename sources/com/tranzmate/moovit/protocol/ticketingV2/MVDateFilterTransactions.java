package com.tranzmate.moovit.protocol.ticketingV2;

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
import p001a0.C0016g;
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

public class MVDateFilterTransactions implements TBase<MVDateFilterTransactions, _Fields>, Serializable, Cloneable, Comparable<MVDateFilterTransactions> {

    /* renamed from: b */
    public static final C25113c f28705b = new C25113c("month", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28706c = new C25113c("year", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f28707d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28708e;
    private byte __isset_bitfield = 0;
    public int month;
    public int year;

    public enum _Fields implements C25085c {
        MONTH(1, "month"),
        YEAR(2, "year");
        
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
                return MONTH;
            }
            if (i != 2) {
                return null;
            }
            return YEAR;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVDateFilterTransactions$a */
    public static class C10798a extends C25239c<MVDateFilterTransactions> {
        public C10798a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDateFilterTransactions mVDateFilterTransactions = (MVDateFilterTransactions) tBase;
            mVDateFilterTransactions.getClass();
            C25113c cVar = MVDateFilterTransactions.f28705b;
            gVar.mo61687K();
            gVar.mo61711x(MVDateFilterTransactions.f28705b);
            gVar.mo61678B(mVDateFilterTransactions.month);
            gVar.mo61712y();
            gVar.mo61711x(MVDateFilterTransactions.f28706c);
            C16530d.m42020n(gVar, mVDateFilterTransactions.year);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDateFilterTransactions mVDateFilterTransactions = (MVDateFilterTransactions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDateFilterTransactions.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVDateFilterTransactions.year = gVar.mo61696i();
                        mVDateFilterTransactions.mo32382i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVDateFilterTransactions.month = gVar.mo61696i();
                    mVDateFilterTransactions.mo32380h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVDateFilterTransactions$b */
    public static class C10799b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10798a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVDateFilterTransactions$c */
    public static class C10800c extends C25240d<MVDateFilterTransactions> {
        public C10800c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDateFilterTransactions mVDateFilterTransactions = (MVDateFilterTransactions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDateFilterTransactions.mo32378f()) {
                bitSet.set(0);
            }
            if (mVDateFilterTransactions.mo32379g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVDateFilterTransactions.mo32378f()) {
                jVar.mo61678B(mVDateFilterTransactions.month);
            }
            if (mVDateFilterTransactions.mo32379g()) {
                jVar.mo61678B(mVDateFilterTransactions.year);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDateFilterTransactions mVDateFilterTransactions = (MVDateFilterTransactions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVDateFilterTransactions.month = jVar.mo61696i();
                mVDateFilterTransactions.mo32380h();
            }
            if (T.get(1)) {
                mVDateFilterTransactions.year = jVar.mo61696i();
                mVDateFilterTransactions.mo32382i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVDateFilterTransactions$d */
    public static class C10801d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10800c(0);
        }
    }

    static {
        new C17394d0("MVDateFilterTransactions");
        HashMap hashMap = new HashMap();
        f28707d = hashMap;
        hashMap.put(C25239c.class, new C10799b());
        hashMap.put(C25240d.class, new C10801d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MONTH, new FieldMetaData("month", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.YEAR, new FieldMetaData("year", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28708e = unmodifiableMap;
        FieldMetaData.m61947a(MVDateFilterTransactions.class, unmodifiableMap);
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
        ((C25238b) f28707d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28707d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVDateFilterTransactions mVDateFilterTransactions = (MVDateFilterTransactions) obj;
        if (!getClass().equals(mVDateFilterTransactions.getClass())) {
            return getClass().getName().compareTo(mVDateFilterTransactions.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32378f()).compareTo(Boolean.valueOf(mVDateFilterTransactions.mo32378f()));
        if (compareTo != 0 || ((mo32378f() && (compareTo = C25082a.m62839c(this.month, mVDateFilterTransactions.month)) != 0) || (compareTo = Boolean.valueOf(mo32379g()).compareTo(Boolean.valueOf(mVDateFilterTransactions.mo32379g()))) != 0)) {
            return compareTo;
        }
        if (!mo32379g() || (c = C25082a.m62839c(this.year, mVDateFilterTransactions.year)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDateFilterTransactions)) {
            return false;
        }
        MVDateFilterTransactions mVDateFilterTransactions = (MVDateFilterTransactions) obj;
        if (this.month == mVDateFilterTransactions.month && this.year == mVDateFilterTransactions.year) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32378f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo32379g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final void mo32380h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo32382i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDateFilterTransactions(", "month:");
        C0016g.m42z(n, this.month, ", ", "year:");
        return C13437d.m33707l(n, this.year, ")");
    }
}
