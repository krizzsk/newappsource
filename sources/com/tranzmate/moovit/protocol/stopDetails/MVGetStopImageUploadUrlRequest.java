package com.tranzmate.moovit.protocol.stopDetails;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
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

public class MVGetStopImageUploadUrlRequest implements TBase<MVGetStopImageUploadUrlRequest, _Fields>, Serializable, Cloneable, Comparable<MVGetStopImageUploadUrlRequest> {

    /* renamed from: b */
    public static final C25113c f28320b = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f28321c = new C25113c("stopId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28322d = new C25113c("timestamp", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f28323e = new C25113c("width", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f28324f = new C25113c("height", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f28325g = new C25113c("fileSuffix", (byte) 11, 6);

    /* renamed from: h */
    public static final HashMap f28326h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f28327i;
    private byte __isset_bitfield = 0;
    public String fileSuffix;
    public int height;
    public MVLatLon location;
    public int stopId;
    public long timestamp;
    public int width;

    public enum _Fields implements C25085c {
        LOCATION(1, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        STOP_ID(2, "stopId"),
        TIMESTAMP(3, "timestamp"),
        WIDTH(4, "width"),
        HEIGHT(5, "height"),
        FILE_SUFFIX(6, "fileSuffix");
        
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
                    return LOCATION;
                case 2:
                    return STOP_ID;
                case 3:
                    return TIMESTAMP;
                case 4:
                    return WIDTH;
                case 5:
                    return HEIGHT;
                case 6:
                    return FILE_SUFFIX;
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

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVGetStopImageUploadUrlRequest$a */
    public static class C10531a extends C25239c<MVGetStopImageUploadUrlRequest> {
        public C10531a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetStopImageUploadUrlRequest mVGetStopImageUploadUrlRequest = (MVGetStopImageUploadUrlRequest) tBase;
            MVLatLon mVLatLon = mVGetStopImageUploadUrlRequest.location;
            C25113c cVar = MVGetStopImageUploadUrlRequest.f28320b;
            gVar.mo61687K();
            if (mVGetStopImageUploadUrlRequest.location != null) {
                gVar.mo61711x(MVGetStopImageUploadUrlRequest.f28320b);
                mVGetStopImageUploadUrlRequest.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVGetStopImageUploadUrlRequest.f28321c);
            gVar.mo61678B(mVGetStopImageUploadUrlRequest.stopId);
            gVar.mo61712y();
            gVar.mo61711x(MVGetStopImageUploadUrlRequest.f28322d);
            gVar.mo61679C(mVGetStopImageUploadUrlRequest.timestamp);
            gVar.mo61712y();
            gVar.mo61711x(MVGetStopImageUploadUrlRequest.f28323e);
            gVar.mo61678B(mVGetStopImageUploadUrlRequest.width);
            gVar.mo61712y();
            gVar.mo61711x(MVGetStopImageUploadUrlRequest.f28324f);
            gVar.mo61678B(mVGetStopImageUploadUrlRequest.height);
            gVar.mo61712y();
            if (mVGetStopImageUploadUrlRequest.fileSuffix != null) {
                gVar.mo61711x(MVGetStopImageUploadUrlRequest.f28325g);
                gVar.mo61686J(mVGetStopImageUploadUrlRequest.fileSuffix);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetStopImageUploadUrlRequest mVGetStopImageUploadUrlRequest = (MVGetStopImageUploadUrlRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVGetStopImageUploadUrlRequest.location;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLatLon mVLatLon2 = new MVLatLon();
                            mVGetStopImageUploadUrlRequest.location = mVLatLon2;
                            mVLatLon2.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGetStopImageUploadUrlRequest.stopId = gVar.mo61696i();
                            mVGetStopImageUploadUrlRequest.mo31735m();
                            break;
                        }
                    case 3:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGetStopImageUploadUrlRequest.timestamp = gVar.mo61697j();
                            mVGetStopImageUploadUrlRequest.mo31736o();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGetStopImageUploadUrlRequest.width = gVar.mo61696i();
                            mVGetStopImageUploadUrlRequest.mo31737p();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGetStopImageUploadUrlRequest.height = gVar.mo61696i();
                            mVGetStopImageUploadUrlRequest.mo31734l();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGetStopImageUploadUrlRequest.fileSuffix = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVGetStopImageUploadUrlRequest$b */
    public static class C10532b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10531a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVGetStopImageUploadUrlRequest$c */
    public static class C10533c extends C25240d<MVGetStopImageUploadUrlRequest> {
        public C10533c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetStopImageUploadUrlRequest mVGetStopImageUploadUrlRequest = (MVGetStopImageUploadUrlRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetStopImageUploadUrlRequest.mo31729h()) {
                bitSet.set(0);
            }
            if (mVGetStopImageUploadUrlRequest.mo31731i()) {
                bitSet.set(1);
            }
            if (mVGetStopImageUploadUrlRequest.mo31732j()) {
                bitSet.set(2);
            }
            if (mVGetStopImageUploadUrlRequest.mo31733k()) {
                bitSet.set(3);
            }
            if (mVGetStopImageUploadUrlRequest.mo31728g()) {
                bitSet.set(4);
            }
            if (mVGetStopImageUploadUrlRequest.mo31727f()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVGetStopImageUploadUrlRequest.mo31729h()) {
                mVGetStopImageUploadUrlRequest.location.mo25202X0(jVar);
            }
            if (mVGetStopImageUploadUrlRequest.mo31731i()) {
                jVar.mo61678B(mVGetStopImageUploadUrlRequest.stopId);
            }
            if (mVGetStopImageUploadUrlRequest.mo31732j()) {
                jVar.mo61679C(mVGetStopImageUploadUrlRequest.timestamp);
            }
            if (mVGetStopImageUploadUrlRequest.mo31733k()) {
                jVar.mo61678B(mVGetStopImageUploadUrlRequest.width);
            }
            if (mVGetStopImageUploadUrlRequest.mo31728g()) {
                jVar.mo61678B(mVGetStopImageUploadUrlRequest.height);
            }
            if (mVGetStopImageUploadUrlRequest.mo31727f()) {
                jVar.mo61686J(mVGetStopImageUploadUrlRequest.fileSuffix);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetStopImageUploadUrlRequest mVGetStopImageUploadUrlRequest = (MVGetStopImageUploadUrlRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVGetStopImageUploadUrlRequest.location = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVGetStopImageUploadUrlRequest.stopId = jVar.mo61696i();
                mVGetStopImageUploadUrlRequest.mo31735m();
            }
            if (T.get(2)) {
                mVGetStopImageUploadUrlRequest.timestamp = jVar.mo61697j();
                mVGetStopImageUploadUrlRequest.mo31736o();
            }
            if (T.get(3)) {
                mVGetStopImageUploadUrlRequest.width = jVar.mo61696i();
                mVGetStopImageUploadUrlRequest.mo31737p();
            }
            if (T.get(4)) {
                mVGetStopImageUploadUrlRequest.height = jVar.mo61696i();
                mVGetStopImageUploadUrlRequest.mo31734l();
            }
            if (T.get(5)) {
                mVGetStopImageUploadUrlRequest.fileSuffix = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVGetStopImageUploadUrlRequest$d */
    public static class C10534d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10533c(0);
        }
    }

    static {
        new C17394d0("MVGetStopImageUploadUrlRequest");
        HashMap hashMap = new HashMap();
        f28326h = hashMap;
        hashMap.put(C25239c.class, new C10532b());
        hashMap.put(C25240d.class, new C10534d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.WIDTH, new FieldMetaData("width", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.HEIGHT, new FieldMetaData("height", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FILE_SUFFIX, new FieldMetaData("fileSuffix", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28327i = unmodifiableMap;
        FieldMetaData.m61947a(MVGetStopImageUploadUrlRequest.class, unmodifiableMap);
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
        ((C25238b) f28326h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28326h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGetStopImageUploadUrlRequest mVGetStopImageUploadUrlRequest = (MVGetStopImageUploadUrlRequest) obj;
        if (!getClass().equals(mVGetStopImageUploadUrlRequest.getClass())) {
            return getClass().getName().compareTo(mVGetStopImageUploadUrlRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31729h()).compareTo(Boolean.valueOf(mVGetStopImageUploadUrlRequest.mo31729h()));
        if (compareTo2 != 0 || ((mo31729h() && (compareTo2 = this.location.compareTo(mVGetStopImageUploadUrlRequest.location)) != 0) || (compareTo2 = Boolean.valueOf(mo31731i()).compareTo(Boolean.valueOf(mVGetStopImageUploadUrlRequest.mo31731i()))) != 0 || ((mo31731i() && (compareTo2 = C25082a.m62839c(this.stopId, mVGetStopImageUploadUrlRequest.stopId)) != 0) || (compareTo2 = Boolean.valueOf(mo31732j()).compareTo(Boolean.valueOf(mVGetStopImageUploadUrlRequest.mo31732j()))) != 0 || ((mo31732j() && (compareTo2 = C25082a.m62840d(this.timestamp, mVGetStopImageUploadUrlRequest.timestamp)) != 0) || (compareTo2 = Boolean.valueOf(mo31733k()).compareTo(Boolean.valueOf(mVGetStopImageUploadUrlRequest.mo31733k()))) != 0 || ((mo31733k() && (compareTo2 = C25082a.m62839c(this.width, mVGetStopImageUploadUrlRequest.width)) != 0) || (compareTo2 = Boolean.valueOf(mo31728g()).compareTo(Boolean.valueOf(mVGetStopImageUploadUrlRequest.mo31728g()))) != 0 || ((mo31728g() && (compareTo2 = C25082a.m62839c(this.height, mVGetStopImageUploadUrlRequest.height)) != 0) || (compareTo2 = Boolean.valueOf(mo31727f()).compareTo(Boolean.valueOf(mVGetStopImageUploadUrlRequest.mo31727f()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo31727f() || (compareTo = this.fileSuffix.compareTo(mVGetStopImageUploadUrlRequest.fileSuffix)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetStopImageUploadUrlRequest)) {
            return false;
        }
        MVGetStopImageUploadUrlRequest mVGetStopImageUploadUrlRequest = (MVGetStopImageUploadUrlRequest) obj;
        boolean h = mo31729h();
        boolean h2 = mVGetStopImageUploadUrlRequest.mo31729h();
        if (((h || h2) && (!h || !h2 || !this.location.mo26290a(mVGetStopImageUploadUrlRequest.location))) || this.stopId != mVGetStopImageUploadUrlRequest.stopId || this.timestamp != mVGetStopImageUploadUrlRequest.timestamp || this.width != mVGetStopImageUploadUrlRequest.width || this.height != mVGetStopImageUploadUrlRequest.height) {
            return false;
        }
        boolean f = mo31727f();
        boolean f2 = mVGetStopImageUploadUrlRequest.mo31727f();
        if ((f || f2) && (!f || !f2 || !this.fileSuffix.equals(mVGetStopImageUploadUrlRequest.fileSuffix))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31727f() {
        return this.fileSuffix != null;
    }

    /* renamed from: g */
    public final boolean mo31728g() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: h */
    public final boolean mo31729h() {
        return this.location != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31731i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo31732j() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: k */
    public final boolean mo31733k() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: l */
    public final void mo31734l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: m */
    public final void mo31735m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: o */
    public final void mo31736o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: p */
    public final void mo31737p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetStopImageUploadUrlRequest(", "location:");
        MVLatLon mVLatLon = this.location;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(", ");
        n.append("stopId:");
        C0016g.m42z(n, this.stopId, ", ", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "width:");
        C0016g.m42z(n, this.width, ", ", "height:");
        C0016g.m42z(n, this.height, ", ", "fileSuffix:");
        String str = this.fileSuffix;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
