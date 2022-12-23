package com.moovit.app.gallery.embedded;

import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.moovit.gallery.EmbeddedGalleryFragment;
import com.moovit.gallery.EmbeddedGalleryImage;
import fe0.C23341a;
import fe0.C23345c;
import java.io.File;
import java.util.Map;
import p172m9.C5720b;
import p241s0.C6302b;
import p389bl.C13641g;
import p810sz.C19580e;
import p810sz.C19583h;
import p810sz.C19600l;
import p970zs.C20889c;
import zendesk.support.ProviderStore;
import zendesk.support.Support;
import zendesk.support.UploadResponse;

public class ZendeskGalleryFragment extends EmbeddedGalleryFragment {

    /* renamed from: s */
    public Map<EmbeddedGalleryImage, String> f38030s = new C6302b(0);

    /* renamed from: com.moovit.app.gallery.embedded.ZendeskGalleryFragment$a */
    public class C14879a extends C23345c<UploadResponse> {

        /* renamed from: a */
        public final /* synthetic */ EmbeddedGalleryImage f38031a;

        /* renamed from: b */
        public final /* synthetic */ TaskCompletionSource f38032b;

        public C14879a(EmbeddedGalleryImage embeddedGalleryImage, TaskCompletionSource taskCompletionSource) {
            this.f38031a = embeddedGalleryImage;
            this.f38032b = taskCompletionSource;
        }

        public final void onError(C23341a aVar) {
            this.f38032b.setResult(Boolean.FALSE);
        }

        public final void onSuccess(Object obj) {
            String str;
            UploadResponse uploadResponse = (UploadResponse) obj;
            if (uploadResponse != null) {
                str = uploadResponse.getToken();
            } else {
                str = null;
            }
            if (str != null) {
                ZendeskGalleryFragment.this.f38030s.put(this.f38031a, str);
                this.f38032b.setResult(Boolean.TRUE);
                return;
            }
            this.f38032b.setResult(Boolean.FALSE);
        }
    }

    /* renamed from: com.moovit.app.gallery.embedded.ZendeskGalleryFragment$b */
    public class C14880b extends C23345c<Void> {

        /* renamed from: a */
        public final /* synthetic */ TaskCompletionSource f38034a;

        public C14880b(TaskCompletionSource taskCompletionSource) {
            this.f38034a = taskCompletionSource;
        }

        public final void onError(C23341a aVar) {
            this.f38034a.setResult(Boolean.TRUE);
        }

        public final void onSuccess(Object obj) {
            Void voidR = (Void) obj;
            this.f38034a.setResult(Boolean.TRUE);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C20889c.m48882c(requireContext());
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putByteArray("tokenByImage", C13641g.m34110B(this.f38030s, new C19583h(EmbeddedGalleryImage.f41478d, C19600l.f49790t)));
    }

    /* renamed from: v2 */
    public final Task<Boolean> mo44979v2(EmbeddedGalleryImage embeddedGalleryImage) {
        ProviderStore provider = Support.INSTANCE.provider();
        if (provider == null) {
            return Tasks.forException(new RuntimeException("ProviderStore is not initialized!"));
        }
        File file = new File(embeddedGalleryImage.f41479b);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        provider.uploadProvider().uploadAttachment(file.getName(), file, C5720b.m14063n(embeddedGalleryImage.f41479b), new C14879a(embeddedGalleryImage, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: w2 */
    public final Task<Boolean> mo44980w2(EmbeddedGalleryImage embeddedGalleryImage) {
        String remove = this.f38030s.remove(embeddedGalleryImage);
        if (remove == null) {
            return Tasks.forException(new IllegalStateException("Missing zendesk token."));
        }
        ProviderStore provider = Support.INSTANCE.provider();
        if (provider == null) {
            return Tasks.forException(new RuntimeException("ProviderStore is not initialized!"));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        provider.uploadProvider().deleteAttachment(remove, new C14880b(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: x2 */
    public final void mo44981x2(Bundle bundle) {
        byte[] byteArray;
        super.mo44981x2(bundle);
        if (bundle != null && (byteArray = bundle.getByteArray("tokenByImage")) != null) {
            this.f38030s = (Map) C13641g.m34120h(byteArray, new C19580e(EmbeddedGalleryImage.f41478d));
        }
    }
}
