package com.mohammed.myjhipsterapp.service.mapper;

import com.mohammed.myjhipsterapp.domain.*;
import com.mohammed.myjhipsterapp.service.dto.RegionDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Region} and its DTO {@link RegionDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface RegionMapper extends EntityMapper<RegionDTO, Region> {



    default Region fromId(Long id) {
        if (id == null) {
            return null;
        }
        Region region = new Region();
        region.setId(id);
        return region;
    }
}
