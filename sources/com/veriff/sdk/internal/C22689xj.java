package com.veriff.sdk.internal;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.veriff.sdk.internal.C22686xi;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0002\b\tJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\n"}, mo59060d2 = {"Lmobi/lab/veriff/util/files/FileSelectorProvider;", "", "create", "Lmobi/lab/veriff/util/files/FileSelector;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "listener", "Lmobi/lab/veriff/util/files/FileSelector$Listener;", "AndroidFileSelectorProvider", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.xj */
public interface C22689xj {

    /* renamed from: b */
    public static final C22691b f57342b = C22691b.f57343a;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo59060d2 = {"Lmobi/lab/veriff/util/files/FileSelectorProvider$AndroidFileSelectorProvider;", "Lmobi/lab/veriff/util/files/FileSelectorProvider;", "()V", "create", "Lmobi/lab/veriff/util/files/FileSelector;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "listener", "Lmobi/lab/veriff/util/files/FileSelector$Listener;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.xj$a */
    public static final class C22690a implements C22689xj {
        public C22686xi create(AppCompatActivity appCompatActivity, C22686xi.C22688b bVar) {
            C24362h.m61211f(appCompatActivity, "activity");
            C24362h.m61211f(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            return new C22686xi.C22687a(appCompatActivity, bVar);
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, mo59060d2 = {"Lmobi/lab/veriff/util/files/FileSelectorProvider$Companion;", "", "()V", "override", "Lmobi/lab/veriff/util/files/FileSelectorProvider;", "getOverride", "()Lmobi/lab/veriff/util/files/FileSelectorProvider;", "setOverride", "(Lmobi/lab/veriff/util/files/FileSelectorProvider;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.xj$b */
    public static final class C22691b {

        /* renamed from: a */
        public static final /* synthetic */ C22691b f57343a = new C22691b();

        private C22691b() {
        }

        /* renamed from: a */
        public final C22689xj mo57076a() {
            return null;
        }
    }

    C22686xi create(AppCompatActivity appCompatActivity, C22686xi.C22688b bVar);
}
