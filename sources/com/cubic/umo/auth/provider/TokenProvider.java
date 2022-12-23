package com.cubic.umo.auth.provider;

import androidx.annotation.Keep;
import com.cubic.umo.auth.model.Token;
import kotlin.Metadata;

@Metadata(mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0004"}, mo59060d2 = {"Lcom/cubic/umo/auth/provider/TokenProvider;", "", "getToken", "Lcom/cubic/umo/auth/model/Token;", "auth_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@Keep
public interface TokenProvider {
    Token getToken();
}
