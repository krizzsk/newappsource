package com.tranzmate.moovit.protocol.taxi;

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

public class MVTaxiAnimationsConfig implements TBase<MVTaxiAnimationsConfig, _Fields>, Serializable, Cloneable, Comparable<MVTaxiAnimationsConfig> {

    /* renamed from: b */
    public static final C25113c f28532b = new C25113c("baseUrl", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28533c = new C25113c("animations", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f28534d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28535e;
    public List<MVTaxiAnimation> animations;
    public String baseUrl;

    public enum _Fields implements C25085c {
        BASE_URL(1, "baseUrl"),
        ANIMATIONS(2, "animations");
        
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
                return BASE_URL;
            }
            if (i != 2) {
                return null;
            }
            return ANIMATIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiAnimationsConfig$a */
    public static class C10688a extends C25239c<MVTaxiAnimationsConfig> {
        public C10688a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiAnimationsConfig mVTaxiAnimationsConfig = (MVTaxiAnimationsConfig) tBase;
            mVTaxiAnimationsConfig.getClass();
            C25113c cVar = MVTaxiAnimationsConfig.f28532b;
            gVar.mo61687K();
            if (mVTaxiAnimationsConfig.baseUrl != null) {
                gVar.mo61711x(MVTaxiAnimationsConfig.f28532b);
                gVar.mo61686J(mVTaxiAnimationsConfig.baseUrl);
                gVar.mo61712y();
            }
            if (mVTaxiAnimationsConfig.animations != null) {
                gVar.mo61711x(MVTaxiAnimationsConfig.f28533c);
                gVar.mo61680D(new C25119e((byte) 12, mVTaxiAnimationsConfig.animations.size()));
                for (MVTaxiAnimation X0 : mVTaxiAnimationsConfig.animations) {
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
            MVTaxiAnimationsConfig mVTaxiAnimationsConfig = (MVTaxiAnimationsConfig) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTaxiAnimationsConfig.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVTaxiAnimationsConfig.animations = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVTaxiAnimation mVTaxiAnimation = new MVTaxiAnimation();
                            mVTaxiAnimation.mo25201C1(gVar);
                            mVTaxiAnimationsConfig.animations.add(mVTaxiAnimation);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTaxiAnimationsConfig.baseUrl = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiAnimationsConfig$b */
    public static class C10689b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10688a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiAnimationsConfig$c */
    public static class C10690c extends C25240d<MVTaxiAnimationsConfig> {
        public C10690c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiAnimationsConfig mVTaxiAnimationsConfig = (MVTaxiAnimationsConfig) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTaxiAnimationsConfig.mo32084g()) {
                bitSet.set(0);
            }
            if (mVTaxiAnimationsConfig.mo32083f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTaxiAnimationsConfig.mo32084g()) {
                jVar.mo61686J(mVTaxiAnimationsConfig.baseUrl);
            }
            if (mVTaxiAnimationsConfig.mo32083f()) {
                jVar.mo61678B(mVTaxiAnimationsConfig.animations.size());
                for (MVTaxiAnimation X0 : mVTaxiAnimationsConfig.animations) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiAnimationsConfig mVTaxiAnimationsConfig = (MVTaxiAnimationsConfig) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTaxiAnimationsConfig.baseUrl = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVTaxiAnimationsConfig.animations = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTaxiAnimation mVTaxiAnimation = new MVTaxiAnimation();
                    mVTaxiAnimation.mo25201C1(jVar);
                    mVTaxiAnimationsConfig.animations.add(mVTaxiAnimation);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiAnimationsConfig$d */
    public static class C10691d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10690c(0);
        }
    }

    static {
        new C17394d0("MVTaxiAnimationsConfig");
        HashMap hashMap = new HashMap();
        f28534d = hashMap;
        hashMap.put(C25239c.class, new C10689b());
        hashMap.put(C25240d.class, new C10691d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.BASE_URL, new FieldMetaData("baseUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ANIMATIONS, new FieldMetaData("animations", (byte) 3, new ListMetaData(new StructMetaData(MVTaxiAnimation.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28535e = unmodifiableMap;
        FieldMetaData.m61947a(MVTaxiAnimationsConfig.class, unmodifiableMap);
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
        ((C25238b) f28534d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28534d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo32080a(MVTaxiAnimationsConfig mVTaxiAnimationsConfig) {
        if (mVTaxiAnimationsConfig == null) {
            return false;
        }
        boolean g = mo32084g();
        boolean g2 = mVTaxiAnimationsConfig.mo32084g();
        if ((g || g2) && (!g || !g2 || !this.baseUrl.equals(mVTaxiAnimationsConfig.baseUrl))) {
            return false;
        }
        boolean f = mo32083f();
        boolean f2 = mVTaxiAnimationsConfig.mo32083f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.animations.equals(mVTaxiAnimationsConfig.animations)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVTaxiAnimationsConfig mVTaxiAnimationsConfig = (MVTaxiAnimationsConfig) obj;
        if (!getClass().equals(mVTaxiAnimationsConfig.getClass())) {
            return getClass().getName().compareTo(mVTaxiAnimationsConfig.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32084g()).compareTo(Boolean.valueOf(mVTaxiAnimationsConfig.mo32084g()));
        if (compareTo != 0 || ((mo32084g() && (compareTo = this.baseUrl.compareTo(mVTaxiAnimationsConfig.baseUrl)) != 0) || (compareTo = Boolean.valueOf(mo32083f()).compareTo(Boolean.valueOf(mVTaxiAnimationsConfig.mo32083f()))) != 0)) {
            return compareTo;
        }
        if (!mo32083f() || (h = C25082a.m62844h(this.animations, mVTaxiAnimationsConfig.animations)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTaxiAnimationsConfig)) {
            return mo32080a((MVTaxiAnimationsConfig) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32083f() {
        return this.animations != null;
    }

    /* renamed from: g */
    public final boolean mo32084g() {
        return this.baseUrl != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTaxiAnimationsConfig(", "baseUrl:");
        String str = this.baseUrl;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("animations:");
        List<MVTaxiAnimation> list = this.animations;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
