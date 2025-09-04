public class App {
    public static void main(String[] args) throws Exception {
        // demoWeekDay();
        demoUser();
    }

    private static void demoUser() {
        var cesar = new User("cesar", "cesar@email.com", "123456", true, UserRole.ADMIN);
        var jose = new User("jose", "jose@email.com", "123456");
        var UserArray = new User[] { cesar, jose };

        for (int i = 0; i < UserArray.length; i++) {
            var user = UserArray[i];
            switch (user.getRole()) {
                case ADMIN:
                    System.out.printf("%s eres el superusuario%n", user);
                    break;
                case CLIENT:
                    System.out.printf("%s eres el cliente preferido%n", user);
                    break;
                case PROVIDER:
                    System.out.printf("%s eres el proveedor por defecto%n", user);
                    break;
                case USER:
                    System.out.printf("%s ¿Que haces aqui?%n", user);
                    break;
                case EMPLOYEE:
                    System.out.printf("%s ¿No estas trabajando?%n", user);
                    break;
                default:
                    break;
            }
        }
    }

    private static void demoWeekDay() {
        WeekDay day = null;
        day = WeekDay.FRIDAY;
        System.out.println(day);
    }
}
