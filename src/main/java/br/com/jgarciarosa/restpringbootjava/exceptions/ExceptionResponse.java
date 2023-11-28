package br.com.jgarciarosa.restpringbootjava.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Date;

@Getter
@AllArgsConstructor
public class ExceptionResponse implements Serializable {

    private final Date timeStamp;
    private final String message;
    private final String details;

}
