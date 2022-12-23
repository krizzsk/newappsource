package com.cubic.umo.p045ad.types;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import nb0.C12949m;
import p358af.C13437d;
import p583jk.C17884p;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTMediaFilesJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKVASTMediaFiles;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKVASTMediaFilesJsonAdapter */
public final class AKVASTMediaFilesJsonAdapter extends C8011k<AKVASTMediaFiles> {

    /* renamed from: a */
    public final JsonReader.C7986a f7668a = JsonReader.C7986a.m18216a("interactiveCreativeFiles", "mediaFiles");

    /* renamed from: b */
    public final C8011k<List<AKVASInteractiveCreativeFile>> f7669b;

    /* renamed from: c */
    public final C8011k<List<AKVASTMediaFile>> f7670c;

    public AKVASTMediaFilesJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        this.f7669b = C17884p.m44361c0(oVar, C12949m.m32790d(List.class, AKVASInteractiveCreativeFile.class), "interactiveCreativeFiles");
        this.f7670c = C17884p.m44361c0(oVar, C12949m.m32790d(List.class, AKVASTMediaFile.class), "mediaFiles");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        boolean z = false;
        List list = null;
        List list2 = null;
        boolean z2 = false;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f7668a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                list = this.f7669b.mo11093a(jsonReader);
                z = true;
            } else if (O == 1) {
                list2 = this.f7670c.mo11093a(jsonReader);
                z2 = true;
            }
        }
        jsonReader.mo24997r();
        AKVASTMediaFiles aKVASTMediaFiles = new AKVASTMediaFiles();
        if (z) {
            aKVASTMediaFiles.setInteractiveCreativeFiles(list);
        }
        if (z2) {
            aKVASTMediaFiles.setMediaFiles(list2);
        }
        return aKVASTMediaFiles;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKVASTMediaFiles aKVASTMediaFiles = (AKVASTMediaFiles) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKVASTMediaFiles != null) {
            kVar.mo25074i();
            kVar.mo25077w("interactiveCreativeFiles");
            this.f7669b.mo11094e(kVar, aKVASTMediaFiles.getInteractiveCreativeFiles());
            kVar.mo25077w("mediaFiles");
            this.f7670c.mo11094e(kVar, aKVASTMediaFiles.getMediaFiles());
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(38, "AKVASTMediaFiles");
    }
}
