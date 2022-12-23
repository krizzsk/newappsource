package p40;

import android.content.Context;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7841a;
import com.tranzmate.moovit.protocol.clienttexts.MVClientText;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.common.MVRouteType;
import com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType;
import com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType;
import com.tranzmate.moovit.protocol.common.MVViewType;
import com.tranzmate.moovit.protocol.gtfs.MVAgency;
import com.tranzmate.moovit.protocol.gtfs.MVBicycleProvider;
import com.tranzmate.moovit.protocol.gtfs.MVMetroAreaData;
import com.tranzmate.moovit.protocol.gtfs.MVMetroRouteType;
import com.tranzmate.moovit.protocol.presentation.MVConditional;
import com.tranzmate.moovit.protocol.presentation.MVDelimiterToken;
import com.tranzmate.moovit.protocol.presentation.MVLineTemplate;
import com.tranzmate.moovit.protocol.presentation.MVLineTemplateToken;
import com.tranzmate.moovit.protocol.presentation.MVPresentationLineTemplate;
import com.tranzmate.moovit.protocol.presentation.MVPresentationType;
import com.tranzmate.moovit.protocol.presentation.MVTokenConditional;
import g30.C4776h;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import l40.C5605d;
import p824tp.C19731i;
import s00.C19393f;
import u00.C19824g;
import v00.C20062a;

/* renamed from: p40.g */
public final class C6073g extends C6071e {

    /* renamed from: p40.g$a */
    public static class C6074a extends C5605d.C5609d {

        /* renamed from: a */
        public final MVMetroAreaData f19326a = new MVMetroAreaData();
    }

    public C6073g() {
        super(1);
    }

    /* renamed from: q */
    public final C20062a mo22056q(C19393f fVar) {
        return fVar.f49327a;
    }

