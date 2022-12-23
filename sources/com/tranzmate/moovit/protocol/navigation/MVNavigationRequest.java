package com.tranzmate.moovit.protocol.navigation;

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

public class MVNavigationRequest implements TBase<MVNavigationRequest, _Fields>, Serializable, Cloneable, Comparable<MVNavigationRequest> {

    /* renamed from: b */
    public static final C25113c f26847b = new C25113c("guid", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26848c = new C25113c("legs", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f26849d = new C25113c("supportActivityRecognition", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f26850e = new C25113c("serverContext", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f26851f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26852g;
    private byte __isset_bitfield = 0;
    public String guid;
    public List<MVLegNavigationRequest> legs;
    private _Fields[] optionals = {_Fields.GUID, _Fields.SUPPORT_ACTIVITY_RECOGNITION, _Fields.SERVER_CONTEXT};
    public String serverContext;
    public boolean supportActivityRecognition;

    public enum _Fields implements C25085c {
        GUID(1, "guid"),
        LEGS(2, "legs"),
        SUPPORT_ACTIVITY_RECOGNITION(3, "supportActivityRecognition"),
        SERVER_CONTEXT(4, "serverContext");
        
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
                return GUID;
            }
            if (i == 2) {
                return LEGS;
            }
            if (i == 3) {
                return SUPPORT_ACTIVITY_RECOGNITION;
            }
            if (i != 4) {
                return null;
            }
            return SERVER_CONTEXT;
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

    /* renamed from: com.tranzmate.moovit.protocol.navigation.MVNavigationRequest$a */
    public static class C9428a extends C25239c<MVNavigationRequest> {
        public C9428a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNavigationRequest mVNavigationRequest = (MVNavigationRequest) tBase;
            mVNavigationRequest.getClass();
            C25113c cVar = MVNavigationRequest.f26847b;
            gVar.mo61687K();
            if (mVNavigationRequest.guid != null && mVNavigationRequest.mo29189f()) {
                gVar.mo61711x(MVNavigationRequest.f26847b);
                gVar.mo61686J(mVNavigationRequest.guid);
                gVar.mo61712y();
            }
            if (mVNavigationRequest.legs != null) {
                gVar.mo61711x(MVNavigationRequest.f26848c);
                gVar.mo61680D(new C25119e((byte) 12, mVNavigationRequest.legs.size()));
                for (MVLegNavigationRequest X0 : mVNavigationRequest.legs) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVNavigationRequest.mo29193i()) {
                gVar.mo61711x(MVNavigationRequest.f26849d);
                gVar.mo61708u(mVNavigationRequest.supportActivityRecognition);
                gVar.mo61712y();
            }
            if (mVNavigationRequest.serverContext != null && mVNavigationRequest.mo29191h()) {
                gVar.mo61711x(MVNavigationRequest.f26850e);
                gVar.mo61686J(mVNavigationRequest.serverContext);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNavigationRequest mVNavigationRequest = (MVNavigationRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVNavigationRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVNavigationRequest.serverContext = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 2) {
                            mVNavigationRequest.supportActivityRecognition = gVar.mo61690c();
                            mVNavigationRequest.mo29194j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVNavigationRequest.legs = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVLegNavigationRequest mVLegNavigationRequest = new MVLegNavigationRequest();
                            mVLegNavigationRequest.mo25201C1(gVar);
                            mVNavigationRequest.legs.add(mVLegNavigationRequest);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVNavigationRequest.guid = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.navigation.MVNavigationRequest$b */
    public static class C9429b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9428a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.navigation.MVNavigationRequest$c */
    public static class C9430c extends C25240d<MVNavigationRequest> {
        public C9430c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNavigationRequest mVNavigationRequest = (MVNavigationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVNavigationRequest.mo29189f()) {
                bitSet.set(0);
            }
            if (mVNavigationRequest.mo29190g()) {
                bitSet.set(1);
            }
            if (mVNavigationRequest.mo29193i()) {
                bitSet.set(2);
            }
            if (mVNavigationRequest.mo29191h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVNavigationRequest.mo29189f()) {
                jVar.mo61686J(mVNavigationRequest.guid);
            }
            if (mVNavigationRequest.mo29190g()) {
                jVar.mo61678B(mVNavigationRequest.legs.size());
                for (MVLegNavigationRequest X0 : mVNavigationRequest.legs) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVNavigationRequest.mo29193i()) {
                jVar.mo61708u(mVNavigationRequest.supportActivityRecognition);
            }
            if (mVNavigationRequest.mo29191h()) {
                jVar.mo61686J(mVNavigationRequest.serverContext);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNavigationRequest mVNavigationRequest = (MVNavigationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVNavigationRequest.guid = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVNavigationRequest.legs = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVLegNavigationRequest mVLegNavigationRequest = new MVLegNavigationRequest();
                    mVLegNavigationRequest.mo25201C1(jVar);
                    mVNavigationRequest.legs.add(mVLegNavigationRequest);
                }
            }
            if (T.get(2)) {
                mVNavigationRequest.supportActivityRecognition = jVar.mo61690c();
                mVNavigationRequest.mo29194j();
            }
            if (T.get(3)) {
                mVNavigationRequest.serverContext = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.navigation.MVNavigationRequest$d */
    public static class C9431d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9430c(0);
        }
    }

    static {
        new C17394d0("MVNavigationRequest");
        HashMap hashMap = new HashMap();
        f26851f = hashMap;
        hashMap.put(C25239c.class, new C9429b());
        hashMap.put(C25240d.class, new C9431d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.GUID, new FieldMetaData("guid", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LEGS, new FieldMetaData("legs", (byte) 3, new ListMetaData(new StructMetaData(MVLegNavigationRequest.class))));
        enumMap.put(_Fields.SUPPORT_ACTIVITY_RECOGNITION, new FieldMetaData("supportActivityRecognition", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SERVER_CONTEXT, new FieldMetaData("serverContext", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26852g = unmodifiableMap;
        FieldMetaData.m61947a(MVNavigationRequest.class, unmodifiableMap);
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
        ((C25238b) f26851f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26851f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVNavigationRequest mVNavigationRequest = (MVNavigationRequest) obj;
        if (!getClass().equals(mVNavigationRequest.getClass())) {
            return getClass().getName().compareTo(mVNavigationRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29189f()).compareTo(Boolean.valueOf(mVNavigationRequest.mo29189f()));
        if (compareTo2 != 0 || ((mo29189f() && (compareTo2 = this.guid.compareTo(mVNavigationRequest.guid)) != 0) || (compareTo2 = Boolean.valueOf(mo29190g()).compareTo(Boolean.valueOf(mVNavigationRequest.mo29190g()))) != 0 || ((mo29190g() && (compareTo2 = C25082a.m62844h(this.legs, mVNavigationRequest.legs)) != 0) || (compareTo2 = Boolean.valueOf(mo29193i()).compareTo(Boolean.valueOf(mVNavigationRequest.mo29193i()))) != 0 || ((mo29193i() && (compareTo2 = C25082a.m62848l(this.supportActivityRecognition, mVNavigationRequest.supportActivityRecognition)) != 0) || (compareTo2 = Boolean.valueOf(mo29191h()).compareTo(Boolean.valueOf(mVNavigationRequest.mo29191h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo29191h() || (compareTo = this.serverContext.compareTo(mVNavigationRequest.serverContext)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVNavigationRequest)) {
            return false;
        }
        MVNavigationRequest mVNavigationRequest = (MVNavigationRequest) obj;
        boolean f = mo29189f();
        boolean f2 = mVNavigationRequest.mo29189f();
        if ((f || f2) && (!f || !f2 || !this.guid.equals(mVNavigationRequest.guid))) {
            return false;
        }
        boolean g = mo29190g();
        boolean g2 = mVNavigationRequest.mo29190g();
        if ((g || g2) && (!g || !g2 || !this.legs.equals(mVNavigationRequest.legs))) {
            return false;
        }
        boolean i = mo29193i();
        boolean i2 = mVNavigationRequest.mo29193i();
        if ((i || i2) && (!i || !i2 || this.supportActivityRecognition != mVNavigationRequest.supportActivityRecognition)) {
            return false;
        }
        boolean h = mo29191h();
        boolean h2 = mVNavigationRequest.mo29191h();
        if ((h || h2) && (!h || !h2 || !this.serverContext.equals(mVNavigationRequest.serverContext))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29189f() {
        return this.guid != null;
    }

    /* renamed from: g */
    public final boolean mo29190g() {
        return this.legs != null;
    }

    /* renamed from: h */
    public final boolean mo29191h() {
        return this.serverContext != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29193i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final void mo29194j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVNavigationRequest(");
        if (mo29189f()) {
            sb.append("guid:");
            String str = this.guid;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("legs:");
        List<MVLegNavigationRequest> list = this.legs;
        if (list == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(list);
        }
        if (mo29193i()) {
            sb.append(", ");
            sb.append("supportActivityRecognition:");
            sb.append(this.supportActivityRecognition);
        }
        if (mo29191h()) {
            sb.append(", ");
            sb.append("serverContext:");
            String str2 = this.serverContext;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
