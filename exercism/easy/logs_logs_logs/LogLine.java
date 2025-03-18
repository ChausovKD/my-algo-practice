package easy.logs_logs_logs;

public class LogLine {

    private String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String nameLevel = this.logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]: "));
        return switch (nameLevel) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        return this.getLogLevel().getNumberLogLevel() + ":" + this.logLine.substring(logLine.indexOf("]: ") + 3).trim();
    }
}
