package com.michelle.gesbiblio.Service;

import com.michelle.gesbiblio.dto.OuvrageDto;
import com.michelle.gesbiblio.dto.OuvrageRequestDto;
import org.springframework.stereotype.Service;

@Service()
public class OuvrageServiceImpl implements OuvrageService{

    @Override
    public OuvrageDto save(OuvrageRequestDto OuvrageRequestDto) {
        return null;
    }

    @Override
    public OuvrageDto findById(Integer id) {
        return null;
    }

    @Override
    public OuvrageDto findByNom(String nom) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public OuvrageDto update(OuvrageRequestDto OuvrageRequestDto, Integer id) {
        return null;
    }
}
