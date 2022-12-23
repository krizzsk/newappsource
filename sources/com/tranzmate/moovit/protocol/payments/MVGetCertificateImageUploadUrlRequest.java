package com.tranzmate.moovit.protocol.payments;

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

public class MVGetCertificateImageUploadUrlRequest implements TBase<MVGetCertificateImageUploadUrlRequest, _Fields>, Serializable, Cloneable, Comparable<MVGetCertificateImageUploadUrlRequest> {

    /* renamed from: b */
    public static final C25113c f27278b = new C25113c("certificateKey", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27279c = new C25113c("timestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f27280d = new C25113c("width", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f27281e = new C25113c("height", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f27282f = new C25113c("fileSuffix", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f27283g = new C25113c("paymentContext", (byte) 11, 6);

    /* renamed from: h */
    public static final HashMap f27284h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f27285i;
    private byte __isset_bitfield = 0;
    public String certificateKey;
    public String fileSuffix;
    public int height;
    private _Fields[] optionals = {_Fields.PAYMENT_CONTEXT};
    public String paymentContext;
    public long timestamp;
    public int width;

    public enum _Fields implements C25085c {
        CERTIFICATE_KEY(1, "certificateKey"),
        TIMESTAMP(2, "timestamp"),
        WIDTH(3, "width"),
        HEIGHT(4, "height"),
        FILE_SUFFIX(5, "fileSuffix"),
        PAYMENT_CONTEXT(6, "paymentContext");
        
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
                    return CERTIFICATE_KEY;
                case 2:
                    return TIMESTAMP;
                case 3:
                    return WIDTH;
                case 4:
                    return HEIGHT;
                case 5:
                    return FILE_SUFFIX;
                case 6:
                    return PAYMENT_CONTEXT;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetCertificateImageUploadUrlRequest$a */
    public static class C9757a extends C25239c<MVGetCertificateImageUploadUrlRequest> {
        public C9757a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetCertificateImageUploadUrlRequest mVGetCertificateImageUploadUrlRequest = (MVGetCertificateImageUploadUrlRequest) tBase;
            mVGetCertificateImageUploadUrlRequest.getClass();
            C25113c cVar = MVGetCertificateImageUploadUrlRequest.f27278b;
            gVar.mo61687K();
            if (mVGetCertificateImageUploadUrlRequest.certificateKey != null) {
                gVar.mo61711x(MVGetCertificateImageUploadUrlRequest.f27278b);
                gVar.mo61686J(mVGetCertificateImageUploadUrlRequest.certificateKey);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVGetCertificateImageUploadUrlRequest.f27279c);
            gVar.mo61679C(mVGetCertificateImageUploadUrlRequest.timestamp);
            gVar.mo61712y();
            gVar.mo61711x(MVGetCertificateImageUploadUrlRequest.f27280d);
            gVar.mo61678B(mVGetCertificateImageUploadUrlRequest.width);
            gVar.mo61712y();
            gVar.mo61711x(MVGetCertificateImageUploadUrlRequest.f27281e);
            gVar.mo61678B(mVGetCertificateImageUploadUrlRequest.height);
            gVar.mo61712y();
            if (mVGetCertificateImageUploadUrlRequest.fileSuffix != null) {
                gVar.mo61711x(MVGetCertificateImageUploadUrlRequest.f27282f);
                gVar.mo61686J(mVGetCertificateImageUploadUrlRequest.fileSuffix);
                gVar.mo61712y();
            }
            if (mVGetCertificateImageUploadUrlRequest.paymentContext != null && mVGetCertificateImageUploadUrlRequest.mo29891i()) {
                gVar.mo61711x(MVGetCertificateImageUploadUrlRequest.f27283g);
                gVar.mo61686J(mVGetCertificateImageUploadUrlRequest.paymentContext);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetCertificateImageUploadUrlRequest mVGetCertificateImageUploadUrlRequest = (MVGetCertificateImageUploadUrlRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVGetCertificateImageUploadUrlRequest.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGetCertificateImageUploadUrlRequest.certificateKey = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGetCertificateImageUploadUrlRequest.timestamp = gVar.mo61697j();
                            mVGetCertificateImageUploadUrlRequest.mo29895m();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGetCertificateImageUploadUrlRequest.width = gVar.mo61696i();
                            mVGetCertificateImageUploadUrlRequest.mo29896o();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGetCertificateImageUploadUrlRequest.height = gVar.mo61696i();
                            mVGetCertificateImageUploadUrlRequest.mo29894l();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGetCertificateImageUploadUrlRequest.fileSuffix = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVGetCertificateImageUploadUrlRequest.paymentContext = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetCertificateImageUploadUrlRequest$b */
    public static class C9758b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9757a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetCertificateImageUploadUrlRequest$c */
    public static class C9759c extends C25240d<MVGetCertificateImageUploadUrlRequest> {
        public C9759c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetCertificateImageUploadUrlRequest mVGetCertificateImageUploadUrlRequest = (MVGetCertificateImageUploadUrlRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetCertificateImageUploadUrlRequest.mo29887f()) {
                bitSet.set(0);
            }
            if (mVGetCertificateImageUploadUrlRequest.mo29892j()) {
                bitSet.set(1);
            }
            if (mVGetCertificateImageUploadUrlRequest.mo29893k()) {
                bitSet.set(2);
            }
            if (mVGetCertificateImageUploadUrlRequest.mo29889h()) {
                bitSet.set(3);
            }
            if (mVGetCertificateImageUploadUrlRequest.mo29888g()) {
                bitSet.set(4);
            }
            if (mVGetCertificateImageUploadUrlRequest.mo29891i()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVGetCertificateImageUploadUrlRequest.mo29887f()) {
                jVar.mo61686J(mVGetCertificateImageUploadUrlRequest.certificateKey);
            }
            if (mVGetCertificateImageUploadUrlRequest.mo29892j()) {
                jVar.mo61679C(mVGetCertificateImageUploadUrlRequest.timestamp);
            }
            if (mVGetCertificateImageUploadUrlRequest.mo29893k()) {
                jVar.mo61678B(mVGetCertificateImageUploadUrlRequest.width);
            }
            if (mVGetCertificateImageUploadUrlRequest.mo29889h()) {
                jVar.mo61678B(mVGetCertificateImageUploadUrlRequest.height);
            }
            if (mVGetCertificateImageUploadUrlRequest.mo29888g()) {
                jVar.mo61686J(mVGetCertificateImageUploadUrlRequest.fileSuffix);
            }
            if (mVGetCertificateImageUploadUrlRequest.mo29891i()) {
                jVar.mo61686J(mVGetCertificateImageUploadUrlRequest.paymentContext);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetCertificateImageUploadUrlRequest mVGetCertificateImageUploadUrlRequest = (MVGetCertificateImageUploadUrlRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVGetCertificateImageUploadUrlRequest.certificateKey = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVGetCertificateImageUploadUrlRequest.timestamp = jVar.mo61697j();
                mVGetCertificateImageUploadUrlRequest.mo29895m();
            }
            if (T.get(2)) {
                mVGetCertificateImageUploadUrlRequest.width = jVar.mo61696i();
                mVGetCertificateImageUploadUrlRequest.mo29896o();
            }
            if (T.get(3)) {
                mVGetCertificateImageUploadUrlRequest.height = jVar.mo61696i();
                mVGetCertificateImageUploadUrlRequest.mo29894l();
            }
            if (T.get(4)) {
                mVGetCertificateImageUploadUrlRequest.fileSuffix = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVGetCertificateImageUploadUrlRequest.paymentContext = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetCertificateImageUploadUrlRequest$d */
    public static class C9760d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9759c(0);
        }
    }

    static {
        new C17394d0("MVGetCertificateImageUploadUrlRequest");
        HashMap hashMap = new HashMap();
        f27284h = hashMap;
        hashMap.put(C25239c.class, new C9758b());
        hashMap.put(C25240d.class, new C9760d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CERTIFICATE_KEY, new FieldMetaData("certificateKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.WIDTH, new FieldMetaData("width", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.HEIGHT, new FieldMetaData("height", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FILE_SUFFIX, new FieldMetaData("fileSuffix", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27285i = unmodifiableMap;
        FieldMetaData.m61947a(MVGetCertificateImageUploadUrlRequest.class, unmodifiableMap);
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
        ((C25238b) f27284h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27284h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGetCertificateImageUploadUrlRequest mVGetCertificateImageUploadUrlRequest = (MVGetCertificateImageUploadUrlRequest) obj;
        if (!getClass().equals(mVGetCertificateImageUploadUrlRequest.getClass())) {
            return getClass().getName().compareTo(mVGetCertificateImageUploadUrlRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29887f()).compareTo(Boolean.valueOf(mVGetCertificateImageUploadUrlRequest.mo29887f()));
        if (compareTo2 != 0 || ((mo29887f() && (compareTo2 = this.certificateKey.compareTo(mVGetCertificateImageUploadUrlRequest.certificateKey)) != 0) || (compareTo2 = Boolean.valueOf(mo29892j()).compareTo(Boolean.valueOf(mVGetCertificateImageUploadUrlRequest.mo29892j()))) != 0 || ((mo29892j() && (compareTo2 = C25082a.m62840d(this.timestamp, mVGetCertificateImageUploadUrlRequest.timestamp)) != 0) || (compareTo2 = Boolean.valueOf(mo29893k()).compareTo(Boolean.valueOf(mVGetCertificateImageUploadUrlRequest.mo29893k()))) != 0 || ((mo29893k() && (compareTo2 = C25082a.m62839c(this.width, mVGetCertificateImageUploadUrlRequest.width)) != 0) || (compareTo2 = Boolean.valueOf(mo29889h()).compareTo(Boolean.valueOf(mVGetCertificateImageUploadUrlRequest.mo29889h()))) != 0 || ((mo29889h() && (compareTo2 = C25082a.m62839c(this.height, mVGetCertificateImageUploadUrlRequest.height)) != 0) || (compareTo2 = Boolean.valueOf(mo29888g()).compareTo(Boolean.valueOf(mVGetCertificateImageUploadUrlRequest.mo29888g()))) != 0 || ((mo29888g() && (compareTo2 = this.fileSuffix.compareTo(mVGetCertificateImageUploadUrlRequest.fileSuffix)) != 0) || (compareTo2 = Boolean.valueOf(mo29891i()).compareTo(Boolean.valueOf(mVGetCertificateImageUploadUrlRequest.mo29891i()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo29891i() || (compareTo = this.paymentContext.compareTo(mVGetCertificateImageUploadUrlRequest.paymentContext)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetCertificateImageUploadUrlRequest)) {
            return false;
        }
        MVGetCertificateImageUploadUrlRequest mVGetCertificateImageUploadUrlRequest = (MVGetCertificateImageUploadUrlRequest) obj;
        boolean f = mo29887f();
        boolean f2 = mVGetCertificateImageUploadUrlRequest.mo29887f();
        if (((f || f2) && (!f || !f2 || !this.certificateKey.equals(mVGetCertificateImageUploadUrlRequest.certificateKey))) || this.timestamp != mVGetCertificateImageUploadUrlRequest.timestamp || this.width != mVGetCertificateImageUploadUrlRequest.width || this.height != mVGetCertificateImageUploadUrlRequest.height) {
            return false;
        }
        boolean g = mo29888g();
        boolean g2 = mVGetCertificateImageUploadUrlRequest.mo29888g();
        if ((g || g2) && (!g || !g2 || !this.fileSuffix.equals(mVGetCertificateImageUploadUrlRequest.fileSuffix))) {
            return false;
        }
        boolean i = mo29891i();
        boolean i2 = mVGetCertificateImageUploadUrlRequest.mo29891i();
        if ((i || i2) && (!i || !i2 || !this.paymentContext.equals(mVGetCertificateImageUploadUrlRequest.paymentContext))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29887f() {
        return this.certificateKey != null;
    }

    /* renamed from: g */
    public final boolean mo29888g() {
        return this.fileSuffix != null;
    }

    /* renamed from: h */
    public final boolean mo29889h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29891i() {
        return this.paymentContext != null;
    }

    /* renamed from: j */
    public final boolean mo29892j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo29893k() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: l */
    public final void mo29894l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: m */
    public final void mo29895m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: o */
    public final void mo29896o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetCertificateImageUploadUrlRequest(", "certificateKey:");
        String str = this.certificateKey;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "width:");
        C0016g.m42z(n, this.width, ", ", "height:");
        C0016g.m42z(n, this.height, ", ", "fileSuffix:");
        String str2 = this.fileSuffix;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo29891i()) {
            n.append(", ");
            n.append("paymentContext:");
            String str3 = this.paymentContext;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(")");
        return n.toString();
    }
}
