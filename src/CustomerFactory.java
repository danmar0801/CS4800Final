public class CustomerFactory implements UserFactory {
    @Override
    public User createUser(String name, String address, String county) {
        return new Customer(name, address, county, "No restrictions"); // Default dietary restriction
    }
}
