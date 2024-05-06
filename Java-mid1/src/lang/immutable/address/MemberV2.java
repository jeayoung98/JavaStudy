package lang.immutable.address;

public class MemberV2 {
    private String name;
    private final ImmutableAddress address;

    public MemberV2(String name, ImmutableAddress address) {
        this.name = name;
        this.address = address;
    }

    public ImmutableAddress getAddress() {
        return address;
    }

//    public void setAddress(ImmutableAddress address) {
//        this.address = ImmutableAddress;
//    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
