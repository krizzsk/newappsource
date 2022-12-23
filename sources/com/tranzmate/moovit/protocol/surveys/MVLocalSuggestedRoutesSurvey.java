package com.tranzmate.moovit.protocol.surveys;

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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
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

public class MVLocalSuggestedRoutesSurvey implements TBase<MVLocalSuggestedRoutesSurvey, _Fields>, Serializable, Cloneable, Comparable<MVLocalSuggestedRoutesSurvey> {

    /* renamed from: b */
    public static final C25113c f28409b = new C25113c("decisionEventIndex", (byte) 8, 1);

    /* renamed from: c */
    public static final HashMap f28410c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28411d;
    private byte __isset_bitfield = 0;
    public int decisionEventIndex;

    public enum _Fields implements C25085c {
        DECISION_EVENT_INDEX(1, "decisionEventIndex");
        
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
            if (i != 1) {
                return null;
            }
            return DECISION_EVENT_INDEX;
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

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVLocalSuggestedRoutesSurvey$a */
    public static class C10609a extends C25239c<MVLocalSuggestedRoutesSurvey> {
        public C10609a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLocalSuggestedRoutesSurvey mVLocalSuggestedRoutesSurvey = (MVLocalSuggestedRoutesSurvey) tBase;
            mVLocalSuggestedRoutesSurvey.getClass();
            C25113c cVar = MVLocalSuggestedRoutesSurvey.f28409b;
            gVar.mo61687K();
            gVar.mo61711x(MVLocalSuggestedRoutesSurvey.f28409b);
            C16530d.m42020n(gVar, mVLocalSuggestedRoutesSurvey.decisionEventIndex);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLocalSuggestedRoutesSurvey mVLocalSuggestedRoutesSurvey = (MVLocalSuggestedRoutesSurvey) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLocalSuggestedRoutesSurvey.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 8) {
                    mVLocalSuggestedRoutesSurvey.decisionEventIndex = gVar.mo61696i();
                    mVLocalSuggestedRoutesSurvey.mo31893g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVLocalSuggestedRoutesSurvey$b */
    public static class C10610b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10609a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVLocalSuggestedRoutesSurvey$c */
    public static class C10611c extends C25240d<MVLocalSuggestedRoutesSurvey> {
        public C10611c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLocalSuggestedRoutesSurvey mVLocalSuggestedRoutesSurvey = (MVLocalSuggestedRoutesSurvey) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLocalSuggestedRoutesSurvey.mo31892f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVLocalSuggestedRoutesSurvey.mo31892f()) {
                jVar.mo61678B(mVLocalSuggestedRoutesSurvey.decisionEventIndex);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLocalSuggestedRoutesSurvey mVLocalSuggestedRoutesSurvey = (MVLocalSuggestedRoutesSurvey) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVLocalSuggestedRoutesSurvey.decisionEventIndex = jVar.mo61696i();
                mVLocalSuggestedRoutesSurvey.mo31893g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVLocalSuggestedRoutesSurvey$d */
    public static class C10612d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10611c(0);
        }
    }

    static {
        new C17394d0("MVLocalSuggestedRoutesSurvey");
        HashMap hashMap = new HashMap();
        f28410c = hashMap;
        hashMap.put(C25239c.class, new C10610b());
        hashMap.put(C25240d.class, new C10612d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DECISION_EVENT_INDEX, new FieldMetaData("decisionEventIndex", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28411d = unmodifiableMap;
        FieldMetaData.m61947a(MVLocalSuggestedRoutesSurvey.class, unmodifiableMap);
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
        ((C25238b) f28410c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28410c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVLocalSuggestedRoutesSurvey mVLocalSuggestedRoutesSurvey = (MVLocalSuggestedRoutesSurvey) obj;
        if (!getClass().equals(mVLocalSuggestedRoutesSurvey.getClass())) {
            return getClass().getName().compareTo(mVLocalSuggestedRoutesSurvey.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31892f()).compareTo(Boolean.valueOf(mVLocalSuggestedRoutesSurvey.mo31892f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo31892f() || (c = C25082a.m62839c(this.decisionEventIndex, mVLocalSuggestedRoutesSurvey.decisionEventIndex)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVLocalSuggestedRoutesSurvey) && this.decisionEventIndex == ((MVLocalSuggestedRoutesSurvey) obj).decisionEventIndex) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31892f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo31893g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return C13437d.m33707l(C13437d.m33708n("MVLocalSuggestedRoutesSurvey(", "decisionEventIndex:"), this.decisionEventIndex, ")");
    }
}
