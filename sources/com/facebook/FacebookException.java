package com.facebook;

import com.facebook.internal.FeatureManager;
import java.util.Random;
import kotlin.Metadata;
import p009a8.C0115o;
import p304x.C7071l0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public class FacebookException extends RuntimeException {

    /* renamed from: b */
    public static final /* synthetic */ int f8414b = 0;
    public static final long serialVersionUID = 1;

    public FacebookException() {
    }

    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str != null && C0115o.m217h() && random.nextInt(100) > 50) {
            FeatureManager featureManager = FeatureManager.f8588a;
            FeatureManager.m6255a(new C7071l0(str, 3), FeatureManager.Feature.ErrorReport);
        }
    }

    public FacebookException(String str, Exception exc) {
        super(str, exc);
    }

    public FacebookException(Throwable th) {
        super(th);
    }
}
