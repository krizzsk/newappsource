package com.cubic.umo.pass.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import nb0.C12949m;
import ob0.C12977b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/PurchaseResultDTOJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/PurchaseResultDTO;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class PurchaseResultDTOJsonAdapter extends C8011k<PurchaseResultDTO> {

    /* renamed from: a */
    public final JsonReader.C7986a f8227a = JsonReader.C7986a.m18216a("txResultId", "txId", "svPurchase", "svBalance", "purchasedPasses");

    /* renamed from: b */
    public final C8011k<String> f8228b;

    /* renamed from: c */
    public final C8011k<Long> f8229c;

    /* renamed from: d */
    public final C8011k<Integer> f8230d;

    /* renamed from: e */
    public final C8011k<List<PassDTO>> f8231e;

    public PurchaseResultDTOJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f8228b = oVar.mo25082c(String.class, emptySet, "transactionResultId");
        this.f8229c = oVar.mo25082c(Long.class, emptySet, "transactionId");
        this.f8230d = oVar.mo25082c(Integer.class, emptySet, "svPurchase");
        this.f8231e = oVar.mo25082c(C12949m.m32790d(List.class, PassDTO.class), emptySet, "purchasedPasses");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        String str = null;
        Long l = null;
        Integer num = null;
        Integer num2 = null;
        List list = null;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f8227a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                str = this.f8228b.mo11093a(jsonReader);
            } else if (O == 1) {
                l = this.f8229c.mo11093a(jsonReader);
            } else if (O == 2) {
                num = this.f8230d.mo11093a(jsonReader);
            } else if (O == 3) {
                num2 = this.f8230d.mo11093a(jsonReader);
            } else if (O == 4 && (list = this.f8231e.mo11093a(jsonReader)) == null) {
                throw C12977b.m32860m("purchasedPasses", "purchasedPasses", jsonReader);
            }
        }
        jsonReader.mo24997r();
        if (list != null) {
            return new PurchaseResultDTO(str, l, num, num2, list);
        }
        throw C12977b.m32854g("purchasedPasses", "purchasedPasses", jsonReader);
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        PurchaseResultDTO purchaseResultDTO = (PurchaseResultDTO) obj;
        C24362h.m61211f(kVar, "writer");
        if (purchaseResultDTO != null) {
            kVar.mo25074i();
            kVar.mo25077w("txResultId");
            this.f8228b.mo11094e(kVar, purchaseResultDTO.f8222a);
            kVar.mo25077w("txId");
            this.f8229c.mo11094e(kVar, purchaseResultDTO.f8223b);
            kVar.mo25077w("svPurchase");
            this.f8230d.mo11094e(kVar, purchaseResultDTO.f8224c);
            kVar.mo25077w("svBalance");
            this.f8230d.mo11094e(kVar, purchaseResultDTO.f8225d);
            kVar.mo25077w("purchasedPasses");
            this.f8231e.mo11094e(kVar, purchaseResultDTO.f8226e);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PurchaseResultDTO)";
    }
}
