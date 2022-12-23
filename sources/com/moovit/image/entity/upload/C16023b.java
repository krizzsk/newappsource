package com.moovit.image.entity.upload;

import c70.C13752e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.image.entity.upload.EntityImageUploadWorker;
import q10.C19074a;

/* renamed from: com.moovit.image.entity.upload.b */
public final class C16023b implements C16022a {
    /* renamed from: a */
    public final Task<String> mo48190a(C13752e eVar, EntityImageUploadWorker.C16021a aVar) {
        return Tasks.call(MoovitExecutors.f37327IO, new C19074a(this, eVar, aVar));
    }
}
