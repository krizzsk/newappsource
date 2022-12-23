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

public class MVSurveyRequest implements TBase<MVSurveyRequest, _Fields>, Serializable, Cloneable, Comparable<MVSurveyRequest> {

    /* renamed from: b */
    public static final C25113c f28461b = new C25113c("contexts", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f28462c = new C25113c("events", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f28463d = new C25113c("percentage", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f28464e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28465f;
    private byte __isset_bitfield = 0;
    public List<MVSurveyContext> contexts;
    public List<MVSurveyEvent> events;
    public int percentage;

    public enum _Fields implements C25085c {
        CONTEXTS(1, "contexts"),
        EVENTS(2, "events"),
        PERCENTAGE(3, "percentage");
        
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
                return CONTEXTS;
            }
            if (i == 2) {
                return EVENTS;
            }
            if (i != 3) {
                return null;
            }
            return PERCENTAGE;
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

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyRequest$a */
    public static class C10635a extends C25239c<MVSurveyRequest> {
        public C10635a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSurveyRequest mVSurveyRequest = (MVSurveyRequest) tBase;
            mVSurveyRequest.getClass();
            C25113c cVar = MVSurveyRequest.f28461b;
            gVar.mo61687K();
            if (mVSurveyRequest.contexts != null) {
                gVar.mo61711x(MVSurveyRequest.f28461b);
                gVar.mo61680D(new C25119e((byte) 12, mVSurveyRequest.contexts.size()));
                for (MVSurveyContext X0 : mVSurveyRequest.contexts) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVSurveyRequest.events != null) {
                gVar.mo61711x(MVSurveyRequest.f28462c);
                gVar.mo61680D(new C25119e((byte) 12, mVSurveyRequest.events.size()));
                for (MVSurveyEvent X02 : mVSurveyRequest.events) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVSurveyRequest.f28463d);
            C16530d.m42020n(gVar, mVSurveyRequest.percentage);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSurveyRequest mVSurveyRequest = (MVSurveyRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSurveyRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVSurveyRequest.percentage = gVar.mo61696i();
                            mVSurveyRequest.mo31974i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVSurveyRequest.events = new ArrayList(k.f63395b);
                        while (i < k.f63395b) {
                            MVSurveyEvent mVSurveyEvent = new MVSurveyEvent();
                            mVSurveyEvent.mo25201C1(gVar);
                            mVSurveyRequest.events.add(mVSurveyEvent);
                            i++;
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k2 = gVar.mo61698k();
                    mVSurveyRequest.contexts = new ArrayList(k2.f63395b);
                    while (i < k2.f63395b) {
                        MVSurveyContext mVSurveyContext = new MVSurveyContext();
                        mVSurveyContext.mo25201C1(gVar);
                        mVSurveyRequest.contexts.add(mVSurveyContext);
                        i++;
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyRequest$b */
    public static class C10636b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10635a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyRequest$c */
    public static class C10637c extends C25240d<MVSurveyRequest> {
        public C10637c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSurveyRequest mVSurveyRequest = (MVSurveyRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSurveyRequest.mo31970f()) {
                bitSet.set(0);
            }
            if (mVSurveyRequest.mo31971g()) {
                bitSet.set(1);
            }
            if (mVSurveyRequest.mo31972h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVSurveyRequest.mo31970f()) {
                jVar.mo61678B(mVSurveyRequest.contexts.size());
                for (MVSurveyContext X0 : mVSurveyRequest.contexts) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVSurveyRequest.mo31971g()) {
                jVar.mo61678B(mVSurveyRequest.events.size());
                for (MVSurveyEvent X02 : mVSurveyRequest.events) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVSurveyRequest.mo31972h()) {
                jVar.mo61678B(mVSurveyRequest.percentage);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSurveyRequest mVSurveyRequest = (MVSurveyRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVSurveyRequest.contexts = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVSurveyContext mVSurveyContext = new MVSurveyContext();
                    mVSurveyContext.mo25201C1(jVar);
                    mVSurveyRequest.contexts.add(mVSurveyContext);
                }
            }
            if (T.get(1)) {
                int i3 = jVar.mo61696i();
                mVSurveyRequest.events = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVSurveyEvent mVSurveyEvent = new MVSurveyEvent();
                    mVSurveyEvent.mo25201C1(jVar);
                    mVSurveyRequest.events.add(mVSurveyEvent);
                }
            }
            if (T.get(2)) {
                mVSurveyRequest.percentage = jVar.mo61696i();
                mVSurveyRequest.mo31974i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyRequest$d */
    public static class C10638d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10637c(0);
        }
    }

    static {
        new C17394d0("MVSurveyRequest");
        HashMap hashMap = new HashMap();
        f28464e = hashMap;
        hashMap.put(C25239c.class, new C10636b());
        hashMap.put(C25240d.class, new C10638d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONTEXTS, new FieldMetaData("contexts", (byte) 3, new ListMetaData(new StructMetaData(MVSurveyContext.class))));
        enumMap.put(_Fields.EVENTS, new FieldMetaData("events", (byte) 3, new ListMetaData(new StructMetaData(MVSurveyEvent.class))));
        enumMap.put(_Fields.PERCENTAGE, new FieldMetaData("percentage", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28465f = unmodifiableMap;
        FieldMetaData.m61947a(MVSurveyRequest.class, unmodifiableMap);
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
        ((C25238b) f28464e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28464e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVSurveyRequest mVSurveyRequest = (MVSurveyRequest) obj;
        if (!getClass().equals(mVSurveyRequest.getClass())) {
            return getClass().getName().compareTo(mVSurveyRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31970f()).compareTo(Boolean.valueOf(mVSurveyRequest.mo31970f()));
        if (compareTo != 0 || ((mo31970f() && (compareTo = C25082a.m62844h(this.contexts, mVSurveyRequest.contexts)) != 0) || (compareTo = Boolean.valueOf(mo31971g()).compareTo(Boolean.valueOf(mVSurveyRequest.mo31971g()))) != 0 || ((mo31971g() && (compareTo = C25082a.m62844h(this.events, mVSurveyRequest.events)) != 0) || (compareTo = Boolean.valueOf(mo31972h()).compareTo(Boolean.valueOf(mVSurveyRequest.mo31972h()))) != 0))) {
            return compareTo;
        }
        if (!mo31972h() || (c = C25082a.m62839c(this.percentage, mVSurveyRequest.percentage)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSurveyRequest)) {
            return false;
        }
        MVSurveyRequest mVSurveyRequest = (MVSurveyRequest) obj;
        boolean f = mo31970f();
        boolean f2 = mVSurveyRequest.mo31970f();
        if ((f || f2) && (!f || !f2 || !this.contexts.equals(mVSurveyRequest.contexts))) {
            return false;
        }
        boolean g = mo31971g();
        boolean g2 = mVSurveyRequest.mo31971g();
        if (((g || g2) && (!g || !g2 || !this.events.equals(mVSurveyRequest.events))) || this.percentage != mVSurveyRequest.percentage) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31970f() {
        return this.contexts != null;
    }

    /* renamed from: g */
    public final boolean mo31971g() {
        return this.events != null;
    }

    /* renamed from: h */
    public final boolean mo31972h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo31974i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSurveyRequest(", "contexts:");
        List<MVSurveyContext> list = this.contexts;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("events:");
        List<MVSurveyEvent> list2 = this.events;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(", ");
        n.append("percentage:");
        return C13437d.m33707l(n, this.percentage, ")");
    }
}
