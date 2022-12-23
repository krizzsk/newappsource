package com.cubic.umo.pass.model;

import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001BC\b\u0000\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000e\u0010\u000fJP\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/PurchaseResultDTO;", "", "", "transactionResultId", "", "transactionId", "", "svPurchase", "svBalance", "", "Lcom/cubic/umo/pass/model/PassDTO;", "purchasedPasses", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/cubic/umo/pass/model/PurchaseResultDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class PurchaseResultDTO {

    /* renamed from: a */
    public final String f8222a;

    /* renamed from: b */
    public final Long f8223b;

    /* renamed from: c */
    public final Integer f8224c;

    /* renamed from: d */
    public final Integer f8225d;

    /* renamed from: e */
    public final List<PassDTO> f8226e;

    public PurchaseResultDTO(@C12943g(name = "txResultId") String str, @C12943g(name = "txId") Long l, Integer num, Integer num2, List<PassDTO> list) {
        C24362h.m61211f(list, "purchasedPasses");
        this.f8222a = str;
        this.f8223b = l;
        this.f8224c = num;
        this.f8225d = num2;
        this.f8226e = list;
    }

    public final PurchaseResultDTO copy(@C12943g(name = "txResultId") String str, @C12943g(name = "txId") Long l, Integer num, Integer num2, List<PassDTO> list) {
        C24362h.m61211f(list, "purchasedPasses");
        return new PurchaseResultDTO(str, l, num, num2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseResultDTO)) {
            return false;
        }
        PurchaseResultDTO purchaseResultDTO = (PurchaseResultDTO) obj;
        return C24362h.m61206a(this.f8222a, purchaseResultDTO.f8222a) && C24362h.m61206a(this.f8223b, purchaseResultDTO.f8223b) && C24362h.m61206a(this.f8224c, purchaseResultDTO.f8224c) && C24362h.m61206a(this.f8225d, purchaseResultDTO.f8225d) && C24362h.m61206a(this.f8226e, purchaseResultDTO.f8226e);
    }

    public final int hashCode() {
        String str = this.f8222a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f8223b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.f8224c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f8225d;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return this.f8226e.hashCode() + ((hashCode3 + i) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("PurchaseResultDTO(transactionResultId=");
        k.append(this.f8222a);
        k.append(", transactionId=");
        k.append(this.f8223b);
        k.append(", svPurchase=");
        k.append(this.f8224c);
        k.append(", svBalance=");
        k.append(this.f8225d);
        k.append(", purchasedPasses=");
        return C13555b.m33970i(k, this.f8226e, ')');
    }
}
