package com.cubic.umo.pass.domain.adapter;

import com.cubic.umo.pass.model.BenefitType;
import com.squareup.moshi.JsonDataException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mf0.C24362h;
import nb0.C12942f;
import nb0.C12948l;

@Metadata(mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\b"}, mo59060d2 = {"Lcom/cubic/umo/pass/domain/adapter/BenefitTypeAdapter;", "", "()V", "fromJson", "Lcom/cubic/umo/pass/model/BenefitType;", "benefitType", "", "toJson", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class BenefitTypeAdapter {

    /* renamed from: com.cubic.umo.pass.domain.adapter.BenefitTypeAdapter$a */
    public /* synthetic */ class C2240a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7834a;

        static {
            int[] iArr = new int[BenefitType.values().length];
            iArr[BenefitType.FARE_CODE.ordinal()] = 1;
            iArr[BenefitType.PASS_PRODUCT_ISSUE.ordinal()] = 2;
            iArr[BenefitType.PASS_PRODUCT_OFFER.ordinal()] = 3;
            f7834a = iArr;
        }
    }

    @C12942f
    public final BenefitType fromJson(String str) {
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode != 1088262555) {
            if (hashCode != 1093403422) {
                if (hashCode == 1471839070 && str.equals("FARE_CODE")) {
                    return BenefitType.FARE_CODE;
                }
            } else if (str.equals("PASS_PRODUCT_OFFER")) {
                return BenefitType.PASS_PRODUCT_OFFER;
            }
        } else if (str.equals("PASS_PRODUCT_ISSUE")) {
            return BenefitType.PASS_PRODUCT_ISSUE;
        }
        throw new JsonDataException(C24362h.m61216k(str, "Unknown BenefitType: "));
    }

    @C12948l
    public final String toJson(BenefitType benefitType) {
        int i;
        if (benefitType == null) {
            i = -1;
        } else {
            i = C2240a.f7834a[benefitType.ordinal()];
        }
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return "FARE_CODE";
        }
        if (i == 2) {
            return "PASS_PRODUCT_ISSUE";
        }
        if (i == 3) {
            return "PASS_PRODUCT_OFFER";
        }
        throw new NoWhenBranchMatchedException();
    }
}
