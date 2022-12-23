package com.moovit.app.ads.mapitem;

import bf0.C21050d;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.model.ImageRef;
import com.moovit.map.collections.category.types.DirectAdMetadata;
import com.tranzmate.moovit.protocol.mapitems.MVCategory;
import com.tranzmate.moovit.protocol.mapitems.MVCategoryItem;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import q20.C19075a;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.app.ads.mapitem.AdMapItemResponse$createMapItem$1", mo58555f = "AdMapItemResponse.kt", mo58556l = {31}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lq20/a;", "Lcom/moovit/map/collections/category/types/DirectAdMetadata;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class AdMapItemResponse$createMapItem$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C19075a<DirectAdMetadata>>, Object> {
    public final /* synthetic */ ImageRef $imageRef;
    public final /* synthetic */ LatLonE6 $location;
    public final /* synthetic */ MVCategory $mvCategory;
    public final /* synthetic */ MVCategoryItem $mvItem;
    public final /* synthetic */ ImageRef $selectedImageRef;
    public Object L$0;
    public int label;
    public final /* synthetic */ C14751a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdMapItemResponse$createMapItem$1(MVCategoryItem mVCategoryItem, C14751a aVar, MVCategory mVCategory, LatLonE6 latLonE6, ImageRef imageRef, ImageRef imageRef2, C23349c<? super AdMapItemResponse$createMapItem$1> cVar) {
        super(2, cVar);
        this.$mvItem = mVCategoryItem;
        this.this$0 = aVar;
        this.$mvCategory = mVCategory;
        this.$location = latLonE6;
        this.$imageRef = imageRef;
        this.$selectedImageRef = imageRef2;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new AdMapItemResponse$createMapItem$1(this.$mvItem, this.this$0, this.$mvCategory, this.$location, this.$imageRef, this.$selectedImageRef, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((AdMapItemResponse$createMapItem$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0174 A[EDGE_INSN: B:106:0x0174->B:82:0x0174 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0179 A[EDGE_INSN: B:97:0x0179->B:85:0x0179 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r13.label
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            java.lang.Object r0 = r13.L$0
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData r0 = (com.tranzmate.moovit.protocol.mapitems.MVItemMetaData) r0
            p584jl.C17885a.m44475z0(r14)
            goto L_0x0040
        L_0x0013:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x001b:
            p584jl.C17885a.m44475z0(r14)
            com.tranzmate.moovit.protocol.mapitems.MVCategoryItem r14 = r13.$mvItem
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData r14 = r14.itemMetaData
            com.moovit.app.ads.MobileAdsManager r1 = com.moovit.app.ads.MobileAdsManager.m37073h()
            java.util.concurrent.ExecutorService r5 = com.moovit.MoovitExecutors.COMPUTATION
            k5.g r6 = new k5.g
            r6.<init>(r1, r3)
            com.google.android.gms.tasks.Task r1 = com.google.android.gms.tasks.Tasks.call(r5, r6)
            if (r1 == 0) goto L_0x0043
            r13.L$0 = r14
            r13.label = r2
            java.lang.Object r1 = com.moovit.commons.async.AsyncExtKt.m40163a(r1, r13)
            if (r1 != r0) goto L_0x003e
            return r0
        L_0x003e:
            r0 = r14
            r14 = r1
        L_0x0040:
            com.moovit.app.useraccount.manager.profile.UserAdsTargetingData r14 = (com.moovit.app.useraccount.manager.profile.UserAdsTargetingData) r14
            goto L_0x0045
        L_0x0043:
            r0 = r14
            r14 = r4
        L_0x0045:
            com.moovit.app.ads.mapitem.a r1 = r13.this$0
            com.tranzmate.moovit.protocol.mapitems.MVCategory r5 = r13.$mvCategory
            r1.getClass()
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData r1 = r5.categoryMetaData
            java.lang.String r5 = "Cannot get field 'directAdMetaData' because union is currently set to "
            if (r1 == 0) goto L_0x007c
            F r6 = r1.setField_
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r7 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields.DIRECT_AD_META_DATA
            if (r6 != r7) goto L_0x0061
            java.lang.Object r1 = r1.value_
            com.tranzmate.moovit.protocol.mapitems.MVDirectAdCategoryMetaData r1 = (com.tranzmate.moovit.protocol.mapitems.MVDirectAdCategoryMetaData) r1
            if (r1 == 0) goto L_0x007c
            com.tranzmate.moovit.protocol.mapitems.MVDirectAdTargeting r1 = r1.targeting
            goto L_0x007d
        L_0x0061:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r5)
            F r1 = r1.setField_
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r1 = (com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields) r1
            vi0.c r1 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData.m22078l(r1)
            java.lang.String r1 = r1.f63355a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L_0x007c:
            r1 = r4
        L_0x007d:
            r6 = 0
            if (r1 != 0) goto L_0x0082
            goto L_0x017a
        L_0x0082:
            if (r14 == 0) goto L_0x0179
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r14 = r14.f40606b
            if (r14 != 0) goto L_0x008a
            goto L_0x0179
        L_0x008a:
            java.util.List<com.tranzmate.moovit.protocol.mapitems.MVDirectAdUserTagExpression> r1 = r1.userTagExpressions
            java.lang.String r7 = "pass$lambda$1"
            mf0.C24362h.m61210e(r1, r7)
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L_0x0099
            goto L_0x017a
        L_0x0099:
            java.util.Iterator r1 = r1.iterator()
        L_0x009d:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x017a
            java.lang.Object r7 = r1.next()
            com.tranzmate.moovit.protocol.mapitems.MVDirectAdUserTagExpression r7 = (com.tranzmate.moovit.protocol.mapitems.MVDirectAdUserTagExpression) r7
            java.lang.String r8 = "expression"
            mf0.C24362h.m61210e(r7, r8)
            java.lang.String r8 = r7.userTagKey
            java.lang.Object r8 = r14.get(r8)
            java.util.List r8 = (java.util.List) r8
            java.util.List<java.lang.String> r9 = r7.userTagValues
            if (r8 == 0) goto L_0x00c3
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r10 = 0
            goto L_0x00c4
        L_0x00c3:
            r10 = 1
        L_0x00c4:
            if (r10 != 0) goto L_0x0176
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x00ce
            goto L_0x0176
        L_0x00ce:
            com.tranzmate.moovit.protocol.mapitems.MVDirectAdOperator r7 = r7.operator
            java.lang.String r10 = "mvExpression.getOperator()"
            mf0.C24362h.m61210e(r7, r10)
            int[] r10 = com.moovit.app.ads.mapitem.C14751a.C14752a.f37558a
            int r11 = r7.ordinal()
            r10 = r10[r11]
            if (r10 == r2) goto L_0x0137
            if (r10 != r3) goto L_0x0120
            boolean r7 = r8 instanceof java.util.Collection
            if (r7 == 0) goto L_0x00ed
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto L_0x00ed
            goto L_0x0174
        L_0x00ed:
            java.util.Iterator r7 = r8.iterator()
        L_0x00f1:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0174
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x0104
            goto L_0x011c
        L_0x0104:
            java.util.Iterator r10 = r9.iterator()
        L_0x0108:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x011c
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = mf0.C24362h.m61206a(r8, r11)
            if (r11 == 0) goto L_0x0108
            r8 = 0
            goto L_0x011d
        L_0x011c:
            r8 = 1
        L_0x011d:
            if (r8 == 0) goto L_0x00f1
            goto L_0x0176
        L_0x0120:
            com.moovit.commons.utils.ApplicationBugException r14 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown operator type: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r14.<init>((java.lang.String) r0)
            throw r14
        L_0x0137:
            boolean r7 = r8 instanceof java.util.Collection
            if (r7 == 0) goto L_0x0142
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto L_0x0142
            goto L_0x0176
        L_0x0142:
            java.util.Iterator r7 = r8.iterator()
        L_0x0146:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0176
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x0159
            goto L_0x0171
        L_0x0159:
            java.util.Iterator r10 = r9.iterator()
        L_0x015d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0171
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = mf0.C24362h.m61206a(r8, r11)
            if (r11 == 0) goto L_0x015d
            r8 = 1
            goto L_0x0172
        L_0x0171:
            r8 = 0
        L_0x0172:
            if (r8 == 0) goto L_0x0146
        L_0x0174:
            r7 = 1
            goto L_0x0177
        L_0x0176:
            r7 = 0
        L_0x0177:
            if (r7 != 0) goto L_0x009d
        L_0x0179:
            r2 = 0
        L_0x017a:
            if (r2 == 0) goto L_0x01e1
            com.moovit.app.ads.mapitem.a r14 = r13.this$0
            com.moovit.commons.geo.LatLonE6 r8 = r13.$location
            com.moovit.image.model.ImageRef r1 = r13.$imageRef
            com.moovit.image.model.ImageRef r2 = r13.$selectedImageRef
            java.lang.String r3 = "mvItemMetadata"
            mf0.C24362h.m61210e(r0, r3)
            r14.getClass()
            java.lang.String[] r14 = new java.lang.String[r6]
            com.moovit.image.model.Image r9 = r1.mo48235p(r14)
            if (r2 == 0) goto L_0x019a
            java.lang.String[] r14 = new java.lang.String[r6]
            com.moovit.image.model.Image r4 = r2.mo48235p(r14)
        L_0x019a:
            r10 = r4
            F r14 = r0.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r1 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.DIRECT_AD_META_DATA
            if (r14 != r1) goto L_0x01c6
            java.lang.Object r14 = r0.value_
            com.tranzmate.moovit.protocol.mapitems.MVDirectAdMetaData r14 = (com.tranzmate.moovit.protocol.mapitems.MVDirectAdMetaData) r14
            java.lang.String r0 = "mvItemMetadata.directAdMetaData"
            mf0.C24362h.m61210e(r14, r0)
            java.lang.String r0 = r14.adId
            java.lang.String r14 = r14.analyticsData
            com.moovit.map.collections.category.types.DirectAdMetadata r12 = new com.moovit.map.collections.category.types.DirectAdMetadata
            java.lang.String r1 = "adId"
            mf0.C24362h.m61210e(r0, r1)
            java.lang.String r1 = "analyticsData"
            mf0.C24362h.m61210e(r14, r1)
            r12.<init>(r0, r14)
            q20.a r4 = new q20.a
            java.lang.Class<com.moovit.map.collections.category.types.DirectAdMetadata> r11 = com.moovit.map.collections.category.types.DirectAdMetadata.class
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x01e1
        L_0x01c6:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r5)
            F r0 = r0.setField_
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r0 = (com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields) r0
            vi0.c r0 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData.m22229m(r0)
            java.lang.String r0 = r0.f63355a
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r14.<init>(r0)
            throw r14
        L_0x01e1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.ads.mapitem.AdMapItemResponse$createMapItem$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
