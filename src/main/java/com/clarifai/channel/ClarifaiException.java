package com.clarifai.channel;

public class ClarifaiException extends RuntimeException {
  public ClarifaiException(String message) {
    super(message);
  }

  public ClarifaiException(Exception ex) {
    super(ex);
  }
}
