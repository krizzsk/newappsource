package com.tranzmate.moovit.protocol.ridesharing;

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

public class MVRSEventBookingBucketsResponse implements TBase<MVRSEventBookingBucketsResponse, _Fields>, Serializable, Cloneable, Comparable<MVRSEventBookingBucketsResponse> {

    /* renamed from: b */
    public static final C25113c f28047b = new C25113c("buckets", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f28048c = new C25113c("superEvent", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f28049d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28050e;
    public List<MVRSEventBucket> buckets;
    public MVRSSuperEvent superEvent;

    public enum _Fields implements C25085c {
        BUCKETS(1, "buckets"),
        SUPER_EVENT(2, "superEvent");
        
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
                return BUCKETS;
            }
            if (i != 2) {
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingBucketsResponse$a */
    public static class C10338a extends C25239c<MVRSEventBookingBucketsResponse> {
        public C10338a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBookingBucketsResponse mVRSEventBookingBucketsResponse = (MVRSEventBookingBucketsResponse) tBase;
            MVRSSuperEvent mVRSSuperEvent = mVRSEventBookingBucketsResponse.superEvent;
            if (mVRSSuperEvent != null) {
                mVRSSuperEvent.mo31384r();
            }
            C25113c cVar = MVRSEventBookingBucketsResponse.f28047b;
            gVar.mo61687K();
            if (mVRSEventBookingBucketsResponse.buckets != null) {
                gVar.mo61711x(MVRSEventBookingBucketsResponse.f28047b);
                gVar.mo61680D(new C25119e((byte) 12, mVRSEventBookingBucketsResponse.buckets.size()));
                for (MVRSEventBucket X0 : mVRSEventBookingBucketsResponse.buckets) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVRSEventBookingBucketsResponse.superEvent != null) {
                gVar.mo61711x(MVRSEventBookingBucketsResponse.f28048c);
                mVRSEventBookingBucketsResponse.superEvent.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBookingBucketsResponse mVRSEventBookingBucketsResponse = (MVRSEventBookingBucketsResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVRSSuperEvent mVRSSuperEvent = new MVRSSuperEvent();
                        mVRSEventBookingBucketsResponse.superEvent = mVRSSuperEvent;
                        mVRSSuperEvent.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVRSEventBookingBucketsResponse.buckets = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVRSEventBucket mVRSEventBucket = new MVRSEventBucket();
                        mVRSEventBucket.mo25201C1(gVar);
                        mVRSEventBookingBucketsResponse.buckets.add(mVRSEventBucket);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVRSSuperEvent mVRSSuperEvent2 = mVRSEventBookingBucketsResponse.superEvent;
            if (mVRSSuperEvent2 != null) {
                mVRSSuperEvent2.mo31384r();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingBucketsResponse$b */
    public static class C10339b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10338a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingBucketsResponse$c */
    public static class C10340c extends C25240d<MVRSEventBookingBucketsResponse> {
        public C10340c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBookingBucketsResponse mVRSEventBookingBucketsResponse = (MVRSEventBookingBucketsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRSEventBookingBucketsResponse.mo31244f()) {
                bitSet.set(0);
            }
            if (mVRSEventBookingBucketsResponse.mo31245g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVRSEventBookingBucketsResponse.mo31244f()) {
                jVar.mo61678B(mVRSEventBookingBucketsResponse.buckets.size());
                for (MVRSEventBucket X0 : mVRSEventBookingBucketsResponse.buckets) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVRSEventBookingBucketsResponse.mo31245g()) {
                mVRSEventBookingBucketsResponse.superEvent.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBookingBucketsResponse mVRSEventBookingBucketsResponse = (MVRSEventBookingBucketsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVRSEventBookingBucketsResponse.buckets = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVRSEventBucket mVRSEventBucket = new MVRSEventBucket();
                    mVRSEventBucket.mo25201C1(jVar);
                    mVRSEventBookingBucketsResponse.buckets.add(mVRSEventBucket);
                }
            }
            if (T.get(1)) {
                MVRSSuperEvent mVRSSuperEvent = new MVRSSuperEvent();
                mVRSEventBookingBucketsResponse.superEvent = mVRSSuperEvent;
                mVRSSuperEvent.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingBucketsResponse$d */
    public static class C10341d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10340c(0);
        }
    }

    static {
        new C17394d0("MVRSEventBookingBucketsResponse");
        HashMap hashMap = new HashMap();
        f28049d = hashMap;
        hashMap.put(C25239c.class, new C10339b());
        hashMap.put(C25240d.class, new C10341d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.BUCKETS, new FieldMetaData("buckets", (byte) 3, new ListMetaData(new StructMetaData(MVRSEventBucket.class))));
        enumMap.put(_Fields.SUPER_EVENT, new FieldMetaData("superEvent", (byte) 3, new StructMetaData(MVRSSuperEvent.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28050e = unmodifiableMap;
        FieldMetaData.m61947a(MVRSEventBookingBucketsResponse.class, unmodifiableMap);
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
        ((C25238b) f28049d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28049d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVRSEventBookingBucketsResponse mVRSEventBookingBucketsResponse = (MVRSEventBookingBucketsResponse) obj;
        if (!getClass().equals(mVRSEventBookingBucketsResponse.getClass())) {
            return getClass().getName().compareTo(mVRSEventBookingBucketsResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31244f()).compareTo(Boolean.valueOf(mVRSEventBookingBucketsResponse.mo31244f()));
        if (compareTo2 != 0 || ((mo31244f() && (compareTo2 = C25082a.m62844h(this.buckets, mVRSEventBookingBucketsResponse.buckets)) != 0) || (compareTo2 = Boolean.valueOf(mo31245g()).compareTo(Boolean.valueOf(mVRSEventBookingBucketsResponse.mo31245g()))) != 0)) {
            return compareTo2;
        }
        if (!mo31245g() || (compareTo = this.superEvent.compareTo(mVRSEventBookingBucketsResponse.superEvent)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVRSEventBookingBucketsResponse)) {
            return false;
        }
        MVRSEventBookingBucketsResponse mVRSEventBookingBucketsResponse = (MVRSEventBookingBucketsResponse) obj;
        boolean f = mo31244f();
        boolean f2 = mVRSEventBookingBucketsResponse.mo31244f();
        if ((f || f2) && (!f || !f2 || !this.buckets.equals(mVRSEventBookingBucketsResponse.buckets))) {
            return false;
        }
        boolean g = mo31245g();
        boolean g2 = mVRSEventBookingBucketsResponse.mo31245g();
        if ((g || g2) && (!g || !g2 || !this.superEvent.mo31369a(mVRSEventBookingBucketsResponse.superEvent))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31244f() {
        return this.buckets != null;
    }

    /* renamed from: g */
    public final boolean mo31245g() {
        return this.superEvent != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRSEventBookingBucketsResponse(", "buckets:");
        List<MVRSEventBucket> list = this.buckets;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("superEvent:");
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
