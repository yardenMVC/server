// StudentIdAndIdMismatch.java
package org.example.stage1.exception;

/**
 * Exception thrown when the ID in the path does not match the ID in the request body.
 * This is used to ensure that the correct student is being updated.
 */
public class StudentIdAndIdMismatch extends RuntimeException {
    public StudentIdAndIdMismatch(String message) {
        super(message);
    }
}