package com.fisher.service;

import java.util.List;

import com.fisher.pojo.Merchandise;

public interface MerchandiseService {
    public Merchandise getMerchandise(int merchandiseId);
    
    public List<Merchandise> getMerchandises(Merchandise merchandise);
    
}
