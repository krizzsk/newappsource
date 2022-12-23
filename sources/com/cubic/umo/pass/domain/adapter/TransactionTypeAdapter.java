package com.cubic.umo.pass.domain.adapter;

import com.cubic.umo.pass.model.TransactionType;
import com.squareup.moshi.JsonDataException;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12942f;
import nb0.C12948l;

@Metadata(mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\b"}, mo59060d2 = {"Lcom/cubic/umo/pass/domain/adapter/TransactionTypeAdapter;", "", "()V", "fromJson", "Lcom/cubic/umo/pass/model/TransactionType;", "transactionType", "", "toJson", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class TransactionTypeAdapter {
    @C12942f
    public final TransactionType fromJson(String str) {
        if (str == null) {
            return null;
        }
        try {
            String upperCase = str.toUpperCase();
            C24362h.m61210e(upperCase, "this as java.lang.String).toUpperCase()");
            return TransactionType.valueOf(upperCase);
        } catch (IllegalArgumentException unused) {
            throw new JsonDataException(C24362h.m61216k(str, "Unknown transactionType: "));
        }
    }

    @C12948l
    public final String toJson(TransactionType transactionType) {
        if (transactionType == null) {
            return null;
        }
        return transactionType.name();
    }
}
