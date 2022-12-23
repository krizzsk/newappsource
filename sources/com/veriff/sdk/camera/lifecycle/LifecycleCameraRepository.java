package com.veriff.sdk.camera.lifecycle;

import androidx.lifecycle.C1031o;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.Lifecycle;
import com.veriff.sdk.camera.core.UseCase;
import com.veriff.sdk.camera.core.ViewPort;
import com.veriff.sdk.camera.core.internal.CameraUseCaseAdapter;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import mf0.C24361g;

final class LifecycleCameraRepository {
    private final ArrayDeque<C1033p> mActiveLifecycleOwners = new ArrayDeque<>();
    private final Map<Key, LifecycleCamera> mCameraMap = new HashMap();
    private final Map<LifecycleCameraRepositoryObserver, Set<Key>> mLifecycleObserverMap = new HashMap();
    private final Object mLock = new Object();

    public static abstract class Key {
        public static Key create(C1033p pVar, CameraUseCaseAdapter.CameraId cameraId) {
            return new AutoValue_LifecycleCameraRepository_Key(pVar, cameraId);
        }

        public abstract CameraUseCaseAdapter.CameraId getCameraId();

        public abstract C1033p getLifecycleOwner();
    }

    public static class LifecycleCameraRepositoryObserver implements C1031o {
        private final LifecycleCameraRepository mLifecycleCameraRepository;
        private final C1033p mLifecycleOwner;

        public LifecycleCameraRepositoryObserver(C1033p pVar, LifecycleCameraRepository lifecycleCameraRepository) {
            this.mLifecycleOwner = pVar;
            this.mLifecycleCameraRepository = lifecycleCameraRepository;
        }

        public C1033p getLifecycleOwner() {
            return this.mLifecycleOwner;
        }

        @C1045x(Lifecycle.Event.ON_DESTROY)
        public void onDestroy(C1033p pVar) {
            this.mLifecycleCameraRepository.unregisterLifecycle(pVar);
        }

        @C1045x(Lifecycle.Event.ON_START)
        public void onStart(C1033p pVar) {
            this.mLifecycleCameraRepository.setActive(pVar);
        }

        @C1045x(Lifecycle.Event.ON_STOP)
        public void onStop(C1033p pVar) {
            this.mLifecycleCameraRepository.setInactive(pVar);
        }
    }

    private LifecycleCameraRepositoryObserver getLifecycleCameraRepositoryObserver(C1033p pVar) {
        synchronized (this.mLock) {
            for (LifecycleCameraRepositoryObserver next : this.mLifecycleObserverMap.keySet()) {
                if (pVar.equals(next.getLifecycleOwner())) {
                    return next;
                }
            }
            return null;
        }
    }

