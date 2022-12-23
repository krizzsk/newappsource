package com.tranzmate.moovit.protocol.ridesharing;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVDirection;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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

public class MVRSEventBucket implements TBase<MVRSEventBucket, _Fields>, Serializable, Cloneable, Comparable<MVRSEventBucket> {

    /* renamed from: b */
    public static final C25113c f28063b = new C25113c("bucketId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28064c = new C25113c("image", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28065d = new C25113c("name", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28066e = new C25113c("fromTime", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f28067f = new C25113c("toTime", (byte) 10, 5);

    /* renamed from: g */
    public static final C25113c f28068g = new C25113c("directions", (byte) 15, 6);

    /* renamed from: h */
    public static final HashMap f28069h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f28070i;
    private byte __isset_bitfield = 0;
    public int bucketId;
    public List<MVDirection> directions;
    public long fromTime;
    public MVImageReferenceWithParams image;
    public String name;
    public long toTime;

    public enum _Fields implements C25085c {
        BUCKET_ID(1, "bucketId"),
        IMAGE(2, "image"),
        NAME(3, "name"),
        FROM_TIME(4, "fromTime"),
        TO_TIME(5, "toTime"),
        DIRECTIONS(6, "directions");
        
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
                    return BUCKET_ID;
                case 2:
                    return IMAGE;
                case 3:
                    return NAME;
                case 4:
                    return FROM_TIME;
                case 5:
                    return TO_TIME;
                case 6:
                    return DIRECTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBucket$a */
    public static class C10350a extends C25239c<MVRSEventBucket> {
        public C10350a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBucket mVRSEventBucket = (MVRSEventBucket) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVRSEventBucket.image;
            C25113c cVar = MVRSEventBucket.f28063b;
            gVar.mo61687K();
            gVar.mo61711x(MVRSEventBucket.f28063b);
            gVar.mo61678B(mVRSEventBucket.bucketId);
            gVar.mo61712y();
            if (mVRSEventBucket.image != null) {
                gVar.mo61711x(MVRSEventBucket.f28064c);
                mVRSEventBucket.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRSEventBucket.name != null) {
                gVar.mo61711x(MVRSEventBucket.f28065d);
                gVar.mo61686J(mVRSEventBucket.name);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVRSEventBucket.f28066e);
            gVar.mo61679C(mVRSEventBucket.fromTime);
            gVar.mo61712y();
            gVar.mo61711x(MVRSEventBucket.f28067f);
            gVar.mo61679C(mVRSEventBucket.toTime);
            gVar.mo61712y();
            if (mVRSEventBucket.directions != null) {
                gVar.mo61711x(MVRSEventBucket.f28068g);
                gVar.mo61680D(new C25119e((byte) 8, mVRSEventBucket.directions.size()));
                for (MVDirection value : mVRSEventBucket.directions) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBucket mVRSEventBucket = (MVRSEventBucket) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVRSEventBucket.image;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEventBucket.bucketId = gVar.mo61696i();
                            mVRSEventBucket.mo31280l();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVRSEventBucket.image = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEventBucket.name = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEventBucket.fromTime = gVar.mo61697j();
                            mVRSEventBucket.mo31281m();
                            break;
                        }
                    case 5:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEventBucket.toTime = gVar.mo61697j();
                            mVRSEventBucket.mo31282o();
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVRSEventBucket.directions = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                mVRSEventBucket.directions.add(MVDirection.findByValue(gVar.mo61696i()));
                            }
                            gVar.mo61699l();
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBucket$b */
    public static class C10351b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10350a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBucket$c */
    public static class C10352c extends C25240d<MVRSEventBucket> {
        public C10352c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBucket mVRSEventBucket = (MVRSEventBucket) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRSEventBucket.mo31273f()) {
                bitSet.set(0);
            }
            if (mVRSEventBucket.mo31277i()) {
                bitSet.set(1);
            }
            if (mVRSEventBucket.mo31278j()) {
                bitSet.set(2);
            }
            if (mVRSEventBucket.mo31275h()) {
                bitSet.set(3);
            }
            if (mVRSEventBucket.mo31279k()) {
                bitSet.set(4);
            }
            if (mVRSEventBucket.mo31274g()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVRSEventBucket.mo31273f()) {
                jVar.mo61678B(mVRSEventBucket.bucketId);
            }
            if (mVRSEventBucket.mo31277i()) {
                mVRSEventBucket.image.mo25202X0(jVar);
            }
            if (mVRSEventBucket.mo31278j()) {
                jVar.mo61686J(mVRSEventBucket.name);
            }
            if (mVRSEventBucket.mo31275h()) {
                jVar.mo61679C(mVRSEventBucket.fromTime);
            }
            if (mVRSEventBucket.mo31279k()) {
                jVar.mo61679C(mVRSEventBucket.toTime);
            }
            if (mVRSEventBucket.mo31274g()) {
                jVar.mo61678B(mVRSEventBucket.directions.size());
                for (MVDirection value : mVRSEventBucket.directions) {
                    jVar.mo61678B(value.getValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBucket mVRSEventBucket = (MVRSEventBucket) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVRSEventBucket.bucketId = jVar.mo61696i();
                mVRSEventBucket.mo31280l();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVRSEventBucket.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVRSEventBucket.name = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVRSEventBucket.fromTime = jVar.mo61697j();
                mVRSEventBucket.mo31281m();
            }
            if (T.get(4)) {
                mVRSEventBucket.toTime = jVar.mo61697j();
                mVRSEventBucket.mo31282o();
            }
            if (T.get(5)) {
                int i = jVar.mo61696i();
                mVRSEventBucket.directions = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVRSEventBucket.directions.add(MVDirection.findByValue(jVar.mo61696i()));
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBucket$d */
    public static class C10353d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10352c(0);
        }
    }

    static {
        new C17394d0("MVRSEventBucket");
        HashMap hashMap = new HashMap();
        f28069h = hashMap;
        hashMap.put(C25239c.class, new C10351b());
        hashMap.put(C25240d.class, new C10353d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.BUCKET_ID, new FieldMetaData("bucketId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FROM_TIME, new FieldMetaData("fromTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.TO_TIME, new FieldMetaData("toTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.DIRECTIONS, new FieldMetaData("directions", (byte) 3, new ListMetaData(new EnumMetaData(MVDirection.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28070i = unmodifiableMap;
        FieldMetaData.m61947a(MVRSEventBucket.class, unmodifiableMap);
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
        ((C25238b) f28069h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28069h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVRSEventBucket mVRSEventBucket = (MVRSEventBucket) obj;
        if (!getClass().equals(mVRSEventBucket.getClass())) {
            return getClass().getName().compareTo(mVRSEventBucket.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31273f()).compareTo(Boolean.valueOf(mVRSEventBucket.mo31273f()));
        if (compareTo != 0 || ((mo31273f() && (compareTo = C25082a.m62839c(this.bucketId, mVRSEventBucket.bucketId)) != 0) || (compareTo = Boolean.valueOf(mo31277i()).compareTo(Boolean.valueOf(mVRSEventBucket.mo31277i()))) != 0 || ((mo31277i() && (compareTo = this.image.compareTo(mVRSEventBucket.image)) != 0) || (compareTo = Boolean.valueOf(mo31278j()).compareTo(Boolean.valueOf(mVRSEventBucket.mo31278j()))) != 0 || ((mo31278j() && (compareTo = this.name.compareTo(mVRSEventBucket.name)) != 0) || (compareTo = Boolean.valueOf(mo31275h()).compareTo(Boolean.valueOf(mVRSEventBucket.mo31275h()))) != 0 || ((mo31275h() && (compareTo = C25082a.m62840d(this.fromTime, mVRSEventBucket.fromTime)) != 0) || (compareTo = Boolean.valueOf(mo31279k()).compareTo(Boolean.valueOf(mVRSEventBucket.mo31279k()))) != 0 || ((mo31279k() && (compareTo = C25082a.m62840d(this.toTime, mVRSEventBucket.toTime)) != 0) || (compareTo = Boolean.valueOf(mo31274g()).compareTo(Boolean.valueOf(mVRSEventBucket.mo31274g()))) != 0)))))) {
            return compareTo;
        }
        if (!mo31274g() || (h = C25082a.m62844h(this.directions, mVRSEventBucket.directions)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVRSEventBucket)) {
            return false;
        }
        MVRSEventBucket mVRSEventBucket = (MVRSEventBucket) obj;
        if (this.bucketId != mVRSEventBucket.bucketId) {
            return false;
        }
        boolean i = mo31277i();
        boolean i2 = mVRSEventBucket.mo31277i();
        if ((i || i2) && (!i || !i2 || !this.image.mo26245a(mVRSEventBucket.image))) {
            return false;
        }
        boolean j = mo31278j();
        boolean j2 = mVRSEventBucket.mo31278j();
        if (((j || j2) && (!j || !j2 || !this.name.equals(mVRSEventBucket.name))) || this.fromTime != mVRSEventBucket.fromTime || this.toTime != mVRSEventBucket.toTime) {
            return false;
        }
        boolean g = mo31274g();
        boolean g2 = mVRSEventBucket.mo31274g();
        if ((g || g2) && (!g || !g2 || !this.directions.equals(mVRSEventBucket.directions))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31273f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo31274g() {
        return this.directions != null;
    }

    /* renamed from: h */
    public final boolean mo31275h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31277i() {
        return this.image != null;
    }

    /* renamed from: j */
    public final boolean mo31278j() {
        return this.name != null;
    }

    /* renamed from: k */
    public final boolean mo31279k() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: l */
    public final void mo31280l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: m */
    public final void mo31281m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: o */
    public final void mo31282o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRSEventBucket(", "bucketId:");
        C0016g.m42z(n, this.bucketId, ", ", "image:");
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
        n.append("fromTime:");
        C25541a.m63889t(n, this.fromTime, ", ", "toTime:");
        C25541a.m63889t(n, this.toTime, ", ", "directions:");
        List<MVDirection> list = this.directions;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
