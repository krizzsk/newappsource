package com.tranzmate.moovit.protocol.wondo;

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

public class MVWondoCode implements TBase<MVWondoCode, _Fields>, Serializable, Cloneable, Comparable<MVWondoCode> {

    /* renamed from: b */
    public static final C25113c f30678b = new C25113c("codeId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30679c = new C25113c("code", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30680d = new C25113c("codeDescription", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f30681e = new C25113c("iconUrl", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f30682f = new C25113c("iconProviderUrl", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f30683g = new C25113c("providerName", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f30684h = new C25113c("previewDescription", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f30685i = new C25113c("title", (byte) 11, 8);

    /* renamed from: j */
    public static final C25113c f30686j = new C25113c("availabilityText", (byte) 11, 9);

    /* renamed from: k */
    public static final C25113c f30687k = new C25113c("isAvailable", (byte) 2, 10);

    /* renamed from: l */
    public static final C25113c f30688l = new C25113c("experationText", (byte) 11, 11);

    /* renamed from: m */
    public static final C25113c f30689m = new C25113c("isExpired", (byte) 2, 12);

    /* renamed from: n */
    public static final C25113c f30690n = new C25113c("legalUrl", (byte) 11, 13);

    /* renamed from: o */
    public static final HashMap f30691o;

    /* renamed from: p */
    public static final Map<_Fields, FieldMetaData> f30692p;
    private byte __isset_bitfield = 0;
    public String availabilityText;
    public String code;
    public String codeDescription;
    public int codeId;
    public String experationText;
    public String iconProviderUrl;
    public String iconUrl;
    public boolean isAvailable;
    public boolean isExpired;
    public String legalUrl;
    public String previewDescription;
    public String providerName;
    public String title;

    public enum _Fields implements C25085c {
        CODE_ID(1, "codeId"),
        CODE(2, "code"),
        CODE_DESCRIPTION(3, "codeDescription"),
        ICON_URL(4, "iconUrl"),
        ICON_PROVIDER_URL(5, "iconProviderUrl"),
        PROVIDER_NAME(6, "providerName"),
        PREVIEW_DESCRIPTION(7, "previewDescription"),
        TITLE(8, "title"),
        AVAILABILITY_TEXT(9, "availabilityText"),
        IS_AVAILABLE(10, "isAvailable"),
        EXPERATION_TEXT(11, "experationText"),
        IS_EXPIRED(12, "isExpired"),
        LEGAL_URL(13, "legalUrl");
        
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
                    return CODE_ID;
                case 2:
                    return CODE;
                case 3:
                    return CODE_DESCRIPTION;
                case 4:
                    return ICON_URL;
                case 5:
                    return ICON_PROVIDER_URL;
                case 6:
                    return PROVIDER_NAME;
                case 7:
                    return PREVIEW_DESCRIPTION;
                case 8:
                    return TITLE;
                case 9:
                    return AVAILABILITY_TEXT;
                case 10:
                    return IS_AVAILABLE;
                case 11:
                    return EXPERATION_TEXT;
                case 12:
                    return IS_EXPIRED;
                case 13:
                    return LEGAL_URL;
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoCode$a */
    public static class C12017a extends C25239c<MVWondoCode> {
        public C12017a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoCode mVWondoCode = (MVWondoCode) tBase;
            mVWondoCode.getClass();
            C25113c cVar = MVWondoCode.f30678b;
            gVar.mo61687K();
            gVar.mo61711x(MVWondoCode.f30678b);
            gVar.mo61678B(mVWondoCode.codeId);
            gVar.mo61712y();
            if (mVWondoCode.code != null) {
                gVar.mo61711x(MVWondoCode.f30679c);
                gVar.mo61686J(mVWondoCode.code);
                gVar.mo61712y();
            }
            if (mVWondoCode.codeDescription != null) {
                gVar.mo61711x(MVWondoCode.f30680d);
                gVar.mo61686J(mVWondoCode.codeDescription);
                gVar.mo61712y();
            }
            if (mVWondoCode.iconUrl != null) {
                gVar.mo61711x(MVWondoCode.f30681e);
                gVar.mo61686J(mVWondoCode.iconUrl);
                gVar.mo61712y();
            }
            if (mVWondoCode.iconProviderUrl != null) {
                gVar.mo61711x(MVWondoCode.f30682f);
                gVar.mo61686J(mVWondoCode.iconProviderUrl);
                gVar.mo61712y();
            }
            if (mVWondoCode.providerName != null) {
                gVar.mo61711x(MVWondoCode.f30683g);
                gVar.mo61686J(mVWondoCode.providerName);
                gVar.mo61712y();
            }
            if (mVWondoCode.previewDescription != null) {
                gVar.mo61711x(MVWondoCode.f30684h);
                gVar.mo61686J(mVWondoCode.previewDescription);
                gVar.mo61712y();
            }
            if (mVWondoCode.title != null) {
                gVar.mo61711x(MVWondoCode.f30685i);
                gVar.mo61686J(mVWondoCode.title);
                gVar.mo61712y();
            }
            if (mVWondoCode.availabilityText != null) {
                gVar.mo61711x(MVWondoCode.f30686j);
                gVar.mo61686J(mVWondoCode.availabilityText);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVWondoCode.f30687k);
            gVar.mo61708u(mVWondoCode.isAvailable);
            gVar.mo61712y();
            if (mVWondoCode.experationText != null) {
                gVar.mo61711x(MVWondoCode.f30688l);
                gVar.mo61686J(mVWondoCode.experationText);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVWondoCode.f30689m);
            gVar.mo61708u(mVWondoCode.isExpired);
            gVar.mo61712y();
            if (mVWondoCode.legalUrl != null) {
                gVar.mo61711x(MVWondoCode.f30690n);
                gVar.mo61686J(mVWondoCode.legalUrl);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoCode mVWondoCode = (MVWondoCode) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVWondoCode.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoCode.codeId = gVar.mo61696i();
                            mVWondoCode.mo35624t();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoCode.code = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoCode.codeDescription = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoCode.iconUrl = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoCode.iconProviderUrl = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoCode.providerName = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoCode.previewDescription = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoCode.title = gVar.mo61704q();
                            break;
                        }
                    case 9:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoCode.availabilityText = gVar.mo61704q();
                            break;
                        }
                    case 10:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoCode.isAvailable = gVar.mo61690c();
                            mVWondoCode.mo35626u();
                            break;
                        }
                    case 11:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoCode.experationText = gVar.mo61704q();
                            break;
                        }
                    case 12:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoCode.isExpired = gVar.mo61690c();
                            mVWondoCode.mo35627v();
                            break;
                        }
                    case 13:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoCode.legalUrl = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoCode$b */
    public static class C12018b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12017a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoCode$c */
    public static class C12019c extends C25240d<MVWondoCode> {
        public C12019c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoCode mVWondoCode = (MVWondoCode) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWondoCode.mo35614i()) {
                bitSet.set(0);
            }
            if (mVWondoCode.mo35611g()) {
                bitSet.set(1);
            }
            if (mVWondoCode.mo35612h()) {
                bitSet.set(2);
            }
            if (mVWondoCode.mo35617l()) {
                bitSet.set(3);
            }
            if (mVWondoCode.mo35616k()) {
                bitSet.set(4);
            }
            if (mVWondoCode.mo35622r()) {
                bitSet.set(5);
            }
            if (mVWondoCode.mo35621q()) {
                bitSet.set(6);
            }
            if (mVWondoCode.mo35623s()) {
                bitSet.set(7);
            }
            if (mVWondoCode.mo35610f()) {
                bitSet.set(8);
            }
            if (mVWondoCode.mo35618m()) {
                bitSet.set(9);
            }
            if (mVWondoCode.mo35615j()) {
                bitSet.set(10);
            }
            if (mVWondoCode.mo35619o()) {
                bitSet.set(11);
            }
            if (mVWondoCode.mo35620p()) {
                bitSet.set(12);
            }
            jVar.mo61738U(bitSet, 13);
            if (mVWondoCode.mo35614i()) {
                jVar.mo61678B(mVWondoCode.codeId);
            }
            if (mVWondoCode.mo35611g()) {
                jVar.mo61686J(mVWondoCode.code);
            }
            if (mVWondoCode.mo35612h()) {
                jVar.mo61686J(mVWondoCode.codeDescription);
            }
            if (mVWondoCode.mo35617l()) {
                jVar.mo61686J(mVWondoCode.iconUrl);
            }
            if (mVWondoCode.mo35616k()) {
                jVar.mo61686J(mVWondoCode.iconProviderUrl);
            }
            if (mVWondoCode.mo35622r()) {
                jVar.mo61686J(mVWondoCode.providerName);
            }
            if (mVWondoCode.mo35621q()) {
                jVar.mo61686J(mVWondoCode.previewDescription);
            }
            if (mVWondoCode.mo35623s()) {
                jVar.mo61686J(mVWondoCode.title);
            }
            if (mVWondoCode.mo35610f()) {
                jVar.mo61686J(mVWondoCode.availabilityText);
            }
            if (mVWondoCode.mo35618m()) {
                jVar.mo61708u(mVWondoCode.isAvailable);
            }
            if (mVWondoCode.mo35615j()) {
                jVar.mo61686J(mVWondoCode.experationText);
            }
            if (mVWondoCode.mo35619o()) {
                jVar.mo61708u(mVWondoCode.isExpired);
            }
            if (mVWondoCode.mo35620p()) {
                jVar.mo61686J(mVWondoCode.legalUrl);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoCode mVWondoCode = (MVWondoCode) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(13);
            if (T.get(0)) {
                mVWondoCode.codeId = jVar.mo61696i();
                mVWondoCode.mo35624t();
            }
            if (T.get(1)) {
                mVWondoCode.code = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVWondoCode.codeDescription = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVWondoCode.iconUrl = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVWondoCode.iconProviderUrl = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVWondoCode.providerName = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVWondoCode.previewDescription = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVWondoCode.title = jVar.mo61704q();
            }
            if (T.get(8)) {
                mVWondoCode.availabilityText = jVar.mo61704q();
            }
            if (T.get(9)) {
                mVWondoCode.isAvailable = jVar.mo61690c();
                mVWondoCode.mo35626u();
            }
            if (T.get(10)) {
                mVWondoCode.experationText = jVar.mo61704q();
            }
            if (T.get(11)) {
                mVWondoCode.isExpired = jVar.mo61690c();
                mVWondoCode.mo35627v();
            }
            if (T.get(12)) {
                mVWondoCode.legalUrl = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoCode$d */
    public static class C12020d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12019c(0);
        }
    }

    static {
        new C17394d0("MVWondoCode");
        HashMap hashMap = new HashMap();
        f30691o = hashMap;
        hashMap.put(C25239c.class, new C12018b());
        hashMap.put(C25240d.class, new C12020d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CODE_ID, new FieldMetaData("codeId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CODE, new FieldMetaData("code", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CODE_DESCRIPTION, new FieldMetaData("codeDescription", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ICON_URL, new FieldMetaData("iconUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ICON_PROVIDER_URL, new FieldMetaData("iconProviderUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PROVIDER_NAME, new FieldMetaData("providerName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PREVIEW_DESCRIPTION, new FieldMetaData("previewDescription", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AVAILABILITY_TEXT, new FieldMetaData("availabilityText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_AVAILABLE, new FieldMetaData("isAvailable", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.EXPERATION_TEXT, new FieldMetaData("experationText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_EXPIRED, new FieldMetaData("isExpired", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.LEGAL_URL, new FieldMetaData("legalUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30692p = unmodifiableMap;
        FieldMetaData.m61947a(MVWondoCode.class, unmodifiableMap);
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
        ((C25238b) f30691o.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30691o.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWondoCode mVWondoCode = (MVWondoCode) obj;
        if (!getClass().equals(mVWondoCode.getClass())) {
            return getClass().getName().compareTo(mVWondoCode.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35614i()).compareTo(Boolean.valueOf(mVWondoCode.mo35614i()));
        if (compareTo2 != 0 || ((mo35614i() && (compareTo2 = C25082a.m62839c(this.codeId, mVWondoCode.codeId)) != 0) || (compareTo2 = Boolean.valueOf(mo35611g()).compareTo(Boolean.valueOf(mVWondoCode.mo35611g()))) != 0 || ((mo35611g() && (compareTo2 = this.code.compareTo(mVWondoCode.code)) != 0) || (compareTo2 = Boolean.valueOf(mo35612h()).compareTo(Boolean.valueOf(mVWondoCode.mo35612h()))) != 0 || ((mo35612h() && (compareTo2 = this.codeDescription.compareTo(mVWondoCode.codeDescription)) != 0) || (compareTo2 = Boolean.valueOf(mo35617l()).compareTo(Boolean.valueOf(mVWondoCode.mo35617l()))) != 0 || ((mo35617l() && (compareTo2 = this.iconUrl.compareTo(mVWondoCode.iconUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo35616k()).compareTo(Boolean.valueOf(mVWondoCode.mo35616k()))) != 0 || ((mo35616k() && (compareTo2 = this.iconProviderUrl.compareTo(mVWondoCode.iconProviderUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo35622r()).compareTo(Boolean.valueOf(mVWondoCode.mo35622r()))) != 0 || ((mo35622r() && (compareTo2 = this.providerName.compareTo(mVWondoCode.providerName)) != 0) || (compareTo2 = Boolean.valueOf(mo35621q()).compareTo(Boolean.valueOf(mVWondoCode.mo35621q()))) != 0 || ((mo35621q() && (compareTo2 = this.previewDescription.compareTo(mVWondoCode.previewDescription)) != 0) || (compareTo2 = Boolean.valueOf(mo35623s()).compareTo(Boolean.valueOf(mVWondoCode.mo35623s()))) != 0 || ((mo35623s() && (compareTo2 = this.title.compareTo(mVWondoCode.title)) != 0) || (compareTo2 = Boolean.valueOf(mo35610f()).compareTo(Boolean.valueOf(mVWondoCode.mo35610f()))) != 0 || ((mo35610f() && (compareTo2 = this.availabilityText.compareTo(mVWondoCode.availabilityText)) != 0) || (compareTo2 = Boolean.valueOf(mo35618m()).compareTo(Boolean.valueOf(mVWondoCode.mo35618m()))) != 0 || ((mo35618m() && (compareTo2 = C25082a.m62848l(this.isAvailable, mVWondoCode.isAvailable)) != 0) || (compareTo2 = Boolean.valueOf(mo35615j()).compareTo(Boolean.valueOf(mVWondoCode.mo35615j()))) != 0 || ((mo35615j() && (compareTo2 = this.experationText.compareTo(mVWondoCode.experationText)) != 0) || (compareTo2 = Boolean.valueOf(mo35619o()).compareTo(Boolean.valueOf(mVWondoCode.mo35619o()))) != 0 || ((mo35619o() && (compareTo2 = C25082a.m62848l(this.isExpired, mVWondoCode.isExpired)) != 0) || (compareTo2 = Boolean.valueOf(mo35620p()).compareTo(Boolean.valueOf(mVWondoCode.mo35620p()))) != 0))))))))))))) {
            return compareTo2;
        }
        if (!mo35620p() || (compareTo = this.legalUrl.compareTo(mVWondoCode.legalUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVWondoCode)) {
            return false;
        }
        MVWondoCode mVWondoCode = (MVWondoCode) obj;
        if (this.codeId != mVWondoCode.codeId) {
            return false;
        }
        boolean g = mo35611g();
        boolean g2 = mVWondoCode.mo35611g();
        if ((g || g2) && (!g || !g2 || !this.code.equals(mVWondoCode.code))) {
            return false;
        }
        boolean h = mo35612h();
        boolean h2 = mVWondoCode.mo35612h();
        if ((h || h2) && (!h || !h2 || !this.codeDescription.equals(mVWondoCode.codeDescription))) {
            return false;
        }
        boolean l = mo35617l();
        boolean l2 = mVWondoCode.mo35617l();
        if ((l || l2) && (!l || !l2 || !this.iconUrl.equals(mVWondoCode.iconUrl))) {
            return false;
        }
        boolean k = mo35616k();
        boolean k2 = mVWondoCode.mo35616k();
        if ((k || k2) && (!k || !k2 || !this.iconProviderUrl.equals(mVWondoCode.iconProviderUrl))) {
            return false;
        }
        boolean r = mo35622r();
        boolean r2 = mVWondoCode.mo35622r();
        if ((r || r2) && (!r || !r2 || !this.providerName.equals(mVWondoCode.providerName))) {
            return false;
        }
        boolean q = mo35621q();
        boolean q2 = mVWondoCode.mo35621q();
        if ((q || q2) && (!q || !q2 || !this.previewDescription.equals(mVWondoCode.previewDescription))) {
            return false;
        }
        boolean s = mo35623s();
        boolean s2 = mVWondoCode.mo35623s();
        if ((s || s2) && (!s || !s2 || !this.title.equals(mVWondoCode.title))) {
            return false;
        }
        boolean f = mo35610f();
        boolean f2 = mVWondoCode.mo35610f();
        if (((f || f2) && (!f || !f2 || !this.availabilityText.equals(mVWondoCode.availabilityText))) || this.isAvailable != mVWondoCode.isAvailable) {
            return false;
        }
        boolean j = mo35615j();
        boolean j2 = mVWondoCode.mo35615j();
        if (((j || j2) && (!j || !j2 || !this.experationText.equals(mVWondoCode.experationText))) || this.isExpired != mVWondoCode.isExpired) {
            return false;
        }
        boolean p = mo35620p();
        boolean p2 = mVWondoCode.mo35620p();
        if ((p || p2) && (!p || !p2 || !this.legalUrl.equals(mVWondoCode.legalUrl))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35610f() {
        return this.availabilityText != null;
    }

    /* renamed from: g */
    public final boolean mo35611g() {
        return this.code != null;
    }

    /* renamed from: h */
    public final boolean mo35612h() {
        return this.codeDescription != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35614i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo35615j() {
        return this.experationText != null;
    }

    /* renamed from: k */
    public final boolean mo35616k() {
        return this.iconProviderUrl != null;
    }

    /* renamed from: l */
    public final boolean mo35617l() {
        return this.iconUrl != null;
    }

    /* renamed from: m */
    public final boolean mo35618m() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: o */
    public final boolean mo35619o() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: p */
    public final boolean mo35620p() {
        return this.legalUrl != null;
    }

    /* renamed from: q */
    public final boolean mo35621q() {
        return this.previewDescription != null;
    }

    /* renamed from: r */
    public final boolean mo35622r() {
        return this.providerName != null;
    }

    /* renamed from: s */
    public final boolean mo35623s() {
        return this.title != null;
    }

    /* renamed from: t */
    public final void mo35624t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWondoCode(", "codeId:");
        C0016g.m42z(n, this.codeId, ", ", "code:");
        String str = this.code;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("codeDescription:");
        String str2 = this.codeDescription;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("iconUrl:");
        String str3 = this.iconUrl;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("iconProviderUrl:");
        String str4 = this.iconProviderUrl;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(", ");
        n.append("providerName:");
        String str5 = this.providerName;
        if (str5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str5);
        }
        n.append(", ");
        n.append("previewDescription:");
        String str6 = this.previewDescription;
        if (str6 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str6);
        }
        n.append(", ");
        n.append("title:");
        String str7 = this.title;
        if (str7 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str7);
        }
        n.append(", ");
        n.append("availabilityText:");
        String str8 = this.availabilityText;
        if (str8 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str8);
        }
        n.append(", ");
        n.append("isAvailable:");
        C13555b.m33977q(n, this.isAvailable, ", ", "experationText:");
        String str9 = this.experationText;
        if (str9 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str9);
        }
        n.append(", ");
        n.append("isExpired:");
        C13555b.m33977q(n, this.isExpired, ", ", "legalUrl:");
        String str10 = this.legalUrl;
        if (str10 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str10);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo35626u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: v */
    public final void mo35627v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }
}
