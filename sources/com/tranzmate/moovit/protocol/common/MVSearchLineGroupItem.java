package com.tranzmate.moovit.protocol.common;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVSearchLineGroupItem implements TBase<MVSearchLineGroupItem, _Fields>, Serializable, Cloneable, Comparable<MVSearchLineGroupItem> {

    /* renamed from: b */
    public static final C25113c f25127b = new C25113c("lineGroupId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25128c = new C25113c("image", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f25129d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f25130e = new C25113c("subtitle", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f25131f = new C25113c("metadata", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f25132g = new C25113c("shortName", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f25133h = new C25113c("longName", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f25134i = new C25113c("lineNumber", (byte) 11, 8);

    /* renamed from: j */
    public static final C25113c f25135j = new C25113c("city1", (byte) 11, 9);

    /* renamed from: k */
    public static final C25113c f25136k = new C25113c("city2", (byte) 11, 10);

    /* renamed from: l */
    public static final HashMap f25137l;

    /* renamed from: m */
    public static final Map<_Fields, FieldMetaData> f25138m;
    private byte __isset_bitfield = 0;
    public String city1;
    public String city2;
    public MVImageReferenceWithParams image;
    public int lineGroupId;
    public String lineNumber;
    public String longName;
    public List<String> metadata;
    private _Fields[] optionals = {_Fields.SHORT_NAME, _Fields.LONG_NAME, _Fields.CITY1, _Fields.CITY2};
    public String shortName;
    public List<MVTextOrImage> subtitle;
    public String title;

    public enum _Fields implements C25085c {
        LINE_GROUP_ID(1, "lineGroupId"),
        IMAGE(2, "image"),
        TITLE(3, "title"),
        SUBTITLE(4, "subtitle"),
        METADATA(5, "metadata"),
        SHORT_NAME(6, "shortName"),
        LONG_NAME(7, "longName"),
        LINE_NUMBER(8, "lineNumber"),
        CITY1(9, "city1"),
        CITY2(10, "city2");
        
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
                    return LINE_GROUP_ID;
                case 2:
                    return IMAGE;
                case 3:
                    return TITLE;
                case 4:
                    return SUBTITLE;
                case 5:
                    return METADATA;
                case 6:
                    return SHORT_NAME;
                case 7:
                    return LONG_NAME;
                case 8:
                    return LINE_NUMBER;
                case 9:
                    return CITY1;
                case 10:
                    return CITY2;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVSearchLineGroupItem$a */
    public static class C8488a extends C25239c<MVSearchLineGroupItem> {
        public C8488a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSearchLineGroupItem mVSearchLineGroupItem = (MVSearchLineGroupItem) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVSearchLineGroupItem.image;
            C25113c cVar = MVSearchLineGroupItem.f25127b;
            gVar.mo61687K();
            gVar.mo61711x(MVSearchLineGroupItem.f25127b);
            gVar.mo61678B(mVSearchLineGroupItem.lineGroupId);
            gVar.mo61712y();
            if (mVSearchLineGroupItem.image != null) {
                gVar.mo61711x(MVSearchLineGroupItem.f25128c);
                mVSearchLineGroupItem.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSearchLineGroupItem.title != null) {
                gVar.mo61711x(MVSearchLineGroupItem.f25129d);
                gVar.mo61686J(mVSearchLineGroupItem.title);
                gVar.mo61712y();
            }
            if (mVSearchLineGroupItem.subtitle != null) {
                gVar.mo61711x(MVSearchLineGroupItem.f25130e);
                gVar.mo61680D(new C25119e((byte) 12, mVSearchLineGroupItem.subtitle.size()));
                for (MVTextOrImage X0 : mVSearchLineGroupItem.subtitle) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVSearchLineGroupItem.metadata != null) {
                gVar.mo61711x(MVSearchLineGroupItem.f25131f);
                gVar.mo61680D(new C25119e((byte) 11, mVSearchLineGroupItem.metadata.size()));
                for (String J : mVSearchLineGroupItem.metadata) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVSearchLineGroupItem.shortName != null && mVSearchLineGroupItem.mo26385m()) {
                gVar.mo61711x(MVSearchLineGroupItem.f25132g);
                gVar.mo61686J(mVSearchLineGroupItem.shortName);
                gVar.mo61712y();
            }
            if (mVSearchLineGroupItem.longName != null && mVSearchLineGroupItem.mo26383k()) {
                gVar.mo61711x(MVSearchLineGroupItem.f25133h);
                gVar.mo61686J(mVSearchLineGroupItem.longName);
                gVar.mo61712y();
            }
            if (mVSearchLineGroupItem.lineNumber != null) {
                gVar.mo61711x(MVSearchLineGroupItem.f25134i);
                gVar.mo61686J(mVSearchLineGroupItem.lineNumber);
                gVar.mo61712y();
            }
            if (mVSearchLineGroupItem.city1 != null && mVSearchLineGroupItem.mo26377f()) {
                gVar.mo61711x(MVSearchLineGroupItem.f25135j);
                gVar.mo61686J(mVSearchLineGroupItem.city1);
                gVar.mo61712y();
            }
            if (mVSearchLineGroupItem.city2 != null && mVSearchLineGroupItem.mo26378g()) {
                gVar.mo61711x(MVSearchLineGroupItem.f25136k);
                gVar.mo61686J(mVSearchLineGroupItem.city2);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSearchLineGroupItem mVSearchLineGroupItem = (MVSearchLineGroupItem) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVSearchLineGroupItem.image;
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchLineGroupItem.lineGroupId = gVar.mo61696i();
                            mVSearchLineGroupItem.mo26388q();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVSearchLineGroupItem.image = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchLineGroupItem.title = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVSearchLineGroupItem.subtitle = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVTextOrImage mVTextOrImage = new MVTextOrImage();
                                mVTextOrImage.mo25201C1(gVar);
                                mVSearchLineGroupItem.subtitle.add(mVTextOrImage);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVSearchLineGroupItem.metadata = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                mVSearchLineGroupItem.metadata.add(gVar.mo61704q());
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchLineGroupItem.shortName = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchLineGroupItem.longName = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchLineGroupItem.lineNumber = gVar.mo61704q();
                            break;
                        }
                    case 9:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchLineGroupItem.city1 = gVar.mo61704q();
                            break;
                        }
                    case 10:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchLineGroupItem.city2 = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVSearchLineGroupItem$b */
    public static class C8489b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8488a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVSearchLineGroupItem$c */
    public static class C8490c extends C25240d<MVSearchLineGroupItem> {
        public C8490c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSearchLineGroupItem mVSearchLineGroupItem = (MVSearchLineGroupItem) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSearchLineGroupItem.mo26381i()) {
                bitSet.set(0);
            }
            if (mVSearchLineGroupItem.mo26379h()) {
                bitSet.set(1);
            }
            if (mVSearchLineGroupItem.mo26387p()) {
                bitSet.set(2);
            }
            if (mVSearchLineGroupItem.mo26386o()) {
                bitSet.set(3);
            }
            if (mVSearchLineGroupItem.mo26384l()) {
                bitSet.set(4);
            }
            if (mVSearchLineGroupItem.mo26385m()) {
                bitSet.set(5);
            }
            if (mVSearchLineGroupItem.mo26383k()) {
                bitSet.set(6);
            }
            if (mVSearchLineGroupItem.mo26382j()) {
                bitSet.set(7);
            }
            if (mVSearchLineGroupItem.mo26377f()) {
                bitSet.set(8);
            }
            if (mVSearchLineGroupItem.mo26378g()) {
                bitSet.set(9);
            }
            jVar.mo61738U(bitSet, 10);
            if (mVSearchLineGroupItem.mo26381i()) {
                jVar.mo61678B(mVSearchLineGroupItem.lineGroupId);
            }
            if (mVSearchLineGroupItem.mo26379h()) {
                mVSearchLineGroupItem.image.mo25202X0(jVar);
            }
            if (mVSearchLineGroupItem.mo26387p()) {
                jVar.mo61686J(mVSearchLineGroupItem.title);
            }
            if (mVSearchLineGroupItem.mo26386o()) {
                jVar.mo61678B(mVSearchLineGroupItem.subtitle.size());
                for (MVTextOrImage X0 : mVSearchLineGroupItem.subtitle) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVSearchLineGroupItem.mo26384l()) {
                jVar.mo61678B(mVSearchLineGroupItem.metadata.size());
                for (String J : mVSearchLineGroupItem.metadata) {
                    jVar.mo61686J(J);
                }
            }
            if (mVSearchLineGroupItem.mo26385m()) {
                jVar.mo61686J(mVSearchLineGroupItem.shortName);
            }
            if (mVSearchLineGroupItem.mo26383k()) {
                jVar.mo61686J(mVSearchLineGroupItem.longName);
            }
            if (mVSearchLineGroupItem.mo26382j()) {
                jVar.mo61686J(mVSearchLineGroupItem.lineNumber);
            }
            if (mVSearchLineGroupItem.mo26377f()) {
                jVar.mo61686J(mVSearchLineGroupItem.city1);
            }
            if (mVSearchLineGroupItem.mo26378g()) {
                jVar.mo61686J(mVSearchLineGroupItem.city2);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSearchLineGroupItem mVSearchLineGroupItem = (MVSearchLineGroupItem) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(10);
            if (T.get(0)) {
                mVSearchLineGroupItem.lineGroupId = jVar.mo61696i();
                mVSearchLineGroupItem.mo26388q();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVSearchLineGroupItem.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVSearchLineGroupItem.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVSearchLineGroupItem.subtitle = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTextOrImage mVTextOrImage = new MVTextOrImage();
                    mVTextOrImage.mo25201C1(jVar);
                    mVSearchLineGroupItem.subtitle.add(mVTextOrImage);
                }
            }
            if (T.get(4)) {
                int i3 = jVar.mo61696i();
                mVSearchLineGroupItem.metadata = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    mVSearchLineGroupItem.metadata.add(jVar.mo61704q());
                }
            }
            if (T.get(5)) {
                mVSearchLineGroupItem.shortName = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVSearchLineGroupItem.longName = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVSearchLineGroupItem.lineNumber = jVar.mo61704q();
            }
            if (T.get(8)) {
                mVSearchLineGroupItem.city1 = jVar.mo61704q();
            }
            if (T.get(9)) {
                mVSearchLineGroupItem.city2 = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVSearchLineGroupItem$d */
    public static class C8491d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8490c(0);
        }
    }

    static {
        new C17394d0("MVSearchLineGroupItem");
        HashMap hashMap = new HashMap();
        f25137l = hashMap;
        hashMap.put(C25239c.class, new C8489b());
        hashMap.put(C25240d.class, new C8491d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LINE_GROUP_ID, new FieldMetaData("lineGroupId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 3, new ListMetaData(new StructMetaData(MVTextOrImage.class))));
        enumMap.put(_Fields.METADATA, new FieldMetaData("metadata", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.SHORT_NAME, new FieldMetaData("shortName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LONG_NAME, new FieldMetaData("longName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LINE_NUMBER, new FieldMetaData("lineNumber", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CITY1, new FieldMetaData("city1", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CITY2, new FieldMetaData("city2", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25138m = unmodifiableMap;
        FieldMetaData.m61947a(MVSearchLineGroupItem.class, unmodifiableMap);
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
        ((C25238b) f25137l.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25137l.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSearchLineGroupItem mVSearchLineGroupItem = (MVSearchLineGroupItem) obj;
        if (!getClass().equals(mVSearchLineGroupItem.getClass())) {
            return getClass().getName().compareTo(mVSearchLineGroupItem.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26381i()).compareTo(Boolean.valueOf(mVSearchLineGroupItem.mo26381i()));
        if (compareTo2 != 0 || ((mo26381i() && (compareTo2 = C25082a.m62839c(this.lineGroupId, mVSearchLineGroupItem.lineGroupId)) != 0) || (compareTo2 = Boolean.valueOf(mo26379h()).compareTo(Boolean.valueOf(mVSearchLineGroupItem.mo26379h()))) != 0 || ((mo26379h() && (compareTo2 = this.image.compareTo(mVSearchLineGroupItem.image)) != 0) || (compareTo2 = Boolean.valueOf(mo26387p()).compareTo(Boolean.valueOf(mVSearchLineGroupItem.mo26387p()))) != 0 || ((mo26387p() && (compareTo2 = this.title.compareTo(mVSearchLineGroupItem.title)) != 0) || (compareTo2 = Boolean.valueOf(mo26386o()).compareTo(Boolean.valueOf(mVSearchLineGroupItem.mo26386o()))) != 0 || ((mo26386o() && (compareTo2 = C25082a.m62844h(this.subtitle, mVSearchLineGroupItem.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo26384l()).compareTo(Boolean.valueOf(mVSearchLineGroupItem.mo26384l()))) != 0 || ((mo26384l() && (compareTo2 = C25082a.m62844h(this.metadata, mVSearchLineGroupItem.metadata)) != 0) || (compareTo2 = Boolean.valueOf(mo26385m()).compareTo(Boolean.valueOf(mVSearchLineGroupItem.mo26385m()))) != 0 || ((mo26385m() && (compareTo2 = this.shortName.compareTo(mVSearchLineGroupItem.shortName)) != 0) || (compareTo2 = Boolean.valueOf(mo26383k()).compareTo(Boolean.valueOf(mVSearchLineGroupItem.mo26383k()))) != 0 || ((mo26383k() && (compareTo2 = this.longName.compareTo(mVSearchLineGroupItem.longName)) != 0) || (compareTo2 = Boolean.valueOf(mo26382j()).compareTo(Boolean.valueOf(mVSearchLineGroupItem.mo26382j()))) != 0 || ((mo26382j() && (compareTo2 = this.lineNumber.compareTo(mVSearchLineGroupItem.lineNumber)) != 0) || (compareTo2 = Boolean.valueOf(mo26377f()).compareTo(Boolean.valueOf(mVSearchLineGroupItem.mo26377f()))) != 0 || ((mo26377f() && (compareTo2 = this.city1.compareTo(mVSearchLineGroupItem.city1)) != 0) || (compareTo2 = Boolean.valueOf(mo26378g()).compareTo(Boolean.valueOf(mVSearchLineGroupItem.mo26378g()))) != 0)))))))))) {
            return compareTo2;
        }
        if (!mo26378g() || (compareTo = this.city2.compareTo(mVSearchLineGroupItem.city2)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSearchLineGroupItem)) {
            return false;
        }
        MVSearchLineGroupItem mVSearchLineGroupItem = (MVSearchLineGroupItem) obj;
        if (this.lineGroupId != mVSearchLineGroupItem.lineGroupId) {
            return false;
        }
        boolean h = mo26379h();
        boolean h2 = mVSearchLineGroupItem.mo26379h();
        if ((h || h2) && (!h || !h2 || !this.image.mo26245a(mVSearchLineGroupItem.image))) {
            return false;
        }
        boolean p = mo26387p();
        boolean p2 = mVSearchLineGroupItem.mo26387p();
        if ((p || p2) && (!p || !p2 || !this.title.equals(mVSearchLineGroupItem.title))) {
            return false;
        }
        boolean o = mo26386o();
        boolean o2 = mVSearchLineGroupItem.mo26386o();
        if ((o || o2) && (!o || !o2 || !this.subtitle.equals(mVSearchLineGroupItem.subtitle))) {
            return false;
        }
        boolean l = mo26384l();
        boolean l2 = mVSearchLineGroupItem.mo26384l();
        if ((l || l2) && (!l || !l2 || !this.metadata.equals(mVSearchLineGroupItem.metadata))) {
            return false;
        }
        boolean m = mo26385m();
        boolean m2 = mVSearchLineGroupItem.mo26385m();
        if ((m || m2) && (!m || !m2 || !this.shortName.equals(mVSearchLineGroupItem.shortName))) {
            return false;
        }
        boolean k = mo26383k();
        boolean k2 = mVSearchLineGroupItem.mo26383k();
        if ((k || k2) && (!k || !k2 || !this.longName.equals(mVSearchLineGroupItem.longName))) {
            return false;
        }
        boolean j = mo26382j();
        boolean j2 = mVSearchLineGroupItem.mo26382j();
        if ((j || j2) && (!j || !j2 || !this.lineNumber.equals(mVSearchLineGroupItem.lineNumber))) {
            return false;
        }
        boolean f = mo26377f();
        boolean f2 = mVSearchLineGroupItem.mo26377f();
        if ((f || f2) && (!f || !f2 || !this.city1.equals(mVSearchLineGroupItem.city1))) {
            return false;
        }
        boolean g = mo26378g();
        boolean g2 = mVSearchLineGroupItem.mo26378g();
        if ((g || g2) && (!g || !g2 || !this.city2.equals(mVSearchLineGroupItem.city2))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26377f() {
        return this.city1 != null;
    }

    /* renamed from: g */
    public final boolean mo26378g() {
        return this.city2 != null;
    }

    /* renamed from: h */
    public final boolean mo26379h() {
        return this.image != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26381i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo26382j() {
        return this.lineNumber != null;
    }

    /* renamed from: k */
    public final boolean mo26383k() {
        return this.longName != null;
    }

    /* renamed from: l */
    public final boolean mo26384l() {
        return this.metadata != null;
    }

    /* renamed from: m */
    public final boolean mo26385m() {
        return this.shortName != null;
    }

    /* renamed from: o */
    public final boolean mo26386o() {
        return this.subtitle != null;
    }

    /* renamed from: p */
    public final boolean mo26387p() {
        return this.title != null;
    }

    /* renamed from: q */
    public final void mo26388q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSearchLineGroupItem(", "lineGroupId:");
        C0016g.m42z(n, this.lineGroupId, ", ", "image:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        n.append(", ");
        n.append("title:");
        String str = this.title;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("subtitle:");
        List<MVTextOrImage> list = this.subtitle;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("metadata:");
        List<String> list2 = this.metadata;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        if (mo26385m()) {
            n.append(", ");
            n.append("shortName:");
            String str2 = this.shortName;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo26383k()) {
            n.append(", ");
            n.append("longName:");
            String str3 = this.longName;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(", ");
        n.append("lineNumber:");
        String str4 = this.lineNumber;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        if (mo26377f()) {
            n.append(", ");
            n.append("city1:");
            String str5 = this.city1;
            if (str5 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str5);
            }
        }
        if (mo26378g()) {
            n.append(", ");
            n.append("city2:");
            String str6 = this.city2;
            if (str6 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str6);
            }
        }
        n.append(")");
        return n.toString();
    }
}
