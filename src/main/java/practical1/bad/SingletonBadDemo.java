package practical1.bad;

public class SingletonBadDemo {

    public static void main(String[] args) {
        CollegeConfigBad config1 = new CollegeConfigBad();
        CollegeConfigBad config2 = new CollegeConfigBad();

        System.out.println(config1.getCollegeName());
        System.out.println(config2.getCollegeName());

        System.out.println(config1 == config2);
    }
}
