package com.veriff.sdk.views.upload;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p358af.C13437d;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, mo59060d2 = {"Lcom/veriff/sdk/views/upload/DecisionState;", "", "()V", "Decided", "Resubmission", "Waiting", "Lcom/veriff/sdk/views/upload/DecisionState$Waiting;", "Lcom/veriff/sdk/views/upload/DecisionState$Resubmission;", "Lcom/veriff/sdk/views/upload/DecisionState$Decided;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.upload.a */
public abstract class C23025a {

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/upload/DecisionState$Decided;", "Lcom/veriff/sdk/views/upload/DecisionState;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.upload.a$a */
    public static final class C23026a extends C23025a {

        /* renamed from: a */
        public static final C23026a f58400a = new C23026a();

        private C23026a() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/upload/DecisionState$Resubmission;", "Lcom/veriff/sdk/views/upload/DecisionState;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.upload.a$b */
    public static final class C23027b extends C23025a {

        /* renamed from: a */
        public static final C23027b f58401a = new C23027b();

        private C23027b() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/views/upload/DecisionState$Waiting;", "Lcom/veriff/sdk/views/upload/DecisionState;", "currentStep", "", "(I)V", "getCurrentStep", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.upload.a$c */
    public static final class C23028c extends C23025a {

        /* renamed from: a */
        private final int f58402a;

        public C23028c(int i) {
            super((DefaultConstructorMarker) null);
            this.f58402a = i;
        }

        /* renamed from: a */
        public final int mo57969a() {
            return this.f58402a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C23028c) && this.f58402a == ((C23028c) obj).f58402a;
            }
            return true;
        }

        public int hashCode() {
            return this.f58402a;
        }

        public String toString() {
            return C13437d.m33707l(C13555b.m33972k("Waiting(currentStep="), this.f58402a, ")");
        }
    }

    private C23025a() {
    }

    public /* synthetic */ C23025a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
