package com.tranzmate.moovit.protocol.stopDetails;

import com.appboy.support.StringUtils;
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

public class MVStopImage implements TBase<MVStopImage, _Fields>, Serializable, Cloneable, Comparable<MVStopImage> {

    /* renamed from: b */
    public static final C25113c f28332b = new C25113c("url", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28333c = new C25113c("userName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28334d = new C25113c("stopId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f28335e = new C25113c("width", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f28336f = new C25113c("height", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f28337g = new C25113c("timestamp", (byte) 10, 6);

    /* renamed from: h */
    public static final HashMap f28338h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f28339i;
    private byte __isset_bitfield = 0;
    public int height;
    public int stopId;
    public long timestamp;
    public String url;
    public String userName;
    public int width;

    public enum _Fields implements C25085c {
        URL(1, "url"),
        USER_NAME(2, "userName"),
        STOP_ID(3, "stopId"),
        WIDTH(4, "width"),
        HEIGHT(5, "height"),
        TIMESTAMP(6, "timestamp");
        
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
                    return URL;
                case 2:
                    return USER_NAME;
                case 3:
                    return STOP_ID;
                case 4:
                    return WIDTH;
                case 5:
                    return HEIGHT;
                case 6:
                    return TIMESTAMP;
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

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVStopImage$a */
    public static class C10539a extends C25239c<MVStopImage> {
        public C10539a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopImage mVStopImage = (MVStopImage) tBase;
            mVStopImage.getClass();
            C25113c cVar = MVStopImage.f28332b;
            gVar.mo61687K();
            if (mVStopImage.url != null) {
                gVar.mo61711x(MVStopImage.f28332b);
                gVar.mo61686J(mVStopImage.url);
                gVar.mo61712y();
            }
            if (mVStopImage.userName != null) {
                gVar.mo61711x(MVStopImage.f28333c);
                gVar.mo61686J(mVStopImage.userName);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVStopImage.f28334d);
            gVar.mo61678B(mVStopImage.stopId);
            gVar.mo61712y();
            gVar.mo61711x(MVStopImage.f28335e);
            gVar.mo61678B(mVStopImage.width);
            gVar.mo61712y();
            gVar.mo61711x(MVStopImage.f28336f);
            gVar.mo61678B(mVStopImage.height);
            gVar.mo61712y();
            gVar.mo61711x(MVStopImage.f28337g);
            C25541a.m63891v(gVar, mVStopImage.timestamp);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopImage mVStopImage = (MVStopImage) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVStopImage.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStopImage.url = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStopImage.userName = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStopImage.stopId = gVar.mo61696i();
                            mVStopImage.mo31758m();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStopImage.width = gVar.mo61696i();
                            mVStopImage.mo31760p();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStopImage.height = gVar.mo61696i();
                            mVStopImage.mo31757l();
                            break;
                        }
                    case 6:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStopImage.timestamp = gVar.mo61697j();
                            mVStopImage.mo31759o();
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

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVStopImage$b */
    public static class C10540b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10539a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVStopImage$c */
    public static class C10541c extends C25240d<MVStopImage> {
        public C10541c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopImage mVStopImage = (MVStopImage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStopImage.mo31754i()) {
                bitSet.set(0);
            }
            if (mVStopImage.mo31755j()) {
                bitSet.set(1);
            }
            if (mVStopImage.mo31751g()) {
                bitSet.set(2);
            }
            if (mVStopImage.mo31756k()) {
                bitSet.set(3);
            }
            if (mVStopImage.mo31750f()) {
                bitSet.set(4);
            }
            if (mVStopImage.mo31752h()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVStopImage.mo31754i()) {
                jVar.mo61686J(mVStopImage.url);
            }
            if (mVStopImage.mo31755j()) {
                jVar.mo61686J(mVStopImage.userName);
            }
            if (mVStopImage.mo31751g()) {
                jVar.mo61678B(mVStopImage.stopId);
            }
            if (mVStopImage.mo31756k()) {
                jVar.mo61678B(mVStopImage.width);
            }
            if (mVStopImage.mo31750f()) {
                jVar.mo61678B(mVStopImage.height);
            }
            if (mVStopImage.mo31752h()) {
                jVar.mo61679C(mVStopImage.timestamp);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopImage mVStopImage = (MVStopImage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVStopImage.url = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVStopImage.userName = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVStopImage.stopId = jVar.mo61696i();
                mVStopImage.mo31758m();
            }
            if (T.get(3)) {
                mVStopImage.width = jVar.mo61696i();
                mVStopImage.mo31760p();
            }
            if (T.get(4)) {
                mVStopImage.height = jVar.mo61696i();
                mVStopImage.mo31757l();
            }
            if (T.get(5)) {
                mVStopImage.timestamp = jVar.mo61697j();
                mVStopImage.mo31759o();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVStopImage$d */
    public static class C10542d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10541c(0);
        }
    }

    static {
        new C17394d0("MVStopImage");
        HashMap hashMap = new HashMap();
        f28338h = hashMap;
        hashMap.put(C25239c.class, new C10540b());
        hashMap.put(C25240d.class, new C10542d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.URL, new FieldMetaData("url", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.USER_NAME, new FieldMetaData("userName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.WIDTH, new FieldMetaData("width", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.HEIGHT, new FieldMetaData("height", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28339i = unmodifiableMap;
        FieldMetaData.m61947a(MVStopImage.class, unmodifiableMap);
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
        ((C25238b) f28338h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28338h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVStopImage mVStopImage = (MVStopImage) obj;
        if (!getClass().equals(mVStopImage.getClass())) {
            return getClass().getName().compareTo(mVStopImage.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31754i()).compareTo(Boolean.valueOf(mVStopImage.mo31754i()));
        if (compareTo != 0 || ((mo31754i() && (compareTo = this.url.compareTo(mVStopImage.url)) != 0) || (compareTo = Boolean.valueOf(mo31755j()).compareTo(Boolean.valueOf(mVStopImage.mo31755j()))) != 0 || ((mo31755j() && (compareTo = this.userName.compareTo(mVStopImage.userName)) != 0) || (compareTo = Boolean.valueOf(mo31751g()).compareTo(Boolean.valueOf(mVStopImage.mo31751g()))) != 0 || ((mo31751g() && (compareTo = C25082a.m62839c(this.stopId, mVStopImage.stopId)) != 0) || (compareTo = Boolean.valueOf(mo31756k()).compareTo(Boolean.valueOf(mVStopImage.mo31756k()))) != 0 || ((mo31756k() && (compareTo = C25082a.m62839c(this.width, mVStopImage.width)) != 0) || (compareTo = Boolean.valueOf(mo31750f()).compareTo(Boolean.valueOf(mVStopImage.mo31750f()))) != 0 || ((mo31750f() && (compareTo = C25082a.m62839c(this.height, mVStopImage.height)) != 0) || (compareTo = Boolean.valueOf(mo31752h()).compareTo(Boolean.valueOf(mVStopImage.mo31752h()))) != 0)))))) {
            return compareTo;
        }
        if (!mo31752h() || (d = C25082a.m62840d(this.timestamp, mVStopImage.timestamp)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVStopImage)) {
            return false;
        }
        MVStopImage mVStopImage = (MVStopImage) obj;
        boolean i = mo31754i();
        boolean i2 = mVStopImage.mo31754i();
        if ((i || i2) && (!i || !i2 || !this.url.equals(mVStopImage.url))) {
            return false;
        }
        boolean j = mo31755j();
        boolean j2 = mVStopImage.mo31755j();
        if (((!j && !j2) || (j && j2 && this.userName.equals(mVStopImage.userName))) && this.stopId == mVStopImage.stopId && this.width == mVStopImage.width && this.height == mVStopImage.height && this.timestamp == mVStopImage.timestamp) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31750f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo31751g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo31752h() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31754i() {
        return this.url != null;
    }

    /* renamed from: j */
    public final boolean mo31755j() {
        return this.userName != null;
    }

    /* renamed from: k */
    public final boolean mo31756k() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: l */
    public final void mo31757l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: m */
    public final void mo31758m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: o */
    public final void mo31759o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: p */
    public final void mo31760p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVStopImage(", "url:");
        String str = this.url;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("userName:");
        String str2 = this.userName;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("stopId:");
        C0016g.m42z(n, this.stopId, ", ", "width:");
        C0016g.m42z(n, this.width, ", ", "height:");
        C0016g.m42z(n, this.height, ", ", "timestamp:");
        return C25541a.m63884o(n, this.timestamp, ")");
    }
}
