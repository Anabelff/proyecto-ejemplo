package com.unisys.herencias;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Casa {
    private String dirección;
    private Float metrosCuadrados;

    Casa(){
        this.dirección="";
        this.metrosCuadrados=0.0F;
    }

}

