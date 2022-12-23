package com.tranzmate.moovit.protocol.Reports4_0;

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

public class MVDeleteReportsRequest implements TBase<MVDeleteReportsRequest, _Fields>, Serializable, Cloneable, Comparable<MVDeleteReportsRequest> {

    /* renamed from: b */
    public static final C25113c f24528b = new C25113c("reportId", (byte) 11, 1);

    /* renamed from: c */
    public static final HashMap f24529c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f24530d;
    public String reportId;

    public enum _Fields implements C25085c {
        REPORT_ID(1, "reportId");
        
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
            return REPORT_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVDeleteReportsRequest$a */
    public static class C8077a extends C25239c<MVDeleteReportsRequest> {
        public C8077a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDeleteReportsRequest mVDeleteReportsRequest = (MVDeleteReportsRequest) tBase;
            mVDeleteReportsRequest.getClass();
            C25113c cVar = MVDeleteReportsRequest.f24528b;
            gVar.mo61687K();
            if (mVDeleteReportsRequest.reportId != null) {
                gVar.mo61711x(MVDeleteReportsRequest.f24528b);
                gVar.mo61686J(mVDeleteReportsRequest.reportId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDeleteReportsRequest mVDeleteReportsRequest = (MVDeleteReportsRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDeleteReportsRequest.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 11) {
                    mVDeleteReportsRequest.reportId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVDeleteReportsRequest$b */
    public static class C8078b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8077a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVDeleteReportsRequest$c */
    public static class C8079c extends C25240d<MVDeleteReportsRequest> {
        public C8079c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDeleteReportsRequest mVDeleteReportsRequest = (MVDeleteReportsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDeleteReportsRequest.mo25260f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVDeleteReportsRequest.mo25260f()) {
                jVar.mo61686J(mVDeleteReportsRequest.reportId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDeleteReportsRequest mVDeleteReportsRequest = (MVDeleteReportsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVDeleteReportsRequest.reportId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVDeleteReportsRequest$d */
    public static class C8080d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8079c(0);
        }
    }

    static {
        new C17394d0("MVDeleteReportsRequest");
        HashMap hashMap = new HashMap();
        f24529c = hashMap;
        hashMap.put(C25239c.class, new C8078b());
        hashMap.put(C25240d.class, new C8080d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REPORT_ID, new FieldMetaData("reportId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24530d = unmodifiableMap;
        FieldMetaData.m61947a(MVDeleteReportsRequest.class, unmodifiableMap);
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
        ((C25238b) f24529c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24529c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVDeleteReportsRequest mVDeleteReportsRequest = (MVDeleteReportsRequest) obj;
        if (!getClass().equals(mVDeleteReportsRequest.getClass())) {
            return getClass().getName().compareTo(mVDeleteReportsRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25260f()).compareTo(Boolean.valueOf(mVDeleteReportsRequest.mo25260f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo25260f() || (compareTo = this.reportId.compareTo(mVDeleteReportsRequest.reportId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDeleteReportsRequest)) {
            return false;
        }
        MVDeleteReportsRequest mVDeleteReportsRequest = (MVDeleteReportsRequest) obj;
        boolean f = mo25260f();
        boolean f2 = mVDeleteReportsRequest.mo25260f();
        if ((f || f2) && (!f || !f2 || !this.reportId.equals(mVDeleteReportsRequest.reportId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25260f() {
        return this.reportId != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDeleteReportsRequest(", "reportId:");
        String str = this.reportId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
