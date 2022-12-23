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

public class MVSuggestedRoutesEvent implements TBase<MVSuggestedRoutesEvent, _Fields>, Serializable, Cloneable, Comparable<MVSuggestedRoutesEvent> {

    /* renamed from: b */
    public static final C25113c f28428b = new C25113c("timestamp", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f28429c = new C25113c("itineraryGuids", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f28430d = new C25113c("lastArrival", (byte) 10, 3);

    /* renamed from: e */
    public static final HashMap f28431e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28432f;
    private byte __isset_bitfield = 0;
    public List<String> itineraryGuids;
    public long lastArrival;
    private _Fields[] optionals = {_Fields.LAST_ARRIVAL};
    public long timestamp;

    public enum _Fields implements C25085c {
        TIMESTAMP(1, "timestamp"),
        ITINERARY_GUIDS(2, "itineraryGuids"),
        LAST_ARRIVAL(3, "lastArrival");
        
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
                return TIMESTAMP;
            }
            if (i == 2) {
                return ITINERARY_GUIDS;
            }
            if (i != 3) {
                return null;
            }
            return LAST_ARRIVAL;
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

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSuggestedRoutesEvent$a */
    public static class C10621a extends C25239c<MVSuggestedRoutesEvent> {
        public C10621a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSuggestedRoutesEvent mVSuggestedRoutesEvent = (MVSuggestedRoutesEvent) tBase;
            mVSuggestedRoutesEvent.getClass();
            C25113c cVar = MVSuggestedRoutesEvent.f28428b;
            gVar.mo61687K();
            gVar.mo61711x(MVSuggestedRoutesEvent.f28428b);
            gVar.mo61679C(mVSuggestedRoutesEvent.timestamp);
            gVar.mo61712y();
            if (mVSuggestedRoutesEvent.itineraryGuids != null) {
                gVar.mo61711x(MVSuggestedRoutesEvent.f28429c);
                gVar.mo61680D(new C25119e((byte) 11, mVSuggestedRoutesEvent.itineraryGuids.size()));
                for (String J : mVSuggestedRoutesEvent.itineraryGuids) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVSuggestedRoutesEvent.mo31923g()) {
                gVar.mo61711x(MVSuggestedRoutesEvent.f28430d);
                gVar.mo61679C(mVSuggestedRoutesEvent.lastArrival);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSuggestedRoutesEvent mVSuggestedRoutesEvent = (MVSuggestedRoutesEvent) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSuggestedRoutesEvent.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 10) {
                            mVSuggestedRoutesEvent.lastArrival = gVar.mo61697j();
                            mVSuggestedRoutesEvent.mo31926i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVSuggestedRoutesEvent.itineraryGuids = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            mVSuggestedRoutesEvent.itineraryGuids.add(gVar.mo61704q());
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVSuggestedRoutesEvent.timestamp = gVar.mo61697j();
                    mVSuggestedRoutesEvent.mo31927j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSuggestedRoutesEvent$b */
    public static class C10622b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10621a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSuggestedRoutesEvent$c */
    public static class C10623c extends C25240d<MVSuggestedRoutesEvent> {
        public C10623c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSuggestedRoutesEvent mVSuggestedRoutesEvent = (MVSuggestedRoutesEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSuggestedRoutesEvent.mo31924h()) {
                bitSet.set(0);
            }
            if (mVSuggestedRoutesEvent.mo31922f()) {
                bitSet.set(1);
            }
            if (mVSuggestedRoutesEvent.mo31923g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVSuggestedRoutesEvent.mo31924h()) {
                jVar.mo61679C(mVSuggestedRoutesEvent.timestamp);
            }
            if (mVSuggestedRoutesEvent.mo31922f()) {
                jVar.mo61678B(mVSuggestedRoutesEvent.itineraryGuids.size());
                for (String J : mVSuggestedRoutesEvent.itineraryGuids) {
                    jVar.mo61686J(J);
                }
            }
            if (mVSuggestedRoutesEvent.mo31923g()) {
                jVar.mo61679C(mVSuggestedRoutesEvent.lastArrival);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSuggestedRoutesEvent mVSuggestedRoutesEvent = (MVSuggestedRoutesEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVSuggestedRoutesEvent.timestamp = jVar.mo61697j();
                mVSuggestedRoutesEvent.mo31927j();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVSuggestedRoutesEvent.itineraryGuids = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVSuggestedRoutesEvent.itineraryGuids.add(jVar.mo61704q());
                }
            }
            if (T.get(2)) {
                mVSuggestedRoutesEvent.lastArrival = jVar.mo61697j();
                mVSuggestedRoutesEvent.mo31926i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSuggestedRoutesEvent$d */
    public static class C10624d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10623c(0);
        }
    }

    static {
        new C17394d0("MVSuggestedRoutesEvent");
        HashMap hashMap = new HashMap();
        f28431e = hashMap;
        hashMap.put(C25239c.class, new C10622b());
        hashMap.put(C25240d.class, new C10624d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.ITINERARY_GUIDS, new FieldMetaData("itineraryGuids", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.LAST_ARRIVAL, new FieldMetaData("lastArrival", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28432f = unmodifiableMap;
        FieldMetaData.m61947a(MVSuggestedRoutesEvent.class, unmodifiableMap);
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
        ((C25238b) f28431e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28431e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVSuggestedRoutesEvent mVSuggestedRoutesEvent = (MVSuggestedRoutesEvent) obj;
        if (!getClass().equals(mVSuggestedRoutesEvent.getClass())) {
            return getClass().getName().compareTo(mVSuggestedRoutesEvent.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31924h()).compareTo(Boolean.valueOf(mVSuggestedRoutesEvent.mo31924h()));
        if (compareTo != 0 || ((mo31924h() && (compareTo = C25082a.m62840d(this.timestamp, mVSuggestedRoutesEvent.timestamp)) != 0) || (compareTo = Boolean.valueOf(mo31922f()).compareTo(Boolean.valueOf(mVSuggestedRoutesEvent.mo31922f()))) != 0 || ((mo31922f() && (compareTo = C25082a.m62844h(this.itineraryGuids, mVSuggestedRoutesEvent.itineraryGuids)) != 0) || (compareTo = Boolean.valueOf(mo31923g()).compareTo(Boolean.valueOf(mVSuggestedRoutesEvent.mo31923g()))) != 0))) {
            return compareTo;
        }
        if (!mo31923g() || (d = C25082a.m62840d(this.lastArrival, mVSuggestedRoutesEvent.lastArrival)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSuggestedRoutesEvent)) {
            return false;
        }
        MVSuggestedRoutesEvent mVSuggestedRoutesEvent = (MVSuggestedRoutesEvent) obj;
        if (this.timestamp != mVSuggestedRoutesEvent.timestamp) {
            return false;
        }
        boolean f = mo31922f();
        boolean f2 = mVSuggestedRoutesEvent.mo31922f();
        if ((f || f2) && (!f || !f2 || !this.itineraryGuids.equals(mVSuggestedRoutesEvent.itineraryGuids))) {
            return false;
        }
        boolean g = mo31923g();
        boolean g2 = mVSuggestedRoutesEvent.mo31923g();
        if ((g || g2) && (!g || !g2 || this.lastArrival != mVSuggestedRoutesEvent.lastArrival)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31922f() {
        return this.itineraryGuids != null;
    }

    /* renamed from: g */
    public final boolean mo31923g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo31924h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo31926i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: j */
    public final void mo31927j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSuggestedRoutesEvent(", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "itineraryGuids:");
        List<String> list = this.itineraryGuids;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo31923g()) {
            n.append(", ");
            n.append("lastArrival:");
            n.append(this.lastArrival);
        }
        n.append(")");
        return n.toString();
    }
}
