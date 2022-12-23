package com.tranzmate.moovit.protocol.fare;

import com.appboy.support.StringUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
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

public class MVAltVariationFareGroup implements TBase<MVAltVariationFareGroup, _Fields>, Serializable, Cloneable, Comparable<MVAltVariationFareGroup> {

    /* renamed from: b */
    public static final C25113c f25625b = new C25113c("partial", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f25626c = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25627d = new C25113c("altVariations", (byte) 15, 3);

    /* renamed from: e */
    public static final HashMap f25628e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25629f;
    private byte __isset_bitfield = 0;
    public List<MVAltVariationFare> altVariations;
    private _Fields[] optionals = {_Fields.PRICE};
    public boolean partial;
    public int price;

    public enum _Fields implements C25085c {
        PARTIAL(1, "partial"),
        PRICE(2, InAppPurchaseMetaData.KEY_PRICE),
        ALT_VARIATIONS(3, "altVariations");
        
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
                return PARTIAL;
            }
            if (i == 2) {
                return PRICE;
            }
            if (i != 3) {
                return null;
            }
            return ALT_VARIATIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVAltVariationFareGroup$a */
    public static class C8731a extends C25239c<MVAltVariationFareGroup> {
        public C8731a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAltVariationFareGroup mVAltVariationFareGroup = (MVAltVariationFareGroup) tBase;
            mVAltVariationFareGroup.getClass();
            C25113c cVar = MVAltVariationFareGroup.f25625b;
            gVar.mo61687K();
            gVar.mo61711x(MVAltVariationFareGroup.f25625b);
            gVar.mo61708u(mVAltVariationFareGroup.partial);
            gVar.mo61712y();
            if (mVAltVariationFareGroup.mo27210h()) {
                gVar.mo61711x(MVAltVariationFareGroup.f25626c);
                gVar.mo61678B(mVAltVariationFareGroup.price);
                gVar.mo61712y();
            }
            if (mVAltVariationFareGroup.altVariations != null) {
                gVar.mo61711x(MVAltVariationFareGroup.f25627d);
                gVar.mo61680D(new C25119e((byte) 12, mVAltVariationFareGroup.altVariations.size()));
                for (MVAltVariationFare X0 : mVAltVariationFareGroup.altVariations) {
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
            MVAltVariationFareGroup mVAltVariationFareGroup = (MVAltVariationFareGroup) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAltVariationFareGroup.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVAltVariationFareGroup.altVariations = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVAltVariationFare mVAltVariationFare = new MVAltVariationFare();
                                mVAltVariationFare.mo25201C1(gVar);
                                mVAltVariationFareGroup.altVariations.add(mVAltVariationFare);
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVAltVariationFareGroup.price = gVar.mo61696i();
                        mVAltVariationFareGroup.mo27213j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVAltVariationFareGroup.partial = gVar.mo61690c();
                    mVAltVariationFareGroup.mo27212i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVAltVariationFareGroup$b */
    public static class C8732b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8731a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVAltVariationFareGroup$c */
    public static class C8733c extends C25240d<MVAltVariationFareGroup> {
        public C8733c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAltVariationFareGroup mVAltVariationFareGroup = (MVAltVariationFareGroup) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAltVariationFareGroup.mo27209g()) {
                bitSet.set(0);
            }
            if (mVAltVariationFareGroup.mo27210h()) {
                bitSet.set(1);
            }
            if (mVAltVariationFareGroup.mo27208f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVAltVariationFareGroup.mo27209g()) {
                jVar.mo61708u(mVAltVariationFareGroup.partial);
            }
            if (mVAltVariationFareGroup.mo27210h()) {
                jVar.mo61678B(mVAltVariationFareGroup.price);
            }
            if (mVAltVariationFareGroup.mo27208f()) {
                jVar.mo61678B(mVAltVariationFareGroup.altVariations.size());
                for (MVAltVariationFare X0 : mVAltVariationFareGroup.altVariations) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAltVariationFareGroup mVAltVariationFareGroup = (MVAltVariationFareGroup) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVAltVariationFareGroup.partial = jVar.mo61690c();
                mVAltVariationFareGroup.mo27212i();
            }
            if (T.get(1)) {
                mVAltVariationFareGroup.price = jVar.mo61696i();
                mVAltVariationFareGroup.mo27213j();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVAltVariationFareGroup.altVariations = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVAltVariationFare mVAltVariationFare = new MVAltVariationFare();
                    mVAltVariationFare.mo25201C1(jVar);
                    mVAltVariationFareGroup.altVariations.add(mVAltVariationFare);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVAltVariationFareGroup$d */
    public static class C8734d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8733c(0);
        }
    }

    static {
        new C17394d0("MVAltVariationFareGroup");
        HashMap hashMap = new HashMap();
        f25628e = hashMap;
        hashMap.put(C25239c.class, new C8732b());
        hashMap.put(C25240d.class, new C8734d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PARTIAL, new FieldMetaData("partial", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ALT_VARIATIONS, new FieldMetaData("altVariations", (byte) 3, new ListMetaData(new StructMetaData(MVAltVariationFare.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25629f = unmodifiableMap;
        FieldMetaData.m61947a(MVAltVariationFareGroup.class, unmodifiableMap);
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
        ((C25238b) f25628e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25628e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVAltVariationFareGroup mVAltVariationFareGroup = (MVAltVariationFareGroup) obj;
        if (!getClass().equals(mVAltVariationFareGroup.getClass())) {
            return getClass().getName().compareTo(mVAltVariationFareGroup.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27209g()).compareTo(Boolean.valueOf(mVAltVariationFareGroup.mo27209g()));
        if (compareTo != 0 || ((mo27209g() && (compareTo = C25082a.m62848l(this.partial, mVAltVariationFareGroup.partial)) != 0) || (compareTo = Boolean.valueOf(mo27210h()).compareTo(Boolean.valueOf(mVAltVariationFareGroup.mo27210h()))) != 0 || ((mo27210h() && (compareTo = C25082a.m62839c(this.price, mVAltVariationFareGroup.price)) != 0) || (compareTo = Boolean.valueOf(mo27208f()).compareTo(Boolean.valueOf(mVAltVariationFareGroup.mo27208f()))) != 0))) {
            return compareTo;
        }
        if (!mo27208f() || (h = C25082a.m62844h(this.altVariations, mVAltVariationFareGroup.altVariations)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAltVariationFareGroup)) {
            return false;
        }
        MVAltVariationFareGroup mVAltVariationFareGroup = (MVAltVariationFareGroup) obj;
        if (this.partial != mVAltVariationFareGroup.partial) {
            return false;
        }
        boolean h = mo27210h();
        boolean h2 = mVAltVariationFareGroup.mo27210h();
        if ((h || h2) && (!h || !h2 || this.price != mVAltVariationFareGroup.price)) {
            return false;
        }
        boolean f = mo27208f();
        boolean f2 = mVAltVariationFareGroup.mo27208f();
        if ((f || f2) && (!f || !f2 || !this.altVariations.equals(mVAltVariationFareGroup.altVariations))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27208f() {
        return this.altVariations != null;
    }

    /* renamed from: g */
    public final boolean mo27209g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo27210h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27212i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo27213j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAltVariationFareGroup(", "partial:");
        n.append(this.partial);
        if (mo27210h()) {
            n.append(", ");
            n.append("price:");
            n.append(this.price);
        }
        n.append(", ");
        n.append("altVariations:");
        List<MVAltVariationFare> list = this.altVariations;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
