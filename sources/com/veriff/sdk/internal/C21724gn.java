package com.veriff.sdk.internal;

import com.appsflyer.ServerParameters;
import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/KotshiDeviceInfoJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/analytics/DeviceInfo;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "", "Lcom/veriff/sdk/internal/analytics/AudioCodecInfo;", "audioCodecInfoListAdapter", "Lcom/squareup/moshi/k;", "Lcom/veriff/sdk/internal/analytics/CodecInfo;", "codecInfoListAdapter", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.gn */
public final class C21724gn extends aed<C21664gd> {

    /* renamed from: a */
    private final C21420av<List<C21662gb>> f54970a;

    /* renamed from: b */
    private final C21420av<List<C21656fy>> f54971b;

    /* renamed from: c */
    private final C21430ba.C21431a f54972c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21724gn(C21450bi biVar) {
        super("KotshiJsonAdapter(DeviceInfo)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<List<C21662gb>> a = biVar.mo54335a((Type) C21468bk.m51261a((Type) List.class, C21662gb.class));
        C24362h.m61210e(a, "moshi.adapter(Types.newP…o::class.javaObjectType))");
        this.f54970a = a;
        C21420av<List<C21656fy>> a2 = biVar.mo54335a((Type) C21468bk.m51261a((Type) List.class, C21656fy.class));
        C24362h.m61210e(a2, "moshi.adapter(Types.newP…o::class.javaObjectType))");
        this.f54971b = a2;
        C21430ba.C21431a a3 = C21430ba.C21431a.m51080a("veriff_sdk_version", ServerParameters.PLATFORM, "android_version", "android_sdk_level", "manufacturer", ServerParameters.MODEL, "market_name", "video_codecs", "audio_codecs");
        C24362h.m61210e(a3, "JsonReader.Options.of(\n …\n      \"audio_codecs\"\n  )");
        this.f54972c = a3;
    }

    /* renamed from: b */
    public C21664gd mo54204a(C21430ba baVar) throws IOException {
        String str;
        C21430ba baVar2 = baVar;
        C24362h.m61211f(baVar2, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21664gd) baVar.mo54253l();
        }
        baVar.mo54246e();
        boolean z = false;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        List<C21662gb> list = null;
        List<C21656fy> list2 = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (baVar.mo54248g()) {
            String str9 = str2;
            switch (baVar2.mo54236a(this.f54972c)) {
                case -1:
                    baVar.mo54250i();
                    baVar.mo54257p();
                    break;
                case 0:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                        str2 = str9;
                    } else {
                        str2 = baVar.mo54251j();
                    }
                    z = true;
                    continue;
                case 1:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        str3 = baVar.mo54251j();
                    }
                    str2 = str9;
                    z2 = true;
                    continue;
                case 2:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        str4 = baVar.mo54251j();
                    }
                    str2 = str9;
                    z3 = true;
                    continue;
                case 3:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        str5 = baVar.mo54251j();
                    }
                    str2 = str9;
                    z4 = true;
                    continue;
                case 4:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        str6 = baVar.mo54251j();
                    }
                    str2 = str9;
                    z5 = true;
                    continue;
                case 5:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        str7 = baVar.mo54251j();
                    }
                    str2 = str9;
                    z6 = true;
                    continue;
                case 6:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        str8 = baVar.mo54251j();
                    }
                    str2 = str9;
                    z7 = true;
                    continue;
                case 7:
                    list = this.f54970a.mo54204a(baVar2);
                    str2 = str9;
                    z8 = true;
                    continue;
                case 8:
                    list2 = this.f54971b.mo54204a(baVar2);
                    str2 = str9;
                    z9 = true;
                    continue;
            }
            str2 = str9;
        }
        String str10 = str2;
        baVar.mo54247f();
        C21664gd gdVar = new C21664gd((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 511, (DefaultConstructorMarker) null);
        if (z) {
            str = str10;
        } else {
            str = gdVar.mo54956a();
        }
        if (!z2) {
            str3 = gdVar.mo54957b();
        }
        String str11 = str3;
        if (!z3) {
            str4 = gdVar.mo54958c();
        }
        String str12 = str4;
        if (!z4) {
            str5 = gdVar.mo54959d();
        }
        String str13 = str5;
        if (!z5) {
            str6 = gdVar.mo54960e();
        }
        String str14 = str6;
        if (!z6) {
            str7 = gdVar.mo54962f();
        }
        String str15 = str7;
        if (!z7) {
            str8 = gdVar.mo54963g();
        }
        String str16 = str8;
        if (!z8) {
            list = gdVar.mo54964h();
        }
        List<C21662gb> list3 = list;
        if (!z9) {
            list2 = gdVar.mo54966i();
        }
        return gdVar.mo54955a(str, str11, str12, str13, str14, str15, str16, list3, list2);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21664gd gdVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (gdVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("veriff_sdk_version");
        bfVar.mo54272b(gdVar.mo54956a());
        bfVar.mo54269a(ServerParameters.PLATFORM);
        bfVar.mo54272b(gdVar.mo54957b());
        bfVar.mo54269a("android_version");
        bfVar.mo54272b(gdVar.mo54958c());
        bfVar.mo54269a("android_sdk_level");
        bfVar.mo54272b(gdVar.mo54959d());
        bfVar.mo54269a("manufacturer");
        bfVar.mo54272b(gdVar.mo54960e());
        bfVar.mo54269a(ServerParameters.MODEL);
        bfVar.mo54272b(gdVar.mo54962f());
        bfVar.mo54269a("market_name");
        bfVar.mo54272b(gdVar.mo54963g());
        bfVar.mo54269a("video_codecs");
        this.f54970a.mo54205a(bfVar, gdVar.mo54964h());
        bfVar.mo54269a("audio_codecs");
        this.f54971b.mo54205a(bfVar, gdVar.mo54966i());
        bfVar.mo54275d();
    }
}
