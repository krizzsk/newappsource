package com.tranzmate.moovit.protocol.Reports4_0;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVEntityIdentifier;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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

public class MVCreateReportRequest implements TBase<MVCreateReportRequest, _Fields>, Serializable, Cloneable, Comparable<MVCreateReportRequest> {

    /* renamed from: b */
    public static final C25113c f24523b = new C25113c("entityId", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24524c = new C25113c("data", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24525d = new C25113c("reportLocationLatLon", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f24526e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f24527f;
    public MVReportCreationData data;
    public MVEntityIdentifier entityId;
    public MVLatLon reportLocationLatLon;

    public enum _Fields implements C25085c {
        ENTITY_ID(1, "entityId"),
        DATA(2, "data"),
        REPORT_LOCATION_LAT_LON(3, "reportLocationLatLon");
        
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
                return ENTITY_ID;
            }
            if (i == 2) {
                return DATA;
            }
            if (i != 3) {
                return null;
            }
            return REPORT_LOCATION_LAT_LON;
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

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVCreateReportRequest$a */
    public static class C8073a extends C25239c<MVCreateReportRequest> {
        public C8073a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCreateReportRequest mVCreateReportRequest = (MVCreateReportRequest) tBase;
            mVCreateReportRequest.mo25255i();
            C25113c cVar = MVCreateReportRequest.f24523b;
            gVar.mo61687K();
            if (mVCreateReportRequest.entityId != null) {
                gVar.mo61711x(MVCreateReportRequest.f24523b);
                mVCreateReportRequest.entityId.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCreateReportRequest.data != null) {
                gVar.mo61711x(MVCreateReportRequest.f24524c);
                mVCreateReportRequest.data.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCreateReportRequest.reportLocationLatLon != null) {
                gVar.mo61711x(MVCreateReportRequest.f24525d);
                mVCreateReportRequest.reportLocationLatLon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCreateReportRequest mVCreateReportRequest = (MVCreateReportRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCreateReportRequest.mo25255i();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVLatLon mVLatLon = new MVLatLon();
                            mVCreateReportRequest.reportLocationLatLon = mVLatLon;
                            mVLatLon.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVReportCreationData mVReportCreationData = new MVReportCreationData();
                        mVCreateReportRequest.data = mVReportCreationData;
                        mVReportCreationData.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVEntityIdentifier mVEntityIdentifier = new MVEntityIdentifier();
                    mVCreateReportRequest.entityId = mVEntityIdentifier;
                    mVEntityIdentifier.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVCreateReportRequest$b */
    public static class C8074b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8073a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVCreateReportRequest$c */
    public static class C8075c extends C25240d<MVCreateReportRequest> {
        public C8075c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCreateReportRequest mVCreateReportRequest = (MVCreateReportRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCreateReportRequest.mo25252g()) {
                bitSet.set(0);
            }
            if (mVCreateReportRequest.mo25251f()) {
                bitSet.set(1);
            }
            if (mVCreateReportRequest.mo25253h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVCreateReportRequest.mo25252g()) {
                mVCreateReportRequest.entityId.mo25202X0(jVar);
            }
            if (mVCreateReportRequest.mo25251f()) {
                mVCreateReportRequest.data.mo25202X0(jVar);
            }
            if (mVCreateReportRequest.mo25253h()) {
                mVCreateReportRequest.reportLocationLatLon.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCreateReportRequest mVCreateReportRequest = (MVCreateReportRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVEntityIdentifier mVEntityIdentifier = new MVEntityIdentifier();
                mVCreateReportRequest.entityId = mVEntityIdentifier;
                mVEntityIdentifier.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVReportCreationData mVReportCreationData = new MVReportCreationData();
                mVCreateReportRequest.data = mVReportCreationData;
                mVReportCreationData.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVCreateReportRequest.reportLocationLatLon = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVCreateReportRequest$d */
    public static class C8076d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8075c(0);
        }
    }

    static {
        new C17394d0("MVCreateReportRequest");
        HashMap hashMap = new HashMap();
        f24526e = hashMap;
        hashMap.put(C25239c.class, new C8074b());
        hashMap.put(C25240d.class, new C8076d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ENTITY_ID, new FieldMetaData("entityId", (byte) 3, new StructMetaData(MVEntityIdentifier.class)));
        enumMap.put(_Fields.DATA, new FieldMetaData("data", (byte) 3, new StructMetaData(MVReportCreationData.class)));
        enumMap.put(_Fields.REPORT_LOCATION_LAT_LON, new FieldMetaData("reportLocationLatLon", (byte) 3, new StructMetaData(MVLatLon.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24527f = unmodifiableMap;
        FieldMetaData.m61947a(MVCreateReportRequest.class, unmodifiableMap);
    }

    public MVCreateReportRequest() {
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
        ((C25238b) f24526e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24526e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25248a(MVCreateReportRequest mVCreateReportRequest) {
        if (mVCreateReportRequest == null) {
            return false;
        }
        boolean g = mo25252g();
        boolean g2 = mVCreateReportRequest.mo25252g();
        if ((g || g2) && (!g || !g2 || !this.entityId.mo26136a(mVCreateReportRequest.entityId))) {
            return false;
        }
        boolean f = mo25251f();
        boolean f2 = mVCreateReportRequest.mo25251f();
        if ((f || f2) && (!f || !f2 || !this.data.mo25294a(mVCreateReportRequest.data))) {
            return false;
        }
        boolean h = mo25253h();
        boolean h2 = mVCreateReportRequest.mo25253h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || !this.reportLocationLatLon.mo26290a(mVCreateReportRequest.reportLocationLatLon)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCreateReportRequest mVCreateReportRequest = (MVCreateReportRequest) obj;
        if (!getClass().equals(mVCreateReportRequest.getClass())) {
            return getClass().getName().compareTo(mVCreateReportRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25252g()).compareTo(Boolean.valueOf(mVCreateReportRequest.mo25252g()));
        if (compareTo2 != 0 || ((mo25252g() && (compareTo2 = this.entityId.compareTo(mVCreateReportRequest.entityId)) != 0) || (compareTo2 = Boolean.valueOf(mo25251f()).compareTo(Boolean.valueOf(mVCreateReportRequest.mo25251f()))) != 0 || ((mo25251f() && (compareTo2 = this.data.compareTo(mVCreateReportRequest.data)) != 0) || (compareTo2 = Boolean.valueOf(mo25253h()).compareTo(Boolean.valueOf(mVCreateReportRequest.mo25253h()))) != 0))) {
            return compareTo2;
        }
        if (!mo25253h() || (compareTo = this.reportLocationLatLon.compareTo(mVCreateReportRequest.reportLocationLatLon)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVCreateReportRequest)) {
            return mo25248a((MVCreateReportRequest) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25251f() {
        return this.data != null;
    }

    /* renamed from: g */
    public final boolean mo25252g() {
        return this.entityId != null;
    }

    /* renamed from: h */
    public final boolean mo25253h() {
        return this.reportLocationLatLon != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo25255i() throws TException {
        MVEntityIdentifier mVEntityIdentifier = this.entityId;
        if (mVEntityIdentifier != null) {
            mVEntityIdentifier.getClass();
        }
        MVReportCreationData mVReportCreationData = this.data;
        if (mVReportCreationData != null) {
            mVReportCreationData.getClass();
        }
        MVLatLon mVLatLon = this.reportLocationLatLon;
        if (mVLatLon != null) {
            mVLatLon.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCreateReportRequest(", "entityId:");
        MVEntityIdentifier mVEntityIdentifier = this.entityId;
        if (mVEntityIdentifier == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVEntityIdentifier);
        }
        n.append(", ");
        n.append("data:");
        MVReportCreationData mVReportCreationData = this.data;
        if (mVReportCreationData == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVReportCreationData);
        }
        n.append(", ");
        n.append("reportLocationLatLon:");
        MVLatLon mVLatLon = this.reportLocationLatLon;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(")");
        return n.toString();
    }

    public MVCreateReportRequest(MVEntityIdentifier mVEntityIdentifier, MVReportCreationData mVReportCreationData, MVLatLon mVLatLon) {
        this();
        this.entityId = mVEntityIdentifier;
        this.data = mVReportCreationData;
        this.reportLocationLatLon = mVLatLon;
    }
}
