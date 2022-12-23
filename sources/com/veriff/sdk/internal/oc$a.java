package com.veriff.sdk.internal;

import com.appboy.support.AppboyFileUtils;
import com.veriff.sdk.detector.Face;
import com.veriff.sdk.detector.Rectangle;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input;", "", "()V", "CaptureManually", "Faces", "ManualFallbackClicked", "PhotoCaptureSuccess", "PhotoReady", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input$Faces;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input$ManualFallbackClicked;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input$CaptureManually;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input$PhotoCaptureSuccess;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input$PhotoReady;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public abstract class oc$a {

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input$CaptureManually;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.oc$a$a */
    public static final class C22170a extends oc$a {

        /* renamed from: a */
        public static final C22170a f55900a = new C22170a();

        private C22170a() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input$Faces;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input;", "faces", "", "Lcom/veriff/sdk/detector/Face;", "fps", "", "overlayRectangle", "Lcom/veriff/sdk/detector/Rectangle;", "(Ljava/util/List;FLcom/veriff/sdk/detector/Rectangle;)V", "getFaces", "()Ljava/util/List;", "getFps", "()F", "getOverlayRectangle", "()Lcom/veriff/sdk/detector/Rectangle;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.oc$a$b */
    public static final class C22171b extends oc$a {

        /* renamed from: a */
        private final List<Face> f55901a;

        /* renamed from: b */
        private final float f55902b;

        /* renamed from: c */
        private final Rectangle f55903c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22171b(List<Face> list, float f, Rectangle rectangle) {
            super((DefaultConstructorMarker) null);
            C24362h.m61211f(list, "faces");
            C24362h.m61211f(rectangle, "overlayRectangle");
            this.f55901a = list;
            this.f55902b = f;
            this.f55903c = rectangle;
        }

        /* renamed from: a */
        public final List<Face> mo56080a() {
            return this.f55901a;
        }

        /* renamed from: b */
        public final float mo56081b() {
            return this.f55902b;
        }

        /* renamed from: c */
        public final Rectangle mo56082c() {
            return this.f55903c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22171b)) {
                return false;
            }
            C22171b bVar = (C22171b) obj;
            return C24362h.m61206a(this.f55901a, bVar.f55901a) && Float.compare(this.f55902b, bVar.f55902b) == 0 && C24362h.m61206a(this.f55903c, bVar.f55903c);
        }

        public int hashCode() {
            List<Face> list = this.f55901a;
            int i = 0;
            int floatToIntBits = (Float.floatToIntBits(this.f55902b) + ((list != null ? list.hashCode() : 0) * 31)) * 31;
            Rectangle rectangle = this.f55903c;
            if (rectangle != null) {
                i = rectangle.hashCode();
            }
            return floatToIntBits + i;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Faces(faces=");
            k.append(this.f55901a);
            k.append(", fps=");
            k.append(this.f55902b);
            k.append(", overlayRectangle=");
            k.append(this.f55903c);
            k.append(")");
            return k.toString();
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input$ManualFallbackClicked;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.oc$a$c */
    public static final class C22172c extends oc$a {

        /* renamed from: a */
        public static final C22172c f55904a = new C22172c();

        private C22172c() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input$PhotoCaptureSuccess;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.oc$a$d */
    public static final class C22173d extends oc$a {

        /* renamed from: a */
        public static final C22173d f55905a = new C22173d();

        private C22173d() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, mo59060d2 = {"Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input$PhotoReady;", "Lcom/veriff/sdk/views/autocapture/AutoCaptureMvl$Input;", "photoConf", "Lmobi/lab/veriff/fragment/PhotoConf;", "file", "Ljava/io/File;", "(Lmobi/lab/veriff/fragment/PhotoConf;Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "getPhotoConf", "()Lmobi/lab/veriff/fragment/PhotoConf;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.oc$a$e */
    public static final class C22174e extends oc$a {

        /* renamed from: a */
        private final C22660wl f55906a;

        /* renamed from: b */
        private final File f55907b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22174e(C22660wl wlVar, File file) {
            super((DefaultConstructorMarker) null);
            C24362h.m61211f(wlVar, "photoConf");
            C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
            this.f55906a = wlVar;
            this.f55907b = file;
        }

        /* renamed from: a */
        public final C22660wl mo56086a() {
            return this.f55906a;
        }

        /* renamed from: b */
        public final File mo56087b() {
            return this.f55907b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22174e)) {
                return false;
            }
            C22174e eVar = (C22174e) obj;
            return C24362h.m61206a(this.f55906a, eVar.f55906a) && C24362h.m61206a(this.f55907b, eVar.f55907b);
        }

        public int hashCode() {
            C22660wl wlVar = this.f55906a;
            int i = 0;
            int hashCode = (wlVar != null ? wlVar.hashCode() : 0) * 31;
            File file = this.f55907b;
            if (file != null) {
                i = file.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("PhotoReady(photoConf=");
            k.append(this.f55906a);
            k.append(", file=");
            k.append(this.f55907b);
            k.append(")");
            return k.toString();
        }
    }

    private oc$a() {
    }

    public /* synthetic */ oc$a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
