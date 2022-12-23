package com.tranzmate.moovit.protocol.transitcardalert;

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

public class MVTopUpStateResponse implements TBase<MVTopUpStateResponse, _Fields>, Serializable, Cloneable, Comparable<MVTopUpStateResponse> {

    /* renamed from: b */
    public static final C25113c f29815b = new C25113c("defaultURI", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29816c = new C25113c("cardsInformation", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f29817d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29818e;
    public MVUserDataSummaryResponse cardsInformation;
    public String defaultURI;
    private _Fields[] optionals = {_Fields.CARDS_INFORMATION};

    public enum _Fields implements C25085c {
        DEFAULT_URI(1, "defaultURI"),
        CARDS_INFORMATION(2, "cardsInformation");
        
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
                return DEFAULT_URI;
            }
            if (i != 2) {
                return null;
            }
            return CARDS_INFORMATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.transitcardalert.MVTopUpStateResponse$a */
    public static class C11489a extends C25239c<MVTopUpStateResponse> {
        public C11489a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTopUpStateResponse mVTopUpStateResponse = (MVTopUpStateResponse) tBase;
            MVUserDataSummaryResponse mVUserDataSummaryResponse = mVTopUpStateResponse.cardsInformation;
            C25113c cVar = MVTopUpStateResponse.f29815b;
            gVar.mo61687K();
            if (mVTopUpStateResponse.defaultURI != null) {
                gVar.mo61711x(MVTopUpStateResponse.f29815b);
                gVar.mo61686J(mVTopUpStateResponse.defaultURI);
                gVar.mo61712y();
            }
            if (mVTopUpStateResponse.cardsInformation != null && mVTopUpStateResponse.mo34133f()) {
                gVar.mo61711x(MVTopUpStateResponse.f29816c);
                mVTopUpStateResponse.cardsInformation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTopUpStateResponse mVTopUpStateResponse = (MVTopUpStateResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVUserDataSummaryResponse mVUserDataSummaryResponse = mVTopUpStateResponse.cardsInformation;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVUserDataSummaryResponse mVUserDataSummaryResponse2 = new MVUserDataSummaryResponse();
                        mVTopUpStateResponse.cardsInformation = mVUserDataSummaryResponse2;
                        mVUserDataSummaryResponse2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTopUpStateResponse.defaultURI = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.transitcardalert.MVTopUpStateResponse$b */
    public static class C11490b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11489a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.transitcardalert.MVTopUpStateResponse$c */
    public static class C11491c extends C25240d<MVTopUpStateResponse> {
        public C11491c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTopUpStateResponse mVTopUpStateResponse = (MVTopUpStateResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTopUpStateResponse.mo34134g()) {
                bitSet.set(0);
            }
            if (mVTopUpStateResponse.mo34133f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTopUpStateResponse.mo34134g()) {
                jVar.mo61686J(mVTopUpStateResponse.defaultURI);
            }
            if (mVTopUpStateResponse.mo34133f()) {
                mVTopUpStateResponse.cardsInformation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTopUpStateResponse mVTopUpStateResponse = (MVTopUpStateResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTopUpStateResponse.defaultURI = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVUserDataSummaryResponse mVUserDataSummaryResponse = new MVUserDataSummaryResponse();
                mVTopUpStateResponse.cardsInformation = mVUserDataSummaryResponse;
                mVUserDataSummaryResponse.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.transitcardalert.MVTopUpStateResponse$d */
    public static class C11492d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11491c(0);
        }
    }

    static {
        new C17394d0("MVTopUpStateResponse");
        HashMap hashMap = new HashMap();
        f29817d = hashMap;
        hashMap.put(C25239c.class, new C11490b());
        hashMap.put(C25240d.class, new C11492d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DEFAULT_URI, new FieldMetaData("defaultURI", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CARDS_INFORMATION, new FieldMetaData("cardsInformation", (byte) 2, new StructMetaData(MVUserDataSummaryResponse.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29818e = unmodifiableMap;
        FieldMetaData.m61947a(MVTopUpStateResponse.class, unmodifiableMap);
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
        ((C25238b) f29817d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29817d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTopUpStateResponse mVTopUpStateResponse = (MVTopUpStateResponse) obj;
        if (!getClass().equals(mVTopUpStateResponse.getClass())) {
            return getClass().getName().compareTo(mVTopUpStateResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34134g()).compareTo(Boolean.valueOf(mVTopUpStateResponse.mo34134g()));
        if (compareTo2 != 0 || ((mo34134g() && (compareTo2 = this.defaultURI.compareTo(mVTopUpStateResponse.defaultURI)) != 0) || (compareTo2 = Boolean.valueOf(mo34133f()).compareTo(Boolean.valueOf(mVTopUpStateResponse.mo34133f()))) != 0)) {
            return compareTo2;
        }
        if (!mo34133f() || (compareTo = this.cardsInformation.compareTo(mVTopUpStateResponse.cardsInformation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTopUpStateResponse)) {
            return false;
        }
        MVTopUpStateResponse mVTopUpStateResponse = (MVTopUpStateResponse) obj;
        boolean g = mo34134g();
        boolean g2 = mVTopUpStateResponse.mo34134g();
        if ((g || g2) && (!g || !g2 || !this.defaultURI.equals(mVTopUpStateResponse.defaultURI))) {
            return false;
        }
        boolean f = mo34133f();
        boolean f2 = mVTopUpStateResponse.mo34133f();
        if ((f || f2) && (!f || !f2 || !this.cardsInformation.mo34138a(mVTopUpStateResponse.cardsInformation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34133f() {
        return this.cardsInformation != null;
    }

    /* renamed from: g */
    public final boolean mo34134g() {
        return this.defaultURI != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTopUpStateResponse(", "defaultURI:");
        String str = this.defaultURI;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo34133f()) {
            n.append(", ");
            n.append("cardsInformation:");
            MVUserDataSummaryResponse mVUserDataSummaryResponse = this.cardsInformation;
            if (mVUserDataSummaryResponse == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVUserDataSummaryResponse);
            }
        }
        n.append(")");
        return n.toString();
    }
}
