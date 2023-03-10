package zendesk.support;

class AttachmentSettings {
    private static AttachmentSettings DEFAULT = new AttachmentSettings(false, 0);
    private boolean enabled;
    private long maxAttachmentSize;

    public AttachmentSettings(boolean z, long j) {
        this.enabled = z;
        this.maxAttachmentSize = j;
    }

    public static AttachmentSettings defaultSettings() {
        return DEFAULT;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public AttachmentSettings() {
    }
}
