package com.tranzmate.moovit.protocol.sync;

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

public class MVMetroRevisionRequest implements TBase<MVMetroRevisionRequest, _Fields>, Serializable, Cloneable, Comparable<MVMetroRevisionRequest> {

    /* renamed from: b */
    public static final C25113c f28482b = new C25113c("metroAreaId", (byte) 6, 1);

    /* renamed from: c */
    public static final HashMap f28483c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28484d;
    private byte __isset_bitfield = 0;
    public short metroAreaId;

    public enum _Fields implements C25085c {
        METRO_AREA_ID(1, "metroAreaId");
        
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
            return METRO_AREA_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVMetroRevisionRequest$a */
    public static class C10651a extends C25239c<MVMetroRevisionRequest> {
        public C10651a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroRevisionRequest mVMetroRevisionRequest = (MVMetroRevisionRequest) tBase;
            mVMetroRevisionRequest.getClass();
            C25113c cVar = MVMetroRevisionRequest.f28482b;
            gVar.mo61687K();
            gVar.mo61711x(MVMetroRevisionRequest.f28482b);
            gVar.mo61677A(mVMetroRevisionRequest.metroAreaId);
            gVar.mo61712y();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMetroRevisionRequest mVMetroRevisionRequest = (MVMetroRevisionRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMetroRevisionRequest.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 6) {
                    mVMetroRevisionRequest.metroAreaId = gVar.mo61695h();
                    mVMetroRevisionRequest.mo32012g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVMetroRevisionRequest$b */
    public static class C10652b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10651a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVMetroRevisionRequest$c */
    public static class C10653c extends C25240d<MVMetroRevisionRequest> {
        public C10653c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroRevisionRequest mVMetroRevisionRequest = (MVMetroRevisionRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMetroRevisionRequest.mo32011f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVMetroRevisionRequest.mo32011f()) {
                jVar.mo61677A(mVMetroRevisionRequest.metroAreaId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMetroRevisionRequest mVMetroRevisionRequest = (MVMetroRevisionRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVMetroRevisionRequest.metroAreaId = jVar.mo61695h();
                mVMetroRevisionRequest.mo32012g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVMetroRevisionRequest$d */
    public static class C10654d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10653c(0);
        }
    }

    static {
        new C17394d0("MVMetroRevisionRequest");
        HashMap hashMap = new HashMap();
        f28483c = hashMap;
        hashMap.put(C25239c.class, new C10652b());
        hashMap.put(C25240d.class, new C10654d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.METRO_AREA_ID, new FieldMetaData("metroAreaId", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28484d = unmodifiableMap;
        FieldMetaData.m61947a(MVMetroRevisionRequest.class, unmodifiableMap);
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
        ((C25238b) f28483c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28483c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int k;
        MVMetroRevisionRequest mVMetroRevisionRequest = (MVMetroRevisionRequest) obj;
        if (!getClass().equals(mVMetroRevisionRequest.getClass())) {
            return getClass().getName().compareTo(mVMetroRevisionRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32011f()).compareTo(Boolean.valueOf(mVMetroRevisionRequest.mo32011f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo32011f() || (k = C25082a.m62847k(this.metroAreaId, mVMetroRevisionRequest.metroAreaId)) == 0) {
            return 0;
        }
        return k;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMetroRevisionRequest) && this.metroAreaId == ((MVMetroRevisionRequest) obj).metroAreaId) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32011f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo32012g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return C13437d.m33707l(C13437d.m33708n("MVMetroRevisionRequest(", "metroAreaId:"), this.metroAreaId, ")");
    }
}
