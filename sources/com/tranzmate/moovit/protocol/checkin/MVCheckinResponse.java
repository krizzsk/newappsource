package com.tranzmate.moovit.protocol.checkin;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.gtfs.MVSupplementalData;
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

public class MVCheckinResponse implements TBase<MVCheckinResponse, _Fields>, Serializable, Cloneable, Comparable<MVCheckinResponse> {

    /* renamed from: b */
    public static final C25113c f24941b = new C25113c("checkin", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24942c = new C25113c("supplementalData", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f24943d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f24944e;
    public MVCheckin checkin;
    public MVSupplementalData supplementalData;

    public enum _Fields implements C25085c {
        CHECKIN(1, "checkin"),
        SUPPLEMENTAL_DATA(2, "supplementalData");
        
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
                return CHECKIN;
            }
            if (i != 2) {
                return null;
            }
            return SUPPLEMENTAL_DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVCheckinResponse$a */
    public static class C8348a extends C25239c<MVCheckinResponse> {
        public C8348a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCheckinResponse mVCheckinResponse = (MVCheckinResponse) tBase;
            MVCheckin mVCheckin = mVCheckinResponse.checkin;
            C25113c cVar = MVCheckinResponse.f24941b;
            gVar.mo61687K();
            if (mVCheckinResponse.checkin != null) {
                gVar.mo61711x(MVCheckinResponse.f24941b);
                mVCheckinResponse.checkin.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCheckinResponse.supplementalData != null) {
                gVar.mo61711x(MVCheckinResponse.f24942c);
                mVCheckinResponse.supplementalData.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCheckinResponse mVCheckinResponse = (MVCheckinResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCheckin mVCheckin = mVCheckinResponse.checkin;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVSupplementalData mVSupplementalData = new MVSupplementalData();
                        mVCheckinResponse.supplementalData = mVSupplementalData;
                        mVSupplementalData.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCheckin mVCheckin2 = new MVCheckin();
                    mVCheckinResponse.checkin = mVCheckin2;
                    mVCheckin2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVCheckinResponse$b */
    public static class C8349b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8348a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVCheckinResponse$c */
    public static class C8350c extends C25240d<MVCheckinResponse> {
        public C8350c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCheckinResponse mVCheckinResponse = (MVCheckinResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCheckinResponse.mo26016f()) {
                bitSet.set(0);
            }
            if (mVCheckinResponse.mo26017g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVCheckinResponse.mo26016f()) {
                mVCheckinResponse.checkin.mo25202X0(jVar);
            }
            if (mVCheckinResponse.mo26017g()) {
                mVCheckinResponse.supplementalData.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCheckinResponse mVCheckinResponse = (MVCheckinResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVCheckin mVCheckin = new MVCheckin();
                mVCheckinResponse.checkin = mVCheckin;
                mVCheckin.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVSupplementalData mVSupplementalData = new MVSupplementalData();
                mVCheckinResponse.supplementalData = mVSupplementalData;
                mVSupplementalData.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVCheckinResponse$d */
    public static class C8351d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8350c(0);
        }
    }

    static {
        new C17394d0("MVCheckinResponse");
        HashMap hashMap = new HashMap();
        f24943d = hashMap;
        hashMap.put(C25239c.class, new C8349b());
        hashMap.put(C25240d.class, new C8351d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CHECKIN, new FieldMetaData("checkin", (byte) 3, new StructMetaData(MVCheckin.class)));
        enumMap.put(_Fields.SUPPLEMENTAL_DATA, new FieldMetaData("supplementalData", (byte) 3, new StructMetaData(MVSupplementalData.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24944e = unmodifiableMap;
        FieldMetaData.m61947a(MVCheckinResponse.class, unmodifiableMap);
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
        ((C25238b) f24943d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24943d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCheckinResponse mVCheckinResponse = (MVCheckinResponse) obj;
        if (!getClass().equals(mVCheckinResponse.getClass())) {
            return getClass().getName().compareTo(mVCheckinResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26016f()).compareTo(Boolean.valueOf(mVCheckinResponse.mo26016f()));
        if (compareTo2 != 0 || ((mo26016f() && (compareTo2 = this.checkin.compareTo(mVCheckinResponse.checkin)) != 0) || (compareTo2 = Boolean.valueOf(mo26017g()).compareTo(Boolean.valueOf(mVCheckinResponse.mo26017g()))) != 0)) {
            return compareTo2;
        }
        if (!mo26017g() || (compareTo = this.supplementalData.compareTo(mVCheckinResponse.supplementalData)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCheckinResponse)) {
            return false;
        }
        MVCheckinResponse mVCheckinResponse = (MVCheckinResponse) obj;
        boolean f = mo26016f();
        boolean f2 = mVCheckinResponse.mo26016f();
        if ((f || f2) && (!f || !f2 || !this.checkin.mo25979a(mVCheckinResponse.checkin))) {
            return false;
        }
        boolean g = mo26017g();
        boolean g2 = mVCheckinResponse.mo26017g();
        if ((g || g2) && (!g || !g2 || !this.supplementalData.mo27542a(mVCheckinResponse.supplementalData))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26016f() {
        return this.checkin != null;
    }

    /* renamed from: g */
    public final boolean mo26017g() {
        return this.supplementalData != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCheckinResponse(", "checkin:");
        MVCheckin mVCheckin = this.checkin;
        if (mVCheckin == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCheckin);
        }
        n.append(", ");
        n.append("supplementalData:");
        MVSupplementalData mVSupplementalData = this.supplementalData;
        if (mVSupplementalData == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSupplementalData);
        }
        n.append(")");
        return n.toString();
    }
}
