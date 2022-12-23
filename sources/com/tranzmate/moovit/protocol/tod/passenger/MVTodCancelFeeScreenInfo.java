package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.models.InAppMessageBase;
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

public class MVTodCancelFeeScreenInfo implements TBase<MVTodCancelFeeScreenInfo, _Fields>, Serializable, Cloneable, Comparable<MVTodCancelFeeScreenInfo> {

    /* renamed from: b */
    public static final C25113c f29366b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29367c = new C25113c(InAppMessageBase.MESSAGE, (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f29368d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29369e;
    public String message;
    private _Fields[] optionals = {_Fields.TITLE, _Fields.MESSAGE};
    public String title;

    public enum _Fields implements C25085c {
        TITLE(1, "title"),
        MESSAGE(2, InAppMessageBase.MESSAGE);
        
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
            if (i != 2) {
                return null;
            }
            return MESSAGE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodCancelFeeScreenInfo$a */
    public static class C11197a extends C25239c<MVTodCancelFeeScreenInfo> {
        public C11197a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodCancelFeeScreenInfo mVTodCancelFeeScreenInfo = (MVTodCancelFeeScreenInfo) tBase;
            mVTodCancelFeeScreenInfo.getClass();
            C25113c cVar = MVTodCancelFeeScreenInfo.f29366b;
            gVar.mo61687K();
            if (mVTodCancelFeeScreenInfo.title != null && mVTodCancelFeeScreenInfo.mo33375g()) {
                gVar.mo61711x(MVTodCancelFeeScreenInfo.f29366b);
                gVar.mo61686J(mVTodCancelFeeScreenInfo.title);
                gVar.mo61712y();
            }
            if (mVTodCancelFeeScreenInfo.message != null && mVTodCancelFeeScreenInfo.mo33374f()) {
                gVar.mo61711x(MVTodCancelFeeScreenInfo.f29367c);
                gVar.mo61686J(mVTodCancelFeeScreenInfo.message);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodCancelFeeScreenInfo mVTodCancelFeeScreenInfo = (MVTodCancelFeeScreenInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodCancelFeeScreenInfo.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVTodCancelFeeScreenInfo.message = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodCancelFeeScreenInfo.title = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodCancelFeeScreenInfo$b */
    public static class C11198b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11197a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodCancelFeeScreenInfo$c */
    public static class C11199c extends C25240d<MVTodCancelFeeScreenInfo> {
        public C11199c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodCancelFeeScreenInfo mVTodCancelFeeScreenInfo = (MVTodCancelFeeScreenInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodCancelFeeScreenInfo.mo33375g()) {
                bitSet.set(0);
            }
            if (mVTodCancelFeeScreenInfo.mo33374f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTodCancelFeeScreenInfo.mo33375g()) {
                jVar.mo61686J(mVTodCancelFeeScreenInfo.title);
            }
            if (mVTodCancelFeeScreenInfo.mo33374f()) {
                jVar.mo61686J(mVTodCancelFeeScreenInfo.message);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodCancelFeeScreenInfo mVTodCancelFeeScreenInfo = (MVTodCancelFeeScreenInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTodCancelFeeScreenInfo.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTodCancelFeeScreenInfo.message = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodCancelFeeScreenInfo$d */
    public static class C11200d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11199c(0);
        }
    }

    static {
        new C17394d0("MVTodCancelFeeScreenInfo");
        HashMap hashMap = new HashMap();
        f29368d = hashMap;
        hashMap.put(C25239c.class, new C11198b());
        hashMap.put(C25240d.class, new C11200d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MESSAGE, new FieldMetaData(InAppMessageBase.MESSAGE, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29369e = unmodifiableMap;
        FieldMetaData.m61947a(MVTodCancelFeeScreenInfo.class, unmodifiableMap);
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
        ((C25238b) f29368d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29368d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo33371a(MVTodCancelFeeScreenInfo mVTodCancelFeeScreenInfo) {
        if (mVTodCancelFeeScreenInfo == null) {
            return false;
        }
        boolean g = mo33375g();
        boolean g2 = mVTodCancelFeeScreenInfo.mo33375g();
        if ((g || g2) && (!g || !g2 || !this.title.equals(mVTodCancelFeeScreenInfo.title))) {
            return false;
        }
        boolean f = mo33374f();
        boolean f2 = mVTodCancelFeeScreenInfo.mo33374f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.message.equals(mVTodCancelFeeScreenInfo.message)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodCancelFeeScreenInfo mVTodCancelFeeScreenInfo = (MVTodCancelFeeScreenInfo) obj;
        if (!getClass().equals(mVTodCancelFeeScreenInfo.getClass())) {
            return getClass().getName().compareTo(mVTodCancelFeeScreenInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33375g()).compareTo(Boolean.valueOf(mVTodCancelFeeScreenInfo.mo33375g()));
        if (compareTo2 != 0 || ((mo33375g() && (compareTo2 = this.title.compareTo(mVTodCancelFeeScreenInfo.title)) != 0) || (compareTo2 = Boolean.valueOf(mo33374f()).compareTo(Boolean.valueOf(mVTodCancelFeeScreenInfo.mo33374f()))) != 0)) {
            return compareTo2;
        }
        if (!mo33374f() || (compareTo = this.message.compareTo(mVTodCancelFeeScreenInfo.message)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodCancelFeeScreenInfo)) {
            return mo33371a((MVTodCancelFeeScreenInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33374f() {
        return this.message != null;
    }

    /* renamed from: g */
    public final boolean mo33375g() {
        return this.title != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVTodCancelFeeScreenInfo(");
        if (mo33375g()) {
            sb.append("title:");
            String str = this.title;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo33374f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("message:");
            String str2 = this.message;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
