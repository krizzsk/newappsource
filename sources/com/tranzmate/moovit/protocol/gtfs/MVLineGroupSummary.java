package com.tranzmate.moovit.protocol.gtfs;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceSet;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithoutParamsSet;
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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVLineGroupSummary implements TBase<MVLineGroupSummary, _Fields>, Serializable, Cloneable, Comparable<MVLineGroupSummary> {

    /* renamed from: b */
    public static final C25113c f25695b = new C25113c("groupId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25696c = new C25113c("lineNumber", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25697d = new C25113c("agencyId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f25698e = new C25113c("color", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f25699f = new C25113c("imageRefSet", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f25700g = new C25113c("lineSummaries", (byte) 15, 6);

    /* renamed from: h */
    public static final C25113c f25701h = new C25113c("innerImageIds", (byte) 12, 7);

    /* renamed from: i */
    public static final C25113c f25702i = new C25113c("caption1", (byte) 11, 8);

    /* renamed from: j */
    public static final C25113c f25703j = new C25113c("caption2", (byte) 11, 9);

    /* renamed from: k */
    public static final C25113c f25704k = new C25113c("type", (byte) 8, 10);

    /* renamed from: l */
    public static final C25113c f25705l = new C25113c("subGroups", (byte) 15, 11);

    /* renamed from: m */
    public static final C25113c f25706m = new C25113c("pdfFileUrl", (byte) 11, 12);

    /* renamed from: n */
    public static final HashMap f25707n;

    /* renamed from: o */
    public static final Map<_Fields, FieldMetaData> f25708o;
    private byte __isset_bitfield = 0;
    public int agencyId;
    public String caption1;
    public String caption2;
    public int color;
    public int groupId;
    public MVImageReferenceSet imageRefSet;
    public MVImageReferenceWithoutParamsSet innerImageIds;
    public String lineNumber;
    public List<MVLineSummary> lineSummaries;
    private _Fields[] optionals = {_Fields.COLOR, _Fields.IMAGE_REF_SET, _Fields.CAPTION1, _Fields.CAPTION2, _Fields.SUB_GROUPS};
    public String pdfFileUrl;
    public List<MVSubGroup> subGroups;
    public MVLineGroupSummaryType type;

    public enum _Fields implements C25085c {
        GROUP_ID(1, "groupId"),
        LINE_NUMBER(2, "lineNumber"),
        AGENCY_ID(3, "agencyId"),
        COLOR(4, "color"),
        IMAGE_REF_SET(5, "imageRefSet"),
        LINE_SUMMARIES(6, "lineSummaries"),
        INNER_IMAGE_IDS(7, "innerImageIds"),
        CAPTION1(8, "caption1"),
        CAPTION2(9, "caption2"),
        TYPE(10, "type"),
        SUB_GROUPS(11, "subGroups"),
        PDF_FILE_URL(12, "pdfFileUrl");
        
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
                    return GROUP_ID;
                case 2:
                    return LINE_NUMBER;
                case 3:
                    return AGENCY_ID;
                case 4:
                    return COLOR;
                case 5:
                    return IMAGE_REF_SET;
                case 6:
                    return LINE_SUMMARIES;
                case 7:
                    return INNER_IMAGE_IDS;
                case 8:
                    return CAPTION1;
                case 9:
                    return CAPTION2;
                case 10:
                    return TYPE;
                case 11:
                    return SUB_GROUPS;
                case 12:
                    return PDF_FILE_URL;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummary$a */
    public static class C8775a extends C25239c<MVLineGroupSummary> {
        public C8775a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineGroupSummary mVLineGroupSummary = (MVLineGroupSummary) tBase;
            MVImageReferenceSet mVImageReferenceSet = mVLineGroupSummary.imageRefSet;
            C25113c cVar = MVLineGroupSummary.f25695b;
            gVar.mo61687K();
            gVar.mo61711x(MVLineGroupSummary.f25695b);
            gVar.mo61678B(mVLineGroupSummary.groupId);
            gVar.mo61712y();
            if (mVLineGroupSummary.lineNumber != null) {
                gVar.mo61711x(MVLineGroupSummary.f25696c);
                gVar.mo61686J(mVLineGroupSummary.lineNumber);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVLineGroupSummary.f25697d);
            gVar.mo61678B(mVLineGroupSummary.agencyId);
            gVar.mo61712y();
            if (mVLineGroupSummary.mo27344i()) {
                gVar.mo61711x(MVLineGroupSummary.f25698e);
                gVar.mo61678B(mVLineGroupSummary.color);
                gVar.mo61712y();
            }
            if (mVLineGroupSummary.imageRefSet != null && mVLineGroupSummary.mo27346k()) {
                gVar.mo61711x(MVLineGroupSummary.f25699f);
                mVLineGroupSummary.imageRefSet.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVLineGroupSummary.lineSummaries != null) {
                gVar.mo61711x(MVLineGroupSummary.f25700g);
                gVar.mo61680D(new C25119e((byte) 12, mVLineGroupSummary.lineSummaries.size()));
                for (MVLineSummary X0 : mVLineGroupSummary.lineSummaries) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVLineGroupSummary.innerImageIds != null) {
                gVar.mo61711x(MVLineGroupSummary.f25701h);
                mVLineGroupSummary.innerImageIds.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVLineGroupSummary.caption1 != null && mVLineGroupSummary.mo27341g()) {
                gVar.mo61711x(MVLineGroupSummary.f25702i);
                gVar.mo61686J(mVLineGroupSummary.caption1);
                gVar.mo61712y();
            }
            if (mVLineGroupSummary.caption2 != null && mVLineGroupSummary.mo27342h()) {
                gVar.mo61711x(MVLineGroupSummary.f25703j);
                gVar.mo61686J(mVLineGroupSummary.caption2);
                gVar.mo61712y();
            }
            if (mVLineGroupSummary.type != null) {
                gVar.mo61711x(MVLineGroupSummary.f25704k);
                gVar.mo61678B(mVLineGroupSummary.type.getValue());
                gVar.mo61712y();
            }
            if (mVLineGroupSummary.subGroups != null && mVLineGroupSummary.mo27351q()) {
                gVar.mo61711x(MVLineGroupSummary.f25705l);
                gVar.mo61680D(new C25119e((byte) 12, mVLineGroupSummary.subGroups.size()));
                for (MVSubGroup X02 : mVLineGroupSummary.subGroups) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVLineGroupSummary.pdfFileUrl != null) {
                gVar.mo61711x(MVLineGroupSummary.f25706m);
                gVar.mo61686J(mVLineGroupSummary.pdfFileUrl);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineGroupSummary mVLineGroupSummary = (MVLineGroupSummary) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceSet mVImageReferenceSet = mVLineGroupSummary.imageRefSet;
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineGroupSummary.groupId = gVar.mo61696i();
                            mVLineGroupSummary.mo27356u();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineGroupSummary.lineNumber = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineGroupSummary.agencyId = gVar.mo61696i();
                            mVLineGroupSummary.mo27353s();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineGroupSummary.color = gVar.mo61696i();
                            mVLineGroupSummary.mo27354t();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceSet mVImageReferenceSet2 = new MVImageReferenceSet();
                            mVLineGroupSummary.imageRefSet = mVImageReferenceSet2;
                            mVImageReferenceSet2.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVLineGroupSummary.lineSummaries = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVLineSummary mVLineSummary = new MVLineSummary();
                                mVLineSummary.mo25201C1(gVar);
                                mVLineGroupSummary.lineSummaries.add(mVLineSummary);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithoutParamsSet mVImageReferenceWithoutParamsSet = new MVImageReferenceWithoutParamsSet();
                            mVLineGroupSummary.innerImageIds = mVImageReferenceWithoutParamsSet;
                            mVImageReferenceWithoutParamsSet.mo25201C1(gVar);
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineGroupSummary.caption1 = gVar.mo61704q();
                            break;
                        }
                    case 9:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineGroupSummary.caption2 = gVar.mo61704q();
                            break;
                        }
                    case 10:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineGroupSummary.type = MVLineGroupSummaryType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 11:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVLineGroupSummary.subGroups = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                MVSubGroup mVSubGroup = new MVSubGroup();
                                mVSubGroup.mo25201C1(gVar);
                                mVLineGroupSummary.subGroups.add(mVSubGroup);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 12:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineGroupSummary.pdfFileUrl = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummary$b */
    public static class C8776b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8775a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummary$c */
    public static class C8777c extends C25240d<MVLineGroupSummary> {
        public C8777c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineGroupSummary mVLineGroupSummary = (MVLineGroupSummary) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLineGroupSummary.mo27345j()) {
                bitSet.set(0);
            }
            if (mVLineGroupSummary.mo27348m()) {
                bitSet.set(1);
            }
            if (mVLineGroupSummary.mo27340f()) {
                bitSet.set(2);
            }
            if (mVLineGroupSummary.mo27344i()) {
                bitSet.set(3);
            }
            if (mVLineGroupSummary.mo27346k()) {
                bitSet.set(4);
            }
            if (mVLineGroupSummary.mo27349o()) {
                bitSet.set(5);
            }
            if (mVLineGroupSummary.mo27347l()) {
                bitSet.set(6);
            }
            if (mVLineGroupSummary.mo27341g()) {
                bitSet.set(7);
            }
            if (mVLineGroupSummary.mo27342h()) {
                bitSet.set(8);
            }
            if (mVLineGroupSummary.mo27352r()) {
                bitSet.set(9);
            }
            if (mVLineGroupSummary.mo27351q()) {
                bitSet.set(10);
            }
            if (mVLineGroupSummary.mo27350p()) {
                bitSet.set(11);
            }
            jVar.mo61738U(bitSet, 12);
            if (mVLineGroupSummary.mo27345j()) {
                jVar.mo61678B(mVLineGroupSummary.groupId);
            }
            if (mVLineGroupSummary.mo27348m()) {
                jVar.mo61686J(mVLineGroupSummary.lineNumber);
            }
            if (mVLineGroupSummary.mo27340f()) {
                jVar.mo61678B(mVLineGroupSummary.agencyId);
            }
            if (mVLineGroupSummary.mo27344i()) {
                jVar.mo61678B(mVLineGroupSummary.color);
            }
            if (mVLineGroupSummary.mo27346k()) {
                mVLineGroupSummary.imageRefSet.mo25202X0(jVar);
            }
            if (mVLineGroupSummary.mo27349o()) {
                jVar.mo61678B(mVLineGroupSummary.lineSummaries.size());
                for (MVLineSummary X0 : mVLineGroupSummary.lineSummaries) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVLineGroupSummary.mo27347l()) {
                mVLineGroupSummary.innerImageIds.mo25202X0(jVar);
            }
            if (mVLineGroupSummary.mo27341g()) {
                jVar.mo61686J(mVLineGroupSummary.caption1);
            }
            if (mVLineGroupSummary.mo27342h()) {
                jVar.mo61686J(mVLineGroupSummary.caption2);
            }
            if (mVLineGroupSummary.mo27352r()) {
                jVar.mo61678B(mVLineGroupSummary.type.getValue());
            }
            if (mVLineGroupSummary.mo27351q()) {
                jVar.mo61678B(mVLineGroupSummary.subGroups.size());
                for (MVSubGroup X02 : mVLineGroupSummary.subGroups) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVLineGroupSummary.mo27350p()) {
                jVar.mo61686J(mVLineGroupSummary.pdfFileUrl);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineGroupSummary mVLineGroupSummary = (MVLineGroupSummary) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(12);
            if (T.get(0)) {
                mVLineGroupSummary.groupId = jVar.mo61696i();
                mVLineGroupSummary.mo27356u();
            }
            if (T.get(1)) {
                mVLineGroupSummary.lineNumber = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVLineGroupSummary.agencyId = jVar.mo61696i();
                mVLineGroupSummary.mo27353s();
            }
            if (T.get(3)) {
                mVLineGroupSummary.color = jVar.mo61696i();
                mVLineGroupSummary.mo27354t();
            }
            if (T.get(4)) {
                MVImageReferenceSet mVImageReferenceSet = new MVImageReferenceSet();
                mVLineGroupSummary.imageRefSet = mVImageReferenceSet;
                mVImageReferenceSet.mo25201C1(jVar);
            }
            if (T.get(5)) {
                int i = jVar.mo61696i();
                mVLineGroupSummary.lineSummaries = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVLineSummary mVLineSummary = new MVLineSummary();
                    mVLineSummary.mo25201C1(jVar);
                    mVLineGroupSummary.lineSummaries.add(mVLineSummary);
                }
            }
            if (T.get(6)) {
                MVImageReferenceWithoutParamsSet mVImageReferenceWithoutParamsSet = new MVImageReferenceWithoutParamsSet();
                mVLineGroupSummary.innerImageIds = mVImageReferenceWithoutParamsSet;
                mVImageReferenceWithoutParamsSet.mo25201C1(jVar);
            }
            if (T.get(7)) {
                mVLineGroupSummary.caption1 = jVar.mo61704q();
            }
            if (T.get(8)) {
                mVLineGroupSummary.caption2 = jVar.mo61704q();
            }
            if (T.get(9)) {
                mVLineGroupSummary.type = MVLineGroupSummaryType.findByValue(jVar.mo61696i());
            }
            if (T.get(10)) {
                int i3 = jVar.mo61696i();
                mVLineGroupSummary.subGroups = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVSubGroup mVSubGroup = new MVSubGroup();
                    mVSubGroup.mo25201C1(jVar);
                    mVLineGroupSummary.subGroups.add(mVSubGroup);
                }
            }
            if (T.get(11)) {
                mVLineGroupSummary.pdfFileUrl = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummary$d */
    public static class C8778d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8777c(0);
        }
    }

    static {
        new C17394d0("MVLineGroupSummary");
        HashMap hashMap = new HashMap();
        f25707n = hashMap;
        hashMap.put(C25239c.class, new C8776b());
        hashMap.put(C25240d.class, new C8778d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.GROUP_ID, new FieldMetaData("groupId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LINE_NUMBER, new FieldMetaData("lineNumber", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AGENCY_ID, new FieldMetaData("agencyId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.COLOR, new FieldMetaData("color", (byte) 2, new FieldValueMetaData((byte) 8, "Color")));
        enumMap.put(_Fields.IMAGE_REF_SET, new FieldMetaData("imageRefSet", (byte) 2, new StructMetaData(MVImageReferenceSet.class)));
        enumMap.put(_Fields.LINE_SUMMARIES, new FieldMetaData("lineSummaries", (byte) 3, new ListMetaData(new StructMetaData(MVLineSummary.class))));
        enumMap.put(_Fields.INNER_IMAGE_IDS, new FieldMetaData("innerImageIds", (byte) 3, new StructMetaData(MVImageReferenceWithoutParamsSet.class)));
        enumMap.put(_Fields.CAPTION1, new FieldMetaData("caption1", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CAPTION2, new FieldMetaData("caption2", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVLineGroupSummaryType.class)));
        enumMap.put(_Fields.SUB_GROUPS, new FieldMetaData("subGroups", (byte) 2, new ListMetaData(new StructMetaData(MVSubGroup.class))));
        enumMap.put(_Fields.PDF_FILE_URL, new FieldMetaData("pdfFileUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25708o = unmodifiableMap;
        FieldMetaData.m61947a(MVLineGroupSummary.class, unmodifiableMap);
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
        ((C25238b) f25707n.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25707n.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVLineGroupSummary mVLineGroupSummary = (MVLineGroupSummary) obj;
        if (!getClass().equals(mVLineGroupSummary.getClass())) {
            return getClass().getName().compareTo(mVLineGroupSummary.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27345j()).compareTo(Boolean.valueOf(mVLineGroupSummary.mo27345j()));
        if (compareTo2 != 0 || ((mo27345j() && (compareTo2 = C25082a.m62839c(this.groupId, mVLineGroupSummary.groupId)) != 0) || (compareTo2 = Boolean.valueOf(mo27348m()).compareTo(Boolean.valueOf(mVLineGroupSummary.mo27348m()))) != 0 || ((mo27348m() && (compareTo2 = this.lineNumber.compareTo(mVLineGroupSummary.lineNumber)) != 0) || (compareTo2 = Boolean.valueOf(mo27340f()).compareTo(Boolean.valueOf(mVLineGroupSummary.mo27340f()))) != 0 || ((mo27340f() && (compareTo2 = C25082a.m62839c(this.agencyId, mVLineGroupSummary.agencyId)) != 0) || (compareTo2 = Boolean.valueOf(mo27344i()).compareTo(Boolean.valueOf(mVLineGroupSummary.mo27344i()))) != 0 || ((mo27344i() && (compareTo2 = C25082a.m62839c(this.color, mVLineGroupSummary.color)) != 0) || (compareTo2 = Boolean.valueOf(mo27346k()).compareTo(Boolean.valueOf(mVLineGroupSummary.mo27346k()))) != 0 || ((mo27346k() && (compareTo2 = this.imageRefSet.compareTo(mVLineGroupSummary.imageRefSet)) != 0) || (compareTo2 = Boolean.valueOf(mo27349o()).compareTo(Boolean.valueOf(mVLineGroupSummary.mo27349o()))) != 0 || ((mo27349o() && (compareTo2 = C25082a.m62844h(this.lineSummaries, mVLineGroupSummary.lineSummaries)) != 0) || (compareTo2 = Boolean.valueOf(mo27347l()).compareTo(Boolean.valueOf(mVLineGroupSummary.mo27347l()))) != 0 || ((mo27347l() && (compareTo2 = this.innerImageIds.compareTo(mVLineGroupSummary.innerImageIds)) != 0) || (compareTo2 = Boolean.valueOf(mo27341g()).compareTo(Boolean.valueOf(mVLineGroupSummary.mo27341g()))) != 0 || ((mo27341g() && (compareTo2 = this.caption1.compareTo(mVLineGroupSummary.caption1)) != 0) || (compareTo2 = Boolean.valueOf(mo27342h()).compareTo(Boolean.valueOf(mVLineGroupSummary.mo27342h()))) != 0 || ((mo27342h() && (compareTo2 = this.caption2.compareTo(mVLineGroupSummary.caption2)) != 0) || (compareTo2 = Boolean.valueOf(mo27352r()).compareTo(Boolean.valueOf(mVLineGroupSummary.mo27352r()))) != 0 || ((mo27352r() && (compareTo2 = this.type.compareTo(mVLineGroupSummary.type)) != 0) || (compareTo2 = Boolean.valueOf(mo27351q()).compareTo(Boolean.valueOf(mVLineGroupSummary.mo27351q()))) != 0 || ((mo27351q() && (compareTo2 = C25082a.m62844h(this.subGroups, mVLineGroupSummary.subGroups)) != 0) || (compareTo2 = Boolean.valueOf(mo27350p()).compareTo(Boolean.valueOf(mVLineGroupSummary.mo27350p()))) != 0)))))))))))) {
            return compareTo2;
        }
        if (!mo27350p() || (compareTo = this.pdfFileUrl.compareTo(mVLineGroupSummary.pdfFileUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVLineGroupSummary)) {
            return false;
        }
        MVLineGroupSummary mVLineGroupSummary = (MVLineGroupSummary) obj;
        if (this.groupId != mVLineGroupSummary.groupId) {
            return false;
        }
        boolean m = mo27348m();
        boolean m2 = mVLineGroupSummary.mo27348m();
        if (((m || m2) && (!m || !m2 || !this.lineNumber.equals(mVLineGroupSummary.lineNumber))) || this.agencyId != mVLineGroupSummary.agencyId) {
            return false;
        }
        boolean i = mo27344i();
        boolean i2 = mVLineGroupSummary.mo27344i();
        if ((i || i2) && (!i || !i2 || this.color != mVLineGroupSummary.color)) {
            return false;
        }
        boolean k = mo27346k();
        boolean k2 = mVLineGroupSummary.mo27346k();
        if ((k || k2) && (!k || !k2 || !this.imageRefSet.mo26214a(mVLineGroupSummary.imageRefSet))) {
            return false;
        }
        boolean o = mo27349o();
        boolean o2 = mVLineGroupSummary.mo27349o();
        if ((o || o2) && (!o || !o2 || !this.lineSummaries.equals(mVLineGroupSummary.lineSummaries))) {
            return false;
        }
        boolean l = mo27347l();
        boolean l2 = mVLineGroupSummary.mo27347l();
        if ((l || l2) && (!l || !l2 || !this.innerImageIds.mo26263a(mVLineGroupSummary.innerImageIds))) {
            return false;
        }
        boolean g = mo27341g();
        boolean g2 = mVLineGroupSummary.mo27341g();
        if ((g || g2) && (!g || !g2 || !this.caption1.equals(mVLineGroupSummary.caption1))) {
            return false;
        }
        boolean h = mo27342h();
        boolean h2 = mVLineGroupSummary.mo27342h();
        if ((h || h2) && (!h || !h2 || !this.caption2.equals(mVLineGroupSummary.caption2))) {
            return false;
        }
        boolean r = mo27352r();
        boolean r2 = mVLineGroupSummary.mo27352r();
        if ((r || r2) && (!r || !r2 || !this.type.equals(mVLineGroupSummary.type))) {
            return false;
        }
        boolean q = mo27351q();
        boolean q2 = mVLineGroupSummary.mo27351q();
        if ((q || q2) && (!q || !q2 || !this.subGroups.equals(mVLineGroupSummary.subGroups))) {
            return false;
        }
        boolean p = mo27350p();
        boolean p2 = mVLineGroupSummary.mo27350p();
        if ((p || p2) && (!p || !p2 || !this.pdfFileUrl.equals(mVLineGroupSummary.pdfFileUrl))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27340f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo27341g() {
        return this.caption1 != null;
    }

    /* renamed from: h */
    public final boolean mo27342h() {
        return this.caption2 != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27344i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final boolean mo27345j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo27346k() {
        return this.imageRefSet != null;
    }

    /* renamed from: l */
    public final boolean mo27347l() {
        return this.innerImageIds != null;
    }

    /* renamed from: m */
    public final boolean mo27348m() {
        return this.lineNumber != null;
    }

    /* renamed from: o */
    public final boolean mo27349o() {
        return this.lineSummaries != null;
    }

    /* renamed from: p */
    public final boolean mo27350p() {
        return this.pdfFileUrl != null;
    }

    /* renamed from: q */
    public final boolean mo27351q() {
        return this.subGroups != null;
    }

    /* renamed from: r */
    public final boolean mo27352r() {
        return this.type != null;
    }

    /* renamed from: s */
    public final void mo27353s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: t */
    public final void mo27354t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLineGroupSummary(", "groupId:");
        C0016g.m42z(n, this.groupId, ", ", "lineNumber:");
        String str = this.lineNumber;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("agencyId:");
        n.append(this.agencyId);
        if (mo27344i()) {
            n.append(", ");
            n.append("color:");
            n.append(this.color);
        }
        if (mo27346k()) {
            n.append(", ");
            n.append("imageRefSet:");
            MVImageReferenceSet mVImageReferenceSet = this.imageRefSet;
            if (mVImageReferenceSet == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceSet);
            }
        }
        n.append(", ");
        n.append("lineSummaries:");
        List<MVLineSummary> list = this.lineSummaries;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("innerImageIds:");
        MVImageReferenceWithoutParamsSet mVImageReferenceWithoutParamsSet = this.innerImageIds;
        if (mVImageReferenceWithoutParamsSet == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithoutParamsSet);
        }
        if (mo27341g()) {
            n.append(", ");
            n.append("caption1:");
            String str2 = this.caption1;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo27342h()) {
            n.append(", ");
            n.append("caption2:");
            String str3 = this.caption2;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(", ");
        n.append("type:");
        MVLineGroupSummaryType mVLineGroupSummaryType = this.type;
        if (mVLineGroupSummaryType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLineGroupSummaryType);
        }
        if (mo27351q()) {
            n.append(", ");
            n.append("subGroups:");
            List<MVSubGroup> list2 = this.subGroups;
            if (list2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list2);
            }
        }
        n.append(", ");
        n.append("pdfFileUrl:");
        String str4 = this.pdfFileUrl;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo27356u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }
}
