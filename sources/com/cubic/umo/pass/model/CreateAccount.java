package com.cubic.umo.pass.model;

import android.os.Build;
import kotlin.Metadata;
import nb0.C12943g;
import nb0.C12944h;
import p358af.C13437d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B+\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/CreateAccount;", "", "", "username", "password", "", "deviceId", "agencyId", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class CreateAccount {

    /* renamed from: a */
    public final String f8016a;

    /* renamed from: b */
    public final String f8017b;

    /* renamed from: c */
    public final long f8018c;

    /* renamed from: d */
    public final String f8019d;

    /* renamed from: e */
    public String f8020e;

    /* renamed from: f */
    public String f8021f;

    /* renamed from: g */
    public String f8022g;

    /* renamed from: h */
    public String f8023h;

    /* renamed from: i */
    public String f8024i;

    /* renamed from: j */
    public String f8025j;

    /* renamed from: k */
    public String f8026k;

    /* renamed from: l */
    public boolean f8027l;

    public CreateAccount(String str, String str2, long j, @C12943g(name = "agencyPublicId") String str3) {
        C13437d.m33711q(str, "username", str2, "password", str3, "agencyId");
        this.f8016a = str;
        this.f8017b = str2;
        this.f8018c = j;
        this.f8019d = str3;
        String str4 = Build.MODEL;
        String str5 = Build.VERSION.RELEASE;
    }

    @C12943g(name = "birthdate")
    public static /* synthetic */ void getBirthdate$annotations() {
    }

    @C12943g(name = "cardNumber")
    public static /* synthetic */ void getCardNumber$annotations() {
    }

    @C12943g(name = "deviceType")
    public static /* synthetic */ void getDeviceType$annotations() {
    }

    @C12943g(name = "email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @C12943g(name = "firstName")
    public static /* synthetic */ void getFirstName$annotations() {
    }

    @C12943g(name = "lastName")
    public static /* synthetic */ void getLastName$annotations() {
    }

    @C12943g(name = "nfcEnabled")
    public static /* synthetic */ void getNfcEnabled$annotations() {
    }

    @C12943g(name = "osVersion")
    public static /* synthetic */ void getOsVersion$annotations() {
    }

    @C12943g(name = "otherPhone")
    public static /* synthetic */ void getOtherPhone$annotations() {
    }

    @C12943g(name = "primaryPhone")
    public static /* synthetic */ void getPrimaryPhone$annotations() {
    }

    @C12943g(name = "replaceDevice")
    public static /* synthetic */ void getReplaceDevice$annotations() {
    }
}
