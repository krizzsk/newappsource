package com.tranzmate.moovit.protocol.common;

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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVInfoBoxData implements TBase<MVInfoBoxData, _Fields>, Serializable, Cloneable, Comparable<MVInfoBoxData> {

    /* renamed from: b */
    public static final C25113c f25071b = new C25113c("icon", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f25072c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25073d = new C25113c("subtitle", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f25074e = new C25113c("backgroundColor", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f25075f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f25076g;
    public MVClientColorScheme backgroundColor;
    public MVImageReferenceWithParams icon;
    private _Fields[] optionals = {_Fields.ICON, _Fields.TITLE, _Fields.SUBTITLE};
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        ICON(1, "icon"),
        TITLE(2, "title"),
        SUBTITLE(3, "subtitle"),
        BACKGROUND_COLOR(4, "backgroundColor");
        
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
            return BACKGROUND_COLOR;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVInfoBoxData$a */
    public static class C8452a extends C25239c<MVInfoBoxData> {
        public C8452a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVInfoBoxData mVInfoBoxData = (MVInfoBoxData) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVInfoBoxData.icon;
            C25113c cVar = MVInfoBoxData.f25071b;
            gVar.mo61687K();
            if (mVInfoBoxData.icon != null && mVInfoBoxData.mo26284g()) {
                gVar.mo61711x(MVInfoBoxData.f25071b);
                mVInfoBoxData.icon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVInfoBoxData.title != null && mVInfoBoxData.mo26287i()) {
                gVar.mo61711x(MVInfoBoxData.f25072c);
                gVar.mo61686J(mVInfoBoxData.title);
                gVar.mo61712y();
            }
            if (mVInfoBoxData.subtitle != null && mVInfoBoxData.mo26285h()) {
                gVar.mo61711x(MVInfoBoxData.f25073d);
                gVar.mo61686J(mVInfoBoxData.subtitle);
                gVar.mo61712y();
            }
            if (mVInfoBoxData.backgroundColor != null) {
                gVar.mo61711x(MVInfoBoxData.f25074e);
                gVar.mo61678B(mVInfoBoxData.backgroundColor.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVInfoBoxData mVInfoBoxData = (MVInfoBoxData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVInfoBoxData.icon;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVInfoBoxData.backgroundColor = MVClientColorScheme.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVInfoBoxData.subtitle = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVInfoBoxData.title = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                    mVInfoBoxData.icon = mVImageReferenceWithParams2;
                    mVImageReferenceWithParams2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVInfoBoxData$b */
    public static class C8453b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8452a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVInfoBoxData$c */
    public static class C8454c extends C25240d<MVInfoBoxData> {
        public C8454c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVInfoBoxData mVInfoBoxData = (MVInfoBoxData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVInfoBoxData.mo26284g()) {
                bitSet.set(0);
            }
            if (mVInfoBoxData.mo26287i()) {
                bitSet.set(1);
            }
            if (mVInfoBoxData.mo26285h()) {
                bitSet.set(2);
            }
            if (mVInfoBoxData.mo26283f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVInfoBoxData.mo26284g()) {
                mVInfoBoxData.icon.mo25202X0(jVar);
            }
            if (mVInfoBoxData.mo26287i()) {
                jVar.mo61686J(mVInfoBoxData.title);
            }
            if (mVInfoBoxData.mo26285h()) {
                jVar.mo61686J(mVInfoBoxData.subtitle);
            }
            if (mVInfoBoxData.mo26283f()) {
                jVar.mo61678B(mVInfoBoxData.backgroundColor.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVInfoBoxData mVInfoBoxData = (MVInfoBoxData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVInfoBoxData.icon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVInfoBoxData.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVInfoBoxData.subtitle = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVInfoBoxData.backgroundColor = MVClientColorScheme.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVInfoBoxData$d */
    public static class C8455d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8454c(0);
        }
    }

    static {
        new C17394d0("MVInfoBoxData");
        HashMap hashMap = new HashMap();
        f25075f = hashMap;
        hashMap.put(C25239c.class, new C8453b());
        hashMap.put(C25240d.class, new C8455d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ICON, new FieldMetaData("icon", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BACKGROUND_COLOR, new FieldMetaData("backgroundColor", (byte) 3, new EnumMetaData(MVClientColorScheme.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25076g = unmodifiableMap;
        FieldMetaData.m61947a(MVInfoBoxData.class, unmodifiableMap);
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
        ((C25238b) f25075f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25075f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26280a(MVInfoBoxData mVInfoBoxData) {
        if (mVInfoBoxData == null) {
            return false;
        }
        boolean g = mo26284g();
        boolean g2 = mVInfoBoxData.mo26284g();
        if ((g || g2) && (!g || !g2 || !this.icon.mo26245a(mVInfoBoxData.icon))) {
            return false;
        }
        boolean i = mo26287i();
        boolean i2 = mVInfoBoxData.mo26287i();
        if ((i || i2) && (!i || !i2 || !this.title.equals(mVInfoBoxData.title))) {
            return false;
        }
        boolean h = mo26285h();
        boolean h2 = mVInfoBoxData.mo26285h();
        if ((h || h2) && (!h || !h2 || !this.subtitle.equals(mVInfoBoxData.subtitle))) {
            return false;
        }
        boolean f = mo26283f();
        boolean f2 = mVInfoBoxData.mo26283f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.backgroundColor.equals(mVInfoBoxData.backgroundColor)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVInfoBoxData mVInfoBoxData = (MVInfoBoxData) obj;
        if (!getClass().equals(mVInfoBoxData.getClass())) {
            return getClass().getName().compareTo(mVInfoBoxData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26284g()).compareTo(Boolean.valueOf(mVInfoBoxData.mo26284g()));
        if (compareTo2 != 0 || ((mo26284g() && (compareTo2 = this.icon.compareTo(mVInfoBoxData.icon)) != 0) || (compareTo2 = Boolean.valueOf(mo26287i()).compareTo(Boolean.valueOf(mVInfoBoxData.mo26287i()))) != 0 || ((mo26287i() && (compareTo2 = this.title.compareTo(mVInfoBoxData.title)) != 0) || (compareTo2 = Boolean.valueOf(mo26285h()).compareTo(Boolean.valueOf(mVInfoBoxData.mo26285h()))) != 0 || ((mo26285h() && (compareTo2 = this.subtitle.compareTo(mVInfoBoxData.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo26283f()).compareTo(Boolean.valueOf(mVInfoBoxData.mo26283f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo26283f() || (compareTo = this.backgroundColor.compareTo(mVInfoBoxData.backgroundColor)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVInfoBoxData)) {
            return mo26280a((MVInfoBoxData) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26283f() {
        return this.backgroundColor != null;
    }

    /* renamed from: g */
    public final boolean mo26284g() {
        return this.icon != null;
    }

    /* renamed from: h */
    public final boolean mo26285h() {
        return this.subtitle != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26287i() {
        return this.title != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVInfoBoxData(");
        boolean z2 = false;
        if (mo26284g()) {
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
        if (mo26287i()) {
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
        if (mo26285h()) {
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
        if (!z2) {
            sb.append(", ");
        }
        sb.append("backgroundColor:");
        MVClientColorScheme mVClientColorScheme = this.backgroundColor;
        if (mVClientColorScheme == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVClientColorScheme);
        }
        sb.append(")");
        return sb.toString();
    }
}
