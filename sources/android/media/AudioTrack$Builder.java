package android.media;

import android.annotation.NonNull;

public /* synthetic */ class AudioTrack$Builder {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ AudioTrack build() throws UnsupportedOperationException;

    @NonNull
    public native /* synthetic */ AudioTrack$Builder setAudioAttributes(@NonNull AudioAttributes audioAttributes) throws IllegalArgumentException;

    @NonNull
    public native /* synthetic */ AudioTrack$Builder setAudioFormat(@NonNull AudioFormat audioFormat) throws IllegalArgumentException;

    @NonNull
    public native /* synthetic */ AudioTrack$Builder setBufferSizeInBytes(int i) throws IllegalArgumentException;

    @NonNull
    public native /* synthetic */ AudioTrack$Builder setSessionId(int i) throws IllegalArgumentException;

    @NonNull
    public native /* synthetic */ AudioTrack$Builder setTransferMode(int i) throws IllegalArgumentException;
}
