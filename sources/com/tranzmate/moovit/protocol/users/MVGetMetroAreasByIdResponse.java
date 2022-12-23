package com.tranzmate.moovit.protocol.users;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVGetMetroAreasByIdResponse implements TBase<MVGetMetroAreasByIdResponse, _Fields>, Serializable, Cloneable, Comparable<MVGetMetroAreasByIdResponse> {

    /* renamed from: b */
    public static final C25113c f30445b = new C25113c("metroAreas", (byte) 15, 1);

    /* renamed from: c */
    public static final HashMap f30446c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f30447d;
    public List<MVMetroArea> metroAreas;

    public enum _Fields implements C25085c {
        METRO_AREAS(1, "metroAreas");
        
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
            return METRO_AREAS;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVGetMetroAreasByIdResponse$a */
    public static class C11836a extends C25239c<MVGetMetroAreasByIdResponse> {
        public C11836a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetMetroAreasByIdResponse mVGetMetroAreasByIdResponse = (MVGetMetroAreasByIdResponse) tBase;
            mVGetMetroAreasByIdResponse.getClass();
            C25113c cVar = MVGetMetroAreasByIdResponse.f30445b;
            gVar.mo61687K();
            if (mVGetMetroAreasByIdResponse.metroAreas != null) {
                gVar.mo61711x(MVGetMetroAreasByIdResponse.f30445b);
                gVar.mo61680D(new C25119e((byte) 12, mVGetMetroAreasByIdResponse.metroAreas.size()));
                for (MVMetroArea X0 : mVGetMetroAreasByIdResponse.metroAreas) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetMetroAreasByIdResponse mVGetMetroAreasByIdResponse = (MVGetMetroAreasByIdResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVGetMetroAreasByIdResponse.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVGetMetroAreasByIdResponse.metroAreas = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVMetroArea mVMetroArea = new MVMetroArea();
                        mVMetroArea.mo25201C1(gVar);
                        mVGetMetroAreasByIdResponse.metroAreas.add(mVMetroArea);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVGetMetroAreasByIdResponse$b */
    public static class C11837b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11836a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVGetMetroAreasByIdResponse$c */
    public static class C11838c extends C25240d<MVGetMetroAreasByIdResponse> {
        public C11838c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetMetroAreasByIdResponse mVGetMetroAreasByIdResponse = (MVGetMetroAreasByIdResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetMetroAreasByIdResponse.mo35188f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVGetMetroAreasByIdResponse.mo35188f()) {
                jVar.mo61678B(mVGetMetroAreasByIdResponse.metroAreas.size());
                for (MVMetroArea X0 : mVGetMetroAreasByIdResponse.metroAreas) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetMetroAreasByIdResponse mVGetMetroAreasByIdResponse = (MVGetMetroAreasByIdResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                int i = jVar.mo61696i();
                mVGetMetroAreasByIdResponse.metroAreas = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVMetroArea mVMetroArea = new MVMetroArea();
                    mVMetroArea.mo25201C1(jVar);
                    mVGetMetroAreasByIdResponse.metroAreas.add(mVMetroArea);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVGetMetroAreasByIdResponse$d */
    public static class C11839d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11838c(0);
        }
    }

    static {
        new C17394d0("MVGetMetroAreasByIdResponse");
        HashMap hashMap = new HashMap();
        f30446c = hashMap;
        hashMap.put(C25239c.class, new C11837b());
        hashMap.put(C25240d.class, new C11839d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.METRO_AREAS, new FieldMetaData("metroAreas", (byte) 3, new ListMetaData(new StructMetaData(MVMetroArea.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30447d = unmodifiableMap;
        FieldMetaData.m61947a(MVGetMetroAreasByIdResponse.class, unmodifiableMap);
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
        ((C25238b) f30446c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30446c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVGetMetroAreasByIdResponse mVGetMetroAreasByIdResponse = (MVGetMetroAreasByIdResponse) obj;
        if (!getClass().equals(mVGetMetroAreasByIdResponse.getClass())) {
            return getClass().getName().compareTo(mVGetMetroAreasByIdResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35188f()).compareTo(Boolean.valueOf(mVGetMetroAreasByIdResponse.mo35188f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo35188f() || (h = C25082a.m62844h(this.metroAreas, mVGetMetroAreasByIdResponse.metroAreas)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetMetroAreasByIdResponse)) {
            return false;
        }
        MVGetMetroAreasByIdResponse mVGetMetroAreasByIdResponse = (MVGetMetroAreasByIdResponse) obj;
        boolean f = mo35188f();
        boolean f2 = mVGetMetroAreasByIdResponse.mo35188f();
        if ((f || f2) && (!f || !f2 || !this.metroAreas.equals(mVGetMetroAreasByIdResponse.metroAreas))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35188f() {
        return this.metroAreas != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetMetroAreasByIdResponse(", "metroAreas:");
        List<MVMetroArea> list = this.metroAreas;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
