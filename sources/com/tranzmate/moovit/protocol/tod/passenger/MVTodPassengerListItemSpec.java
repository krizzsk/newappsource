package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.models.MessageButton;
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
import p358af.C13437d;
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

public class MVTodPassengerListItemSpec implements TBase<MVTodPassengerListItemSpec, _Fields>, Serializable, Cloneable, Comparable<MVTodPassengerListItemSpec> {

    /* renamed from: b */
    public static final C25113c f29493b = new C25113c(MessageButton.TEXT, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29494c = new C25113c("textColor", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f29495d = new C25113c("icon", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f29496e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29497f;
    public MVImageReferenceWithParams icon;
    private _Fields[] optionals = {_Fields.ICON};
    public String text;
    public MVClientColorScheme textColor;

    public enum _Fields implements C25085c {
        TEXT(1, MessageButton.TEXT),
        TEXT_COLOR(2, "textColor"),
        ICON(3, "icon");
        
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
                return TEXT;
            }
            if (i == 2) {
                return TEXT_COLOR;
            }
            if (i != 3) {
                return null;
            }
            return ICON;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerListItemSpec$a */
    public static class C11279a extends C25239c<MVTodPassengerListItemSpec> {
        public C11279a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerListItemSpec mVTodPassengerListItemSpec = (MVTodPassengerListItemSpec) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVTodPassengerListItemSpec.icon;
            C25113c cVar = MVTodPassengerListItemSpec.f29493b;
            gVar.mo61687K();
            if (mVTodPassengerListItemSpec.text != null) {
                gVar.mo61711x(MVTodPassengerListItemSpec.f29493b);
                gVar.mo61686J(mVTodPassengerListItemSpec.text);
                gVar.mo61712y();
            }
            if (mVTodPassengerListItemSpec.textColor != null) {
                gVar.mo61711x(MVTodPassengerListItemSpec.f29494c);
                gVar.mo61678B(mVTodPassengerListItemSpec.textColor.getValue());
                gVar.mo61712y();
            }
            if (mVTodPassengerListItemSpec.icon != null && mVTodPassengerListItemSpec.mo33588f()) {
                gVar.mo61711x(MVTodPassengerListItemSpec.f29495d);
                mVTodPassengerListItemSpec.icon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerListItemSpec mVTodPassengerListItemSpec = (MVTodPassengerListItemSpec) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVTodPassengerListItemSpec.icon;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVTodPassengerListItemSpec.icon = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVTodPassengerListItemSpec.textColor = MVClientColorScheme.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodPassengerListItemSpec.text = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerListItemSpec$b */
    public static class C11280b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11279a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerListItemSpec$c */
    public static class C11281c extends C25240d<MVTodPassengerListItemSpec> {
        public C11281c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerListItemSpec mVTodPassengerListItemSpec = (MVTodPassengerListItemSpec) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodPassengerListItemSpec.mo33589g()) {
                bitSet.set(0);
            }
            if (mVTodPassengerListItemSpec.mo33590h()) {
                bitSet.set(1);
            }
            if (mVTodPassengerListItemSpec.mo33588f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTodPassengerListItemSpec.mo33589g()) {
                jVar.mo61686J(mVTodPassengerListItemSpec.text);
            }
            if (mVTodPassengerListItemSpec.mo33590h()) {
                jVar.mo61678B(mVTodPassengerListItemSpec.textColor.getValue());
            }
            if (mVTodPassengerListItemSpec.mo33588f()) {
                mVTodPassengerListItemSpec.icon.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerListItemSpec mVTodPassengerListItemSpec = (MVTodPassengerListItemSpec) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTodPassengerListItemSpec.text = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTodPassengerListItemSpec.textColor = MVClientColorScheme.findByValue(jVar.mo61696i());
            }
            if (T.get(2)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVTodPassengerListItemSpec.icon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerListItemSpec$d */
    public static class C11282d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11281c(0);
        }
    }

    static {
        new C17394d0("MVTodPassengerListItemSpec");
        HashMap hashMap = new HashMap();
        f29496e = hashMap;
        hashMap.put(C25239c.class, new C11280b());
        hashMap.put(C25240d.class, new C11282d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TEXT, new FieldMetaData(MessageButton.TEXT, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TEXT_COLOR, new FieldMetaData("textColor", (byte) 3, new EnumMetaData(MVClientColorScheme.class)));
        enumMap.put(_Fields.ICON, new FieldMetaData("icon", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29497f = unmodifiableMap;
        FieldMetaData.m61947a(MVTodPassengerListItemSpec.class, unmodifiableMap);
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
        ((C25238b) f29496e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29496e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodPassengerListItemSpec mVTodPassengerListItemSpec = (MVTodPassengerListItemSpec) obj;
        if (!getClass().equals(mVTodPassengerListItemSpec.getClass())) {
            return getClass().getName().compareTo(mVTodPassengerListItemSpec.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33589g()).compareTo(Boolean.valueOf(mVTodPassengerListItemSpec.mo33589g()));
        if (compareTo2 != 0 || ((mo33589g() && (compareTo2 = this.text.compareTo(mVTodPassengerListItemSpec.text)) != 0) || (compareTo2 = Boolean.valueOf(mo33590h()).compareTo(Boolean.valueOf(mVTodPassengerListItemSpec.mo33590h()))) != 0 || ((mo33590h() && (compareTo2 = this.textColor.compareTo(mVTodPassengerListItemSpec.textColor)) != 0) || (compareTo2 = Boolean.valueOf(mo33588f()).compareTo(Boolean.valueOf(mVTodPassengerListItemSpec.mo33588f()))) != 0))) {
            return compareTo2;
        }
        if (!mo33588f() || (compareTo = this.icon.compareTo(mVTodPassengerListItemSpec.icon)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodPassengerListItemSpec)) {
            return false;
        }
        MVTodPassengerListItemSpec mVTodPassengerListItemSpec = (MVTodPassengerListItemSpec) obj;
        boolean g = mo33589g();
        boolean g2 = mVTodPassengerListItemSpec.mo33589g();
        if ((g || g2) && (!g || !g2 || !this.text.equals(mVTodPassengerListItemSpec.text))) {
            return false;
        }
        boolean h = mo33590h();
        boolean h2 = mVTodPassengerListItemSpec.mo33590h();
        if ((h || h2) && (!h || !h2 || !this.textColor.equals(mVTodPassengerListItemSpec.textColor))) {
            return false;
        }
        boolean f = mo33588f();
        boolean f2 = mVTodPassengerListItemSpec.mo33588f();
        if ((f || f2) && (!f || !f2 || !this.icon.mo26245a(mVTodPassengerListItemSpec.icon))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33588f() {
        return this.icon != null;
    }

    /* renamed from: g */
    public final boolean mo33589g() {
        return this.text != null;
    }

    /* renamed from: h */
    public final boolean mo33590h() {
        return this.textColor != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodPassengerListItemSpec(", "text:");
        String str = this.text;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("textColor:");
        MVClientColorScheme mVClientColorScheme = this.textColor;
        if (mVClientColorScheme == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVClientColorScheme);
        }
        if (mo33588f()) {
            n.append(", ");
            n.append("icon:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.icon;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        n.append(")");
        return n.toString();
    }
}
