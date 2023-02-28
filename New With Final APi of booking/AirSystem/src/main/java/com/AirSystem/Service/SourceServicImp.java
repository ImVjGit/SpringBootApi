package com.AirSystem.Service;

import com.AirSystem.Entity.Source;
import com.AirSystem.Repository.SourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class SourceServicImp implements SourceService   {

    @Autowired
    private SourceRepository sourceRepository;

    @Override
    public Source saveSource(Source source) {
        return sourceRepository.save(source);
    }


    @Override
    public List<Source> getAllSource() {
        return  sourceRepository.findAll();
    }

    @Override
    public Source getSourceById(Long sourceId) {
        return sourceRepository.findById(sourceId).get();
    }

    @Override
    public void deleteSourceById(Long sourceId) {
        sourceRepository.deleteById(sourceId);
    }

    @Override
    public void updateSourceById(Long sourceId, Source source) {
            Source s = sourceRepository.findById(sourceId).get();
            if(Objects.nonNull(source.getSourceName())&& !"".equalsIgnoreCase(source.getSourceName()))
            {
                s.setSourceName(source.getSourceName());
            }

            sourceRepository.save(s);


    }


}
