package zendesk.core;

public final class AnonymousIdentity implements Identity {
    private String email;
    private String name;
    private String sdkGuid;

    public static class Builder {
        /* access modifiers changed from: private */
        public String email;
        /* access modifiers changed from: private */
        public String name;

        public Identity build() {
            return new AnonymousIdentity(this);
        }

        public Builder withEmailIdentifier(String str) {
            this.email = str;
            return this;
        }

        public Builder withNameIdentifier(String str) {
            this.name = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousIdentity.class != obj.getClass()) {
            return false;
        }
        AnonymousIdentity anonymousIdentity = (AnonymousIdentity) obj;
        String str = this.email;
        if (str == null ? anonymousIdentity.email != null : !str.equals(anonymousIdentity.email)) {
            return false;
        }
        String str2 = this.name;
        String str3 = anonymousIdentity.name;
        if (str2 == null ? str3 == null : str2.equals(str3)) {
            return true;
        }
        return false;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public String getSdkGuid() {
        return this.sdkGuid;
    }

    public int hashCode() {
        int i;
        String str = this.email;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.name;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public void setSdkGuid(String str) {
        this.sdkGuid = str;
    }

    public AnonymousIdentity() {
    }

    private AnonymousIdentity(Builder builder) {
        this.email = builder.email;
        this.name = builder.name;
    }
}
