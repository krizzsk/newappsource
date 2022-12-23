package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.ridesharing.MVRSSuperEvent;
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

public class MVEventLeg implements TBase<MVEventLeg, _Fields>, Serializable, Cloneable, Comparable<MVEventLeg> {

    /* renamed from: b */
    public static final C25113c f29928b = new C25113c("superEvent", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f29929c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f29930d;
    public MVRSSuperEvent superEvent;

    public enum _Fields implements C25085c {
        SUPER_EVENT(1, "superEvent");
        
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
            return SUPER_EVENT;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVEventLeg$a */
    public static class C11538a extends C25239c<MVEventLeg> {
        public C11538a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEventLeg mVEventLeg = (MVEventLeg) tBase;
            MVRSSuperEvent mVRSSuperEvent = mVEventLeg.superEvent;
            if (mVRSSuperEvent != null) {
                mVRSSuperEvent.mo31384r();
            }
            C25113c cVar = MVEventLeg.f29928b;
            gVar.mo61687K();
            if (mVEventLeg.superEvent != null) {
                gVar.mo61711x(MVEventLeg.f29928b);
                mVEventLeg.superEvent.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEventLeg mVEventLeg = (MVEventLeg) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVRSSuperEvent mVRSSuperEvent = new MVRSSuperEvent();
                    mVEventLeg.superEvent = mVRSSuperEvent;
                    mVRSSuperEvent.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVRSSuperEvent mVRSSuperEvent2 = mVEventLeg.superEvent;
            if (mVRSSuperEvent2 != null) {
                mVRSSuperEvent2.mo31384r();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVEventLeg$b */
    public static class C11539b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11538a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVEventLeg$c */
    public static class C11540c extends C25240d<MVEventLeg> {
        public C11540c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEventLeg mVEventLeg = (MVEventLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVEventLeg.mo34311f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVEventLeg.mo34311f()) {
                mVEventLeg.superEvent.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEventLeg mVEventLeg = (MVEventLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVRSSuperEvent mVRSSuperEvent = new MVRSSuperEvent();
                mVEventLeg.superEvent = mVRSSuperEvent;
                mVRSSuperEvent.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVEventLeg$d */
    public static class C11541d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11540c(0);
        }
    }

    static {
        new C17394d0("MVEventLeg");
        HashMap hashMap = new HashMap();
        f29929c = hashMap;
        hashMap.put(C25239c.class, new C11539b());
        hashMap.put(C25240d.class, new C11541d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUPER_EVENT, new FieldMetaData("superEvent", (byte) 3, new StructMetaData(MVRSSuperEvent.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29930d = unmodifiableMap;
        FieldMetaData.m61947a(MVEventLeg.class, unmodifiableMap);
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
        ((C25238b) f29929c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29929c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVEventLeg mVEventLeg = (MVEventLeg) obj;
        if (!getClass().equals(mVEventLeg.getClass())) {
            return getClass().getName().compareTo(mVEventLeg.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34311f()).compareTo(Boolean.valueOf(mVEventLeg.mo34311f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo34311f() || (compareTo = this.superEvent.compareTo(mVEventLeg.superEvent)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVEventLeg)) {
            return false;
        }
        MVEventLeg mVEventLeg = (MVEventLeg) obj;
        boolean f = mo34311f();
        boolean f2 = mVEventLeg.mo34311f();
        if ((f || f2) && (!f || !f2 || !this.superEvent.mo31369a(mVEventLeg.superEvent))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34311f() {
        return this.superEvent != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVEventLeg(", "superEvent:");
        MVRSSuperEvent mVRSSuperEvent = this.superEvent;
        if (mVRSSuperEvent == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRSSuperEvent);
        }
        n.append(")");
        return n.toString();
    }
}
