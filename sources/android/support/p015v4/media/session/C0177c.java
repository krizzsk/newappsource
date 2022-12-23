package android.support.p015v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p015v4.media.MediaDescriptionCompat;
import android.support.p015v4.media.MediaMetadataCompat;
import android.support.p015v4.media.session.C0172a;
import android.support.p015v4.media.session.MediaControllerCompat$MediaControllerImplApi21;
import android.support.p015v4.media.session.MediaSessionCompat;
import android.support.p015v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
public abstract class C0177c implements IBinder.DeathRecipient {

    /* renamed from: a */
    public MediaControllerCompat$MediaControllerImplApi21.C0165a f485a;

    /* renamed from: android.support.v4.media.session.c$a */
    public static class C0178a extends MediaController.Callback {

        /* renamed from: a */
        public final WeakReference<C0177c> f486a;

        public C0178a(C0177c cVar) {
            this.f486a = new WeakReference<>(cVar);
        }

        public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            if (this.f486a.get() != null) {
                playbackInfo.getPlaybackType();
                playbackInfo.getAudioAttributes();
                if (Build.VERSION.SDK_INT >= 26) {
                }
                playbackInfo.getVolumeControl();
                playbackInfo.getMaxVolume();
                playbackInfo.getCurrentVolume();
            }
        }

        public final void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m306a(bundle);
            C0177c cVar = this.f486a.get();
        }

        public final void onMetadataChanged(MediaMetadata mediaMetadata) {
            if (this.f486a.get() != null) {
                Parcelable.Creator<MediaMetadataCompat> creator = MediaMetadataCompat.CREATOR;
                if (mediaMetadata != null) {
                    Parcel obtain = Parcel.obtain();
                    mediaMetadata.writeToParcel(obtain, 0);
                    obtain.setDataPosition(0);
                    obtain.recycle();
                    MediaMetadataCompat.CREATOR.createFromParcel(obtain).getClass();
                }
            }
        }

        public final void onPlaybackStateChanged(PlaybackState playbackState) {
            ArrayList arrayList;
            PlaybackStateCompat.CustomAction customAction;
            C0177c cVar = this.f486a.get();
            if (cVar != null && cVar.f485a == null) {
                Bundle bundle = null;
                if (playbackState != null) {
                    List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
                    if (customActions != null) {
                        ArrayList arrayList2 = new ArrayList(customActions.size());
                        for (PlaybackState.CustomAction next : customActions) {
                            if (next != null) {
                                PlaybackState.CustomAction customAction2 = next;
                                Bundle extras = customAction2.getExtras();
                                MediaSessionCompat.m306a(extras);
                                customAction = new PlaybackStateCompat.CustomAction(customAction2.getAction(), customAction2.getName(), customAction2.getIcon(), extras);
                            } else {
                                customAction = null;
                            }
                            arrayList2.add(customAction);
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    if (Build.VERSION.SDK_INT >= 22) {
                        bundle = playbackState.getExtras();
                        MediaSessionCompat.m306a(bundle);
                    }
                    new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), bundle);
                }
            }
        }

        public final void onQueueChanged(List<MediaSession.QueueItem> list) {
            MediaSessionCompat.QueueItem queueItem;
            if (this.f486a.get() != null && list != null) {
                ArrayList arrayList = new ArrayList();
                for (MediaSession.QueueItem next : list) {
                    if (next != null) {
                        MediaSession.QueueItem queueItem2 = next;
                        queueItem = new MediaSessionCompat.QueueItem(MediaDescriptionCompat.m276b(queueItem2.getDescription()), queueItem2.getQueueId());
                    } else {
                        queueItem = null;
                    }
                    arrayList.add(queueItem);
                }
            }
        }

        public final void onQueueTitleChanged(CharSequence charSequence) {
            C0177c cVar = this.f486a.get();
        }

        public final void onSessionDestroyed() {
            C0177c cVar = this.f486a.get();
        }

        public final void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m306a(bundle);
            C0177c cVar = this.f486a.get();
        }
    }

    /* renamed from: android.support.v4.media.session.c$b */
    public static class C0179b extends C0172a.C0173a {

        /* renamed from: b */
        public final WeakReference<C0177c> f487b;

        public C0179b(C0177c cVar) {
            this.f487b = new WeakReference<>(cVar);
        }
    }

    public C0177c() {
        new C0178a(this);
    }

    public final void binderDied() {
    }
}
