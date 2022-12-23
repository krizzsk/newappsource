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

public class MVGetWebInstructionsResponse implements TBase<MVGetWebInstructionsResponse, _Fields>, Serializable, Cloneable, Comparable<MVGetWebInstructionsResponse> {

    /* renamed from: b */
    public static final C25113c f27307b = new C25113c("url", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27308c = new C25113c("returnUrls", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f27309d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27310e;
    public MVTokenizeReturnUrls returnUrls;
    public String url;

    public enum _Fields implements C25085c {
        URL(1, "url"),
        RETURN_URLS(2, "returnUrls");
        
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
                return URL;
            }
            if (i != 2) {
                return null;
            }
            return RETURN_URLS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetWebInstructionsResponse$a */
    public static class C9785a extends C25239c<MVGetWebInstructionsResponse> {
        public C9785a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetWebInstructionsResponse mVGetWebInstructionsResponse = (MVGetWebInstructionsResponse) tBase;
            MVTokenizeReturnUrls mVTokenizeReturnUrls = mVGetWebInstructionsResponse.returnUrls;
            C25113c cVar = MVGetWebInstructionsResponse.f27307b;
            gVar.mo61687K();
            if (mVGetWebInstructionsResponse.url != null) {
                gVar.mo61711x(MVGetWebInstructionsResponse.f27307b);
                gVar.mo61686J(mVGetWebInstructionsResponse.url);
                gVar.mo61712y();
            }
            if (mVGetWebInstructionsResponse.returnUrls != null) {
                gVar.mo61711x(MVGetWebInstructionsResponse.f27308c);
                mVGetWebInstructionsResponse.returnUrls.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetWebInstructionsResponse mVGetWebInstructionsResponse = (MVGetWebInstructionsResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTokenizeReturnUrls mVTokenizeReturnUrls = mVGetWebInstructionsResponse.returnUrls;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVTokenizeReturnUrls mVTokenizeReturnUrls2 = new MVTokenizeReturnUrls();
                        mVGetWebInstructionsResponse.returnUrls = mVTokenizeReturnUrls2;
                        mVTokenizeReturnUrls2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVGetWebInstructionsResponse.url = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetWebInstructionsResponse$b */
    public static class C9786b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9785a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetWebInstructionsResponse$c */
    public static class C9787c extends C25240d<MVGetWebInstructionsResponse> {
        public C9787c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetWebInstructionsResponse mVGetWebInstructionsResponse = (MVGetWebInstructionsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetWebInstructionsResponse.mo29942g()) {
                bitSet.set(0);
            }
            if (mVGetWebInstructionsResponse.mo29941f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVGetWebInstructionsResponse.mo29942g()) {
                jVar.mo61686J(mVGetWebInstructionsResponse.url);
            }
            if (mVGetWebInstructionsResponse.mo29941f()) {
                mVGetWebInstructionsResponse.returnUrls.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetWebInstructionsResponse mVGetWebInstructionsResponse = (MVGetWebInstructionsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVGetWebInstructionsResponse.url = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls();
                mVGetWebInstructionsResponse.returnUrls = mVTokenizeReturnUrls;
                mVTokenizeReturnUrls.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetWebInstructionsResponse$d */
    public static class C9788d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9787c(0);
        }
    }

    static {
        new C17394d0("MVGetWebInstructionsResponse");
        HashMap hashMap = new HashMap();
        f27309d = hashMap;
        hashMap.put(C25239c.class, new C9786b());
        hashMap.put(C25240d.class, new C9788d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.URL, new FieldMetaData("url", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RETURN_URLS, new FieldMetaData("returnUrls", (byte) 3, new StructMetaData(MVTokenizeReturnUrls.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27310e = unmodifiableMap;
        FieldMetaData.m61947a(MVGetWebInstructionsResponse.class, unmodifiableMap);
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
        ((C25238b) f27309d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27309d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGetWebInstructionsResponse mVGetWebInstructionsResponse = (MVGetWebInstructionsResponse) obj;
        if (!getClass().equals(mVGetWebInstructionsResponse.getClass())) {
            return getClass().getName().compareTo(mVGetWebInstructionsResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29942g()).compareTo(Boolean.valueOf(mVGetWebInstructionsResponse.mo29942g()));
        if (compareTo2 != 0 || ((mo29942g() && (compareTo2 = this.url.compareTo(mVGetWebInstructionsResponse.url)) != 0) || (compareTo2 = Boolean.valueOf(mo29941f()).compareTo(Boolean.valueOf(mVGetWebInstructionsResponse.mo29941f()))) != 0)) {
            return compareTo2;
        }
        if (!mo29941f() || (compareTo = this.returnUrls.compareTo(mVGetWebInstructionsResponse.returnUrls)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetWebInstructionsResponse)) {
            return false;
        }
        MVGetWebInstructionsResponse mVGetWebInstructionsResponse = (MVGetWebInstructionsResponse) obj;
        boolean g = mo29942g();
        boolean g2 = mVGetWebInstructionsResponse.mo29942g();
        if ((g || g2) && (!g || !g2 || !this.url.equals(mVGetWebInstructionsResponse.url))) {
            return false;
        }
        boolean f = mo29941f();
        boolean f2 = mVGetWebInstructionsResponse.mo29941f();
        if ((f || f2) && (!f || !f2 || !this.returnUrls.mo30695a(mVGetWebInstructionsResponse.returnUrls))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29941f() {
        return this.returnUrls != null;
    }

    /* renamed from: g */
    public final boolean mo29942g() {
        return this.url != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetWebInstructionsResponse(", "url:");
        String str = this.url;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("returnUrls:");
        MVTokenizeReturnUrls mVTokenizeReturnUrls = this.returnUrls;
        if (mVTokenizeReturnUrls == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTokenizeReturnUrls);
        }
        n.append(")");
        return n.toString();
    }
}
