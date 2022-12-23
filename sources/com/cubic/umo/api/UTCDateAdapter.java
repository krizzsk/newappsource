package com.cubic.umo.api;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import nb0.C12942f;
import nb0.C12948l;
import p988j$.util.DesugarTimeZone;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\t"}, mo59060d2 = {"Lcom/cubic/umo/api/UTCDateAdapter;", "", "Ljava/util/Date;", "date", "", "toJson", "fromJson", "<init>", "()V", "core_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class UTCDateAdapter {

    /* renamed from: a */
    public final SimpleDateFormat f7725a;

    public UTCDateAdapter() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        this.f7725a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @C12942f
    public final Date fromJson(String str) {
        if (str == null) {
            return null;
        }
        return this.f7725a.parse(str);
    }

    @C12948l
    public final String toJson(Date date) {
        if (date == null) {
            return null;
        }
        return this.f7725a.format(date);
    }
}
