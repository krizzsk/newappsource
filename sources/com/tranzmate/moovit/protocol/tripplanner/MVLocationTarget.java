package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVLocationTarget implements TBase<MVLocationTarget, _Fields>, Serializable, Cloneable, Comparable<MVLocationTarget> {

    /* renamed from: b */
    public static final C25113c f29970b = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29971c = new C25113c("sourceType", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f29972d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29973e;
    public MVLocationDescriptor location;
    public MVLocationSourceType sourceType;

    public enum _Fields implements C25085c {
        LOCATION(1, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        SOURCE_TYPE(2, "sourceType");
        
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
                return LOCATION;
            }
            if (i != 2) {
                return null;
            }
            return SOURCE_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVLocationTarget$a */
    public static class C11570a extends C25239c<MVLocationTarget> {
        public C11570a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLocationTarget mVLocationTarget = (MVLocationTarget) tBase;
            mVLocationTarget.mo34391h();
            C25113c cVar = MVLocationTarget.f29970b;
            gVar.mo61687K();
            if (mVLocationTarget.location != null) {
                gVar.mo61711x(MVLocationTarget.f29970b);
                mVLocationTarget.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVLocationTarget.sourceType != null) {
                gVar.mo61711x(MVLocationTarget.f29971c);
                gVar.mo61678B(mVLocationTarget.sourceType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLocationTarget mVLocationTarget = (MVLocationTarget) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLocationTarget.mo34391h();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVLocationTarget.sourceType = MVLocationSourceType.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                    mVLocationTarget.location = mVLocationDescriptor;
                    mVLocationDescriptor.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVLocationTarget$b */
    public static class C11571b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11570a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVLocationTarget$c */
    public static class C11572c extends C25240d<MVLocationTarget> {
        public C11572c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLocationTarget mVLocationTarget = (MVLocationTarget) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLocationTarget.mo34389f()) {
                bitSet.set(0);
            }
            if (mVLocationTarget.mo34390g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVLocationTarget.mo34389f()) {
                mVLocationTarget.location.mo25202X0(jVar);
            }
            if (mVLocationTarget.mo34390g()) {
                jVar.mo61678B(mVLocationTarget.sourceType.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLocationTarget mVLocationTarget = (MVLocationTarget) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVLocationTarget.location = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVLocationTarget.sourceType = MVLocationSourceType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVLocationTarget$d */
    public static class C11573d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11572c(0);
        }
    }

    static {
        new C17394d0("MVLocationTarget");
        HashMap hashMap = new HashMap();
        f29972d = hashMap;
        hashMap.put(C25239c.class, new C11571b());
        hashMap.put(C25240d.class, new C11573d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.SOURCE_TYPE, new FieldMetaData("sourceType", (byte) 3, new EnumMetaData(MVLocationSourceType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29973e = unmodifiableMap;
        FieldMetaData.m61947a(MVLocationTarget.class, unmodifiableMap);
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
        ((C25238b) f29972d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29972d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34386a(MVLocationTarget mVLocationTarget) {
        if (mVLocationTarget == null) {
            return false;
        }
        boolean f = mo34389f();
        boolean f2 = mVLocationTarget.mo34389f();
        if ((f || f2) && (!f || !f2 || !this.location.mo26317a(mVLocationTarget.location))) {
            return false;
        }
        boolean g = mo34390g();
        boolean g2 = mVLocationTarget.mo34390g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.sourceType.equals(mVLocationTarget.sourceType)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVLocationTarget mVLocationTarget = (MVLocationTarget) obj;
        if (!getClass().equals(mVLocationTarget.getClass())) {
            return getClass().getName().compareTo(mVLocationTarget.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34389f()).compareTo(Boolean.valueOf(mVLocationTarget.mo34389f()));
        if (compareTo2 != 0 || ((mo34389f() && (compareTo2 = this.location.compareTo(mVLocationTarget.location)) != 0) || (compareTo2 = Boolean.valueOf(mo34390g()).compareTo(Boolean.valueOf(mVLocationTarget.mo34390g()))) != 0)) {
            return compareTo2;
        }
        if (!mo34390g() || (compareTo = this.sourceType.compareTo(mVLocationTarget.sourceType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVLocationTarget)) {
            return mo34386a((MVLocationTarget) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34389f() {
        return this.location != null;
    }

    /* renamed from: g */
    public final boolean mo34390g() {
        return this.sourceType != null;
    }

    /* renamed from: h */
    public final void mo34391h() throws TException {
        MVLocationDescriptor mVLocationDescriptor = this.location;
        if (mVLocationDescriptor != null) {
            mVLocationDescriptor.mo26333s();
        }
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLocationTarget(", "location:");
        MVLocationDescriptor mVLocationDescriptor = this.location;
        if (mVLocationDescriptor == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor);
        }
        n.append(", ");
        n.append("sourceType:");
        MVLocationSourceType mVLocationSourceType = this.sourceType;
        if (mVLocationSourceType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationSourceType);
        }
        n.append(")");
        return n.toString();
    }
}
