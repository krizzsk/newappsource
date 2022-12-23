package q20;

import android.net.Uri;
import com.moovit.commons.utils.AppDeepLink;
import com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleProviderMetaData;
import p20.C18879f;
import p977zz.C20964s0;

/* renamed from: q20.c */
public final class C19077c extends C18879f<C19077c, C19075a<?>> {
    /* renamed from: g */
    public static AppDeepLink m46197g(MVDocklessVehicleProviderMetaData mVDocklessVehicleProviderMetaData) {
        String str = mVDocklessVehicleProviderMetaData.androidDeepLink;
        Uri uri = null;
        if (C20964s0.m49090h(str)) {
            return null;
        }
        if (mVDocklessVehicleProviderMetaData.mo28303g()) {
            uri = Uri.parse(mVDocklessVehicleProviderMetaData.androidDefaultDeepLink);
        }
        return new AppDeepLink(str, uri);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.util.ArrayList<O>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.util.ArrayList<O>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.util.ArrayList<O>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.util.ArrayList<O>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.util.ArrayList<O>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.util.ArrayList<O>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.util.ArrayList<O>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: java.util.ArrayList<O>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: java.util.ArrayList<O>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: java.util.ArrayList<O>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: java.util.ArrayList<O>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: java.util.ArrayList<O>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: java.util.ArrayList<O>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: java.util.ArrayList<O>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: java.util.ArrayList<O>} */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r8v10, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r8v13, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r8v16, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r8v19, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r12v11, types: [com.moovit.image.model.Image] */
    /* JADX WARNING: type inference failed for: r8v22, types: [com.moovit.image.model.Image] */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04b0, code lost:
        if (r3 != false) goto L_0x04b4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01e6  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q20.C19075a mo44755f(com.moovit.commons.geo.LatLonE6 r26, com.moovit.image.model.ImageRefWithPartialParams r27, com.moovit.image.model.ImageRefWithPartialParams r28, com.tranzmate.moovit.protocol.mapitems.MVCategory r29, com.tranzmate.moovit.protocol.mapitems.MVCategoryItem r30) {
        /*
            r25 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData r3 = r2.categoryMetaData
            r4 = r30
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData r4 = r4.itemMetaData
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x001d
            F r7 = r4.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r8 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.COMMERCIAL_META_DATA
            if (r7 != r8) goto L_0x0018
            r7 = 1
            goto L_0x0019
        L_0x0018:
            r7 = 0
        L_0x0019:
            if (r7 == 0) goto L_0x001d
            r7 = 1
            goto L_0x001e
        L_0x001d:
            r7 = 0
        L_0x001e:
            r8 = 0
            if (r7 == 0) goto L_0x006f
            java.lang.String[] r2 = new java.lang.String[r6]
            com.moovit.image.model.Image r11 = r0.mo48235p(r2)
            if (r1 == 0) goto L_0x002f
            java.lang.String[] r0 = new java.lang.String[r6]
            com.moovit.image.model.Image r8 = r1.mo48235p(r0)
        L_0x002f:
            r12 = r8
            F r0 = r4.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r1 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.COMMERCIAL_META_DATA
            if (r0 != r1) goto L_0x0052
            java.lang.Object r0 = r4.value_
            com.tranzmate.moovit.protocol.mapitems.MVCommercialMetaData r0 = (com.tranzmate.moovit.protocol.mapitems.MVCommercialMetaData) r0
            int r0 = r0.commercialId
            com.moovit.network.model.ServerId r1 = new com.moovit.network.model.ServerId
            r1.<init>(r0)
            com.moovit.map.collections.category.types.CommercialMetadata r14 = new com.moovit.map.collections.category.types.CommercialMetadata
            r14.<init>(r1)
            q20.a r8 = new q20.a
            java.lang.Class<com.moovit.map.collections.category.types.CommercialMetadata> r13 = com.moovit.map.collections.category.types.CommercialMetadata.class
            r9 = r8
            r10 = r26
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0575
        L_0x0052:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot get field 'commercialMetaData' because union is currently set to "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            F r2 = r4.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r2 = (com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields) r2
            vi0.c r2 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData.m22229m(r2)
            java.lang.String r2 = r2.f63355a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x006f:
            if (r3 == 0) goto L_0x008b
            F r7 = r3.setField_
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r9 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields.BASIC_PROVIDER_META_DATA
            if (r7 != r9) goto L_0x0079
            r7 = 1
            goto L_0x007a
        L_0x0079:
            r7 = 0
        L_0x007a:
            if (r7 == 0) goto L_0x008b
            if (r4 == 0) goto L_0x008b
            F r7 = r4.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r9 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.BIKE_STATION_META_DATA
            if (r7 != r9) goto L_0x0086
            r7 = 1
            goto L_0x0087
        L_0x0086:
            r7 = 0
        L_0x0087:
            if (r7 == 0) goto L_0x008b
            r7 = 1
            goto L_0x008c
        L_0x008b:
            r7 = 0
        L_0x008c:
            r9 = -1
            if (r7 == 0) goto L_0x013e
            com.tranzmate.moovit.protocol.mapitems.MVBikeStationMetaData r3 = r4.mo28323k()
            boolean r3 = r3.showStationDetails
            if (r3 == 0) goto L_0x009f
            com.tranzmate.moovit.protocol.mapitems.MVBikeStationMetaData r3 = r4.mo28323k()
            int r3 = r3.availableBikes
            r14 = r3
            goto L_0x00a1
        L_0x009f:
            r3 = -1
            r14 = -1
        L_0x00a1:
            if (r14 == r9) goto L_0x00b6
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r7[r6] = r9
            java.lang.String r9 = "%d"
            java.lang.String r3 = java.lang.String.format(r3, r9, r7)
            goto L_0x00b8
        L_0x00b6:
            java.lang.String r3 = ""
        L_0x00b8:
            java.lang.String[] r5 = new java.lang.String[r5]
            r5[r6] = r3
            com.moovit.image.model.Image r12 = r0.mo48235p(r5)
            if (r1 == 0) goto L_0x00ca
            java.lang.String[] r0 = new java.lang.String[r6]
            com.moovit.image.model.Image r0 = r1.mo48235p(r0)
            r13 = r0
            goto L_0x00cb
        L_0x00ca:
            r13 = r8
        L_0x00cb:
            com.tranzmate.moovit.protocol.mapitems.MVBikeStationMetaData r0 = r4.mo28323k()
            int r1 = r0.availableBikes
            int r3 = r0.freeDocks
            com.moovit.transit.LocationDescriptor r4 = com.moovit.transit.LocationDescriptor.m17770k(r26)
            java.lang.String r5 = r0.name
            r4.f23651f = r5
            long r5 = r0.lastUpdate
            java.lang.String r7 = r2.name
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData r2 = r2.categoryMetaData
            F r9 = r2.setField_
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r10 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields.BASIC_PROVIDER_META_DATA
            if (r9 != r10) goto L_0x0121
            java.lang.Object r2 = r2.value_
            com.tranzmate.moovit.protocol.mapitems.MVBikeProviderMetaData r2 = (com.tranzmate.moovit.protocol.mapitems.MVBikeProviderMetaData) r2
            int r2 = r2.serviceImageId
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.moovit.image.model.Image r22 = com.moovit.image.C16028g.m40823a(r2)
            boolean r2 = r0.mo28146g()
            if (r2 == 0) goto L_0x00fd
            java.lang.String r8 = r0.drivingRate
        L_0x00fd:
            r23 = r8
            boolean r0 = r0.showStationDetails
            com.moovit.map.collections.category.types.BicycleStationMetadata r2 = new com.moovit.map.collections.category.types.BicycleStationMetadata
            r15 = r2
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r21 = r7
            r24 = r0
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24)
            q20.a r8 = new q20.a
            java.lang.Class<com.moovit.map.collections.category.types.BicycleStationMetadata> r15 = com.moovit.map.collections.category.types.BicycleStationMetadata.class
            r10 = r8
            r11 = r26
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x0575
        L_0x0121:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot get field 'basicProviderMetaData' because union is currently set to "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            F r2 = r2.setField_
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r2 = (com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields) r2
            vi0.c r2 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData.m22078l(r2)
            java.lang.String r2 = r2.f63355a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x013e:
            if (r3 == 0) goto L_0x0171
            F r7 = r3.setField_
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r9 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields.DOCKLESS_VEHICLE_META_DATA
            if (r7 != r9) goto L_0x0148
            r7 = 1
            goto L_0x0149
        L_0x0148:
            r7 = 0
        L_0x0149:
            if (r7 == 0) goto L_0x0171
            if (r4 == 0) goto L_0x0171
            F r7 = r4.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r9 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.DOCKLESS_VEHICLE
            if (r7 != r9) goto L_0x0155
            r7 = 1
            goto L_0x0156
        L_0x0155:
            r7 = 0
        L_0x0156:
            if (r7 != 0) goto L_0x0159
            goto L_0x0171
        L_0x0159:
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicle r7 = r4.mo28324l()
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r7 = r7.type
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r9 = com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType.BIKE
            boolean r9 = r9.equals(r7)
            if (r9 != 0) goto L_0x016f
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r9 = com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType.ELECTRIC_BIKE
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x0171
        L_0x016f:
            r7 = 1
            goto L_0x0172
        L_0x0171:
            r7 = 0
        L_0x0172:
            r9 = 100
            if (r7 == 0) goto L_0x01e6
            java.lang.String[] r3 = new java.lang.String[r6]
            com.moovit.image.model.Image r12 = r0.mo48235p(r3)
            if (r1 == 0) goto L_0x0186
            java.lang.String[] r0 = new java.lang.String[r6]
            com.moovit.image.model.Image r0 = r1.mo48235p(r0)
            r13 = r0
            goto L_0x0187
        L_0x0186:
            r13 = r8
        L_0x0187:
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData r0 = r2.categoryMetaData
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleProviderMetaData r0 = r0.mo28210k()
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicle r1 = r4.mo28324l()
            java.lang.String r15 = r0.providerName
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r2 = r0.image
            com.moovit.image.model.Image r16 = com.moovit.image.C16028g.m40829g(r2)
            com.moovit.commons.utils.AppDeepLink r18 = m46197g(r0)
            java.lang.String r0 = r1.vehicleName
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r2 = com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType.ELECTRIC_BIKE
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r3 = r1.type
            boolean r19 = r2.equals(r3)
            boolean r2 = r1.mo28290f()
            if (r2 == 0) goto L_0x01b6
            int r2 = r1.batteryLevel
            int r2 = p977zz.C20936e0.m49036b(r6, r9, r2)
            r20 = r2
            goto L_0x01b9
        L_0x01b6:
            r2 = -1
            r20 = -1
        L_0x01b9:
            boolean r2 = r1.mo28292h()
            if (r2 == 0) goto L_0x01c4
            int r2 = r1.numOfHelmets
            r21 = r2
            goto L_0x01c7
        L_0x01c4:
            r2 = -1
            r21 = -1
        L_0x01c7:
            boolean r2 = r1.mo28291g()
            if (r2 == 0) goto L_0x01cf
            java.lang.String r8 = r1.drivingRate
        L_0x01cf:
            r22 = r8
            com.moovit.map.collections.category.types.DocklessBicycleMetadata r1 = new com.moovit.map.collections.category.types.DocklessBicycleMetadata
            r14 = r1
            r17 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            q20.a r8 = new q20.a
            java.lang.Class<com.moovit.map.collections.category.types.DocklessBicycleMetadata> r14 = com.moovit.map.collections.category.types.DocklessBicycleMetadata.class
            r10 = r8
            r11 = r26
            r15 = r1
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0575
        L_0x01e6:
            if (r3 == 0) goto L_0x0219
            F r7 = r3.setField_
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r10 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields.DOCKLESS_VEHICLE_META_DATA
            if (r7 != r10) goto L_0x01f0
            r7 = 1
            goto L_0x01f1
        L_0x01f0:
            r7 = 0
        L_0x01f1:
            if (r7 == 0) goto L_0x0219
            if (r4 == 0) goto L_0x0219
            F r7 = r4.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r10 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.DOCKLESS_VEHICLE
            if (r7 != r10) goto L_0x01fd
            r7 = 1
            goto L_0x01fe
        L_0x01fd:
            r7 = 0
        L_0x01fe:
            if (r7 != 0) goto L_0x0201
            goto L_0x0219
        L_0x0201:
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicle r7 = r4.mo28324l()
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r7 = r7.type
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r10 = com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType.KICK_SCOOTER
            boolean r10 = r10.equals(r7)
            if (r10 != 0) goto L_0x0217
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r10 = com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType.ELECTRIC_SCOOTER
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x0219
        L_0x0217:
            r7 = 1
            goto L_0x021a
        L_0x0219:
            r7 = 0
        L_0x021a:
            if (r7 == 0) goto L_0x028c
            java.lang.String[] r3 = new java.lang.String[r6]
            com.moovit.image.model.Image r12 = r0.mo48235p(r3)
            if (r1 == 0) goto L_0x022c
            java.lang.String[] r0 = new java.lang.String[r6]
            com.moovit.image.model.Image r0 = r1.mo48235p(r0)
            r13 = r0
            goto L_0x022d
        L_0x022c:
            r13 = r8
        L_0x022d:
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData r0 = r2.categoryMetaData
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleProviderMetaData r0 = r0.mo28210k()
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicle r1 = r4.mo28324l()
            java.lang.String r15 = r0.providerName
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r2 = r0.image
            com.moovit.image.model.Image r16 = com.moovit.image.C16028g.m40829g(r2)
            com.moovit.commons.utils.AppDeepLink r18 = m46197g(r0)
            java.lang.String r0 = r1.vehicleName
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r2 = com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType.ELECTRIC_SCOOTER
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r3 = r1.type
            boolean r19 = r2.equals(r3)
            boolean r2 = r1.mo28290f()
            if (r2 == 0) goto L_0x025c
            int r2 = r1.batteryLevel
            int r2 = p977zz.C20936e0.m49036b(r6, r9, r2)
            r20 = r2
            goto L_0x025f
        L_0x025c:
            r2 = -1
            r20 = -1
        L_0x025f:
            boolean r2 = r1.mo28292h()
            if (r2 == 0) goto L_0x026a
            int r2 = r1.numOfHelmets
            r21 = r2
            goto L_0x026d
        L_0x026a:
            r2 = -1
            r21 = -1
        L_0x026d:
            boolean r2 = r1.mo28291g()
            if (r2 == 0) goto L_0x0275
            java.lang.String r8 = r1.drivingRate
        L_0x0275:
            r22 = r8
            com.moovit.map.collections.category.types.DocklessScooterMetadata r1 = new com.moovit.map.collections.category.types.DocklessScooterMetadata
            r14 = r1
            r17 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            q20.a r8 = new q20.a
            java.lang.Class<com.moovit.map.collections.category.types.DocklessScooterMetadata> r14 = com.moovit.map.collections.category.types.DocklessScooterMetadata.class
            r10 = r8
            r11 = r26
            r15 = r1
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0575
        L_0x028c:
            if (r3 == 0) goto L_0x02b4
            F r7 = r3.setField_
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r10 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields.DOCKLESS_VEHICLE_META_DATA
            if (r7 != r10) goto L_0x0296
            r7 = 1
            goto L_0x0297
        L_0x0296:
            r7 = 0
        L_0x0297:
            if (r7 == 0) goto L_0x02b4
            if (r4 == 0) goto L_0x02b4
            F r7 = r4.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r10 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.DOCKLESS_VEHICLE
            if (r7 != r10) goto L_0x02a3
            r7 = 1
            goto L_0x02a4
        L_0x02a3:
            r7 = 0
        L_0x02a4:
            if (r7 != 0) goto L_0x02a7
            goto L_0x02b4
        L_0x02a7:
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicle r7 = r4.mo28324l()
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r7 = r7.type
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType r10 = com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleType.MOPED
            boolean r7 = r10.equals(r7)
            goto L_0x02b5
        L_0x02b4:
            r7 = 0
        L_0x02b5:
            if (r7 == 0) goto L_0x0321
            java.lang.String[] r3 = new java.lang.String[r6]
            com.moovit.image.model.Image r12 = r0.mo48235p(r3)
            if (r1 == 0) goto L_0x02c7
            java.lang.String[] r0 = new java.lang.String[r6]
            com.moovit.image.model.Image r0 = r1.mo48235p(r0)
            r13 = r0
            goto L_0x02c8
        L_0x02c7:
            r13 = r8
        L_0x02c8:
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData r0 = r2.categoryMetaData
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleProviderMetaData r0 = r0.mo28210k()
            com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicle r1 = r4.mo28324l()
            java.lang.String r15 = r0.providerName
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r2 = r0.image
            com.moovit.image.model.Image r16 = com.moovit.image.C16028g.m40829g(r2)
            com.moovit.commons.utils.AppDeepLink r18 = m46197g(r0)
            java.lang.String r0 = r1.vehicleName
            boolean r2 = r1.mo28290f()
            if (r2 == 0) goto L_0x02ef
            int r2 = r1.batteryLevel
            int r2 = p977zz.C20936e0.m49036b(r6, r9, r2)
            r20 = r2
            goto L_0x02f2
        L_0x02ef:
            r2 = -1
            r20 = -1
        L_0x02f2:
            boolean r2 = r1.mo28292h()
            if (r2 == 0) goto L_0x02fd
            int r2 = r1.numOfHelmets
            r21 = r2
            goto L_0x0300
        L_0x02fd:
            r2 = -1
            r21 = -1
        L_0x0300:
            boolean r2 = r1.mo28291g()
            if (r2 == 0) goto L_0x0308
            java.lang.String r8 = r1.drivingRate
        L_0x0308:
            r22 = r8
            com.moovit.map.collections.category.types.DocklessMopedMetadata r1 = new com.moovit.map.collections.category.types.DocklessMopedMetadata
            r19 = 1
            r14 = r1
            r17 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            q20.a r8 = new q20.a
            java.lang.Class<com.moovit.map.collections.category.types.DocklessMopedMetadata> r14 = com.moovit.map.collections.category.types.DocklessMopedMetadata.class
            r10 = r8
            r11 = r26
            r15 = r1
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0575
        L_0x0321:
            if (r3 == 0) goto L_0x033d
            F r7 = r3.setField_
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r10 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields.DOCKLESS_CAR_META_DATA
            if (r7 != r10) goto L_0x032b
            r7 = 1
            goto L_0x032c
        L_0x032b:
            r7 = 0
        L_0x032c:
            if (r7 == 0) goto L_0x033d
            if (r4 == 0) goto L_0x033d
            F r7 = r4.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r10 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.DOCKLESS_CAR
            if (r7 != r10) goto L_0x0338
            r7 = 1
            goto L_0x0339
        L_0x0338:
            r7 = 0
        L_0x0339:
            if (r7 == 0) goto L_0x033d
            r7 = 1
            goto L_0x033e
        L_0x033d:
            r7 = 0
        L_0x033e:
            if (r7 == 0) goto L_0x0435
            java.lang.String[] r3 = new java.lang.String[r6]
            com.moovit.image.model.Image r12 = r0.mo48235p(r3)
            if (r1 == 0) goto L_0x0350
            java.lang.String[] r0 = new java.lang.String[r6]
            com.moovit.image.model.Image r0 = r1.mo48235p(r0)
            r13 = r0
            goto L_0x0351
        L_0x0350:
            r13 = r8
        L_0x0351:
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData r0 = r2.categoryMetaData
            F r1 = r0.setField_
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r2 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields.DOCKLESS_CAR_META_DATA
            if (r1 != r2) goto L_0x0418
            java.lang.Object r0 = r0.value_
            com.tranzmate.moovit.protocol.mapitems.MVDocklessCarMetaData r0 = (com.tranzmate.moovit.protocol.mapitems.MVDocklessCarMetaData) r0
            F r1 = r4.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r2 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.DOCKLESS_CAR
            if (r1 != r2) goto L_0x03fb
            java.lang.Object r1 = r4.value_
            com.tranzmate.moovit.protocol.mapitems.MVDocklessCar r1 = (com.tranzmate.moovit.protocol.mapitems.MVDocklessCar) r1
            java.lang.String r15 = r0.providerName
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r2 = r0.image
            com.moovit.image.model.Image r16 = com.moovit.image.C16028g.m40829g(r2)
            java.lang.String r0 = r0.androidDeepLink
            boolean r2 = p977zz.C20964s0.m49090h(r0)
            if (r2 == 0) goto L_0x037a
            r18 = r8
            goto L_0x0381
        L_0x037a:
            com.moovit.commons.utils.AppDeepLink r2 = new com.moovit.commons.utils.AppDeepLink
            r2.<init>(r0, r8)
            r18 = r2
        L_0x0381:
            java.lang.String r0 = r1.name
            boolean r2 = r1.mo28268h()
            if (r2 == 0) goto L_0x0393
            boolean r2 = r1.mo28266f()
            if (r2 == 0) goto L_0x0393
            r2 = 2
            r19 = 2
            goto L_0x03aa
        L_0x0393:
            boolean r2 = r1.mo28268h()
            if (r2 == 0) goto L_0x039d
            r2 = 1
            r19 = 1
            goto L_0x03aa
        L_0x039d:
            boolean r2 = r1.mo28266f()
            if (r2 == 0) goto L_0x03a7
            r2 = 3
            r19 = 3
            goto L_0x03aa
        L_0x03a7:
            r2 = 0
            r19 = 0
        L_0x03aa:
            boolean r2 = r1.mo28266f()
            if (r2 == 0) goto L_0x03b9
            int r2 = r1.batteryLevel
            int r2 = p977zz.C20936e0.m49036b(r6, r9, r2)
            r20 = r2
            goto L_0x03bc
        L_0x03b9:
            r2 = -1
            r20 = -1
        L_0x03bc:
            boolean r2 = r1.mo28268h()
            if (r2 == 0) goto L_0x03cb
            int r2 = r1.fuelLevel
            int r2 = p977zz.C20936e0.m49036b(r6, r9, r2)
            r21 = r2
            goto L_0x03ce
        L_0x03cb:
            r2 = -1
            r21 = -1
        L_0x03ce:
            boolean r2 = r1.mo28272k()
            if (r2 == 0) goto L_0x03d9
            int r2 = r1.numOfSeats
            r22 = r2
            goto L_0x03dc
        L_0x03d9:
            r2 = -1
            r22 = -1
        L_0x03dc:
            boolean r2 = r1.mo28267g()
            if (r2 == 0) goto L_0x03e4
            java.lang.String r8 = r1.drivingRate
        L_0x03e4:
            r23 = r8
            com.moovit.map.collections.category.types.DocklessCarMetadata r1 = new com.moovit.map.collections.category.types.DocklessCarMetadata
            r14 = r1
            r17 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            q20.a r8 = new q20.a
            java.lang.Class<com.moovit.map.collections.category.types.DocklessCarMetadata> r14 = com.moovit.map.collections.category.types.DocklessCarMetadata.class
            r10 = r8
            r11 = r26
            r15 = r1
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0575
        L_0x03fb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot get field 'docklessCar' because union is currently set to "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            F r2 = r4.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r2 = (com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields) r2
            vi0.c r2 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData.m22229m(r2)
            java.lang.String r2 = r2.f63355a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0418:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot get field 'docklessCarMetaData' because union is currently set to "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            F r0 = r0.setField_
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r0 = (com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields) r0
            vi0.c r0 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData.m22078l(r0)
            java.lang.String r0 = r0.f63355a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0435:
            if (r4 == 0) goto L_0x0444
            F r7 = r4.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r9 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.CAR_META_DATA
            if (r7 != r9) goto L_0x043f
            r7 = 1
            goto L_0x0440
        L_0x043f:
            r7 = 0
        L_0x0440:
            if (r7 == 0) goto L_0x0444
            r7 = 1
            goto L_0x0445
        L_0x0444:
            r7 = 0
        L_0x0445:
            if (r7 == 0) goto L_0x0498
            java.lang.String[] r3 = new java.lang.String[r6]
            com.moovit.image.model.Image r11 = r0.mo48235p(r3)
            if (r1 == 0) goto L_0x0457
            java.lang.String[] r0 = new java.lang.String[r6]
            com.moovit.image.model.Image r0 = r1.mo48235p(r0)
            r12 = r0
            goto L_0x0458
        L_0x0457:
            r12 = r8
        L_0x0458:
            F r0 = r4.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r1 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.CAR_META_DATA
            if (r0 != r1) goto L_0x047b
            java.lang.Object r0 = r4.value_
            com.tranzmate.moovit.protocol.mapitems.MVCarMetaData r0 = (com.tranzmate.moovit.protocol.mapitems.MVCarMetaData) r0
            com.moovit.transit.LocationDescriptor r1 = com.moovit.transit.LocationDescriptor.m17770k(r26)
            java.lang.String r2 = r2.name
            java.lang.String r0 = r0.f26213id
            com.moovit.map.collections.category.types.CarSharingMetadata r14 = new com.moovit.map.collections.category.types.CarSharingMetadata
            r14.<init>(r0, r1, r2, r8)
            q20.a r8 = new q20.a
            java.lang.Class<com.moovit.map.collections.category.types.CarSharingMetadata> r13 = com.moovit.map.collections.category.types.CarSharingMetadata.class
            r9 = r8
            r10 = r26
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0575
        L_0x047b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot get field 'carMetaData' because union is currently set to "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            F r2 = r4.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r2 = (com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields) r2
            vi0.c r2 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData.m22229m(r2)
            java.lang.String r2 = r2.f63355a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0498:
            if (r3 == 0) goto L_0x04b3
            F r3 = r3.setField_
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r7 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields.MICRO_MOBILITY_META_DATA
            if (r3 != r7) goto L_0x04a2
            r3 = 1
            goto L_0x04a3
        L_0x04a2:
            r3 = 0
        L_0x04a3:
            if (r3 == 0) goto L_0x04b3
            if (r4 == 0) goto L_0x04b3
            F r3 = r4.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r7 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.MICRO_MOBILITY_ITEM
            if (r3 != r7) goto L_0x04af
            r3 = 1
            goto L_0x04b0
        L_0x04af:
            r3 = 0
        L_0x04b0:
            if (r3 == 0) goto L_0x04b3
            goto L_0x04b4
        L_0x04b3:
            r5 = 0
        L_0x04b4:
            if (r5 == 0) goto L_0x0575
            F r3 = r4.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r5 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.MICRO_MOBILITY_ITEM
            if (r3 != r5) goto L_0x0558
            java.lang.Object r3 = r4.value_
            com.tranzmate.moovit.protocol.mapitems.MVMicroMobilityItem r3 = (com.tranzmate.moovit.protocol.mapitems.MVMicroMobilityItem) r3
            boolean r4 = r3.mo28353g()
            if (r4 == 0) goto L_0x04c9
            java.util.List<java.lang.String> r4 = r3.imageAdditonalParam
            goto L_0x04ca
        L_0x04c9:
            r4 = r8
        L_0x04ca:
            boolean r5 = c00.C13717b.m34258e(r4)
            if (r5 == 0) goto L_0x04d7
            java.lang.String[] r4 = new java.lang.String[r6]
            com.moovit.image.model.Image r0 = r0.mo48235p(r4)
            goto L_0x04e7
        L_0x04d7:
            int r5 = r4.size()
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r4 = r4.toArray(r5)
            java.lang.String[] r4 = (java.lang.String[]) r4
            com.moovit.image.model.Image r0 = r0.mo48235p(r4)
        L_0x04e7:
            r11 = r0
            if (r1 == 0) goto L_0x04f2
            java.lang.String[] r0 = new java.lang.String[r6]
            com.moovit.image.model.Image r0 = r1.mo48235p(r0)
            r12 = r0
            goto L_0x04f3
        L_0x04f2:
            r12 = r8
        L_0x04f3:
            java.lang.String r14 = r2.f26234id
            java.lang.String r15 = r3.itemId
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData r0 = r2.categoryMetaData
            F r1 = r0.setField_
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r2 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields.MICRO_MOBILITY_META_DATA
            if (r1 != r2) goto L_0x053b
            java.lang.Object r0 = r0.value_
            com.tranzmate.moovit.protocol.mapitems.MVMicroMobilityMetaData r0 = (com.tranzmate.moovit.protocol.mapitems.MVMicroMobilityMetaData) r0
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r0 = r0.providerPreviewImage
            com.moovit.image.model.Image r16 = com.moovit.image.C16028g.m40829g(r0)
            java.lang.String r0 = r3.title
            java.lang.String r1 = r3.subtitle
            boolean r2 = r3.mo28352f()
            if (r2 == 0) goto L_0x0523
            java.util.List<com.tranzmate.moovit.protocol.common.MVAccessory> r2 = r3.accessoryInfo
            lr.i r3 = new lr.i
            r4 = 15
            r3.<init>(r4)
            java.util.ArrayList r8 = c00.C13720d.m34273c(r2, r8, r3)
            c00.C13717b.m34261h(r8)
        L_0x0523:
            r19 = r8
            com.moovit.micromobility.MicroMobilityMetaData r2 = new com.moovit.micromobility.MicroMobilityMetaData
            r13 = r2
            r17 = r0
            r18 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            q20.a r8 = new q20.a
            java.lang.Class<com.moovit.micromobility.MicroMobilityMetaData> r13 = com.moovit.micromobility.MicroMobilityMetaData.class
            r9 = r8
            r10 = r26
            r14 = r2
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0575
        L_0x053b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot get field 'microMobilityMetaData' because union is currently set to "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            F r0 = r0.setField_
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r0 = (com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields) r0
            vi0.c r0 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData.m22078l(r0)
            java.lang.String r0 = r0.f63355a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0558:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot get field 'microMobilityItem' because union is currently set to "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            F r2 = r4.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r2 = (com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields) r2
            vi0.c r2 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData.m22229m(r2)
            java.lang.String r2 = r2.f63355a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0575:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q20.C19077c.mo44755f(com.moovit.commons.geo.LatLonE6, com.moovit.image.model.ImageRefWithPartialParams, com.moovit.image.model.ImageRefWithPartialParams, com.tranzmate.moovit.protocol.mapitems.MVCategory, com.tranzmate.moovit.protocol.mapitems.MVCategoryItem):q20.a");
    }
}
