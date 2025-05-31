package symbolTable;

/**
 * Represents a semantic error detected during Angular compilation.
 * These errors occur when code is syntactically correct but violates
 * Angular's semantic rules.
 */
public class SemanticError extends RuntimeException {
    private final String errorCode;
    private final int line;
    private final int column;
    private final String fileName;
    private final String detailedMessage;

    /**
     * Creates a new SemanticError with basic information
     * @param message The error message
     * @param line The line number where the error occurred
     */
    public SemanticError(String message, int line) {
        this("ANGULAR_SEMANTIC", message, line, -1, null, null);
    }

    /**
     * Creates a new SemanticError with complete information
     * @param errorCode A unique error code (e.g., "NG2001")
     * @param message The error message
     * @param line The line number where the error occurred
     * @param column The column number where the error occurred
     * @param fileName The source file where the error occurred
     * @param detailedMessage More detailed explanation of the error
     */
    public SemanticError(String errorCode, String message, int line, int column,
                         String fileName, String detailedMessage) {
        super(formatMessage(errorCode, message, line, column, fileName));
        this.errorCode = errorCode;
        this.line = line;
        this.column = column;
        this.fileName = fileName;
        this.detailedMessage = detailedMessage != null ? detailedMessage : message;
    }

    private static String formatMessage(String errorCode, String message,
                                        int line, int column, String fileName) {
        StringBuilder sb = new StringBuilder();

        if (errorCode != null) {
            sb.append("[").append(errorCode).append("] ");
        }

        sb.append(message);

        if (fileName != null) {
            sb.append(" (File: ").append(fileName).append(")");
        }

        if (line > 0) {
            sb.append(" at line ").append(line);
            if (column > 0) {
                sb.append(":").append(column);
            }
        }

        return sb.toString();
    }

    // Getters
    public String getErrorCode() { return errorCode; }
    public int getLine() { return line; }
    public int getColumn() { return column; }
    public String getFileName() { return fileName; }
    public String getDetailedMessage() { return detailedMessage; }

    /**
     * Creates a builder for constructing SemanticError instances
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder pattern for SemanticError
     */
    public static class Builder {
        private String errorCode = "ANGULAR_SEMANTIC";
        private String message;
        private int line = -1;
        private int column = -1;
        private String fileName;
        private String detailedMessage;

        public Builder withErrorCode(String code) {
            this.errorCode = code;
            return this;
        }

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder atLocation(int line, int column) {
            this.line = line;
            this.column = column;
            return this;
        }

        public Builder inFile(String fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder withDetails(String details) {
            this.detailedMessage = details;
            return this;
        }

        public SemanticError build() {
            if (message == null) {
                throw new IllegalStateException("Error message must be specified");
            }
            return new SemanticError(errorCode, message, line, column, fileName, detailedMessage);
        }
    }
}