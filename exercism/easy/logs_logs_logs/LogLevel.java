package easy.logs_logs_logs;

public enum LogLevel {
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42),
    UNKNOWN(0);

    private final int numberLogLevel;

    LogLevel(int numberLogLevel) {
        this.numberLogLevel = numberLogLevel;
    }

    public int getNumberLogLevel() {
        return this.numberLogLevel;
    }
}

class Main {

    public static void main(String[] args) {
        LogLine logLine1 = new LogLine("[INF]: File deleted");
        logLine1.getLogLevel();

        System.out.println(LogLevel.TRACE.getNumberLogLevel());
        LogLine logLine2 = new LogLine("[ABC]: We're no strangers to love");
        System.out.println(logLine2.getOutputForShortLog());
    }
}
