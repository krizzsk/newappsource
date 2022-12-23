package com.tranzmate.moovit.protocol.Reports4_0;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVEntityIdentifier;
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

public class MVGetUserReportsAndAlertsRequest implements TBase<MVGetUserReportsAndAlertsRequest, _Fields>, Serializable, Cloneable, Comparable<MVGetUserReportsAndAlertsRequest> {

    /* renamed from: b */
    public static final C25113c f24534b = new C25113c("entityId", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24535c = new C25113c("maxResults", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f24536d = new C25113c("nextPageIdToRetrieve", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f24537e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f24538f;
    private byte __isset_bitfield = 0;
    public MVEntityIdentifier entityId;
    public int maxResults;
    public String nextPageIdToRetrieve;
    private _Fields[] optionals = {_Fields.NEXT_PAGE_ID_TO_RETRIEVE};

    public enum _Fields implements C25085c {
        ENTITY_ID(1, "entityId"),
        MAX_RESULTS(2, "maxResults"),
        NEXT_PAGE_ID_TO_RETRIEVE(3, "nextPageIdToRetrieve");
        
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
                return MAX_RESULTS;
            }
            if (i != 3) {
                return null;
            }
            return NEXT_PAGE_ID_TO_RETRIEVE;
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

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVGetUserReportsAndAlertsRequest$a */
    public static class C8085a extends C25239c<MVGetUserReportsAndAlertsRequest> {
        public C8085a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetUserReportsAndAlertsRequest mVGetUserReportsAndAlertsRequest = (MVGetUserReportsAndAlertsRequest) tBase;
            MVEntityIdentifier mVEntityIdentifier = mVGetUserReportsAndAlertsRequest.entityId;
            C25113c cVar = MVGetUserReportsAndAlertsRequest.f24534b;
            gVar.mo61687K();
            if (mVGetUserReportsAndAlertsRequest.entityId != null) {
                gVar.mo61711x(MVGetUserReportsAndAlertsRequest.f24534b);
                mVGetUserReportsAndAlertsRequest.entityId.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVGetUserReportsAndAlertsRequest.f24535c);
            gVar.mo61678B(mVGetUserReportsAndAlertsRequest.maxResults);
            gVar.mo61712y();
            if (mVGetUserReportsAndAlertsRequest.nextPageIdToRetrieve != null && mVGetUserReportsAndAlertsRequest.mo25274h()) {
                gVar.mo61711x(MVGetUserReportsAndAlertsRequest.f24536d);
                gVar.mo61686J(mVGetUserReportsAndAlertsRequest.nextPageIdToRetrieve);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetUserReportsAndAlertsRequest mVGetUserReportsAndAlertsRequest = (MVGetUserReportsAndAlertsRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVEntityIdentifier mVEntityIdentifier = mVGetUserReportsAndAlertsRequest.entityId;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVGetUserReportsAndAlertsRequest.nextPageIdToRetrieve = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVGetUserReportsAndAlertsRequest.maxResults = gVar.mo61696i();
                        mVGetUserReportsAndAlertsRequest.mo25276i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVEntityIdentifier mVEntityIdentifier2 = new MVEntityIdentifier();
                    mVGetUserReportsAndAlertsRequest.entityId = mVEntityIdentifier2;
                    mVEntityIdentifier2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVGetUserReportsAndAlertsRequest$b */
    public static class C8086b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8085a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVGetUserReportsAndAlertsRequest$c */
    public static class C8087c extends C25240d<MVGetUserReportsAndAlertsRequest> {
        public C8087c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetUserReportsAndAlertsRequest mVGetUserReportsAndAlertsRequest = (MVGetUserReportsAndAlertsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetUserReportsAndAlertsRequest.mo25272f()) {
                bitSet.set(0);
            }
            if (mVGetUserReportsAndAlertsRequest.mo25273g()) {
                bitSet.set(1);
            }
            if (mVGetUserReportsAndAlertsRequest.mo25274h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVGetUserReportsAndAlertsRequest.mo25272f()) {
                mVGetUserReportsAndAlertsRequest.entityId.mo25202X0(jVar);
            }
            if (mVGetUserReportsAndAlertsRequest.mo25273g()) {
                jVar.mo61678B(mVGetUserReportsAndAlertsRequest.maxResults);
            }
            if (mVGetUserReportsAndAlertsRequest.mo25274h()) {
                jVar.mo61686J(mVGetUserReportsAndAlertsRequest.nextPageIdToRetrieve);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetUserReportsAndAlertsRequest mVGetUserReportsAndAlertsRequest = (MVGetUserReportsAndAlertsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVEntityIdentifier mVEntityIdentifier = new MVEntityIdentifier();
                mVGetUserReportsAndAlertsRequest.entityId = mVEntityIdentifier;
                mVEntityIdentifier.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVGetUserReportsAndAlertsRequest.maxResults = jVar.mo61696i();
                mVGetUserReportsAndAlertsRequest.mo25276i();
            }
            if (T.get(2)) {
                mVGetUserReportsAndAlertsRequest.nextPageIdToRetrieve = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVGetUserReportsAndAlertsRequest$d */
    public static class C8088d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8087c(0);
        }
    }

    static {
        new C17394d0("MVGetUserReportsAndAlertsRequest");
        HashMap hashMap = new HashMap();
        f24537e = hashMap;
        hashMap.put(C25239c.class, new C8086b());
        hashMap.put(C25240d.class, new C8088d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ENTITY_ID, new FieldMetaData("entityId", (byte) 3, new StructMetaData(MVEntityIdentifier.class)));
        enumMap.put(_Fields.MAX_RESULTS, new FieldMetaData("maxResults", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NEXT_PAGE_ID_TO_RETRIEVE, new FieldMetaData("nextPageIdToRetrieve", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24538f = unmodifiableMap;
        FieldMetaData.m61947a(MVGetUserReportsAndAlertsRequest.class, unmodifiableMap);
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
        ((C25238b) f24537e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24537e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGetUserReportsAndAlertsRequest mVGetUserReportsAndAlertsRequest = (MVGetUserReportsAndAlertsRequest) obj;
        if (!getClass().equals(mVGetUserReportsAndAlertsRequest.getClass())) {
            return getClass().getName().compareTo(mVGetUserReportsAndAlertsRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25272f()).compareTo(Boolean.valueOf(mVGetUserReportsAndAlertsRequest.mo25272f()));
        if (compareTo2 != 0 || ((mo25272f() && (compareTo2 = this.entityId.compareTo(mVGetUserReportsAndAlertsRequest.entityId)) != 0) || (compareTo2 = Boolean.valueOf(mo25273g()).compareTo(Boolean.valueOf(mVGetUserReportsAndAlertsRequest.mo25273g()))) != 0 || ((mo25273g() && (compareTo2 = C25082a.m62839c(this.maxResults, mVGetUserReportsAndAlertsRequest.maxResults)) != 0) || (compareTo2 = Boolean.valueOf(mo25274h()).compareTo(Boolean.valueOf(mVGetUserReportsAndAlertsRequest.mo25274h()))) != 0))) {
            return compareTo2;
        }
        if (!mo25274h() || (compareTo = this.nextPageIdToRetrieve.compareTo(mVGetUserReportsAndAlertsRequest.nextPageIdToRetrieve)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetUserReportsAndAlertsRequest)) {
            return false;
        }
        MVGetUserReportsAndAlertsRequest mVGetUserReportsAndAlertsRequest = (MVGetUserReportsAndAlertsRequest) obj;
        boolean f = mo25272f();
        boolean f2 = mVGetUserReportsAndAlertsRequest.mo25272f();
        if (((f || f2) && (!f || !f2 || !this.entityId.mo26136a(mVGetUserReportsAndAlertsRequest.entityId))) || this.maxResults != mVGetUserReportsAndAlertsRequest.maxResults) {
            return false;
        }
        boolean h = mo25274h();
        boolean h2 = mVGetUserReportsAndAlertsRequest.mo25274h();
        if ((h || h2) && (!h || !h2 || !this.nextPageIdToRetrieve.equals(mVGetUserReportsAndAlertsRequest.nextPageIdToRetrieve))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25272f() {
        return this.entityId != null;
    }

    /* renamed from: g */
    public final boolean mo25273g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo25274h() {
        return this.nextPageIdToRetrieve != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo25276i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetUserReportsAndAlertsRequest(", "entityId:");
        MVEntityIdentifier mVEntityIdentifier = this.entityId;
        if (mVEntityIdentifier == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVEntityIdentifier);
        }
        n.append(", ");
        n.append("maxResults:");
        n.append(this.maxResults);
        if (mo25274h()) {
            n.append(", ");
            n.append("nextPageIdToRetrieve:");
            String str = this.nextPageIdToRetrieve;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(")");
        return n.toString();
    }
}
