public class StudentBMI {

    public static String[] bmiStudents(Student std[]) {
        String[] something = new String[std.length];
        for (int i = 0; i < something.length; i++) {
            something[i] = bmiCategory(std[i]);
        }
        return something;
    }

    public static String bmiCategory(Student std) {
        String status = "";
        double result = std.getBMI();

        if (result < 18.5) {
            status = "under weight";
        } else if (result > 18.5 && result < 25) {
            status = "normal weight";
        } else if (result > 25 && result < 30) {
            status = "over weight";
        } else if (result == 30 || result > 30) {
            status = "obesity";
        }

        if (std.getHeight() == 0 || std.getWeight() < 0 || std.getHeight() < 0) {
            status = "none";
        }

        return status;
    }
}
