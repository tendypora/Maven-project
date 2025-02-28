package br.com.dio;

import java.time.LocalDate;

import br.com.dio.dto.UserDTO;

public class Main {

    public static void main(String[] args){
        var dto = new UserDTO();
        dto.setId(2);
        dto.setName("Maria");
        dto.setBirthday(null);
        dto.setBirthday(LocalDate.now().minusYears(30));
    }

}