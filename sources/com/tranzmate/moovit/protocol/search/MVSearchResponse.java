package com.tranzmate.moovit.protocol.search;

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
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
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

public class MVSearchResponse implements TBase<MVSearchResponse, _Fields>, Serializable, Cloneable, Comparable<MVSearchResponse> {

    /* renamed from: b */
    public static final C25113c f28198b = new C25113c("endIndex", (byte) 6, 1);

    /* renamed from: c */
    public static final C25113c f28199c = new C25113c("results", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f28200d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28201e;
    private byte __isset_bitfield = 0;
    public short endIndex;
    public List<MVSearchResponseItem> results;

    public enum _Fields implements C25085c {
        END_INDEX(1, "endIndex"),
        RESULTS(2, "results");
        
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
                return END_INDEX;
            }
            if (i != 2) {
                return null;
            }
            return RESULTS;
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

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchResponse$a */
    public static class C10439a extends C25239c<MVSearchResponse> {
        public C10439a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSearchResponse mVSearchResponse = (MVSearchResponse) tBase;
            mVSearchResponse.getClass();
            C25113c cVar = MVSearchResponse.f28198b;
            gVar.mo61687K();
            gVar.mo61711x(MVSearchResponse.f28198b);
            gVar.mo61677A(mVSearchResponse.endIndex);
            gVar.mo61712y();
            if (mVSearchResponse.results != null) {
                gVar.mo61711x(MVSearchResponse.f28199c);
                gVar.mo61680D(new C25119e((byte) 12, mVSearchResponse.results.size()));
                for (MVSearchResponseItem X0 : mVSearchResponse.results) {
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
            MVSearchResponse mVSearchResponse = (MVSearchResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSearchResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVSearchResponse.results = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVSearchResponseItem mVSearchResponseItem = new MVSearchResponseItem();
                            mVSearchResponseItem.mo25201C1(gVar);
                            mVSearchResponse.results.add(mVSearchResponseItem);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 6) {
                    mVSearchResponse.endIndex = gVar.mo61695h();
                    mVSearchResponse.mo31514h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchResponse$b */
    public static class C10440b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10439a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchResponse$c */
    public static class C10441c extends C25240d<MVSearchResponse> {
        public C10441c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSearchResponse mVSearchResponse = (MVSearchResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSearchResponse.mo31512f()) {
                bitSet.set(0);
            }
            if (mVSearchResponse.mo31513g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVSearchResponse.mo31512f()) {
                jVar.mo61677A(mVSearchResponse.endIndex);
            }
            if (mVSearchResponse.mo31513g()) {
                jVar.mo61678B(mVSearchResponse.results.size());
                for (MVSearchResponseItem X0 : mVSearchResponse.results) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSearchResponse mVSearchResponse = (MVSearchResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVSearchResponse.endIndex = jVar.mo61695h();
                mVSearchResponse.mo31514h();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVSearchResponse.results = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVSearchResponseItem mVSearchResponseItem = new MVSearchResponseItem();
                    mVSearchResponseItem.mo25201C1(jVar);
                    mVSearchResponse.results.add(mVSearchResponseItem);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchResponse$d */
    public static class C10442d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10441c(0);
        }
    }

    static {
        new C17394d0("MVSearchResponse");
        HashMap hashMap = new HashMap();
        f28200d = hashMap;
        hashMap.put(C25239c.class, new C10440b());
        hashMap.put(C25240d.class, new C10442d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.END_INDEX, new FieldMetaData("endIndex", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.RESULTS, new FieldMetaData("results", (byte) 3, new ListMetaData(new StructMetaData(MVSearchResponseItem.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28201e = unmodifiableMap;
        FieldMetaData.m61947a(MVSearchResponse.class, unmodifiableMap);
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
        ((C25238b) f28200d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28200d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVSearchResponse mVSearchResponse = (MVSearchResponse) obj;
        if (!getClass().equals(mVSearchResponse.getClass())) {
            return getClass().getName().compareTo(mVSearchResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31512f()).compareTo(Boolean.valueOf(mVSearchResponse.mo31512f()));
        if (compareTo != 0 || ((mo31512f() && (compareTo = C25082a.m62847k(this.endIndex, mVSearchResponse.endIndex)) != 0) || (compareTo = Boolean.valueOf(mo31513g()).compareTo(Boolean.valueOf(mVSearchResponse.mo31513g()))) != 0)) {
            return compareTo;
        }
        if (!mo31513g() || (h = C25082a.m62844h(this.results, mVSearchResponse.results)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSearchResponse)) {
            return false;
        }
        MVSearchResponse mVSearchResponse = (MVSearchResponse) obj;
        if (this.endIndex != mVSearchResponse.endIndex) {
            return false;
        }
        boolean g = mo31513g();
        boolean g2 = mVSearchResponse.mo31513g();
        if ((g || g2) && (!g || !g2 || !this.results.equals(mVSearchResponse.results))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31512f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo31513g() {
        return this.results != null;
    }

    /* renamed from: h */
    public final void mo31514h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSearchResponse(", "endIndex:");
        C0016g.m42z(n, this.endIndex, ", ", "results:");
        List<MVSearchResponseItem> list = this.results;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
