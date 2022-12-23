package com.veriff.sdk.internal;

import ff0.C23349c;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C23826d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J-\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011J-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\t2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0016\b\u0003\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0019H§@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0001\u0010\u001f\u001a\u00020\u001eH§@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\"\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\"H'J\"\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J-\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b&\u0010\u000bJe\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020'2\b\b\u0001\u0010*\u001a\u00020)2\b\b\u0001\u0010+\u001a\u00020)2\n\b\u0001\u0010,\u001a\u0004\u0018\u00010'2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010'2\n\b\u0001\u0010-\u001a\u0004\u0018\u00010'H§@ø\u0001\u0000¢\u0006\u0004\b/\u00100J7\u00105\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0001\u00101\u001a\u00020\u00022\b\b\u0001\u00102\u001a\u00020'2\b\b\u0001\u00104\u001a\u000203H§@ø\u0001\u0000¢\u0006\u0004\b5\u00106JA\u00108\u001a\b\u0012\u0004\u0012\u00020.0\t2\b\b\u0001\u00101\u001a\u00020\u00022\b\b\u0001\u00107\u001a\u00020\u00022\b\b\u0001\u00102\u001a\u00020'2\b\b\u0001\u00104\u001a\u000203H§@ø\u0001\u0000¢\u0006\u0004\b8\u00109\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, mo59060d2 = {"Lmobi/lab/veriff/network/VeriffApi$ApiService;", "", "", "sessionToken", "Lmobi/lab/veriff/data/api/request/payload/StatusPayload;", "body", "Lck0/b;", "Lmobi/lab/veriff/data/api/request/response/EmptyResponse;", "changeIDVSessionStatus", "Lcom/veriff/sdk/internal/network/ApiResult;", "changeStatusSuspending", "(Ljava/lang/String;Lmobi/lab/veriff/data/api/request/payload/StatusPayload;Lff0/c;)Ljava/lang/Object;", "Lmobi/lab/veriff/data/api/request/payload/DocumentRequestPayload;", "documentSelect", "(Ljava/lang/String;Lmobi/lab/veriff/data/api/request/payload/DocumentRequestPayload;Lff0/c;)Ljava/lang/Object;", "Lmobi/lab/veriff/data/api/request/response/BrowserIdResponse;", "getBrowserIdProbityToken", "(Ljava/lang/String;Lff0/c;)Ljava/lang/Object;", "acceptedLanguages", "Lmobi/lab/veriff/data/api/request/response/ConfigurationResponse;", "getConfigs", "language", "Lmobi/lab/veriff/data/api/request/response/CountriesResponse;", "getCountries", "(Ljava/lang/String;Ljava/lang/String;Lff0/c;)Ljava/lang/Object;", "", "flags", "Lmobi/lab/veriff/data/api/request/response/StartSessionResponse;", "getSessionV2", "(Ljava/lang/String;Ljava/util/Map;Lff0/c;)Ljava/lang/Object;", "Lcom/veriff/sdk/internal/data/SentryReport;", "report", "reportCrash", "(Lcom/veriff/sdk/internal/data/SentryReport;Lff0/c;)Ljava/lang/Object;", "Lmobi/lab/veriff/data/api/request/payload/EventRequestPayload;", "sendEvent", "id", "updatePOASessionStatus", "updatePOASessionStatusSuspending", "Lhi0/b0;", "context", "", "inflowFeedback", "mrz", "documentType", "snapshot", "Lmobi/lab/veriff/data/api/request/response/InflowResponse;", "uploadFile", "(Ljava/lang/String;Lhi0/b0;ZZLhi0/b0;Lhi0/b0;Lhi0/b0;Lff0/c;)Ljava/lang/Object;", "verificationId", "payload", "Lmobi/lab/veriff/data/api/request/payload/UploadMetadata;", "metadata", "uploadPOAFile", "(Ljava/lang/String;Lhi0/b0;Lmobi/lab/veriff/data/api/request/payload/UploadMetadata;Lff0/c;)Ljava/lang/Object;", "kind", "uploadVideo", "(Ljava/lang/String;Ljava/lang/String;Lhi0/b0;Lmobi/lab/veriff/data/api/request/payload/UploadMetadata;Lff0/c;)Ljava/lang/Object;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public interface xb$a {

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.xb$a$a */
    public static final class C22678a {
        /* renamed from: a */
        public static /* synthetic */ Object m55295a(xb$a xb_a, String str, Map map, C23349c cVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                if ((i & 2) != 0) {
                    map = C23826d.m58530U();
                }
                return xb_a.mo57062a(str, (Map<String, String>) map, (C23349c<? super C21924kn<C22609uz>>) cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSessionV2");
        }
    }

    @adr(mo54137a = "/v1/verifications/{sessionToken}/event")
    @C22672ww(mo57040b = false)
    /* renamed from: a */
    ace<C22558tn> mo57052a(@adv(mo54142a = "sessionToken") String str, @add C22530sp spVar);

    @adq(mo54136a = "/api/v2/proof-of-address/{id}")
    @C22671wv
    /* renamed from: a */
    ace<C22558tn> mo57053a(@adv(mo54142a = "id") String str, @add C22545td tdVar);

    @adr(mo54137a = "/api/v2/crash-reports")
    @C22671wv
    /* renamed from: a */
    Object mo57054a(@add C21887jt jtVar, C23349c<? super C21924kn<C22558tn>> cVar);

    @adq(mo54136a = "/v1/verifications/{sessionToken}/document")
    @C22672ww(mo57040b = false)
    /* renamed from: a */
    Object mo57055a(@adv(mo54142a = "sessionToken") String str, @add C22528so soVar, C23349c<? super C21924kn<C22558tn>> cVar);

    @adq(mo54136a = "/api/v2/proof-of-address/{id}")
    @C22671wv
    /* renamed from: a */
    Object mo57056a(@adv(mo54142a = "id") String str, @add C22545td tdVar, C23349c<? super C21924kn<C22558tn>> cVar);

    @C22671wv
    @ado
    @C22672ww(mo57039a = false)
    @adr(mo54137a = "/api/v2/proof-of-address/{id}/images")
    @C22675wz(mo57050a = 120, mo57051b = TimeUnit.SECONDS)
    /* renamed from: a */
    Object mo57057a(@adv(mo54142a = "id") String str, @adt(mo54139a = "payload") C22754yt ytVar, @adt(mo54139a = "metadata") C22548tf tfVar, C23349c<? super C21924kn<C22558tn>> cVar);

    @ado
    @C22672ww(mo57039a = false)
    @adr(mo54137a = "/v2/verifications/{sessionToken}/upload")
    @C22675wz(mo57050a = 120, mo57051b = TimeUnit.SECONDS)
    /* renamed from: a */
    Object mo57058a(@adv(mo54142a = "sessionToken") String str, @adt(mo54139a = "context") C22754yt ytVar, @adt(mo54139a = "inflowFeedback") boolean z, @adt(mo54139a = "mrz") boolean z2, @adt(mo54139a = "documentType") C22754yt ytVar2, @adt(mo54139a = "lang") C22754yt ytVar3, @adt(mo54139a = "snapshot") C22754yt ytVar4, C23349c<? super C21924kn<C22561tq>> cVar);

    @adi(mo54128a = "/api/v2/configs")
    @C22671wv
    /* renamed from: a */
    Object mo57059a(@adl(mo54133a = "accept-language") String str, C23349c<? super C21924kn<C22553tk>> cVar);

    @C22671wv
    @ado
    @C22672ww(mo57039a = false)
    @adr(mo54137a = "/api/v2/verifications/{id}/{kind}")
    @C22675wz(mo57050a = 120, mo57051b = TimeUnit.SECONDS)
    /* renamed from: a */
    Object mo57060a(@adv(mo54142a = "id") String str, @adv(mo54142a = "kind") String str2, @adt(mo54139a = "payload") C22754yt ytVar, @adt(mo54139a = "metadata") C22548tf tfVar, C23349c<? super C21924kn<C22561tq>> cVar);

    @adi(mo54128a = "/v1/verifications/{sessionToken}/supported-countries")
    /* renamed from: a */
    Object mo57061a(@adv(mo54142a = "sessionToken") String str, @adw(mo54144a = "lang") String str2, C23349c<? super C21924kn<C22554tl>> cVar);

    @adi(mo54128a = "/api/v2/sessions")
    @C22671wv
    /* renamed from: a */
    Object mo57062a(@adl(mo54133a = "accept-language") String str, @adx Map<String, String> map, C23349c<? super C21924kn<C22609uz>> cVar);

    @adq(mo54136a = "/v1/verifications/{sessionToken}")
    @C22672ww(mo57040b = false)
    /* renamed from: b */
    ace<C22558tn> mo57063b(@adv(mo54142a = "sessionToken") String str, @add C22545td tdVar);

    @adq(mo54136a = "/v1/verifications/{sessionToken}")
    @C22672ww(mo57040b = false)
    /* renamed from: b */
    Object mo57064b(@adv(mo54142a = "sessionToken") String str, @add C22545td tdVar, C23349c<? super C21924kn<C22558tn>> cVar);

    @adi(mo54128a = "/v1/verifications/{sessionToken}/deviceid-token")
    /* renamed from: b */
    Object mo57065b(@adv(mo54142a = "sessionToken") String str, C23349c<? super C21924kn<C22552tj>> cVar);
}
