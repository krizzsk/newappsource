package com.cubic.umo.pass.model;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.models.outgoing.TwitterUser;
import com.appsflyer.ServerParameters;
import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/TxDTOJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/TxDTO;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class TxDTOJsonAdapter extends C8011k<TxDTO> {

    /* renamed from: a */
    public final JsonReader.C7986a f8242a = JsonReader.C7986a.m18216a("txId", ServerParameters.TIMESTAMP_KEY, "type", "balance", "balanceMoney", "fare", FacebookUser.LOCATION_OUTER_OBJECT_KEY, TwitterUser.DESCRIPTION_KEY, "readerTimedOut", "millis");

    /* renamed from: b */
    public final C8011k<Long> f8243b;

    /* renamed from: c */
    public final C8011k<TransactionType> f8244c;

    /* renamed from: d */
    public final C8011k<Integer> f8245d;

    /* renamed from: e */
    public final C8011k<Money> f8246e;

    /* renamed from: f */
    public final C8011k<String> f8247f;

    /* renamed from: g */
    public final C8011k<Boolean> f8248g;

    public TxDTOJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.f60175b;
        this.f8243b = oVar.mo25082c(cls, emptySet, "txId");
        this.f8244c = oVar.mo25082c(TransactionType.class, emptySet, "type");
        this.f8245d = oVar.mo25082c(Integer.class, emptySet, "balance");
        this.f8246e = oVar.mo25082c(Money.class, emptySet, "balanceMoney");
        this.f8247f = oVar.mo25082c(String.class, emptySet, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f8248g = oVar.mo25082c(Boolean.class, emptySet, "isReaderTimeOut");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C24362h.m61211f(jsonReader2, "reader");
        jsonReader.mo24995i();
        Long l = null;
        Long l2 = null;
        TransactionType transactionType = null;
        Integer num = null;
        Money money = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        Integer num3 = null;
        while (jsonReader.mo24999v()) {
            switch (jsonReader2.mo24989O(this.f8242a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    l = this.f8243b.mo11093a(jsonReader2);
                    if (l != null) {
                        break;
                    } else {
                        throw C12977b.m32860m("txId", "txId", jsonReader2);
                    }
                case 1:
                    l2 = this.f8243b.mo11093a(jsonReader2);
                    if (l2 != null) {
                        break;
                    } else {
                        throw C12977b.m32860m(ServerParameters.TIMESTAMP_KEY, ServerParameters.TIMESTAMP_KEY, jsonReader2);
                    }
                case 2:
                    transactionType = this.f8244c.mo11093a(jsonReader2);
                    if (transactionType != null) {
                        break;
                    } else {
                        throw C12977b.m32860m("type", "type", jsonReader2);
                    }
                case 3:
                    num = this.f8245d.mo11093a(jsonReader2);
                    break;
                case 4:
                    money = this.f8246e.mo11093a(jsonReader2);
                    break;
                case 5:
                    num2 = this.f8245d.mo11093a(jsonReader2);
                    break;
                case 6:
                    str = this.f8247f.mo11093a(jsonReader2);
                    break;
                case 7:
                    str2 = this.f8247f.mo11093a(jsonReader2);
                    break;
                case 8:
                    bool = this.f8248g.mo11093a(jsonReader2);
                    break;
                case 9:
                    num3 = this.f8245d.mo11093a(jsonReader2);
                    break;
            }
        }
        jsonReader.mo24997r();
        if (l != null) {
            long longValue = l.longValue();
            if (l2 != null) {
                long longValue2 = l2.longValue();
                if (transactionType != null) {
                    return new TxDTO(longValue, longValue2, transactionType, num, money, num2, str, str2, bool, num3);
                }
                throw C12977b.m32854g("type", "type", jsonReader2);
            }
            throw C12977b.m32854g(ServerParameters.TIMESTAMP_KEY, ServerParameters.TIMESTAMP_KEY, jsonReader2);
        }
        throw C12977b.m32854g("txId", "txId", jsonReader2);
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        TxDTO txDTO = (TxDTO) obj;
        C24362h.m61211f(kVar, "writer");
        if (txDTO != null) {
            kVar.mo25074i();
            kVar.mo25077w("txId");
            this.f8243b.mo11094e(kVar, Long.valueOf(txDTO.f8232b));
            kVar.mo25077w(ServerParameters.TIMESTAMP_KEY);
            this.f8243b.mo11094e(kVar, Long.valueOf(txDTO.f8233c));
            kVar.mo25077w("type");
            this.f8244c.mo11094e(kVar, txDTO.f8234d);
            kVar.mo25077w("balance");
            this.f8245d.mo11094e(kVar, txDTO.f8235e);
            kVar.mo25077w("balanceMoney");
            this.f8246e.mo11094e(kVar, txDTO.f8236f);
            kVar.mo25077w("fare");
            this.f8245d.mo11094e(kVar, txDTO.f8237g);
            kVar.mo25077w(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
            this.f8247f.mo11094e(kVar, txDTO.f8238h);
            kVar.mo25077w(TwitterUser.DESCRIPTION_KEY);
            this.f8247f.mo11094e(kVar, txDTO.f8239i);
            kVar.mo25077w("readerTimedOut");
            this.f8248g.mo11094e(kVar, txDTO.f8240j);
            kVar.mo25077w("millis");
            this.f8245d.mo11094e(kVar, txDTO.f8241k);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(TxDTO)";
    }
}
