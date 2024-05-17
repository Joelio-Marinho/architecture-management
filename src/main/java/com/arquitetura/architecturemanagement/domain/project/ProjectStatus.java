package com.arquitetura.architecturemanagement.domain.project;

import com.arquitetura.architecturemanagement.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public enum ProjectStatus {
    APPROVED(1,"approved"),
    PENDING(2,"pending"),
    FINISHED(3,"finished"),
    CANCELED(4,"canceled");

    private Integer cod;
    private String description;

    ProjectStatus(Integer cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public static ProjectStatus toEnum(Integer cod) throws BusinessException {
        if (cod == null){
            return null;
        }
        for (ProjectStatus x : ProjectStatus.values()){
            if(cod.equals(x.getCod())){
                return x;
            }
        }
        throw new BusinessException("invalid.id", new ResponseStatusException(HttpStatus.BAD_REQUEST));
    }
}
