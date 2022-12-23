package com.tranzmate.moovit.protocol.serviceAlerts;

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

public class MVGetServiceAlertsByLinesResponse implements TBase<MVGetServiceAlertsByLinesResponse, _Fields>, Serializable, Cloneable, Comparable<MVGetServiceAlertsByLinesResponse> {

    /* renamed from: b */
    public static final C25113c f28250b = new C25113c("alertsDigest", (byte) 15, 1);

    /* renamed from: c */
    public static final HashMap f28251c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28252d;
    public List<MVLineAlertDigest> alertsDigest;

    public enum _Fields implements C25085c {
        ALERTS_DIGEST(1, "alertsDigest");
        
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
            return ALERTS_DIGEST;
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

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVGetServiceAlertsByLinesResponse$a */
    public static class C10479a extends C25239c<MVGetServiceAlertsByLinesResponse> {
        public C10479a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetServiceAlertsByLinesResponse mVGetServiceAlertsByLinesResponse = (MVGetServiceAlertsByLinesResponse) tBase;
            mVGetServiceAlertsByLinesResponse.getClass();
            C25113c cVar = MVGetServiceAlertsByLinesResponse.f28250b;
            gVar.mo61687K();
            if (mVGetServiceAlertsByLinesResponse.alertsDigest != null) {
                gVar.mo61711x(MVGetServiceAlertsByLinesResponse.f28250b);
                gVar.mo61680D(new C25119e((byte) 12, mVGetServiceAlertsByLinesResponse.alertsDigest.size()));
                for (MVLineAlertDigest X0 : mVGetServiceAlertsByLinesResponse.alertsDigest) {
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
            MVGetServiceAlertsByLinesResponse mVGetServiceAlertsByLinesResponse = (MVGetServiceAlertsByLinesResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVGetServiceAlertsByLinesResponse.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVGetServiceAlertsByLinesResponse.alertsDigest = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVLineAlertDigest mVLineAlertDigest = new MVLineAlertDigest();
                        mVLineAlertDigest.mo25201C1(gVar);
                        mVGetServiceAlertsByLinesResponse.alertsDigest.add(mVLineAlertDigest);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVGetServiceAlertsByLinesResponse$b */
    public static class C10480b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10479a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVGetServiceAlertsByLinesResponse$c */
    public static class C10481c extends C25240d<MVGetServiceAlertsByLinesResponse> {
        public C10481c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetServiceAlertsByLinesResponse mVGetServiceAlertsByLinesResponse = (MVGetServiceAlertsByLinesResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetServiceAlertsByLinesResponse.mo31603f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVGetServiceAlertsByLinesResponse.mo31603f()) {
                jVar.mo61678B(mVGetServiceAlertsByLinesResponse.alertsDigest.size());
                for (MVLineAlertDigest X0 : mVGetServiceAlertsByLinesResponse.alertsDigest) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetServiceAlertsByLinesResponse mVGetServiceAlertsByLinesResponse = (MVGetServiceAlertsByLinesResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                int i = jVar.mo61696i();
                mVGetServiceAlertsByLinesResponse.alertsDigest = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVLineAlertDigest mVLineAlertDigest = new MVLineAlertDigest();
                    mVLineAlertDigest.mo25201C1(jVar);
                    mVGetServiceAlertsByLinesResponse.alertsDigest.add(mVLineAlertDigest);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVGetServiceAlertsByLinesResponse$d */
    public static class C10482d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10481c(0);
        }
    }

    static {
        new C17394d0("MVGetServiceAlertsByLinesResponse");
        HashMap hashMap = new HashMap();
        f28251c = hashMap;
        hashMap.put(C25239c.class, new C10480b());
        hashMap.put(C25240d.class, new C10482d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ALERTS_DIGEST, new FieldMetaData("alertsDigest", (byte) 3, new ListMetaData(new StructMetaData(MVLineAlertDigest.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28252d = unmodifiableMap;
        FieldMetaData.m61947a(MVGetServiceAlertsByLinesResponse.class, unmodifiableMap);
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
        ((C25238b) f28251c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28251c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVGetServiceAlertsByLinesResponse mVGetServiceAlertsByLinesResponse = (MVGetServiceAlertsByLinesResponse) obj;
        if (!getClass().equals(mVGetServiceAlertsByLinesResponse.getClass())) {
            return getClass().getName().compareTo(mVGetServiceAlertsByLinesResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31603f()).compareTo(Boolean.valueOf(mVGetServiceAlertsByLinesResponse.mo31603f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo31603f() || (h = C25082a.m62844h(this.alertsDigest, mVGetServiceAlertsByLinesResponse.alertsDigest)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetServiceAlertsByLinesResponse)) {
            return false;
        }
        MVGetServiceAlertsByLinesResponse mVGetServiceAlertsByLinesResponse = (MVGetServiceAlertsByLinesResponse) obj;
        boolean f = mo31603f();
        boolean f2 = mVGetServiceAlertsByLinesResponse.mo31603f();
        if ((f || f2) && (!f || !f2 || !this.alertsDigest.equals(mVGetServiceAlertsByLinesResponse.alertsDigest))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31603f() {
        return this.alertsDigest != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetServiceAlertsByLinesResponse(", "alertsDigest:");
        List<MVLineAlertDigest> list = this.alertsDigest;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
