package com.mohammed.myjhipsterapp.service.mapper;

import com.mohammed.myjhipsterapp.domain.*;
import com.mohammed.myjhipsterapp.service.dto.TaskDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Task} and its DTO {@link TaskDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface TaskMapper extends EntityMapper<TaskDTO, Task> {


    @Mapping(target = "jobs", ignore = true)
    @Mapping(target = "removeJob", ignore = true)
    Task toEntity(TaskDTO taskDTO);

    default Task fromId(Long id) {
        if (id == null) {
            return null;
        }
        Task task = new Task();
        task.setId(id);
        return task;
    }
}
