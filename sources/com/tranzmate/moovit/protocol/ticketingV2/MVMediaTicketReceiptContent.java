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

public class MVMediaTicketReceiptContent implements TBase<MVMediaTicketReceiptContent, _Fields>, Serializable, Cloneable, Comparable<MVMediaTicketReceiptContent> {

    /* renamed from: b */
    public static final C25113c f28741b = new C25113c("frontUrl", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28742c = new C25113c("backUrl", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f28743d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28744e;
    public String backUrl;
    public String frontUrl;
    private _Fields[] optionals = {_Fields.BACK_URL};

    public enum _Fields implements C25085c {
        FRONT_URL(1, "frontUrl"),
        BACK_URL(2, "backUrl");
        
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
                return FRONT_URL;
            }
            if (i != 2) {
                return null;
            }
            return BACK_URL;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVMediaTicketReceiptContent$a */
    public static class C10823a extends C25239c<MVMediaTicketReceiptContent> {
        public C10823a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMediaTicketReceiptContent mVMediaTicketReceiptContent = (MVMediaTicketReceiptContent) tBase;
            mVMediaTicketReceiptContent.getClass();
            C25113c cVar = MVMediaTicketReceiptContent.f28741b;
            gVar.mo61687K();
            if (mVMediaTicketReceiptContent.frontUrl != null) {
                gVar.mo61711x(MVMediaTicketReceiptContent.f28741b);
                gVar.mo61686J(mVMediaTicketReceiptContent.frontUrl);
                gVar.mo61712y();
            }
            if (mVMediaTicketReceiptContent.backUrl != null && mVMediaTicketReceiptContent.mo32439f()) {
                gVar.mo61711x(MVMediaTicketReceiptContent.f28742c);
                gVar.mo61686J(mVMediaTicketReceiptContent.backUrl);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMediaTicketReceiptContent mVMediaTicketReceiptContent = (MVMediaTicketReceiptContent) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMediaTicketReceiptContent.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVMediaTicketReceiptContent.backUrl = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMediaTicketReceiptContent.frontUrl = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVMediaTicketReceiptContent$b */
    public static class C10824b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10823a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVMediaTicketReceiptContent$c */
    public static class C10825c extends C25240d<MVMediaTicketReceiptContent> {
        public C10825c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMediaTicketReceiptContent mVMediaTicketReceiptContent = (MVMediaTicketReceiptContent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMediaTicketReceiptContent.mo32440g()) {
                bitSet.set(0);
            }
            if (mVMediaTicketReceiptContent.mo32439f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVMediaTicketReceiptContent.mo32440g()) {
                jVar.mo61686J(mVMediaTicketReceiptContent.frontUrl);
            }
            if (mVMediaTicketReceiptContent.mo32439f()) {
                jVar.mo61686J(mVMediaTicketReceiptContent.backUrl);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMediaTicketReceiptContent mVMediaTicketReceiptContent = (MVMediaTicketReceiptContent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVMediaTicketReceiptContent.frontUrl = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVMediaTicketReceiptContent.backUrl = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVMediaTicketReceiptContent$d */
    public static class C10826d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10825c(0);
        }
    }

    static {
        new C17394d0("MVMediaTicketReceiptContent");
        HashMap hashMap = new HashMap();
        f28743d = hashMap;
        hashMap.put(C25239c.class, new C10824b());
        hashMap.put(C25240d.class, new C10826d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FRONT_URL, new FieldMetaData("frontUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BACK_URL, new FieldMetaData("backUrl", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28744e = unmodifiableMap;
        FieldMetaData.m61947a(MVMediaTicketReceiptContent.class, unmodifiableMap);
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
        ((C25238b) f28743d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28743d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo32436a(MVMediaTicketReceiptContent mVMediaTicketReceiptContent) {
        if (mVMediaTicketReceiptContent == null) {
            return false;
        }
        boolean g = mo32440g();
        boolean g2 = mVMediaTicketReceiptContent.mo32440g();
        if ((g || g2) && (!g || !g2 || !this.frontUrl.equals(mVMediaTicketReceiptContent.frontUrl))) {
            return false;
        }
        boolean f = mo32439f();
        boolean f2 = mVMediaTicketReceiptContent.mo32439f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.backUrl.equals(mVMediaTicketReceiptContent.backUrl)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMediaTicketReceiptContent mVMediaTicketReceiptContent = (MVMediaTicketReceiptContent) obj;
        if (!getClass().equals(mVMediaTicketReceiptContent.getClass())) {
            return getClass().getName().compareTo(mVMediaTicketReceiptContent.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32440g()).compareTo(Boolean.valueOf(mVMediaTicketReceiptContent.mo32440g()));
        if (compareTo2 != 0 || ((mo32440g() && (compareTo2 = this.frontUrl.compareTo(mVMediaTicketReceiptContent.frontUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo32439f()).compareTo(Boolean.valueOf(mVMediaTicketReceiptContent.mo32439f()))) != 0)) {
            return compareTo2;
        }
        if (!mo32439f() || (compareTo = this.backUrl.compareTo(mVMediaTicketReceiptContent.backUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMediaTicketReceiptContent)) {
            return mo32436a((MVMediaTicketReceiptContent) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32439f() {
        return this.backUrl != null;
    }

    /* renamed from: g */
    public final boolean mo32440g() {
        return this.frontUrl != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMediaTicketReceiptContent(", "frontUrl:");
        String str = this.frontUrl;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo32439f()) {
            n.append(", ");
            n.append("backUrl:");
            String str2 = this.backUrl;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
