package entity;

public class MobilePhone {
    //必选属性
    private String CPU;
    private String battery;
    private String memory;
    private String screen;

    //可选属性
    private String camera;
    private String GPS;
    private String NFC;
    private String fingerprintIdentification;

    private MobilePhone(Builder builder) {
        this.CPU = builder.CPU;
        this.memory = builder.memory;
        this.battery = builder.battery;
        this.screen = builder.screen;
        this.GPS = builder.GPS;
        this.NFC = builder.NFC;
        this.camera = builder.camera;
        this.fingerprintIdentification = builder.fingerprintIdentification;
    }

    public static class Builder {
        //必选属性
        private String CPU;
        private String battery;
        private String memory;
        private String screen;

        //可选属性
        private String camera;
        private String GPS;
        private String NFC;
        private String fingerprintIdentification;

        public Builder(String CPU, String battery, String memory, String screen) {
            this.CPU = CPU;
            this.battery = battery;
            this.memory = memory;
            this.screen = screen;
        }

        public Builder GPS(String GPS) {
            this.GPS = GPS;
            return this;
        }

        public Builder NFC(String NFC) {
            this.NFC = NFC;
            return this;
        }

        public Builder camera(String camera) {
            this.camera = camera;
            return this;
        }

        public Builder fingerprintIdentification(String fingerprintIdentification) {
            this.fingerprintIdentification = fingerprintIdentification;
            return this;
        }

        public MobilePhone build() {
            return new MobilePhone(this);
        }
    }
}

