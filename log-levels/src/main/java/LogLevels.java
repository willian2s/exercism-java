public class LogLevels {

    public static String message(String logLine) {
        String message = logLine.split(":")[1].trim();
        return message;
    }

    public static String logLevel(String logLine) {
        String level = logLine.split(":")[0].trim();
        return level.substring(level.indexOf("[") + 1, level.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine ) + " (" + logLevel(logLine) + ")";
    }
}
