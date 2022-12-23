package com.tranzmate.moovit.protocol.tod.passenger;

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

public class MVTodRideRatingRequest implements TBase<MVTodRideRatingRequest, _Fields>, Serializable, Cloneable, Comparable<MVTodRideRatingRequest> {

    /* renamed from: b */
    public static final C25113c f29556b = new C25113c("rideId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29557c = new C25113c("rating", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f29558d = new C25113c("freeText", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f29559e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29560f;
    private byte __isset_bitfield = 0;
    public String freeText;
    private _Fields[] optionals = {_Fields.FREE_TEXT};
    public int rating;
    public String rideId;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        RATING(2, "rating"),
        FREE_TEXT(3, "freeText");
        
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
                return RIDE_ID;
            }
            if (i == 2) {
                return RATING;
            }
            if (i != 3) {
                return null;
            }
            return FREE_TEXT;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRatingRequest$a */
    public static class C11311a extends C25239c<MVTodRideRatingRequest> {
        public C11311a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodRideRatingRequest mVTodRideRatingRequest = (MVTodRideRatingRequest) tBase;
            mVTodRideRatingRequest.getClass();
            C25113c cVar = MVTodRideRatingRequest.f29556b;
            gVar.mo61687K();
            if (mVTodRideRatingRequest.rideId != null) {
                gVar.mo61711x(MVTodRideRatingRequest.f29556b);
                gVar.mo61686J(mVTodRideRatingRequest.rideId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTodRideRatingRequest.f29557c);
            gVar.mo61678B(mVTodRideRatingRequest.rating);
            gVar.mo61712y();
            if (mVTodRideRatingRequest.freeText != null && mVTodRideRatingRequest.mo33696f()) {
                gVar.mo61711x(MVTodRideRatingRequest.f29558d);
                gVar.mo61686J(mVTodRideRatingRequest.freeText);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodRideRatingRequest mVTodRideRatingRequest = (MVTodRideRatingRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodRideRatingRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVTodRideRatingRequest.freeText = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVTodRideRatingRequest.rating = gVar.mo61696i();
                        mVTodRideRatingRequest.mo33700i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodRideRatingRequest.rideId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRatingRequest$b */
    public static class C11312b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11311a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRatingRequest$c */
    public static class C11313c extends C25240d<MVTodRideRatingRequest> {
        public C11313c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodRideRatingRequest mVTodRideRatingRequest = (MVTodRideRatingRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodRideRatingRequest.mo33698h()) {
                bitSet.set(0);
            }
            if (mVTodRideRatingRequest.mo33697g()) {
                bitSet.set(1);
            }
            if (mVTodRideRatingRequest.mo33696f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTodRideRatingRequest.mo33698h()) {
                jVar.mo61686J(mVTodRideRatingRequest.rideId);
            }
            if (mVTodRideRatingRequest.mo33697g()) {
                jVar.mo61678B(mVTodRideRatingRequest.rating);
            }
            if (mVTodRideRatingRequest.mo33696f()) {
                jVar.mo61686J(mVTodRideRatingRequest.freeText);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodRideRatingRequest mVTodRideRatingRequest = (MVTodRideRatingRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTodRideRatingRequest.rideId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTodRideRatingRequest.rating = jVar.mo61696i();
                mVTodRideRatingRequest.mo33700i();
            }
            if (T.get(2)) {
                mVTodRideRatingRequest.freeText = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRatingRequest$d */
    public static class C11314d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11313c(0);
        }
    }

    static {
        new C17394d0("MVTodRideRatingRequest");
        HashMap hashMap = new HashMap();
        f29559e = hashMap;
        hashMap.put(C25239c.class, new C11312b());
        hashMap.put(C25240d.class, new C11314d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RATING, new FieldMetaData("rating", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FREE_TEXT, new FieldMetaData("freeText", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29560f = unmodifiableMap;
        FieldMetaData.m61947a(MVTodRideRatingRequest.class, unmodifiableMap);
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
        ((C25238b) f29559e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29559e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodRideRatingRequest mVTodRideRatingRequest = (MVTodRideRatingRequest) obj;
        if (!getClass().equals(mVTodRideRatingRequest.getClass())) {
            return getClass().getName().compareTo(mVTodRideRatingRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33698h()).compareTo(Boolean.valueOf(mVTodRideRatingRequest.mo33698h()));
        if (compareTo2 != 0 || ((mo33698h() && (compareTo2 = this.rideId.compareTo(mVTodRideRatingRequest.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo33697g()).compareTo(Boolean.valueOf(mVTodRideRatingRequest.mo33697g()))) != 0 || ((mo33697g() && (compareTo2 = C25082a.m62839c(this.rating, mVTodRideRatingRequest.rating)) != 0) || (compareTo2 = Boolean.valueOf(mo33696f()).compareTo(Boolean.valueOf(mVTodRideRatingRequest.mo33696f()))) != 0))) {
            return compareTo2;
        }
        if (!mo33696f() || (compareTo = this.freeText.compareTo(mVTodRideRatingRequest.freeText)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodRideRatingRequest)) {
            return false;
        }
        MVTodRideRatingRequest mVTodRideRatingRequest = (MVTodRideRatingRequest) obj;
        boolean h = mo33698h();
        boolean h2 = mVTodRideRatingRequest.mo33698h();
        if (((h || h2) && (!h || !h2 || !this.rideId.equals(mVTodRideRatingRequest.rideId))) || this.rating != mVTodRideRatingRequest.rating) {
            return false;
        }
        boolean f = mo33696f();
        boolean f2 = mVTodRideRatingRequest.mo33696f();
        if ((f || f2) && (!f || !f2 || !this.freeText.equals(mVTodRideRatingRequest.freeText))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33696f() {
        return this.freeText != null;
    }

    /* renamed from: g */
    public final boolean mo33697g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo33698h() {
        return this.rideId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo33700i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodRideRatingRequest(", "rideId:");
        String str = this.rideId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("rating:");
        n.append(this.rating);
        if (mo33696f()) {
            n.append(", ");
            n.append("freeText:");
            String str2 = this.freeText;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
