package com.tranzmate.moovit.protocol.ridesharing;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
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

public class MVRSSuperEvent implements TBase<MVRSSuperEvent, _Fields>, Serializable, Cloneable, Comparable<MVRSSuperEvent> {

    /* renamed from: b */
    public static final C25113c f28115b = new C25113c("superEventId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28116c = new C25113c("image", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28117d = new C25113c("name", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28118e = new C25113c("details", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f28119f = new C25113c("fromTime", (byte) 10, 5);

    /* renamed from: g */
    public static final C25113c f28120g = new C25113c("toTime", (byte) 10, 6);

    /* renamed from: h */
    public static final C25113c f28121h = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 7);

    /* renamed from: i */
    public static final C25113c f28122i = new C25113c("locationDescription", (byte) 11, 8);

    /* renamed from: j */
    public static final HashMap f28123j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f28124k;
    private byte __isset_bitfield = 0;
    public String details;
    public long fromTime;
    public MVImageReferenceWithParams image;
    public MVLatLon location;
    public String locationDescription;
    public String name;
    private _Fields[] optionals = {_Fields.TO_TIME};
    public int superEventId;
    public long toTime;

    public enum _Fields implements C25085c {
        SUPER_EVENT_ID(1, "superEventId"),
        IMAGE(2, "image"),
        NAME(3, "name"),
        DETAILS(4, "details"),
        FROM_TIME(5, "fromTime"),
        TO_TIME(6, "toTime"),
        LOCATION(7, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        LOCATION_DESCRIPTION(8, "locationDescription");
        
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
            switch (i) {
                case 1:
                    return SUPER_EVENT_ID;
                case 2:
                    return IMAGE;
                case 3:
                    return NAME;
                case 4:
                    return DETAILS;
                case 5:
                    return FROM_TIME;
                case 6:
                    return TO_TIME;
                case 7:
                    return LOCATION;
                case 8:
                    return LOCATION_DESCRIPTION;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSSuperEvent$a */
    public static class C10386a extends C25239c<MVRSSuperEvent> {
        public C10386a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSSuperEvent mVRSSuperEvent = (MVRSSuperEvent) tBase;
            mVRSSuperEvent.mo31384r();
            C25113c cVar = MVRSSuperEvent.f28115b;
            gVar.mo61687K();
            gVar.mo61711x(MVRSSuperEvent.f28115b);
            gVar.mo61678B(mVRSSuperEvent.superEventId);
            gVar.mo61712y();
            if (mVRSSuperEvent.image != null) {
                gVar.mo61711x(MVRSSuperEvent.f28116c);
                mVRSSuperEvent.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRSSuperEvent.name != null) {
                gVar.mo61711x(MVRSSuperEvent.f28117d);
                gVar.mo61686J(mVRSSuperEvent.name);
                gVar.mo61712y();
            }
            if (mVRSSuperEvent.details != null) {
                gVar.mo61711x(MVRSSuperEvent.f28118e);
                gVar.mo61686J(mVRSSuperEvent.details);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVRSSuperEvent.f28119f);
            gVar.mo61679C(mVRSSuperEvent.fromTime);
            gVar.mo61712y();
            if (mVRSSuperEvent.mo31380m()) {
                gVar.mo61711x(MVRSSuperEvent.f28120g);
                gVar.mo61679C(mVRSSuperEvent.toTime);
                gVar.mo61712y();
            }
            if (mVRSSuperEvent.location != null) {
                gVar.mo61711x(MVRSSuperEvent.f28121h);
                mVRSSuperEvent.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRSSuperEvent.locationDescription != null) {
                gVar.mo61711x(MVRSSuperEvent.f28122i);
                gVar.mo61686J(mVRSSuperEvent.locationDescription);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSSuperEvent mVRSSuperEvent = (MVRSSuperEvent) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVRSSuperEvent.mo31384r();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSSuperEvent.superEventId = gVar.mo61696i();
                            mVRSSuperEvent.mo31382p();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                            mVRSSuperEvent.image = mVImageReferenceWithParams;
                            mVImageReferenceWithParams.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSSuperEvent.name = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSSuperEvent.details = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSSuperEvent.fromTime = gVar.mo61697j();
                            mVRSSuperEvent.mo31381o();
                            break;
                        }
                    case 6:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSSuperEvent.toTime = gVar.mo61697j();
                            mVRSSuperEvent.mo31383q();
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLatLon mVLatLon = new MVLatLon();
                            mVRSSuperEvent.location = mVLatLon;
                            mVLatLon.mo25201C1(gVar);
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSSuperEvent.locationDescription = gVar.mo61704q();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSSuperEvent$b */
    public static class C10387b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10386a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSSuperEvent$c */
    public static class C10388c extends C25240d<MVRSSuperEvent> {
        public C10388c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSSuperEvent mVRSSuperEvent = (MVRSSuperEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRSSuperEvent.mo31379l()) {
                bitSet.set(0);
            }
            if (mVRSSuperEvent.mo31374h()) {
                bitSet.set(1);
            }
            if (mVRSSuperEvent.mo31378k()) {
                bitSet.set(2);
            }
            if (mVRSSuperEvent.mo31372f()) {
                bitSet.set(3);
            }
            if (mVRSSuperEvent.mo31373g()) {
                bitSet.set(4);
            }
            if (mVRSSuperEvent.mo31380m()) {
                bitSet.set(5);
            }
            if (mVRSSuperEvent.mo31376i()) {
                bitSet.set(6);
            }
            if (mVRSSuperEvent.mo31377j()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVRSSuperEvent.mo31379l()) {
                jVar.mo61678B(mVRSSuperEvent.superEventId);
            }
            if (mVRSSuperEvent.mo31374h()) {
                mVRSSuperEvent.image.mo25202X0(jVar);
            }
            if (mVRSSuperEvent.mo31378k()) {
                jVar.mo61686J(mVRSSuperEvent.name);
            }
            if (mVRSSuperEvent.mo31372f()) {
                jVar.mo61686J(mVRSSuperEvent.details);
            }
            if (mVRSSuperEvent.mo31373g()) {
                jVar.mo61679C(mVRSSuperEvent.fromTime);
            }
            if (mVRSSuperEvent.mo31380m()) {
                jVar.mo61679C(mVRSSuperEvent.toTime);
            }
            if (mVRSSuperEvent.mo31376i()) {
                mVRSSuperEvent.location.mo25202X0(jVar);
            }
            if (mVRSSuperEvent.mo31377j()) {
                jVar.mo61686J(mVRSSuperEvent.locationDescription);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSSuperEvent mVRSSuperEvent = (MVRSSuperEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVRSSuperEvent.superEventId = jVar.mo61696i();
                mVRSSuperEvent.mo31382p();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVRSSuperEvent.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVRSSuperEvent.name = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVRSSuperEvent.details = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVRSSuperEvent.fromTime = jVar.mo61697j();
                mVRSSuperEvent.mo31381o();
            }
            if (T.get(5)) {
                mVRSSuperEvent.toTime = jVar.mo61697j();
                mVRSSuperEvent.mo31383q();
            }
            if (T.get(6)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVRSSuperEvent.location = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(7)) {
                mVRSSuperEvent.locationDescription = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSSuperEvent$d */
    public static class C10389d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10388c(0);
        }
    }

    static {
        new C17394d0("MVRSSuperEvent");
        HashMap hashMap = new HashMap();
        f28123j = hashMap;
        hashMap.put(C25239c.class, new C10387b());
        hashMap.put(C25240d.class, new C10389d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUPER_EVENT_ID, new FieldMetaData("superEventId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DETAILS, new FieldMetaData("details", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FROM_TIME, new FieldMetaData("fromTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.TO_TIME, new FieldMetaData("toTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.LOCATION_DESCRIPTION, new FieldMetaData("locationDescription", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28124k = unmodifiableMap;
        FieldMetaData.m61947a(MVRSSuperEvent.class, unmodifiableMap);
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
        ((C25238b) f28123j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28123j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo31369a(MVRSSuperEvent mVRSSuperEvent) {
        if (mVRSSuperEvent == null || this.superEventId != mVRSSuperEvent.superEventId) {
            return false;
        }
        boolean h = mo31374h();
        boolean h2 = mVRSSuperEvent.mo31374h();
        if ((h || h2) && (!h || !h2 || !this.image.mo26245a(mVRSSuperEvent.image))) {
            return false;
        }
        boolean k = mo31378k();
        boolean k2 = mVRSSuperEvent.mo31378k();
        if ((k || k2) && (!k || !k2 || !this.name.equals(mVRSSuperEvent.name))) {
            return false;
        }
        boolean f = mo31372f();
        boolean f2 = mVRSSuperEvent.mo31372f();
        if (((f || f2) && (!f || !f2 || !this.details.equals(mVRSSuperEvent.details))) || this.fromTime != mVRSSuperEvent.fromTime) {
            return false;
        }
        boolean m = mo31380m();
        boolean m2 = mVRSSuperEvent.mo31380m();
        if ((m || m2) && (!m || !m2 || this.toTime != mVRSSuperEvent.toTime)) {
            return false;
        }
        boolean i = mo31376i();
        boolean i2 = mVRSSuperEvent.mo31376i();
        if ((i || i2) && (!i || !i2 || !this.location.mo26290a(mVRSSuperEvent.location))) {
            return false;
        }
        boolean j = mo31377j();
        boolean j2 = mVRSSuperEvent.mo31377j();
        if (!j && !j2) {
            return true;
        }
        if (!j || !j2 || !this.locationDescription.equals(mVRSSuperEvent.locationDescription)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVRSSuperEvent mVRSSuperEvent = (MVRSSuperEvent) obj;
        if (!getClass().equals(mVRSSuperEvent.getClass())) {
            return getClass().getName().compareTo(mVRSSuperEvent.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31379l()).compareTo(Boolean.valueOf(mVRSSuperEvent.mo31379l()));
        if (compareTo2 != 0 || ((mo31379l() && (compareTo2 = C25082a.m62839c(this.superEventId, mVRSSuperEvent.superEventId)) != 0) || (compareTo2 = Boolean.valueOf(mo31374h()).compareTo(Boolean.valueOf(mVRSSuperEvent.mo31374h()))) != 0 || ((mo31374h() && (compareTo2 = this.image.compareTo(mVRSSuperEvent.image)) != 0) || (compareTo2 = Boolean.valueOf(mo31378k()).compareTo(Boolean.valueOf(mVRSSuperEvent.mo31378k()))) != 0 || ((mo31378k() && (compareTo2 = this.name.compareTo(mVRSSuperEvent.name)) != 0) || (compareTo2 = Boolean.valueOf(mo31372f()).compareTo(Boolean.valueOf(mVRSSuperEvent.mo31372f()))) != 0 || ((mo31372f() && (compareTo2 = this.details.compareTo(mVRSSuperEvent.details)) != 0) || (compareTo2 = Boolean.valueOf(mo31373g()).compareTo(Boolean.valueOf(mVRSSuperEvent.mo31373g()))) != 0 || ((mo31373g() && (compareTo2 = C25082a.m62840d(this.fromTime, mVRSSuperEvent.fromTime)) != 0) || (compareTo2 = Boolean.valueOf(mo31380m()).compareTo(Boolean.valueOf(mVRSSuperEvent.mo31380m()))) != 0 || ((mo31380m() && (compareTo2 = C25082a.m62840d(this.toTime, mVRSSuperEvent.toTime)) != 0) || (compareTo2 = Boolean.valueOf(mo31376i()).compareTo(Boolean.valueOf(mVRSSuperEvent.mo31376i()))) != 0 || ((mo31376i() && (compareTo2 = this.location.compareTo(mVRSSuperEvent.location)) != 0) || (compareTo2 = Boolean.valueOf(mo31377j()).compareTo(Boolean.valueOf(mVRSSuperEvent.mo31377j()))) != 0)))))))) {
            return compareTo2;
        }
        if (!mo31377j() || (compareTo = this.locationDescription.compareTo(mVRSSuperEvent.locationDescription)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVRSSuperEvent)) {
            return mo31369a((MVRSSuperEvent) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31372f() {
        return this.details != null;
    }

    /* renamed from: g */
    public final boolean mo31373g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo31374h() {
        return this.image != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31376i() {
        return this.location != null;
    }

    /* renamed from: j */
    public final boolean mo31377j() {
        return this.locationDescription != null;
    }

    /* renamed from: k */
    public final boolean mo31378k() {
        return this.name != null;
    }

    /* renamed from: l */
    public final boolean mo31379l() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: m */
    public final boolean mo31380m() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: o */
    public final void mo31381o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: p */
    public final void mo31382p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: q */
    public final void mo31383q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: r */
    public final void mo31384r() throws TException {
        MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
        if (mVImageReferenceWithParams != null) {
            mVImageReferenceWithParams.getClass();
        }
        MVLatLon mVLatLon = this.location;
        if (mVLatLon != null) {
            mVLatLon.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRSSuperEvent(", "superEventId:");
        C0016g.m42z(n, this.superEventId, ", ", "image:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        n.append(", ");
        n.append("name:");
        String str = this.name;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("details:");
        String str2 = this.details;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("fromTime:");
        n.append(this.fromTime);
        if (mo31380m()) {
            n.append(", ");
            n.append("toTime:");
            n.append(this.toTime);
        }
        n.append(", ");
        n.append("location:");
        MVLatLon mVLatLon = this.location;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(", ");
        n.append("locationDescription:");
        String str3 = this.locationDescription;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(")");
        return n.toString();
    }
}
