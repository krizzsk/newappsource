package com.veriff.sdk.internal;

import com.appboy.support.AppboyFileUtils;
import com.appboy.support.ValidationUtils;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21430ba;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0018"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/KotshiMediaJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/upload/Media;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "Ljava/io/File;", "fileAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lmobi/lab/veriff/data/api/request/payload/UploadData;", "uploadDataAdapter", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ms */
public final class C22037ms extends aed<C22046na> {

    /* renamed from: a */
    private final C21420av<File> f55590a;

    /* renamed from: b */
    private final C21420av<C22547te> f55591b;

    /* renamed from: c */
    private final C21430ba.C21431a f55592c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22037ms(C21450bi biVar) {
        super("KotshiJsonAdapter(Media)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<File> a = biVar.mo54334a(File.class);
        C24362h.m61210e(a, "moshi.adapter(File::class.javaObjectType)");
        this.f55590a = a;
        C21420av<C22547te> a2 = biVar.mo54334a(C22547te.class);
        C24362h.m61210e(a2, "moshi.adapter(UploadData::class.javaObjectType)");
        this.f55591b = a2;
        C21430ba.C21431a a3 = C21430ba.C21431a.m51080a("verificationId", AppboyFileUtils.FILE_SCHEME, AppActionRequest.KEY_CONTEXT, "encrypted", "inflow", "mrz", "documentType", "language", "metadata", "isPoa", "mimeType");
        C24362h.m61210e(a3, "JsonReader.Options.of(\n …oa\",\n      \"mimeType\"\n  )");
        this.f55592c = a3;
    }

    /* renamed from: b */
    public C22046na mo54204a(C21430ba baVar) throws IOException {
        StringBuilder sb;
        C21430ba baVar2 = baVar;
        C24362h.m61211f(baVar2, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22046na) baVar.mo54253l();
        }
        baVar.mo54246e();
        boolean z = false;
        String str = null;
        File file = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        C22547te teVar = null;
        String str5 = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z11 = false;
        while (baVar.mo54248g()) {
            switch (baVar2.mo54236a(this.f55592c)) {
                case -1:
                    baVar.mo54250i();
                    baVar.mo54257p();
                    break;
                case 0:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        str = baVar.mo54251j();
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 1:
                    file = this.f55590a.mo54204a(baVar2);
                    break;
                case 2:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        str2 = baVar.mo54251j();
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 3:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        z4 = baVar.mo54252k();
                        z = true;
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 4:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        z5 = baVar.mo54252k();
                        z2 = true;
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 5:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        z6 = baVar.mo54252k();
                        z3 = true;
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 6:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        str3 = baVar.mo54251j();
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 7:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        str4 = baVar.mo54251j();
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 8:
                    teVar = this.f55591b.mo54204a(baVar2);
                    z7 = true;
                    break;
                case 9:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        z9 = baVar.mo54252k();
                        z8 = true;
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 10:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        str5 = baVar.mo54251j();
                    }
                    z11 = true;
                    break;
            }
        }
        baVar.mo54247f();
        if (str == null) {
            sb = aec.m50903a((StringBuilder) null, "verificationId", (String) null, 2, (Object) null);
        } else {
            sb = null;
        }
        if (file == null) {
            sb = aec.m50903a(sb, AppboyFileUtils.FILE_SCHEME, (String) null, 2, (Object) null);
        }
        if (str2 == null) {
            sb = aec.m50903a(sb, AppActionRequest.KEY_CONTEXT, (String) null, 2, (Object) null);
        }
        if (!z) {
            sb = aec.m50903a(sb, "encrypted", (String) null, 2, (Object) null);
        }
        if (!z2) {
            sb = aec.m50903a(sb, "inflow", (String) null, 2, (Object) null);
        }
        if (!z3) {
            sb = aec.m50903a(sb, "mrz", (String) null, 2, (Object) null);
        }
        if (str4 == null) {
            sb = aec.m50903a(sb, "language", (String) null, 2, (Object) null);
        }
        if (sb == null) {
            C24362h.m61208c(str);
            C24362h.m61208c(file);
            C24362h.m61208c(str2);
            C24362h.m61208c(str4);
            C22046na naVar = new C22046na(str, file, str2, z4, z5, z6, str3, str4, (C22547te) null, false, (String) null, 1792, (DefaultConstructorMarker) null);
            if (!z7) {
                teVar = naVar.mo55897j();
            }
            C22547te teVar2 = teVar;
            if (!z8) {
                z9 = naVar.mo55898k();
            }
            boolean z12 = z9;
            if (!z11) {
                str5 = naVar.mo55899l();
            }
            return C22046na.m53752a(naVar, (String) null, (File) null, (String) null, false, false, false, (String) null, (String) null, teVar2, z12, str5, ValidationUtils.APPBOY_STRING_MAX_LENGTH, (Object) null);
        }
        sb.append(" (at path ");
        sb.append(baVar.mo54259r());
        sb.append(')');
        throw new C21426ax(sb.toString());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22046na naVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (naVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("verificationId");
        bfVar.mo54272b(naVar.mo55887b());
        bfVar.mo54269a(AppboyFileUtils.FILE_SCHEME);
        this.f55590a.mo54205a(bfVar, naVar.mo55888c());
        bfVar.mo54269a(AppActionRequest.KEY_CONTEXT);
        bfVar.mo54272b(naVar.mo55889d());
        bfVar.mo54269a("encrypted");
        bfVar.mo54270a(naVar.mo55890e());
        bfVar.mo54269a("inflow");
        bfVar.mo54270a(naVar.mo55892f());
        bfVar.mo54269a("mrz");
        bfVar.mo54270a(naVar.mo55893g());
        bfVar.mo54269a("documentType");
        bfVar.mo54272b(naVar.mo55894h());
        bfVar.mo54269a("language");
        bfVar.mo54272b(naVar.mo55896i());
        bfVar.mo54269a("metadata");
        this.f55591b.mo54205a(bfVar, naVar.mo55897j());
        bfVar.mo54269a("isPoa");
        bfVar.mo54270a(naVar.mo55898k());
        bfVar.mo54269a("mimeType");
        bfVar.mo54272b(naVar.mo55899l());
        bfVar.mo54275d();
    }
}
