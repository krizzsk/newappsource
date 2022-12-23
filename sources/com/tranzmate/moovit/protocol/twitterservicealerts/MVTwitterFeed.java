package com.tranzmate.moovit.protocol.twitterservicealerts;

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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import p001a0.C0016g;
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

public class MVTwitterFeed implements TBase<MVTwitterFeed, _Fields>, Serializable, Cloneable, Comparable<MVTwitterFeed> {

    /* renamed from: b */
    public static final C25113c f30301b = new C25113c("refId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30302c = new C25113c("handle", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30303d = new C25113c("feedType", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f30304e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f30305f;
    private byte __isset_bitfield = 0;
    public MVTwitterFeedType feedType;
    public String handle;
    public int refId;

    public enum _Fields implements C25085c {
        REF_ID(1, "refId"),
        HANDLE(2, "handle"),
        FEED_TYPE(3, "feedType");
        
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
                return REF_ID;
            }
            if (i == 2) {
                return HANDLE;
            }
            if (i != 3) {
                return null;
            }
            return FEED_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.twitterservicealerts.MVTwitterFeed$a */
    public static class C11743a extends C25239c<MVTwitterFeed> {
        public C11743a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTwitterFeed mVTwitterFeed = (MVTwitterFeed) tBase;
            mVTwitterFeed.getClass();
            C25113c cVar = MVTwitterFeed.f30301b;
            gVar.mo61687K();
            gVar.mo61711x(MVTwitterFeed.f30301b);
            gVar.mo61678B(mVTwitterFeed.refId);
            gVar.mo61712y();
            if (mVTwitterFeed.handle != null) {
                gVar.mo61711x(MVTwitterFeed.f30302c);
                gVar.mo61686J(mVTwitterFeed.handle);
                gVar.mo61712y();
            }
            if (mVTwitterFeed.feedType != null) {
                gVar.mo61711x(MVTwitterFeed.f30303d);
                gVar.mo61678B(mVTwitterFeed.feedType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTwitterFeed mVTwitterFeed = (MVTwitterFeed) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTwitterFeed.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVTwitterFeed.feedType = MVTwitterFeedType.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTwitterFeed.handle = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTwitterFeed.refId = gVar.mo61696i();
                    mVTwitterFeed.mo34953i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.twitterservicealerts.MVTwitterFeed$b */
    public static class C11744b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11743a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.twitterservicealerts.MVTwitterFeed$c */
    public static class C11745c extends C25240d<MVTwitterFeed> {
        public C11745c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTwitterFeed mVTwitterFeed = (MVTwitterFeed) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTwitterFeed.mo34951h()) {
                bitSet.set(0);
            }
            if (mVTwitterFeed.mo34950g()) {
                bitSet.set(1);
            }
            if (mVTwitterFeed.mo34949f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTwitterFeed.mo34951h()) {
                jVar.mo61678B(mVTwitterFeed.refId);
            }
            if (mVTwitterFeed.mo34950g()) {
                jVar.mo61686J(mVTwitterFeed.handle);
            }
            if (mVTwitterFeed.mo34949f()) {
                jVar.mo61678B(mVTwitterFeed.feedType.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTwitterFeed mVTwitterFeed = (MVTwitterFeed) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTwitterFeed.refId = jVar.mo61696i();
                mVTwitterFeed.mo34953i();
            }
            if (T.get(1)) {
                mVTwitterFeed.handle = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVTwitterFeed.feedType = MVTwitterFeedType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.twitterservicealerts.MVTwitterFeed$d */
    public static class C11746d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11745c(0);
        }
    }

    static {
        new C17394d0("MVTwitterFeed");
        HashMap hashMap = new HashMap();
        f30304e = hashMap;
        hashMap.put(C25239c.class, new C11744b());
        hashMap.put(C25240d.class, new C11746d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REF_ID, new FieldMetaData("refId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.HANDLE, new FieldMetaData("handle", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FEED_TYPE, new FieldMetaData("feedType", (byte) 3, new EnumMetaData(MVTwitterFeedType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30305f = unmodifiableMap;
        FieldMetaData.m61947a(MVTwitterFeed.class, unmodifiableMap);
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
        ((C25238b) f30304e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30304e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTwitterFeed mVTwitterFeed = (MVTwitterFeed) obj;
        if (!getClass().equals(mVTwitterFeed.getClass())) {
            return getClass().getName().compareTo(mVTwitterFeed.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34951h()).compareTo(Boolean.valueOf(mVTwitterFeed.mo34951h()));
        if (compareTo2 != 0 || ((mo34951h() && (compareTo2 = C25082a.m62839c(this.refId, mVTwitterFeed.refId)) != 0) || (compareTo2 = Boolean.valueOf(mo34950g()).compareTo(Boolean.valueOf(mVTwitterFeed.mo34950g()))) != 0 || ((mo34950g() && (compareTo2 = this.handle.compareTo(mVTwitterFeed.handle)) != 0) || (compareTo2 = Boolean.valueOf(mo34949f()).compareTo(Boolean.valueOf(mVTwitterFeed.mo34949f()))) != 0))) {
            return compareTo2;
        }
        if (!mo34949f() || (compareTo = this.feedType.compareTo(mVTwitterFeed.feedType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTwitterFeed)) {
            return false;
        }
        MVTwitterFeed mVTwitterFeed = (MVTwitterFeed) obj;
        if (this.refId != mVTwitterFeed.refId) {
            return false;
        }
        boolean g = mo34950g();
        boolean g2 = mVTwitterFeed.mo34950g();
        if ((g || g2) && (!g || !g2 || !this.handle.equals(mVTwitterFeed.handle))) {
            return false;
        }
        boolean f = mo34949f();
        boolean f2 = mVTwitterFeed.mo34949f();
        if ((f || f2) && (!f || !f2 || !this.feedType.equals(mVTwitterFeed.feedType))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34949f() {
        return this.feedType != null;
    }

    /* renamed from: g */
    public final boolean mo34950g() {
        return this.handle != null;
    }

    /* renamed from: h */
    public final boolean mo34951h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo34953i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTwitterFeed(", "refId:");
        C0016g.m42z(n, this.refId, ", ", "handle:");
        String str = this.handle;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("feedType:");
        MVTwitterFeedType mVTwitterFeedType = this.feedType;
        if (mVTwitterFeedType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTwitterFeedType);
        }
        n.append(")");
        return n.toString();
    }
}
