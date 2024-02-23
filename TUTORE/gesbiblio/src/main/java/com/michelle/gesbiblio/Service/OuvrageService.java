package com.michelle.gesbiblio.Service;

import com.michelle.gesbiblio.dto.OuvrageDto;
import com.michelle.gesbiblio.dto.OuvrageRequestDto;

public interface OuvrageService {
    OuvrageDto save(OuvrageRequestDto OuvrageRequestDto);
    OuvrageDto findById(Integer id);

    OuvrageDto findByNom(String nom);

    void delete (Integer id);

    OuvrageDto update(OuvrageRequestDto OuvrageRequestDto ,Integer id);




}
