package com.tranzmate.moovit.protocol.ticketingV2;

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
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0017h;
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

public class MVMediaTicketReceipt implements TBase<MVMediaTicketReceipt, _Fields>, Serializable, Cloneable, Comparable<MVMediaTicketReceipt> {

    /* renamed from: b */
    public static final C25113c f28733b = new C25113c("validityStart", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f28734c = new C25113c("validityEnd", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f28735d = new C25113c("beforeValidityMedia", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f28736e = new C25113c("validityMedia", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f28737f = new C25113c("afterValidityMedia", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f28738g = new C25113c("showValidityTimer", (byte) 2, 6);

    /* renamed from: h */
    public static final HashMap f28739h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f28740i;
    private byte __isset_bitfield = 0;
    public MVMediaTicketReceiptContent afterValidityMedia;
    public MVMediaTicketReceiptContent beforeValidityMedia;
    public boolean showValidityTimer;
    public long validityEnd;
    public MVMediaTicketReceiptContent validityMedia;
    public long validityStart;

    public enum _Fields implements C25085c {
        VALIDITY_START(1, "validityStart"),
        VALIDITY_END(2, "validityEnd"),
        BEFORE_VALIDITY_MEDIA(3, "beforeValidityMedia"),
        VALIDITY_MEDIA(4, "validityMedia"),
        AFTER_VALIDITY_MEDIA(5, "afterValidityMedia"),
        SHOW_VALIDITY_TIMER(6, "showValidityTimer");
        
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
                    return VALIDITY_START;
                case 2:
                    return VALIDITY_END;
                case 3:
                    return BEFORE_VALIDITY_MEDIA;
                case 4:
                    return VALIDITY_MEDIA;
                case 5:
                    return AFTER_VALIDITY_MEDIA;
                case 6:
                    return SHOW_VALIDITY_TIMER;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVMediaTicketReceipt$a */
    public static class C10819a extends C25239c<MVMediaTicketReceipt> {
        public C10819a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMediaTicketReceipt mVMediaTicketReceipt = (MVMediaTicketReceipt) tBase;
            MVMediaTicketReceiptContent mVMediaTicketReceiptContent = mVMediaTicketReceipt.beforeValidityMedia;
            C25113c cVar = MVMediaTicketReceipt.f28733b;
            gVar.mo61687K();
            gVar.mo61711x(MVMediaTicketReceipt.f28733b);
            gVar.mo61679C(mVMediaTicketReceipt.validityStart);
            gVar.mo61712y();
            gVar.mo61711x(MVMediaTicketReceipt.f28734c);
            gVar.mo61679C(mVMediaTicketReceipt.validityEnd);
            gVar.mo61712y();
            if (mVMediaTicketReceipt.beforeValidityMedia != null) {
                gVar.mo61711x(MVMediaTicketReceipt.f28735d);
                mVMediaTicketReceipt.beforeValidityMedia.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMediaTicketReceipt.validityMedia != null) {
                gVar.mo61711x(MVMediaTicketReceipt.f28736e);
                mVMediaTicketReceipt.validityMedia.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMediaTicketReceipt.afterValidityMedia != null) {
                gVar.mo61711x(MVMediaTicketReceipt.f28737f);
                mVMediaTicketReceipt.afterValidityMedia.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVMediaTicketReceipt.f28738g);
            C0017h.m62S(gVar, mVMediaTicketReceipt.showValidityTimer);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMediaTicketReceipt mVMediaTicketReceipt = (MVMediaTicketReceipt) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVMediaTicketReceiptContent mVMediaTicketReceiptContent = mVMediaTicketReceipt.beforeValidityMedia;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMediaTicketReceipt.validityStart = gVar.mo61697j();
                            mVMediaTicketReceipt.mo32433o();
                            break;
                        }
                    case 2:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMediaTicketReceipt.validityEnd = gVar.mo61697j();
                            mVMediaTicketReceipt.mo32432m();
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVMediaTicketReceiptContent mVMediaTicketReceiptContent2 = new MVMediaTicketReceiptContent();
                            mVMediaTicketReceipt.beforeValidityMedia = mVMediaTicketReceiptContent2;
                            mVMediaTicketReceiptContent2.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVMediaTicketReceiptContent mVMediaTicketReceiptContent3 = new MVMediaTicketReceiptContent();
                            mVMediaTicketReceipt.validityMedia = mVMediaTicketReceiptContent3;
                            mVMediaTicketReceiptContent3.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVMediaTicketReceiptContent mVMediaTicketReceiptContent4 = new MVMediaTicketReceiptContent();
                            mVMediaTicketReceipt.afterValidityMedia = mVMediaTicketReceiptContent4;
                            mVMediaTicketReceiptContent4.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMediaTicketReceipt.showValidityTimer = gVar.mo61690c();
                            mVMediaTicketReceipt.mo32431l();
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVMediaTicketReceipt$b */
    public static class C10820b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10819a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVMediaTicketReceipt$c */
    public static class C10821c extends C25240d<MVMediaTicketReceipt> {
        public C10821c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMediaTicketReceipt mVMediaTicketReceipt = (MVMediaTicketReceipt) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMediaTicketReceipt.mo32430k()) {
                bitSet.set(0);
            }
            if (mVMediaTicketReceipt.mo32428i()) {
                bitSet.set(1);
            }
            if (mVMediaTicketReceipt.mo32425g()) {
                bitSet.set(2);
            }
            if (mVMediaTicketReceipt.mo32429j()) {
                bitSet.set(3);
            }
            if (mVMediaTicketReceipt.mo32424f()) {
                bitSet.set(4);
            }
            if (mVMediaTicketReceipt.mo32426h()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVMediaTicketReceipt.mo32430k()) {
                jVar.mo61679C(mVMediaTicketReceipt.validityStart);
            }
            if (mVMediaTicketReceipt.mo32428i()) {
                jVar.mo61679C(mVMediaTicketReceipt.validityEnd);
            }
            if (mVMediaTicketReceipt.mo32425g()) {
                mVMediaTicketReceipt.beforeValidityMedia.mo25202X0(jVar);
            }
            if (mVMediaTicketReceipt.mo32429j()) {
                mVMediaTicketReceipt.validityMedia.mo25202X0(jVar);
            }
            if (mVMediaTicketReceipt.mo32424f()) {
                mVMediaTicketReceipt.afterValidityMedia.mo25202X0(jVar);
            }
            if (mVMediaTicketReceipt.mo32426h()) {
                jVar.mo61708u(mVMediaTicketReceipt.showValidityTimer);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMediaTicketReceipt mVMediaTicketReceipt = (MVMediaTicketReceipt) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVMediaTicketReceipt.validityStart = jVar.mo61697j();
                mVMediaTicketReceipt.mo32433o();
            }
            if (T.get(1)) {
                mVMediaTicketReceipt.validityEnd = jVar.mo61697j();
                mVMediaTicketReceipt.mo32432m();
            }
            if (T.get(2)) {
                MVMediaTicketReceiptContent mVMediaTicketReceiptContent = new MVMediaTicketReceiptContent();
                mVMediaTicketReceipt.beforeValidityMedia = mVMediaTicketReceiptContent;
                mVMediaTicketReceiptContent.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVMediaTicketReceiptContent mVMediaTicketReceiptContent2 = new MVMediaTicketReceiptContent();
                mVMediaTicketReceipt.validityMedia = mVMediaTicketReceiptContent2;
                mVMediaTicketReceiptContent2.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVMediaTicketReceiptContent mVMediaTicketReceiptContent3 = new MVMediaTicketReceiptContent();
                mVMediaTicketReceipt.afterValidityMedia = mVMediaTicketReceiptContent3;
                mVMediaTicketReceiptContent3.mo25201C1(jVar);
            }
            if (T.get(5)) {
                mVMediaTicketReceipt.showValidityTimer = jVar.mo61690c();
                mVMediaTicketReceipt.mo32431l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVMediaTicketReceipt$d */
    public static class C10822d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10821c(0);
        }
    }

    static {
        new C17394d0("MVMediaTicketReceipt");
        HashMap hashMap = new HashMap();
        f28739h = hashMap;
        hashMap.put(C25239c.class, new C10820b());
        hashMap.put(C25240d.class, new C10822d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.VALIDITY_START, new FieldMetaData("validityStart", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.VALIDITY_END, new FieldMetaData("validityEnd", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.BEFORE_VALIDITY_MEDIA, new FieldMetaData("beforeValidityMedia", (byte) 3, new StructMetaData(MVMediaTicketReceiptContent.class)));
        enumMap.put(_Fields.VALIDITY_MEDIA, new FieldMetaData("validityMedia", (byte) 3, new StructMetaData(MVMediaTicketReceiptContent.class)));
        enumMap.put(_Fields.AFTER_VALIDITY_MEDIA, new FieldMetaData("afterValidityMedia", (byte) 3, new StructMetaData(MVMediaTicketReceiptContent.class)));
        enumMap.put(_Fields.SHOW_VALIDITY_TIMER, new FieldMetaData("showValidityTimer", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28740i = unmodifiableMap;
        FieldMetaData.m61947a(MVMediaTicketReceipt.class, unmodifiableMap);
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
        ((C25238b) f28739h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28739h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVMediaTicketReceipt mVMediaTicketReceipt = (MVMediaTicketReceipt) obj;
        if (!getClass().equals(mVMediaTicketReceipt.getClass())) {
            return getClass().getName().compareTo(mVMediaTicketReceipt.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32430k()).compareTo(Boolean.valueOf(mVMediaTicketReceipt.mo32430k()));
        if (compareTo != 0 || ((mo32430k() && (compareTo = C25082a.m62840d(this.validityStart, mVMediaTicketReceipt.validityStart)) != 0) || (compareTo = Boolean.valueOf(mo32428i()).compareTo(Boolean.valueOf(mVMediaTicketReceipt.mo32428i()))) != 0 || ((mo32428i() && (compareTo = C25082a.m62840d(this.validityEnd, mVMediaTicketReceipt.validityEnd)) != 0) || (compareTo = Boolean.valueOf(mo32425g()).compareTo(Boolean.valueOf(mVMediaTicketReceipt.mo32425g()))) != 0 || ((mo32425g() && (compareTo = this.beforeValidityMedia.compareTo(mVMediaTicketReceipt.beforeValidityMedia)) != 0) || (compareTo = Boolean.valueOf(mo32429j()).compareTo(Boolean.valueOf(mVMediaTicketReceipt.mo32429j()))) != 0 || ((mo32429j() && (compareTo = this.validityMedia.compareTo(mVMediaTicketReceipt.validityMedia)) != 0) || (compareTo = Boolean.valueOf(mo32424f()).compareTo(Boolean.valueOf(mVMediaTicketReceipt.mo32424f()))) != 0 || ((mo32424f() && (compareTo = this.afterValidityMedia.compareTo(mVMediaTicketReceipt.afterValidityMedia)) != 0) || (compareTo = Boolean.valueOf(mo32426h()).compareTo(Boolean.valueOf(mVMediaTicketReceipt.mo32426h()))) != 0)))))) {
            return compareTo;
        }
        if (!mo32426h() || (l = C25082a.m62848l(this.showValidityTimer, mVMediaTicketReceipt.showValidityTimer)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMediaTicketReceipt)) {
            return false;
        }
        MVMediaTicketReceipt mVMediaTicketReceipt = (MVMediaTicketReceipt) obj;
        if (this.validityStart != mVMediaTicketReceipt.validityStart || this.validityEnd != mVMediaTicketReceipt.validityEnd) {
            return false;
        }
        boolean g = mo32425g();
        boolean g2 = mVMediaTicketReceipt.mo32425g();
        if ((g || g2) && (!g || !g2 || !this.beforeValidityMedia.mo32436a(mVMediaTicketReceipt.beforeValidityMedia))) {
            return false;
        }
        boolean j = mo32429j();
        boolean j2 = mVMediaTicketReceipt.mo32429j();
        if ((j || j2) && (!j || !j2 || !this.validityMedia.mo32436a(mVMediaTicketReceipt.validityMedia))) {
            return false;
        }
        boolean f = mo32424f();
        boolean f2 = mVMediaTicketReceipt.mo32424f();
        if (((f || f2) && (!f || !f2 || !this.afterValidityMedia.mo32436a(mVMediaTicketReceipt.afterValidityMedia))) || this.showValidityTimer != mVMediaTicketReceipt.showValidityTimer) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32424f() {
        return this.afterValidityMedia != null;
    }

    /* renamed from: g */
    public final boolean mo32425g() {
        return this.beforeValidityMedia != null;
    }

    /* renamed from: h */
    public final boolean mo32426h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32428i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo32429j() {
        return this.validityMedia != null;
    }

    /* renamed from: k */
    public final boolean mo32430k() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: l */
    public final void mo32431l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: m */
    public final void mo32432m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: o */
    public final void mo32433o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMediaTicketReceipt(", "validityStart:");
        C25541a.m63889t(n, this.validityStart, ", ", "validityEnd:");
        C25541a.m63889t(n, this.validityEnd, ", ", "beforeValidityMedia:");
        MVMediaTicketReceiptContent mVMediaTicketReceiptContent = this.beforeValidityMedia;
        if (mVMediaTicketReceiptContent == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMediaTicketReceiptContent);
        }
        n.append(", ");
        n.append("validityMedia:");
        MVMediaTicketReceiptContent mVMediaTicketReceiptContent2 = this.validityMedia;
        if (mVMediaTicketReceiptContent2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMediaTicketReceiptContent2);
        }
        n.append(", ");
        n.append("afterValidityMedia:");
        MVMediaTicketReceiptContent mVMediaTicketReceiptContent3 = this.afterValidityMedia;
        if (mVMediaTicketReceiptContent3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMediaTicketReceiptContent3);
        }
        n.append(", ");
        n.append("showValidityTimer:");
        return C25541a.m63885p(n, this.showValidityTimer, ")");
    }
}
