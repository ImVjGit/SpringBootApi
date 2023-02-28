package com.AirSystem.Service;

import com.AirSystem.Entity.Source;

import java.util.List;

public interface SourceService {

    public Source saveSource(Source source);
    public List<Source>  getAllSource();
    public Source getSourceById(Long sourceId);
    public void deleteSourceById(Long sourceId);
    public void updateSourceById(Long sourceId, Source source);

}
