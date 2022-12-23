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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
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

public class MVTicketReceiptResponse implements TBase<MVTicketReceiptResponse, _Fields>, Serializable, Cloneable, Comparable<MVTicketReceiptResponse> {

    /* renamed from: b */
    public static final C25113c f29209b = new C25113c("ticketId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29210c = new C25113c("receipt", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29211d = new C25113c("cacheInstrunctions", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f29212e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29213f;
    public MVTicketCacheInstructions cacheInstrunctions;
    private _Fields[] optionals = {_Fields.CACHE_INSTRUNCTIONS};
    public MVTicketReceipt receipt;
    public String ticketId;

    public enum _Fields implements C25085c {
        TICKET_ID(1, "ticketId"),
        RECEIPT(2, "receipt"),
        CACHE_INSTRUNCTIONS(3, "cacheInstrunctions");
        
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
                return TICKET_ID;
            }
            if (i == 2) {
                return RECEIPT;
            }
            if (i != 3) {
                return null;
            }
            return CACHE_INSTRUNCTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceiptResponse$a */
    public static class C11093a extends C25239c<MVTicketReceiptResponse> {
        public C11093a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketReceiptResponse mVTicketReceiptResponse = (MVTicketReceiptResponse) tBase;
            MVTicketCacheInstructions mVTicketCacheInstructions = mVTicketReceiptResponse.cacheInstrunctions;
            C25113c cVar = MVTicketReceiptResponse.f29209b;
            gVar.mo61687K();
            if (mVTicketReceiptResponse.ticketId != null) {
                gVar.mo61711x(MVTicketReceiptResponse.f29209b);
                gVar.mo61686J(mVTicketReceiptResponse.ticketId);
                gVar.mo61712y();
            }
            if (mVTicketReceiptResponse.receipt != null) {
                gVar.mo61711x(MVTicketReceiptResponse.f29210c);
                mVTicketReceiptResponse.receipt.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTicketReceiptResponse.cacheInstrunctions != null && mVTicketReceiptResponse.mo33122f()) {
                gVar.mo61711x(MVTicketReceiptResponse.f29211d);
                mVTicketReceiptResponse.cacheInstrunctions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketReceiptResponse mVTicketReceiptResponse = (MVTicketReceiptResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTicketCacheInstructions mVTicketCacheInstructions = mVTicketReceiptResponse.cacheInstrunctions;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVTicketCacheInstructions mVTicketCacheInstructions2 = new MVTicketCacheInstructions();
                            mVTicketReceiptResponse.cacheInstrunctions = mVTicketCacheInstructions2;
                            mVTicketCacheInstructions2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVTicketReceipt mVTicketReceipt = new MVTicketReceipt();
                        mVTicketReceiptResponse.receipt = mVTicketReceipt;
                        mVTicketReceipt.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTicketReceiptResponse.ticketId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceiptResponse$b */
    public static class C11094b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11093a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceiptResponse$c */
    public static class C11095c extends C25240d<MVTicketReceiptResponse> {
        public C11095c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketReceiptResponse mVTicketReceiptResponse = (MVTicketReceiptResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTicketReceiptResponse.mo33124h()) {
                bitSet.set(0);
            }
            if (mVTicketReceiptResponse.mo33123g()) {
                bitSet.set(1);
            }
            if (mVTicketReceiptResponse.mo33122f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTicketReceiptResponse.mo33124h()) {
                jVar.mo61686J(mVTicketReceiptResponse.ticketId);
            }
            if (mVTicketReceiptResponse.mo33123g()) {
                mVTicketReceiptResponse.receipt.mo25202X0(jVar);
            }
            if (mVTicketReceiptResponse.mo33122f()) {
                mVTicketReceiptResponse.cacheInstrunctions.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketReceiptResponse mVTicketReceiptResponse = (MVTicketReceiptResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTicketReceiptResponse.ticketId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVTicketReceipt mVTicketReceipt = new MVTicketReceipt();
                mVTicketReceiptResponse.receipt = mVTicketReceipt;
                mVTicketReceipt.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVTicketCacheInstructions mVTicketCacheInstructions = new MVTicketCacheInstructions();
                mVTicketReceiptResponse.cacheInstrunctions = mVTicketCacheInstructions;
                mVTicketCacheInstructions.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceiptResponse$d */
    public static class C11096d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11095c(0);
        }
    }

    static {
        new C17394d0("MVTicketReceiptResponse");
        HashMap hashMap = new HashMap();
        f29212e = hashMap;
        hashMap.put(C25239c.class, new C11094b());
        hashMap.put(C25240d.class, new C11096d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TICKET_ID, new FieldMetaData("ticketId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RECEIPT, new FieldMetaData("receipt", (byte) 3, new StructMetaData(MVTicketReceipt.class)));
        enumMap.put(_Fields.CACHE_INSTRUNCTIONS, new FieldMetaData("cacheInstrunctions", (byte) 2, new StructMetaData(MVTicketCacheInstructions.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29213f = unmodifiableMap;
        FieldMetaData.m61947a(MVTicketReceiptResponse.class, unmodifiableMap);
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
        ((C25238b) f29212e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29212e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTicketReceiptResponse mVTicketReceiptResponse = (MVTicketReceiptResponse) obj;
        if (!getClass().equals(mVTicketReceiptResponse.getClass())) {
            return getClass().getName().compareTo(mVTicketReceiptResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33124h()).compareTo(Boolean.valueOf(mVTicketReceiptResponse.mo33124h()));
        if (compareTo2 != 0 || ((mo33124h() && (compareTo2 = this.ticketId.compareTo(mVTicketReceiptResponse.ticketId)) != 0) || (compareTo2 = Boolean.valueOf(mo33123g()).compareTo(Boolean.valueOf(mVTicketReceiptResponse.mo33123g()))) != 0 || ((mo33123g() && (compareTo2 = this.receipt.compareTo(mVTicketReceiptResponse.receipt)) != 0) || (compareTo2 = Boolean.valueOf(mo33122f()).compareTo(Boolean.valueOf(mVTicketReceiptResponse.mo33122f()))) != 0))) {
            return compareTo2;
        }
        if (!mo33122f() || (compareTo = this.cacheInstrunctions.compareTo(mVTicketReceiptResponse.cacheInstrunctions)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTicketReceiptResponse)) {
            return false;
        }
        MVTicketReceiptResponse mVTicketReceiptResponse = (MVTicketReceiptResponse) obj;
        boolean h = mo33124h();
        boolean h2 = mVTicketReceiptResponse.mo33124h();
        if ((h || h2) && (!h || !h2 || !this.ticketId.equals(mVTicketReceiptResponse.ticketId))) {
            return false;
        }
        boolean g = mo33123g();
        boolean g2 = mVTicketReceiptResponse.mo33123g();
        if ((g || g2) && (!g || !g2 || !this.receipt.mo33110k(mVTicketReceiptResponse.receipt))) {
            return false;
        }
        boolean f = mo33122f();
        boolean f2 = mVTicketReceiptResponse.mo33122f();
        if ((f || f2) && (!f || !f2 || !this.cacheInstrunctions.mo33070a(mVTicketReceiptResponse.cacheInstrunctions))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33122f() {
        return this.cacheInstrunctions != null;
    }

    /* renamed from: g */
    public final boolean mo33123g() {
        return this.receipt != null;
    }

    /* renamed from: h */
    public final boolean mo33124h() {
        return this.ticketId != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTicketReceiptResponse(", "ticketId:");
        String str = this.ticketId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("receipt:");
        MVTicketReceipt mVTicketReceipt = this.receipt;
        if (mVTicketReceipt == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTicketReceipt);
        }
        if (mo33122f()) {
            n.append(", ");
            n.append("cacheInstrunctions:");
            MVTicketCacheInstructions mVTicketCacheInstructions = this.cacheInstrunctions;
            if (mVTicketCacheInstructions == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTicketCacheInstructions);
            }
        }
        n.append(")");
        return n.toString();
    }
}
