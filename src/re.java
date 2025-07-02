public class re {
    public static void main(String[] args) {
        boolean passIsValid = true;
        boolean inCarantine = true;
        boolean isPersonal = true;

        String message;
        if (passIsValid && !inCarantine) {
            message = "Проход открыт";
        } else if (isPersonal) {
            message = "Проход открыт только для персонала";
        } else {
            message = "Проход закрыт";
        }
    }
}
