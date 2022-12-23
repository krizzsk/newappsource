package com.tranzmate.moovit.protocol.crowd;

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

public class MVAppState implements TBase<MVAppState, _Fields>, Serializable, Cloneable, Comparable<MVAppState> {

    /* renamed from: b */
    public static final C25113c f25317b = new C25113c("type", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25318c = new C25113c("params", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f25319d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25320e;
    public List<String> params;
    public String type;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        PARAMS(2, "params");
        
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
                return TYPE;
            }
            if (i != 2) {
                return null;
            }
            return PARAMS;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVAppState$a */
    public static class C8533a extends C25239c<MVAppState> {
        public C8533a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAppState mVAppState = (MVAppState) tBase;
            mVAppState.getClass();
            C25113c cVar = MVAppState.f25317b;
            gVar.mo61687K();
            if (mVAppState.type != null) {
                gVar.mo61711x(MVAppState.f25317b);
                gVar.mo61686J(mVAppState.type);
                gVar.mo61712y();
            }
            if (mVAppState.params != null) {
                gVar.mo61711x(MVAppState.f25318c);
                gVar.mo61680D(new C25119e((byte) 11, mVAppState.params.size()));
                for (String J : mVAppState.params) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAppState mVAppState = (MVAppState) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAppState.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVAppState.params = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            mVAppState.params.add(gVar.mo61704q());
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVAppState.type = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVAppState$b */
    public static class C8534b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8533a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVAppState$c */
    public static class C8535c extends C25240d<MVAppState> {
        public C8535c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAppState mVAppState = (MVAppState) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAppState.mo26707g()) {
                bitSet.set(0);
            }
            if (mVAppState.mo26706f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVAppState.mo26707g()) {
                jVar.mo61686J(mVAppState.type);
            }
            if (mVAppState.mo26706f()) {
                jVar.mo61678B(mVAppState.params.size());
                for (String J : mVAppState.params) {
                    jVar.mo61686J(J);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAppState mVAppState = (MVAppState) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVAppState.type = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVAppState.params = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVAppState.params.add(jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVAppState$d */
    public static class C8536d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8535c(0);
        }
    }

    static {
        new C17394d0("MVAppState");
        HashMap hashMap = new HashMap();
        f25319d = hashMap;
        hashMap.put(C25239c.class, new C8534b());
        hashMap.put(C25240d.class, new C8536d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PARAMS, new FieldMetaData("params", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25320e = unmodifiableMap;
        FieldMetaData.m61947a(MVAppState.class, unmodifiableMap);
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
        ((C25238b) f25319d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25319d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVAppState mVAppState = (MVAppState) obj;
        if (!getClass().equals(mVAppState.getClass())) {
            return getClass().getName().compareTo(mVAppState.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26707g()).compareTo(Boolean.valueOf(mVAppState.mo26707g()));
        if (compareTo != 0 || ((mo26707g() && (compareTo = this.type.compareTo(mVAppState.type)) != 0) || (compareTo = Boolean.valueOf(mo26706f()).compareTo(Boolean.valueOf(mVAppState.mo26706f()))) != 0)) {
            return compareTo;
        }
        if (!mo26706f() || (h = C25082a.m62844h(this.params, mVAppState.params)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAppState)) {
            return false;
        }
        MVAppState mVAppState = (MVAppState) obj;
        boolean g = mo26707g();
        boolean g2 = mVAppState.mo26707g();
        if ((g || g2) && (!g || !g2 || !this.type.equals(mVAppState.type))) {
            return false;
        }
        boolean f = mo26706f();
        boolean f2 = mVAppState.mo26706f();
        if ((f || f2) && (!f || !f2 || !this.params.equals(mVAppState.params))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26706f() {
        return this.params != null;
    }

    /* renamed from: g */
    public final boolean mo26707g() {
        return this.type != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAppState(", "type:");
        String str = this.type;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("params:");
        List<String> list = this.params;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
