package com.tranzmate.moovit.protocol.common;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVImage implements TBase<MVImage, _Fields>, Serializable, Cloneable, Comparable<MVImage> {

    /* renamed from: b */
    public static final C25113c f25032b = new C25113c("imageId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25033c = new C25113c("imageData", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25034d = new C25113c("imageType", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f25035e = new C25113c("anchor", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f25036f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f25037g;
    private byte __isset_bitfield = 0;
    public MVPointDouble anchor;
    public ByteBuffer imageData;
    public int imageId;
    public MVImageType imageType;
    private _Fields[] optionals = {_Fields.ANCHOR};

    public enum _Fields implements C25085c {
        IMAGE_ID(1, "imageId"),
        IMAGE_DATA(2, "imageData"),
        IMAGE_TYPE(3, "imageType"),
        ANCHOR(4, "anchor");
        
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
                return IMAGE_ID;
            }
            if (i == 2) {
                return IMAGE_DATA;
            }
            if (i == 3) {
                return IMAGE_TYPE;
            }
            if (i != 4) {
                return null;
            }
            return ANCHOR;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImage$a */
    public static class C8412a extends C25239c<MVImage> {
        public C8412a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVImage mVImage = (MVImage) tBase;
            MVPointDouble mVPointDouble = mVImage.anchor;
            C25113c cVar = MVImage.f25032b;
            gVar.mo61687K();
            gVar.mo61711x(MVImage.f25032b);
            gVar.mo61678B(mVImage.imageId);
            gVar.mo61712y();
            if (mVImage.imageData != null) {
                gVar.mo61711x(MVImage.f25033c);
                gVar.mo61707t(mVImage.imageData);
                gVar.mo61712y();
            }
            if (mVImage.imageType != null) {
                gVar.mo61711x(MVImage.f25034d);
                gVar.mo61678B(mVImage.imageType.getValue());
                gVar.mo61712y();
            }
            if (mVImage.anchor != null && mVImage.mo26198f()) {
                gVar.mo61711x(MVImage.f25035e);
                mVImage.anchor.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVImage mVImage = (MVImage) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVPointDouble mVPointDouble = mVImage.anchor;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVPointDouble mVPointDouble2 = new MVPointDouble();
                                mVImage.anchor = mVPointDouble2;
                                mVPointDouble2.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVImage.imageType = MVImageType.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVImage.imageData = gVar.mo61689b();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVImage.imageId = gVar.mo61696i();
                    mVImage.mo26203j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImage$b */
    public static class C8413b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8412a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImage$c */
    public static class C8414c extends C25240d<MVImage> {
        public C8414c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVImage mVImage = (MVImage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVImage.mo26200h()) {
                bitSet.set(0);
            }
            if (mVImage.mo26199g()) {
                bitSet.set(1);
            }
            if (mVImage.mo26202i()) {
                bitSet.set(2);
            }
            if (mVImage.mo26198f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVImage.mo26200h()) {
                jVar.mo61678B(mVImage.imageId);
            }
            if (mVImage.mo26199g()) {
                jVar.mo61707t(mVImage.imageData);
            }
            if (mVImage.mo26202i()) {
                jVar.mo61678B(mVImage.imageType.getValue());
            }
            if (mVImage.mo26198f()) {
                mVImage.anchor.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVImage mVImage = (MVImage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVImage.imageId = jVar.mo61696i();
                mVImage.mo26203j();
            }
            if (T.get(1)) {
                mVImage.imageData = jVar.mo61689b();
            }
            if (T.get(2)) {
                mVImage.imageType = MVImageType.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                MVPointDouble mVPointDouble = new MVPointDouble();
                mVImage.anchor = mVPointDouble;
                mVPointDouble.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImage$d */
    public static class C8415d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8414c(0);
        }
    }

    static {
        new C17394d0("MVImage");
        HashMap hashMap = new HashMap();
        f25036f = hashMap;
        hashMap.put(C25239c.class, new C8413b());
        hashMap.put(C25240d.class, new C8415d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IMAGE_ID, new FieldMetaData("imageId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IMAGE_DATA, new FieldMetaData("imageData", (byte) 3, new FieldValueMetaData((byte) 11, true)));
        enumMap.put(_Fields.IMAGE_TYPE, new FieldMetaData("imageType", (byte) 3, new EnumMetaData(MVImageType.class)));
        enumMap.put(_Fields.ANCHOR, new FieldMetaData("anchor", (byte) 2, new StructMetaData(MVPointDouble.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25037g = unmodifiableMap;
        FieldMetaData.m61947a(MVImage.class, unmodifiableMap);
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
        ((C25238b) f25036f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25036f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVImage mVImage = (MVImage) obj;
        if (!getClass().equals(mVImage.getClass())) {
            return getClass().getName().compareTo(mVImage.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26200h()).compareTo(Boolean.valueOf(mVImage.mo26200h()));
        if (compareTo2 != 0 || ((mo26200h() && (compareTo2 = C25082a.m62839c(this.imageId, mVImage.imageId)) != 0) || (compareTo2 = Boolean.valueOf(mo26199g()).compareTo(Boolean.valueOf(mVImage.mo26199g()))) != 0 || ((mo26199g() && (compareTo2 = this.imageData.compareTo(mVImage.imageData)) != 0) || (compareTo2 = Boolean.valueOf(mo26202i()).compareTo(Boolean.valueOf(mVImage.mo26202i()))) != 0 || ((mo26202i() && (compareTo2 = this.imageType.compareTo(mVImage.imageType)) != 0) || (compareTo2 = Boolean.valueOf(mo26198f()).compareTo(Boolean.valueOf(mVImage.mo26198f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo26198f() || (compareTo = this.anchor.compareTo(mVImage.anchor)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r9 instanceof com.tranzmate.moovit.protocol.common.MVImage
            r2 = 1
            if (r1 == 0) goto L_0x007e
            com.tranzmate.moovit.protocol.common.MVImage r9 = (com.tranzmate.moovit.protocol.common.MVImage) r9
            int r1 = r8.imageId
            int r3 = r9.imageId
            if (r1 == r3) goto L_0x0013
            goto L_0x007e
        L_0x0013:
            boolean r1 = r8.mo26199g()
            boolean r3 = r9.mo26199g()
            if (r1 != 0) goto L_0x001f
            if (r3 == 0) goto L_0x002f
        L_0x001f:
            if (r1 == 0) goto L_0x007e
            if (r3 != 0) goto L_0x0024
            goto L_0x007e
        L_0x0024:
            java.nio.ByteBuffer r1 = r8.imageData
            java.nio.ByteBuffer r3 = r9.imageData
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x002f
            goto L_0x007e
        L_0x002f:
            boolean r1 = r8.mo26202i()
            boolean r3 = r9.mo26202i()
            if (r1 != 0) goto L_0x003b
            if (r3 == 0) goto L_0x004b
        L_0x003b:
            if (r1 == 0) goto L_0x007e
            if (r3 != 0) goto L_0x0040
            goto L_0x007e
        L_0x0040:
            com.tranzmate.moovit.protocol.common.MVImageType r1 = r8.imageType
            com.tranzmate.moovit.protocol.common.MVImageType r3 = r9.imageType
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x004b
            goto L_0x007e
        L_0x004b:
            boolean r1 = r8.mo26198f()
            boolean r3 = r9.mo26198f()
            if (r1 != 0) goto L_0x0057
            if (r3 == 0) goto L_0x007d
        L_0x0057:
            if (r1 == 0) goto L_0x007e
            if (r3 != 0) goto L_0x005c
            goto L_0x007e
        L_0x005c:
            com.tranzmate.moovit.protocol.common.MVPointDouble r1 = r8.anchor
            com.tranzmate.moovit.protocol.common.MVPointDouble r9 = r9.anchor
            if (r9 != 0) goto L_0x0067
            r1.getClass()
        L_0x0065:
            r9 = 0
            goto L_0x007a
        L_0x0067:
            double r3 = r1.f25107x
            double r5 = r9.f25107x
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0070
            goto L_0x0065
        L_0x0070:
            double r3 = r1.f25108y
            double r5 = r9.f25108y
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x0079
            goto L_0x0065
        L_0x0079:
            r9 = 1
        L_0x007a:
            if (r9 != 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r0 = 1
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.common.MVImage.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo26198f() {
        return this.anchor != null;
    }

    /* renamed from: g */
    public final boolean mo26199g() {
        return this.imageData != null;
    }

    /* renamed from: h */
    public final boolean mo26200h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26202i() {
        return this.imageType != null;
    }

    /* renamed from: j */
    public final void mo26203j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVImage(", "imageId:");
        C0016g.m42z(n, this.imageId, ", ", "imageData:");
        ByteBuffer byteBuffer = this.imageData;
        if (byteBuffer == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            C25082a.m62851o(byteBuffer, n);
        }
        n.append(", ");
        n.append("imageType:");
        MVImageType mVImageType = this.imageType;
        if (mVImageType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageType);
        }
        if (mo26198f()) {
            n.append(", ");
            n.append("anchor:");
            MVPointDouble mVPointDouble = this.anchor;
            if (mVPointDouble == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPointDouble);
            }
        }
        n.append(")");
        return n.toString();
    }
}