    private boolean hasUseCaseBound(C1033p pVar) {
        synchronized (this.mLock) {
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(pVar);
            if (lifecycleCameraRepositoryObserver == null) {
                return false;
            }
            for (Key key : this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver)) {
                LifecycleCamera lifecycleCamera = this.mCameraMap.get(key);
                lifecycleCamera.getClass();
                if (!lifecycleCamera.getUseCases().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    private void registerCamera(LifecycleCamera lifecycleCamera) {
        Set set;
        synchronized (this.mLock) {
            C1033p lifecycleOwner = lifecycleCamera.getLifecycleOwner();
            Key create = Key.create(lifecycleOwner, lifecycleCamera.getCameraUseCaseAdapter().getCameraId());
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
            if (lifecycleCameraRepositoryObserver != null) {
                set = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver);
            } else {
                set = new HashSet();
            }
            set.add(create);
            this.mCameraMap.put(create, lifecycleCamera);
            if (lifecycleCameraRepositoryObserver == null) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver2 = new LifecycleCameraRepositoryObserver(lifecycleOwner, this);
                this.mLifecycleObserverMap.put(lifecycleCameraRepositoryObserver2, set);
                lifecycleOwner.getLifecycle().mo4224a(lifecycleCameraRepositoryObserver2);
            }
        }
    }

    private void suspendUseCases(C1033p pVar) {
        synchronized (this.mLock) {
            for (Key key : this.mLifecycleObserverMap.get(getLifecycleCameraRepositoryObserver(pVar))) {
                LifecycleCamera lifecycleCamera = this.mCameraMap.get(key);
                lifecycleCamera.getClass();
                lifecycleCamera.suspend();
            }
        }
    }

    private void unsuspendUseCases(C1033p pVar) {
        synchronized (this.mLock) {
            for (Key key : this.mLifecycleObserverMap.get(getLifecycleCameraRepositoryObserver(pVar))) {
                LifecycleCamera lifecycleCamera = this.mCameraMap.get(key);
                lifecycleCamera.getClass();
                if (!lifecycleCamera.getUseCases().isEmpty()) {
                    lifecycleCamera.unsuspend();
                }
            }
        }
    }

    public void bindToLifecycleCamera(LifecycleCamera lifecycleCamera, ViewPort viewPort, Collection<UseCase> collection) {
        boolean z;
        synchronized (this.mLock) {
            if (!collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61175n(z);
            C1033p lifecycleOwner = lifecycleCamera.getLifecycleOwner();
            for (Key key : this.mLifecycleObserverMap.get(getLifecycleCameraRepositoryObserver(lifecycleOwner))) {
                LifecycleCamera lifecycleCamera2 = this.mCameraMap.get(key);
                lifecycleCamera2.getClass();
                if (!lifecycleCamera2.equals(lifecycleCamera)) {
                    if (!lifecycleCamera2.getUseCases().isEmpty()) {
                        throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                    }
                }
            }
            try {
                lifecycleCamera.getCameraUseCaseAdapter().setViewPort(viewPort);
                lifecycleCamera.bind(collection);
                if (lifecycleOwner.getLifecycle().mo4225b().isAtLeast(Lifecycle.State.STARTED)) {
                    setActive(lifecycleOwner);
                }
            } catch (CameraUseCaseAdapter.CameraException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
    }

    public LifecycleCamera createLifecycleCamera(C1033p pVar, CameraUseCaseAdapter cameraUseCaseAdapter) {
        boolean z;
        LifecycleCamera lifecycleCamera;
        synchronized (this.mLock) {
            if (this.mCameraMap.get(Key.create(pVar, cameraUseCaseAdapter.getCameraId())) == null) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61177o(z, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            if (pVar.getLifecycle().mo4225b() != Lifecycle.State.DESTROYED) {
                lifecycleCamera = new LifecycleCamera(pVar, cameraUseCaseAdapter);
                if (cameraUseCaseAdapter.getUseCases().isEmpty()) {
                    lifecycleCamera.suspend();
                }
                registerCamera(lifecycleCamera);
            } else {
                throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
            }
        }
        return lifecycleCamera;
    }

    public LifecycleCamera getLifecycleCamera(C1033p pVar, CameraUseCaseAdapter.CameraId cameraId) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.mLock) {
            lifecycleCamera = this.mCameraMap.get(Key.create(pVar, cameraId));
        }
        return lifecycleCamera;
    }

    public Collection<LifecycleCamera> getLifecycleCameras() {
        Collection<LifecycleCamera> unmodifiableCollection;
        synchronized (this.mLock) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.mCameraMap.values());
        }
        return unmodifiableCollection;
    }

    public void setActive(C1033p pVar) {
        synchronized (this.mLock) {
            if (hasUseCaseBound(pVar)) {
                if (this.mActiveLifecycleOwners.isEmpty()) {
                    this.mActiveLifecycleOwners.push(pVar);
                } else {
                    C1033p peek = this.mActiveLifecycleOwners.peek();
                    if (!pVar.equals(peek)) {
                        suspendUseCases(peek);
                        this.mActiveLifecycleOwners.remove(pVar);
                        this.mActiveLifecycleOwners.push(pVar);
                    }
                }
                unsuspendUseCases(pVar);
            }
        }
    }

    public void setInactive(C1033p pVar) {
        synchronized (this.mLock) {
            this.mActiveLifecycleOwners.remove(pVar);
            suspendUseCases(pVar);
            if (!this.mActiveLifecycleOwners.isEmpty()) {
                unsuspendUseCases(this.mActiveLifecycleOwners.peek());
            }
        }
    }

    public void unbindAll() {
        synchronized (this.mLock) {
            for (Key key : this.mCameraMap.keySet()) {
                LifecycleCamera lifecycleCamera = this.mCameraMap.get(key);
                lifecycleCamera.unbindAll();
                setInactive(lifecycleCamera.getLifecycleOwner());
            }
        }
    }

    public void unregisterLifecycle(C1033p pVar) {
        synchronized (this.mLock) {
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(pVar);
            if (lifecycleCameraRepositoryObserver != null) {
                setInactive(pVar);
                for (Key remove : this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver)) {
                    this.mCameraMap.remove(remove);
                }
                this.mLifecycleObserverMap.remove(lifecycleCameraRepositoryObserver);
                lifecycleCameraRepositoryObserver.getLifecycleOwner().getLifecycle().mo4226c(lifecycleCameraRepositoryObserver);
            }
        }
    }
}
