package com.cubic.umo.auth;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, mo59060d2 = {"Lcom/cubic/umo/auth/AnonymousIdListener;", "", "", "anonymousId", "Lbf0/d;", "getAnonymousId", "auth_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@Keep
public interface AnonymousIdListener {
    void getAnonymousId(String str);
}
