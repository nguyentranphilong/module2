package thipassmodule2.commom;

public class Validation {
    private static final String REGEX_BIRTHDAY = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])";

    public static boolean isValidBirthday(String birthday) {
        return !birthday.matches(REGEX_BIRTHDAY);
    }
}
