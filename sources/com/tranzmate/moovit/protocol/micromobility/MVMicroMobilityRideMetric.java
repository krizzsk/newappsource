package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
import com.tranzmate.moovit.protocol.common.MVTextOrImage;
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
import p531he.C17394d0;
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

public class MVMicroMobilityRideMetric implements TBase<MVMicroMobilityRideMetric, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityRideMetric> {

    /* renamed from: b */
    public static final C25113c f26746b = new C25113c("icon", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f26747c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26748d = new C25113c("subtitle", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26749e = new C25113c("accessory", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f26750f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26751g;
    public MVTextOrImage accessory;
    public MVImageReferenceWithParams icon;
    private _Fields[] optionals = {_Fields.ICON, _Fields.TITLE, _Fields.SUBTITLE, _Fields.ACCESSORY};
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        ICON(1, "icon"),
        TITLE(2, "title"),
        SUBTITLE(3, "subtitle"),
        ACCESSORY(4, "accessory");
        
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
                return ICON;
            }
            if (i == 2) {
                return TITLE;
            }
            if (i == 3) {
                return SUBTITLE;
            }
            if (i != 4) {
                return null;
            }
            return ACCESSORY;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideMetric$a */
    public static class C9348a extends C25239c<MVMicroMobilityRideMetric> {
        public C9348a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRideMetric mVMicroMobilityRideMetric = (MVMicroMobilityRideMetric) tBase;
            mVMicroMobilityRideMetric.getClass();
            C25113c cVar = MVMicroMobilityRideMetric.f26746b;
            gVar.mo61687K();
            if (mVMicroMobilityRideMetric.icon != null && mVMicroMobilityRideMetric.mo29009g()) {
                gVar.mo61711x(MVMicroMobilityRideMetric.f26746b);
                mVMicroMobilityRideMetric.icon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityRideMetric.title != null && mVMicroMobilityRideMetric.mo29012i()) {
                gVar.mo61711x(MVMicroMobilityRideMetric.f26747c);
                gVar.mo61686J(mVMicroMobilityRideMetric.title);
                gVar.mo61712y();
            }
            if (mVMicroMobilityRideMetric.subtitle != null && mVMicroMobilityRideMetric.mo29010h()) {
                gVar.mo61711x(MVMicroMobilityRideMetric.f26748d);
                gVar.mo61686J(mVMicroMobilityRideMetric.subtitle);
                gVar.mo61712y();
            }
            if (mVMicroMobilityRideMetric.accessory != null && mVMicroMobilityRideMetric.mo29008f()) {
                gVar.mo61711x(MVMicroMobilityRideMetric.f26749e);
                mVMicroMobilityRideMetric.accessory.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRideMetric mVMicroMobilityRideMetric = (MVMicroMobilityRideMetric) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityRideMetric.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVTextOrImage mVTextOrImage = new MVTextOrImage();
                                mVMicroMobilityRideMetric.accessory = mVTextOrImage;
                                mVTextOrImage.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVMicroMobilityRideMetric.subtitle = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVMicroMobilityRideMetric.title = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                    mVMicroMobilityRideMetric.icon = mVImageReferenceWithParams;
                    mVImageReferenceWithParams.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideMetric$b */
    public static class C9349b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9348a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideMetric$c */
    public static class C9350c extends C25240d<MVMicroMobilityRideMetric> {
        public C9350c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRideMetric mVMicroMobilityRideMetric = (MVMicroMobilityRideMetric) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityRideMetric.mo29009g()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityRideMetric.mo29012i()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityRideMetric.mo29010h()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityRideMetric.mo29008f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVMicroMobilityRideMetric.mo29009g()) {
                mVMicroMobilityRideMetric.icon.mo25202X0(jVar);
            }
            if (mVMicroMobilityRideMetric.mo29012i()) {
                jVar.mo61686J(mVMicroMobilityRideMetric.title);
            }
            if (mVMicroMobilityRideMetric.mo29010h()) {
                jVar.mo61686J(mVMicroMobilityRideMetric.subtitle);
            }
            if (mVMicroMobilityRideMetric.mo29008f()) {
                mVMicroMobilityRideMetric.accessory.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRideMetric mVMicroMobilityRideMetric = (MVMicroMobilityRideMetric) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVMicroMobilityRideMetric.icon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVMicroMobilityRideMetric.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVMicroMobilityRideMetric.subtitle = jVar.mo61704q();
            }
            if (T.get(3)) {
                MVTextOrImage mVTextOrImage = new MVTextOrImage();
                mVMicroMobilityRideMetric.accessory = mVTextOrImage;
                mVTextOrImage.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideMetric$d */
    public static class C9351d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9350c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityRideMetric");
        HashMap hashMap = new HashMap();
        f26750f = hashMap;
        hashMap.put(C25239c.class, new C9349b());
        hashMap.put(C25240d.class, new C9351d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ICON, new FieldMetaData("icon", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACCESSORY, new FieldMetaData("accessory", (byte) 2, new StructMetaData(MVTextOrImage.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26751g = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityRideMetric.class, unmodifiableMap);
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
        ((C25238b) f26750f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26750f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityRideMetric mVMicroMobilityRideMetric = (MVMicroMobilityRideMetric) obj;
        if (!getClass().equals(mVMicroMobilityRideMetric.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityRideMetric.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29009g()).compareTo(Boolean.valueOf(mVMicroMobilityRideMetric.mo29009g()));
        if (compareTo2 != 0 || ((mo29009g() && (compareTo2 = this.icon.compareTo(mVMicroMobilityRideMetric.icon)) != 0) || (compareTo2 = Boolean.valueOf(mo29012i()).compareTo(Boolean.valueOf(mVMicroMobilityRideMetric.mo29012i()))) != 0 || ((mo29012i() && (compareTo2 = this.title.compareTo(mVMicroMobilityRideMetric.title)) != 0) || (compareTo2 = Boolean.valueOf(mo29010h()).compareTo(Boolean.valueOf(mVMicroMobilityRideMetric.mo29010h()))) != 0 || ((mo29010h() && (compareTo2 = this.subtitle.compareTo(mVMicroMobilityRideMetric.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo29008f()).compareTo(Boolean.valueOf(mVMicroMobilityRideMetric.mo29008f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo29008f() || (compareTo = this.accessory.compareTo(mVMicroMobilityRideMetric.accessory)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityRideMetric)) {
            return false;
        }
        MVMicroMobilityRideMetric mVMicroMobilityRideMetric = (MVMicroMobilityRideMetric) obj;
        boolean g = mo29009g();
        boolean g2 = mVMicroMobilityRideMetric.mo29009g();
        if ((g || g2) && (!g || !g2 || !this.icon.mo26245a(mVMicroMobilityRideMetric.icon))) {
            return false;
        }
        boolean i = mo29012i();
        boolean i2 = mVMicroMobilityRideMetric.mo29012i();
        if ((i || i2) && (!i || !i2 || !this.title.equals(mVMicroMobilityRideMetric.title))) {
            return false;
        }
        boolean h = mo29010h();
        boolean h2 = mVMicroMobilityRideMetric.mo29010h();
        if ((h || h2) && (!h || !h2 || !this.subtitle.equals(mVMicroMobilityRideMetric.subtitle))) {
            return false;
        }
        boolean f = mo29008f();
        boolean f2 = mVMicroMobilityRideMetric.mo29008f();
        if ((f || f2) && (!f || !f2 || !this.accessory.mo26412a(mVMicroMobilityRideMetric.accessory))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29008f() {
        return this.accessory != null;
    }

    /* renamed from: g */
    public final boolean mo29009g() {
        return this.icon != null;
    }

    /* renamed from: h */
    public final boolean mo29010h() {
        return this.subtitle != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29012i() {
        return this.title != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVMicroMobilityRideMetric(");
        boolean z2 = false;
        if (mo29009g()) {
            sb.append("icon:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.icon;
            if (mVImageReferenceWithParams == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVImageReferenceWithParams);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29012i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("title:");
            String str = this.title;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        }
        if (mo29010h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("subtitle:");
            String str2 = this.subtitle;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
        } else {
            z2 = z;
        }
        if (mo29008f()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("accessory:");
            MVTextOrImage mVTextOrImage = this.accessory;
            if (mVTextOrImage == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVTextOrImage);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
