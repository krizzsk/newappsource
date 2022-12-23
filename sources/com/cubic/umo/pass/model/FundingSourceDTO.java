package com.cubic.umo.pass.model;

import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/FundingSourceDTO;", "", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class FundingSourceDTO {

    /* renamed from: a */
    public final int f8103a;

    /* renamed from: b */
    public final String f8104b;

    /* renamed from: c */
    public final String f8105c;

    /* renamed from: d */
    public final String f8106d;

    /* renamed from: e */
    public final String f8107e;

    /* renamed from: f */
    public final String f8108f;

    /* renamed from: g */
    public final boolean f8109g;

    /* renamed from: h */
    public final String f8110h;

    public FundingSourceDTO(int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        this.f8103a = i;
        this.f8104b = str;
        this.f8105c = str2;
        this.f8106d = str3;
        this.f8107e = str4;
        this.f8108f = str5;
        this.f8109g = z;
        this.f8110h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundingSourceDTO)) {
            return false;
        }
        FundingSourceDTO fundingSourceDTO = (FundingSourceDTO) obj;
        return this.f8103a == fundingSourceDTO.f8103a && C24362h.m61206a(this.f8104b, fundingSourceDTO.f8104b) && C24362h.m61206a(this.f8105c, fundingSourceDTO.f8105c) && C24362h.m61206a(this.f8106d, fundingSourceDTO.f8106d) && C24362h.m61206a(this.f8107e, fundingSourceDTO.f8107e) && C24362h.m61206a(this.f8108f, fundingSourceDTO.f8108f) && this.f8109g == fundingSourceDTO.f8109g && C24362h.m61206a(this.f8110h, fundingSourceDTO.f8110h);
    }

    public final int hashCode() {
        int d = C13715c.m34238d(this.f8108f, C13715c.m34238d(this.f8107e, C13715c.m34238d(this.f8106d, C13715c.m34238d(this.f8105c, C13715c.m34238d(this.f8104b, this.f8103a * 31, 31), 31), 31), 31), 31);
        boolean z = this.f8109g;
        if (z) {
            z = true;
        }
        return this.f8110h.hashCode() + ((d + (z ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("FundingSourceDTO(id=");
        k.append(this.f8103a);
        k.append(", cardholderName=");
        k.append(this.f8104b);
        k.append(", type=");
        k.append(this.f8105c);
        k.append(", expiration=");
        k.append(this.f8106d);
        k.append(", name=");
        k.append(this.f8107e);
        k.append(", truncatedSourceId=");
        k.append(this.f8108f);
        k.append(", enabled=");
        k.append(this.f8109g);
        k.append(", poolId=");
        return C0017h.m57N(k, this.f8110h, ')');
    }
}
