package easy.log_levels;

public class LogLevels {

    public static void main(String[] args) {
        System.out.println(message("[ERROR]: Invalid operation"));
        System.out.println(logLevel("[ERROR]: Invalid operation"));
        System.out.println(reformat("[ERROR]: Invalid operation"));
    }

    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf("]: ") + 3).trim();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]:")).trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
