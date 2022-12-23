package com.veriff.sdk.internal;

import android.net.Uri;
import com.appboy.support.AppboyFileUtils;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.data.C24422b;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action;", "", "()V", "AddressCaptureAction", "AddressIntroAction", "InitAction", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$InitAction;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public abstract class nw$a {

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action;", "()V", "CameraBusy", "CameraReady", "CaptureClicked", "CloseClicked", "PhotoCaptureSuccess", "PhotoFileReady", "ResetPhotoCapturing", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction$CaptureClicked;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction$ResetPhotoCapturing;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction$CloseClicked;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction$PhotoCaptureSuccess;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction$PhotoFileReady;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction$CameraBusy;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction$CameraReady;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nw$a$a */
    public static abstract class C22103a extends nw$a {

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction$CameraBusy;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nw$a$a$a */
        public static final class C22104a extends C22103a {

            /* renamed from: a */
            public static final C22104a f55773a = new C22104a();

            private C22104a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction$CameraReady;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nw$a$a$b */
        public static final class C22105b extends C22103a {

            /* renamed from: a */
            public static final C22105b f55774a = new C22105b();

            private C22105b() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction$CaptureClicked;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nw$a$a$c */
        public static final class C22106c extends C22103a {

            /* renamed from: a */
            public static final C22106c f55775a = new C22106c();

            private C22106c() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction$CloseClicked;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nw$a$a$d */
        public static final class C22107d extends C22103a {

            /* renamed from: a */
            public static final C22107d f55776a = new C22107d();

            private C22107d() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction$PhotoCaptureSuccess;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction;", "photoConf", "Lmobi/lab/veriff/fragment/PhotoConf;", "(Lmobi/lab/veriff/fragment/PhotoConf;)V", "getPhotoConf", "()Lmobi/lab/veriff/fragment/PhotoConf;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nw$a$a$e */
        public static final class C22108e extends C22103a {

            /* renamed from: a */
            private final C22660wl f55777a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22108e(C22660wl wlVar) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(wlVar, "photoConf");
                this.f55777a = wlVar;
            }

            /* renamed from: a */
            public final C22660wl mo56021a() {
                return this.f55777a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C22108e) && C24362h.m61206a(this.f55777a, ((C22108e) obj).f55777a);
                }
                return true;
            }

            public int hashCode() {
                C22660wl wlVar = this.f55777a;
                if (wlVar != null) {
                    return wlVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("PhotoCaptureSuccess(photoConf=");
                k.append(this.f55777a);
                k.append(")");
                return k.toString();
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction$PhotoFileReady;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction;", "photoConf", "Lmobi/lab/veriff/fragment/PhotoConf;", "file", "Ljava/io/File;", "(Lmobi/lab/veriff/fragment/PhotoConf;Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "getPhotoConf", "()Lmobi/lab/veriff/fragment/PhotoConf;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nw$a$a$f */
        public static final class C22109f extends C22103a {

            /* renamed from: a */
            private final C22660wl f55778a;

            /* renamed from: b */
            private final File f55779b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22109f(C22660wl wlVar, File file) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(wlVar, "photoConf");
                C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
                this.f55778a = wlVar;
                this.f55779b = file;
            }

            /* renamed from: a */
            public final C22660wl mo56025a() {
                return this.f55778a;
            }

            /* renamed from: b */
            public final File mo56026b() {
                return this.f55779b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C22109f)) {
                    return false;
                }
                C22109f fVar = (C22109f) obj;
                return C24362h.m61206a(this.f55778a, fVar.f55778a) && C24362h.m61206a(this.f55779b, fVar.f55779b);
            }

            public int hashCode() {
                C22660wl wlVar = this.f55778a;
                int i = 0;
                int hashCode = (wlVar != null ? wlVar.hashCode() : 0) * 31;
                File file = this.f55779b;
                if (file != null) {
                    i = file.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("PhotoFileReady(photoConf=");
                k.append(this.f55778a);
                k.append(", file=");
                k.append(this.f55779b);
                k.append(")");
                return k.toString();
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction$ResetPhotoCapturing;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressCaptureAction;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nw$a$a$g */
        public static final class C22110g extends C22103a {

            /* renamed from: a */
            public static final C22110g f55780a = new C22110g();

            private C22110g() {
                super((DefaultConstructorMarker) null);
            }
        }

        private C22103a() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C22103a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action;", "()V", "CloseClicked", "FlowStarted", "GotFiles", "TakeAPhotoClicked", "UploadFileClicked", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction$FlowStarted;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction$UploadFileClicked;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction$TakeAPhotoClicked;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction$CloseClicked;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction$GotFiles;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nw$a$b */
    public static abstract class C22111b extends nw$a {

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction$CloseClicked;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nw$a$b$a */
        public static final class C22112a extends C22111b {

            /* renamed from: a */
            public static final C22112a f55781a = new C22112a();

            private C22112a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction$FlowStarted;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction;", "step", "Lmobi/lab/veriff/data/AuthenticationFlowStep;", "(Lmobi/lab/veriff/data/AuthenticationFlowStep;)V", "getStep", "()Lmobi/lab/veriff/data/AuthenticationFlowStep;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nw$a$b$b */
        public static final class C22113b extends C22111b {

            /* renamed from: a */
            private final C24422b f55782a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22113b(C24422b bVar) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(bVar, "step");
                this.f55782a = bVar;
            }

            /* renamed from: a */
            public final C24422b mo56030a() {
                return this.f55782a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C22113b) && C24362h.m61206a(this.f55782a, ((C22113b) obj).f55782a);
                }
                return true;
            }

            public int hashCode() {
                C24422b bVar = this.f55782a;
                if (bVar != null) {
                    return bVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("FlowStarted(step=");
                k.append(this.f55782a);
                k.append(")");
                return k.toString();
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction$GotFiles;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction;", "selectedUris", "", "Landroid/net/Uri;", "(Ljava/util/List;)V", "getSelectedUris", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nw$a$b$c */
        public static final class C22114c extends C22111b {

            /* renamed from: a */
            private final List<Uri> f55783a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22114c(List<? extends Uri> list) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(list, "selectedUris");
                this.f55783a = list;
            }

            /* renamed from: a */
            public final List<Uri> mo56034a() {
                return this.f55783a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C22114c) && C24362h.m61206a(this.f55783a, ((C22114c) obj).f55783a);
                }
                return true;
            }

            public int hashCode() {
                List<Uri> list = this.f55783a;
                if (list != null) {
                    return list.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("GotFiles(selectedUris=");
                k.append(this.f55783a);
                k.append(")");
                return k.toString();
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction$TakeAPhotoClicked;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nw$a$b$d */
        public static final class C22115d extends C22111b {

            /* renamed from: a */
            public static final C22115d f55784a = new C22115d();

            private C22115d() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction$UploadFileClicked;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$AddressIntroAction;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.nw$a$b$e */
        public static final class C22116e extends C22111b {

            /* renamed from: a */
            public static final C22116e f55785a = new C22116e();

            private C22116e() {
                super((DefaultConstructorMarker) null);
            }
        }

        private C22111b() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C22111b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/address/AddressScreenMvi$Action$InitAction;", "Lcom/veriff/sdk/views/address/AddressScreenMvi$Action;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nw$a$c */
    public static final class C22117c extends nw$a {

        /* renamed from: a */
        public static final C22117c f55786a = new C22117c();

        private C22117c() {
            super((DefaultConstructorMarker) null);
        }
    }

    private nw$a() {
    }

    public /* synthetic */ nw$a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
