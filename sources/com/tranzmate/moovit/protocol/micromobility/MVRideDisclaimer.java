package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVClientColorScheme;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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

public class MVRideDisclaimer implements TBase<MVRideDisclaimer, _Fields>, Serializable, Cloneable, Comparable<MVRideDisclaimer> {

    /* renamed from: b */
    public static final C25113c f26778b = new C25113c("icon", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f26779c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26780d = new C25113c("subtitle", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26781e = new C25113c("backgroundColor", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f26782f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26783g;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVRideDisclaimer$a */
    public static class C9376a extends C25239c<MVRideDisclaimer> {
        public C9376a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRideDisclaimer mVRideDisclaimer = (MVRideDisclaimer) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVRideDisclaimer.icon;
            C25113c cVar = MVRideDisclaimer.f26778b;
            gVar.mo61687K();
            if (mVRideDisclaimer.icon != null && mVRideDisclaimer.mo29067g()) {
                gVar.mo61711x(MVRideDisclaimer.f26778b);
                mVRideDisclaimer.icon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRideDisclaimer.title != null && mVRideDisclaimer.mo29070i()) {
                gVar.mo61711x(MVRideDisclaimer.f26779c);
                gVar.mo61686J(mVRideDisclaimer.title);
                gVar.mo61712y();
            }
            if (mVRideDisclaimer.subtitle != null && mVRideDisclaimer.mo29068h()) {
                gVar.mo61711x(MVRideDisclaimer.f26780d);
                gVar.mo61686J(mVRideDisclaimer.subtitle);
                gVar.mo61712y();
            }
            if (mVRideDisclaimer.backgroundColor != null) {
                gVar.mo61711x(MVRideDisclaimer.f26781e);
                gVar.mo61678B(mVRideDisclaimer.backgroundColor.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRideDisclaimer mVRideDisclaimer = (MVRideDisclaimer) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVRideDisclaimer.icon;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVRideDisclaimer.backgroundColor = MVClientColorScheme.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVRideDisclaimer.subtitle = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVRideDisclaimer.title = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                    mVRideDisclaimer.icon = mVImageReferenceWithParams2;
                    mVImageReferenceWithParams2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVRideDisclaimer$b */
    public static class C9377b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9376a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVRideDisclaimer$c */
    public static class C9378c extends C25240d<MVRideDisclaimer> {
        public C9378c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRideDisclaimer mVRideDisclaimer = (MVRideDisclaimer) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRideDisclaimer.mo29067g()) {
                bitSet.set(0);
            }
            if (mVRideDisclaimer.mo29070i()) {
                bitSet.set(1);
            }
            if (mVRideDisclaimer.mo29068h()) {
                bitSet.set(2);
            }
            if (mVRideDisclaimer.mo29066f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVRideDisclaimer.mo29067g()) {
                mVRideDisclaimer.icon.mo25202X0(jVar);
            }
            if (mVRideDisclaimer.mo29070i()) {
                jVar.mo61686J(mVRideDisclaimer.title);
            }
            if (mVRideDisclaimer.mo29068h()) {
                jVar.mo61686J(mVRideDisclaimer.subtitle);
            }
            if (mVRideDisclaimer.mo29066f()) {
                jVar.mo61678B(mVRideDisclaimer.backgroundColor.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRideDisclaimer mVRideDisclaimer = (MVRideDisclaimer) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVRideDisclaimer.icon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVRideDisclaimer.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVRideDisclaimer.subtitle = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVRideDisclaimer.backgroundColor = MVClientColorScheme.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVRideDisclaimer$d */
    public static class C9379d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9378c(0);
        }
    }

    static {
        new C17394d0("MVRideDisclaimer");
        HashMap hashMap = new HashMap();
        f26782f = hashMap;
        hashMap.put(C25239c.class, new C9377b());
        hashMap.put(C25240d.class, new C9379d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ICON, new FieldMetaData("icon", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BACKGROUND_COLOR, new FieldMetaData("backgroundColor", (byte) 3, new EnumMetaData(MVClientColorScheme.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26783g = unmodifiableMap;
        FieldMetaData.m61947a(MVRideDisclaimer.class, unmodifiableMap);
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
        ((C25238b) f26782f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26782f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29063a(MVRideDisclaimer mVRideDisclaimer) {
        if (mVRideDisclaimer == null) {
            return false;
        }
        boolean g = mo29067g();
        boolean g2 = mVRideDisclaimer.mo29067g();
        if ((g || g2) && (!g || !g2 || !this.icon.mo26245a(mVRideDisclaimer.icon))) {
            return false;
        }
        boolean i = mo29070i();
        boolean i2 = mVRideDisclaimer.mo29070i();
        if ((i || i2) && (!i || !i2 || !this.title.equals(mVRideDisclaimer.title))) {
            return false;
        }
        boolean h = mo29068h();
        boolean h2 = mVRideDisclaimer.mo29068h();
        if ((h || h2) && (!h || !h2 || !this.subtitle.equals(mVRideDisclaimer.subtitle))) {
            return false;
        }
        boolean f = mo29066f();
        boolean f2 = mVRideDisclaimer.mo29066f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.backgroundColor.equals(mVRideDisclaimer.backgroundColor)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVRideDisclaimer mVRideDisclaimer = (MVRideDisclaimer) obj;
        if (!getClass().equals(mVRideDisclaimer.getClass())) {
            return getClass().getName().compareTo(mVRideDisclaimer.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29067g()).compareTo(Boolean.valueOf(mVRideDisclaimer.mo29067g()));
        if (compareTo2 != 0 || ((mo29067g() && (compareTo2 = this.icon.compareTo(mVRideDisclaimer.icon)) != 0) || (compareTo2 = Boolean.valueOf(mo29070i()).compareTo(Boolean.valueOf(mVRideDisclaimer.mo29070i()))) != 0 || ((mo29070i() && (compareTo2 = this.title.compareTo(mVRideDisclaimer.title)) != 0) || (compareTo2 = Boolean.valueOf(mo29068h()).compareTo(Boolean.valueOf(mVRideDisclaimer.mo29068h()))) != 0 || ((mo29068h() && (compareTo2 = this.subtitle.compareTo(mVRideDisclaimer.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo29066f()).compareTo(Boolean.valueOf(mVRideDisclaimer.mo29066f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo29066f() || (compareTo = this.backgroundColor.compareTo(mVRideDisclaimer.backgroundColor)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVRideDisclaimer)) {
            return mo29063a((MVRideDisclaimer) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29066f() {
        return this.backgroundColor != null;
    }

    /* renamed from: g */
    public final boolean mo29067g() {
        return this.icon != null;
    }

    /* renamed from: h */
    public final boolean mo29068h() {
        return this.subtitle != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29070i() {
        return this.title != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVRideDisclaimer(");
        boolean z2 = false;
        if (mo29067g()) {
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
        if (mo29070i()) {
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
        if (mo29068h()) {
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
