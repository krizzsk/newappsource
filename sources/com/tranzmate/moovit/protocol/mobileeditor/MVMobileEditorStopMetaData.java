package com.tranzmate.moovit.protocol.mobileeditor;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceSetWithParams;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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

public class MVMobileEditorStopMetaData implements TBase<MVMobileEditorStopMetaData, _Fields>, Serializable, Cloneable, Comparable<MVMobileEditorStopMetaData> {

    /* renamed from: b */
    public static final C25113c f26820b = new C25113c("stopName", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26821c = new C25113c("stopLocation", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f26822d = new C25113c("imageRefSet", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f26823e = new C25113c("deletePending", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f26824f = new C25113c("entrancesAndExits", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f26825g = new C25113c("moreInfo", (byte) 11, 6);

    /* renamed from: h */
    public static final HashMap f26826h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f26827i;
    private byte __isset_bitfield = 0;
    public boolean deletePending;
    public List<MVMobileEditorPathwayMetaData> entrancesAndExits;
    public MVImageReferenceSetWithParams imageRefSet;
    public String moreInfo;
    private _Fields[] optionals = {_Fields.ENTRANCES_AND_EXITS, _Fields.MORE_INFO};
    public MVLatLon stopLocation;
    public String stopName;

    public enum _Fields implements C25085c {
        STOP_NAME(1, "stopName"),
        STOP_LOCATION(2, "stopLocation"),
        IMAGE_REF_SET(3, "imageRefSet"),
        DELETE_PENDING(4, "deletePending"),
        ENTRANCES_AND_EXITS(5, "entrancesAndExits"),
        MORE_INFO(6, "moreInfo");
        
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
                    return STOP_NAME;
                case 2:
                    return STOP_LOCATION;
                case 3:
                    return IMAGE_REF_SET;
                case 4:
                    return DELETE_PENDING;
                case 5:
                    return ENTRANCES_AND_EXITS;
                case 6:
                    return MORE_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorStopMetaData$a */
    public static class C9412a extends C25239c<MVMobileEditorStopMetaData> {
        public C9412a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorStopMetaData mVMobileEditorStopMetaData = (MVMobileEditorStopMetaData) tBase;
            MVLatLon mVLatLon = mVMobileEditorStopMetaData.stopLocation;
            C25113c cVar = MVMobileEditorStopMetaData.f26820b;
            gVar.mo61687K();
            if (mVMobileEditorStopMetaData.stopName != null) {
                gVar.mo61711x(MVMobileEditorStopMetaData.f26820b);
                gVar.mo61686J(mVMobileEditorStopMetaData.stopName);
                gVar.mo61712y();
            }
            if (mVMobileEditorStopMetaData.stopLocation != null) {
                gVar.mo61711x(MVMobileEditorStopMetaData.f26821c);
                mVMobileEditorStopMetaData.stopLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMobileEditorStopMetaData.imageRefSet != null) {
                gVar.mo61711x(MVMobileEditorStopMetaData.f26822d);
                mVMobileEditorStopMetaData.imageRefSet.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVMobileEditorStopMetaData.f26823e);
            gVar.mo61708u(mVMobileEditorStopMetaData.deletePending);
            gVar.mo61712y();
            if (mVMobileEditorStopMetaData.entrancesAndExits != null && mVMobileEditorStopMetaData.mo29143g()) {
                gVar.mo61711x(MVMobileEditorStopMetaData.f26824f);
                gVar.mo61680D(new C25119e((byte) 12, mVMobileEditorStopMetaData.entrancesAndExits.size()));
                for (MVMobileEditorPathwayMetaData X0 : mVMobileEditorStopMetaData.entrancesAndExits) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMobileEditorStopMetaData.moreInfo != null && mVMobileEditorStopMetaData.mo29146i()) {
                gVar.mo61711x(MVMobileEditorStopMetaData.f26825g);
                gVar.mo61686J(mVMobileEditorStopMetaData.moreInfo);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorStopMetaData mVMobileEditorStopMetaData = (MVMobileEditorStopMetaData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVMobileEditorStopMetaData.stopLocation;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMobileEditorStopMetaData.stopName = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLatLon mVLatLon2 = new MVLatLon();
                            mVMobileEditorStopMetaData.stopLocation = mVLatLon2;
                            mVLatLon2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceSetWithParams mVImageReferenceSetWithParams = new MVImageReferenceSetWithParams();
                            mVMobileEditorStopMetaData.imageRefSet = mVImageReferenceSetWithParams;
                            mVImageReferenceSetWithParams.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMobileEditorStopMetaData.deletePending = gVar.mo61690c();
                            mVMobileEditorStopMetaData.mo29149l();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVMobileEditorStopMetaData.entrancesAndExits = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVMobileEditorPathwayMetaData mVMobileEditorPathwayMetaData = new MVMobileEditorPathwayMetaData();
                                mVMobileEditorPathwayMetaData.mo25201C1(gVar);
                                mVMobileEditorStopMetaData.entrancesAndExits.add(mVMobileEditorPathwayMetaData);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMobileEditorStopMetaData.moreInfo = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorStopMetaData$b */
    public static class C9413b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9412a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorStopMetaData$c */
    public static class C9414c extends C25240d<MVMobileEditorStopMetaData> {
        public C9414c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorStopMetaData mVMobileEditorStopMetaData = (MVMobileEditorStopMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMobileEditorStopMetaData.mo29148k()) {
                bitSet.set(0);
            }
            if (mVMobileEditorStopMetaData.mo29147j()) {
                bitSet.set(1);
            }
            if (mVMobileEditorStopMetaData.mo29144h()) {
                bitSet.set(2);
            }
            if (mVMobileEditorStopMetaData.mo29142f()) {
                bitSet.set(3);
            }
            if (mVMobileEditorStopMetaData.mo29143g()) {
                bitSet.set(4);
            }
            if (mVMobileEditorStopMetaData.mo29146i()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVMobileEditorStopMetaData.mo29148k()) {
                jVar.mo61686J(mVMobileEditorStopMetaData.stopName);
            }
            if (mVMobileEditorStopMetaData.mo29147j()) {
                mVMobileEditorStopMetaData.stopLocation.mo25202X0(jVar);
            }
            if (mVMobileEditorStopMetaData.mo29144h()) {
                mVMobileEditorStopMetaData.imageRefSet.mo25202X0(jVar);
            }
            if (mVMobileEditorStopMetaData.mo29142f()) {
                jVar.mo61708u(mVMobileEditorStopMetaData.deletePending);
            }
            if (mVMobileEditorStopMetaData.mo29143g()) {
                jVar.mo61678B(mVMobileEditorStopMetaData.entrancesAndExits.size());
                for (MVMobileEditorPathwayMetaData X0 : mVMobileEditorStopMetaData.entrancesAndExits) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVMobileEditorStopMetaData.mo29146i()) {
                jVar.mo61686J(mVMobileEditorStopMetaData.moreInfo);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorStopMetaData mVMobileEditorStopMetaData = (MVMobileEditorStopMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVMobileEditorStopMetaData.stopName = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVMobileEditorStopMetaData.stopLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVImageReferenceSetWithParams mVImageReferenceSetWithParams = new MVImageReferenceSetWithParams();
                mVMobileEditorStopMetaData.imageRefSet = mVImageReferenceSetWithParams;
                mVImageReferenceSetWithParams.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVMobileEditorStopMetaData.deletePending = jVar.mo61690c();
                mVMobileEditorStopMetaData.mo29149l();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVMobileEditorStopMetaData.entrancesAndExits = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVMobileEditorPathwayMetaData mVMobileEditorPathwayMetaData = new MVMobileEditorPathwayMetaData();
                    mVMobileEditorPathwayMetaData.mo25201C1(jVar);
                    mVMobileEditorStopMetaData.entrancesAndExits.add(mVMobileEditorPathwayMetaData);
                }
            }
            if (T.get(5)) {
                mVMobileEditorStopMetaData.moreInfo = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorStopMetaData$d */
    public static class C9415d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9414c(0);
        }
    }

    static {
        new C17394d0("MVMobileEditorStopMetaData");
        HashMap hashMap = new HashMap();
        f26826h = hashMap;
        hashMap.put(C25239c.class, new C9413b());
        hashMap.put(C25240d.class, new C9415d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_NAME, new FieldMetaData("stopName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STOP_LOCATION, new FieldMetaData("stopLocation", (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.IMAGE_REF_SET, new FieldMetaData("imageRefSet", (byte) 3, new StructMetaData(MVImageReferenceSetWithParams.class)));
        enumMap.put(_Fields.DELETE_PENDING, new FieldMetaData("deletePending", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.ENTRANCES_AND_EXITS, new FieldMetaData("entrancesAndExits", (byte) 2, new ListMetaData(new StructMetaData(MVMobileEditorPathwayMetaData.class))));
        enumMap.put(_Fields.MORE_INFO, new FieldMetaData("moreInfo", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26827i = unmodifiableMap;
        FieldMetaData.m61947a(MVMobileEditorStopMetaData.class, unmodifiableMap);
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
        ((C25238b) f26826h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26826h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29139a(MVMobileEditorStopMetaData mVMobileEditorStopMetaData) {
        if (mVMobileEditorStopMetaData == null) {
            return false;
        }
        boolean k = mo29148k();
        boolean k2 = mVMobileEditorStopMetaData.mo29148k();
        if ((k || k2) && (!k || !k2 || !this.stopName.equals(mVMobileEditorStopMetaData.stopName))) {
            return false;
        }
        boolean j = mo29147j();
        boolean j2 = mVMobileEditorStopMetaData.mo29147j();
        if ((j || j2) && (!j || !j2 || !this.stopLocation.mo26290a(mVMobileEditorStopMetaData.stopLocation))) {
            return false;
        }
        boolean h = mo29144h();
        boolean h2 = mVMobileEditorStopMetaData.mo29144h();
        if (((h || h2) && (!h || !h2 || !this.imageRefSet.mo26230a(mVMobileEditorStopMetaData.imageRefSet))) || this.deletePending != mVMobileEditorStopMetaData.deletePending) {
            return false;
        }
        boolean g = mo29143g();
        boolean g2 = mVMobileEditorStopMetaData.mo29143g();
        if ((g || g2) && (!g || !g2 || !this.entrancesAndExits.equals(mVMobileEditorStopMetaData.entrancesAndExits))) {
            return false;
        }
        boolean i = mo29146i();
        boolean i2 = mVMobileEditorStopMetaData.mo29146i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || !this.moreInfo.equals(mVMobileEditorStopMetaData.moreInfo)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMobileEditorStopMetaData mVMobileEditorStopMetaData = (MVMobileEditorStopMetaData) obj;
        if (!getClass().equals(mVMobileEditorStopMetaData.getClass())) {
            return getClass().getName().compareTo(mVMobileEditorStopMetaData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29148k()).compareTo(Boolean.valueOf(mVMobileEditorStopMetaData.mo29148k()));
        if (compareTo2 != 0 || ((mo29148k() && (compareTo2 = this.stopName.compareTo(mVMobileEditorStopMetaData.stopName)) != 0) || (compareTo2 = Boolean.valueOf(mo29147j()).compareTo(Boolean.valueOf(mVMobileEditorStopMetaData.mo29147j()))) != 0 || ((mo29147j() && (compareTo2 = this.stopLocation.compareTo(mVMobileEditorStopMetaData.stopLocation)) != 0) || (compareTo2 = Boolean.valueOf(mo29144h()).compareTo(Boolean.valueOf(mVMobileEditorStopMetaData.mo29144h()))) != 0 || ((mo29144h() && (compareTo2 = this.imageRefSet.compareTo(mVMobileEditorStopMetaData.imageRefSet)) != 0) || (compareTo2 = Boolean.valueOf(mo29142f()).compareTo(Boolean.valueOf(mVMobileEditorStopMetaData.mo29142f()))) != 0 || ((mo29142f() && (compareTo2 = C25082a.m62848l(this.deletePending, mVMobileEditorStopMetaData.deletePending)) != 0) || (compareTo2 = Boolean.valueOf(mo29143g()).compareTo(Boolean.valueOf(mVMobileEditorStopMetaData.mo29143g()))) != 0 || ((mo29143g() && (compareTo2 = C25082a.m62844h(this.entrancesAndExits, mVMobileEditorStopMetaData.entrancesAndExits)) != 0) || (compareTo2 = Boolean.valueOf(mo29146i()).compareTo(Boolean.valueOf(mVMobileEditorStopMetaData.mo29146i()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo29146i() || (compareTo = this.moreInfo.compareTo(mVMobileEditorStopMetaData.moreInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMobileEditorStopMetaData)) {
            return mo29139a((MVMobileEditorStopMetaData) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29142f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo29143g() {
        return this.entrancesAndExits != null;
    }

    /* renamed from: h */
    public final boolean mo29144h() {
        return this.imageRefSet != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29146i() {
        return this.moreInfo != null;
    }

    /* renamed from: j */
    public final boolean mo29147j() {
        return this.stopLocation != null;
    }

    /* renamed from: k */
    public final boolean mo29148k() {
        return this.stopName != null;
    }

    /* renamed from: l */
    public final void mo29149l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMobileEditorStopMetaData(", "stopName:");
        String str = this.stopName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("stopLocation:");
        MVLatLon mVLatLon = this.stopLocation;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(", ");
        n.append("imageRefSet:");
        MVImageReferenceSetWithParams mVImageReferenceSetWithParams = this.imageRefSet;
        if (mVImageReferenceSetWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceSetWithParams);
        }
        n.append(", ");
        n.append("deletePending:");
        n.append(this.deletePending);
        if (mo29143g()) {
            n.append(", ");
            n.append("entrancesAndExits:");
            List<MVMobileEditorPathwayMetaData> list = this.entrancesAndExits;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo29146i()) {
            n.append(", ");
            n.append("moreInfo:");
            String str2 = this.moreInfo;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
