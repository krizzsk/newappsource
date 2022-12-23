package com.tranzmate.moovit.protocol.surveys;

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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
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

public class MVSurveysConfiguration implements TBase<MVSurveysConfiguration, _Fields>, Serializable, Cloneable, Comparable<MVSurveysConfiguration> {

    /* renamed from: b */
    public static final C25113c f28478b = new C25113c("types", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f28479c = new C25113c("delayIntervalSec", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f28480d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28481e;
    private byte __isset_bitfield = 0;
    public int delayIntervalSec;
    public List<MVSurveyType> types;

    public enum _Fields implements C25085c {
        TYPES(1, "types"),
        DELAY_INTERVAL_SEC(2, "delayIntervalSec");
        
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
                return TYPES;
            }
            if (i != 2) {
                return null;
            }
            return DELAY_INTERVAL_SEC;
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

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveysConfiguration$a */
    public static class C10647a extends C25239c<MVSurveysConfiguration> {
        public C10647a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSurveysConfiguration mVSurveysConfiguration = (MVSurveysConfiguration) tBase;
            mVSurveysConfiguration.getClass();
            C25113c cVar = MVSurveysConfiguration.f28478b;
            gVar.mo61687K();
            if (mVSurveysConfiguration.types != null) {
                gVar.mo61711x(MVSurveysConfiguration.f28478b);
                gVar.mo61680D(new C25119e((byte) 8, mVSurveysConfiguration.types.size()));
                for (MVSurveyType value : mVSurveysConfiguration.types) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVSurveysConfiguration.f28479c);
            C16530d.m42020n(gVar, mVSurveysConfiguration.delayIntervalSec);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSurveysConfiguration mVSurveysConfiguration = (MVSurveysConfiguration) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSurveysConfiguration.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVSurveysConfiguration.delayIntervalSec = gVar.mo61696i();
                        mVSurveysConfiguration.mo32005h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVSurveysConfiguration.types = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        mVSurveysConfiguration.types.add(MVSurveyType.findByValue(gVar.mo61696i()));
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveysConfiguration$b */
    public static class C10648b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10647a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveysConfiguration$c */
    public static class C10649c extends C25240d<MVSurveysConfiguration> {
        public C10649c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSurveysConfiguration mVSurveysConfiguration = (MVSurveysConfiguration) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSurveysConfiguration.mo32004g()) {
                bitSet.set(0);
            }
            if (mVSurveysConfiguration.mo32003f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVSurveysConfiguration.mo32004g()) {
                jVar.mo61678B(mVSurveysConfiguration.types.size());
                for (MVSurveyType value : mVSurveysConfiguration.types) {
                    jVar.mo61678B(value.getValue());
                }
            }
            if (mVSurveysConfiguration.mo32003f()) {
                jVar.mo61678B(mVSurveysConfiguration.delayIntervalSec);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSurveysConfiguration mVSurveysConfiguration = (MVSurveysConfiguration) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVSurveysConfiguration.types = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVSurveysConfiguration.types.add(MVSurveyType.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(1)) {
                mVSurveysConfiguration.delayIntervalSec = jVar.mo61696i();
                mVSurveysConfiguration.mo32005h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveysConfiguration$d */
    public static class C10650d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10649c(0);
        }
    }

    static {
        new C17394d0("MVSurveysConfiguration");
        HashMap hashMap = new HashMap();
        f28480d = hashMap;
        hashMap.put(C25239c.class, new C10648b());
        hashMap.put(C25240d.class, new C10650d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPES, new FieldMetaData("types", (byte) 3, new ListMetaData(new EnumMetaData(MVSurveyType.class))));
        enumMap.put(_Fields.DELAY_INTERVAL_SEC, new FieldMetaData("delayIntervalSec", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28481e = unmodifiableMap;
        FieldMetaData.m61947a(MVSurveysConfiguration.class, unmodifiableMap);
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
        ((C25238b) f28480d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28480d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVSurveysConfiguration mVSurveysConfiguration = (MVSurveysConfiguration) obj;
        if (!getClass().equals(mVSurveysConfiguration.getClass())) {
            return getClass().getName().compareTo(mVSurveysConfiguration.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32004g()).compareTo(Boolean.valueOf(mVSurveysConfiguration.mo32004g()));
        if (compareTo != 0 || ((mo32004g() && (compareTo = C25082a.m62844h(this.types, mVSurveysConfiguration.types)) != 0) || (compareTo = Boolean.valueOf(mo32003f()).compareTo(Boolean.valueOf(mVSurveysConfiguration.mo32003f()))) != 0)) {
            return compareTo;
        }
        if (!mo32003f() || (c = C25082a.m62839c(this.delayIntervalSec, mVSurveysConfiguration.delayIntervalSec)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSurveysConfiguration)) {
            return false;
        }
        MVSurveysConfiguration mVSurveysConfiguration = (MVSurveysConfiguration) obj;
        boolean g = mo32004g();
        boolean g2 = mVSurveysConfiguration.mo32004g();
        if (((g || g2) && (!g || !g2 || !this.types.equals(mVSurveysConfiguration.types))) || this.delayIntervalSec != mVSurveysConfiguration.delayIntervalSec) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32003f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo32004g() {
        return this.types != null;
    }

    /* renamed from: h */
    public final void mo32005h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSurveysConfiguration(", "types:");
        List<MVSurveyType> list = this.types;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("delayIntervalSec:");
        return C13437d.m33707l(n, this.delayIntervalSec, ")");
    }
}
