package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
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

public class MVTodPassengerQrCodeActionInfo implements TBase<MVTodPassengerQrCodeActionInfo, _Fields>, Serializable, Cloneable, Comparable<MVTodPassengerQrCodeActionInfo> {

    /* renamed from: b */
    public static final C25113c f29504b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29505c = new C25113c("instructions", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29506d = new C25113c("icon", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f29507e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29508f;
    public MVImageReferenceWithParams icon;
    public String instructions;
    private _Fields[] optionals = {_Fields.INSTRUCTIONS, _Fields.ICON};
    public String title;

    public enum _Fields implements C25085c {
        TITLE(1, "title"),
        INSTRUCTIONS(2, "instructions"),
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
                return TITLE;
            }
            if (i == 2) {
                return INSTRUCTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerQrCodeActionInfo$a */
    public static class C11287a extends C25239c<MVTodPassengerQrCodeActionInfo> {
        public C11287a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerQrCodeActionInfo mVTodPassengerQrCodeActionInfo = (MVTodPassengerQrCodeActionInfo) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVTodPassengerQrCodeActionInfo.icon;
            C25113c cVar = MVTodPassengerQrCodeActionInfo.f29504b;
            gVar.mo61687K();
            if (mVTodPassengerQrCodeActionInfo.title != null) {
                gVar.mo61711x(MVTodPassengerQrCodeActionInfo.f29504b);
                gVar.mo61686J(mVTodPassengerQrCodeActionInfo.title);
                gVar.mo61712y();
            }
            if (mVTodPassengerQrCodeActionInfo.instructions != null && mVTodPassengerQrCodeActionInfo.mo33607g()) {
                gVar.mo61711x(MVTodPassengerQrCodeActionInfo.f29505c);
                gVar.mo61686J(mVTodPassengerQrCodeActionInfo.instructions);
                gVar.mo61712y();
            }
            if (mVTodPassengerQrCodeActionInfo.icon != null && mVTodPassengerQrCodeActionInfo.mo33606f()) {
                gVar.mo61711x(MVTodPassengerQrCodeActionInfo.f29506d);
                mVTodPassengerQrCodeActionInfo.icon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerQrCodeActionInfo mVTodPassengerQrCodeActionInfo = (MVTodPassengerQrCodeActionInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVTodPassengerQrCodeActionInfo.icon;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVTodPassengerQrCodeActionInfo.icon = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTodPassengerQrCodeActionInfo.instructions = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodPassengerQrCodeActionInfo.title = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerQrCodeActionInfo$b */
    public static class C11288b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11287a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerQrCodeActionInfo$c */
    public static class C11289c extends C25240d<MVTodPassengerQrCodeActionInfo> {
        public C11289c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerQrCodeActionInfo mVTodPassengerQrCodeActionInfo = (MVTodPassengerQrCodeActionInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodPassengerQrCodeActionInfo.mo33608h()) {
                bitSet.set(0);
            }
            if (mVTodPassengerQrCodeActionInfo.mo33607g()) {
                bitSet.set(1);
            }
            if (mVTodPassengerQrCodeActionInfo.mo33606f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTodPassengerQrCodeActionInfo.mo33608h()) {
                jVar.mo61686J(mVTodPassengerQrCodeActionInfo.title);
            }
            if (mVTodPassengerQrCodeActionInfo.mo33607g()) {
                jVar.mo61686J(mVTodPassengerQrCodeActionInfo.instructions);
            }
            if (mVTodPassengerQrCodeActionInfo.mo33606f()) {
                mVTodPassengerQrCodeActionInfo.icon.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerQrCodeActionInfo mVTodPassengerQrCodeActionInfo = (MVTodPassengerQrCodeActionInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTodPassengerQrCodeActionInfo.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTodPassengerQrCodeActionInfo.instructions = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVTodPassengerQrCodeActionInfo.icon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerQrCodeActionInfo$d */
    public static class C11290d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11289c(0);
        }
    }

    static {
        new C17394d0("MVTodPassengerQrCodeActionInfo");
        HashMap hashMap = new HashMap();
        f29507e = hashMap;
        hashMap.put(C25239c.class, new C11288b());
        hashMap.put(C25240d.class, new C11290d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INSTRUCTIONS, new FieldMetaData("instructions", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ICON, new FieldMetaData("icon", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29508f = unmodifiableMap;
        FieldMetaData.m61947a(MVTodPassengerQrCodeActionInfo.class, unmodifiableMap);
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
        ((C25238b) f29507e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29507e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodPassengerQrCodeActionInfo mVTodPassengerQrCodeActionInfo = (MVTodPassengerQrCodeActionInfo) obj;
        if (!getClass().equals(mVTodPassengerQrCodeActionInfo.getClass())) {
            return getClass().getName().compareTo(mVTodPassengerQrCodeActionInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33608h()).compareTo(Boolean.valueOf(mVTodPassengerQrCodeActionInfo.mo33608h()));
        if (compareTo2 != 0 || ((mo33608h() && (compareTo2 = this.title.compareTo(mVTodPassengerQrCodeActionInfo.title)) != 0) || (compareTo2 = Boolean.valueOf(mo33607g()).compareTo(Boolean.valueOf(mVTodPassengerQrCodeActionInfo.mo33607g()))) != 0 || ((mo33607g() && (compareTo2 = this.instructions.compareTo(mVTodPassengerQrCodeActionInfo.instructions)) != 0) || (compareTo2 = Boolean.valueOf(mo33606f()).compareTo(Boolean.valueOf(mVTodPassengerQrCodeActionInfo.mo33606f()))) != 0))) {
            return compareTo2;
        }
        if (!mo33606f() || (compareTo = this.icon.compareTo(mVTodPassengerQrCodeActionInfo.icon)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodPassengerQrCodeActionInfo)) {
            return false;
        }
        MVTodPassengerQrCodeActionInfo mVTodPassengerQrCodeActionInfo = (MVTodPassengerQrCodeActionInfo) obj;
        boolean h = mo33608h();
        boolean h2 = mVTodPassengerQrCodeActionInfo.mo33608h();
        if ((h || h2) && (!h || !h2 || !this.title.equals(mVTodPassengerQrCodeActionInfo.title))) {
            return false;
        }
        boolean g = mo33607g();
        boolean g2 = mVTodPassengerQrCodeActionInfo.mo33607g();
        if ((g || g2) && (!g || !g2 || !this.instructions.equals(mVTodPassengerQrCodeActionInfo.instructions))) {
            return false;
        }
        boolean f = mo33606f();
        boolean f2 = mVTodPassengerQrCodeActionInfo.mo33606f();
        if ((f || f2) && (!f || !f2 || !this.icon.mo26245a(mVTodPassengerQrCodeActionInfo.icon))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33606f() {
        return this.icon != null;
    }

    /* renamed from: g */
    public final boolean mo33607g() {
        return this.instructions != null;
    }

    /* renamed from: h */
    public final boolean mo33608h() {
        return this.title != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodPassengerQrCodeActionInfo(", "title:");
        String str = this.title;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo33607g()) {
            n.append(", ");
            n.append("instructions:");
            String str2 = this.instructions;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo33606f()) {
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
