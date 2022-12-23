package com.moovit.image.entity.upload;

import c70.C13752e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.image.entity.upload.EntityImageUploadWorker;
import p664mu.C18436b;

/* renamed from: com.moovit.image.entity.upload.c */
public final class C16024c implements C16022a {
    /* renamed from: a */
    public final Task<String> mo48190a(C13752e eVar, EntityImageUploadWorker.C16021a aVar) {
        return Tasks.call(MoovitExecutors.f37327IO, new C18436b(1, this, eVar, aVar));
    }
}