    /* renamed from: s */
    public final void mo22057s(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase, C5605d dVar) throws IOException, AppDataPartLoadFailedException {
        int i;
        int i2;
        int i3;
        C5605d dVar2 = dVar;
        C6074a aVar = new C6074a();
        DataInputStream a = dVar2.mo21433a("metro.dat");
        int readInt = a.readInt();
        long readLong = a.readLong();
        String j2 = dVar2.mo21441j(a, a.readInt());
        String j3 = dVar2.mo21441j(a, a.readInt());
        String j4 = dVar2.mo21441j(a, a.readInt());
        int readInt2 = a.readInt();
        String j5 = dVar2.mo21441j(a, a.readInt());
        String j6 = dVar2.mo21441j(a, a.readInt());
        int readInt3 = a.readInt();
        int readInt4 = a.readInt();
        int readInt5 = a.readInt();
        MVMetroAreaData mVMetroAreaData = aVar.f19326a;
        mVMetroAreaData.metroAreaId = readInt;
        mVMetroAreaData.mo27416F();
        MVMetroAreaData mVMetroAreaData2 = aVar.f19326a;
        mVMetroAreaData2.revisionNumber = readLong;
        mVMetroAreaData2.mo27417G();
        MVMetroAreaData mVMetroAreaData3 = aVar.f19326a;
        mVMetroAreaData3.timeZone = j2;
        mVMetroAreaData3.polygon = j3;
        mVMetroAreaData3.metroAreaName = j4;
        mVMetroAreaData3.countryId = readInt2;
        mVMetroAreaData3.mo27414D();
        MVMetroAreaData mVMetroAreaData4 = aVar.f19326a;
        mVMetroAreaData4.countryName = j5;
        mVMetroAreaData4.countryCode = j6;
        mVMetroAreaData4.defaultLocation = new MVLatLon(readInt3, readInt4);
        MVMetroAreaData mVMetroAreaData5 = aVar.f19326a;
        mVMetroAreaData5.localDayChangeTime = readInt5;
        mVMetroAreaData5.mo27415E();
        int readInt6 = a.readInt();
        aVar.f19326a.routeTypes = new ArrayList(readInt6);
        for (int i4 = 0; i4 < readInt6; i4++) {
            byte readByte = a.readByte();
            dVar2.mo21440i(a);
            int readInt7 = a.readInt();
            int readInt8 = a.readInt();
            int readInt9 = a.readInt();
            MVRouteType findByValue = MVRouteType.findByValue(readByte);
            MVViewType findByValue2 = MVViewType.findByValue(readInt9);
            MVMetroRouteType mVMetroRouteType = new MVMetroRouteType();
            mVMetroRouteType.routeType = findByValue;
            mVMetroRouteType.image = readInt7;
            mVMetroRouteType.mo27465k();
            mVMetroRouteType.sortingMethod = null;
            mVMetroRouteType.viewType = findByValue2;
            mVMetroRouteType.clientOverrideTextResourceId = MVClientText.findByValue(readInt8);
            MVMetroAreaData mVMetroAreaData6 = aVar.f19326a;
            if (mVMetroAreaData6.routeTypes == null) {
                mVMetroAreaData6.routeTypes = new ArrayList();
            }
            mVMetroAreaData6.routeTypes.add(mVMetroRouteType);
        }
        int readInt10 = a.readInt();
        aVar.f19326a.agencies = new ArrayList(readInt10);
        for (int i5 = 0; i5 < readInt10; i5++) {
            int readInt11 = a.readInt();
            String j7 = dVar2.mo21441j(a, a.readInt());
            byte readByte2 = a.readByte();
            int readInt12 = a.readInt();
            MVRouteType findByValue3 = MVRouteType.findByValue(readByte2);
            MVAgency mVAgency = new MVAgency();
            mVAgency.agencyId = readInt11;
            mVAgency.mo27306k();
            mVAgency.agencyName = j7;
            mVAgency.routeType = findByValue3;
            mVAgency.presentationLineTemplates = null;
            if (readInt12 != -1) {
                mVAgency.image = readInt12;
                mVAgency.mo27307l();
            }
            MVMetroAreaData mVMetroAreaData7 = aVar.f19326a;
            if (mVMetroAreaData7.agencies == null) {
                mVMetroAreaData7.agencies = new ArrayList();
            }
            mVMetroAreaData7.agencies.add(mVAgency);
            int readInt13 = a.readInt();
            List<MVAgency> list = aVar.f19326a.agencies;
            if (list == null) {
                i2 = 0;
            } else {
                i2 = list.size();
            }
            list.get(i2 - 1).presentationLineTemplates = new ArrayList(readInt13);
            for (int i6 = 0; i6 < readInt13; i6++) {
                int readInt14 = a.readInt();
                int readInt15 = a.readInt();
                int readInt16 = a.readInt();
                MVPresentationType findByValue4 = MVPresentationType.findByValue(readInt14);
                MVPresentationLineTemplate mVPresentationLineTemplate = new MVPresentationLineTemplate();
                mVPresentationLineTemplate.presentationType = findByValue4;
                mVPresentationLineTemplate.imageIndex = (byte) readInt16;
                mVPresentationLineTemplate.mo30763i();
                mVPresentationLineTemplate.lineTemplateId = readInt15;
                mVPresentationLineTemplate.mo30764j();
                List<MVAgency> list2 = aVar.f19326a.agencies;
                if (list2 == null) {
                    i3 = 0;
                } else {
                    i3 = list2.size();
                }
                MVAgency mVAgency2 = list2.get(i3 - 1);
                if (mVAgency2.presentationLineTemplates == null) {
                    mVAgency2.presentationLineTemplates = new ArrayList();
                }
                mVAgency2.presentationLineTemplates.add(mVPresentationLineTemplate);
            }
        }
        int readInt17 = a.readInt();
        aVar.f19326a.templates = new ArrayList(readInt17);
        for (int i7 = 0; i7 < readInt17; i7++) {
            int readInt18 = a.readInt();
            dVar2.mo21441j(a, a.readInt());
            int readInt19 = a.readInt();
            int readInt20 = a.readInt();
            int readInt21 = a.readInt();
            int readInt22 = a.readInt();
            int readInt23 = a.readInt();
            int readInt24 = a.readInt();
            int readInt25 = a.readInt();
            int readInt26 = a.readInt();
            int readInt27 = a.readInt();
            int readInt28 = a.readInt();
            boolean readBoolean = a.readBoolean();
            int readInt29 = a.readInt();
            MVTokenConditional mVTokenConditional = new MVTokenConditional(new MVConditional(MVLineTemplateToken.findByValue(readInt19), (byte) readInt20), MVLineTemplateToken.findByValue(readInt21), MVLineTemplateToken.findByValue(readInt22));
            MVConditional mVConditional = new MVConditional(MVLineTemplateToken.findByValue(readInt23), (byte) readInt24);
            MVTokenConditional mVTokenConditional2 = new MVTokenConditional(new MVConditional(MVLineTemplateToken.findByValue(readInt25), (byte) readInt26), MVLineTemplateToken.findByValue(readInt27), MVLineTemplateToken.findByValue(readInt28));
            MVDelimiterToken findByValue5 = MVDelimiterToken.findByValue(readInt29);
            MVLineTemplate mVLineTemplate = new MVLineTemplate();
            mVLineTemplate.lineTemplateId = readInt18;
            mVLineTemplate.mo30753o();
            mVLineTemplate.titleConditional = mVTokenConditional;
            mVLineTemplate.imageConditional = mVConditional;
            mVLineTemplate.imageTextConditional = mVTokenConditional2;
            mVLineTemplate.agencyImageShown = readBoolean;
            mVLineTemplate.mo30752m();
            mVLineTemplate.delimiterToken = findByValue5;
            mVLineTemplate.detailsList = null;
            MVMetroAreaData mVMetroAreaData8 = aVar.f19326a;
            if (mVMetroAreaData8.templates == null) {
                mVMetroAreaData8.templates = new ArrayList();
            }
            mVMetroAreaData8.templates.add(mVLineTemplate);
            int readInt30 = a.readInt();
            int[] iArr = new int[readInt30];
            for (int i8 = 0; i8 < readInt30; i8++) {
                iArr[i8] = a.readInt();
            }
            List<MVLineTemplate> list3 = aVar.f19326a.templates;
            if (list3 == null) {
                i = 0;
            } else {
                i = list3.size();
            }
            MVLineTemplate mVLineTemplate2 = list3.get(i - 1);
            mVLineTemplate2.detailsList = new ArrayList(readInt30);
            for (int i9 = 0; i9 < readInt30; i9++) {
                MVLineTemplateToken findByValue6 = MVLineTemplateToken.findByValue(iArr[i9]);
                if (mVLineTemplate2.detailsList == null) {
                    mVLineTemplate2.detailsList = new ArrayList();
                }
                mVLineTemplate2.detailsList.add(findByValue6);
            }
        }
        int readInt31 = a.readInt();
        aVar.f19326a.bicycleProviders = new ArrayList(readInt31);
        for (int i11 = 0; i11 < readInt31; i11++) {
            int readInt32 = a.readInt();
            String j8 = dVar2.mo21441j(a, a.readInt());
            int readInt33 = a.readInt();
            int readInt34 = a.readInt();
            boolean readBoolean2 = a.readBoolean();
            int readInt35 = a.readInt();
            MVBicycleProvider mVBicycleProvider = new MVBicycleProvider();
            mVBicycleProvider.providerId = readInt32;
            mVBicycleProvider.mo27321o();
            mVBicycleProvider.name = j8;
            mVBicycleProvider.primaryColor = readInt33;
            mVBicycleProvider.mo27320m();
            mVBicycleProvider.secondaryColor = readInt34;
            mVBicycleProvider.mo27323q();
            mVBicycleProvider.isRealTimeDataSupported = readBoolean2;
            mVBicycleProvider.mo27319l();
            if (readInt35 != 0) {
                mVBicycleProvider.providerImage = readInt35;
                mVBicycleProvider.mo27322p();
            }
            MVMetroAreaData mVMetroAreaData9 = aVar.f19326a;
            if (mVMetroAreaData9.bicycleProviders == null) {
                mVMetroAreaData9.bicycleProviders = new ArrayList();
            }
            mVMetroAreaData9.bicycleProviders.add(mVBicycleProvider);
        }
        int readInt36 = a.readInt();
        aVar.f19326a.linesUserReportCategoryIds = new ArrayList(readInt36);
        for (int i12 = 0; i12 < readInt36; i12++) {
            int readInt37 = a.readInt();
            MVMetroAreaData mVMetroAreaData10 = aVar.f19326a;
            MVUserReportLineCategoryType findByValue7 = MVUserReportLineCategoryType.findByValue(readInt37);
            if (mVMetroAreaData10.linesUserReportCategoryIds == null) {
                mVMetroAreaData10.linesUserReportCategoryIds = new ArrayList();
            }
            mVMetroAreaData10.linesUserReportCategoryIds.add(findByValue7);
        }
        int readInt38 = a.readInt();
        aVar.f19326a.stopsUserReportCategoryIds = new ArrayList(readInt38);
        for (int i13 = 0; i13 < readInt38; i13++) {
            int readInt39 = a.readInt();
            MVMetroAreaData mVMetroAreaData11 = aVar.f19326a;
            MVUserReportStopCategoryType findByValue8 = MVUserReportStopCategoryType.findByValue(readInt39);
            if (mVMetroAreaData11.stopsUserReportCategoryIds == null) {
                mVMetroAreaData11.stopsUserReportCategoryIds = new ArrayList();
            }
            mVMetroAreaData11.stopsUserReportCategoryIds.add(findByValue8);
        }
        a.close();
        C4776h a2 = C7841a.m17863a(aVar.f19326a);
        if (!serverId.equals(a2.f16126a) || j != a2.f16127b) {
            throw new AppDataPartLoadFailedException("Metro id and/or revision mismatch!", (String) null, (Throwable) null);
        }
        C19731i a3 = C19731i.m47197a(context);
        a3.getClass();
        ((C19824g) a3.mo52084b(a2.f16126a, a2.f16127b).mo51794a(C19824g.class)).mo52129h(context, a2);
    }
}
