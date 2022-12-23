package com.veriff.sdk.internal;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0010\u0011J)\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¨\u0006\u0012"}, mo59060d2 = {"Lmobi/lab/veriff/util/files/FileSelector;", "", "", "", "supportedFileTypes", "", "allowMultiple", "Lbf0/d;", "showFilesSelector", "([Ljava/lang/String;Z)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onResult", "AndroidFileSelector", "Listener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.xi */
public interface C22686xi {

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo59060d2 = {"Lmobi/lab/veriff/util/files/FileSelector$AndroidFileSelector;", "Lmobi/lab/veriff/util/files/FileSelector;", "", "", "supportedFileTypes", "", "allowMultiple", "Lbf0/d;", "showFilesSelector", "([Ljava/lang/String;Z)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onResult", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "Lmobi/lab/veriff/util/files/FileSelector$Listener;", "listener", "Lmobi/lab/veriff/util/files/FileSelector$Listener;", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lmobi/lab/veriff/util/files/FileSelector$Listener;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.xi$a */
    public static final class C22687a implements C22686xi {

        /* renamed from: a */
        private final AppCompatActivity f57340a;

        /* renamed from: b */
        private final C22688b f57341b;

        public C22687a(AppCompatActivity appCompatActivity, C22688b bVar) {
            C24362h.m61211f(appCompatActivity, "activity");
            C24362h.m61211f(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f57340a = appCompatActivity;
            this.f57341b = bVar;
        }

        public void onResult(int i, int i2, Intent intent) {
            if (i == 102 && i2 == -1 && intent != null) {
                ArrayList arrayList = new ArrayList();
                if (intent.getClipData() != null) {
                    ClipData clipData = intent.getClipData();
                    C24362h.m61208c(clipData);
                    int itemCount = clipData.getItemCount();
                    for (int i3 = 0; i3 < itemCount; i3++) {
                        ClipData clipData2 = intent.getClipData();
                        C24362h.m61208c(clipData2);
                        ClipData.Item itemAt = clipData2.getItemAt(i3);
                        C24362h.m61210e(itemAt, "data.clipData!!.getItemAt(i)");
                        arrayList.add(itemAt.getUri());
                    }
                } else {
                    arrayList.add(intent.getData());
                }
                this.f57341b.mo57074b(arrayList);
            }
        }

        public void showFilesSelector(String[] strArr, boolean z) {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            if (strArr != null) {
                intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
            }
            if (z) {
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            }
            this.f57340a.startActivityForResult(intent, 102);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&¨\u0006\u0007"}, mo59060d2 = {"Lmobi/lab/veriff/util/files/FileSelector$Listener;", "", "", "Landroid/net/Uri;", "selectedFiles", "Lbf0/d;", "onFilesSelected", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.xi$b */
    public interface C22688b {
        /* renamed from: b */
        void mo57074b(List<? extends Uri> list);
    }

    void onResult(int i, int i2, Intent intent);

    void showFilesSelector(String[] strArr, boolean z);
}
