package com.cubic.umo.pass.domain.adapter;

import com.cubic.umo.pass.model.PassDTO;
import com.squareup.moshi.JsonDataException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mf0.C24362h;
import nb0.C12942f;
import nb0.C12948l;

@Metadata(mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, mo59060d2 = {"Lcom/cubic/umo/pass/domain/adapter/PassTypeAdapter2;", "", "()V", "fromJson", "Lcom/cubic/umo/pass/model/PassDTO$PassType;", "passType", "", "(Ljava/lang/Integer;)Lcom/cubic/umo/pass/model/PassDTO$PassType;", "toJson", "(Lcom/cubic/umo/pass/model/PassDTO$PassType;)Ljava/lang/Integer;", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class PassTypeAdapter2 {

    /* renamed from: com.cubic.umo.pass.domain.adapter.PassTypeAdapter2$a */
    public /* synthetic */ class C2243a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7837a;

        static {
            int[] iArr = new int[PassDTO.PassType.values().length];
            iArr[PassDTO.PassType.CALENDAR.ordinal()] = 1;
            iArr[PassDTO.PassType.TIME.ordinal()] = 2;
            iArr[PassDTO.PassType.TRIP.ordinal()] = 3;
            f7837a = iArr;
        }
    }

    @C12942f
    public final PassDTO.PassType fromJson(Integer num) {
        if (num == null) {
            return null;
        }
        if (num.intValue() == 1) {
            return PassDTO.PassType.CALENDAR;
        }
        if (num.intValue() == 2) {
            return PassDTO.PassType.TIME;
        }
        if (num.intValue() == 3) {
            return PassDTO.PassType.TRIP;
        }
        throw new JsonDataException(C24362h.m61216k(num, "Unknown PassType: "));
    }

    @C12948l
    public final Integer toJson(PassDTO.PassType passType) {
        int i;
        if (passType == null) {
            i = -1;
        } else {
            i = C2243a.f7837a[passType.ordinal()];
        }
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }
}
