package medium.error_handling;

class CustomUncheckedException extends RuntimeException {

    CustomUncheckedException() {
        super();
    }

    CustomUncheckedException(String message) {
        super(message);
    }

}
