package com.tranzmate.moovit.protocol.transitcardalert;

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

public class MVUserDataSummaryResponse implements TBase<MVUserDataSummaryResponse, _Fields>, Serializable, Cloneable, Comparable<MVUserDataSummaryResponse> {

    /* renamed from: b */
    public static final C25113c f29819b = new C25113c("isCachedData", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f29820c = new C25113c("cards", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f29821d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29822e;
    private byte __isset_bitfield = 0;
    public List<MVCardStatusResponse> cards;
    public boolean isCachedData;

    public enum _Fields implements C25085c {
        IS_CACHED_DATA(1, "isCachedData"),
        CARDS(2, "cards");
        
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
                return IS_CACHED_DATA;
            }
            if (i != 2) {
                return null;
            }
            return CARDS;
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

    /* renamed from: com.tranzmate.moovit.protocol.transitcardalert.MVUserDataSummaryResponse$a */
    public static class C11493a extends C25239c<MVUserDataSummaryResponse> {
        public C11493a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserDataSummaryResponse mVUserDataSummaryResponse = (MVUserDataSummaryResponse) tBase;
            mVUserDataSummaryResponse.getClass();
            C25113c cVar = MVUserDataSummaryResponse.f29819b;
            gVar.mo61687K();
            gVar.mo61711x(MVUserDataSummaryResponse.f29819b);
            gVar.mo61708u(mVUserDataSummaryResponse.isCachedData);
            gVar.mo61712y();
            if (mVUserDataSummaryResponse.cards != null) {
                gVar.mo61711x(MVUserDataSummaryResponse.f29820c);
                gVar.mo61680D(new C25119e((byte) 12, mVUserDataSummaryResponse.cards.size()));
                for (MVCardStatusResponse X0 : mVUserDataSummaryResponse.cards) {
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
            MVUserDataSummaryResponse mVUserDataSummaryResponse = (MVUserDataSummaryResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUserDataSummaryResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVUserDataSummaryResponse.cards = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVCardStatusResponse mVCardStatusResponse = new MVCardStatusResponse();
                            mVCardStatusResponse.mo25201C1(gVar);
                            mVUserDataSummaryResponse.cards.add(mVCardStatusResponse);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVUserDataSummaryResponse.isCachedData = gVar.mo61690c();
                    mVUserDataSummaryResponse.mo34143h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.transitcardalert.MVUserDataSummaryResponse$b */
    public static class C11494b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11493a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.transitcardalert.MVUserDataSummaryResponse$c */
    public static class C11495c extends C25240d<MVUserDataSummaryResponse> {
        public C11495c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserDataSummaryResponse mVUserDataSummaryResponse = (MVUserDataSummaryResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUserDataSummaryResponse.mo34142g()) {
                bitSet.set(0);
            }
            if (mVUserDataSummaryResponse.mo34141f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVUserDataSummaryResponse.mo34142g()) {
                jVar.mo61708u(mVUserDataSummaryResponse.isCachedData);
            }
            if (mVUserDataSummaryResponse.mo34141f()) {
                jVar.mo61678B(mVUserDataSummaryResponse.cards.size());
                for (MVCardStatusResponse X0 : mVUserDataSummaryResponse.cards) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserDataSummaryResponse mVUserDataSummaryResponse = (MVUserDataSummaryResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVUserDataSummaryResponse.isCachedData = jVar.mo61690c();
                mVUserDataSummaryResponse.mo34143h();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVUserDataSummaryResponse.cards = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVCardStatusResponse mVCardStatusResponse = new MVCardStatusResponse();
                    mVCardStatusResponse.mo25201C1(jVar);
                    mVUserDataSummaryResponse.cards.add(mVCardStatusResponse);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.transitcardalert.MVUserDataSummaryResponse$d */
    public static class C11496d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11495c(0);
        }
    }

    static {
        new C17394d0("MVUserDataSummaryResponse");
        HashMap hashMap = new HashMap();
        f29821d = hashMap;
        hashMap.put(C25239c.class, new C11494b());
        hashMap.put(C25240d.class, new C11496d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IS_CACHED_DATA, new FieldMetaData("isCachedData", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.CARDS, new FieldMetaData("cards", (byte) 3, new ListMetaData(new StructMetaData(MVCardStatusResponse.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29822e = unmodifiableMap;
        FieldMetaData.m61947a(MVUserDataSummaryResponse.class, unmodifiableMap);
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
        ((C25238b) f29821d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29821d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34138a(MVUserDataSummaryResponse mVUserDataSummaryResponse) {
        if (mVUserDataSummaryResponse == null || this.isCachedData != mVUserDataSummaryResponse.isCachedData) {
            return false;
        }
        boolean f = mo34141f();
        boolean f2 = mVUserDataSummaryResponse.mo34141f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.cards.equals(mVUserDataSummaryResponse.cards)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVUserDataSummaryResponse mVUserDataSummaryResponse = (MVUserDataSummaryResponse) obj;
        if (!getClass().equals(mVUserDataSummaryResponse.getClass())) {
            return getClass().getName().compareTo(mVUserDataSummaryResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34142g()).compareTo(Boolean.valueOf(mVUserDataSummaryResponse.mo34142g()));
        if (compareTo != 0 || ((mo34142g() && (compareTo = C25082a.m62848l(this.isCachedData, mVUserDataSummaryResponse.isCachedData)) != 0) || (compareTo = Boolean.valueOf(mo34141f()).compareTo(Boolean.valueOf(mVUserDataSummaryResponse.mo34141f()))) != 0)) {
            return compareTo;
        }
        if (!mo34141f() || (h = C25082a.m62844h(this.cards, mVUserDataSummaryResponse.cards)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVUserDataSummaryResponse)) {
            return mo34138a((MVUserDataSummaryResponse) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34141f() {
        return this.cards != null;
    }

    /* renamed from: g */
    public final boolean mo34142g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo34143h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUserDataSummaryResponse(", "isCachedData:");
        C13555b.m33977q(n, this.isCachedData, ", ", "cards:");
        List<MVCardStatusResponse> list = this.cards;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
