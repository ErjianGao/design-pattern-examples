import entity.MobilePhone;

public class Test {
    public static void main(String[] args) {
        MobilePhone iphone8 = new MobilePhone.Builder("A11处理器", "3000毫安","3GB", "5.5英寸")
                .camera("苹果摄像头")
                .GPS("卫星导航")
                .fingerprintIdentification("最后一款有指纹识别的苹果手机")
                .build();
    }
}
