package com.tranzmate.moovit.protocol.navigation;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVGeofence;
import com.tranzmate.moovit.protocol.reports.MVReportMode;
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
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
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

public class MVNavigationResponse implements TBase<MVNavigationResponse, _Fields>, Serializable, Cloneable, Comparable<MVNavigationResponse> {

    /* renamed from: b */
    public static final C25113c f26853b = new C25113c("navigationGuid", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26854c = new C25113c("legs", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f26855d = new C25113c("criticalAreas", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f26856e = new C25113c("relativeExpirationSeconds", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f26857f = new C25113c("reportMode", (byte) 8, 5);

    /* renamed from: g */
    public static final HashMap f26858g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26859h;
    private byte __isset_bitfield = 0;
    public List<MVGeofence> criticalAreas;
    public List<MVNavigationLeg> legs;
    public String navigationGuid;
    public int relativeExpirationSeconds;
    public MVReportMode reportMode;

    public enum _Fields implements C25085c {
        NAVIGATION_GUID(1, "navigationGuid"),
        LEGS(2, "legs"),
        CRITICAL_AREAS(3, "criticalAreas"),
        RELATIVE_EXPIRATION_SECONDS(4, "relativeExpirationSeconds"),
        REPORT_MODE(5, "reportMode");
        
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
                return NAVIGATION_GUID;
            }
            if (i == 2) {
                return LEGS;
            }
            if (i == 3) {
                return CRITICAL_AREAS;
            }
            if (i == 4) {
                return RELATIVE_EXPIRATION_SECONDS;
            }
            if (i != 5) {
                return null;
            }
            return REPORT_MODE;
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

    /* renamed from: com.tranzmate.moovit.protocol.navigation.MVNavigationResponse$a */
    public static class C9432a extends C25239c<MVNavigationResponse> {
        public C9432a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNavigationResponse mVNavigationResponse = (MVNavigationResponse) tBase;
            mVNavigationResponse.getClass();
            C25113c cVar = MVNavigationResponse.f26853b;
            gVar.mo61687K();
            if (mVNavigationResponse.navigationGuid != null) {
                gVar.mo61711x(MVNavigationResponse.f26853b);
                gVar.mo61686J(mVNavigationResponse.navigationGuid);
                gVar.mo61712y();
            }
            if (mVNavigationResponse.legs != null) {
                gVar.mo61711x(MVNavigationResponse.f26854c);
                gVar.mo61680D(new C25119e((byte) 12, mVNavigationResponse.legs.size()));
                for (MVNavigationLeg X0 : mVNavigationResponse.legs) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVNavigationResponse.criticalAreas != null) {
                gVar.mo61711x(MVNavigationResponse.f26855d);
                gVar.mo61680D(new C25119e((byte) 12, mVNavigationResponse.criticalAreas.size()));
                for (MVGeofence X02 : mVNavigationResponse.criticalAreas) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVNavigationResponse.f26856e);
            gVar.mo61678B(mVNavigationResponse.relativeExpirationSeconds);
            gVar.mo61712y();
            if (mVNavigationResponse.reportMode != null) {
                gVar.mo61711x(MVNavigationResponse.f26857f);
                gVar.mo61678B(mVNavigationResponse.reportMode.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNavigationResponse mVNavigationResponse = (MVNavigationResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVNavigationResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    int i = 0;
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 8) {
                                    mVNavigationResponse.reportMode = MVReportMode.findByValue(gVar.mo61696i());
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVNavigationResponse.relativeExpirationSeconds = gVar.mo61696i();
                                mVNavigationResponse.mo29205k();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVNavigationResponse.criticalAreas = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVGeofence mVGeofence = new MVGeofence();
                                mVGeofence.mo25201C1(gVar);
                                mVNavigationResponse.criticalAreas.add(mVGeofence);
                                i++;
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k2 = gVar.mo61698k();
                        mVNavigationResponse.legs = new ArrayList(k2.f63395b);
                        while (i < k2.f63395b) {
                            MVNavigationLeg mVNavigationLeg = new MVNavigationLeg();
                            mVNavigationLeg.mo25201C1(gVar);
                            mVNavigationResponse.legs.add(mVNavigationLeg);
                            i++;
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVNavigationResponse.navigationGuid = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.navigation.MVNavigationResponse$b */
    public static class C9433b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9432a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.navigation.MVNavigationResponse$c */
    public static class C9434c extends C25240d<MVNavigationResponse> {
        public C9434c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNavigationResponse mVNavigationResponse = (MVNavigationResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVNavigationResponse.mo29201h()) {
                bitSet.set(0);
            }
            if (mVNavigationResponse.mo29200g()) {
                bitSet.set(1);
            }
            if (mVNavigationResponse.mo29199f()) {
                bitSet.set(2);
            }
            if (mVNavigationResponse.mo29203i()) {
                bitSet.set(3);
            }
            if (mVNavigationResponse.mo29204j()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVNavigationResponse.mo29201h()) {
                jVar.mo61686J(mVNavigationResponse.navigationGuid);
            }
            if (mVNavigationResponse.mo29200g()) {
                jVar.mo61678B(mVNavigationResponse.legs.size());
                for (MVNavigationLeg X0 : mVNavigationResponse.legs) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVNavigationResponse.mo29199f()) {
                jVar.mo61678B(mVNavigationResponse.criticalAreas.size());
                for (MVGeofence X02 : mVNavigationResponse.criticalAreas) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVNavigationResponse.mo29203i()) {
                jVar.mo61678B(mVNavigationResponse.relativeExpirationSeconds);
            }
            if (mVNavigationResponse.mo29204j()) {
                jVar.mo61678B(mVNavigationResponse.reportMode.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNavigationResponse mVNavigationResponse = (MVNavigationResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVNavigationResponse.navigationGuid = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVNavigationResponse.legs = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVNavigationLeg mVNavigationLeg = new MVNavigationLeg();
                    mVNavigationLeg.mo25201C1(jVar);
                    mVNavigationResponse.legs.add(mVNavigationLeg);
                }
            }
            if (T.get(2)) {
                int i3 = jVar.mo61696i();
                mVNavigationResponse.criticalAreas = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVGeofence mVGeofence = new MVGeofence();
                    mVGeofence.mo25201C1(jVar);
                    mVNavigationResponse.criticalAreas.add(mVGeofence);
                }
            }
            if (T.get(3)) {
                mVNavigationResponse.relativeExpirationSeconds = jVar.mo61696i();
                mVNavigationResponse.mo29205k();
            }
            if (T.get(4)) {
                mVNavigationResponse.reportMode = MVReportMode.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.navigation.MVNavigationResponse$d */
    public static class C9435d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9434c(0);
        }
    }

    static {
        new C17394d0("MVNavigationResponse");
        HashMap hashMap = new HashMap();
        f26858g = hashMap;
        hashMap.put(C25239c.class, new C9433b());
        hashMap.put(C25240d.class, new C9435d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NAVIGATION_GUID, new FieldMetaData("navigationGuid", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LEGS, new FieldMetaData("legs", (byte) 3, new ListMetaData(new StructMetaData(MVNavigationLeg.class))));
        enumMap.put(_Fields.CRITICAL_AREAS, new FieldMetaData("criticalAreas", (byte) 3, new ListMetaData(new StructMetaData(MVGeofence.class))));
        enumMap.put(_Fields.RELATIVE_EXPIRATION_SECONDS, new FieldMetaData("relativeExpirationSeconds", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.REPORT_MODE, new FieldMetaData("reportMode", (byte) 3, new EnumMetaData(MVReportMode.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26859h = unmodifiableMap;
        FieldMetaData.m61947a(MVNavigationResponse.class, unmodifiableMap);
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
        ((C25238b) f26858g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26858g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVNavigationResponse mVNavigationResponse = (MVNavigationResponse) obj;
        if (!getClass().equals(mVNavigationResponse.getClass())) {
            return getClass().getName().compareTo(mVNavigationResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29201h()).compareTo(Boolean.valueOf(mVNavigationResponse.mo29201h()));
        if (compareTo2 != 0 || ((mo29201h() && (compareTo2 = this.navigationGuid.compareTo(mVNavigationResponse.navigationGuid)) != 0) || (compareTo2 = Boolean.valueOf(mo29200g()).compareTo(Boolean.valueOf(mVNavigationResponse.mo29200g()))) != 0 || ((mo29200g() && (compareTo2 = C25082a.m62844h(this.legs, mVNavigationResponse.legs)) != 0) || (compareTo2 = Boolean.valueOf(mo29199f()).compareTo(Boolean.valueOf(mVNavigationResponse.mo29199f()))) != 0 || ((mo29199f() && (compareTo2 = C25082a.m62844h(this.criticalAreas, mVNavigationResponse.criticalAreas)) != 0) || (compareTo2 = Boolean.valueOf(mo29203i()).compareTo(Boolean.valueOf(mVNavigationResponse.mo29203i()))) != 0 || ((mo29203i() && (compareTo2 = C25082a.m62839c(this.relativeExpirationSeconds, mVNavigationResponse.relativeExpirationSeconds)) != 0) || (compareTo2 = Boolean.valueOf(mo29204j()).compareTo(Boolean.valueOf(mVNavigationResponse.mo29204j()))) != 0))))) {
            return compareTo2;
        }
        if (!mo29204j() || (compareTo = this.reportMode.compareTo(mVNavigationResponse.reportMode)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVNavigationResponse)) {
            return false;
        }
        MVNavigationResponse mVNavigationResponse = (MVNavigationResponse) obj;
        boolean h = mo29201h();
        boolean h2 = mVNavigationResponse.mo29201h();
        if ((h || h2) && (!h || !h2 || !this.navigationGuid.equals(mVNavigationResponse.navigationGuid))) {
            return false;
        }
        boolean g = mo29200g();
        boolean g2 = mVNavigationResponse.mo29200g();
        if ((g || g2) && (!g || !g2 || !this.legs.equals(mVNavigationResponse.legs))) {
            return false;
        }
        boolean f = mo29199f();
        boolean f2 = mVNavigationResponse.mo29199f();
        if (((f || f2) && (!f || !f2 || !this.criticalAreas.equals(mVNavigationResponse.criticalAreas))) || this.relativeExpirationSeconds != mVNavigationResponse.relativeExpirationSeconds) {
            return false;
        }
        boolean j = mo29204j();
        boolean j2 = mVNavigationResponse.mo29204j();
        if ((j || j2) && (!j || !j2 || !this.reportMode.equals(mVNavigationResponse.reportMode))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29199f() {
        return this.criticalAreas != null;
    }

    /* renamed from: g */
    public final boolean mo29200g() {
        return this.legs != null;
    }

    /* renamed from: h */
    public final boolean mo29201h() {
        return this.navigationGuid != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29203i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo29204j() {
        return this.reportMode != null;
    }

    /* renamed from: k */
    public final void mo29205k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVNavigationResponse(", "navigationGuid:");
        String str = this.navigationGuid;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("legs:");
        List<MVNavigationLeg> list = this.legs;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("criticalAreas:");
        List<MVGeofence> list2 = this.criticalAreas;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(", ");
        n.append("relativeExpirationSeconds:");
        C0016g.m42z(n, this.relativeExpirationSeconds, ", ", "reportMode:");
        MVReportMode mVReportMode = this.reportMode;
        if (mVReportMode == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVReportMode);
        }
        n.append(")");
        return n.toString();
    }
}
