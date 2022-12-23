package com.fyber.inneractive.sdk.external;

public class InneractiveVideoError extends InneractiveError {

    /* renamed from: a */
    public final Error f9523a;

    /* renamed from: b */
    public Throwable f9524b;

    public enum Error {
        ERROR_NO_MEDIA_FILES("ErrorNoMediaFiles", true),
        ERROR_FAILED_PLAYING_MEDIA_FILE("ErrorPlayingMediaFile", false),
        ERROR_FAILED_PLAYING_ALL_MEDIA_FILES("ErrorPlayingAllMediaFile", true),
        ERROR_PRE_BUFFER_TIMEOUT("ErrorPreBufferTimeout", false),
        ERROR_BUFFER_TIMEOUT("ErrorBufferTimeout", false);
        

        /* renamed from: a */
        public String f9526a;

        /* renamed from: b */
        public boolean f9527b;

        /* access modifiers changed from: public */
        Error(String str, boolean z) {
            this.f9526a = str;
            this.f9527b = z;
        }

        public String getErrorString() {
            return this.f9526a;
        }

        public boolean isFatal() {
            return this.f9527b;
        }
    }

    public InneractiveVideoError(Error error) {
        this.f9523a = error;
    }

    public String description() {
        if (this.f9524b == null) {
            return this.f9523a.getErrorString();
        }
        return this.f9523a.getErrorString() + ": " + this.f9524b;
    }

    public Throwable getCause() {
        return this.f9524b;
    }

    public Error getPlayerError() {
        return this.f9523a;
    }

    public InneractiveVideoError(Error error, Throwable th) {
        this(error);
        this.f9524b = th;
    }
}
