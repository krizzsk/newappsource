package com.cubic.umo.pass.domain.adapter;

import android.text.TextUtils;
import com.cubic.umo.pass.model.PassType;
import com.squareup.moshi.JsonDataException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mf0.C24362h;
import nb0.C12942f;
import nb0.C12948l;

@Metadata(mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\b"}, mo59060d2 = {"Lcom/cubic/umo/pass/domain/adapter/PassTypeAdapter;", "", "()V", "fromJson", "Lcom/cubic/umo/pass/model/PassType;", "passType", "", "toJson", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class PassTypeAdapter {

    /* renamed from: com.cubic.umo.pass.domain.adapter.PassTypeAdapter$a */
    public /* synthetic */ class C2242a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7836a;

        static {
            int[] iArr = new int[PassType.values().length];
            iArr[PassType.UNKNOWN.ordinal()] = 1;
            iArr[PassType.CALENDAR.ordinal()] = 2;
            iArr[PassType.TIME.ordinal()] = 3;
            iArr[PassType.TRIP.ordinal()] = 4;
            iArr[PassType.MONTHLY_TEMPLATE.ordinal()] = 5;
            f7836a = iArr;
        }
    }

    @C12942f
    public final PassType fromJson(String str) {
        if (str == null) {
            return null;
        }
        if (TextUtils.equals(str, "UNKNOWN")) {
            return PassType.UNKNOWN;
        }
        if (TextUtils.equals(str, "CALENDAR")) {
            return PassType.CALENDAR;
        }
        if (TextUtils.equals(str, "TIME")) {
            return PassType.TIME;
        }
        if (TextUtils.equals(str, "TRIP")) {
            return PassType.TRIP;
        }
        if (TextUtils.equals(str, "MONTHLY_TEMPLATE")) {
            return PassType.MONTHLY_TEMPLATE;
        }
        throw new JsonDataException(C24362h.m61216k(str, "Unknown PassType: "));
    }

    @C12948l
    public final String toJson(PassType passType) {
        int i;
        if (passType == null) {
            i = -1;
        } else {
            i = C2242a.f7836a[passType.ordinal()];
        }
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "CALENDAR";
        }
        if (i == 3) {
            return "TIME";
        }
        if (i == 4) {
            return "TRIP";
        }
        if (i == 5) {
            return "MONTHLY_TEMPLATE";
        }
        throw new NoWhenBranchMatchedException();
    }
}
