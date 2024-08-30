package com.br.elton.designer.patterns.domain.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class ErrorModel {

    private final Integer status;

    private final String message;

}
