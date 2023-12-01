package br.com.jgarciarosa.restpringbootjava.data.vo.v1;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class PersonVO implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
}
